package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * TriggerHistories
 */
public class TriggerHistories {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    @JacksonXmlProperty(localName = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type")

    @JacksonXmlProperty(localName = "app_type")

    private String appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application")

    @JacksonXmlProperty(localName = "application")

    private String application;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    @JacksonXmlProperty(localName = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    @JacksonXmlProperty(localName = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_ns")

    @JacksonXmlProperty(localName = "cluster_ns")

    private String clusterNs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    @JacksonXmlProperty(localName = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container")

    @JacksonXmlProperty(localName = "container")

    private String container;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    @JacksonXmlProperty(localName = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    @JacksonXmlProperty(localName = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    @JacksonXmlProperty(localName = "tag")

    private String tag;

    public TriggerHistories withAction(String action) {
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

    public TriggerHistories withAppType(String appType) {
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

    public TriggerHistories withApplication(String application) {
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

    public TriggerHistories withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID（cci时为空）
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public TriggerHistories withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名（cci时为空）
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public TriggerHistories withClusterNs(String clusterNs) {
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

    public TriggerHistories withCondition(String condition) {
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

    public TriggerHistories withContainer(String container) {
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

    public TriggerHistories withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public TriggerHistories withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public TriggerHistories withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 详情
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public TriggerHistories withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 更新结果，success、failed
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public TriggerHistories withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 触发的版本号
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TriggerHistories triggerHistories = (TriggerHistories) o;
        return Objects.equals(this.action, triggerHistories.action)
            && Objects.equals(this.appType, triggerHistories.appType)
            && Objects.equals(this.application, triggerHistories.application)
            && Objects.equals(this.clusterId, triggerHistories.clusterId)
            && Objects.equals(this.clusterName, triggerHistories.clusterName)
            && Objects.equals(this.clusterNs, triggerHistories.clusterNs)
            && Objects.equals(this.condition, triggerHistories.condition)
            && Objects.equals(this.container, triggerHistories.container)
            && Objects.equals(this.createdAt, triggerHistories.createdAt)
            && Objects.equals(this.creatorName, triggerHistories.creatorName)
            && Objects.equals(this.detail, triggerHistories.detail)
            && Objects.equals(this.result, triggerHistories.result) && Objects.equals(this.tag, triggerHistories.tag);
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
            createdAt,
            creatorName,
            detail,
            result,
            tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerHistories {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterNs: ").append(toIndentedString(clusterNs)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
