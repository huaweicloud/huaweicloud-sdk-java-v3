package com.huaweicloud.sdk.cce.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订购套餐包的套餐包请求详情。
 */
public class PackageProductRequestDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_num")

    private Integer subscriptionNum;

    public PackageProductRequestDetail withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * **参数解释：** 套餐包规格，通过套餐包列表接口获取。 **约束限制：** 不涉及 **取值范围：** 只支持通过套餐包列表接口获取的套餐包规格。 **默认取值：** 不涉及 
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public PackageProductRequestDetail withSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }

    /**
     * **参数解释：** 套餐包订购数量。 **约束限制：** 不涉及 **取值范围：** [1-10] **默认取值：** 0 
     * minimum: 1
     * maximum: 10
     * @return subscriptionNum
     */
    public Integer getSubscriptionNum() {
        return subscriptionNum;
    }

    public void setSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PackageProductRequestDetail that = (PackageProductRequestDetail) obj;
        return Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.subscriptionNum, that.subscriptionNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecCode, subscriptionNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageProductRequestDetail {\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    subscriptionNum: ").append(toIndentedString(subscriptionNum)).append("\n");
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
