package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomConnector元数据
 */
public class CustomConnectorInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_config")

    private ApiConfig apiConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_content")

    private AuthConfigA authContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_created_type")

    private String connectorCreatedType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_type")

    private String connectorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swagger")

    private Object swagger;

    public CustomConnectorInfoV2 withApiConfig(ApiConfig apiConfig) {
        this.apiConfig = apiConfig;
        return this;
    }

    public CustomConnectorInfoV2 withApiConfig(Consumer<ApiConfig> apiConfigSetter) {
        if (this.apiConfig == null) {
            this.apiConfig = new ApiConfig();
            apiConfigSetter.accept(this.apiConfig);
        }

        return this;
    }

    /**
     * Get apiConfig
     * @return apiConfig
     */
    public ApiConfig getApiConfig() {
        return apiConfig;
    }

    public void setApiConfig(ApiConfig apiConfig) {
        this.apiConfig = apiConfig;
    }

    public CustomConnectorInfoV2 withAuthContent(AuthConfigA authContent) {
        this.authContent = authContent;
        return this;
    }

    public CustomConnectorInfoV2 withAuthContent(Consumer<AuthConfigA> authContentSetter) {
        if (this.authContent == null) {
            this.authContent = new AuthConfigA();
            authContentSetter.accept(this.authContent);
        }

        return this;
    }

    /**
     * Get authContent
     * @return authContent
     */
    public AuthConfigA getAuthContent() {
        return authContent;
    }

    public void setAuthContent(AuthConfigA authContent) {
        this.authContent = authContent;
    }

    public CustomConnectorInfoV2 withConnectorCreatedType(String connectorCreatedType) {
        this.connectorCreatedType = connectorCreatedType;
        return this;
    }

    /**
     * Get connectorCreatedType
     * @return connectorCreatedType
     */
    public String getConnectorCreatedType() {
        return connectorCreatedType;
    }

    public void setConnectorCreatedType(String connectorCreatedType) {
        this.connectorCreatedType = connectorCreatedType;
    }

    public CustomConnectorInfoV2 withConnectorType(String connectorType) {
        this.connectorType = connectorType;
        return this;
    }

    /**
     * Get connectorType
     * @return connectorType
     */
    public String getConnectorType() {
        return connectorType;
    }

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    public CustomConnectorInfoV2 withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * logo base64编码
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public CustomConnectorInfoV2 withSwagger(Object swagger) {
        this.swagger = swagger;
        return this;
    }

    /**
     * swagger文档，大文本
     * @return swagger
     */
    public Object getSwagger() {
        return swagger;
    }

    public void setSwagger(Object swagger) {
        this.swagger = swagger;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomConnectorInfoV2 that = (CustomConnectorInfoV2) obj;
        return Objects.equals(this.apiConfig, that.apiConfig) && Objects.equals(this.authContent, that.authContent)
            && Objects.equals(this.connectorCreatedType, that.connectorCreatedType)
            && Objects.equals(this.connectorType, that.connectorType) && Objects.equals(this.icon, that.icon)
            && Objects.equals(this.swagger, that.swagger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiConfig, authContent, connectorCreatedType, connectorType, icon, swagger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomConnectorInfoV2 {\n");
        sb.append("    apiConfig: ").append(toIndentedString(apiConfig)).append("\n");
        sb.append("    authContent: ").append(toIndentedString(authContent)).append("\n");
        sb.append("    connectorCreatedType: ").append(toIndentedString(connectorCreatedType)).append("\n");
        sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    swagger: ").append(toIndentedString(swagger)).append("\n");
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
