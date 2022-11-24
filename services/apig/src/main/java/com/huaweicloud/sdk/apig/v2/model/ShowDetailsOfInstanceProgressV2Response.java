package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowDetailsOfInstanceProgressV2Response extends SdkResponse {

    /**
     * 实例创建进度  单位：百分比
     */
    public static final class ProgressEnum {

        /**
         * Enum NUMBER_30 for value: 30
         */
        public static final ProgressEnum NUMBER_30 = new ProgressEnum(30);

        /**
         * Enum NUMBER_50 for value: 50
         */
        public static final ProgressEnum NUMBER_50 = new ProgressEnum(50);

        /**
         * Enum NUMBER_80 for value: 80
         */
        public static final ProgressEnum NUMBER_80 = new ProgressEnum(80);

        /**
         * Enum NUMBER_90 for value: 90
         */
        public static final ProgressEnum NUMBER_90 = new ProgressEnum(90);

        /**
         * Enum NUMBER_100 for value: 100
         */
        public static final ProgressEnum NUMBER_100 = new ProgressEnum(100);

        private static final Map<Integer, ProgressEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ProgressEnum> createStaticFields() {
            Map<Integer, ProgressEnum> map = new HashMap<>();
            map.put(30, NUMBER_30);
            map.put(50, NUMBER_50);
            map.put(80, NUMBER_80);
            map.put(90, NUMBER_90);
            map.put(100, NUMBER_100);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ProgressEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProgressEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            ProgressEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProgressEnum(value);
            }
            return result;
        }

        public static ProgressEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            ProgressEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProgressEnum) {
                return this.value.equals(((ProgressEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private ProgressEnum progress;

    /**
     * 实例创建状态 - creating：创建中 - success：创建成功 - failed：创建失败
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("creating");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("creating", CREATING);
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
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
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public ShowDetailsOfInstanceProgressV2Response withProgress(ProgressEnum progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 实例创建进度  单位：百分比
     * @return progress
     */
    public ProgressEnum getProgress() {
        return progress;
    }

    public void setProgress(ProgressEnum progress) {
        this.progress = progress;
    }

    public ShowDetailsOfInstanceProgressV2Response withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 实例创建状态 - creating：创建中 - success：创建成功 - failed：创建失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowDetailsOfInstanceProgressV2Response withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 实例创建失败错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowDetailsOfInstanceProgressV2Response withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 实例创建失败错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ShowDetailsOfInstanceProgressV2Response withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 实例创建开始时间。unix时间戳格式。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowDetailsOfInstanceProgressV2Response withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 实例创建结束时间。unix时间戳格式。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDetailsOfInstanceProgressV2Response showDetailsOfInstanceProgressV2Response =
            (ShowDetailsOfInstanceProgressV2Response) o;
        return Objects.equals(this.progress, showDetailsOfInstanceProgressV2Response.progress)
            && Objects.equals(this.status, showDetailsOfInstanceProgressV2Response.status)
            && Objects.equals(this.errorCode, showDetailsOfInstanceProgressV2Response.errorCode)
            && Objects.equals(this.errorMsg, showDetailsOfInstanceProgressV2Response.errorMsg)
            && Objects.equals(this.startTime, showDetailsOfInstanceProgressV2Response.startTime)
            && Objects.equals(this.endTime, showDetailsOfInstanceProgressV2Response.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress, status, errorCode, errorMsg, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfInstanceProgressV2Response {\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
