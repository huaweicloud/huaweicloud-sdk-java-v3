package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ExportServerLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_id")

    private String exportId;

    /**
     * 导出进度
     */
    public static final class StatusEnum {

        /**
         * Enum PROCESSING for value: "processing"
         */
        public static final StatusEnum PROCESSING = new StatusEnum("processing");

        /**
         * Enum COMPLETED for value: "completed"
         */
        public static final StatusEnum COMPLETED = new StatusEnum("completed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("processing", PROCESSING);
            map.put("completed", COMPLETED);
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
    @JsonProperty(value = "percentage")

    private String percentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Disposition")

    private String contentDisposition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Transfer-Encoding")

    private String contentTransferEncoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Type")

    private String contentType;

    public ExportServerLogsResponse withExportId(String exportId) {
        this.exportId = exportId;
        return this;
    }

    /**
     * export task id
     * @return exportId
     */
    public String getExportId() {
        return exportId;
    }

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    public ExportServerLogsResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 导出进度
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ExportServerLogsResponse withPercentage(String percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * 导出进度百分比，范围0-100，如\"10%\"
     * @return percentage
     */
    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public ExportServerLogsResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 导出开始时间，时间戳格式为ISO 8601，例如：2025-03-20T02:48:06+00:00
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ExportServerLogsResponse withContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get contentDisposition
     * @return contentDisposition
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    public ExportServerLogsResponse withContentTransferEncoding(String contentTransferEncoding) {
        this.contentTransferEncoding = contentTransferEncoding;
        return this;
    }

    /**
     * Get contentTransferEncoding
     * @return contentTransferEncoding
     */
    public String getContentTransferEncoding() {
        return contentTransferEncoding;
    }

    public void setContentTransferEncoding(String contentTransferEncoding) {
        this.contentTransferEncoding = contentTransferEncoding;
    }

    public ExportServerLogsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get contentType
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportServerLogsResponse that = (ExportServerLogsResponse) obj;
        return Objects.equals(this.exportId, that.exportId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.percentage, that.percentage) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.contentDisposition, that.contentDisposition)
            && Objects.equals(this.contentTransferEncoding, that.contentTransferEncoding)
            && Objects.equals(this.contentType, that.contentType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(exportId, status, percentage, createdAt, contentDisposition, contentTransferEncoding, contentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportServerLogsResponse {\n");
        sb.append("    exportId: ").append(toIndentedString(exportId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
        sb.append("    contentTransferEncoding: ").append(toIndentedString(contentTransferEncoding)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
