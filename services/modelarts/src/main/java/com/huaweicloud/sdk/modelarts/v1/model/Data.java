package com.huaweicloud.sdk.modelarts.v1.model;

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
 * 数据。
 */
public class Data {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 数据来源的类型，可选值为dataset、obs、swr、model、label_task、service、image。
     */
    public static final class TypeEnum {

        /**
         * Enum DATASET_ for value: "dataset：数据集。"
         */
        public static final TypeEnum DATASET_ = new TypeEnum("dataset：数据集。");

        /**
         * Enum OBS_OBS_ for value: "obs：OBS文件。"
         */
        public static final TypeEnum OBS_OBS_ = new TypeEnum("obs：OBS文件。");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("dataset：数据集。", DATASET_);
            map.put("obs：OBS文件。", OBS_OBS_);
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
    @JsonProperty(value = "value")

    private Map<String, Object> value = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_steps")

    private List<String> usedSteps = null;

    public Data withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 训练数据的名称。填写1-64位，仅包含英文、数字、下划线（_）和中划线（-），并且以英文开头的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 数据来源的类型，可选值为dataset、obs、swr、model、label_task、service、image。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Data withValue(Map<String, Object> value) {
        this.value = value;
        return this;
    }

    public Data putValueItem(String key, Object valueItem) {
        if (this.value == null) {
            this.value = new HashMap<>();
        }
        this.value.put(key, valueItem);
        return this;
    }

    public Data withValue(Consumer<Map<String, Object>> valueSetter) {
        if (this.value == null) {
            this.value = new HashMap<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /**
     * 数据的值。
     * @return value
     */
    public Map<String, Object> getValue() {
        return value;
    }

    public void setValue(Map<String, Object> value) {
        this.value = value;
    }

    public Data withUsedSteps(List<String> usedSteps) {
        this.usedSteps = usedSteps;
        return this;
    }

    public Data addUsedStepsItem(String usedStepsItem) {
        if (this.usedSteps == null) {
            this.usedSteps = new ArrayList<>();
        }
        this.usedSteps.add(usedStepsItem);
        return this;
    }

    public Data withUsedSteps(Consumer<List<String>> usedStepsSetter) {
        if (this.usedSteps == null) {
            this.usedSteps = new ArrayList<>();
        }
        usedStepsSetter.accept(this.usedSteps);
        return this;
    }

    /**
     * 使用数据的节点。
     * @return usedSteps
     */
    public List<String> getUsedSteps() {
        return usedSteps;
    }

    public void setUsedSteps(List<String> usedSteps) {
        this.usedSteps = usedSteps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Data that = (Data) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.value, that.value) && Objects.equals(this.usedSteps, that.usedSteps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, value, usedSteps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Data {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    usedSteps: ").append(toIndentedString(usedSteps)).append("\n");
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
