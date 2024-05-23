package edu.hunnu.xuecheng.content.service;

import edu.hunnu.xuecheng.base.model.PageParams;
import edu.hunnu.xuecheng.base.model.PageResult;
import edu.hunnu.xuecheng.content.model.dto.QueryCourseParamsDto;
import edu.hunnu.xuecheng.content.model.po.CourseBase;

/**
 * ClassName: CourseBaseInfoService
 * Package: edu.hunnu.xuecheng.service
 * Description: 课程基本信息管理业务接口
 *
 * @Author: 吴佳
 * @Create: 2024/5/23 - 16:38
 * @Version: v1.0
 */
public interface CourseBaseInfoService {
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
