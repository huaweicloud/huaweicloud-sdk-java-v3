package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 构建成功率
 */
public class ShowRunningStatusResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_job_id")

    private String lastJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_build_no")

    private String lastBuildNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_build_status")

    private String lastBuildStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_running")

    private Boolean isRunning;

    public ShowRunningStatusResult withLastJobId(String lastJobId) {
        this.lastJobId = lastJobId;
        return this;
    }

    /**
     * 任务ID
     * @return lastJobId
     */
    public String getLastJobId() {
        return lastJobId;
    }

    public void setLastJobId(String lastJobId) {
        this.lastJobId = lastJobId;
    }

    public ShowRunningStatusResult withLastBuildNo(String lastBuildNo) {
        this.lastBuildNo = lastBuildNo;
        return this;
    }

    /**
     * 最新构建编号
     * @return lastBuildNo
     */
    public String getLastBuildNo() {
        return lastBuildNo;
    }

    public void setLastBuildNo(String lastBuildNo) {
        this.lastBuildNo = lastBuildNo;
    }

    public ShowRunningStatusResult withLastBuildStatus(String lastBuildStatus) {
        this.lastBuildStatus = lastBuildStatus;
        return this;
    }

    /**
     * 最新构建状态
     * @return lastBuildStatus
     */
    public String getLastBuildStatus() {
        return lastBuildStatus;
    }

    public void setLastBuildStatus(String lastBuildStatus) {
        this.lastBuildStatus = lastBuildStatus;
    }

    public ShowRunningStatusResult withIsRunning(Boolean isRunning) {
        this.isRunning = isRunning;
        return this;
    }

    /**
     * 是否在运行中
     * @return isRunning
     */
    public Boolean getIsRunning() {
        return isRunning;
    }

    public void setIsRunning(Boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRunningStatusResult that = (ShowRunningStatusResult) obj;
        return Objects.equals(this.lastJobId, that.lastJobId) && Objects.equals(this.lastBuildNo, that.lastBuildNo)
            && Objects.equals(this.lastBuildStatus, that.lastBuildStatus)
            && Objects.equals(this.isRunning, that.isRunning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastJobId, lastBuildNo, lastBuildStatus, isRunning);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRunningStatusResult {\n");
        sb.append("    lastJobId: ").append(toIndentedString(lastJobId)).append("\n");
        sb.append("    lastBuildNo: ").append(toIndentedString(lastBuildNo)).append("\n");
        sb.append("    lastBuildStatus: ").append(toIndentedString(lastBuildStatus)).append("\n");
        sb.append("    isRunning: ").append(toIndentedString(isRunning)).append("\n");
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
