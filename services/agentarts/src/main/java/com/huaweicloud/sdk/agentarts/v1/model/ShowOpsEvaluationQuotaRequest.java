package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ShowOpsEvaluationQuotaRequest {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum EVALUATION_TASK_COUNT for value: "evaluation_task_count"
         */
        public static final TypeEnum EVALUATION_TASK_COUNT = new TypeEnum("evaluation_task_count");

        /**
         * Enum PARALLEL_ONLINE_EVALUATION_TASK_COUNT for value: "parallel_online_evaluation_task_count"
         */
        public static final TypeEnum PARALLEL_ONLINE_EVALUATION_TASK_COUNT =
            new TypeEnum("parallel_online_evaluation_task_count");

        /**
         * Enum SYNTHESIS_TASK_COUNT for value: "synthesis_task_count"
         */
        public static final TypeEnum SYNTHESIS_TASK_COUNT = new TypeEnum("synthesis_task_count");

        /**
         * Enum PARALLEL_SYNTHESIS_TASK_COUNT for value: "parallel_synthesis_task_count"
         */
        public static final TypeEnum PARALLEL_SYNTHESIS_TASK_COUNT = new TypeEnum("parallel_synthesis_task_count");

        /**
         * Enum DATASET_COUNT for value: "dataset_count"
         */
        public static final TypeEnum DATASET_COUNT = new TypeEnum("dataset_count");

        /**
         * Enum EVALUATOR_COUNT for value: "evaluator_count"
         */
        public static final TypeEnum EVALUATOR_COUNT = new TypeEnum("evaluator_count");

        /**
         * Enum LABEL_COUNT for value: "label_count"
         */
        public static final TypeEnum LABEL_COUNT = new TypeEnum("label_count");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("evaluation_task_count", EVALUATION_TASK_COUNT);
            map.put("parallel_online_evaluation_task_count", PARALLEL_ONLINE_EVALUATION_TASK_COUNT);
            map.put("synthesis_task_count", SYNTHESIS_TASK_COUNT);
            map.put("parallel_synthesis_task_count", PARALLEL_SYNTHESIS_TASK_COUNT);
            map.put("dataset_count", DATASET_COUNT);
            map.put("evaluator_count", EVALUATOR_COUNT);
            map.put("label_count", LABEL_COUNT);
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

    public ShowOpsEvaluationQuotaRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
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
        ShowOpsEvaluationQuotaRequest that = (ShowOpsEvaluationQuotaRequest) obj;
        return Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluationQuotaRequest {\n");
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
