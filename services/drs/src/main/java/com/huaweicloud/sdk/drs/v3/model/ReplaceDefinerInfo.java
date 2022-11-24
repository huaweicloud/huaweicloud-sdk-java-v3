package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置replaceDefiner信息
 */
public class ReplaceDefinerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replace_definer")

    private Boolean replaceDefiner;

    public ReplaceDefinerInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ReplaceDefinerInfo withReplaceDefiner(Boolean replaceDefiner) {
        this.replaceDefiner = replaceDefiner;
        return this;
    }

    /**
     * 是否使用目标库的用户替换掉definer
     * @return replaceDefiner
     */
    public Boolean getReplaceDefiner() {
        return replaceDefiner;
    }

    public void setReplaceDefiner(Boolean replaceDefiner) {
        this.replaceDefiner = replaceDefiner;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplaceDefinerInfo replaceDefinerInfo = (ReplaceDefinerInfo) o;
        return Objects.equals(this.jobId, replaceDefinerInfo.jobId)
            && Objects.equals(this.replaceDefiner, replaceDefinerInfo.replaceDefiner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, replaceDefiner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplaceDefinerInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    replaceDefiner: ").append(toIndentedString(replaceDefiner)).append("\n");
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
