package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** DemensionGroup */
public class DemensionGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public DemensionGroup withKey(String key) {
        this.key = key;
        return this;
    }

    /** |参数名称：分组条件产品类型：CLOUD_SERVICE_TYPE企业项目：ENTERPRISE_PROJECT_ID使用量类型：USAGE_TYPE产品：RESOURCE_TYPE可用区：AZ_CODE账单类型：BILL_TYPE关联账号：ASSOCIATED_ACCOUNT产品规格：RES_SPEC_CODE运营实体：BE_ID区域：REGION_CODE计费模式：CHARGE_MODE支付账号：PAYER_ACCOUNT_ID资源tag:RESOURCE_TAG资源id:RESOURCE_ID|
     * |参数约束及描述：分组条件产品类型：CLOUD_SERVICE_TYPE企业项目：ENTERPRISE_PROJECT_ID使用量类型：USAGE_TYPE产品：RESOURCE_TYPE可用区：AZ_CODE账单类型：BILL_TYPE关联账号：ASSOCIATED_ACCOUNT产品规格：RES_SPEC_CODE运营实体：BE_ID区域：REGION_CODE计费模式：CHARGE_MODE支付账号：PAYER_ACCOUNT_ID资源tag:RESOURCE_TAG资源id:RESOURCE_ID|
     * 
     * @return key */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DemensionGroup withValue(String value) {
        this.value = value;
        return this;
    }

    /** |参数名称：维度值| |参数约束及描述：维度值|
     * 
     * @return value */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DemensionGroup demensionGroup = (DemensionGroup) o;
        return Objects.equals(this.key, demensionGroup.key) && Objects.equals(this.value, demensionGroup.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DemensionGroup {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
