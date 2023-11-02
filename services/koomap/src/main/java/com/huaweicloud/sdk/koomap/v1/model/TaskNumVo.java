package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskNumVo
 */
public class TaskNumVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalNum")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failedNum")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archivedNum")

    private Integer archivedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successNum")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runningNum")

    private Integer runningNum;

    public TaskNumVo withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 任务总数量。
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public TaskNumVo withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * 失败任务数量。
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public TaskNumVo withArchivedNum(Integer archivedNum) {
        this.archivedNum = archivedNum;
        return this;
    }

    /**
     * 存档任务数量。
     * @return archivedNum
     */
    public Integer getArchivedNum() {
        return archivedNum;
    }

    public void setArchivedNum(Integer archivedNum) {
        this.archivedNum = archivedNum;
    }

    public TaskNumVo withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * 成功任务数量。
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public TaskNumVo withRunningNum(Integer runningNum) {
        this.runningNum = runningNum;
        return this;
    }

    /**
     * 运行中任务数量。
     * @return runningNum
     */
    public Integer getRunningNum() {
        return runningNum;
    }

    public void setRunningNum(Integer runningNum) {
        this.runningNum = runningNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskNumVo that = (TaskNumVo) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.failedNum, that.failedNum)
            && Objects.equals(this.archivedNum, that.archivedNum) && Objects.equals(this.successNum, that.successNum)
            && Objects.equals(this.runningNum, that.runningNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, failedNum, archivedNum, successNum, runningNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskNumVo {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    archivedNum: ").append(toIndentedString(archivedNum)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    runningNum: ").append(toIndentedString(runningNum)).append("\n");
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
