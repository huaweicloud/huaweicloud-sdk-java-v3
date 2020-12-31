package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AppConfigInfo
 */
public class AppConfigInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_type")
    
    private String configType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_name")
    
    private String configName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_value")
    
    private String configValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private OffsetDateTime updateTime = null;

    public AppConfigInfo withId(String id) {
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

    public AppConfigInfo withAppId(String appId) {
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

    public AppConfigInfo withConfigType(String configType) {
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

    public AppConfigInfo withConfigName(String configName) {
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

    public AppConfigInfo withConfigValue(String configValue) {
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

    public AppConfigInfo withUpdateTime(OffsetDateTime updateTime) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppConfigInfo appConfigInfo = (AppConfigInfo) o;
        return Objects.equals(this.id, appConfigInfo.id) &&
            Objects.equals(this.appId, appConfigInfo.appId) &&
            Objects.equals(this.configType, appConfigInfo.configType) &&
            Objects.equals(this.configName, appConfigInfo.configName) &&
            Objects.equals(this.configValue, appConfigInfo.configValue) &&
            Objects.equals(this.updateTime, appConfigInfo.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, appId, configType, configName, configValue, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppConfigInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
        sb.append("    configValue: ").append(toIndentedString(configValue)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

