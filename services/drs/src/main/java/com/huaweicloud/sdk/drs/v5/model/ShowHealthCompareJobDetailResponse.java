package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHealthCompareJobDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    public ShowHealthCompareJobDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 对比任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowHealthCompareJobDetailResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对比类型： object_comparison：对象对比。 lines：行对比。 account：用户对比。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowHealthCompareJobDetailResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，UTC时间，例如：2024-04-03T08:00:01Z。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowHealthCompareJobDetailResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，UTC时间，例如：2024-04-03T08:00:01Z。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowHealthCompareJobDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 对比任务的状态。取值： - RUNNING：运行中。 - WAITING_FOR_RUNNING：等待启动中。 - SUCCESSFUL：完成。 - FAILED：失败。 - CANCELLED：已取消。 - TIMEOUT_INTERRUPT：超时中断。 - FULL_DOING：全量校验中。 - INCRE_DOING：增量校验中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowHealthCompareJobDetailResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 任务名称。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHealthCompareJobDetailResponse that = (ShowHealthCompareJobDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.jobName, that.jobName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, startTime, endTime, status, jobName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHealthCompareJobDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
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
