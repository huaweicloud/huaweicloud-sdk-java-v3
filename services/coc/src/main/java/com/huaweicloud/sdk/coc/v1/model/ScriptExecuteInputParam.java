package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ScriptExecuteInputParam
 */
public class ScriptExecuteInputParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_name")

    private String paramName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_value")

    private String paramValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_order")

    private Integer paramOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_refer")

    private ScriptExecuteParamReference paramRefer;

    public ScriptExecuteInputParam withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * 脚本入参的名称,同一个脚本，参数名不能重复
     * @return paramName
     */
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public ScriptExecuteInputParam withParamValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }

    /**
     * 脚本入参的值，默认必填。有引用参数（param_refer不为空）时，允许为空 1.参数长度为1-4096位 2.可以包含大写字母、小写字母、数字及特殊字符(_-/.* ?:\",=+@#\\[{]}) 3.禁止出现连续'.'
     * @return paramValue
     */
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public ScriptExecuteInputParam withParamOrder(Integer paramOrder) {
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

    public ScriptExecuteInputParam withParamRefer(ScriptExecuteParamReference paramRefer) {
        this.paramRefer = paramRefer;
        return this;
    }

    public ScriptExecuteInputParam withParamRefer(Consumer<ScriptExecuteParamReference> paramReferSetter) {
        if (this.paramRefer == null) {
            this.paramRefer = new ScriptExecuteParamReference();
            paramReferSetter.accept(this.paramRefer);
        }

        return this;
    }

    /**
     * Get paramRefer
     * @return paramRefer
     */
    public ScriptExecuteParamReference getParamRefer() {
        return paramRefer;
    }

    public void setParamRefer(ScriptExecuteParamReference paramRefer) {
        this.paramRefer = paramRefer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptExecuteInputParam that = (ScriptExecuteInputParam) obj;
        return Objects.equals(this.paramName, that.paramName) && Objects.equals(this.paramValue, that.paramValue)
            && Objects.equals(this.paramOrder, that.paramOrder) && Objects.equals(this.paramRefer, that.paramRefer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramName, paramValue, paramOrder, paramRefer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptExecuteInputParam {\n");
        sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
        sb.append("    paramValue: ").append(toIndentedString(paramValue)).append("\n");
        sb.append("    paramOrder: ").append(toIndentedString(paramOrder)).append("\n");
        sb.append("    paramRefer: ").append(toIndentedString(paramRefer)).append("\n");
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
