package test.dao;

import test.model.UserLogDomain;

public interface UserLogDomainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log
     *
     * @mbggenerated
     */
    int insert(UserLogDomain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log
     *
     * @mbggenerated
     */
    int insertSelective(UserLogDomain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log
     *
     * @mbggenerated
     */
    UserLogDomain selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserLogDomain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserLogDomain record);
}