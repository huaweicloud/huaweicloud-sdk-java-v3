package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SummarizationAnalysisInference
 */
public class SummarizationAnalysisInference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_duration")

    private Integer outputDuration;

    /**
     * 输出类型，不填摘要片段和集锦都输出。填summary只输出集锦；填fragment只输出片段。
     */
    public static final class OutcomeTypeEnum {

        /**
         * Enum FRAGMENT for value: "fragment"
         */
        public static final OutcomeTypeEnum FRAGMENT = new OutcomeTypeEnum("fragment");

        /**
         * Enum SUMMARY for value: "summary"
         */
        public static final OutcomeTypeEnum SUMMARY = new OutcomeTypeEnum("summary");

        private static final Map<String, OutcomeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OutcomeTypeEnum> createStaticFields() {
            Map<String, OutcomeTypeEnum> map = new HashMap<>();
            map.put("fragment", FRAGMENT);
            map.put("summary", SUMMARY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OutcomeTypeEnum(String value) {
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
        public static OutcomeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OutcomeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OutcomeTypeEnum(value);
            }
            return result;
        }

        public static OutcomeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OutcomeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OutcomeTypeEnum) {
                return this.value.equals(((OutcomeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outcome_type")

    private OutcomeTypeEnum outcomeType;

    public SummarizationAnalysisInference withOutputDuration(Integer outputDuration) {
        this.outputDuration = outputDuration;
        return this;
    }

    /**
     * 摘要片段输出总时长
     * minimum: 5
     * maximum: 300
     * @return outputDuration
     */
    public Integer getOutputDuration() {
        return outputDuration;
    }

    public void setOutputDuration(Integer outputDuration) {
        this.outputDuration = outputDuration;
    }

    public SummarizationAnalysisInference withOutcomeType(OutcomeTypeEnum outcomeType) {
        this.outcomeType = outcomeType;
        return this;
    }

    /**
     * 输出类型，不填摘要片段和集锦都输出。填summary只输出集锦；填fragment只输出片段。
     * @return outcomeType
     */
    public OutcomeTypeEnum getOutcomeType() {
        return outcomeType;
    }

    public void setOutcomeType(OutcomeTypeEnum outcomeType) {
        this.outcomeType = outcomeType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SummarizationAnalysisInference summarizationAnalysisInference = (SummarizationAnalysisInference) o;
        return Objects.equals(this.outputDuration, summarizationAnalysisInference.outputDuration)
            && Objects.equals(this.outcomeType, summarizationAnalysisInference.outcomeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outputDuration, outcomeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SummarizationAnalysisInference {\n");
        sb.append("    outputDuration: ").append(toIndentedString(outputDuration)).append("\n");
        sb.append("    outcomeType: ").append(toIndentedString(outcomeType)).append("\n");
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
