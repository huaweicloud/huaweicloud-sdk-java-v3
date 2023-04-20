package com.huaweicloud.sdk.iotedge.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 应用实例历史版本
 */
public class QueryAppInstanceHistoryResponseDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_version")
    

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    

    private Object values;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private String updateTime;

    public QueryAppInstanceHistoryResponseDTO withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public QueryAppInstanceHistoryResponseDTO withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    


    /**
     * 应用版本号
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    

    public QueryAppInstanceHistoryResponseDTO withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 应用实例历史版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public QueryAppInstanceHistoryResponseDTO withValues(Object values) {
        this.values = values;
        return this;
    }

    


    /**
     * 应用实例chart配置
     * @return values
     */
    public Object getValues() {
        return values;
    }

    public void setValues(Object values) {
        this.values = values;
    }

    

    public QueryAppInstanceHistoryResponseDTO withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
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
        QueryAppInstanceHistoryResponseDTO queryAppInstanceHistoryResponseDTO = (QueryAppInstanceHistoryResponseDTO) o;
        return Objects.equals(this.appId, queryAppInstanceHistoryResponseDTO.appId) &&
            Objects.equals(this.appVersion, queryAppInstanceHistoryResponseDTO.appVersion) &&
            Objects.equals(this.version, queryAppInstanceHistoryResponseDTO.version) &&
            Objects.equals(this.values, queryAppInstanceHistoryResponseDTO.values) &&
            Objects.equals(this.updateTime, queryAppInstanceHistoryResponseDTO.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, appVersion, version, values, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryAppInstanceHistoryResponseDTO {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

