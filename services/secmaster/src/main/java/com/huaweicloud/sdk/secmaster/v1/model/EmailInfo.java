package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 邮件信息
 */
public class EmailInfo {

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

    public EmailInfo withReportContent(String reportContent) {
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

    public EmailInfo withEmailTitle(String emailTitle) {
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

    public EmailInfo withEmailTo(String emailTo) {
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

    public EmailInfo withEmailCc(String emailCc) {
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

    public EmailInfo withEmailContent(String emailContent) {
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

    public EmailInfo withReportFileType(String reportFileType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailInfo that = (EmailInfo) obj;
        return Objects.equals(this.reportContent, that.reportContent)
            && Objects.equals(this.emailTitle, that.emailTitle) && Objects.equals(this.emailTo, that.emailTo)
            && Objects.equals(this.emailCc, that.emailCc) && Objects.equals(this.emailContent, that.emailContent)
            && Objects.equals(this.reportFileType, that.reportFileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportContent, emailTitle, emailTo, emailCc, emailContent, reportFileType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmailInfo {\n");
        sb.append("    reportContent: ").append(toIndentedString(reportContent)).append("\n");
        sb.append("    emailTitle: ").append(toIndentedString(emailTitle)).append("\n");
        sb.append("    emailTo: ").append(toIndentedString(emailTo)).append("\n");
        sb.append("    emailCc: ").append(toIndentedString(emailCc)).append("\n");
        sb.append("    emailContent: ").append(toIndentedString(emailContent)).append("\n");
        sb.append("    reportFileType: ").append(toIndentedString(reportFileType)).append("\n");
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
