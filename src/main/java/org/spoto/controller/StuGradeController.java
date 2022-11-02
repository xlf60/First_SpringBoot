package org.spoto.controller;

import com.alibaba.fastjson.JSONObject;
import org.spoto.dto.PageData;
import org.spoto.dto.TabData;
import org.spoto.model.StuGrade;
import org.spoto.model.Student;
import org.spoto.service.StuGradeService;
import org.spoto.utils.DateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.ParseException;

@RestController
public class StuGradeController {

    @Resource
    private StuGradeService sgs;

    @RequestMapping("stugrade-list")
    public TabData<StuGrade> list(PageData pd){

        return  sgs.list(pd);
    }

    @RequestMapping("stugrade-save")
    public JSONObject save(StuGrade sg) {

        boolean save = sgs.save(sg);

        JSONObject data = new JSONObject();

        data.put("type",save);

        //输出
        return data;
    }

    @RequestMapping("stugrade-del")
    public JSONObject del(String sid, String cname){
        JSONObject data = new JSONObject();

        //参数校验

        //调用业务层处理数据
        boolean del = sgs.del(sid,cname);

        data.put("type",del);

        //输出
        return data;
    }
}
