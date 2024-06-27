package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BranchVersionInfo
 */
public class BranchVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

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

    public BranchVersionInfo withName(String name) {
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

    public BranchVersionInfo withNumber(String number) {
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

    public BranchVersionInfo withIsMaster(String isMaster) {
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

    public BranchVersionInfo withPbiId(String pbiId) {
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

    public BranchVersionInfo withPbiName(String pbiName) {
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

    public BranchVersionInfo withPlanStartDate(String planStartDate) {
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

    public BranchVersionInfo withPlanStartTimestamp(Long planStartTimestamp) {
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

    public BranchVersionInfo withPlanEndDate(String planEndDate) {
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

    public BranchVersionInfo withPlanEndTimestamp(Long planEndTimestamp) {
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

    public BranchVersionInfo withAsynGit(String asynGit) {
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

    public BranchVersionInfo withProjectUuid(String projectUuid) {
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

    public BranchVersionInfo withProjectName(String projectName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BranchVersionInfo that = (BranchVersionInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.number, that.number)
            && Objects.equals(this.isMaster, that.isMaster) && Objects.equals(this.pbiId, that.pbiId)
            && Objects.equals(this.pbiName, that.pbiName) && Objects.equals(this.planStartDate, that.planStartDate)
            && Objects.equals(this.planStartTimestamp, that.planStartTimestamp)
            && Objects.equals(this.planEndDate, that.planEndDate)
            && Objects.equals(this.planEndTimestamp, that.planEndTimestamp)
            && Objects.equals(this.asynGit, that.asynGit) && Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.projectName, that.projectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            number,
            isMaster,
            pbiId,
            pbiName,
            planStartDate,
            planStartTimestamp,
            planEndDate,
            planEndTimestamp,
            asynGit,
            projectUuid,
            projectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchVersionInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
