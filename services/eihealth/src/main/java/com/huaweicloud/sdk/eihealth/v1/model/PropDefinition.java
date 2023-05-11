package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 属性定义的相关结构
 */
public class PropDefinition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 属性类型
     */
    public static final class TypeEnum {

        /**
         * Enum BINARY for value: "binary"
         */
        public static final TypeEnum BINARY = new TypeEnum("binary");

        /**
         * Enum NUMERICAL for value: "numerical"
         */
        public static final TypeEnum NUMERICAL = new TypeEnum("numerical");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("binary", BINARY);
            map.put("numerical", NUMERICAL);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_range")

    private ValueRange valueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optimal_range")

    private ValueRange optimalRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warning_range")

    private ValueRange warningRange;

    /**
     * 模型参数呈现类型
     */
    public static final class StyleEnum {

        /**
         * Enum NUMBER for value: "number"
         */
        public static final StyleEnum NUMBER = new StyleEnum("number");

        /**
         * Enum PROBABILITY for value: "probability"
         */
        public static final StyleEnum PROBABILITY = new StyleEnum("probability");

        private static final Map<String, StyleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StyleEnum> createStaticFields() {
            Map<String, StyleEnum> map = new HashMap<>();
            map.put("number", NUMBER);
            map.put("probability", PROBABILITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StyleEnum(String value) {
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
        public static StyleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StyleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StyleEnum(value);
            }
            return result;
        }

        public static StyleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StyleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StyleEnum) {
                return this.value.equals(((StyleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style")

    private StyleEnum style;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidential_interval")

    private Boolean confidentialInterval;

    public PropDefinition withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 属性业务侧ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PropDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 属性名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PropDefinition withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 属性类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PropDefinition withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 属性具体描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PropDefinition withValueRange(ValueRange valueRange) {
        this.valueRange = valueRange;
        return this;
    }

    public PropDefinition withValueRange(Consumer<ValueRange> valueRangeSetter) {
        if (this.valueRange == null) {
            this.valueRange = new ValueRange();
            valueRangeSetter.accept(this.valueRange);
        }

        return this;
    }

    /**
     * Get valueRange
     * @return valueRange
     */
    public ValueRange getValueRange() {
        return valueRange;
    }

    public void setValueRange(ValueRange valueRange) {
        this.valueRange = valueRange;
    }

    public PropDefinition withOptimalRange(ValueRange optimalRange) {
        this.optimalRange = optimalRange;
        return this;
    }

    public PropDefinition withOptimalRange(Consumer<ValueRange> optimalRangeSetter) {
        if (this.optimalRange == null) {
            this.optimalRange = new ValueRange();
            optimalRangeSetter.accept(this.optimalRange);
        }

        return this;
    }

    /**
     * Get optimalRange
     * @return optimalRange
     */
    public ValueRange getOptimalRange() {
        return optimalRange;
    }

    public void setOptimalRange(ValueRange optimalRange) {
        this.optimalRange = optimalRange;
    }

    public PropDefinition withWarningRange(ValueRange warningRange) {
        this.warningRange = warningRange;
        return this;
    }

    public PropDefinition withWarningRange(Consumer<ValueRange> warningRangeSetter) {
        if (this.warningRange == null) {
            this.warningRange = new ValueRange();
            warningRangeSetter.accept(this.warningRange);
        }

        return this;
    }

    /**
     * Get warningRange
     * @return warningRange
     */
    public ValueRange getWarningRange() {
        return warningRange;
    }

    public void setWarningRange(ValueRange warningRange) {
        this.warningRange = warningRange;
    }

    public PropDefinition withStyle(StyleEnum style) {
        this.style = style;
        return this;
    }

    /**
     * 模型参数呈现类型
     * @return style
     */
    public StyleEnum getStyle() {
        return style;
    }

    public void setStyle(StyleEnum style) {
        this.style = style;
    }

    public PropDefinition withConfidentialInterval(Boolean confidentialInterval) {
        this.confidentialInterval = confidentialInterval;
        return this;
    }

    /**
     * 模型推理是否呈现置信区间
     * @return confidentialInterval
     */
    public Boolean getConfidentialInterval() {
        return confidentialInterval;
    }

    public void setConfidentialInterval(Boolean confidentialInterval) {
        this.confidentialInterval = confidentialInterval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropDefinition propDefinition = (PropDefinition) o;
        return Objects.equals(this.id, propDefinition.id) && Objects.equals(this.name, propDefinition.name)
            && Objects.equals(this.type, propDefinition.type)
            && Objects.equals(this.description, propDefinition.description)
            && Objects.equals(this.valueRange, propDefinition.valueRange)
            && Objects.equals(this.optimalRange, propDefinition.optimalRange)
            && Objects.equals(this.warningRange, propDefinition.warningRange)
            && Objects.equals(this.style, propDefinition.style)
            && Objects.equals(this.confidentialInterval, propDefinition.confidentialInterval);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, type, description, valueRange, optimalRange, warningRange, style, confidentialInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropDefinition {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    valueRange: ").append(toIndentedString(valueRange)).append("\n");
        sb.append("    optimalRange: ").append(toIndentedString(optimalRange)).append("\n");
        sb.append("    warningRange: ").append(toIndentedString(warningRange)).append("\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
        sb.append("    confidentialInterval: ").append(toIndentedString(confidentialInterval)).append("\n");
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
