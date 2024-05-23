package edu.hunnu.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * ClassName: PageResult
 * Package: edu.hunnu.xuecheng.base.model
 * Description: 分页查询结果模型类
 *
 * @Author: 吴佳
 * @Create: 2024/5/23 - 14:12
 * @Version: v1.0
 */
@Data
@ToString
public class PageResult<T> implements Serializable {

    // 数据列表
    private List<T> items;

    //总记录数
    private long counts;

    //当前页码
    private long page;

    //每页记录数
    private long pageSize;

    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }

}
