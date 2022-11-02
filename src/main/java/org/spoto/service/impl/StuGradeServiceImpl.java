package org.spoto.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.spoto.dao.StuGradeMapper;
import org.spoto.dto.PageData;
import org.spoto.dto.TabData;
import org.spoto.model.StuGrade;
import org.spoto.service.StuGradeService;
import org.spoto.utils.PageUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StuGradeServiceImpl implements StuGradeService {

    @Resource
    private StuGradeMapper sgm;

    @Override
    public TabData<StuGrade> list(PageData pd){
        TabData<StuGrade> td = new TabData<>(pd);

        //获取参数
        JSONObject sd = pd.getSd();
        String  sid = sd.getString("sid");
        String sname = sd.getString("sname");

        //查询统计数据
        Integer count = sgm.slistCount(sid, sname);

        td.setDataCount(count);
        if (count <= 0){
            return td;
        }

        //查询数据列表
        List<StuGrade> list = sgm.slist(sid, sname, PageUtils.getRb(pd));
        td.setDataList(list);

        return td;
    }

    @Override
    public boolean save(StuGrade sg){

        Integer cid = sg.getCid();
        Integer r = 0;
        if(cid.equals(0)){
            //新增
            r =  sgm.add(sg);
        }else {
            //编辑
            r = sgm.change(sg);
        }
        return r > 0;
    }

    @Override
    public boolean del(String sid,String cname){

        Integer del = sgm.del(sid,cname);

        return del > 0;
    }
}
