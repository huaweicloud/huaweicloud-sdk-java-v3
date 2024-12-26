package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InvocationHttpParameters
 */
public class InvocationHttpParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header_parameters")

    private List<HeaderParameter> headerParameters = null;

    public InvocationHttpParameters withHeaderParameters(List<HeaderParameter> headerParameters) {
        this.headerParameters = headerParameters;
        return this;
    }

    public InvocationHttpParameters addHeaderParametersItem(HeaderParameter headerParametersItem) {
        if (this.headerParameters == null) {
            this.headerParameters = new ArrayList<>();
        }
        this.headerParameters.add(headerParametersItem);
        return this;
    }

    public InvocationHttpParameters withHeaderParameters(Consumer<List<HeaderParameter>> headerParametersSetter) {
        if (this.headerParameters == null) {
            this.headerParameters = new ArrayList<>();
        }
        headerParametersSetter.accept(this.headerParameters);
        return this;
    }

    /**
     * 对象列表
     * @return headerParameters
     */
    public List<HeaderParameter> getHeaderParameters() {
        return headerParameters;
    }

    public void setHeaderParameters(List<HeaderParameter> headerParameters) {
        this.headerParameters = headerParameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvocationHttpParameters that = (InvocationHttpParameters) obj;
        return Objects.equals(this.headerParameters, that.headerParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headerParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvocationHttpParameters {\n");
        sb.append("    headerParameters: ").append(toIndentedString(headerParameters)).append("\n");
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
