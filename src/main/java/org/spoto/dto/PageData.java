package org.spoto.dto;

import com.alibaba.fastjson.JSONObject;
import org.spoto.utils.StringUtils;

/**
 * 页面数据
 */
public class PageData {

    //默认分页数据条数
    private final static Integer DEFAULT_PAGE_SIZE = 5;

    //分页索引
    private Integer pageIndex;

    //每页数据条数
    private Integer pageSize;

    //搜索数据
    private String sd ;


    public PageData() {
    }


    public PageData(Integer pageIndex, Integer pageSize, String sd) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.sd = sd;
    }

    public Integer getPageIndex() {
        if (this.pageIndex == null || this.pageIndex < 1){
            this.pageIndex = 1;
        }
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        if (this.pageSize == null || this.pageSize < 1){
            this.pageSize = DEFAULT_PAGE_SIZE;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public JSONObject getSd() {
        if (StringUtils.isNotEmoty(this.sd)){
            try {
                return (JSONObject) JSONObject.parse(this.sd);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        //返回一个null的JSON
        return new JSONObject();
    }

    public void setSd(String sd) {
        this.sd = sd;
    }


    @Override
    public String toString() {
        return "PageData{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", sd='" + sd + '\'' +
                '}';
    }
}
