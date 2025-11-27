package com.huaweicloud.sdk.rfs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FunctionGraphUrnRequiredPrimitiveTypeHolder
 */
public class FunctionGraphUrnRequiredPrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_graph_urn")

    private String functionGraphUrn;

    public FunctionGraphUrnRequiredPrimitiveTypeHolder withFunctionGraphUrn(String functionGraphUrn) {
        this.functionGraphUrn = functionGraphUrn;
        return this;
    }

    /**
     * FunctionGraph方法的统一资源标识，用于标识唯一的FunctionGraph方法。当前只支持和RFS同region的function_graph_urn，如果给予了关于其他region的，会报错400。  关于该参数的详细解释，请参考官方文档：https://support.huaweicloud.com/api-functiongraph/functiongraph_06_0102.html
     * @return functionGraphUrn
     */
    public String getFunctionGraphUrn() {
        return functionGraphUrn;
    }

    public void setFunctionGraphUrn(String functionGraphUrn) {
        this.functionGraphUrn = functionGraphUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FunctionGraphUrnRequiredPrimitiveTypeHolder that = (FunctionGraphUrnRequiredPrimitiveTypeHolder) obj;
        return Objects.equals(this.functionGraphUrn, that.functionGraphUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionGraphUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionGraphUrnRequiredPrimitiveTypeHolder {\n");
        sb.append("    functionGraphUrn: ").append(toIndentedString(functionGraphUrn)).append("\n");
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
