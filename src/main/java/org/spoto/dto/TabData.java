package org.spoto.dto;

import org.spoto.utils.PageUtils;

import java.util.List;

public class TabData<T> {

    /**
     * 页面索引
     */
    private Integer pageIndex;

    /**
     * 页面数据条数
     */
    private Integer pageSize;

    /**
     * 数据总条数
     */
    private Integer dataCount;

    /**
     * 最大页数
     */
    private Integer maxPage;

    /**
     * 数据列表
     */
    private List<T> dataList;

    public TabData(PageData pd) {
        this.pageIndex = pd.getPageIndex();
        this.pageSize = pd.getPageSize();
    }

    public TabData(Integer pageIndex, Integer pageSize, Integer dataCount, Integer maxPage, List<T> dataList) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.dataCount = dataCount;
        this.maxPage = maxPage;
        this.dataList = dataList;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getDataCount() {
        return dataCount;
    }

    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    public Integer getMaxPage() {
        //计算最大页
        this.maxPage = PageUtils.getMaxPage(this.dataCount,this.pageSize);
//        System.out.println("最大页有" + this.maxPage);
        return maxPage;
    }

    public void setMaxPage(Integer maxPage) {
        this.maxPage = maxPage;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    @Override
    public String toString() {
        return "TabData{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", dataCount=" + dataCount +
                ", maxPage=" + maxPage +
                ", dataList=" + dataList +
                '}';
    }
}
