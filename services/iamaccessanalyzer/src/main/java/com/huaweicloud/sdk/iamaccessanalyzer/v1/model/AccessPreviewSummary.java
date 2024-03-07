package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AccessPreviewSummary
 */
public class AccessPreviewSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_preview_id")

    private String accessPreviewId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzer_id")

    private String analyzerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private AccessPreviewStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_reason")

    private PreviewStatusReason statusReason;

    public AccessPreviewSummary withAccessPreviewId(String accessPreviewId) {
        this.accessPreviewId = accessPreviewId;
        return this;
    }

    /**
     * 访问预览的唯一标识符。
     * @return accessPreviewId
     */
    public String getAccessPreviewId() {
        return accessPreviewId;
    }

    public void setAccessPreviewId(String accessPreviewId) {
        this.accessPreviewId = accessPreviewId;
    }

    public AccessPreviewSummary withAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
        return this;
    }

    /**
     * 分析器的唯一标识符。
     * @return analyzerId
     */
    public String getAnalyzerId() {
        return analyzerId;
    }

    public void setAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
    }

    public AccessPreviewSummary withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 访问预览创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public AccessPreviewSummary withStatus(AccessPreviewStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public AccessPreviewStatus getStatus() {
        return status;
    }

    public void setStatus(AccessPreviewStatus status) {
        this.status = status;
    }

    public AccessPreviewSummary withStatusReason(PreviewStatusReason statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    public AccessPreviewSummary withStatusReason(Consumer<PreviewStatusReason> statusReasonSetter) {
        if (this.statusReason == null) {
            this.statusReason = new PreviewStatusReason();
            statusReasonSetter.accept(this.statusReason);
        }

        return this;
    }

    /**
     * Get statusReason
     * @return statusReason
     */
    public PreviewStatusReason getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(PreviewStatusReason statusReason) {
        this.statusReason = statusReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessPreviewSummary that = (AccessPreviewSummary) obj;
        return Objects.equals(this.accessPreviewId, that.accessPreviewId)
            && Objects.equals(this.analyzerId, that.analyzerId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statusReason, that.statusReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPreviewId, analyzerId, createdAt, status, statusReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessPreviewSummary {\n");
        sb.append("    accessPreviewId: ").append(toIndentedString(accessPreviewId)).append("\n");
        sb.append("    analyzerId: ").append(toIndentedString(analyzerId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
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
