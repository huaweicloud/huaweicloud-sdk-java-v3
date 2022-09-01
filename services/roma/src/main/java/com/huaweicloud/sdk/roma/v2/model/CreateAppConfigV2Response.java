package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAppConfigV2Response extends SdkResponse {

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

    public CreateAppConfigV2Response withId(String id) {
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

    public CreateAppConfigV2Response withAppId(String appId) {
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

    public CreateAppConfigV2Response withConfigType(String configType) {
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

    public CreateAppConfigV2Response withConfigName(String configName) {
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

    public CreateAppConfigV2Response withConfigValue(String configValue) {
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

    public CreateAppConfigV2Response withUpdateTime(OffsetDateTime updateTime) {
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

    public CreateAppConfigV2Response withDescription(String description) {
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
        CreateAppConfigV2Response createAppConfigV2Response = (CreateAppConfigV2Response) o;
        return Objects.equals(this.id, createAppConfigV2Response.id)
            && Objects.equals(this.appId, createAppConfigV2Response.appId)
            && Objects.equals(this.configType, createAppConfigV2Response.configType)
            && Objects.equals(this.configName, createAppConfigV2Response.configName)
            && Objects.equals(this.configValue, createAppConfigV2Response.configValue)
            && Objects.equals(this.updateTime, createAppConfigV2Response.updateTime)
            && Objects.equals(this.description, createAppConfigV2Response.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appId, configType, configName, configValue, updateTime, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppConfigV2Response {\n");
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
