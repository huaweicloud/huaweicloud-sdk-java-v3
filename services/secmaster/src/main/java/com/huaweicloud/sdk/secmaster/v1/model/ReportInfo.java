package com.huaweicloud.sdk.secmaster.v1.model;

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
 * 报告详情
 */
public class ReportInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_name")

    private String reportName;

    /**
     * 报告周期 weekly, daily, annual, monthly
     */
    public static final class ReportPeriodEnum {

        /**
         * Enum WEEKLY for value: "weekly"
         */
        public static final ReportPeriodEnum WEEKLY = new ReportPeriodEnum("weekly");

        /**
         * Enum DAILY for value: "daily"
         */
        public static final ReportPeriodEnum DAILY = new ReportPeriodEnum("daily");

        /**
         * Enum ANNUAL for value: "annual"
         */
        public static final ReportPeriodEnum ANNUAL = new ReportPeriodEnum("annual");

        /**
         * Enum MONTHLY for value: "monthly"
         */
        public static final ReportPeriodEnum MONTHLY = new ReportPeriodEnum("monthly");

        private static final Map<String, ReportPeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReportPeriodEnum> createStaticFields() {
            Map<String, ReportPeriodEnum> map = new HashMap<>();
            map.put("weekly", WEEKLY);
            map.put("daily", DAILY);
            map.put("annual", ANNUAL);
            map.put("monthly", MONTHLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReportPeriodEnum(String value) {
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
        public static ReportPeriodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReportPeriodEnum(value));
        }

        public static ReportPeriodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReportPeriodEnum) {
                return this.value.equals(((ReportPeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_period")

    private ReportPeriodEnum reportPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_range")

    private CreateReportRequestBodyReportRange reportRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_task")

    private String notificationTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_id")

    private String layoutId;

    /**
     * 报告状态 enable, disable
     */
    public static final class StatusEnum {

        /**
         * Enum ENABLE for value: "enable"
         */
        public static final StatusEnum ENABLE = new StatusEnum("enable");

        /**
         * Enum DISABLE for value: "disable"
         */
        public static final StatusEnum DISABLE = new StatusEnum("disable");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("enable", ENABLE);
            map.put("disable", DISABLE);
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
    @JsonProperty(value = "is_generated")

    private Boolean isGenerated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_rule_infos")

    private List<ReportRuleInfo> reportRuleInfos = null;

    public ReportInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 报告id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReportInfo withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * 报告名称
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public ReportInfo withReportPeriod(ReportPeriodEnum reportPeriod) {
        this.reportPeriod = reportPeriod;
        return this;
    }

    /**
     * 报告周期 weekly, daily, annual, monthly
     * @return reportPeriod
     */
    public ReportPeriodEnum getReportPeriod() {
        return reportPeriod;
    }

    public void setReportPeriod(ReportPeriodEnum reportPeriod) {
        this.reportPeriod = reportPeriod;
    }

    public ReportInfo withReportRange(CreateReportRequestBodyReportRange reportRange) {
        this.reportRange = reportRange;
        return this;
    }

    public ReportInfo withReportRange(Consumer<CreateReportRequestBodyReportRange> reportRangeSetter) {
        if (this.reportRange == null) {
            this.reportRange = new CreateReportRequestBodyReportRange();
            reportRangeSetter.accept(this.reportRange);
        }

        return this;
    }

    /**
     * Get reportRange
     * @return reportRange
     */
    public CreateReportRequestBodyReportRange getReportRange() {
        return reportRange;
    }

    public void setReportRange(CreateReportRequestBodyReportRange reportRange) {
        this.reportRange = reportRange;
    }

    public ReportInfo withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ReportInfo withNotificationTask(String notificationTask) {
        this.notificationTask = notificationTask;
        return this;
    }

    /**
     * 通知任务id
     * @return notificationTask
     */
    public String getNotificationTask() {
        return notificationTask;
    }

    public void setNotificationTask(String notificationTask) {
        this.notificationTask = notificationTask;
    }

    public ReportInfo withLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    /**
     * 布局id
     * @return layoutId
     */
    public String getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    public ReportInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 报告状态 enable, disable
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ReportInfo withIsGenerated(Boolean isGenerated) {
        this.isGenerated = isGenerated;
        return this;
    }

    /**
     * 报告是否已生成
     * @return isGenerated
     */
    public Boolean getIsGenerated() {
        return isGenerated;
    }

    public void setIsGenerated(Boolean isGenerated) {
        this.isGenerated = isGenerated;
    }

    public ReportInfo withReportRuleInfos(List<ReportRuleInfo> reportRuleInfos) {
        this.reportRuleInfos = reportRuleInfos;
        return this;
    }

    public ReportInfo addReportRuleInfosItem(ReportRuleInfo reportRuleInfosItem) {
        if (this.reportRuleInfos == null) {
            this.reportRuleInfos = new ArrayList<>();
        }
        this.reportRuleInfos.add(reportRuleInfosItem);
        return this;
    }

    public ReportInfo withReportRuleInfos(Consumer<List<ReportRuleInfo>> reportRuleInfosSetter) {
        if (this.reportRuleInfos == null) {
            this.reportRuleInfos = new ArrayList<>();
        }
        reportRuleInfosSetter.accept(this.reportRuleInfos);
        return this;
    }

    /**
     * 报告发送规则
     * @return reportRuleInfos
     */
    public List<ReportRuleInfo> getReportRuleInfos() {
        return reportRuleInfos;
    }

    public void setReportRuleInfos(List<ReportRuleInfo> reportRuleInfos) {
        this.reportRuleInfos = reportRuleInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportInfo that = (ReportInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.reportPeriod, that.reportPeriod)
            && Objects.equals(this.reportRange, that.reportRange) && Objects.equals(this.language, that.language)
            && Objects.equals(this.notificationTask, that.notificationTask)
            && Objects.equals(this.layoutId, that.layoutId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.isGenerated, that.isGenerated)
            && Objects.equals(this.reportRuleInfos, that.reportRuleInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            reportName,
            reportPeriod,
            reportRange,
            language,
            notificationTask,
            layoutId,
            status,
            isGenerated,
            reportRuleInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    reportPeriod: ").append(toIndentedString(reportPeriod)).append("\n");
        sb.append("    reportRange: ").append(toIndentedString(reportRange)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    notificationTask: ").append(toIndentedString(notificationTask)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isGenerated: ").append(toIndentedString(isGenerated)).append("\n");
        sb.append("    reportRuleInfos: ").append(toIndentedString(reportRuleInfos)).append("\n");
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
