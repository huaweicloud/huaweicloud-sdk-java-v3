package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作计划
 */
public class WorkloadPlanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_name")

    private String planName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_stage")

    private String currentStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_list")

    private List<PlanStage> stageList = null;

    public WorkloadPlanInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 计划状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WorkloadPlanInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public WorkloadPlanInfo withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public WorkloadPlanInfo withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 计划ID。
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public WorkloadPlanInfo withPlanName(String planName) {
        this.planName = planName;
        return this;
    }

    /**
     * 计划名称。
     * @return planName
     */
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public WorkloadPlanInfo withCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }

    /**
     * 当前计划阶段。
     * @return currentStage
     */
    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public WorkloadPlanInfo withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * 逻辑集群名称。
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public WorkloadPlanInfo withStageList(List<PlanStage> stageList) {
        this.stageList = stageList;
        return this;
    }

    public WorkloadPlanInfo addStageListItem(PlanStage stageListItem) {
        if (this.stageList == null) {
            this.stageList = new ArrayList<>();
        }
        this.stageList.add(stageListItem);
        return this;
    }

    public WorkloadPlanInfo withStageList(Consumer<List<PlanStage>> stageListSetter) {
        if (this.stageList == null) {
            this.stageList = new ArrayList<>();
        }
        stageListSetter.accept(this.stageList);
        return this;
    }

    /**
     * 计划阶段列表。
     * @return stageList
     */
    public List<PlanStage> getStageList() {
        return stageList;
    }

    public void setStageList(List<PlanStage> stageList) {
        this.stageList = stageList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadPlanInfo that = (WorkloadPlanInfo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.planId, that.planId)
            && Objects.equals(this.planName, that.planName) && Objects.equals(this.currentStage, that.currentStage)
            && Objects.equals(this.logicalClusterName, that.logicalClusterName)
            && Objects.equals(this.stageList, that.stageList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(status, projectId, clusterId, planId, planName, currentStage, logicalClusterName, stageList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadPlanInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    currentStage: ").append(toIndentedString(currentStage)).append("\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    stageList: ").append(toIndentedString(stageList)).append("\n");
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
