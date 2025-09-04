package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 授权
 */
public class EndPointResponseAuthorization {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Object parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheme")

    private Object scheme;

    public EndPointResponseAuthorization withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * 参数
     * @return parameters
     */
    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public EndPointResponseAuthorization withScheme(Object scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * 计划
     * @return scheme
     */
    public Object getScheme() {
        return scheme;
    }

    public void setScheme(Object scheme) {
        this.scheme = scheme;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndPointResponseAuthorization that = (EndPointResponseAuthorization) obj;
        return Objects.equals(this.parameters, that.parameters) && Objects.equals(this.scheme, that.scheme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters, scheme);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndPointResponseAuthorization {\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
