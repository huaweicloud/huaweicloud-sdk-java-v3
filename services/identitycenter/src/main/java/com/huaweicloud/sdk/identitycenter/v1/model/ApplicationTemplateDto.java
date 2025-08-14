package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用程序模板
 */
public class ApplicationTemplateDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application")

    private ApplicationTemplateDisplayDto application;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_config")

    private ResponseConfigDto responseConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_schema_config")

    private ResponseSchemaConfigDto responseSchemaConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sso_protocol")

    private String ssoProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_config")

    private SecurityConfigDto securityConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_provider_config")

    private ServiceProviderConfigDto serviceProviderConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_version")

    private String templateVersion;

    public ApplicationTemplateDto withApplication(ApplicationTemplateDisplayDto application) {
        this.application = application;
        return this;
    }

    public ApplicationTemplateDto withApplication(Consumer<ApplicationTemplateDisplayDto> applicationSetter) {
        if (this.application == null) {
            this.application = new ApplicationTemplateDisplayDto();
            applicationSetter.accept(this.application);
        }

        return this;
    }

    /**
     * Get application
     * @return application
     */
    public ApplicationTemplateDisplayDto getApplication() {
        return application;
    }

    public void setApplication(ApplicationTemplateDisplayDto application) {
        this.application = application;
    }

    public ApplicationTemplateDto withResponseConfig(ResponseConfigDto responseConfig) {
        this.responseConfig = responseConfig;
        return this;
    }

    public ApplicationTemplateDto withResponseConfig(Consumer<ResponseConfigDto> responseConfigSetter) {
        if (this.responseConfig == null) {
            this.responseConfig = new ResponseConfigDto();
            responseConfigSetter.accept(this.responseConfig);
        }

        return this;
    }

    /**
     * Get responseConfig
     * @return responseConfig
     */
    public ResponseConfigDto getResponseConfig() {
        return responseConfig;
    }

    public void setResponseConfig(ResponseConfigDto responseConfig) {
        this.responseConfig = responseConfig;
    }

    public ApplicationTemplateDto withResponseSchemaConfig(ResponseSchemaConfigDto responseSchemaConfig) {
        this.responseSchemaConfig = responseSchemaConfig;
        return this;
    }

    public ApplicationTemplateDto withResponseSchemaConfig(
        Consumer<ResponseSchemaConfigDto> responseSchemaConfigSetter) {
        if (this.responseSchemaConfig == null) {
            this.responseSchemaConfig = new ResponseSchemaConfigDto();
            responseSchemaConfigSetter.accept(this.responseSchemaConfig);
        }

        return this;
    }

    /**
     * Get responseSchemaConfig
     * @return responseSchemaConfig
     */
    public ResponseSchemaConfigDto getResponseSchemaConfig() {
        return responseSchemaConfig;
    }

    public void setResponseSchemaConfig(ResponseSchemaConfigDto responseSchemaConfig) {
        this.responseSchemaConfig = responseSchemaConfig;
    }

    public ApplicationTemplateDto withSsoProtocol(String ssoProtocol) {
        this.ssoProtocol = ssoProtocol;
        return this;
    }

    /**
     * 支持的协议
     * @return ssoProtocol
     */
    public String getSsoProtocol() {
        return ssoProtocol;
    }

    public void setSsoProtocol(String ssoProtocol) {
        this.ssoProtocol = ssoProtocol;
    }

    public ApplicationTemplateDto withSecurityConfig(SecurityConfigDto securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    public ApplicationTemplateDto withSecurityConfig(Consumer<SecurityConfigDto> securityConfigSetter) {
        if (this.securityConfig == null) {
            this.securityConfig = new SecurityConfigDto();
            securityConfigSetter.accept(this.securityConfig);
        }

        return this;
    }

    /**
     * Get securityConfig
     * @return securityConfig
     */
    public SecurityConfigDto getSecurityConfig() {
        return securityConfig;
    }

    public void setSecurityConfig(SecurityConfigDto securityConfig) {
        this.securityConfig = securityConfig;
    }

    public ApplicationTemplateDto withServiceProviderConfig(ServiceProviderConfigDto serviceProviderConfig) {
        this.serviceProviderConfig = serviceProviderConfig;
        return this;
    }

    public ApplicationTemplateDto withServiceProviderConfig(
        Consumer<ServiceProviderConfigDto> serviceProviderConfigSetter) {
        if (this.serviceProviderConfig == null) {
            this.serviceProviderConfig = new ServiceProviderConfigDto();
            serviceProviderConfigSetter.accept(this.serviceProviderConfig);
        }

        return this;
    }

    /**
     * Get serviceProviderConfig
     * @return serviceProviderConfig
     */
    public ServiceProviderConfigDto getServiceProviderConfig() {
        return serviceProviderConfig;
    }

    public void setServiceProviderConfig(ServiceProviderConfigDto serviceProviderConfig) {
        this.serviceProviderConfig = serviceProviderConfig;
    }

    public ApplicationTemplateDto withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 应用程序模板唯一标识ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public ApplicationTemplateDto withTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    /**
     * 应用程序模板版本
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return templateVersion;
    }

    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplicationTemplateDto that = (ApplicationTemplateDto) obj;
        return Objects.equals(this.application, that.application)
            && Objects.equals(this.responseConfig, that.responseConfig)
            && Objects.equals(this.responseSchemaConfig, that.responseSchemaConfig)
            && Objects.equals(this.ssoProtocol, that.ssoProtocol)
            && Objects.equals(this.securityConfig, that.securityConfig)
            && Objects.equals(this.serviceProviderConfig, that.serviceProviderConfig)
            && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.templateVersion, that.templateVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(application,
            responseConfig,
            responseSchemaConfig,
            ssoProtocol,
            securityConfig,
            serviceProviderConfig,
            templateId,
            templateVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationTemplateDto {\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    responseConfig: ").append(toIndentedString(responseConfig)).append("\n");
        sb.append("    responseSchemaConfig: ").append(toIndentedString(responseSchemaConfig)).append("\n");
        sb.append("    ssoProtocol: ").append(toIndentedString(ssoProtocol)).append("\n");
        sb.append("    securityConfig: ").append(toIndentedString(securityConfig)).append("\n");
        sb.append("    serviceProviderConfig: ").append(toIndentedString(serviceProviderConfig)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateVersion: ").append(toIndentedString(templateVersion)).append("\n");
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
