package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DependWorkSpaceJob
 */
public class DependWorkSpaceJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependOnLastPeriod")

    private Boolean dependOnLastPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobName")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workSpaceId")

    private String workSpaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workSpace")

    private String workSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependType")

    private String dependType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependOnLastNPeriodValue")

    private Integer dependOnLastNPeriodValue;

    public DependWorkSpaceJob withDependOnLastPeriod(Boolean dependOnLastPeriod) {
        this.dependOnLastPeriod = dependOnLastPeriod;
        return this;
    }

    /**
     * 是否依赖最近一个周期
     * @return dependOnLastPeriod
     */
    public Boolean getDependOnLastPeriod() {
        return dependOnLastPeriod;
    }

    public void setDependOnLastPeriod(Boolean dependOnLastPeriod) {
        this.dependOnLastPeriod = dependOnLastPeriod;
    }

    public DependWorkSpaceJob withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public DependWorkSpaceJob withWorkSpaceId(String workSpaceId) {
        this.workSpaceId = workSpaceId;
        return this;
    }

    /**
     * 工作空间名ID
     * @return workSpaceId
     */
    public String getWorkSpaceId() {
        return workSpaceId;
    }

    public void setWorkSpaceId(String workSpaceId) {
        this.workSpaceId = workSpaceId;
    }

    public DependWorkSpaceJob withWorkSpace(String workSpace) {
        this.workSpace = workSpace;
        return this;
    }

    /**
     * 工作空间名
     * @return workSpace
     */
    public String getWorkSpace() {
        return workSpace;
    }

    public void setWorkSpace(String workSpace) {
        this.workSpace = workSpace;
    }

    public DependWorkSpaceJob withDependType(String dependType) {
        this.dependType = dependType;
        return this;
    }

    /**
     * 依赖的规则
     * @return dependType
     */
    public String getDependType() {
        return dependType;
    }

    public void setDependType(String dependType) {
        this.dependType = dependType;
    }

    public DependWorkSpaceJob withDependOnLastNPeriodValue(Integer dependOnLastNPeriodValue) {
        this.dependOnLastNPeriodValue = dependOnLastNPeriodValue;
        return this;
    }

    /**
     * 依赖上N个周期
     * @return dependOnLastNPeriodValue
     */
    public Integer getDependOnLastNPeriodValue() {
        return dependOnLastNPeriodValue;
    }

    public void setDependOnLastNPeriodValue(Integer dependOnLastNPeriodValue) {
        this.dependOnLastNPeriodValue = dependOnLastNPeriodValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DependWorkSpaceJob that = (DependWorkSpaceJob) obj;
        return Objects.equals(this.dependOnLastPeriod, that.dependOnLastPeriod)
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.workSpaceId, that.workSpaceId)
            && Objects.equals(this.workSpace, that.workSpace) && Objects.equals(this.dependType, that.dependType)
            && Objects.equals(this.dependOnLastNPeriodValue, that.dependOnLastNPeriodValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dependOnLastPeriod, jobName, workSpaceId, workSpace, dependType, dependOnLastNPeriodValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependWorkSpaceJob {\n");
        sb.append("    dependOnLastPeriod: ").append(toIndentedString(dependOnLastPeriod)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    workSpaceId: ").append(toIndentedString(workSpaceId)).append("\n");
        sb.append("    workSpace: ").append(toIndentedString(workSpace)).append("\n");
        sb.append("    dependType: ").append(toIndentedString(dependType)).append("\n");
        sb.append("    dependOnLastNPeriodValue: ").append(toIndentedString(dependOnLastNPeriodValue)).append("\n");
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
