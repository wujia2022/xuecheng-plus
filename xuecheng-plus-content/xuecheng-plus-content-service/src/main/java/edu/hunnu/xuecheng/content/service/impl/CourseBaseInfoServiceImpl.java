package edu.hunnu.xuecheng.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.hunnu.xuecheng.base.model.PageParams;
import edu.hunnu.xuecheng.base.model.PageResult;
import edu.hunnu.xuecheng.content.model.dto.QueryCourseParamsDto;
import edu.hunnu.xuecheng.content.model.po.CourseBase;
import edu.hunnu.xuecheng.content.mapper.CourseBaseMapper;
import edu.hunnu.xuecheng.content.service.CourseBaseInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: CourseBaseInfoServiceImpl
 * Package: edu.hunnu.xuecheng.service.impl
 * Description: 课程信息管理业务接口实现类
 *
 * @Author: 吴佳
 * @Create: 2024/5/23 - 16:40
 * @Version: v1.0
 */
@Service
public class CourseBaseInfoServiceImpl implements CourseBaseInfoService {
    @Autowired
    CourseBaseMapper courseBaseMapper;
    @Override
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto) {
        //分页对象
        Page page = new Page(pageParams.getPageNo(), pageParams.getPageSize());
        //构建查询条件对象
        LambdaQueryWrapper<CourseBase> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        //构建查询条件，根据课程名称查询
        lambdaQueryWrapper.like(StringUtils.isNotEmpty(queryCourseParamsDto.getCourseName()),CourseBase::getName,queryCourseParamsDto.getCourseName());
        //构建查询条件，根据课程审核状态查询
        lambdaQueryWrapper.eq(StringUtils.isNotEmpty(queryCourseParamsDto.getAuditStatus()),CourseBase::getAuditStatus,queryCourseParamsDto.getAuditStatus());
        //构建查询条件，根据课程发布状态查询
        lambdaQueryWrapper.eq(StringUtils.isNotEmpty(queryCourseParamsDto.getPublishStatus()),CourseBase::getStatus,queryCourseParamsDto.getPublishStatus());
        // 查询数据内容获得结果
        Page pageResult = courseBaseMapper.selectPage(page, lambdaQueryWrapper);
        PageResult<CourseBase> courseBasePageResult  = new PageResult<>(pageResult.getRecords(),pageResult.getTotal(), pageParams.getPageNo(), pageParams.getPageSize());
        return courseBasePageResult;
    }
}
