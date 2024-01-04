package com.huaweicloud.sdk.dlf.v1.model;

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
    @JsonProperty(value = "workSpace")

    private String workSpace;

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
            && Objects.equals(this.jobName, that.jobName) && Objects.equals(this.workSpace, that.workSpace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dependOnLastPeriod, jobName, workSpace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependWorkSpaceJob {\n");
        sb.append("    dependOnLastPeriod: ").append(toIndentedString(dependOnLastPeriod)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    workSpace: ").append(toIndentedString(workSpace)).append("\n");
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
