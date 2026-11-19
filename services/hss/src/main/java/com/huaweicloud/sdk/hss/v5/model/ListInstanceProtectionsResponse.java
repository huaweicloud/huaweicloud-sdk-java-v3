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
public class ListInstanceProtectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_list")

    private List<ClusterInfo> clusterList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_list")

    private List<WorkLoadInfo> workloadList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_list")

    private List<ServerlessInstanceInfo> instanceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_num")

    private Integer riskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_num")

    private Integer abnormalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprotect_num")

    private Integer unprotectNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_num")

    private Integer instanceNum;

    public ListInstanceProtectionsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 防护列表总数 **取值范围**: 最小值0，最大值2147483647 
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

    public ListInstanceProtectionsResponse withClusterList(List<ClusterInfo> clusterList) {
        this.clusterList = clusterList;
        return this;
    }

    public ListInstanceProtectionsResponse addClusterListItem(ClusterInfo clusterListItem) {
        if (this.clusterList == null) {
            this.clusterList = new ArrayList<>();
        }
        this.clusterList.add(clusterListItem);
        return this;
    }

    public ListInstanceProtectionsResponse withClusterList(Consumer<List<ClusterInfo>> clusterListSetter) {
        if (this.clusterList == null) {
            this.clusterList = new ArrayList<>();
        }
        clusterListSetter.accept(this.clusterList);
        return this;
    }

    /**
     * **参数解释**: 集群防护列表 **取值范围**: 最小值0，最大值65535 
     * @return clusterList
     */
    public List<ClusterInfo> getClusterList() {
        return clusterList;
    }

    public void setClusterList(List<ClusterInfo> clusterList) {
        this.clusterList = clusterList;
    }

    public ListInstanceProtectionsResponse withWorkloadList(List<WorkLoadInfo> workloadList) {
        this.workloadList = workloadList;
        return this;
    }

    public ListInstanceProtectionsResponse addWorkloadListItem(WorkLoadInfo workloadListItem) {
        if (this.workloadList == null) {
            this.workloadList = new ArrayList<>();
        }
        this.workloadList.add(workloadListItem);
        return this;
    }

    public ListInstanceProtectionsResponse withWorkloadList(Consumer<List<WorkLoadInfo>> workloadListSetter) {
        if (this.workloadList == null) {
            this.workloadList = new ArrayList<>();
        }
        workloadListSetter.accept(this.workloadList);
        return this;
    }

    /**
     * **参数解释**: 工作负载防护列表 **取值范围**: 最小值0，最大值65535 
     * @return workloadList
     */
    public List<WorkLoadInfo> getWorkloadList() {
        return workloadList;
    }

    public void setWorkloadList(List<WorkLoadInfo> workloadList) {
        this.workloadList = workloadList;
    }

    public ListInstanceProtectionsResponse withInstanceList(List<ServerlessInstanceInfo> instanceList) {
        this.instanceList = instanceList;
        return this;
    }

    public ListInstanceProtectionsResponse addInstanceListItem(ServerlessInstanceInfo instanceListItem) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        this.instanceList.add(instanceListItem);
        return this;
    }

    public ListInstanceProtectionsResponse withInstanceList(Consumer<List<ServerlessInstanceInfo>> instanceListSetter) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        instanceListSetter.accept(this.instanceList);
        return this;
    }

    /**
     * **参数解释**: 实例防护列表 **取值范围**: 最小值0，最大值65535 
     * @return instanceList
     */
    public List<ServerlessInstanceInfo> getInstanceList() {
        return instanceList;
    }

    public void setInstanceList(List<ServerlessInstanceInfo> instanceList) {
        this.instanceList = instanceList;
    }

    public ListInstanceProtectionsResponse withRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }

    /**
     * **参数解释**: 有风险实例数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return riskNum
     */
    public Integer getRiskNum() {
        return riskNum;
    }

    public void setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
    }

    public ListInstanceProtectionsResponse withAbnormalNum(Integer abnormalNum) {
        this.abnormalNum = abnormalNum;
        return this;
    }

    /**
     * **参数解释**: 防护异常数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return abnormalNum
     */
    public Integer getAbnormalNum() {
        return abnormalNum;
    }

    public void setAbnormalNum(Integer abnormalNum) {
        this.abnormalNum = abnormalNum;
    }

    public ListInstanceProtectionsResponse withUnprotectNum(Integer unprotectNum) {
        this.unprotectNum = unprotectNum;
        return this;
    }

    /**
     * **参数解释**: 未防护实例数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unprotectNum
     */
    public Integer getUnprotectNum() {
        return unprotectNum;
    }

    public void setUnprotectNum(Integer unprotectNum) {
        this.unprotectNum = unprotectNum;
    }

    public ListInstanceProtectionsResponse withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    /**
     * **参数解释**: 全部实例数 **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceProtectionsResponse that = (ListInstanceProtectionsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.clusterList, that.clusterList)
            && Objects.equals(this.workloadList, that.workloadList)
            && Objects.equals(this.instanceList, that.instanceList) && Objects.equals(this.riskNum, that.riskNum)
            && Objects.equals(this.abnormalNum, that.abnormalNum)
            && Objects.equals(this.unprotectNum, that.unprotectNum)
            && Objects.equals(this.instanceNum, that.instanceNum);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(totalNum, clusterList, workloadList, instanceList, riskNum, abnormalNum, unprotectNum, instanceNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceProtectionsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    clusterList: ").append(toIndentedString(clusterList)).append("\n");
        sb.append("    workloadList: ").append(toIndentedString(workloadList)).append("\n");
        sb.append("    instanceList: ").append(toIndentedString(instanceList)).append("\n");
        sb.append("    riskNum: ").append(toIndentedString(riskNum)).append("\n");
        sb.append("    abnormalNum: ").append(toIndentedString(abnormalNum)).append("\n");
        sb.append("    unprotectNum: ").append(toIndentedString(unprotectNum)).append("\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
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
