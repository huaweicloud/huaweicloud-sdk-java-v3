package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 接口请求
 */
public class InterfacesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Map<String, String> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private Map<String, String> headers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private Map<String, Object> configs = null;

    public InterfacesRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 方法
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public InterfacesRequest withParams(Map<String, String> params) {
        this.params = params;
        return this;
    }

    public InterfacesRequest putParamsItem(String key, String paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    public InterfacesRequest withParams(Consumer<Map<String, String>> paramsSetter) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 请求参数
     * @return params
     */
    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public InterfacesRequest withHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    public InterfacesRequest putHeadersItem(String key, String headersItem) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, headersItem);
        return this;
    }

    public InterfacesRequest withHeaders(Consumer<Map<String, String>> headersSetter) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        headersSetter.accept(this.headers);
        return this;
    }

    /**
     * 请求头信息
     * @return headers
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public InterfacesRequest withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 请求体
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public InterfacesRequest withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * URL
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public InterfacesRequest withConfigs(Map<String, Object> configs) {
        this.configs = configs;
        return this;
    }

    public InterfacesRequest putConfigsItem(String key, Object configsItem) {
        if (this.configs == null) {
            this.configs = new HashMap<>();
        }
        this.configs.put(key, configsItem);
        return this;
    }

    public InterfacesRequest withConfigs(Consumer<Map<String, Object>> configsSetter) {
        if (this.configs == null) {
            this.configs = new HashMap<>();
        }
        configsSetter.accept(this.configs);
        return this;
    }

    /**
     * 配置
     * @return configs
     */
    public Map<String, Object> getConfigs() {
        return configs;
    }

    public void setConfigs(Map<String, Object> configs) {
        this.configs = configs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterfacesRequest that = (InterfacesRequest) obj;
        return Objects.equals(this.method, that.method) && Objects.equals(this.params, that.params)
            && Objects.equals(this.headers, that.headers) && Objects.equals(this.body, that.body)
            && Objects.equals(this.url, that.url) && Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, params, headers, body, url, configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterfacesRequest {\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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
