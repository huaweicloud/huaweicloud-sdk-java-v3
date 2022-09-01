package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * RequestParameter
 */
public class RequestParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_name")

    @JacksonXmlProperty(localName = "parameter_name")

    private String parameterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_value")

    @JacksonXmlProperty(localName = "parameter_value")

    private String parameterValue;

    public RequestParameter withParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /**
     * 请求参数名
     * @return parameterName
     */
    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public RequestParameter withParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
        return this;
    }

    /**
     * 请求参数值
     * @return parameterValue
     */
    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestParameter requestParameter = (RequestParameter) o;
        return Objects.equals(this.parameterName, requestParameter.parameterName)
            && Objects.equals(this.parameterValue, requestParameter.parameterValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameterName, parameterValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestParameter {\n");
        sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
        sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
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
