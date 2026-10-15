package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 预检查信息体
 */
public class PreCheckInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * **参数解释**：  预检查模式，指定执行预检查的场景类型。请按照任务对应的状态传值，否则可能导致预检查失败，影响任务启动。  **约束限制**：  不涉及。  **取值范围**：  - forStartJob：任务配置中首次启动时预检查 - forRetryJob：任务增量中编辑对象后预检查，或任务失败后重试时预检查  **默认取值**：  不涉及
     */
    public static final class PrecheckModeEnum {

        /**
         * Enum FORSTARTJOB for value: "forStartJob"
         */
        public static final PrecheckModeEnum FORSTARTJOB = new PrecheckModeEnum("forStartJob");

        /**
         * Enum FORRETRYJOB for value: "forRetryJob"
         */
        public static final PrecheckModeEnum FORRETRYJOB = new PrecheckModeEnum("forRetryJob");

        private static final Map<String, PrecheckModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrecheckModeEnum> createStaticFields() {
            Map<String, PrecheckModeEnum> map = new HashMap<>();
            map.put("forStartJob", FORSTARTJOB);
            map.put("forRetryJob", FORRETRYJOB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrecheckModeEnum(String value) {
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
        public static PrecheckModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PrecheckModeEnum(value));
        }

        public static PrecheckModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrecheckModeEnum) {
                return this.value.equals(((PrecheckModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precheck_mode")

    private PrecheckModeEnum precheckMode;

    public PreCheckInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：  迁移任务ID，用于唯一标识一个数据复制任务，在查询、修改、删除等操作中作为任务的识别凭证。  **约束限制**：  不涉及。  **取值范围**：  UUID格式字符串。  **默认取值**：  不涉及
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public PreCheckInfo withPrecheckMode(PrecheckModeEnum precheckMode) {
        this.precheckMode = precheckMode;
        return this;
    }

    /**
     * **参数解释**：  预检查模式，指定执行预检查的场景类型。请按照任务对应的状态传值，否则可能导致预检查失败，影响任务启动。  **约束限制**：  不涉及。  **取值范围**：  - forStartJob：任务配置中首次启动时预检查 - forRetryJob：任务增量中编辑对象后预检查，或任务失败后重试时预检查  **默认取值**：  不涉及
     * @return precheckMode
     */
    public PrecheckModeEnum getPrecheckMode() {
        return precheckMode;
    }

    public void setPrecheckMode(PrecheckModeEnum precheckMode) {
        this.precheckMode = precheckMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreCheckInfo that = (PreCheckInfo) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.precheckMode, that.precheckMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, precheckMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreCheckInfo {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    precheckMode: ").append(toIndentedString(precheckMode)).append("\n");
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
