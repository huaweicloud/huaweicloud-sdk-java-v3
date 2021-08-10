package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/** Response Object */
public class ShowDetailsOfAppConfigV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_type")

    private String configType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_name")

    private String configName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_value")

    private String configValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ShowDetailsOfAppConfigV2Response withId(String id) {
        this.id = id;
        return this;
    }

    /** 应用配置编号
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDetailsOfAppConfigV2Response withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 应用编号
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowDetailsOfAppConfigV2Response withConfigType(String configType) {
        this.configType = configType;
        return this;
    }

    /** 应用配置类型
     * 
     * @return configType */
    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public ShowDetailsOfAppConfigV2Response withConfigName(String configName) {
        this.configName = configName;
        return this;
    }

    /** 应用配置名称
     * 
     * @return configName */
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public ShowDetailsOfAppConfigV2Response withConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }

    /** 应用配置值
     * 
     * @return configValue */
    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public ShowDetailsOfAppConfigV2Response withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 应用配置更新时间
     * 
     * @return updateTime */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ShowDetailsOfAppConfigV2Response withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 应用配置描述
     * 
     * @return description */
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
        ShowDetailsOfAppConfigV2Response showDetailsOfAppConfigV2Response = (ShowDetailsOfAppConfigV2Response) o;
        return Objects.equals(this.id, showDetailsOfAppConfigV2Response.id)
            && Objects.equals(this.appId, showDetailsOfAppConfigV2Response.appId)
            && Objects.equals(this.configType, showDetailsOfAppConfigV2Response.configType)
            && Objects.equals(this.configName, showDetailsOfAppConfigV2Response.configName)
            && Objects.equals(this.configValue, showDetailsOfAppConfigV2Response.configValue)
            && Objects.equals(this.updateTime, showDetailsOfAppConfigV2Response.updateTime)
            && Objects.equals(this.description, showDetailsOfAppConfigV2Response.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appId, configType, configName, configValue, updateTime, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfAppConfigV2Response {\n");
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
