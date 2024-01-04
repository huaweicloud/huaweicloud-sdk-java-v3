package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 管理员审核结果。
 */
public class AuditResultAdminAuditResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_name")

    private String attachmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_url")

    private String attachmentUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_time")

    private Long auditTime;

    public AuditResultAdminAuditResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 审核信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AuditResultAdminAuditResult withAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
        return this;
    }

    /**
     * 附件名称。
     * @return attachmentName
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public AuditResultAdminAuditResult withAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
        return this;
    }

    /**
     * 附件下载地址。
     * @return attachmentUrl
     */
    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public AuditResultAdminAuditResult withAuditTime(Long auditTime) {
        this.auditTime = auditTime;
        return this;
    }

    /**
     * 操作时间。
     * minimum: 0
     * maximum: 2147483647
     * @return auditTime
     */
    public Long getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Long auditTime) {
        this.auditTime = auditTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditResultAdminAuditResult that = (AuditResultAdminAuditResult) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.attachmentName, that.attachmentName)
            && Objects.equals(this.attachmentUrl, that.attachmentUrl) && Objects.equals(this.auditTime, that.auditTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, attachmentName, attachmentUrl, auditTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditResultAdminAuditResult {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    attachmentName: ").append(toIndentedString(attachmentName)).append("\n");
        sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
        sb.append("    auditTime: ").append(toIndentedString(auditTime)).append("\n");
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
