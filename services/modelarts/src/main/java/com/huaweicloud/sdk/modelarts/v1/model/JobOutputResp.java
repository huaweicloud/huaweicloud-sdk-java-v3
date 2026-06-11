package com.huaweicloud.sdk.modelarts.v1.model;

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
 * 作业输出。
 */
public class JobOutputResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释**：输出项类型。 **取值范围**：枚举值如下： - obs：OBS - model：AI应用元模型
     */
    public static final class TypeEnum {

        /**
         * Enum DATASET_ for value: "dataset：数据集。"
         */
        public static final TypeEnum DATASET_ = new TypeEnum("dataset：数据集。");

        /**
         * Enum OBS_OBS_ for value: "obs：OBS文件"
         */
        public static final TypeEnum OBS_OBS_ = new TypeEnum("obs：OBS文件");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("dataset：数据集。", DATASET_);
            map.put("obs：OBS文件", OBS_OBS_);
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
    @JsonProperty(value = "config")

    private Map<String, Object> config = null;

    public JobOutputResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：输出数据的名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobOutputResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：输出项类型。 **取值范围**：枚举值如下： - obs：OBS - model：AI应用元模型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public JobOutputResp withConfig(Map<String, Object> config) {
        this.config = config;
        return this;
    }

    public JobOutputResp putConfigItem(String key, Object configItem) {
        if (this.config == null) {
            this.config = new HashMap<>();
        }
        this.config.put(key, configItem);
        return this;
    }

    public JobOutputResp withConfig(Consumer<Map<String, Object>> configSetter) {
        if (this.config == null) {
            this.config = new HashMap<>();
        }
        configSetter.accept(this.config);
        return this;
    }

    /**
     * **参数解释**：输出配置。
     * @return config
     */
    public Map<String, Object> getConfig() {
        return config;
    }

    public void setConfig(Map<String, Object> config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobOutputResp that = (JobOutputResp) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobOutputResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
