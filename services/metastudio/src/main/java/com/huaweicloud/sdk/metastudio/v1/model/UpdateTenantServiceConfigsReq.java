package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 租户业务配置
 */
public class UpdateTenantServiceConfigsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_account_control_config")

    private SubAccountControlConfig subAccountControlConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ai_mark_on")

    private Boolean isAiMarkOn;

    public UpdateTenantServiceConfigsReq withSubAccountControlConfig(SubAccountControlConfig subAccountControlConfig) {
        this.subAccountControlConfig = subAccountControlConfig;
        return this;
    }

    public UpdateTenantServiceConfigsReq withSubAccountControlConfig(
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

    public UpdateTenantServiceConfigsReq withIsAiMarkOn(Boolean isAiMarkOn) {
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
        UpdateTenantServiceConfigsReq that = (UpdateTenantServiceConfigsReq) obj;
        return Objects.equals(this.subAccountControlConfig, that.subAccountControlConfig)
            && Objects.equals(this.isAiMarkOn, that.isAiMarkOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subAccountControlConfig, isAiMarkOn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTenantServiceConfigsReq {\n");
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
