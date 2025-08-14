package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAgentDaemonsetDetailInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "yaml_content")

    private String yamlContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_info")

    private List<RuntimeRequestBody> runtimeInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_status")

    private String clusterStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ds_info")

    private ClusterInfoResponseDsInfo dsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed_status")

    private String installedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_info")

    private CreateDaemonsetRequestBodyScheduleInfo scheduleInfo;

    public ShowAgentDaemonsetDetailInfoResponse withYamlContent(String yamlContent) {
        this.yamlContent = yamlContent;
        return this;
    }

    /**
     * 原始yaml
     * @return yamlContent
     */
    public String getYamlContent() {
        return yamlContent;
    }

    public void setYamlContent(String yamlContent) {
        this.yamlContent = yamlContent;
    }

    public ShowAgentDaemonsetDetailInfoResponse withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 节点总数
     * minimum: 0
     * maximum: 2147483647
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public ShowAgentDaemonsetDetailInfoResponse withRuntimeInfo(List<RuntimeRequestBody> runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
        return this;
    }

    public ShowAgentDaemonsetDetailInfoResponse addRuntimeInfoItem(RuntimeRequestBody runtimeInfoItem) {
        if (this.runtimeInfo == null) {
            this.runtimeInfo = new ArrayList<>();
        }
        this.runtimeInfo.add(runtimeInfoItem);
        return this;
    }

    public ShowAgentDaemonsetDetailInfoResponse withRuntimeInfo(Consumer<List<RuntimeRequestBody>> runtimeInfoSetter) {
        if (this.runtimeInfo == null) {
            this.runtimeInfo = new ArrayList<>();
        }
        runtimeInfoSetter.accept(this.runtimeInfo);
        return this;
    }

    /**
     * 容器运行时配置
     * @return runtimeInfo
     */
    public List<RuntimeRequestBody> getRuntimeInfo() {
        return runtimeInfo;
    }

    public void setRuntimeInfo(List<RuntimeRequestBody> runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
    }

    public ShowAgentDaemonsetDetailInfoResponse withClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    /**
     * **参数解释**: 集群状态 **约束限制**: 不涉及 **取值范围**: 包含如下： - Available：可用，表示集群处于正常状态。 - Unavailable：不可用，表示集群异常，需手动删除或联系管理员删除。 - ScalingUp：扩容中，表示集群正处于扩容过程中。  - ScalingDown：缩容中，表示集群正处于缩容过程中。 - Creating：创建中，表示集群正处于创建过程中。  - Deleting：删除中，表示集群正处于删除过程中。 - Upgrading：升级中，表示集群正处于升级过程中。  - Resizing：规格变更中，表示集群正处于变更规格中。 - RollingBack：回滚中，表示集群正处于回滚过程中。 - RollbackFailed：回滚异常，表示集群回滚异常，需联系管理员进行回滚重试。  - Empty：集群无任何资源。  **默认取值**: 不涉及 
     * @return clusterStatus
     */
    public String getClusterStatus() {
        return clusterStatus;
    }

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    public ShowAgentDaemonsetDetailInfoResponse withDsInfo(ClusterInfoResponseDsInfo dsInfo) {
        this.dsInfo = dsInfo;
        return this;
    }

    public ShowAgentDaemonsetDetailInfoResponse withDsInfo(Consumer<ClusterInfoResponseDsInfo> dsInfoSetter) {
        if (this.dsInfo == null) {
            this.dsInfo = new ClusterInfoResponseDsInfo();
            dsInfoSetter.accept(this.dsInfo);
        }

        return this;
    }

    /**
     * Get dsInfo
     * @return dsInfo
     */
    public ClusterInfoResponseDsInfo getDsInfo() {
        return dsInfo;
    }

    public void setDsInfo(ClusterInfoResponseDsInfo dsInfo) {
        this.dsInfo = dsInfo;
    }

    public ShowAgentDaemonsetDetailInfoResponse withInstalledStatus(String installedStatus) {
        this.installedStatus = installedStatus;
        return this;
    }

    /**
     * **参数解释**: 集群ds安装状态 **约束限制**: 不涉及 **取值范围**: 包含如下： - installing：安装中。 - install_success：安装成功。 - install_failed：安装失败。 - partically_success：部分安装成功。 - upgrade_success：升级成功。  - upgrade_failed：升级失败。 - upgrading：升级中。 - none：未安装。  **默认取值**: 不涉及 
     * @return installedStatus
     */
    public String getInstalledStatus() {
        return installedStatus;
    }

    public void setInstalledStatus(String installedStatus) {
        this.installedStatus = installedStatus;
    }

    public ShowAgentDaemonsetDetailInfoResponse withScheduleInfo(CreateDaemonsetRequestBodyScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
        return this;
    }

    public ShowAgentDaemonsetDetailInfoResponse withScheduleInfo(
        Consumer<CreateDaemonsetRequestBodyScheduleInfo> scheduleInfoSetter) {
        if (this.scheduleInfo == null) {
            this.scheduleInfo = new CreateDaemonsetRequestBodyScheduleInfo();
            scheduleInfoSetter.accept(this.scheduleInfo);
        }

        return this;
    }

    /**
     * Get scheduleInfo
     * @return scheduleInfo
     */
    public CreateDaemonsetRequestBodyScheduleInfo getScheduleInfo() {
        return scheduleInfo;
    }

    public void setScheduleInfo(CreateDaemonsetRequestBodyScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgentDaemonsetDetailInfoResponse that = (ShowAgentDaemonsetDetailInfoResponse) obj;
        return Objects.equals(this.yamlContent, that.yamlContent) && Objects.equals(this.nodeNum, that.nodeNum)
            && Objects.equals(this.runtimeInfo, that.runtimeInfo)
            && Objects.equals(this.clusterStatus, that.clusterStatus) && Objects.equals(this.dsInfo, that.dsInfo)
            && Objects.equals(this.installedStatus, that.installedStatus)
            && Objects.equals(this.scheduleInfo, that.scheduleInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yamlContent, nodeNum, runtimeInfo, clusterStatus, dsInfo, installedStatus, scheduleInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgentDaemonsetDetailInfoResponse {\n");
        sb.append("    yamlContent: ").append(toIndentedString(yamlContent)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    runtimeInfo: ").append(toIndentedString(runtimeInfo)).append("\n");
        sb.append("    clusterStatus: ").append(toIndentedString(clusterStatus)).append("\n");
        sb.append("    dsInfo: ").append(toIndentedString(dsInfo)).append("\n");
        sb.append("    installedStatus: ").append(toIndentedString(installedStatus)).append("\n");
        sb.append("    scheduleInfo: ").append(toIndentedString(scheduleInfo)).append("\n");
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
