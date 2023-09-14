package com.huaweicloud.sdk.codeartsinspector.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowReportStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * PDF报告生成状态:   * ungenerated - 未生成   * generating - 生成中   * generated - 已生成   * failed - 生成失败 
     */
    public static final class ReportStatusEnum {

        /**
         * Enum UNGENERATED for value: "ungenerated"
         */
        public static final ReportStatusEnum UNGENERATED = new ReportStatusEnum("ungenerated");

        /**
         * Enum GENERATING for value: "generating"
         */
        public static final ReportStatusEnum GENERATING = new ReportStatusEnum("generating");

        /**
         * Enum GENERATED for value: "generated"
         */
        public static final ReportStatusEnum GENERATED = new ReportStatusEnum("generated");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final ReportStatusEnum FAILED = new ReportStatusEnum("failed");

        private static final Map<String, ReportStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReportStatusEnum> createStaticFields() {
            Map<String, ReportStatusEnum> map = new HashMap<>();
            map.put("ungenerated", UNGENERATED);
            map.put("generating", GENERATING);
            map.put("generated", GENERATED);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReportStatusEnum(String value) {
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
        public static ReportStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReportStatusEnum(value));
        }

        public static ReportStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReportStatusEnum) {
                return this.value.equals(((ReportStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_status")

    private ReportStatusEnum reportStatus;

    public ShowReportStatusResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowReportStatusResponse withReportStatus(ReportStatusEnum reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }

    /**
     * PDF报告生成状态:   * ungenerated - 未生成   * generating - 生成中   * generated - 已生成   * failed - 生成失败 
     * @return reportStatus
     */
    public ReportStatusEnum getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(ReportStatusEnum reportStatus) {
        this.reportStatus = reportStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReportStatusResponse that = (ShowReportStatusResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.reportStatus, that.reportStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, reportStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportStatusResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
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
