package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IteratorVersionInfo
 */
public class IteratorVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterations")

    private List<String> iterations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_master")

    private String isMaster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pbi_id")

    private String pbiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pbi_name")

    private String pbiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_date")

    private String planStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_timestamp")

    private Long planStartTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private String planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_timestamp")

    private Long planEndTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asyn_git")

    private String asynGit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_stage")

    private String currentStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_types")

    private List<String> serviceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_list")

    private List<WorkItemInfo> issueList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_rating")

    private Integer riskRating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_des")

    private String riskDes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_update_risk")

    private String isUpdateRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pi_id")

    private String piId;

    public IteratorVersionInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IteratorVersionInfo withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 开发分支名称
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public IteratorVersionInfo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 处理者ID
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public IteratorVersionInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 待测版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public IteratorVersionInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IteratorVersionInfo withIterations(List<String> iterations) {
        this.iterations = iterations;
        return this;
    }

    public IteratorVersionInfo addIterationsItem(String iterationsItem) {
        if (this.iterations == null) {
            this.iterations = new ArrayList<>();
        }
        this.iterations.add(iterationsItem);
        return this;
    }

    public IteratorVersionInfo withIterations(Consumer<List<String>> iterationsSetter) {
        if (this.iterations == null) {
            this.iterations = new ArrayList<>();
        }
        iterationsSetter.accept(this.iterations);
        return this;
    }

    /**
     * 关联迭代
     * @return iterations
     */
    public List<String> getIterations() {
        return iterations;
    }

    public void setIterations(List<String> iterations) {
        this.iterations = iterations;
    }

    public IteratorVersionInfo withIsMaster(String isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * 是否为Master分支
     * @return isMaster
     */
    public String getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(String isMaster) {
        this.isMaster = isMaster;
    }

    public IteratorVersionInfo withPbiId(String pbiId) {
        this.pbiId = pbiId;
        return this;
    }

    /**
     * PBI ID
     * @return pbiId
     */
    public String getPbiId() {
        return pbiId;
    }

    public void setPbiId(String pbiId) {
        this.pbiId = pbiId;
    }

    public IteratorVersionInfo withPbiName(String pbiName) {
        this.pbiName = pbiName;
        return this;
    }

    /**
     * PBI信息
     * @return pbiName
     */
    public String getPbiName() {
        return pbiName;
    }

    public void setPbiName(String pbiName) {
        this.pbiName = pbiName;
    }

    public IteratorVersionInfo withPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * 开始时间
     * @return planStartDate
     */
    public String getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(String planStartDate) {
        this.planStartDate = planStartDate;
    }

    public IteratorVersionInfo withPlanStartTimestamp(Long planStartTimestamp) {
        this.planStartTimestamp = planStartTimestamp;
        return this;
    }

    /**
     * 开始时间戳
     * @return planStartTimestamp
     */
    public Long getPlanStartTimestamp() {
        return planStartTimestamp;
    }

    public void setPlanStartTimestamp(Long planStartTimestamp) {
        this.planStartTimestamp = planStartTimestamp;
    }

    public IteratorVersionInfo withPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * 结束时间
     * @return planEndDate
     */
    public String getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(String planEndDate) {
        this.planEndDate = planEndDate;
    }

    public IteratorVersionInfo withPlanEndTimestamp(Long planEndTimestamp) {
        this.planEndTimestamp = planEndTimestamp;
        return this;
    }

    /**
     * 结束时间戳
     * @return planEndTimestamp
     */
    public Long getPlanEndTimestamp() {
        return planEndTimestamp;
    }

    public void setPlanEndTimestamp(Long planEndTimestamp) {
        this.planEndTimestamp = planEndTimestamp;
    }

    public IteratorVersionInfo withAsynGit(String asynGit) {
        this.asynGit = asynGit;
        return this;
    }

    /**
     * 是否同步git库
     * @return asynGit
     */
    public String getAsynGit() {
        return asynGit;
    }

    public void setAsynGit(String asynGit) {
        this.asynGit = asynGit;
    }

    public IteratorVersionInfo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目ID（云龙场景，传入微服务ID）
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public IteratorVersionInfo withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称（云龙场景，传入微服务名）
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public IteratorVersionInfo withCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }

    /**
     * 当前所处阶段
     * @return currentStage
     */
    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public IteratorVersionInfo withServiceTypes(List<String> serviceTypes) {
        this.serviceTypes = serviceTypes;
        return this;
    }

    public IteratorVersionInfo addServiceTypesItem(String serviceTypesItem) {
        if (this.serviceTypes == null) {
            this.serviceTypes = new ArrayList<>();
        }
        this.serviceTypes.add(serviceTypesItem);
        return this;
    }

    public IteratorVersionInfo withServiceTypes(Consumer<List<String>> serviceTypesSetter) {
        if (this.serviceTypes == null) {
            this.serviceTypes = new ArrayList<>();
        }
        serviceTypesSetter.accept(this.serviceTypes);
        return this;
    }

    /**
     * 测试类型
     * @return serviceTypes
     */
    public List<String> getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(List<String> serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    public IteratorVersionInfo withIssueList(List<WorkItemInfo> issueList) {
        this.issueList = issueList;
        return this;
    }

    public IteratorVersionInfo addIssueListItem(WorkItemInfo issueListItem) {
        if (this.issueList == null) {
            this.issueList = new ArrayList<>();
        }
        this.issueList.add(issueListItem);
        return this;
    }

    public IteratorVersionInfo withIssueList(Consumer<List<WorkItemInfo>> issueListSetter) {
        if (this.issueList == null) {
            this.issueList = new ArrayList<>();
        }
        issueListSetter.accept(this.issueList);
        return this;
    }

    /**
     * 关联需求
     * @return issueList
     */
    public List<WorkItemInfo> getIssueList() {
        return issueList;
    }

    public void setIssueList(List<WorkItemInfo> issueList) {
        this.issueList = issueList;
    }

    public IteratorVersionInfo withRiskRating(Integer riskRating) {
        this.riskRating = riskRating;
        return this;
    }

    /**
     * 风险等级
     * @return riskRating
     */
    public Integer getRiskRating() {
        return riskRating;
    }

    public void setRiskRating(Integer riskRating) {
        this.riskRating = riskRating;
    }

    public IteratorVersionInfo withRiskDes(String riskDes) {
        this.riskDes = riskDes;
        return this;
    }

    /**
     * 风险描述
     * @return riskDes
     */
    public String getRiskDes() {
        return riskDes;
    }

    public void setRiskDes(String riskDes) {
        this.riskDes = riskDes;
    }

    public IteratorVersionInfo withIsUpdateRisk(String isUpdateRisk) {
        this.isUpdateRisk = isUpdateRisk;
        return this;
    }

    /**
     * 编辑风险信息标记
     * @return isUpdateRisk
     */
    public String getIsUpdateRisk() {
        return isUpdateRisk;
    }

    public void setIsUpdateRisk(String isUpdateRisk) {
        this.isUpdateRisk = isUpdateRisk;
    }

    public IteratorVersionInfo withPiId(String piId) {
        this.piId = piId;
        return this;
    }

    /**
     * pi的id，层级关系：pi -> 迭代 -> 需求
     * @return piId
     */
    public String getPiId() {
        return piId;
    }

    public void setPiId(String piId) {
        this.piId = piId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IteratorVersionInfo that = (IteratorVersionInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.number, that.number)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.version, that.version)
            && Objects.equals(this.description, that.description) && Objects.equals(this.iterations, that.iterations)
            && Objects.equals(this.isMaster, that.isMaster) && Objects.equals(this.pbiId, that.pbiId)
            && Objects.equals(this.pbiName, that.pbiName) && Objects.equals(this.planStartDate, that.planStartDate)
            && Objects.equals(this.planStartTimestamp, that.planStartTimestamp)
            && Objects.equals(this.planEndDate, that.planEndDate)
            && Objects.equals(this.planEndTimestamp, that.planEndTimestamp)
            && Objects.equals(this.asynGit, that.asynGit) && Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.currentStage, that.currentStage)
            && Objects.equals(this.serviceTypes, that.serviceTypes) && Objects.equals(this.issueList, that.issueList)
            && Objects.equals(this.riskRating, that.riskRating) && Objects.equals(this.riskDes, that.riskDes)
            && Objects.equals(this.isUpdateRisk, that.isUpdateRisk) && Objects.equals(this.piId, that.piId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            number,
            owner,
            version,
            description,
            iterations,
            isMaster,
            pbiId,
            pbiName,
            planStartDate,
            planStartTimestamp,
            planEndDate,
            planEndTimestamp,
            asynGit,
            projectUuid,
            projectName,
            currentStage,
            serviceTypes,
            issueList,
            riskRating,
            riskDes,
            isUpdateRisk,
            piId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IteratorVersionInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
        sb.append("    isMaster: ").append(toIndentedString(isMaster)).append("\n");
        sb.append("    pbiId: ").append(toIndentedString(pbiId)).append("\n");
        sb.append("    pbiName: ").append(toIndentedString(pbiName)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    planStartTimestamp: ").append(toIndentedString(planStartTimestamp)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    planEndTimestamp: ").append(toIndentedString(planEndTimestamp)).append("\n");
        sb.append("    asynGit: ").append(toIndentedString(asynGit)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    currentStage: ").append(toIndentedString(currentStage)).append("\n");
        sb.append("    serviceTypes: ").append(toIndentedString(serviceTypes)).append("\n");
        sb.append("    issueList: ").append(toIndentedString(issueList)).append("\n");
        sb.append("    riskRating: ").append(toIndentedString(riskRating)).append("\n");
        sb.append("    riskDes: ").append(toIndentedString(riskDes)).append("\n");
        sb.append("    isUpdateRisk: ").append(toIndentedString(isUpdateRisk)).append("\n");
        sb.append("    piId: ").append(toIndentedString(piId)).append("\n");
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
