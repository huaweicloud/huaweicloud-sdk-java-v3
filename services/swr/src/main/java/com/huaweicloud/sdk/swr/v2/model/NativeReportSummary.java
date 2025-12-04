package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云原生制品扫描报告摘要
 */
public class NativeReportSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    /**
     * 制品扫描状态，Pending(扫描等待中)、Running(扫描中)、Error(扫描失败)、Success(扫描成功)
     */
    public static final class ScanStatusEnum {

        /**
         * Enum SUCCESS for value: "Success"
         */
        public static final ScanStatusEnum SUCCESS = new ScanStatusEnum("Success");

        /**
         * Enum ERROR for value: "Error"
         */
        public static final ScanStatusEnum ERROR = new ScanStatusEnum("Error");

        /**
         * Enum RUNNING for value: "Running"
         */
        public static final ScanStatusEnum RUNNING = new ScanStatusEnum("Running");

        /**
         * Enum PENDING for value: "Pending"
         */
        public static final ScanStatusEnum PENDING = new ScanStatusEnum("Pending");

        private static final Map<String, ScanStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScanStatusEnum> createStaticFields() {
            Map<String, ScanStatusEnum> map = new HashMap<>();
            map.put("Success", SUCCESS);
            map.put("Error", ERROR);
            map.put("Running", RUNNING);
            map.put("Pending", PENDING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScanStatusEnum(String value) {
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
        public static ScanStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScanStatusEnum(value));
        }

        public static ScanStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScanStatusEnum) {
                return this.value.equals(((ScanStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private ScanStatusEnum scanStatus;

    /**
     * 制品扫描报告的总体严重程度，None(无评分), Low(低危), Medium(中危), High(高危), Critical(严重), Security(安全)
     */
    public static final class SeverityEnum {

        /**
         * Enum NONE for value: "None"
         */
        public static final SeverityEnum NONE = new SeverityEnum("None");

        /**
         * Enum LOW for value: "Low"
         */
        public static final SeverityEnum LOW = new SeverityEnum("Low");

        /**
         * Enum MEDIUM for value: "Medium"
         */
        public static final SeverityEnum MEDIUM = new SeverityEnum("Medium");

        /**
         * Enum HIGH for value: "High"
         */
        public static final SeverityEnum HIGH = new SeverityEnum("High");

        /**
         * Enum CRITICAL for value: "Critical"
         */
        public static final SeverityEnum CRITICAL = new SeverityEnum("Critical");

        /**
         * Enum SECURITY for value: "Security"
         */
        public static final SeverityEnum SECURITY = new SeverityEnum("Security");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("None", NONE);
            map.put("Low", LOW);
            map.put("Medium", MEDIUM);
            map.put("High", HIGH);
            map.put("Critical", CRITICAL);
            map.put("Security", SECURITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityEnum(value));
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnum) {
                return this.value.equals(((SeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SeverityEnum severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private VulnerabilitySummary summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_percent")

    private Integer completePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanner")

    private Scanner scanner;

    public NativeReportSummary withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * 报告ID
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public NativeReportSummary withScanStatus(ScanStatusEnum scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 制品扫描状态，Pending(扫描等待中)、Running(扫描中)、Error(扫描失败)、Success(扫描成功)
     * @return scanStatus
     */
    public ScanStatusEnum getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(ScanStatusEnum scanStatus) {
        this.scanStatus = scanStatus;
    }

    public NativeReportSummary withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 制品扫描报告的总体严重程度，None(无评分), Low(低危), Medium(中危), High(高危), Critical(严重), Security(安全)
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public NativeReportSummary withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 生成报告所花费的秒数时间
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public NativeReportSummary withSummary(VulnerabilitySummary summary) {
        this.summary = summary;
        return this;
    }

    public NativeReportSummary withSummary(Consumer<VulnerabilitySummary> summarySetter) {
        if (this.summary == null) {
            this.summary = new VulnerabilitySummary();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public VulnerabilitySummary getSummary() {
        return summary;
    }

    public void setSummary(VulnerabilitySummary summary) {
        this.summary = summary;
    }

    public NativeReportSummary withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 生成报告的扫描进程的开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public NativeReportSummary withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 生成报告的扫描进程的结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public NativeReportSummary withCompletePercent(Integer completePercent) {
        this.completePercent = completePercent;
        return this;
    }

    /**
     * 扫描的完成百分比，该值介于0和100之间
     * @return completePercent
     */
    public Integer getCompletePercent() {
        return completePercent;
    }

    public void setCompletePercent(Integer completePercent) {
        this.completePercent = completePercent;
    }

    public NativeReportSummary withScanner(Scanner scanner) {
        this.scanner = scanner;
        return this;
    }

    public NativeReportSummary withScanner(Consumer<Scanner> scannerSetter) {
        if (this.scanner == null) {
            this.scanner = new Scanner();
            scannerSetter.accept(this.scanner);
        }

        return this;
    }

    /**
     * Get scanner
     * @return scanner
     */
    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NativeReportSummary that = (NativeReportSummary) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.scanStatus, that.scanStatus)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.summary, that.summary) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.completePercent, that.completePercent)
            && Objects.equals(this.scanner, that.scanner);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(reportId, scanStatus, severity, duration, summary, startTime, endTime, completePercent, scanner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NativeReportSummary {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    completePercent: ").append(toIndentedString(completePercent)).append("\n");
        sb.append("    scanner: ").append(toIndentedString(scanner)).append("\n");
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
