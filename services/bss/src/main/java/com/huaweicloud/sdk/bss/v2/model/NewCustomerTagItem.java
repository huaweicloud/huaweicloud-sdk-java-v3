package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NewCustomerTagItem
 */
public class NewCustomerTagItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_tag_type")

    private String customerTagType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_customer_tag")

    private String newCustomerTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    public NewCustomerTagItem withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户ID。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public NewCustomerTagItem withCustomerTagType(String customerTagType) {
        this.customerTagType = customerTagType;
        return this;
    }

    /**
     * 新客标签类型。 SMB：SMB新客标签。
     * @return customerTagType
     */
    public String getCustomerTagType() {
        return customerTagType;
    }

    public void setCustomerTagType(String customerTagType) {
        this.customerTagType = customerTagType;
    }

    public NewCustomerTagItem withNewCustomerTag(String newCustomerTag) {
        this.newCustomerTag = newCustomerTag;
        return this;
    }

    /**
     * 新客标签。 Y：合格新客N：非新客UNDETERMINED：未达标新客，即有新客资格但尚未成为新客
     * @return newCustomerTag
     */
    public String getNewCustomerTag() {
        return newCustomerTag;
    }

    public void setNewCustomerTag(String newCustomerTag) {
        this.newCustomerTag = newCustomerTag;
    }

    public NewCustomerTagItem withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 生效月份。 格式为YYYY-MM。
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public NewCustomerTagItem withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 失效月份。 格式为YYYY-MM。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NewCustomerTagItem that = (NewCustomerTagItem) obj;
        return Objects.equals(this.customerId, that.customerId)
            && Objects.equals(this.customerTagType, that.customerTagType)
            && Objects.equals(this.newCustomerTag, that.newCustomerTag)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.expireTime, that.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerTagType, newCustomerTag, effectiveTime, expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewCustomerTagItem {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    customerTagType: ").append(toIndentedString(customerTagType)).append("\n");
        sb.append("    newCustomerTag: ").append(toIndentedString(newCustomerTag)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
