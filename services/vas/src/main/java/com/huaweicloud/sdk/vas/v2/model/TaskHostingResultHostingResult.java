package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * hosting结果文件的相关信息
 */
public class TaskHostingResultHostingResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overdue_date")

    private OffsetDateTime overdueDate;

    /**
     * 结果文件result.json的状态
     */
    public static final class StatusEnum {

        /**
         * Enum NOT_GENERATED for value: "NOT_GENERATED"
         */
        public static final StatusEnum NOT_GENERATED = new StatusEnum("NOT_GENERATED");

        /**
         * Enum AVAILABLE for value: "AVAILABLE"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("AVAILABLE");

        /**
         * Enum EXCEED_IN_SIZE for value: "EXCEED_IN_SIZE"
         */
        public static final StatusEnum EXCEED_IN_SIZE = new StatusEnum("EXCEED_IN_SIZE");

        /**
         * Enum OVERDUE for value: "OVERDUE"
         */
        public static final StatusEnum OVERDUE = new StatusEnum("OVERDUE");

        /**
         * Enum DELETED_MISTAKENLY for value: "DELETED_MISTAKENLY"
         */
        public static final StatusEnum DELETED_MISTAKENLY = new StatusEnum("DELETED_MISTAKENLY");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("NOT_GENERATED", NOT_GENERATED);
            map.put("AVAILABLE", AVAILABLE);
            map.put("EXCEED_IN_SIZE", EXCEED_IN_SIZE);
            map.put("OVERDUE", OVERDUE);
            map.put("DELETED_MISTAKENLY", DELETED_MISTAKENLY);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private String fileSize;

    public TaskHostingResultHostingResult withOverdueDate(OffsetDateTime overdueDate) {
        this.overdueDate = overdueDate;
        return this;
    }

    /**
     * 结果文件result.json的过期时间
     * @return overdueDate
     */
    public OffsetDateTime getOverdueDate() {
        return overdueDate;
    }

    public void setOverdueDate(OffsetDateTime overdueDate) {
        this.overdueDate = overdueDate;
    }

    public TaskHostingResultHostingResult withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 结果文件result.json的状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public TaskHostingResultHostingResult withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 结果文件result.json的具体内容
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TaskHostingResultHostingResult withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 结果文件result.json的大小
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskHostingResultHostingResult taskHostingResultHostingResult = (TaskHostingResultHostingResult) o;
        return Objects.equals(this.overdueDate, taskHostingResultHostingResult.overdueDate)
            && Objects.equals(this.status, taskHostingResultHostingResult.status)
            && Objects.equals(this.data, taskHostingResultHostingResult.data)
            && Objects.equals(this.fileSize, taskHostingResultHostingResult.fileSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overdueDate, status, data, fileSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskHostingResultHostingResult {\n");
        sb.append("    overdueDate: ").append(toIndentedString(overdueDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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
