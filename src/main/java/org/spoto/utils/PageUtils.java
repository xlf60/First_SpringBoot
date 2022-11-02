package org.spoto.utils;

import org.apache.ibatis.session.RowBounds;
import org.spoto.dto.PageData;

/**
 * 分页工具类
 */
public class PageUtils {

    /**
     * 计算最大页
     * @param dataCount 数据总条数
     * @param pageSize  每页显示的条数
     * @return 最大页
     */
    public static Integer getMaxPage(Integer dataCount,Integer pageSize){
        return (dataCount % pageSize == 0) ? (dataCount / pageSize) : (dataCount / pageSize) + 1;
    }

    /**
     * 计算分页数
     * @param pd 页面数据
     * @return 分页数据
     */
    public static RowBounds getRb(PageData pd){
        Integer pageIndex = pd.getPageIndex();
        Integer pageSize = pd.getPageSize();
        int offset = (pageIndex - 1) * pageSize;
        return new RowBounds(offset,pageSize);
    }
}
