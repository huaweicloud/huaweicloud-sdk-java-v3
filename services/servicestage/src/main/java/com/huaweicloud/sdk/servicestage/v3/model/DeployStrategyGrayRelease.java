package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DeployStrategyGrayRelease
 */
public class DeployStrategyGrayRelease {

    /**
     * Gets or Sets type
     */
    public static final class TypeEnum {

        /**
         * Enum WEIGHT for value: "weight"
         */
        public static final TypeEnum WEIGHT = new TypeEnum("weight");

        /**
         * Enum CONTENT for value: "content"
         */
        public static final TypeEnum CONTENT = new TypeEnum("content");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("weight", WEIGHT);
            map.put("content", CONTENT);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_batch_weight")

    private Integer firstBatchWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_batch_replica")

    private Integer firstBatchReplica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_batch")

    private Integer remainingBatch;

    public DeployStrategyGrayRelease withType(TypeEnum type) {
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

    public DeployStrategyGrayRelease withFirstBatchWeight(Integer firstBatchWeight) {
        this.firstBatchWeight = firstBatchWeight;
        return this;
    }

    /**
     * only used for weight type
     * @return firstBatchWeight
     */
    public Integer getFirstBatchWeight() {
        return firstBatchWeight;
    }

    public void setFirstBatchWeight(Integer firstBatchWeight) {
        this.firstBatchWeight = firstBatchWeight;
    }

    public DeployStrategyGrayRelease withFirstBatchReplica(Integer firstBatchReplica) {
        this.firstBatchReplica = firstBatchReplica;
        return this;
    }

    /**
     * Get firstBatchReplica
     * @return firstBatchReplica
     */
    public Integer getFirstBatchReplica() {
        return firstBatchReplica;
    }

    public void setFirstBatchReplica(Integer firstBatchReplica) {
        this.firstBatchReplica = firstBatchReplica;
    }

    public DeployStrategyGrayRelease withRemainingBatch(Integer remainingBatch) {
        this.remainingBatch = remainingBatch;
        return this;
    }

    /**
     * Get remainingBatch
     * @return remainingBatch
     */
    public Integer getRemainingBatch() {
        return remainingBatch;
    }

    public void setRemainingBatch(Integer remainingBatch) {
        this.remainingBatch = remainingBatch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployStrategyGrayRelease that = (DeployStrategyGrayRelease) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.firstBatchWeight, that.firstBatchWeight)
            && Objects.equals(this.firstBatchReplica, that.firstBatchReplica)
            && Objects.equals(this.remainingBatch, that.remainingBatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, firstBatchWeight, firstBatchReplica, remainingBatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployStrategyGrayRelease {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    firstBatchWeight: ").append(toIndentedString(firstBatchWeight)).append("\n");
        sb.append("    firstBatchReplica: ").append(toIndentedString(firstBatchReplica)).append("\n");
        sb.append("    remainingBatch: ").append(toIndentedString(remainingBatch)).append("\n");
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
