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

/**
 * 日志转储信息
 */
public class CreateTransferResponseBodyLogTransferInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_agency_transfer")

    private CreateTransferResponseBodyLogTransferInfoLogAgencyTransfer logAgencyTransfer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_create_time")

    private Long logCreateTime;

    /**
     * 日志转储格式。只支持\"RAW\", \"JSON\"。RAW是指原始日志格式，JSON是指JSON日志格式。OBS转储和DIS转储支持JSON和RAW，DMS转储仅支持RAW
     */
    public static final class LogStorageFormatEnum {

        /**
         * Enum JSON for value: "JSON"
         */
        public static final LogStorageFormatEnum JSON = new LogStorageFormatEnum("JSON");

        /**
         * Enum RAW for value: "RAW"
         */
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_detail")

    private TransferDetail logTransferDetail;

    /**
     * 日志转储方式。cycle是指周期性转储，realTime是指实时转储。OBS转储只支持\"cycle\"，DIS转储和DMS转储只支持\"realTime\"。
     */
    public static final class LogTransferModeEnum {

        /**
         * Enum CYCLE for value: "cycle"
         */
        public static final LogTransferModeEnum CYCLE = new LogTransferModeEnum("cycle");

        /**
         * Enum REALTIME for value: "realTime"
         */
        public static final LogTransferModeEnum REALTIME = new LogTransferModeEnum("realTime");

        private static final Map<String, LogTransferModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogTransferModeEnum> createStaticFields() {
            Map<String, LogTransferModeEnum> map = new HashMap<>();
            map.put("cycle", CYCLE);
            map.put("realTime", REALTIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogTransferModeEnum(String value) {
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
        public static LogTransferModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LogTransferModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LogTransferModeEnum(value);
            }
            return result;
        }

        public static LogTransferModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LogTransferModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogTransferModeEnum) {
                return this.value.equals(((LogTransferModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_mode")

    private LogTransferModeEnum logTransferMode;

    /**
     * 日志转储状态，ENABLE是指日志转储开启状态，DISABLE是指日志转储关闭状态，EXCEPTION是指日志转储异常状态
     */
    public static final class LogTransferStatusEnum {

        /**
         * Enum ENABLE for value: "ENABLE"
         */
        public static final LogTransferStatusEnum ENABLE = new LogTransferStatusEnum("ENABLE");

        /**
         * Enum DISABLE for value: "DISABLE"
         */
        public static final LogTransferStatusEnum DISABLE = new LogTransferStatusEnum("DISABLE");

        /**
         * Enum EXCEPTION for value: "EXCEPTION"
         */
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

    /**
     * 日志转储类型。OBS指OBS日志转储，DIS指DIS日志转储，DMS指DMS日志转储
     */
    public static final class LogTransferTypeEnum {

        /**
         * Enum OBS for value: "OBS"
         */
        public static final LogTransferTypeEnum OBS = new LogTransferTypeEnum("OBS");

        /**
         * Enum DIS for value: "DIS"
         */
        public static final LogTransferTypeEnum DIS = new LogTransferTypeEnum("DIS");

        /**
         * Enum DMS for value: "DMS"
         */
        public static final LogTransferTypeEnum DMS = new LogTransferTypeEnum("DMS");

        private static final Map<String, LogTransferTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogTransferTypeEnum> createStaticFields() {
            Map<String, LogTransferTypeEnum> map = new HashMap<>();
            map.put("OBS", OBS);
            map.put("DIS", DIS);
            map.put("DMS", DMS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogTransferTypeEnum(String value) {
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
        public static LogTransferTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LogTransferTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LogTransferTypeEnum(value);
            }
            return result;
        }

        public static LogTransferTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LogTransferTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogTransferTypeEnum) {
                return this.value.equals(((LogTransferTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_transfer_type")

    private LogTransferTypeEnum logTransferType;

    public CreateTransferResponseBodyLogTransferInfo withLogAgencyTransfer(
        CreateTransferResponseBodyLogTransferInfoLogAgencyTransfer logAgencyTransfer) {
        this.logAgencyTransfer = logAgencyTransfer;
        return this;
    }

    public CreateTransferResponseBodyLogTransferInfo withLogAgencyTransfer(
        Consumer<CreateTransferResponseBodyLogTransferInfoLogAgencyTransfer> logAgencyTransferSetter) {
        if (this.logAgencyTransfer == null) {
            this.logAgencyTransfer = new CreateTransferResponseBodyLogTransferInfoLogAgencyTransfer();
            logAgencyTransferSetter.accept(this.logAgencyTransfer);
        }

        return this;
    }

    /**
     * Get logAgencyTransfer
     * @return logAgencyTransfer
     */
    public CreateTransferResponseBodyLogTransferInfoLogAgencyTransfer getLogAgencyTransfer() {
        return logAgencyTransfer;
    }

    public void setLogAgencyTransfer(CreateTransferResponseBodyLogTransferInfoLogAgencyTransfer logAgencyTransfer) {
        this.logAgencyTransfer = logAgencyTransfer;
    }

    public CreateTransferResponseBodyLogTransferInfo withLogCreateTime(Long logCreateTime) {
        this.logCreateTime = logCreateTime;
        return this;
    }

    /**
     * 日志转储创建时间
     * minimum: 0
     * maximum: 9999999999999
     * @return logCreateTime
     */
    public Long getLogCreateTime() {
        return logCreateTime;
    }

    public void setLogCreateTime(Long logCreateTime) {
        this.logCreateTime = logCreateTime;
    }

    public CreateTransferResponseBodyLogTransferInfo withLogStorageFormat(LogStorageFormatEnum logStorageFormat) {
        this.logStorageFormat = logStorageFormat;
        return this;
    }

    /**
     * 日志转储格式。只支持\"RAW\", \"JSON\"。RAW是指原始日志格式，JSON是指JSON日志格式。OBS转储和DIS转储支持JSON和RAW，DMS转储仅支持RAW
     * @return logStorageFormat
     */
    public LogStorageFormatEnum getLogStorageFormat() {
        return logStorageFormat;
    }

    public void setLogStorageFormat(LogStorageFormatEnum logStorageFormat) {
        this.logStorageFormat = logStorageFormat;
    }

    public CreateTransferResponseBodyLogTransferInfo withLogTransferDetail(TransferDetail logTransferDetail) {
        this.logTransferDetail = logTransferDetail;
        return this;
    }

    public CreateTransferResponseBodyLogTransferInfo withLogTransferDetail(
        Consumer<TransferDetail> logTransferDetailSetter) {
        if (this.logTransferDetail == null) {
            this.logTransferDetail = new TransferDetail();
            logTransferDetailSetter.accept(this.logTransferDetail);
        }

        return this;
    }

    /**
     * 日志转储详细信息
     * @return logTransferDetail
     */
    public TransferDetail getLogTransferDetail() {
        return logTransferDetail;
    }

    public void setLogTransferDetail(TransferDetail logTransferDetail) {
        this.logTransferDetail = logTransferDetail;
    }

    public CreateTransferResponseBodyLogTransferInfo withLogTransferMode(LogTransferModeEnum logTransferMode) {
        this.logTransferMode = logTransferMode;
        return this;
    }

    /**
     * 日志转储方式。cycle是指周期性转储，realTime是指实时转储。OBS转储只支持\"cycle\"，DIS转储和DMS转储只支持\"realTime\"。
     * @return logTransferMode
     */
    public LogTransferModeEnum getLogTransferMode() {
        return logTransferMode;
    }

    public void setLogTransferMode(LogTransferModeEnum logTransferMode) {
        this.logTransferMode = logTransferMode;
    }

    public CreateTransferResponseBodyLogTransferInfo withLogTransferStatus(LogTransferStatusEnum logTransferStatus) {
        this.logTransferStatus = logTransferStatus;
        return this;
    }

    /**
     * 日志转储状态，ENABLE是指日志转储开启状态，DISABLE是指日志转储关闭状态，EXCEPTION是指日志转储异常状态
     * @return logTransferStatus
     */
    public LogTransferStatusEnum getLogTransferStatus() {
        return logTransferStatus;
    }

    public void setLogTransferStatus(LogTransferStatusEnum logTransferStatus) {
        this.logTransferStatus = logTransferStatus;
    }

    public CreateTransferResponseBodyLogTransferInfo withLogTransferType(LogTransferTypeEnum logTransferType) {
        this.logTransferType = logTransferType;
        return this;
    }

    /**
     * 日志转储类型。OBS指OBS日志转储，DIS指DIS日志转储，DMS指DMS日志转储
     * @return logTransferType
     */
    public LogTransferTypeEnum getLogTransferType() {
        return logTransferType;
    }

    public void setLogTransferType(LogTransferTypeEnum logTransferType) {
        this.logTransferType = logTransferType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTransferResponseBodyLogTransferInfo createTransferResponseBodyLogTransferInfo =
            (CreateTransferResponseBodyLogTransferInfo) o;
        return Objects.equals(this.logAgencyTransfer, createTransferResponseBodyLogTransferInfo.logAgencyTransfer)
            && Objects.equals(this.logCreateTime, createTransferResponseBodyLogTransferInfo.logCreateTime)
            && Objects.equals(this.logStorageFormat, createTransferResponseBodyLogTransferInfo.logStorageFormat)
            && Objects.equals(this.logTransferDetail, createTransferResponseBodyLogTransferInfo.logTransferDetail)
            && Objects.equals(this.logTransferMode, createTransferResponseBodyLogTransferInfo.logTransferMode)
            && Objects.equals(this.logTransferStatus, createTransferResponseBodyLogTransferInfo.logTransferStatus)
            && Objects.equals(this.logTransferType, createTransferResponseBodyLogTransferInfo.logTransferType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logAgencyTransfer,
            logCreateTime,
            logStorageFormat,
            logTransferDetail,
            logTransferMode,
            logTransferStatus,
            logTransferType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTransferResponseBodyLogTransferInfo {\n");
        sb.append("    logAgencyTransfer: ").append(toIndentedString(logAgencyTransfer)).append("\n");
        sb.append("    logCreateTime: ").append(toIndentedString(logCreateTime)).append("\n");
        sb.append("    logStorageFormat: ").append(toIndentedString(logStorageFormat)).append("\n");
        sb.append("    logTransferDetail: ").append(toIndentedString(logTransferDetail)).append("\n");
        sb.append("    logTransferMode: ").append(toIndentedString(logTransferMode)).append("\n");
        sb.append("    logTransferStatus: ").append(toIndentedString(logTransferStatus)).append("\n");
        sb.append("    logTransferType: ").append(toIndentedString(logTransferType)).append("\n");
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
