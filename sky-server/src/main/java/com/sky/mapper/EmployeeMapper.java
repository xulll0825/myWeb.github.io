package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     * 添加员工
     * @param employee
     * @return
     */
    @Insert("insert into employee (name,username,password,phone,sex,id_number,create_time,update_time,create_user,update_user,status)"+
    "values" + "(#{name},#{username},#{password},#{phone},#{sex},#{idNumber},#{createTime},#{updateTime},#{createUser},#{updateUser},#{status})")
    void addEmployeeMapper(Employee employee);

    /**
     * 根据员工姓名分页查询
     * @param employeePageQueryDTO
     * @return
     */
    @Select("select * from employee where name is not null and name != '' and name like concat('%', #{name}, '%') order by create_time desc")
    Page<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);


    void update(Employee employee);

    /**
     * 根据id获取信息
     * @param id
     * @return
     */
    @Select("select * from employee where id = #{id}")
    Employee getByID(Long id);
}
