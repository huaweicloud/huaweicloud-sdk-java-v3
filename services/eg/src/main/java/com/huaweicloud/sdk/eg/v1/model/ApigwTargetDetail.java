package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApigwTargetDetail
 */
public class ApigwTargetDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_http_parameters")

    private InvocationHttpParameters invocationHttpParameters;

    public ApigwTargetDetail withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 目标url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ApigwTargetDetail withInvocationHttpParameters(InvocationHttpParameters invocationHttpParameters) {
        this.invocationHttpParameters = invocationHttpParameters;
        return this;
    }

    public ApigwTargetDetail withInvocationHttpParameters(
        Consumer<InvocationHttpParameters> invocationHttpParametersSetter) {
        if (this.invocationHttpParameters == null) {
            this.invocationHttpParameters = new InvocationHttpParameters();
            invocationHttpParametersSetter.accept(this.invocationHttpParameters);
        }

        return this;
    }

    /**
     * Get invocationHttpParameters
     * @return invocationHttpParameters
     */
    public InvocationHttpParameters getInvocationHttpParameters() {
        return invocationHttpParameters;
    }

    public void setInvocationHttpParameters(InvocationHttpParameters invocationHttpParameters) {
        this.invocationHttpParameters = invocationHttpParameters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApigwTargetDetail that = (ApigwTargetDetail) obj;
        return Objects.equals(this.url, that.url)
            && Objects.equals(this.invocationHttpParameters, that.invocationHttpParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, invocationHttpParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApigwTargetDetail {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    invocationHttpParameters: ").append(toIndentedString(invocationHttpParameters)).append("\n");
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
