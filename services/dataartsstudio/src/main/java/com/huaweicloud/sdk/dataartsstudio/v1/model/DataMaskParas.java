package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DataMaskParas
 */
public class DataMaskParas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_name")

    private String algorithmName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private String algorithmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_name")

    private String enName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_parameters")

    private String algorithmParameters;

    /**
     * Gets or Sets failurePolicy
     */
    public static final class FailurePolicyEnum {

        /**
         * Enum SKIP for value: "SKIP"
         */
        public static final FailurePolicyEnum SKIP = new FailurePolicyEnum("SKIP");

        /**
         * Enum INTERRUPT_AND_EXCEPTION for value: "INTERRUPT_AND_EXCEPTION"
         */
        public static final FailurePolicyEnum INTERRUPT_AND_EXCEPTION =
            new FailurePolicyEnum("INTERRUPT_AND_EXCEPTION");

        /**
         * Enum SET_NULL for value: "SET_NULL"
         */
        public static final FailurePolicyEnum SET_NULL = new FailurePolicyEnum("SET_NULL");

        /**
         * Enum DEFAULT_VALUE for value: "DEFAULT_VALUE"
         */
        public static final FailurePolicyEnum DEFAULT_VALUE = new FailurePolicyEnum("DEFAULT_VALUE");

        private static final Map<String, FailurePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FailurePolicyEnum> createStaticFields() {
            Map<String, FailurePolicyEnum> map = new HashMap<>();
            map.put("SKIP", SKIP);
            map.put("INTERRUPT_AND_EXCEPTION", INTERRUPT_AND_EXCEPTION);
            map.put("SET_NULL", SET_NULL);
            map.put("DEFAULT_VALUE", DEFAULT_VALUE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FailurePolicyEnum(String value) {
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
        public static FailurePolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FailurePolicyEnum(value));
        }

        public static FailurePolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FailurePolicyEnum) {
                return this.value.equals(((FailurePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_policy")

    private FailurePolicyEnum failurePolicy;

    public DataMaskParas withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 敏感字段。
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public DataMaskParas withAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }

    /**
     * 算法名称。
     * @return algorithmName
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public DataMaskParas withAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 算法类型。
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
    }

    public DataMaskParas withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * 算法名称。
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public DataMaskParas withAlgorithmParameters(String algorithmParameters) {
        this.algorithmParameters = algorithmParameters;
        return this;
    }

    /**
     * 参数。
     * @return algorithmParameters
     */
    public String getAlgorithmParameters() {
        return algorithmParameters;
    }

    public void setAlgorithmParameters(String algorithmParameters) {
        this.algorithmParameters = algorithmParameters;
    }

    public DataMaskParas withFailurePolicy(FailurePolicyEnum failurePolicy) {
        this.failurePolicy = failurePolicy;
        return this;
    }

    /**
     * Get failurePolicy
     * @return failurePolicy
     */
    public FailurePolicyEnum getFailurePolicy() {
        return failurePolicy;
    }

    public void setFailurePolicy(FailurePolicyEnum failurePolicy) {
        this.failurePolicy = failurePolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataMaskParas that = (DataMaskParas) obj;
        return Objects.equals(this.columnName, that.columnName)
            && Objects.equals(this.algorithmName, that.algorithmName)
            && Objects.equals(this.algorithmType, that.algorithmType) && Objects.equals(this.enName, that.enName)
            && Objects.equals(this.algorithmParameters, that.algorithmParameters)
            && Objects.equals(this.failurePolicy, that.failurePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, algorithmName, algorithmType, enName, algorithmParameters, failurePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataMaskParas {\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    algorithmName: ").append(toIndentedString(algorithmName)).append("\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
        sb.append("    algorithmParameters: ").append(toIndentedString(algorithmParameters)).append("\n");
        sb.append("    failurePolicy: ").append(toIndentedString(failurePolicy)).append("\n");
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
