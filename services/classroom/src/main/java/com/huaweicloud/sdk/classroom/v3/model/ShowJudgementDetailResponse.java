package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowJudgementDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    @JacksonXmlProperty(localName = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "judgement_id")

    @JacksonXmlProperty(localName = "judgement_id")

    private String judgementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private JudgementResult result;

    public ShowJudgementDetailResponse withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务回调状态:callback_success(回调成功)、callback_error(回调出错)
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ShowJudgementDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务运行状态:success(成功)、compile_error(编译错误)、internal_error(系统内部错误)、run_timeout(运行超时)、judging(代码运行中)、runtime_error(运行出错)、output_match_error(不符合输出规范)
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowJudgementDetailResponse withJudgementId(String judgementId) {
        this.judgementId = judgementId;
        return this;
    }

    /**
     * 判题任务ID
     * @return judgementId
     */
    public String getJudgementId() {
        return judgementId;
    }

    public void setJudgementId(String judgementId) {
        this.judgementId = judgementId;
    }

    public ShowJudgementDetailResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowJudgementDetailResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowJudgementDetailResponse withResult(JudgementResult result) {
        this.result = result;
        return this;
    }

    public ShowJudgementDetailResponse withResult(Consumer<JudgementResult> resultSetter) {
        if (this.result == null) {
            this.result = new JudgementResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public JudgementResult getResult() {
        return result;
    }

    public void setResult(JudgementResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJudgementDetailResponse showJudgementDetailResponse = (ShowJudgementDetailResponse) o;
        return Objects.equals(this.taskStatus, showJudgementDetailResponse.taskStatus)
            && Objects.equals(this.status, showJudgementDetailResponse.status)
            && Objects.equals(this.judgementId, showJudgementDetailResponse.judgementId)
            && Objects.equals(this.startTime, showJudgementDetailResponse.startTime)
            && Objects.equals(this.endTime, showJudgementDetailResponse.endTime)
            && Objects.equals(this.result, showJudgementDetailResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskStatus, status, judgementId, startTime, endTime, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJudgementDetailResponse {\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    judgementId: ").append(toIndentedString(judgementId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
