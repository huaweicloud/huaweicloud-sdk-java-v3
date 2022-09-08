package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 需要创建触发器的信息
 */
public class CreateTriggerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    private String appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application")

    private String application;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_ns")

    private String clusterNs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container")

    private String container;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_mode")

    private String triggerMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    public CreateTriggerRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 触发动作，update
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CreateTriggerRequestBody withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    /**
     * 应用类型，deployments、statefulsets
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public CreateTriggerRequestBody withApplication(String application) {
        this.application = application;
        return this;
    }

    /**
     * 应用名
     * @return application
     */
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public CreateTriggerRequestBody withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID（trigger_mode设置为cci时为空)
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateTriggerRequestBody withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名（trigger_mode设置为cci时为空）
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateTriggerRequestBody withClusterNs(String clusterNs) {
        this.clusterNs = clusterNs;
        return this;
    }

    /**
     * 应用名所在的namespace
     * @return clusterNs
     */
    public String getClusterNs() {
        return clusterNs;
    }

    public void setClusterNs(String clusterNs) {
        this.clusterNs = clusterNs;
    }

    public CreateTriggerRequestBody withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 触发条件，type为all时为.*,type为tag时为tag名,type为regular时为正则表达式
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public CreateTriggerRequestBody withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * 需更新的container名，默认为所有container
     * @return container
     */
    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public CreateTriggerRequestBody withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否生效
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public CreateTriggerRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 触发器名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateTriggerRequestBody withTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }

    /**
     * 触发器类型，cce、cci，默认为cce
     * @return triggerMode
     */
    public String getTriggerMode() {
        return triggerMode;
    }

    public void setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
    }

    public CreateTriggerRequestBody withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发条件，all、tag、regular
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTriggerRequestBody createTriggerRequestBody = (CreateTriggerRequestBody) o;
        return Objects.equals(this.action, createTriggerRequestBody.action)
            && Objects.equals(this.appType, createTriggerRequestBody.appType)
            && Objects.equals(this.application, createTriggerRequestBody.application)
            && Objects.equals(this.clusterId, createTriggerRequestBody.clusterId)
            && Objects.equals(this.clusterName, createTriggerRequestBody.clusterName)
            && Objects.equals(this.clusterNs, createTriggerRequestBody.clusterNs)
            && Objects.equals(this.condition, createTriggerRequestBody.condition)
            && Objects.equals(this.container, createTriggerRequestBody.container)
            && Objects.equals(this.enable, createTriggerRequestBody.enable)
            && Objects.equals(this.name, createTriggerRequestBody.name)
            && Objects.equals(this.triggerMode, createTriggerRequestBody.triggerMode)
            && Objects.equals(this.triggerType, createTriggerRequestBody.triggerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            appType,
            application,
            clusterId,
            clusterName,
            clusterNs,
            condition,
            container,
            enable,
            name,
            triggerMode,
            triggerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTriggerRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterNs: ").append(toIndentedString(clusterNs)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    triggerMode: ").append(toIndentedString(triggerMode)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
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
