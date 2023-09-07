package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 全链路压测探针Mock规则配置
 */
public class MockRuleConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_url")

    private String requestUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_method")

    private String requestMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url")

    private String redirectUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mock_strategy")

    private String mockStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_header")

    private Map<String, String> responseHeader = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_body")

    private String responseBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_time")

    private Integer responseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_code")

    private Integer responseCode;

    public MockRuleConfig withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型（当前只支持http）
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public MockRuleConfig withRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
        return this;
    }

    /**
     * 请求地址
     * @return requestUrl
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public MockRuleConfig withRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * 请求方式（GET/POST/PUT/DELET/PATCH）
     * @return requestMethod
     */
    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public MockRuleConfig withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * 重定向地址
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public MockRuleConfig withMockStrategy(String mockStrategy) {
        this.mockStrategy = mockStrategy;
        return this;
    }

    /**
     * mock策略（redirect/json）
     * @return mockStrategy
     */
    public String getMockStrategy() {
        return mockStrategy;
    }

    public void setMockStrategy(String mockStrategy) {
        this.mockStrategy = mockStrategy;
    }

    public MockRuleConfig withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public MockRuleConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MockRuleConfig withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public MockRuleConfig withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 规则id
     * minimum: 0
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MockRuleConfig withResponseHeader(Map<String, String> responseHeader) {
        this.responseHeader = responseHeader;
        return this;
    }

    public MockRuleConfig putResponseHeaderItem(String key, String responseHeaderItem) {
        if (this.responseHeader == null) {
            this.responseHeader = new HashMap<>();
        }
        this.responseHeader.put(key, responseHeaderItem);
        return this;
    }

    public MockRuleConfig withResponseHeader(Consumer<Map<String, String>> responseHeaderSetter) {
        if (this.responseHeader == null) {
            this.responseHeader = new HashMap<>();
        }
        responseHeaderSetter.accept(this.responseHeader);
        return this;
    }

    /**
     * 自定义响应头
     * @return responseHeader
     */
    public Map<String, String> getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(Map<String, String> responseHeader) {
        this.responseHeader = responseHeader;
    }

    public MockRuleConfig withResponseBody(String responseBody) {
        this.responseBody = responseBody;
        return this;
    }

    /**
     * 自定义响应体
     * @return responseBody
     */
    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public MockRuleConfig withResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    /**
     * 自定义响应时长
     * @return responseTime
     */
    public Integer getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    public MockRuleConfig withResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * 自定义响应码
     * @return responseCode
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MockRuleConfig that = (MockRuleConfig) obj;
        return Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.requestUrl, that.requestUrl)
            && Objects.equals(this.requestMethod, that.requestMethod)
            && Objects.equals(this.redirectUrl, that.redirectUrl)
            && Objects.equals(this.mockStrategy, that.mockStrategy) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.name, that.name) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.id, that.id) && Objects.equals(this.responseHeader, that.responseHeader)
            && Objects.equals(this.responseBody, that.responseBody)
            && Objects.equals(this.responseTime, that.responseTime)
            && Objects.equals(this.responseCode, that.responseCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceType,
            requestUrl,
            requestMethod,
            redirectUrl,
            mockStrategy,
            enable,
            name,
            projectId,
            id,
            responseHeader,
            responseBody,
            responseTime,
            responseCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MockRuleConfig {\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
        sb.append("    requestMethod: ").append(toIndentedString(requestMethod)).append("\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    mockStrategy: ").append(toIndentedString(mockStrategy)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
        sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
        sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
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
