package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DubboMethodParam
 */
public class DubboMethodParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paramKey")

    private String paramKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paramSource")

    private String paramSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paramType")

    private String paramType;

    public DubboMethodParam withParamKey(String paramKey) {
        this.paramKey = paramKey;
        return this;
    }

    /**
     * 参数键。
     * @return paramKey
     */
    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public DubboMethodParam withParamSource(String paramSource) {
        this.paramSource = paramSource;
        return this;
    }

    /**
     * 参数来源。
     * @return paramSource
     */
    public String getParamSource() {
        return paramSource;
    }

    public void setParamSource(String paramSource) {
        this.paramSource = paramSource;
    }

    public DubboMethodParam withParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }

    /**
     * 参数类型。
     * @return paramType
     */
    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DubboMethodParam that = (DubboMethodParam) obj;
        return Objects.equals(this.paramKey, that.paramKey) && Objects.equals(this.paramSource, that.paramSource)
            && Objects.equals(this.paramType, that.paramType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramKey, paramSource, paramType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DubboMethodParam {\n");
        sb.append("    paramKey: ").append(toIndentedString(paramKey)).append("\n");
        sb.append("    paramSource: ").append(toIndentedString(paramSource)).append("\n");
        sb.append("    paramType: ").append(toIndentedString(paramType)).append("\n");
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
