package com.huaweicloud.sdk.drs.v3.model;

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
 * 预检查结果信息体
 */
public class PrecheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private String item;

    /**
     * **参数解释**：  预检查项的检查结果，表示该检查项是否通过。  **约束限制**：  不涉及。  **取值范围**：  - PASSED：通过 - ALARM：告警 - FAILED：失败  **默认取值**：  不涉及
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
    @JsonProperty(value = "failed_sub_jobs")

    private List<PrecheckFailSubJobVO> failedSubJobs = null;

    public PrecheckResult withItem(String item) {
        this.item = item;
        return this;
    }

    /**
     * **参数解释**：  预检查的具体检查项名称，用于标识预检查中执行的具体检查项目。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
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
     * **参数解释**：  预检查项的检查结果，表示该检查项是否通过。  **约束限制**：  不涉及。  **取值范围**：  - PASSED：通过 - ALARM：告警 - FAILED：失败  **默认取值**：  不涉及
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
     * **参数解释**：  预检查项的失败原因，当检查结果为FAILED或ALARM时返回的具体失败描述。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
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
     * **参数解释**：  预检查项的加密数据，包含检查项的详细检测数据，以JSON格式加密返回。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
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
     * **参数解释**：  原始错误信息，预检查过程中产生的原始错误描述。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
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
     * **参数解释**：  检查项分组，用于将预检查项按类别归类展示。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
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
     * **参数解释**：  失败的子任务信息集合，包含预检查中失败的子任务详情，详情请参见PrecheckFailSubJobVO对象定义。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return failedSubJobs
     */
    public List<PrecheckFailSubJobVO> getFailedSubJobs() {
        return failedSubJobs;
    }

    public void setFailedSubJobs(List<PrecheckFailSubJobVO> failedSubJobs) {
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
            && Objects.equals(this.failedSubJobs, that.failedSubJobs);
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
