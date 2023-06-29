package com.huaweicloud.sdk.drs.v5.model;

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
 * 预检查项结果。
 */
public class PrecheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private String item;

    /**
     * 检查结果。取值： - PASSED：检查通过。 - ALARM：检查告警项。 - FAILED：检查失败。
     */
    public static final class ResultEnum {

        /**
         * Enum PASSED for value: "PASSED"
         */
        public static final ResultEnum PASSED = new ResultEnum("PASSED");

        /**
         * Enum ALARM for value: "ALARM"
         */
        public static final ResultEnum ALARM = new ResultEnum("ALARM");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final ResultEnum FAILED = new ResultEnum("FAILED");

        private static final Map<String, ResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultEnum> createStaticFields() {
            Map<String, ResultEnum> map = new HashMap<>();
            map.put("PASSED", PASSED);
            map.put("ALARM", ALARM);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultEnum(String value) {
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
        public static ResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResultEnum(value));
        }

        public static ResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultEnum) {
                return this.value.equals(((ResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ResultEnum result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw_error_msg")

    private String rawErrorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_skip")

    private Boolean isSupportSkip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_skipped")

    private Boolean isSkipped;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_sub_jobs")

    private List<PrecheckFailSubJobResult> failedSubJobs = null;

    public PrecheckResult withItem(String item) {
        this.item = item;
        return this;
    }

    /**
     * 检查项。
     * @return item
     */
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public PrecheckResult withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    /**
     * 检查结果。取值： - PASSED：检查通过。 - ALARM：检查告警项。 - FAILED：检查失败。
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    public PrecheckResult withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因。
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public PrecheckResult withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 失败数据。
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public PrecheckResult withRawErrorMsg(String rawErrorMsg) {
        this.rawErrorMsg = rawErrorMsg;
        return this;
    }

    /**
     * 失败详情。
     * @return rawErrorMsg
     */
    public String getRawErrorMsg() {
        return rawErrorMsg;
    }

    public void setRawErrorMsg(String rawErrorMsg) {
        this.rawErrorMsg = rawErrorMsg;
    }

    public PrecheckResult withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 检查项分组。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public PrecheckResult withIsSupportSkip(Boolean isSupportSkip) {
        this.isSupportSkip = isSupportSkip;
        return this;
    }

    /**
     * 是否支持跳过。
     * @return isSupportSkip
     */
    public Boolean getIsSupportSkip() {
        return isSupportSkip;
    }

    public void setIsSupportSkip(Boolean isSupportSkip) {
        this.isSupportSkip = isSupportSkip;
    }

    public PrecheckResult withIsSkipped(Boolean isSkipped) {
        this.isSkipped = isSkipped;
        return this;
    }

    /**
     * 是否已跳过。
     * @return isSkipped
     */
    public Boolean getIsSkipped() {
        return isSkipped;
    }

    public void setIsSkipped(Boolean isSkipped) {
        this.isSkipped = isSkipped;
    }

    public PrecheckResult withFailedSubJobs(List<PrecheckFailSubJobResult> failedSubJobs) {
        this.failedSubJobs = failedSubJobs;
        return this;
    }

    public PrecheckResult addFailedSubJobsItem(PrecheckFailSubJobResult failedSubJobsItem) {
        if (this.failedSubJobs == null) {
            this.failedSubJobs = new ArrayList<>();
        }
        this.failedSubJobs.add(failedSubJobsItem);
        return this;
    }

    public PrecheckResult withFailedSubJobs(Consumer<List<PrecheckFailSubJobResult>> failedSubJobsSetter) {
        if (this.failedSubJobs == null) {
            this.failedSubJobs = new ArrayList<>();
        }
        failedSubJobsSetter.accept(this.failedSubJobs);
        return this;
    }

    /**
     * 失败子任务详情。
     * @return failedSubJobs
     */
    public List<PrecheckFailSubJobResult> getFailedSubJobs() {
        return failedSubJobs;
    }

    public void setFailedSubJobs(List<PrecheckFailSubJobResult> failedSubJobs) {
        this.failedSubJobs = failedSubJobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrecheckResult that = (PrecheckResult) obj;
        return Objects.equals(this.item, that.item) && Objects.equals(this.result, that.result)
            && Objects.equals(this.failedReason, that.failedReason) && Objects.equals(this.data, that.data)
            && Objects.equals(this.rawErrorMsg, that.rawErrorMsg) && Objects.equals(this.group, that.group)
            && Objects.equals(this.isSupportSkip, that.isSupportSkip) && Objects.equals(this.isSkipped, that.isSkipped)
            && Objects.equals(this.failedSubJobs, that.failedSubJobs);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(item, result, failedReason, data, rawErrorMsg, group, isSupportSkip, isSkipped, failedSubJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrecheckResult {\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    rawErrorMsg: ").append(toIndentedString(rawErrorMsg)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    isSupportSkip: ").append(toIndentedString(isSupportSkip)).append("\n");
        sb.append("    isSkipped: ").append(toIndentedString(isSkipped)).append("\n");
        sb.append("    failedSubJobs: ").append(toIndentedString(failedSubJobs)).append("\n");
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
