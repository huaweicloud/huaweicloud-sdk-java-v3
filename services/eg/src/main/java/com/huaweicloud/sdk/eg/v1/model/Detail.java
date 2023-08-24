package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 订阅的自定义事件目标参数列表
 */
public class Detail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_http_parameters")

    private InvocationHttpParameters invocationHttpParameters;

    public Detail withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 自定义目标url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Detail withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Detail withInvocationHttpParameters(InvocationHttpParameters invocationHttpParameters) {
        this.invocationHttpParameters = invocationHttpParameters;
        return this;
    }

    public Detail withInvocationHttpParameters(Consumer<InvocationHttpParameters> invocationHttpParametersSetter) {
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
        Detail that = (Detail) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.invocationHttpParameters, that.invocationHttpParameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, agencyName, invocationHttpParameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Detail {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
