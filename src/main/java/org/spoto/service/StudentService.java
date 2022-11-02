package org.spoto.service;

import org.spoto.dto.PageData;
import org.spoto.dto.TabData;
import org.spoto.model.Student;

public interface StudentService {

    TabData<Student> list(PageData pd);

    boolean save(Student sd);

    boolean del(String[] idArr);
}
