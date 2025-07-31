package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * k8s集群事件日志信息
 */
public class ClusterEventLogResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    public ClusterEventLogResponseInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ClusterEventLogResponseInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ClusterEventLogResponseInfo withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型，包含以下几种： - cce: cce集群 - ali: 阿里云集群 - tencent: 腾讯云集群 - azure: 微软云集群 - aws: 亚马逊集群 - self_built_hw: 华为云自建集群 - self_built_idc: IDC自建集群
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ClusterEventLogResponseInfo withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 日志产生的时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public ClusterEventLogResponseInfo withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 触发事件的命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ClusterEventLogResponseInfo withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 事件名称
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public ClusterEventLogResponseInfo withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public ClusterEventLogResponseInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ClusterEventLogResponseInfo withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ClusterEventLogResponseInfo withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 事件触发的原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ClusterEventLogResponseInfo withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * cce集群事件的行号
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterEventLogResponseInfo that = (ClusterEventLogResponseInfo) obj;
        return Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterType, that.clusterType) && Objects.equals(this.time, that.time)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.eventName, that.eventName)
            && Objects.equals(this.eventType, that.eventType) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.lineNum, that.lineNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterName,
            clusterId,
            clusterType,
            time,
            namespace,
            eventName,
            eventType,
            resourceType,
            resourceName,
            reason,
            lineNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterEventLogResponseInfo {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
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
