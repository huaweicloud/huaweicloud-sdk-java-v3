package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 脱敏策略列表，每个策略对应一个字段，脱敏策略数最多100个。详情见“动态脱敏策略配置”。
 */
public class MaskStrategies {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    /**
     * 脱敏算法名称，详情见附录\"动态脱敏策略配置\"。
     */
    public static final class AlgorithmEnum {

        /**
         * Enum SHA256 for value: "SHA256"
         */
        public static final AlgorithmEnum SHA256 = new AlgorithmEnum("SHA256");

        /**
         * Enum SHA512 for value: "SHA512"
         */
        public static final AlgorithmEnum SHA512 = new AlgorithmEnum("SHA512");

        /**
         * Enum AES for value: "AES"
         */
        public static final AlgorithmEnum AES = new AlgorithmEnum("AES");

        /**
         * Enum PRESNM for value: "PRESNM"
         */
        public static final AlgorithmEnum PRESNM = new AlgorithmEnum("PRESNM");

        /**
         * Enum MASKNM for value: "MASKNM"
         */
        public static final AlgorithmEnum MASKNM = new AlgorithmEnum("MASKNM");

        /**
         * Enum PRESXY for value: "PRESXY"
         */
        public static final AlgorithmEnum PRESXY = new AlgorithmEnum("PRESXY");

        /**
         * Enum MASKXY for value: "MASKXY"
         */
        public static final AlgorithmEnum MASKXY = new AlgorithmEnum("MASKXY");

        /**
         * Enum SYMBOL for value: "SYMBOL"
         */
        public static final AlgorithmEnum SYMBOL = new AlgorithmEnum("SYMBOL");

        /**
         * Enum KEYWORD for value: "KEYWORD"
         */
        public static final AlgorithmEnum KEYWORD = new AlgorithmEnum("KEYWORD");

        /**
         * Enum NUMERIC for value: "NUMERIC"
         */
        public static final AlgorithmEnum NUMERIC = new AlgorithmEnum("NUMERIC");

        private static final Map<String, AlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlgorithmEnum> createStaticFields() {
            Map<String, AlgorithmEnum> map = new HashMap<>();
            map.put("SHA256", SHA256);
            map.put("SHA512", SHA512);
            map.put("AES", AES);
            map.put("PRESNM", PRESNM);
            map.put("MASKNM", MASKNM);
            map.put("PRESXY", PRESXY);
            map.put("MASKXY", MASKXY);
            map.put("SYMBOL", SYMBOL);
            map.put("KEYWORD", KEYWORD);
            map.put("NUMERIC", NUMERIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlgorithmEnum(String value) {
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
        public static AlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AlgorithmEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AlgorithmEnum(value);
            }
            return result;
        }

        public static AlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AlgorithmEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlgorithmEnum) {
                return this.value.equals(((AlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    @JacksonXmlProperty(localName = "algorithm")

    private AlgorithmEnum algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    @JacksonXmlProperty(localName = "parameters")

    private Map<String, Object> parameters = null;

    public MaskStrategies withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 需要脱敏的字段名称，最大支持长度256。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MaskStrategies withAlgorithm(AlgorithmEnum algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * 脱敏算法名称，详情见附录\"动态脱敏策略配置\"。
     * @return algorithm
     */
    public AlgorithmEnum getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(AlgorithmEnum algorithm) {
        this.algorithm = algorithm;
    }

    public MaskStrategies withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    public MaskStrategies putParametersItem(String key, Object parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public MaskStrategies withParameters(Consumer<Map<String, Object>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 脱敏算法参数，详情见附录\"动态脱敏策略配置\"。
     * @return parameters
     */
    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MaskStrategies maskStrategies = (MaskStrategies) o;
        return Objects.equals(this.name, maskStrategies.name)
            && Objects.equals(this.algorithm, maskStrategies.algorithm)
            && Objects.equals(this.parameters, maskStrategies.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, algorithm, parameters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MaskStrategies {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
