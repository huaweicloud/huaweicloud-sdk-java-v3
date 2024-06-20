package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RenewInquiryResultInfo
 */
public class RenewInquiryResultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private String amount;

    public RenewInquiryResultInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * |参数名称：资源ID。| |参数约束及描述：资源ID。请求携带“include_relative_resources”字段，会返回关联资源的主资源ID和续订金额|
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public RenewInquiryResultInfo withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * |参数名称：主资源（包含从资源）续订金额。单位为元| |参数约束及描述：主资源（包含从资源）续订金额。单位为元|
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RenewInquiryResultInfo that = (RenewInquiryResultInfo) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenewInquiryResultInfo {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
