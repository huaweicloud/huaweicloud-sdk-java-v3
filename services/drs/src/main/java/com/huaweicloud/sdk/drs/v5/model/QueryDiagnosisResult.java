package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 一键诊断响应体。
 */
public class QueryDiagnosisResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_count")

    private Long normalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_count")

    private Long abnormalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_count")

    private Long alarmCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_count")

    private Long failureCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_count")

    private Long timeoutCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_results")

    private List<QueryDiagnosisResultDiagnosisResults> diagnosisResults = null;

    public QueryDiagnosisResult withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * 得分。
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public QueryDiagnosisResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QueryDiagnosisResult withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 进度。
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public QueryDiagnosisResult withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 失败原因。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public QueryDiagnosisResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public QueryDiagnosisResult withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public QueryDiagnosisResult withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 诊断项总数。
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public QueryDiagnosisResult withNormalCount(Long normalCount) {
        this.normalCount = normalCount;
        return this;
    }

    /**
     * 正常数量。
     * @return normalCount
     */
    public Long getNormalCount() {
        return normalCount;
    }

    public void setNormalCount(Long normalCount) {
        this.normalCount = normalCount;
    }

    public QueryDiagnosisResult withAbnormalCount(Long abnormalCount) {
        this.abnormalCount = abnormalCount;
        return this;
    }

    /**
     * 异常数量。
     * @return abnormalCount
     */
    public Long getAbnormalCount() {
        return abnormalCount;
    }

    public void setAbnormalCount(Long abnormalCount) {
        this.abnormalCount = abnormalCount;
    }

    public QueryDiagnosisResult withAlarmCount(Long alarmCount) {
        this.alarmCount = alarmCount;
        return this;
    }

    /**
     * 告警数量。
     * @return alarmCount
     */
    public Long getAlarmCount() {
        return alarmCount;
    }

    public void setAlarmCount(Long alarmCount) {
        this.alarmCount = alarmCount;
    }

    public QueryDiagnosisResult withFailureCount(Long failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    /**
     * 失败数量。
     * @return failureCount
     */
    public Long getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Long failureCount) {
        this.failureCount = failureCount;
    }

    public QueryDiagnosisResult withTimeoutCount(Long timeoutCount) {
        this.timeoutCount = timeoutCount;
        return this;
    }

    /**
     * 超时数量。
     * @return timeoutCount
     */
    public Long getTimeoutCount() {
        return timeoutCount;
    }

    public void setTimeoutCount(Long timeoutCount) {
        this.timeoutCount = timeoutCount;
    }

    public QueryDiagnosisResult withDiagnosisResults(List<QueryDiagnosisResultDiagnosisResults> diagnosisResults) {
        this.diagnosisResults = diagnosisResults;
        return this;
    }

    public QueryDiagnosisResult addDiagnosisResultsItem(QueryDiagnosisResultDiagnosisResults diagnosisResultsItem) {
        if (this.diagnosisResults == null) {
            this.diagnosisResults = new ArrayList<>();
        }
        this.diagnosisResults.add(diagnosisResultsItem);
        return this;
    }

    public QueryDiagnosisResult withDiagnosisResults(
        Consumer<List<QueryDiagnosisResultDiagnosisResults>> diagnosisResultsSetter) {
        if (this.diagnosisResults == null) {
            this.diagnosisResults = new ArrayList<>();
        }
        diagnosisResultsSetter.accept(this.diagnosisResults);
        return this;
    }

    /**
     * 诊断结果。
     * @return diagnosisResults
     */
    public List<QueryDiagnosisResultDiagnosisResults> getDiagnosisResults() {
        return diagnosisResults;
    }

    public void setDiagnosisResults(List<QueryDiagnosisResultDiagnosisResults> diagnosisResults) {
        this.diagnosisResults = diagnosisResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryDiagnosisResult that = (QueryDiagnosisResult) obj;
        return Objects.equals(this.score, that.score) && Objects.equals(this.status, that.status)
            && Objects.equals(this.progress, that.progress) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.total, that.total) && Objects.equals(this.normalCount, that.normalCount)
            && Objects.equals(this.abnormalCount, that.abnormalCount)
            && Objects.equals(this.alarmCount, that.alarmCount) && Objects.equals(this.failureCount, that.failureCount)
            && Objects.equals(this.timeoutCount, that.timeoutCount)
            && Objects.equals(this.diagnosisResults, that.diagnosisResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score,
            status,
            progress,
            errorMsg,
            startTime,
            endTime,
            total,
            normalCount,
            abnormalCount,
            alarmCount,
            failureCount,
            timeoutCount,
            diagnosisResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDiagnosisResult {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    normalCount: ").append(toIndentedString(normalCount)).append("\n");
        sb.append("    abnormalCount: ").append(toIndentedString(abnormalCount)).append("\n");
        sb.append("    alarmCount: ").append(toIndentedString(alarmCount)).append("\n");
        sb.append("    failureCount: ").append(toIndentedString(failureCount)).append("\n");
        sb.append("    timeoutCount: ").append(toIndentedString(timeoutCount)).append("\n");
        sb.append("    diagnosisResults: ").append(toIndentedString(diagnosisResults)).append("\n");
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
