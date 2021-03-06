package com.wjh.ims.dal.mapper.role;

import com.wjh.ims.dal.model.role.RoleMenu;
import com.wjh.ims.dal.model.role.RoleMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Thu Sep 20 09:45:36 CST 2018
     */
    int countByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Thu Sep 20 09:45:36 CST 2018
     */
    int deleteByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Thu Sep 20 09:45:36 CST 2018
     */
    int insert(RoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Thu Sep 20 09:45:36 CST 2018
     */
    int insertSelective(RoleMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Thu Sep 20 09:45:36 CST 2018
     */
    List<RoleMenu> selectByExample(RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Thu Sep 20 09:45:36 CST 2018
     */
    int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_menu
     *
     * @mbggenerated Thu Sep 20 09:45:36 CST 2018
     */
    int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);
}