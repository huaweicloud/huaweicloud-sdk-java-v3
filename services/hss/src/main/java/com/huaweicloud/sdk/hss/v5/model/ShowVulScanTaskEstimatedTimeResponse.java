package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowVulScanTaskEstimatedTimeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_time")

    private Long queueTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_time")

    private Long runTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_time")

    private Integer totalTime;

    public ShowVulScanTaskEstimatedTimeResponse withQueueTime(Long queueTime) {
        this.queueTime = queueTime;
        return this;
    }

    /**
     * **参数解释**： 执行漏洞扫描需要排队等待的时间，单位为分钟 **约束限制**： 不涉及 **取值范围**： 字符长度1-9223372036854775807 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return queueTime
     */
    public Long getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(Long queueTime) {
        this.queueTime = queueTime;
    }

    public ShowVulScanTaskEstimatedTimeResponse withRunTime(Long runTime) {
        this.runTime = runTime;
        return this;
    }

    /**
     * **参数解释**: 本次任务执行需要的时间，单位为分钟 **约束限制**： 不涉及 **取值范围**： 字符长度1-9223372036854775807 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return runTime
     */
    public Long getRunTime() {
        return runTime;
    }

    public void setRunTime(Long runTime) {
        this.runTime = runTime;
    }

    public ShowVulScanTaskEstimatedTimeResponse withTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    /**
     * **参数解释**: 从现在到任务结束需要的总时间，单位为分钟 **约束限制**： 不涉及 **取值范围**： 字符长度1-9223372036854775807 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalTime
     */
    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulScanTaskEstimatedTimeResponse that = (ShowVulScanTaskEstimatedTimeResponse) obj;
        return Objects.equals(this.queueTime, that.queueTime) && Objects.equals(this.runTime, that.runTime)
            && Objects.equals(this.totalTime, that.totalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queueTime, runTime, totalTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulScanTaskEstimatedTimeResponse {\n");
        sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
        sb.append("    runTime: ").append(toIndentedString(runTime)).append("\n");
        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
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
