package test.model;

import java.math.BigDecimal;
import java.util.Date;

public class ProductOrderDomain {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.product_order_id
     *
     * @mbggenerated
     */
    private Integer productOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.product_order_uuid
     *
     * @mbggenerated
     */
    private String productOrderUuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.place_party_uuid
     *
     * @mbggenerated
     */
    private String placePartyUuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.product_uuid
     *
     * @mbggenerated
     */
    private String productUuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.general_order_flag
     *
     * @mbggenerated
     */
    private Integer generalOrderFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.purchase_amount
     *
     * @mbggenerated
     */
    private BigDecimal purchaseAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.order_time
     *
     * @mbggenerated
     */
    private Date orderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.order_amount
     *
     * @mbggenerated
     */
    private BigDecimal orderAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.carry_interest_time
     *
     * @mbggenerated
     */
    private Date carryInterestTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.expiration_time
     *
     * @mbggenerated
     */
    private Date expirationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.order_status
     *
     * @mbggenerated
     */
    private String orderStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.create_user_uuid
     *
     * @mbggenerated
     */
    private String createUserUuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.last_update_user_uuid
     *
     * @mbggenerated
     */
    private String lastUpdateUserUuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.last_update_time
     *
     * @mbggenerated
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_order.del_flag
     *
     * @mbggenerated
     */
    private Integer delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.product_order_id
     *
     * @return the value of product_order.product_order_id
     *
     * @mbggenerated
     */
    public Integer getProductOrderId() {
        return productOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.product_order_id
     *
     * @param productOrderId the value for product_order.product_order_id
     *
     * @mbggenerated
     */
    public void setProductOrderId(Integer productOrderId) {
        this.productOrderId = productOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.product_order_uuid
     *
     * @return the value of product_order.product_order_uuid
     *
     * @mbggenerated
     */
    public String getProductOrderUuid() {
        return productOrderUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.product_order_uuid
     *
     * @param productOrderUuid the value for product_order.product_order_uuid
     *
     * @mbggenerated
     */
    public void setProductOrderUuid(String productOrderUuid) {
        this.productOrderUuid = productOrderUuid == null ? null : productOrderUuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.place_party_uuid
     *
     * @return the value of product_order.place_party_uuid
     *
     * @mbggenerated
     */
    public String getPlacePartyUuid() {
        return placePartyUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.place_party_uuid
     *
     * @param placePartyUuid the value for product_order.place_party_uuid
     *
     * @mbggenerated
     */
    public void setPlacePartyUuid(String placePartyUuid) {
        this.placePartyUuid = placePartyUuid == null ? null : placePartyUuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.product_uuid
     *
     * @return the value of product_order.product_uuid
     *
     * @mbggenerated
     */
    public String getProductUuid() {
        return productUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.product_uuid
     *
     * @param productUuid the value for product_order.product_uuid
     *
     * @mbggenerated
     */
    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid == null ? null : productUuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.general_order_flag
     *
     * @return the value of product_order.general_order_flag
     *
     * @mbggenerated
     */
    public Integer getGeneralOrderFlag() {
        return generalOrderFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.general_order_flag
     *
     * @param generalOrderFlag the value for product_order.general_order_flag
     *
     * @mbggenerated
     */
    public void setGeneralOrderFlag(Integer generalOrderFlag) {
        this.generalOrderFlag = generalOrderFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.purchase_amount
     *
     * @return the value of product_order.purchase_amount
     *
     * @mbggenerated
     */
    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.purchase_amount
     *
     * @param purchaseAmount the value for product_order.purchase_amount
     *
     * @mbggenerated
     */
    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.order_time
     *
     * @return the value of product_order.order_time
     *
     * @mbggenerated
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.order_time
     *
     * @param orderTime the value for product_order.order_time
     *
     * @mbggenerated
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.order_amount
     *
     * @return the value of product_order.order_amount
     *
     * @mbggenerated
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.order_amount
     *
     * @param orderAmount the value for product_order.order_amount
     *
     * @mbggenerated
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.carry_interest_time
     *
     * @return the value of product_order.carry_interest_time
     *
     * @mbggenerated
     */
    public Date getCarryInterestTime() {
        return carryInterestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.carry_interest_time
     *
     * @param carryInterestTime the value for product_order.carry_interest_time
     *
     * @mbggenerated
     */
    public void setCarryInterestTime(Date carryInterestTime) {
        this.carryInterestTime = carryInterestTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.expiration_time
     *
     * @return the value of product_order.expiration_time
     *
     * @mbggenerated
     */
    public Date getExpirationTime() {
        return expirationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.expiration_time
     *
     * @param expirationTime the value for product_order.expiration_time
     *
     * @mbggenerated
     */
    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.order_status
     *
     * @return the value of product_order.order_status
     *
     * @mbggenerated
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.order_status
     *
     * @param orderStatus the value for product_order.order_status
     *
     * @mbggenerated
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.create_user_uuid
     *
     * @return the value of product_order.create_user_uuid
     *
     * @mbggenerated
     */
    public String getCreateUserUuid() {
        return createUserUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.create_user_uuid
     *
     * @param createUserUuid the value for product_order.create_user_uuid
     *
     * @mbggenerated
     */
    public void setCreateUserUuid(String createUserUuid) {
        this.createUserUuid = createUserUuid == null ? null : createUserUuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.create_time
     *
     * @return the value of product_order.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.create_time
     *
     * @param createTime the value for product_order.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.last_update_user_uuid
     *
     * @return the value of product_order.last_update_user_uuid
     *
     * @mbggenerated
     */
    public String getLastUpdateUserUuid() {
        return lastUpdateUserUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.last_update_user_uuid
     *
     * @param lastUpdateUserUuid the value for product_order.last_update_user_uuid
     *
     * @mbggenerated
     */
    public void setLastUpdateUserUuid(String lastUpdateUserUuid) {
        this.lastUpdateUserUuid = lastUpdateUserUuid == null ? null : lastUpdateUserUuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.last_update_time
     *
     * @return the value of product_order.last_update_time
     *
     * @mbggenerated
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.last_update_time
     *
     * @param lastUpdateTime the value for product_order.last_update_time
     *
     * @mbggenerated
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_order.del_flag
     *
     * @return the value of product_order.del_flag
     *
     * @mbggenerated
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_order.del_flag
     *
     * @param delFlag the value for product_order.del_flag
     *
     * @mbggenerated
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}