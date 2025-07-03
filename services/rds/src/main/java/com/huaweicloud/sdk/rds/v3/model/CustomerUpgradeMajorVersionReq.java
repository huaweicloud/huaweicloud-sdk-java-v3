package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomerUpgradeMajorVersionReq
 */
public class CustomerUpgradeMajorVersionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Boolean delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_id")

    private String configurationId;

    public CustomerUpgradeMajorVersionReq withDelay(Boolean delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 是否在运维时间窗内切换版本,默认为否。
     * @return delay
     */
    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    public CustomerUpgradeMajorVersionReq withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * 指定新版本的参数模板，若不填则默认会最大限度继承原实例的参数。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomerUpgradeMajorVersionReq that = (CustomerUpgradeMajorVersionReq) obj;
        return Objects.equals(this.delay, that.delay) && Objects.equals(this.configurationId, that.configurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delay, configurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerUpgradeMajorVersionReq {\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
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
