package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 预检查结果信息体
 */
public class PrecheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    @JacksonXmlProperty(localName = "item")

    private String item;

    /**
     * 检查结果
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
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResultEnum(value);
            }
            return result;
        }

        public static ResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "result")

    private ResultEnum result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    @JacksonXmlProperty(localName = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    @JacksonXmlProperty(localName = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw_error_msg")

    @JacksonXmlProperty(localName = "raw_error_msg")

    private String rawErrorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    @JacksonXmlProperty(localName = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_sub_jobs")

    @JacksonXmlProperty(localName = "failed_sub_jobs")

    private List<PrecheckFailSubJobVO> failedSubJobs = null;

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
     * 检查结果
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
     * 加密的数据。
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
     * 行错误信息。
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
     * 检查项分组
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public PrecheckResult withFailedSubJobs(List<PrecheckFailSubJobVO> failedSubJobs) {
        this.failedSubJobs = failedSubJobs;
        return this;
    }

    public PrecheckResult addFailedSubJobsItem(PrecheckFailSubJobVO failedSubJobsItem) {
        if (this.failedSubJobs == null) {
            this.failedSubJobs = new ArrayList<>();
        }
        this.failedSubJobs.add(failedSubJobsItem);
        return this;
    }

    public PrecheckResult withFailedSubJobs(Consumer<List<PrecheckFailSubJobVO>> failedSubJobsSetter) {
        if (this.failedSubJobs == null) {
            this.failedSubJobs = new ArrayList<>();
        }
        failedSubJobsSetter.accept(this.failedSubJobs);
        return this;
    }

    /**
     * 失败的子任务信息。
     * @return failedSubJobs
     */
    public List<PrecheckFailSubJobVO> getFailedSubJobs() {
        return failedSubJobs;
    }

    public void setFailedSubJobs(List<PrecheckFailSubJobVO> failedSubJobs) {
        this.failedSubJobs = failedSubJobs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrecheckResult precheckResult = (PrecheckResult) o;
        return Objects.equals(this.item, precheckResult.item) && Objects.equals(this.result, precheckResult.result)
            && Objects.equals(this.failedReason, precheckResult.failedReason)
            && Objects.equals(this.data, precheckResult.data)
            && Objects.equals(this.rawErrorMsg, precheckResult.rawErrorMsg)
            && Objects.equals(this.group, precheckResult.group)
            && Objects.equals(this.failedSubJobs, precheckResult.failedSubJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, result, failedReason, data, rawErrorMsg, group, failedSubJobs);
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
