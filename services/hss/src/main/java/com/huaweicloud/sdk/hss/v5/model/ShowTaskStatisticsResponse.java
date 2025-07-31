package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTaskStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_num")

    private Integer runningNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_task_start_time")

    private Long lastTaskStartTime;

    public ShowTaskStatisticsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 累计执行的任务总数
     * minimum: 0
     * maximum: 2000000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ShowTaskStatisticsResponse withRunningNum(Integer runningNum) {
        this.runningNum = runningNum;
        return this;
    }

    /**
     * 扫描中的任务数
     * minimum: 0
     * maximum: 2000000
     * @return runningNum
     */
    public Integer getRunningNum() {
        return runningNum;
    }

    public void setRunningNum(Integer runningNum) {
        this.runningNum = runningNum;
    }

    public ShowTaskStatisticsResponse withLastTaskStartTime(Long lastTaskStartTime) {
        this.lastTaskStartTime = lastTaskStartTime;
        return this;
    }

    /**
     * 最近一次扫描任务的创建时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastTaskStartTime
     */
    public Long getLastTaskStartTime() {
        return lastTaskStartTime;
    }

    public void setLastTaskStartTime(Long lastTaskStartTime) {
        this.lastTaskStartTime = lastTaskStartTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskStatisticsResponse that = (ShowTaskStatisticsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.runningNum, that.runningNum)
            && Objects.equals(this.lastTaskStartTime, that.lastTaskStartTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, runningNum, lastTaskStartTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskStatisticsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    runningNum: ").append(toIndentedString(runningNum)).append("\n");
        sb.append("    lastTaskStartTime: ").append(toIndentedString(lastTaskStartTime)).append("\n");
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
