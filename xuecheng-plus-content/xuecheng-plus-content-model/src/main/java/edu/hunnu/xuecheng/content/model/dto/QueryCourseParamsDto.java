package edu.hunnu.xuecheng.content.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * ClassName: QueryCourseParamsDto
 * Package: edu.hunnu.xuecheng.content.model.dto
 * Description: 课程查询参数Dto
 *
 * @Author: 吴佳
 * @Create: 2024/5/23 - 14:10
 * @Version: v1.0
 */
@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    @ApiModelProperty("审核状态")
    private String auditStatus;
    //课程名称
    @ApiModelProperty("课程名称")
    private String courseName;
    //发布状态
    @ApiModelProperty("发布状态")
    private String publishStatus;
}
