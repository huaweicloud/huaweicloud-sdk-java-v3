package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PolicyItemDataMaskInfo
 */
public class PolicyItemDataMaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expr")

    private String conditionExpr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_mask_type")

    private String dataMaskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_expr")

    private String valueExpr;

    public PolicyItemDataMaskInfo withConditionExpr(String conditionExpr) {
        this.conditionExpr = conditionExpr;
        return this;
    }

    /**
     * 条件表达式
     * @return conditionExpr
     */
    public String getConditionExpr() {
        return conditionExpr;
    }

    public void setConditionExpr(String conditionExpr) {
        this.conditionExpr = conditionExpr;
    }

    public PolicyItemDataMaskInfo withDataMaskType(String dataMaskType) {
        this.dataMaskType = dataMaskType;
        return this;
    }

    /**
     * 列掩码类型
     * @return dataMaskType
     */
    public String getDataMaskType() {
        return dataMaskType;
    }

    public void setDataMaskType(String dataMaskType) {
        this.dataMaskType = dataMaskType;
    }

    public PolicyItemDataMaskInfo withValueExpr(String valueExpr) {
        this.valueExpr = valueExpr;
        return this;
    }

    /**
     * 列掩码表达式
     * @return valueExpr
     */
    public String getValueExpr() {
        return valueExpr;
    }

    public void setValueExpr(String valueExpr) {
        this.valueExpr = valueExpr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyItemDataMaskInfo that = (PolicyItemDataMaskInfo) obj;
        return Objects.equals(this.conditionExpr, that.conditionExpr)
            && Objects.equals(this.dataMaskType, that.dataMaskType) && Objects.equals(this.valueExpr, that.valueExpr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionExpr, dataMaskType, valueExpr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyItemDataMaskInfo {\n");
        sb.append("    conditionExpr: ").append(toIndentedString(conditionExpr)).append("\n");
        sb.append("    dataMaskType: ").append(toIndentedString(dataMaskType)).append("\n");
        sb.append("    valueExpr: ").append(toIndentedString(valueExpr)).append("\n");
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
