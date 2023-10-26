package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务详情
 */
public class StepDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_id")

    private String stepId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_name")

    private String stepName;

    /**
     * 任务状态
     */
    public static final class StepStatusEnum {

        /**
         * Enum FINISH for value: "FINISH"
         */
        public static final StepStatusEnum FINISH = new StepStatusEnum("FINISH");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StepStatusEnum FAILED = new StepStatusEnum("FAILED");

        /**
         * Enum EXECUTING for value: "EXECUTING"
         */
        public static final StepStatusEnum EXECUTING = new StepStatusEnum("EXECUTING");

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final StepStatusEnum WAITING = new StepStatusEnum("WAITING");

        private static final Map<String, StepStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StepStatusEnum> createStaticFields() {
            Map<String, StepStatusEnum> map = new HashMap<>();
            map.put("FINISH", FINISH);
            map.put("FAILED", FAILED);
            map.put("EXECUTING", EXECUTING);
            map.put("WAITING", WAITING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StepStatusEnum(String value) {
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
        public static StepStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StepStatusEnum(value));
        }

        public static StepStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StepStatusEnum) {
                return this.value.equals(((StepStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_status")

    private StepStatusEnum stepStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_step_details")

    private List<SubStepDetail> subStepDetails = null;

    public StepDetail withStepId(String stepId) {
        this.stepId = stepId;
        return this;
    }

    /**
     * 任务id
     * @return stepId
     */
    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public StepDetail withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    /**
     * 任务名
     * @return stepName
     */
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public StepDetail withStepStatus(StepStatusEnum stepStatus) {
        this.stepStatus = stepStatus;
        return this;
    }

    /**
     * 任务状态
     * @return stepStatus
     */
    public StepStatusEnum getStepStatus() {
        return stepStatus;
    }

    public void setStepStatus(StepStatusEnum stepStatus) {
        this.stepStatus = stepStatus;
    }

    public StepDetail withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 任务启动时间，格式为2020-06-17T07:38:42.503Z
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public StepDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间，格式为2020-06-17T07:38:42.503Z
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public StepDetail withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public StepDetail withSubStepDetails(List<SubStepDetail> subStepDetails) {
        this.subStepDetails = subStepDetails;
        return this;
    }

    public StepDetail addSubStepDetailsItem(SubStepDetail subStepDetailsItem) {
        if (this.subStepDetails == null) {
            this.subStepDetails = new ArrayList<>();
        }
        this.subStepDetails.add(subStepDetailsItem);
        return this;
    }

    public StepDetail withSubStepDetails(Consumer<List<SubStepDetail>> subStepDetailsSetter) {
        if (this.subStepDetails == null) {
            this.subStepDetails = new ArrayList<>();
        }
        subStepDetailsSetter.accept(this.subStepDetails);
        return this;
    }

    /**
     * 子任务详情列表
     * @return subStepDetails
     */
    public List<SubStepDetail> getSubStepDetails() {
        return subStepDetails;
    }

    public void setSubStepDetails(List<SubStepDetail> subStepDetails) {
        this.subStepDetails = subStepDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StepDetail that = (StepDetail) obj;
        return Objects.equals(this.stepId, that.stepId) && Objects.equals(this.stepName, that.stepName)
            && Objects.equals(this.stepStatus, that.stepStatus) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.subStepDetails, that.subStepDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepId, stepName, stepStatus, beginTime, endTime, errorCode, subStepDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StepDetail {\n");
        sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
        sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
        sb.append("    stepStatus: ").append(toIndentedString(stepStatus)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    subStepDetails: ").append(toIndentedString(subStepDetails)).append("\n");
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
