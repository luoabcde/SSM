package com.dao;

import java.util.List;

import com.entry.Department;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * mybatis映射接口
 * 
 * @author liucong
 *
 *
 */


@Repository
public interface DepartmentMapper {

	// 查询
	public List<Department> queryAll();

	// 添加
	public void addDepart(Department t);

	// 删除
	public void delDepart(int id);

	// 修改前根据id回显数据
	public List<Department> getDepartData(int id);

	// 修改
	public void updateDepart(Department department);
}
