package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowTaskRunningDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evolve_task_id")

    private String evolveTaskId;

    /**
     * **参数解释**： 统计信息类型。 **约束限制**： 不涉及 **取值范围**： * PROGRESS： 进度信息。 * SUMMARY:   结果统计值。 * BEST_RESULT:  最优结果的commitId。 * GENERATION_STATS: 各迭代的统计值。 **默认取值**： 不涉及 
     */
    public static final class TypeEnum {

        /**
         * Enum PROGRESS for value: "progress"
         */
        public static final TypeEnum PROGRESS = new TypeEnum("progress");

        /**
         * Enum SUMMARY for value: "summary"
         */
        public static final TypeEnum SUMMARY = new TypeEnum("summary");

        /**
         * Enum BEST_RESULT for value: "best_result"
         */
        public static final TypeEnum BEST_RESULT = new TypeEnum("best_result");

        /**
         * Enum GENERATION_STATS for value: "generation_stats"
         */
        public static final TypeEnum GENERATION_STATS = new TypeEnum("generation_stats");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("progress", PROGRESS);
            map.put("summary", SUMMARY);
            map.put("best_result", BEST_RESULT);
            map.put("generation_stats", GENERATION_STATS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    public ShowTaskRunningDetailsRequest withEvolveTaskId(String evolveTaskId) {
        this.evolveTaskId = evolveTaskId;
        return this;
    }

    /**
     * **参数解释**： 演化任务标识符。 **约束限制**： 不涉及 **取值范围**： 仅支持字母、数字、中划线和下划线，长度为[1-128]个字符。 **默认取值**： 不涉及 
     * @return evolveTaskId
     */
    public String getEvolveTaskId() {
        return evolveTaskId;
    }

    public void setEvolveTaskId(String evolveTaskId) {
        this.evolveTaskId = evolveTaskId;
    }

    public ShowTaskRunningDetailsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 统计信息类型。 **约束限制**： 不涉及 **取值范围**： * PROGRESS： 进度信息。 * SUMMARY:   结果统计值。 * BEST_RESULT:  最优结果的commitId。 * GENERATION_STATS: 各迭代的统计值。 **默认取值**： 不涉及 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskRunningDetailsRequest that = (ShowTaskRunningDetailsRequest) obj;
        return Objects.equals(this.evolveTaskId, that.evolveTaskId) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evolveTaskId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskRunningDetailsRequest {\n");
        sb.append("    evolveTaskId: ").append(toIndentedString(evolveTaskId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
