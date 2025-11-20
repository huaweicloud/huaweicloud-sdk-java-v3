package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 租户业务配置
 */
public class TenantServiceConfigsInfo {

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

    public TenantServiceConfigsInfo withServiceSharedConfig(ServiceSharedConfig serviceSharedConfig) {
        this.serviceSharedConfig = serviceSharedConfig;
        return this;
    }

    public TenantServiceConfigsInfo withServiceSharedConfig(Consumer<ServiceSharedConfig> serviceSharedConfigSetter) {
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

    public TenantServiceConfigsInfo withTenantLogConfig(TenantLogConfig tenantLogConfig) {
        this.tenantLogConfig = tenantLogConfig;
        return this;
    }

    public TenantServiceConfigsInfo withTenantLogConfig(Consumer<TenantLogConfig> tenantLogConfigSetter) {
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

    public TenantServiceConfigsInfo withSubAccountControlConfig(SubAccountControlConfig subAccountControlConfig) {
        this.subAccountControlConfig = subAccountControlConfig;
        return this;
    }

    public TenantServiceConfigsInfo withSubAccountControlConfig(
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

    public TenantServiceConfigsInfo withIsAiMarkOn(Boolean isAiMarkOn) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TenantServiceConfigsInfo that = (TenantServiceConfigsInfo) obj;
        return Objects.equals(this.serviceSharedConfig, that.serviceSharedConfig)
            && Objects.equals(this.tenantLogConfig, that.tenantLogConfig)
            && Objects.equals(this.subAccountControlConfig, that.subAccountControlConfig)
            && Objects.equals(this.isAiMarkOn, that.isAiMarkOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceSharedConfig, tenantLogConfig, subAccountControlConfig, isAiMarkOn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantServiceConfigsInfo {\n");
        sb.append("    serviceSharedConfig: ").append(toIndentedString(serviceSharedConfig)).append("\n");
        sb.append("    tenantLogConfig: ").append(toIndentedString(tenantLogConfig)).append("\n");
        sb.append("    subAccountControlConfig: ").append(toIndentedString(subAccountControlConfig)).append("\n");
        sb.append("    isAiMarkOn: ").append(toIndentedString(isAiMarkOn)).append("\n");
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
