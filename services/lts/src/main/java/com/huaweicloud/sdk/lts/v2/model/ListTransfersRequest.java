package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListTransfersRequest {

    /** 日志转储类型。OBS指OBS日志转储，DIS指DIS日志转储，DMS指DMS日志转储 */
    public static final class LogTransferTypeEnum {

        /** Enum OBS for value: "OBS" */
        public static final LogTransferTypeEnum OBS = new LogTransferTypeEnum("OBS");

        /** Enum DIS for value: "DIS" */
        public static final LogTransferTypeEnum DIS = new LogTransferTypeEnum("DIS");

        /** Enum DMS for value: "DMS" */
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    public ListTransfersRequest withLogTransferType(LogTransferTypeEnum logTransferType) {
        this.logTransferType = logTransferType;
        return this;
    }

    /** 日志转储类型。OBS指OBS日志转储，DIS指DIS日志转储，DMS指DMS日志转储
     * 
     * @return logTransferType */
    public LogTransferTypeEnum getLogTransferType() {
        return logTransferType;
    }

    public void setLogTransferType(LogTransferTypeEnum logTransferType) {
        this.logTransferType = logTransferType;
    }

    public ListTransfersRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /** 日志组名称
     * 
     * @return logGroupName */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public ListTransfersRequest withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /** 日志流名称
     * 
     * @return logStreamName */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTransfersRequest listTransfersRequest = (ListTransfersRequest) o;
        return Objects.equals(this.logTransferType, listTransfersRequest.logTransferType)
            && Objects.equals(this.logGroupName, listTransfersRequest.logGroupName)
            && Objects.equals(this.logStreamName, listTransfersRequest.logStreamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logTransferType, logGroupName, logStreamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransfersRequest {\n");
        sb.append("    logTransferType: ").append(toIndentedString(logTransferType)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
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
