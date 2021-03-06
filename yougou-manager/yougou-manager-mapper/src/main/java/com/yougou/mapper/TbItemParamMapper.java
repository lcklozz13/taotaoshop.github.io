package com.yougou.mapper;

import com.yougou.pojo.TbItemParam;
import com.yougou.pojo.TbItemParamExample;
import java.util.List;

import com.yougou.pojo.TbItemParamExtend;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    long countByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    int deleteByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    int insert(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    int insertSelective(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    List<TbItemParam> selectByExampleWithBLOBs(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    List<TbItemParam> selectByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    TbItemParam selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    int updateByExample(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    int updateByPrimaryKeyWithBLOBs(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbg.generated Fri Sep 15 11:44:35 GMT+08:00 2017
     */
    int updateByPrimaryKey(TbItemParam record);
}