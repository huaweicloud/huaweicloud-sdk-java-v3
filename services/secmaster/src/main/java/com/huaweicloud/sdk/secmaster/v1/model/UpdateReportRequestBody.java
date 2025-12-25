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
 * 报告更新请求体
 */
public class UpdateReportRequestBody {

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

    private UpdateReportRequestBodyReportRange reportRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_task")

    private String notificationTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_id")

    private String layoutId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_rule_infos")

    private List<ReportRuleRequest> reportRuleInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc")

    private String cc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_file_type")

    private String reportFileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private String frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_wizard")

    private String bindingWizard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    public UpdateReportRequestBody withStatus(StatusEnum status) {
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

    public UpdateReportRequestBody withReportName(String reportName) {
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

    public UpdateReportRequestBody withReportPeriod(ReportPeriodEnum reportPeriod) {
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

    public UpdateReportRequestBody withReportRange(UpdateReportRequestBodyReportRange reportRange) {
        this.reportRange = reportRange;
        return this;
    }

    public UpdateReportRequestBody withReportRange(Consumer<UpdateReportRequestBodyReportRange> reportRangeSetter) {
        if (this.reportRange == null) {
            this.reportRange = new UpdateReportRequestBodyReportRange();
            reportRangeSetter.accept(this.reportRange);
        }

        return this;
    }

    /**
     * Get reportRange
     * @return reportRange
     */
    public UpdateReportRequestBodyReportRange getReportRange() {
        return reportRange;
    }

    public void setReportRange(UpdateReportRequestBodyReportRange reportRange) {
        this.reportRange = reportRange;
    }

    public UpdateReportRequestBody withLanguage(String language) {
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

    public UpdateReportRequestBody withNotificationTask(String notificationTask) {
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

    public UpdateReportRequestBody withLayoutId(String layoutId) {
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

    public UpdateReportRequestBody withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * 报告Id
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public UpdateReportRequestBody withReportRuleInfos(List<ReportRuleRequest> reportRuleInfos) {
        this.reportRuleInfos = reportRuleInfos;
        return this;
    }

    public UpdateReportRequestBody addReportRuleInfosItem(ReportRuleRequest reportRuleInfosItem) {
        if (this.reportRuleInfos == null) {
            this.reportRuleInfos = new ArrayList<>();
        }
        this.reportRuleInfos.add(reportRuleInfosItem);
        return this;
    }

    public UpdateReportRequestBody withReportRuleInfos(Consumer<List<ReportRuleRequest>> reportRuleInfosSetter) {
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
    public List<ReportRuleRequest> getReportRuleInfos() {
        return reportRuleInfos;
    }

    public void setReportRuleInfos(List<ReportRuleRequest> reportRuleInfos) {
        this.reportRuleInfos = reportRuleInfos;
    }

    public UpdateReportRequestBody withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 邮件标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UpdateReportRequestBody withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 收件人
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public UpdateReportRequestBody withCc(String cc) {
        this.cc = cc;
        return this;
    }

    /**
     * 抄送人
     * @return cc
     */
    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public UpdateReportRequestBody withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 备注
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UpdateReportRequestBody withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 邮件内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public UpdateReportRequestBody withReportFileType(String reportFileType) {
        this.reportFileType = reportFileType;
        return this;
    }

    /**
     * 报告类型，支持图片、pdf、html
     * @return reportFileType
     */
    public String getReportFileType() {
        return reportFileType;
    }

    public void setReportFileType(String reportFileType) {
        this.reportFileType = reportFileType;
    }

    public UpdateReportRequestBody withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * 报告发送频率，daily，monthly，weekly
     * @return frequency
     */
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public UpdateReportRequestBody withBindingWizard(String bindingWizard) {
        this.bindingWizard = bindingWizard;
        return this;
    }

    /**
     * 报告页面内容
     * @return bindingWizard
     */
    public String getBindingWizard() {
        return bindingWizard;
    }

    public void setBindingWizard(String bindingWizard) {
        this.bindingWizard = bindingWizard;
    }

    public UpdateReportRequestBody withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 信息
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateReportRequestBody that = (UpdateReportRequestBody) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.reportPeriod, that.reportPeriod)
            && Objects.equals(this.reportRange, that.reportRange) && Objects.equals(this.language, that.language)
            && Objects.equals(this.notificationTask, that.notificationTask)
            && Objects.equals(this.layoutId, that.layoutId) && Objects.equals(this.reportId, that.reportId)
            && Objects.equals(this.reportRuleInfos, that.reportRuleInfos) && Objects.equals(this.title, that.title)
            && Objects.equals(this.to, that.to) && Objects.equals(this.cc, that.cc)
            && Objects.equals(this.subject, that.subject) && Objects.equals(this.content, that.content)
            && Objects.equals(this.reportFileType, that.reportFileType)
            && Objects.equals(this.frequency, that.frequency) && Objects.equals(this.bindingWizard, that.bindingWizard)
            && Objects.equals(this.timezone, that.timezone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            reportName,
            reportPeriod,
            reportRange,
            language,
            notificationTask,
            layoutId,
            reportId,
            reportRuleInfos,
            title,
            to,
            cc,
            subject,
            content,
            reportFileType,
            frequency,
            bindingWizard,
            timezone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateReportRequestBody {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    reportPeriod: ").append(toIndentedString(reportPeriod)).append("\n");
        sb.append("    reportRange: ").append(toIndentedString(reportRange)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    notificationTask: ").append(toIndentedString(notificationTask)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    reportRuleInfos: ").append(toIndentedString(reportRuleInfos)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    reportFileType: ").append(toIndentedString(reportFileType)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    bindingWizard: ").append(toIndentedString(bindingWizard)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
