package edu.hunnu.xuecheng.content.api;

import edu.hunnu.xuecheng.base.model.PageParams;
import edu.hunnu.xuecheng.base.model.PageResult;
import edu.hunnu.xuecheng.content.model.dto.QueryCourseParamsDto;
import edu.hunnu.xuecheng.content.model.po.CourseBase;
import edu.hunnu.xuecheng.content.service.CourseBaseInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: CourseBaseInfoController
 * Package: edu.hunnu.xuecheng.content.api
 * Description: 课程信息编辑接口
 *
 * @Author: 吴佳
 * @Create: 2024/5/23 - 14:22
 * @Version: v1.0
 */
@RestController
@Api(tags = "内容管理相关接口")
public class CourseBaseInfoController {
    @Autowired
    CourseBaseInfoService courseBaseInfoService;
    @PostMapping("/course/list")
    @ApiOperation("课程查询")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){
        return courseBaseInfoService.queryCourseBaseList(pageParams,queryCourseParamsDto);
    }
}
