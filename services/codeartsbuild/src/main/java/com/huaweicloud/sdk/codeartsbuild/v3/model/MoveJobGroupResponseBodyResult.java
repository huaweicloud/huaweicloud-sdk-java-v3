package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务组
 */
public class MoveJobGroupResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_path_id")

    private String groupPathId;

    public MoveJobGroupResponseBodyResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务编号
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public MoveJobGroupResponseBodyResult withGroupPathId(String groupPathId) {
        this.groupPathId = groupPathId;
        return this;
    }

    /**
     * 分组路径
     * @return groupPathId
     */
    public String getGroupPathId() {
        return groupPathId;
    }

    public void setGroupPathId(String groupPathId) {
        this.groupPathId = groupPathId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MoveJobGroupResponseBodyResult that = (MoveJobGroupResponseBodyResult) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.groupPathId, that.groupPathId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, groupPathId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveJobGroupResponseBodyResult {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    groupPathId: ").append(toIndentedString(groupPathId)).append("\n");
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
