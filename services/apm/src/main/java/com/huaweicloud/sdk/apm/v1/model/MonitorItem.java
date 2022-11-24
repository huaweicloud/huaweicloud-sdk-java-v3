package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 监控项数据结构。
 */
public class MonitorItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector_id")

    private Integer collectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector_name")

    private String collectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_interval")

    private Integer collectInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_change_user_id")

    private String statusChangeUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_change_user_name")

    private String statusChangeUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_change_time")

    private String statusChangeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_change_user_id")

    private String configChangeUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_change_user_name")

    private String configChangeUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_change_time")

    private String configChangeTime;

    public MonitorItem withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 监控项id。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MonitorItem withEnvId(Long envId) {
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

    public MonitorItem withCollectorId(Integer collectorId) {
        this.collectorId = collectorId;
        return this;
    }

    /**
     * 采集器id。
     * @return collectorId
     */
    public Integer getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(Integer collectorId) {
        this.collectorId = collectorId;
    }

    public MonitorItem withCollectorName(String collectorName) {
        this.collectorName = collectorName;
        return this;
    }

    /**
     * 采集器名称。
     * @return collectorName
     */
    public String getCollectorName() {
        return collectorName;
    }

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    public MonitorItem withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 采集器展示名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public MonitorItem withCollectInterval(Integer collectInterval) {
        this.collectInterval = collectInterval;
        return this;
    }

    /**
     * 采集间隔。
     * @return collectInterval
     */
    public Integer getCollectInterval() {
        return collectInterval;
    }

    public void setCollectInterval(Integer collectInterval) {
        this.collectInterval = collectInterval;
    }

    public MonitorItem withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 是否禁用。
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public MonitorItem withStatusChangeUserId(String statusChangeUserId) {
        this.statusChangeUserId = statusChangeUserId;
        return this;
    }

    /**
     * 修改采集状态用户id。
     * @return statusChangeUserId
     */
    public String getStatusChangeUserId() {
        return statusChangeUserId;
    }

    public void setStatusChangeUserId(String statusChangeUserId) {
        this.statusChangeUserId = statusChangeUserId;
    }

    public MonitorItem withStatusChangeUserName(String statusChangeUserName) {
        this.statusChangeUserName = statusChangeUserName;
        return this;
    }

    /**
     * 修改采集状态用户名称。
     * @return statusChangeUserName
     */
    public String getStatusChangeUserName() {
        return statusChangeUserName;
    }

    public void setStatusChangeUserName(String statusChangeUserName) {
        this.statusChangeUserName = statusChangeUserName;
    }

    public MonitorItem withStatusChangeTime(String statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
        return this;
    }

    /**
     * 修改采集状态时间。
     * @return statusChangeTime
     */
    public String getStatusChangeTime() {
        return statusChangeTime;
    }

    public void setStatusChangeTime(String statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
    }

    public MonitorItem withConfigChangeUserId(String configChangeUserId) {
        this.configChangeUserId = configChangeUserId;
        return this;
    }

    /**
     * 修改采集配置用户id。
     * @return configChangeUserId
     */
    public String getConfigChangeUserId() {
        return configChangeUserId;
    }

    public void setConfigChangeUserId(String configChangeUserId) {
        this.configChangeUserId = configChangeUserId;
    }

    public MonitorItem withConfigChangeUserName(String configChangeUserName) {
        this.configChangeUserName = configChangeUserName;
        return this;
    }

    /**
     * 修改采集配置用户名称。
     * @return configChangeUserName
     */
    public String getConfigChangeUserName() {
        return configChangeUserName;
    }

    public void setConfigChangeUserName(String configChangeUserName) {
        this.configChangeUserName = configChangeUserName;
    }

    public MonitorItem withConfigChangeTime(String configChangeTime) {
        this.configChangeTime = configChangeTime;
        return this;
    }

    /**
     * 修改采集配置时间。
     * @return configChangeTime
     */
    public String getConfigChangeTime() {
        return configChangeTime;
    }

    public void setConfigChangeTime(String configChangeTime) {
        this.configChangeTime = configChangeTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MonitorItem monitorItem = (MonitorItem) o;
        return Objects.equals(this.id, monitorItem.id) && Objects.equals(this.envId, monitorItem.envId)
            && Objects.equals(this.collectorId, monitorItem.collectorId)
            && Objects.equals(this.collectorName, monitorItem.collectorName)
            && Objects.equals(this.displayName, monitorItem.displayName)
            && Objects.equals(this.collectInterval, monitorItem.collectInterval)
            && Objects.equals(this.disabled, monitorItem.disabled)
            && Objects.equals(this.statusChangeUserId, monitorItem.statusChangeUserId)
            && Objects.equals(this.statusChangeUserName, monitorItem.statusChangeUserName)
            && Objects.equals(this.statusChangeTime, monitorItem.statusChangeTime)
            && Objects.equals(this.configChangeUserId, monitorItem.configChangeUserId)
            && Objects.equals(this.configChangeUserName, monitorItem.configChangeUserName)
            && Objects.equals(this.configChangeTime, monitorItem.configChangeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            envId,
            collectorId,
            collectorName,
            displayName,
            collectInterval,
            disabled,
            statusChangeUserId,
            statusChangeUserName,
            statusChangeTime,
            configChangeUserId,
            configChangeUserName,
            configChangeTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonitorItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    collectorId: ").append(toIndentedString(collectorId)).append("\n");
        sb.append("    collectorName: ").append(toIndentedString(collectorName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    collectInterval: ").append(toIndentedString(collectInterval)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    statusChangeUserId: ").append(toIndentedString(statusChangeUserId)).append("\n");
        sb.append("    statusChangeUserName: ").append(toIndentedString(statusChangeUserName)).append("\n");
        sb.append("    statusChangeTime: ").append(toIndentedString(statusChangeTime)).append("\n");
        sb.append("    configChangeUserId: ").append(toIndentedString(configChangeUserId)).append("\n");
        sb.append("    configChangeUserName: ").append(toIndentedString(configChangeUserName)).append("\n");
        sb.append("    configChangeTime: ").append(toIndentedString(configChangeTime)).append("\n");
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
