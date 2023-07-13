package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DimensionGroup
 */
public class DimensionGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public DimensionGroup withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 分组条件。 产品类型：CLOUD_SERVICE_TYPE企业项目：ENTERPRISE_PROJECT_ID使用量类型：USAGE_TYPE产品：RESOURCE_TYPE可用区：AZ_CODE账单类型：BILL_TYPE关联账号：ASSOCIATED_ACCOUNT规格编码：RES_SPEC_CODE运营实体：BE_ID区域：REGION_CODE计费模式：CHARGING_MODE交易账号：PAYER_ACCOUNT_ID资源tag：RESOURCE_TAG资源id：RESOURCE_ID成本单元：COST_UNIT
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DimensionGroup withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 维度值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DimensionGroup that = (DimensionGroup) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionGroup {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
