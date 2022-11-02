package org.spoto.controller;

import com.alibaba.fastjson.JSONObject;
import org.spoto.dto.PageData;
import org.spoto.dto.TabData;
import org.spoto.model.Student;
import org.spoto.service.StudentService;
import org.spoto.utils.DateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;

@RestController
public class StudentController {

    @Resource
    private StudentService ss;

    @RequestMapping("student-list")
    public TabData<Student> list(PageData pd){

        return  ss.list(pd);

    }

    @RequestMapping("student-save")
    public JSONObject save(Student sd) throws ParseException {

        JSONObject data = new JSONObject();

        if (sd.getSid().equals("")){
            data.put("type",false);
            return data;
        }
        sd.setSdate(DateUtils.getSetDate("2022-10-04"));

        boolean save = ss.save(sd);


        data.put("type",save);

        //输出
        return data;
    }

    @RequestMapping("student-del")
    public JSONObject del(String ids){
        JSONObject data = new JSONObject();

        //参数校验
        if(ids == null || ids.equals("")){
            data.put("type",false);
            return data;
        }
        String[] idArr = ids.split(",");
        //调用业务层处理数据
        boolean del = ss.del(idArr);

        data.put("type",del);

        //输出
        return data;
    }
}
