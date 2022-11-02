package org.spoto.service;

import org.spoto.dto.PageData;
import org.spoto.dto.TabData;
import org.spoto.model.StuGrade;

public interface StuGradeService {

    TabData<StuGrade> list(PageData pd);

    boolean save(StuGrade sg);

    boolean del(String sid,String cname);

}
