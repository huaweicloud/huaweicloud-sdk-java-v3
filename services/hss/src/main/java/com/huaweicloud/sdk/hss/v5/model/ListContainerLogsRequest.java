package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListContainerLogsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_name")

    private String podName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_id")

    private String podId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_ip")

    private String podIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    public ListContainerLogsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 主机所属的企业项目ID。 开通企业项目功能后才需要配置企业项目。 企业项目ID默认取值为“0”，表示默认企业项目。如果需要查询所有企业项目下的主机，请传参“all_granted_eps”。如果您只有某个企业项目的权限，则需要传递该企业项目ID，查询该企业项目下的主机，否则会因权限不足而报错。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListContainerLogsRequest withClusterId(String clusterId) {
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

    public ListContainerLogsRequest withClusterName(String clusterName) {
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

    public ListContainerLogsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 产生日志的容器所属的命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListContainerLogsRequest withPodName(String podName) {
        this.podName = podName;
        return this;
    }

    /**
     * 产生日志的容器所属pod的名称
     * @return podName
     */
    public String getPodName() {
        return podName;
    }

    public void setPodName(String podName) {
        this.podName = podName;
    }

    public ListContainerLogsRequest withPodId(String podId) {
        this.podId = podId;
        return this;
    }

    /**
     * 产生日志的容器所属pod的id
     * @return podId
     */
    public String getPodId() {
        return podId;
    }

    public void setPodId(String podId) {
        this.podId = podId;
    }

    public ListContainerLogsRequest withPodIp(String podIp) {
        this.podIp = podIp;
        return this;
    }

    /**
     * 产生日志的容器所属pod的ip
     * @return podIp
     */
    public String getPodIp() {
        return podIp;
    }

    public void setPodIp(String podIp) {
        this.podIp = podIp;
    }

    public ListContainerLogsRequest withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 产生日志的容器所在主机的ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ListContainerLogsRequest withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * 容器id
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ListContainerLogsRequest withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * 产生日志的容器名称
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public ListContainerLogsRequest withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 日志内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ListContainerLogsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询日志范围的最小时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListContainerLogsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询日志范围的最大时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListContainerLogsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数，默认为10
     * minimum: 0
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListContainerLogsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量：指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，默认0
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListContainerLogsRequest withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 查询cce集群容器日志时需要传的分页行号
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
        ListContainerLogsRequest that = (ListContainerLogsRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.podName, that.podName)
            && Objects.equals(this.podId, that.podId) && Objects.equals(this.podIp, that.podIp)
            && Objects.equals(this.hostIp, that.hostIp) && Objects.equals(this.containerId, that.containerId)
            && Objects.equals(this.containerName, that.containerName) && Objects.equals(this.content, that.content)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.lineNum, that.lineNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            clusterId,
            clusterName,
            namespace,
            podName,
            podId,
            podIp,
            hostIp,
            containerId,
            containerName,
            content,
            startTime,
            endTime,
            limit,
            offset,
            lineNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListContainerLogsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
        sb.append("    podId: ").append(toIndentedString(podId)).append("\n");
        sb.append("    podIp: ").append(toIndentedString(podIp)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
