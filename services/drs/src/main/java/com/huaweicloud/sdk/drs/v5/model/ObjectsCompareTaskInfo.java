package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 对象级对比任务信息体。
 */
public class ObjectsCompareTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_results")

    private List<ObjectsCompareOverviewInfo> compareResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    /**
     * 对比任务状态。取值： - RUNNING：运行中。 - WAITING_FOR_RUNNING：等待启动中。 - SUCCESSFUL：完成。 - FAILED：失败。 - CANCELLED：已取消。
     */
    public static final class StatusEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum WAITING_FOR_RUNNING for value: "WAITING_FOR_RUNNING"
         */
        public static final StatusEnum WAITING_FOR_RUNNING = new StatusEnum("WAITING_FOR_RUNNING");

        /**
         * Enum SUCCESSFUL for value: "SUCCESSFUL"
         */
        public static final StatusEnum SUCCESSFUL = new StatusEnum("SUCCESSFUL");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum CANCELLED for value: "CANCELLED"
         */
        public static final StatusEnum CANCELLED = new StatusEnum("CANCELLED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("WAITING_FOR_RUNNING", WAITING_FOR_RUNNING);
            map.put("SUCCESSFUL", SUCCESSFUL);
            map.put("FAILED", FAILED);
            map.put("CANCELLED", CANCELLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_status")

    private String exportStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_remain_seconds")

    private Long reportRemainSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_job_id")

    private String compareJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ObjectsCompareTaskInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 对比任务创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ObjectsCompareTaskInfo withCompareResults(List<ObjectsCompareOverviewInfo> compareResults) {
        this.compareResults = compareResults;
        return this;
    }

    public ObjectsCompareTaskInfo addCompareResultsItem(ObjectsCompareOverviewInfo compareResultsItem) {
        if (this.compareResults == null) {
            this.compareResults = new ArrayList<>();
        }
        this.compareResults.add(compareResultsItem);
        return this;
    }

    public ObjectsCompareTaskInfo withCompareResults(Consumer<List<ObjectsCompareOverviewInfo>> compareResultsSetter) {
        if (this.compareResults == null) {
            this.compareResults = new ArrayList<>();
        }
        compareResultsSetter.accept(this.compareResults);
        return this;
    }

    /**
     * 对比结果。
     * @return compareResults
     */
    public List<ObjectsCompareOverviewInfo> getCompareResults() {
        return compareResults;
    }

    public void setCompareResults(List<ObjectsCompareOverviewInfo> compareResults) {
        this.compareResults = compareResults;
    }

    public ObjectsCompareTaskInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 对比任务开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ObjectsCompareTaskInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 对比任务状态。取值： - RUNNING：运行中。 - WAITING_FOR_RUNNING：等待启动中。 - SUCCESSFUL：完成。 - FAILED：失败。 - CANCELLED：已取消。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ObjectsCompareTaskInfo withExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }

    /**
     * 导出比对结果状态。
     * @return exportStatus
     */
    public String getExportStatus() {
        return exportStatus;
    }

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    public ObjectsCompareTaskInfo withReportRemainSeconds(Long reportRemainSeconds) {
        this.reportRemainSeconds = reportRemainSeconds;
        return this;
    }

    /**
     * 导出比对结果有效期剩余时间。
     * @return reportRemainSeconds
     */
    public Long getReportRemainSeconds() {
        return reportRemainSeconds;
    }

    public void setReportRemainSeconds(Long reportRemainSeconds) {
        this.reportRemainSeconds = reportRemainSeconds;
    }

    public ObjectsCompareTaskInfo withCompareJobId(String compareJobId) {
        this.compareJobId = compareJobId;
        return this;
    }

    /**
     * 对比任务ID。
     * @return compareJobId
     */
    public String getCompareJobId() {
        return compareJobId;
    }

    public void setCompareJobId(String compareJobId) {
        this.compareJobId = compareJobId;
    }

    public ObjectsCompareTaskInfo withErrorMsg(String errorMsg) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectsCompareTaskInfo that = (ObjectsCompareTaskInfo) obj;
        return Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.compareResults, that.compareResults)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.exportStatus, that.exportStatus)
            && Objects.equals(this.reportRemainSeconds, that.reportRemainSeconds)
            && Objects.equals(this.compareJobId, that.compareJobId) && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            compareResults,
            startTime,
            status,
            exportStatus,
            reportRemainSeconds,
            compareJobId,
            errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectsCompareTaskInfo {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    compareResults: ").append(toIndentedString(compareResults)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    exportStatus: ").append(toIndentedString(exportStatus)).append("\n");
        sb.append("    reportRemainSeconds: ").append(toIndentedString(reportRemainSeconds)).append("\n");
        sb.append("    compareJobId: ").append(toIndentedString(compareJobId)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
