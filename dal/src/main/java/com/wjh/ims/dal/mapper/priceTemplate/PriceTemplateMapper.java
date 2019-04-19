package com.wjh.ims.dal.mapper.priceTemplate;

import com.wjh.ims.dal.model.priceTemplate.PriceTemplate;
import com.wjh.ims.dal.model.priceTemplate.PriceTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price_template
     *
     * @mbggenerated Mon Mar 25 13:56:23 CST 2019
     */
    int countByExample(PriceTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price_template
     *
     * @mbggenerated Mon Mar 25 13:56:23 CST 2019
     */
    int deleteByExample(PriceTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price_template
     *
     * @mbggenerated Mon Mar 25 13:56:23 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price_template
     *
     * @mbggenerated Mon Mar 25 13:56:23 CST 2019
     */
    int insert(PriceTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price_template
     *
     * @mbggenerated Mon Mar 25 13:56:23 CST 2019
     */
    int insertSelective(PriceTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price_template
     *
     * @mbggenerated Mon Mar 25 13:56:23 CST 2019
     */
    List<PriceTemplate> selectByExample(PriceTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price_template
     *
     * @mbggenerated Mon Mar 25 13:56:23 CST 2019
     */
    PriceTemplate selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price_template
     *
     * @mbggenerated Mon Mar 25 13:56:23 CST 2019
     */
    int updateByExampleSelective(@Param("record") PriceTemplate record, @Param("example") PriceTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price_template
     *
     * @mbggenerated Mon Mar 25 13:56:23 CST 2019
     */
    int updateByExample(@Param("record") PriceTemplate record, @Param("example") PriceTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price_template
     *
     * @mbggenerated Mon Mar 25 13:56:23 CST 2019
     */
    int updateByPrimaryKeySelective(PriceTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price_template
     *
     * @mbggenerated Mon Mar 25 13:56:23 CST 2019
     */
    int updateByPrimaryKey(PriceTemplate record);
}