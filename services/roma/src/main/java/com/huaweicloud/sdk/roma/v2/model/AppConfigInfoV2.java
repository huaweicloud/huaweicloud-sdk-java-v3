package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * AppConfigInfoV2
 */
public class AppConfigInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_type")

    @JacksonXmlProperty(localName = "config_type")

    private String configType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_name")

    @JacksonXmlProperty(localName = "config_name")

    private String configName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value")

    @JacksonXmlProperty(localName = "config_value")

    private String configValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    public AppConfigInfoV2 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用配置编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppConfigInfoV2 withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public AppConfigInfoV2 withConfigType(String configType) {
        this.configType = configType;
        return this;
    }

    /**
     * 应用配置类型
     * @return configType
     */
    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public AppConfigInfoV2 withConfigName(String configName) {
        this.configName = configName;
        return this;
    }

    /**
     * 应用配置名称
     * @return configName
     */
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public AppConfigInfoV2 withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    /**
     * 应用配置值
     * @return configValue
     */
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public AppConfigInfoV2 withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 应用配置更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public AppConfigInfoV2 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用配置描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppConfigInfoV2 appConfigInfoV2 = (AppConfigInfoV2) o;
        return Objects.equals(this.id, appConfigInfoV2.id) && Objects.equals(this.appId, appConfigInfoV2.appId)
            && Objects.equals(this.configType, appConfigInfoV2.configType)
            && Objects.equals(this.configName, appConfigInfoV2.configName)
            && Objects.equals(this.configValue, appConfigInfoV2.configValue)
            && Objects.equals(this.updateTime, appConfigInfoV2.updateTime)
            && Objects.equals(this.description, appConfigInfoV2.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appId, configType, configName, configValue, updateTime, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppConfigInfoV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
