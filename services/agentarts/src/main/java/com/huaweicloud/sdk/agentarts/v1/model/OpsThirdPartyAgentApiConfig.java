package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 三方托管智能体的API访问配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class OpsThirdPartyAgentApiConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private List<OpsThirdPartyAgentKeyValuePair> headers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_params")

    private List<OpsThirdPartyAgentKeyValuePair> queryParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private OpsThirdPartyAgentRequestBodyConfig body;

    public OpsThirdPartyAgentApiConfig withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** 三方智能体的API访问地址。 **约束限制：** 仅支持HTTP/HTTPS协议。 **取值范围：** 由英文字母、数字、特殊字符(:/.-?&=%_)组成的字符串，长度为1~2048个字符。 **默认取值：** 不涉及。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public OpsThirdPartyAgentApiConfig withHeaders(List<OpsThirdPartyAgentKeyValuePair> headers) {
        this.headers = headers;
        return this;
    }

    public OpsThirdPartyAgentApiConfig addHeadersItem(OpsThirdPartyAgentKeyValuePair headersItem) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        this.headers.add(headersItem);
        return this;
    }

    public OpsThirdPartyAgentApiConfig withHeaders(Consumer<List<OpsThirdPartyAgentKeyValuePair>> headersSetter) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        headersSetter.accept(this.headers);
        return this;
    }

    /**
     * **参数解释：** 请求Header参数列表。 **约束限制：** 最多支持10个Header。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return headers
     */
    public List<OpsThirdPartyAgentKeyValuePair> getHeaders() {
        return headers;
    }

    public void setHeaders(List<OpsThirdPartyAgentKeyValuePair> headers) {
        this.headers = headers;
    }

    public OpsThirdPartyAgentApiConfig withQueryParams(List<OpsThirdPartyAgentKeyValuePair> queryParams) {
        this.queryParams = queryParams;
        return this;
    }

    public OpsThirdPartyAgentApiConfig addQueryParamsItem(OpsThirdPartyAgentKeyValuePair queryParamsItem) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList<>();
        }
        this.queryParams.add(queryParamsItem);
        return this;
    }

    public OpsThirdPartyAgentApiConfig withQueryParams(
        Consumer<List<OpsThirdPartyAgentKeyValuePair>> queryParamsSetter) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList<>();
        }
        queryParamsSetter.accept(this.queryParams);
        return this;
    }

    /**
     * **参数解释：** 请求Query参数列表。 **约束限制：** 最多支持10个Query参数。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return queryParams
     */
    public List<OpsThirdPartyAgentKeyValuePair> getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(List<OpsThirdPartyAgentKeyValuePair> queryParams) {
        this.queryParams = queryParams;
    }

    public OpsThirdPartyAgentApiConfig withBody(OpsThirdPartyAgentRequestBodyConfig body) {
        this.body = body;
        return this;
    }

    public OpsThirdPartyAgentApiConfig withBody(Consumer<OpsThirdPartyAgentRequestBodyConfig> bodySetter) {
        if (this.body == null) {
            this.body = new OpsThirdPartyAgentRequestBodyConfig();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public OpsThirdPartyAgentRequestBodyConfig getBody() {
        return body;
    }

    public void setBody(OpsThirdPartyAgentRequestBodyConfig body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsThirdPartyAgentApiConfig that = (OpsThirdPartyAgentApiConfig) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.headers, that.headers)
            && Objects.equals(this.queryParams, that.queryParams) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, headers, queryParams, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsThirdPartyAgentApiConfig {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    queryParams: ").append(toIndentedString(queryParams)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
