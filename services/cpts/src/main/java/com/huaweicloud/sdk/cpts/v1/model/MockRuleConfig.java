package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

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
     * mock策略（当前只支持redirect）
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MockRuleConfig mockRuleConfig = (MockRuleConfig) o;
        return Objects.equals(this.serviceType, mockRuleConfig.serviceType)
            && Objects.equals(this.requestUrl, mockRuleConfig.requestUrl)
            && Objects.equals(this.requestMethod, mockRuleConfig.requestMethod)
            && Objects.equals(this.redirectUrl, mockRuleConfig.redirectUrl)
            && Objects.equals(this.mockStrategy, mockRuleConfig.mockStrategy)
            && Objects.equals(this.enable, mockRuleConfig.enable) && Objects.equals(this.name, mockRuleConfig.name)
            && Objects.equals(this.projectId, mockRuleConfig.projectId) && Objects.equals(this.id, mockRuleConfig.id);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(serviceType, requestUrl, requestMethod, redirectUrl, mockStrategy, enable, name, projectId, id);
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
