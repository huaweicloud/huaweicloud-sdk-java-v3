package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 防护规则动作
 */
public class HttpRuleActionDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url")

    private String redirectUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response")

    private HttpRuleActionResponse response;

    public HttpRuleActionDetail withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * 返回页面重定向的url
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public HttpRuleActionDetail withResponse(HttpRuleActionResponse response) {
        this.response = response;
        return this;
    }

    public HttpRuleActionDetail withResponse(Consumer<HttpRuleActionResponse> responseSetter) {
        if (this.response == null) {
            this.response = new HttpRuleActionResponse();
            responseSetter.accept(this.response);
        }

        return this;
    }

    /**
     * Get response
     * @return response
     */
    public HttpRuleActionResponse getResponse() {
        return response;
    }

    public void setResponse(HttpRuleActionResponse response) {
        this.response = response;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpRuleActionDetail that = (HttpRuleActionDetail) obj;
        return Objects.equals(this.redirectUrl, that.redirectUrl) && Objects.equals(this.response, that.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redirectUrl, response);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpRuleActionDetail {\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    response: ").append(toIndentedString(response)).append("\n");
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
