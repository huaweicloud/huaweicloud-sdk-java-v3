package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateParamInfo
 */
public class UpdateParamInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_values")

    private Map<String, String> parameterValues = null;

    public UpdateParamInfo withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型。取值范围： - be - fe
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public UpdateParamInfo withParameterValues(Map<String, String> parameterValues) {
        this.parameterValues = parameterValues;
        return this;
    }

    public UpdateParamInfo putParameterValuesItem(String key, String parameterValuesItem) {
        if (this.parameterValues == null) {
            this.parameterValues = new HashMap<>();
        }
        this.parameterValues.put(key, parameterValuesItem);
        return this;
    }

    public UpdateParamInfo withParameterValues(Consumer<Map<String, String>> parameterValuesSetter) {
        if (this.parameterValues == null) {
            this.parameterValues = new HashMap<>();
        }
        parameterValuesSetter.accept(this.parameterValues);
        return this;
    }

    /**
     * 参数名和参数值映射关系。用户可以基于默认参数模板的参数，自定义的参数值。不传入该参数，则保持原参数信息。
     * @return parameterValues
     */
    public Map<String, String> getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(Map<String, String> parameterValues) {
        this.parameterValues = parameterValues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateParamInfo that = (UpdateParamInfo) obj;
        return Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.parameterValues, that.parameterValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeType, parameterValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateParamInfo {\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
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
