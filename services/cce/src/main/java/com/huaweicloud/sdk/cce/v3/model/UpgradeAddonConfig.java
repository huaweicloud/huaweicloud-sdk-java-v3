package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpgradeAddonConfig
 */
public class UpgradeAddonConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonTemplateName")

    private String addonTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private Object values;

    public UpgradeAddonConfig withAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
        return this;
    }

    /**
     * 插件名称
     * @return addonTemplateName
     */
    public String getAddonTemplateName() {
        return addonTemplateName;
    }

    public void setAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
    }

    public UpgradeAddonConfig withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 执行动作，当前升级场景支持操作为\"patch\"
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public UpgradeAddonConfig withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 目标插件版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public UpgradeAddonConfig withValues(Object values) {
        this.values = values;
        return this;
    }

    /**
     * 插件参数列表，Key:Value格式
     * @return values
     */
    public Object getValues() {
        return values;
    }

    public void setValues(Object values) {
        this.values = values;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpgradeAddonConfig upgradeAddonConfig = (UpgradeAddonConfig) o;
        return Objects.equals(this.addonTemplateName, upgradeAddonConfig.addonTemplateName)
            && Objects.equals(this.operation, upgradeAddonConfig.operation)
            && Objects.equals(this.version, upgradeAddonConfig.version)
            && Objects.equals(this.values, upgradeAddonConfig.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addonTemplateName, operation, version, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeAddonConfig {\n");
        sb.append("    addonTemplateName: ").append(toIndentedString(addonTemplateName)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
