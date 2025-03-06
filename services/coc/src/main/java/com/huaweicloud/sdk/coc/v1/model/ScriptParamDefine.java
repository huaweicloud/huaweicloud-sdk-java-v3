package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 顺序参数，没有参数名字段 参数顺序，从1开始，不连续会报错  api层用不同的vo对象接收，管理面没有order字段。service层统一处理差异  拼接：sh xxx.sh  &#39;aaa&#39; &#39;a&#39; &#39;b&#39; 执行时值为空：sh xxx.sh  &#39;&#39; &#39;a&#39; &#39;b&#39;
 */
public class ScriptParamDefine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_value")

    private String paramValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_description")

    private String paramDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_order")

    private Integer paramOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive")

    private Boolean sensitive;

    public ScriptParamDefine withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 参数名仅支持字母、数字以及下划线
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public ScriptParamDefine withParamValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }

    /**
     * 1.参数长度为1-4096位 2.可以包含大写字母、小写字母、数字及特殊字符(_-/.* ?:\",=+@#\\[{]}) 3.禁止出现连续'.'
     * @return paramValue
     */
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public ScriptParamDefine withParamDescription(String paramDescription) {
        this.paramDescription = paramDescription;
        return this;
    }

    /**
     * 参数描述
     * @return paramDescription
     */
    public String getParamDescription() {
        return paramDescription;
    }

    public void setParamDescription(String paramDescription) {
        this.paramDescription = paramDescription;
    }

    public ScriptParamDefine withParamOrder(Integer paramOrder) {
        this.paramOrder = paramOrder;
        return this;
    }

    /**
     * 该参数已废弃，传入该参数不会生效。
     * @return paramOrder
     */
    public Integer getParamOrder() {
        return paramOrder;
    }

    public void setParamOrder(Integer paramOrder) {
        this.paramOrder = paramOrder;
    }

    public ScriptParamDefine withSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }

    /**
     * 是否是敏感参数
     * @return sensitive
     */
    public Boolean getSensitive() {
        return sensitive;
    }

    public void setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptParamDefine that = (ScriptParamDefine) obj;
        return Objects.equals(this.paramName, that.paramName) && Objects.equals(this.paramValue, that.paramValue)
            && Objects.equals(this.paramDescription, that.paramDescription)
            && Objects.equals(this.paramOrder, that.paramOrder) && Objects.equals(this.sensitive, that.sensitive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, paramValue, paramDescription, paramOrder, sensitive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptParamDefine {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    paramValue: ").append(toIndentedString(paramValue)).append("\n");
        sb.append("    paramDescription: ").append(toIndentedString(paramDescription)).append("\n");
        sb.append("    paramOrder: ").append(toIndentedString(paramOrder)).append("\n");
        sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
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
