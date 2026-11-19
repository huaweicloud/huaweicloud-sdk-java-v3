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
public class InstalledInstanceAgentListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_error_num")

    private Integer accessErrorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_error_num")

    private Integer runErrorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_num")

    private Integer upgradeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_failed_num")

    private Integer upgradeFailedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_list")

    private List<ClusterInfo> clusterList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_list")

    private List<WorkLoadInfo> workloadList = null;

    public InstalledInstanceAgentListResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 安装列表总数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public InstalledInstanceAgentListResponse withAccessErrorNum(Integer accessErrorNum) {
        this.accessErrorNum = accessErrorNum;
        return this;
    }

    /**
     * **参数解释**: 安装列表接入异常工作负载/集群个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return accessErrorNum
     */
    public Integer getAccessErrorNum() {
        return accessErrorNum;
    }

    public void setAccessErrorNum(Integer accessErrorNum) {
        this.accessErrorNum = accessErrorNum;
    }

    public InstalledInstanceAgentListResponse withRunErrorNum(Integer runErrorNum) {
        this.runErrorNum = runErrorNum;
        return this;
    }

    /**
     * **参数解释**: 安装列表运行异常工作负载/集群个数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return runErrorNum
     */
    public Integer getRunErrorNum() {
        return runErrorNum;
    }

    public void setRunErrorNum(Integer runErrorNum) {
        this.runErrorNum = runErrorNum;
    }

    public InstalledInstanceAgentListResponse withUpgradeNum(Integer upgradeNum) {
        this.upgradeNum = upgradeNum;
        return this;
    }

    /**
     * **参数解释**: 安装列表待升级Agent数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return upgradeNum
     */
    public Integer getUpgradeNum() {
        return upgradeNum;
    }

    public void setUpgradeNum(Integer upgradeNum) {
        this.upgradeNum = upgradeNum;
    }

    public InstalledInstanceAgentListResponse withUpgradeFailedNum(Integer upgradeFailedNum) {
        this.upgradeFailedNum = upgradeFailedNum;
        return this;
    }

    /**
     * **参数解释**: 安装列表升级失败实例数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return upgradeFailedNum
     */
    public Integer getUpgradeFailedNum() {
        return upgradeFailedNum;
    }

    public void setUpgradeFailedNum(Integer upgradeFailedNum) {
        this.upgradeFailedNum = upgradeFailedNum;
    }

    public InstalledInstanceAgentListResponse withClusterList(List<ClusterInfo> clusterList) {
        this.clusterList = clusterList;
        return this;
    }

    public InstalledInstanceAgentListResponse addClusterListItem(ClusterInfo clusterListItem) {
        if (this.clusterList == null) {
            this.clusterList = new ArrayList<>();
        }
        this.clusterList.add(clusterListItem);
        return this;
    }

    public InstalledInstanceAgentListResponse withClusterList(Consumer<List<ClusterInfo>> clusterListSetter) {
        if (this.clusterList == null) {
            this.clusterList = new ArrayList<>();
        }
        clusterListSetter.accept(this.clusterList);
        return this;
    }

    /**
     * **参数解释**: 集群安装agent列表 **取值范围**: 最小值0，最大值65535 
     * @return clusterList
     */
    public List<ClusterInfo> getClusterList() {
        return clusterList;
    }

    public void setClusterList(List<ClusterInfo> clusterList) {
        this.clusterList = clusterList;
    }

    public InstalledInstanceAgentListResponse withWorkloadList(List<WorkLoadInfo> workloadList) {
        this.workloadList = workloadList;
        return this;
    }

    public InstalledInstanceAgentListResponse addWorkloadListItem(WorkLoadInfo workloadListItem) {
        if (this.workloadList == null) {
            this.workloadList = new ArrayList<>();
        }
        this.workloadList.add(workloadListItem);
        return this;
    }

    public InstalledInstanceAgentListResponse withWorkloadList(Consumer<List<WorkLoadInfo>> workloadListSetter) {
        if (this.workloadList == null) {
            this.workloadList = new ArrayList<>();
        }
        workloadListSetter.accept(this.workloadList);
        return this;
    }

    /**
     * **参数解释**: 工作负载安装agent列表 **取值范围**: 最小值0，最大值65535 
     * @return workloadList
     */
    public List<WorkLoadInfo> getWorkloadList() {
        return workloadList;
    }

    public void setWorkloadList(List<WorkLoadInfo> workloadList) {
        this.workloadList = workloadList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstalledInstanceAgentListResponse that = (InstalledInstanceAgentListResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.accessErrorNum, that.accessErrorNum)
            && Objects.equals(this.runErrorNum, that.runErrorNum) && Objects.equals(this.upgradeNum, that.upgradeNum)
            && Objects.equals(this.upgradeFailedNum, that.upgradeFailedNum)
            && Objects.equals(this.clusterList, that.clusterList)
            && Objects.equals(this.workloadList, that.workloadList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(totalNum, accessErrorNum, runErrorNum, upgradeNum, upgradeFailedNum, clusterList, workloadList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstalledInstanceAgentListResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    accessErrorNum: ").append(toIndentedString(accessErrorNum)).append("\n");
        sb.append("    runErrorNum: ").append(toIndentedString(runErrorNum)).append("\n");
        sb.append("    upgradeNum: ").append(toIndentedString(upgradeNum)).append("\n");
        sb.append("    upgradeFailedNum: ").append(toIndentedString(upgradeFailedNum)).append("\n");
        sb.append("    clusterList: ").append(toIndentedString(clusterList)).append("\n");
        sb.append("    workloadList: ").append(toIndentedString(workloadList)).append("\n");
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
