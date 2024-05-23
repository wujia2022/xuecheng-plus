package edu.hunnu.xuecheng.base.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * ClassName: PageParams
 * Package: edu.hunnu.xuecheng.base.model
 * Description: 分页查询通用参数
 *
 * @Author: 吴佳
 * @Create: 2024/5/23 - 14:08
 * @Version: v1.0
 */
@Data
@ToString
public class PageParams {

    //当前页码
    @ApiModelProperty("页码")
    private Long pageNo = 1L;

    //每页记录数默认值
    @ApiModelProperty("页大小")
    private Long pageSize =10L;

    public PageParams(){

    }

    public PageParams(long pageNo,long pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

}
