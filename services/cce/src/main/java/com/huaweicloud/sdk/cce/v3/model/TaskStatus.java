package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** TaskStatus */
public class TaskStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobID")

    private String jobID;

    public TaskStatus withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    /** 任务ID，供调用者查询任务进度。
     * 
     * @return jobID */
    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskStatus taskStatus = (TaskStatus) o;
        return Objects.equals(this.jobID, taskStatus.jobID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskStatus {\n");
        sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
