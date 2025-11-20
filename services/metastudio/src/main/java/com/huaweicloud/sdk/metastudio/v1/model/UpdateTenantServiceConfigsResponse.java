package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateTenantServiceConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_shared_config")

    private ServiceSharedConfig serviceSharedConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_log_config")

    private TenantLogConfig tenantLogConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_account_control_config")

    private SubAccountControlConfig subAccountControlConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ai_mark_on")

    private Boolean isAiMarkOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateTenantServiceConfigsResponse withServiceSharedConfig(ServiceSharedConfig serviceSharedConfig) {
        this.serviceSharedConfig = serviceSharedConfig;
        return this;
    }

    public UpdateTenantServiceConfigsResponse withServiceSharedConfig(
        Consumer<ServiceSharedConfig> serviceSharedConfigSetter) {
        if (this.serviceSharedConfig == null) {
            this.serviceSharedConfig = new ServiceSharedConfig();
            serviceSharedConfigSetter.accept(this.serviceSharedConfig);
        }

        return this;
    }

    /**
     * Get serviceSharedConfig
     * @return serviceSharedConfig
     */
    public ServiceSharedConfig getServiceSharedConfig() {
        return serviceSharedConfig;
    }

    public void setServiceSharedConfig(ServiceSharedConfig serviceSharedConfig) {
        this.serviceSharedConfig = serviceSharedConfig;
    }

    public UpdateTenantServiceConfigsResponse withTenantLogConfig(TenantLogConfig tenantLogConfig) {
        this.tenantLogConfig = tenantLogConfig;
        return this;
    }

    public UpdateTenantServiceConfigsResponse withTenantLogConfig(Consumer<TenantLogConfig> tenantLogConfigSetter) {
        if (this.tenantLogConfig == null) {
            this.tenantLogConfig = new TenantLogConfig();
            tenantLogConfigSetter.accept(this.tenantLogConfig);
        }

        return this;
    }

    /**
     * Get tenantLogConfig
     * @return tenantLogConfig
     */
    public TenantLogConfig getTenantLogConfig() {
        return tenantLogConfig;
    }

    public void setTenantLogConfig(TenantLogConfig tenantLogConfig) {
        this.tenantLogConfig = tenantLogConfig;
    }

    public UpdateTenantServiceConfigsResponse withSubAccountControlConfig(
        SubAccountControlConfig subAccountControlConfig) {
        this.subAccountControlConfig = subAccountControlConfig;
        return this;
    }

    public UpdateTenantServiceConfigsResponse withSubAccountControlConfig(
        Consumer<SubAccountControlConfig> subAccountControlConfigSetter) {
        if (this.subAccountControlConfig == null) {
            this.subAccountControlConfig = new SubAccountControlConfig();
            subAccountControlConfigSetter.accept(this.subAccountControlConfig);
        }

        return this;
    }

    /**
     * Get subAccountControlConfig
     * @return subAccountControlConfig
     */
    public SubAccountControlConfig getSubAccountControlConfig() {
        return subAccountControlConfig;
    }

    public void setSubAccountControlConfig(SubAccountControlConfig subAccountControlConfig) {
        this.subAccountControlConfig = subAccountControlConfig;
    }

    public UpdateTenantServiceConfigsResponse withIsAiMarkOn(Boolean isAiMarkOn) {
        this.isAiMarkOn = isAiMarkOn;
        return this;
    }

    /**
     * AI标识开关
     * @return isAiMarkOn
     */
    public Boolean getIsAiMarkOn() {
        return isAiMarkOn;
    }

    public void setIsAiMarkOn(Boolean isAiMarkOn) {
        this.isAiMarkOn = isAiMarkOn;
    }

    public UpdateTenantServiceConfigsResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户project ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public UpdateTenantServiceConfigsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTenantServiceConfigsResponse that = (UpdateTenantServiceConfigsResponse) obj;
        return Objects.equals(this.serviceSharedConfig, that.serviceSharedConfig)
            && Objects.equals(this.tenantLogConfig, that.tenantLogConfig)
            && Objects.equals(this.subAccountControlConfig, that.subAccountControlConfig)
            && Objects.equals(this.isAiMarkOn, that.isAiMarkOn) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(serviceSharedConfig, tenantLogConfig, subAccountControlConfig, isAiMarkOn, tenantId, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTenantServiceConfigsResponse {\n");
        sb.append("    serviceSharedConfig: ").append(toIndentedString(serviceSharedConfig)).append("\n");
        sb.append("    tenantLogConfig: ").append(toIndentedString(tenantLogConfig)).append("\n");
        sb.append("    subAccountControlConfig: ").append(toIndentedString(subAccountControlConfig)).append("\n");
        sb.append("    isAiMarkOn: ").append(toIndentedString(isAiMarkOn)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
