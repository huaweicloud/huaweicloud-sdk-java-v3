package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作负载信息
 */
public class WorkLoadInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_name")

    private String workloadName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_id")

    private String workloadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_type")

    private String workloadType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_status")

    private String workloadStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed_pod_num")

    private Integer installedPodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_install_num")

    private Integer notInstallNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_failed_num")

    private Integer installFailedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline_num")

    private Integer offlineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pod_num")

    private Integer podNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_pod_num")

    private Integer protectPodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_job_num")

    private Integer runningJobNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private List<String> imageName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<LabelInfo> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_info")

    private List<ServerlessInstanceInfo> instanceInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_schedule_time")

    private Long lastScheduleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private String schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgradable")

    private Boolean upgradable;

    public WorkLoadInfo withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * **参数解释**: 所属企业项目名称 **取值范围**: 字符长度0-65535位 
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public WorkLoadInfo withWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }

    /**
     * **参数解释**: 工作负载名称 **取值范围**: 字符长度0-65535位 
     * @return workloadName
     */
    public String getWorkloadName() {
        return workloadName;
    }

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    public WorkLoadInfo withWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }

    /**
     * **参数解释**: 工作负载Id **取值范围**: 字符长度0-65535位 
     * @return workloadId
     */
    public String getWorkloadId() {
        return workloadId;
    }

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    public WorkLoadInfo withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * **参数解释**: 工作负载类型 **取值范围**: 字符长度0-65535位 
     * @return workloadType
     */
    public String getWorkloadType() {
        return workloadType;
    }

    public void setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
    }

    public WorkLoadInfo withWorkloadStatus(String workloadStatus) {
        this.workloadStatus = workloadStatus;
        return this;
    }

    /**
     * **参数解释**: 工作负载状态 **取值范围**: 字符长度0-65535位 
     * @return workloadStatus
     */
    public String getWorkloadStatus() {
        return workloadStatus;
    }

    public void setWorkloadStatus(String workloadStatus) {
        this.workloadStatus = workloadStatus;
    }

    public WorkLoadInfo withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * **参数解释**: 命名空间名称 **取值范围**: 字符长度0-256位 
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public WorkLoadInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**: 所属集群名称 **取值范围**: 字符长度0-65535位 
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public WorkLoadInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**: 所属集群ID **取值范围**: 字符长度0-65535位 
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public WorkLoadInfo withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * **参数解释**: agent版本 **取值范围**: 字符长度0-65535位 
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public WorkLoadInfo withInstalledPodNum(Integer installedPodNum) {
        this.installedPodNum = installedPodNum;
        return this;
    }

    /**
     * **参数解释**: 已安装实例个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return installedPodNum
     */
    public Integer getInstalledPodNum() {
        return installedPodNum;
    }

    public void setInstalledPodNum(Integer installedPodNum) {
        this.installedPodNum = installedPodNum;
    }

    public WorkLoadInfo withNotInstallNum(Integer notInstallNum) {
        this.notInstallNum = notInstallNum;
        return this;
    }

    /**
     * **参数解释**: 未安装实例个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return notInstallNum
     */
    public Integer getNotInstallNum() {
        return notInstallNum;
    }

    public void setNotInstallNum(Integer notInstallNum) {
        this.notInstallNum = notInstallNum;
    }

    public WorkLoadInfo withInstallFailedNum(Integer installFailedNum) {
        this.installFailedNum = installFailedNum;
        return this;
    }

    /**
     * **参数解释**: 安装失败实例个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return installFailedNum
     */
    public Integer getInstallFailedNum() {
        return installFailedNum;
    }

    public void setInstallFailedNum(Integer installFailedNum) {
        this.installFailedNum = installFailedNum;
    }

    public WorkLoadInfo withOfflineNum(Integer offlineNum) {
        this.offlineNum = offlineNum;
        return this;
    }

    /**
     * **参数解释**: 离线agent个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return offlineNum
     */
    public Integer getOfflineNum() {
        return offlineNum;
    }

    public void setOfflineNum(Integer offlineNum) {
        this.offlineNum = offlineNum;
    }

    public WorkLoadInfo withPodNum(Integer podNum) {
        this.podNum = podNum;
        return this;
    }

    /**
     * **参数解释**: 全部实例个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return podNum
     */
    public Integer getPodNum() {
        return podNum;
    }

    public void setPodNum(Integer podNum) {
        this.podNum = podNum;
    }

    public WorkLoadInfo withProtectPodNum(Integer protectPodNum) {
        this.protectPodNum = protectPodNum;
        return this;
    }

    /**
     * **参数解释**: 已防护实例个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return protectPodNum
     */
    public Integer getProtectPodNum() {
        return protectPodNum;
    }

    public void setProtectPodNum(Integer protectPodNum) {
        this.protectPodNum = protectPodNum;
    }

    public WorkLoadInfo withRunningJobNum(Integer runningJobNum) {
        this.runningJobNum = runningJobNum;
        return this;
    }

    /**
     * **参数解释**: 运行任务数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return runningJobNum
     */
    public Integer getRunningJobNum() {
        return runningJobNum;
    }

    public void setRunningJobNum(Integer runningJobNum) {
        this.runningJobNum = runningJobNum;
    }

    public WorkLoadInfo withImageName(List<String> imageName) {
        this.imageName = imageName;
        return this;
    }

    public WorkLoadInfo addImageNameItem(String imageNameItem) {
        if (this.imageName == null) {
            this.imageName = new ArrayList<>();
        }
        this.imageName.add(imageNameItem);
        return this;
    }

    public WorkLoadInfo withImageName(Consumer<List<String>> imageNameSetter) {
        if (this.imageName == null) {
            this.imageName = new ArrayList<>();
        }
        imageNameSetter.accept(this.imageName);
        return this;
    }

    /**
     * **参数解释**: 镜像名称列表 **取值范围**: 最小值0，最大值256 
     * @return imageName
     */
    public List<String> getImageName() {
        return imageName;
    }

    public void setImageName(List<String> imageName) {
        this.imageName = imageName;
    }

    public WorkLoadInfo withLabels(List<LabelInfo> labels) {
        this.labels = labels;
        return this;
    }

    public WorkLoadInfo addLabelsItem(LabelInfo labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public WorkLoadInfo withLabels(Consumer<List<LabelInfo>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**: 标签 **取值范围**: 最小值0，最大值65535 
     * @return labels
     */
    public List<LabelInfo> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelInfo> labels) {
        this.labels = labels;
    }

    public WorkLoadInfo withInstanceInfo(List<ServerlessInstanceInfo> instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }

    public WorkLoadInfo addInstanceInfoItem(ServerlessInstanceInfo instanceInfoItem) {
        if (this.instanceInfo == null) {
            this.instanceInfo = new ArrayList<>();
        }
        this.instanceInfo.add(instanceInfoItem);
        return this;
    }

    public WorkLoadInfo withInstanceInfo(Consumer<List<ServerlessInstanceInfo>> instanceInfoSetter) {
        if (this.instanceInfo == null) {
            this.instanceInfo = new ArrayList<>();
        }
        instanceInfoSetter.accept(this.instanceInfo);
        return this;
    }

    /**
     * **参数解释**: 实例信息 **取值范围**: 最小值0，最大值65535 
     * @return instanceInfo
     */
    public List<ServerlessInstanceInfo> getInstanceInfo() {
        return instanceInfo;
    }

    public void setInstanceInfo(List<ServerlessInstanceInfo> instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

    public WorkLoadInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * **参数解释**: 防护状态 **取值范围**: 字符长度0-65535位 
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public WorkLoadInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public WorkLoadInfo withLastScheduleTime(Long lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
        return this;
    }

    /**
     * **参数解释**: 普通任务为完成时间，定时任务类型为最近调度时间 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastScheduleTime
     */
    public Long getLastScheduleTime() {
        return lastScheduleTime;
    }

    public void setLastScheduleTime(Long lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
    }

    public WorkLoadInfo withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * **参数解释**: 定时任务类型 任务触发 **取值范围**: 字符长度0-65535位 
     * @return schedule
     */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public WorkLoadInfo withUpgradable(Boolean upgradable) {
        this.upgradable = upgradable;
        return this;
    }

    /**
     * **参数解释**: 是否可升级 **取值范围**: - true：是。 - false：否。 
     * @return upgradable
     */
    public Boolean getUpgradable() {
        return upgradable;
    }

    public void setUpgradable(Boolean upgradable) {
        this.upgradable = upgradable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkLoadInfo that = (WorkLoadInfo) obj;
        return Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.workloadName, that.workloadName) && Objects.equals(this.workloadId, that.workloadId)
            && Objects.equals(this.workloadType, that.workloadType)
            && Objects.equals(this.workloadStatus, that.workloadStatus)
            && Objects.equals(this.namespaceName, that.namespaceName)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.installedPodNum, that.installedPodNum)
            && Objects.equals(this.notInstallNum, that.notInstallNum)
            && Objects.equals(this.installFailedNum, that.installFailedNum)
            && Objects.equals(this.offlineNum, that.offlineNum) && Objects.equals(this.podNum, that.podNum)
            && Objects.equals(this.protectPodNum, that.protectPodNum)
            && Objects.equals(this.runningJobNum, that.runningJobNum) && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.instanceInfo, that.instanceInfo)
            && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastScheduleTime, that.lastScheduleTime)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.upgradable, that.upgradable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectName,
            workloadName,
            workloadId,
            workloadType,
            workloadStatus,
            namespaceName,
            clusterName,
            clusterId,
            agentVersion,
            installedPodNum,
            notInstallNum,
            installFailedNum,
            offlineNum,
            podNum,
            protectPodNum,
            runningJobNum,
            imageName,
            labels,
            instanceInfo,
            protectStatus,
            createTime,
            lastScheduleTime,
            schedule,
            upgradable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkLoadInfo {\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    workloadName: ").append(toIndentedString(workloadName)).append("\n");
        sb.append("    workloadId: ").append(toIndentedString(workloadId)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
        sb.append("    workloadStatus: ").append(toIndentedString(workloadStatus)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    installedPodNum: ").append(toIndentedString(installedPodNum)).append("\n");
        sb.append("    notInstallNum: ").append(toIndentedString(notInstallNum)).append("\n");
        sb.append("    installFailedNum: ").append(toIndentedString(installFailedNum)).append("\n");
        sb.append("    offlineNum: ").append(toIndentedString(offlineNum)).append("\n");
        sb.append("    podNum: ").append(toIndentedString(podNum)).append("\n");
        sb.append("    protectPodNum: ").append(toIndentedString(protectPodNum)).append("\n");
        sb.append("    runningJobNum: ").append(toIndentedString(runningJobNum)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    instanceInfo: ").append(toIndentedString(instanceInfo)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastScheduleTime: ").append(toIndentedString(lastScheduleTime)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    upgradable: ").append(toIndentedString(upgradable)).append("\n");
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
