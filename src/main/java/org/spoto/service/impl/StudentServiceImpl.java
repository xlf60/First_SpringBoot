package org.spoto.service.impl;


import com.alibaba.fastjson.JSONObject;
import org.spoto.dao.StudentMapper;
import org.spoto.dto.PageData;
import org.spoto.dto.TabData;
import org.spoto.model.Student;
import org.spoto.service.StudentService;
import org.spoto.utils.PageUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper sm;

    @Override
    public TabData<Student> list(PageData pd){
        TabData<Student> td = new TabData<>(pd);

        //获取参数
        JSONObject sd = pd.getSd();
        String  sid = sd.getString("sid");
        String sname = sd.getString("sname");

        //查询统计数据
        Integer count = sm.listCount(sid, sname);

        td.setDataCount(count);
        if (count <= 0){
            return td;
        }

        //查询数据列表
        List<Student> list = sm.list(sid, sname, PageUtils.getRb(pd));
        td.setDataList(list);

        return td;
    }

    @Override
    public boolean save(Student sd){

        Integer id = sd.getId();
        Integer r = 0;
        if(id.equals(0)){
            //新增
            r =  sm.add(sd);
        }else {
            //编辑
            r = sm.change(sd);
        }
        return r > 0;
    }

    @Override
    public boolean del(String[] idArr){
        List<Integer> ids = new ArrayList<>();
        for (String s : idArr){
            int id = Integer.parseInt(s);
            ids.add(id);
        }
        Integer del = sm.del(ids);
        return del > 0;
    }
}
