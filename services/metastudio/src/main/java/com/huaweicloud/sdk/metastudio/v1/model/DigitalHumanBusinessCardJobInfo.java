package com.huaweicloud.sdk.metastudio.v1.model;

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
 * 数字人名片制作任务信息。
 */
public class DigitalHumanBusinessCardJobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * 任务的状态。 * WAITING: 等待 * PROCESSING: 处理中 * SUCCEED: 成功 * FAILED: 失败 * CANCELED: 取消
     */
    public static final class StateEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final StateEnum WAITING = new StateEnum("WAITING");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final StateEnum PROCESSING = new StateEnum("PROCESSING");

        /**
         * Enum SUCCEED for value: "SUCCEED"
         */
        public static final StateEnum SUCCEED = new StateEnum("SUCCEED");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StateEnum FAILED = new StateEnum("FAILED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StateEnum CANCELED = new StateEnum("CANCELED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("PROCESSING", PROCESSING);
            map.put("SUCCEED", SUCCEED);
            map.put("FAILED", FAILED);
            map.put("CANCELED", CANCELED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_asset_config")

    private OutputAssetInfo outputAssetConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private ErrorResponse errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastupdate_time")

    private String lastupdateTime;

    /**
     * 数字人名片类型。 * 2D_DIGITAL_HUMAN_CARD：分身数字人名片
     */
    public static final class BusinessCardTypeEnum {

        /**
         * Enum _2D_DIGITAL_HUMAN_CARD for value: "2D_DIGITAL_HUMAN_CARD"
         */
        public static final BusinessCardTypeEnum _2D_DIGITAL_HUMAN_CARD =
            new BusinessCardTypeEnum("2D_DIGITAL_HUMAN_CARD");

        private static final Map<String, BusinessCardTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BusinessCardTypeEnum> createStaticFields() {
            Map<String, BusinessCardTypeEnum> map = new HashMap<>();
            map.put("2D_DIGITAL_HUMAN_CARD", _2D_DIGITAL_HUMAN_CARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BusinessCardTypeEnum(String value) {
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
        public static BusinessCardTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BusinessCardTypeEnum(value));
        }

        public static BusinessCardTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BusinessCardTypeEnum) {
                return this.value.equals(((BusinessCardTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_card_type")

    private BusinessCardTypeEnum businessCardType;

    public DigitalHumanBusinessCardJobInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public DigitalHumanBusinessCardJobInfo withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 任务的状态。 * WAITING: 等待 * PROCESSING: 处理中 * SUCCEED: 成功 * FAILED: 失败 * CANCELED: 取消
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public DigitalHumanBusinessCardJobInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 数字人名片制作开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public DigitalHumanBusinessCardJobInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 数字人名片制作结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public DigitalHumanBusinessCardJobInfo withOutputAssetConfig(OutputAssetInfo outputAssetConfig) {
        this.outputAssetConfig = outputAssetConfig;
        return this;
    }

    public DigitalHumanBusinessCardJobInfo withOutputAssetConfig(Consumer<OutputAssetInfo> outputAssetConfigSetter) {
        if (this.outputAssetConfig == null) {
            this.outputAssetConfig = new OutputAssetInfo();
            outputAssetConfigSetter.accept(this.outputAssetConfig);
        }

        return this;
    }

    /**
     * Get outputAssetConfig
     * @return outputAssetConfig
     */
    public OutputAssetInfo getOutputAssetConfig() {
        return outputAssetConfig;
    }

    public void setOutputAssetConfig(OutputAssetInfo outputAssetConfig) {
        this.outputAssetConfig = outputAssetConfig;
    }

    public DigitalHumanBusinessCardJobInfo withErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public DigitalHumanBusinessCardJobInfo withErrorInfo(Consumer<ErrorResponse> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new ErrorResponse();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public ErrorResponse getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
    }

    public DigitalHumanBusinessCardJobInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DigitalHumanBusinessCardJobInfo withLastupdateTime(String lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
        return this;
    }

    /**
     * 任务更新时间。
     * @return lastupdateTime
     */
    public String getLastupdateTime() {
        return lastupdateTime;
    }

    public void setLastupdateTime(String lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
    }

    public DigitalHumanBusinessCardJobInfo withBusinessCardType(BusinessCardTypeEnum businessCardType) {
        this.businessCardType = businessCardType;
        return this;
    }

    /**
     * 数字人名片类型。 * 2D_DIGITAL_HUMAN_CARD：分身数字人名片
     * @return businessCardType
     */
    public BusinessCardTypeEnum getBusinessCardType() {
        return businessCardType;
    }

    public void setBusinessCardType(BusinessCardTypeEnum businessCardType) {
        this.businessCardType = businessCardType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DigitalHumanBusinessCardJobInfo that = (DigitalHumanBusinessCardJobInfo) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.outputAssetConfig, that.outputAssetConfig)
            && Objects.equals(this.errorInfo, that.errorInfo) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastupdateTime, that.lastupdateTime)
            && Objects.equals(this.businessCardType, that.businessCardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            state,
            startTime,
            endTime,
            outputAssetConfig,
            errorInfo,
            createTime,
            lastupdateTime,
            businessCardType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DigitalHumanBusinessCardJobInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    outputAssetConfig: ").append(toIndentedString(outputAssetConfig)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastupdateTime: ").append(toIndentedString(lastupdateTime)).append("\n");
        sb.append("    businessCardType: ").append(toIndentedString(businessCardType)).append("\n");
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
