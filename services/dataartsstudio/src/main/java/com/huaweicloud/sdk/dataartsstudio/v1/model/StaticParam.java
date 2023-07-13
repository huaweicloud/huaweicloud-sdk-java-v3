package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 静态参数
 */
public class StaticParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "para_name")

    private String paraName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "para_value")

    private String paraValue;

    public StaticParam withParaName(String paraName) {
        this.paraName = paraName;
        return this;
    }

    /**
     * 静态参数名
     * @return paraName
     */
    public String getParaName() {
        return paraName;
    }

    public void setParaName(String paraName) {
        this.paraName = paraName;
    }

    public StaticParam withParaValue(String paraValue) {
        this.paraValue = paraValue;
        return this;
    }

    /**
     * 静态参数值
     * @return paraValue
     */
    public String getParaValue() {
        return paraValue;
    }

    public void setParaValue(String paraValue) {
        this.paraValue = paraValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StaticParam that = (StaticParam) obj;
        return Objects.equals(this.paraName, that.paraName) && Objects.equals(this.paraValue, that.paraValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paraName, paraValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StaticParam {\n");
        sb.append("    paraName: ").append(toIndentedString(paraName)).append("\n");
        sb.append("    paraValue: ").append(toIndentedString(paraValue)).append("\n");
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
