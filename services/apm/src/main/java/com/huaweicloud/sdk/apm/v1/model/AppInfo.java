package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 应用信息。
 */
public class AppInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private Long appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_count")

    private Integer onlineCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_count")

    private Integer disableCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline_count")

    private Integer offlineCount;

    public AppInfo withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * 环境名称。
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public AppInfo withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境id。
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public AppInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 组件名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AppInfo withAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 组件id。
     * @return appId
     */
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public AppInfo withOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
        return this;
    }

    /**
     * 在线探针数。
     * @return onlineCount
     */
    public Integer getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
    }

    public AppInfo withDisableCount(Integer disableCount) {
        this.disableCount = disableCount;
        return this;
    }

    /**
     * 手动停止探针数。
     * @return disableCount
     */
    public Integer getDisableCount() {
        return disableCount;
    }

    public void setDisableCount(Integer disableCount) {
        this.disableCount = disableCount;
    }

    public AppInfo withOfflineCount(Integer offlineCount) {
        this.offlineCount = offlineCount;
        return this;
    }

    /**
     * 离线探针数。
     * @return offlineCount
     */
    public Integer getOfflineCount() {
        return offlineCount;
    }

    public void setOfflineCount(Integer offlineCount) {
        this.offlineCount = offlineCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppInfo appInfo = (AppInfo) o;
        return Objects.equals(this.envName, appInfo.envName) && Objects.equals(this.envId, appInfo.envId)
            && Objects.equals(this.appName, appInfo.appName) && Objects.equals(this.appId, appInfo.appId)
            && Objects.equals(this.onlineCount, appInfo.onlineCount)
            && Objects.equals(this.disableCount, appInfo.disableCount)
            && Objects.equals(this.offlineCount, appInfo.offlineCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envName, envId, appName, appId, onlineCount, disableCount, offlineCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppInfo {\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    onlineCount: ").append(toIndentedString(onlineCount)).append("\n");
        sb.append("    disableCount: ").append(toIndentedString(disableCount)).append("\n");
        sb.append("    offlineCount: ").append(toIndentedString(offlineCount)).append("\n");
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
