package com.huaweicloud.sdk.secmaster.v1.model;

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
 * 下载安全报告的请求
 */
public class ExecuteReportActionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_content")

    private String reportContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_title")

    private String emailTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_to")

    private String emailTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_cc")

    private String emailCc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_content")

    private String emailContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_file_type")

    private String reportFileType;

    /**
     * API的动作支持send和download
     */
    public static final class ActionEnum {

        /**
         * Enum SEND for value: "send"
         */
        public static final ActionEnum SEND = new ActionEnum("send");

        /**
         * Enum DOWNLOAD for value: "download"
         */
        public static final ActionEnum DOWNLOAD = new ActionEnum("download");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("send", SEND);
            map.put("download", DOWNLOAD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_page")

    private String reportPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_config")

    private PageConfigPx pageConfig;

    public ExecuteReportActionInfo withReportContent(String reportContent) {
        this.reportContent = reportContent;
        return this;
    }

    /**
     * 报告的base64编码
     * @return reportContent
     */
    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public ExecuteReportActionInfo withEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
        return this;
    }

    /**
     * 邮件标题
     * @return emailTitle
     */
    public String getEmailTitle() {
        return emailTitle;
    }

    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
    }

    public ExecuteReportActionInfo withEmailTo(String emailTo) {
        this.emailTo = emailTo;
        return this;
    }

    /**
     * 收件人邮箱
     * @return emailTo
     */
    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public ExecuteReportActionInfo withEmailCc(String emailCc) {
        this.emailCc = emailCc;
        return this;
    }

    /**
     * 抄送人邮箱
     * @return emailCc
     */
    public String getEmailCc() {
        return emailCc;
    }

    public void setEmailCc(String emailCc) {
        this.emailCc = emailCc;
    }

    public ExecuteReportActionInfo withEmailContent(String emailContent) {
        this.emailContent = emailContent;
        return this;
    }

    /**
     * 邮件内容
     * @return emailContent
     */
    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public ExecuteReportActionInfo withReportFileType(String reportFileType) {
        this.reportFileType = reportFileType;
        return this;
    }

    /**
     * 附件类型
     * @return reportFileType
     */
    public String getReportFileType() {
        return reportFileType;
    }

    public void setReportFileType(String reportFileType) {
        this.reportFileType = reportFileType;
    }

    public ExecuteReportActionInfo withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * API的动作支持send和download
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ExecuteReportActionInfo withReportPage(String reportPage) {
        this.reportPage = reportPage;
        return this;
    }

    /**
     * 安全报告Base64编码的内容
     * @return reportPage
     */
    public String getReportPage() {
        return reportPage;
    }

    public void setReportPage(String reportPage) {
        this.reportPage = reportPage;
    }

    public ExecuteReportActionInfo withPageConfig(PageConfigPx pageConfig) {
        this.pageConfig = pageConfig;
        return this;
    }

    public ExecuteReportActionInfo withPageConfig(Consumer<PageConfigPx> pageConfigSetter) {
        if (this.pageConfig == null) {
            this.pageConfig = new PageConfigPx();
            pageConfigSetter.accept(this.pageConfig);
        }

        return this;
    }

    /**
     * Get pageConfig
     * @return pageConfig
     */
    public PageConfigPx getPageConfig() {
        return pageConfig;
    }

    public void setPageConfig(PageConfigPx pageConfig) {
        this.pageConfig = pageConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteReportActionInfo that = (ExecuteReportActionInfo) obj;
        return Objects.equals(this.reportContent, that.reportContent)
            && Objects.equals(this.emailTitle, that.emailTitle) && Objects.equals(this.emailTo, that.emailTo)
            && Objects.equals(this.emailCc, that.emailCc) && Objects.equals(this.emailContent, that.emailContent)
            && Objects.equals(this.reportFileType, that.reportFileType) && Objects.equals(this.action, that.action)
            && Objects.equals(this.reportPage, that.reportPage) && Objects.equals(this.pageConfig, that.pageConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportContent,
            emailTitle,
            emailTo,
            emailCc,
            emailContent,
            reportFileType,
            action,
            reportPage,
            pageConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteReportActionInfo {\n");
        sb.append("    reportContent: ").append(toIndentedString(reportContent)).append("\n");
        sb.append("    emailTitle: ").append(toIndentedString(emailTitle)).append("\n");
        sb.append("    emailTo: ").append(toIndentedString(emailTo)).append("\n");
        sb.append("    emailCc: ").append(toIndentedString(emailCc)).append("\n");
        sb.append("    emailContent: ").append(toIndentedString(emailContent)).append("\n");
        sb.append("    reportFileType: ").append(toIndentedString(reportFileType)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    reportPage: ").append(toIndentedString(reportPage)).append("\n");
        sb.append("    pageConfig: ").append(toIndentedString(pageConfig)).append("\n");
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
