package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 日志转储信息 */
public class UpdateTransferRequestBodyLogTransferInfo {

    /** 日志转储格式。只支持\"RAW\", \"JSON\"。RAW是指原始日志格式，JSON是指JSON日志格式。OBS转储和DIS转储支持JSON和RAW，DMS转储仅支持RAW */
    public static final class LogStorageFormatEnum {

        /** Enum JSON for value: "JSON" */
        public static final LogStorageFormatEnum JSON = new LogStorageFormatEnum("JSON");

        /** Enum RAW for value: "RAW" */
        public static final LogStorageFormatEnum RAW = new LogStorageFormatEnum("RAW");

        private static final Map<String, LogStorageFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogStorageFormatEnum> createStaticFields() {
            Map<String, LogStorageFormatEnum> map = new HashMap<>();
            map.put("JSON", JSON);
            map.put("RAW", RAW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogStorageFormatEnum(String value) {
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
        public static LogStorageFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LogStorageFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LogStorageFormatEnum(value);
            }
            return result;
        }

        public static LogStorageFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LogStorageFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogStorageFormatEnum) {
                return this.value.equals(((LogStorageFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_storage_format")

    private LogStorageFormatEnum logStorageFormat;

    /** 日志转储状态，ENABLE是指日志转储开启状态，DISABLE是指日志转储关闭状态，EXCEPTION是指日志转储异常状态 */
    public static final class LogTransferStatusEnum {

        /** Enum ENABLE for value: "ENABLE" */
        public static final LogTransferStatusEnum ENABLE = new LogTransferStatusEnum("ENABLE");

        /** Enum DISABLE for value: "DISABLE" */
        public static final LogTransferStatusEnum DISABLE = new LogTransferStatusEnum("DISABLE");

        /** Enum EXCEPTION for value: "EXCEPTION" */
        public static final LogTransferStatusEnum EXCEPTION = new LogTransferStatusEnum("EXCEPTION");

        private static final Map<String, LogTransferStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogTransferStatusEnum> createStaticFields() {
            Map<String, LogTransferStatusEnum> map = new HashMap<>();
            map.put("ENABLE", ENABLE);
            map.put("DISABLE", DISABLE);
            map.put("EXCEPTION", EXCEPTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogTransferStatusEnum(String value) {
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
        public static LogTransferStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LogTransferStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LogTransferStatusEnum(value);
            }
            return result;
        }

        public static LogTransferStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LogTransferStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogTransferStatusEnum) {
                return this.value.equals(((LogTransferStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_status")

    private LogTransferStatusEnum logTransferStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_detail")

    private TransferDetail logTransferDetail;

    public UpdateTransferRequestBodyLogTransferInfo withLogStorageFormat(LogStorageFormatEnum logStorageFormat) {
        this.logStorageFormat = logStorageFormat;
        return this;
    }

    /** 日志转储格式。只支持\"RAW\", \"JSON\"。RAW是指原始日志格式，JSON是指JSON日志格式。OBS转储和DIS转储支持JSON和RAW，DMS转储仅支持RAW
     * 
     * @return logStorageFormat */
    public LogStorageFormatEnum getLogStorageFormat() {
        return logStorageFormat;
    }

    public void setLogStorageFormat(LogStorageFormatEnum logStorageFormat) {
        this.logStorageFormat = logStorageFormat;
    }

    public UpdateTransferRequestBodyLogTransferInfo withLogTransferStatus(LogTransferStatusEnum logTransferStatus) {
        this.logTransferStatus = logTransferStatus;
        return this;
    }

    /** 日志转储状态，ENABLE是指日志转储开启状态，DISABLE是指日志转储关闭状态，EXCEPTION是指日志转储异常状态
     * 
     * @return logTransferStatus */
    public LogTransferStatusEnum getLogTransferStatus() {
        return logTransferStatus;
    }

    public void setLogTransferStatus(LogTransferStatusEnum logTransferStatus) {
        this.logTransferStatus = logTransferStatus;
    }

    public UpdateTransferRequestBodyLogTransferInfo withLogTransferDetail(TransferDetail logTransferDetail) {
        this.logTransferDetail = logTransferDetail;
        return this;
    }

    public UpdateTransferRequestBodyLogTransferInfo withLogTransferDetail(
        Consumer<TransferDetail> logTransferDetailSetter) {
        if (this.logTransferDetail == null) {
            this.logTransferDetail = new TransferDetail();
            logTransferDetailSetter.accept(this.logTransferDetail);
        }

        return this;
    }

    /** 日志转储详细信息
     * 
     * @return logTransferDetail */
    public TransferDetail getLogTransferDetail() {
        return logTransferDetail;
    }

    public void setLogTransferDetail(TransferDetail logTransferDetail) {
        this.logTransferDetail = logTransferDetail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTransferRequestBodyLogTransferInfo updateTransferRequestBodyLogTransferInfo =
            (UpdateTransferRequestBodyLogTransferInfo) o;
        return Objects.equals(this.logStorageFormat, updateTransferRequestBodyLogTransferInfo.logStorageFormat)
            && Objects.equals(this.logTransferStatus, updateTransferRequestBodyLogTransferInfo.logTransferStatus)
            && Objects.equals(this.logTransferDetail, updateTransferRequestBodyLogTransferInfo.logTransferDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logStorageFormat, logTransferStatus, logTransferDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTransferRequestBodyLogTransferInfo {\n");
        sb.append("    logStorageFormat: ").append(toIndentedString(logStorageFormat)).append("\n");
        sb.append("    logTransferStatus: ").append(toIndentedString(logTransferStatus)).append("\n");
        sb.append("    logTransferDetail: ").append(toIndentedString(logTransferDetail)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
