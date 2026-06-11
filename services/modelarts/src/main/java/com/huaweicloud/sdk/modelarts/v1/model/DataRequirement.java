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
 * 工作流需要的数据。
 */
public class DataRequirement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 数据来源类型。枚举值如下： - dataset：数据集 - obs：OBS - swr：SWR - model_list：AI应用列表 - label_task：标注任务 - service：在线服务
     */
    public static final class TypeEnum {

        /**
         * Enum DATASET_ for value: "dataset：数据集"
         */
        public static final TypeEnum DATASET_ = new TypeEnum("dataset：数据集");

        /**
         * Enum OBS_OBS_ for value: "obs：OBS文件"
         */
        public static final TypeEnum OBS_OBS_ = new TypeEnum("obs：OBS文件");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("dataset：数据集", DATASET_);
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
    @JsonProperty(value = "conditions")

    private List<Constraint> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Map<String, Object> value = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_steps")

    private List<String> usedSteps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Boolean delay;

    public DataRequirement withName(String name) {
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

    public DataRequirement withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 数据来源类型。枚举值如下： - dataset：数据集 - obs：OBS - swr：SWR - model_list：AI应用列表 - label_task：标注任务 - service：在线服务
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DataRequirement withConditions(List<Constraint> conditions) {
        this.conditions = conditions;
        return this;
    }

    public DataRequirement addConditionsItem(Constraint conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public DataRequirement withConditions(Consumer<List<Constraint>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 数据约束条件。
     * @return conditions
     */
    public List<Constraint> getConditions() {
        return conditions;
    }

    public void setConditions(List<Constraint> conditions) {
        this.conditions = conditions;
    }

    public DataRequirement withValue(Map<String, Object> value) {
        this.value = value;
        return this;
    }

    public DataRequirement putValueItem(String key, Object valueItem) {
        if (this.value == null) {
            this.value = new HashMap<>();
        }
        this.value.put(key, valueItem);
        return this;
    }

    public DataRequirement withValue(Consumer<Map<String, Object>> valueSetter) {
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

    public DataRequirement withUsedSteps(List<String> usedSteps) {
        this.usedSteps = usedSteps;
        return this;
    }

    public DataRequirement addUsedStepsItem(String usedStepsItem) {
        if (this.usedSteps == null) {
            this.usedSteps = new ArrayList<>();
        }
        this.usedSteps.add(usedStepsItem);
        return this;
    }

    public DataRequirement withUsedSteps(Consumer<List<String>> usedStepsSetter) {
        if (this.usedSteps == null) {
            this.usedSteps = new ArrayList<>();
        }
        usedStepsSetter.accept(this.usedSteps);
        return this;
    }

    /**
     * 使用了这条数据的工作流节点。
     * @return usedSteps
     */
    public List<String> getUsedSteps() {
        return usedSteps;
    }

    public void setUsedSteps(List<String> usedSteps) {
        this.usedSteps = usedSteps;
    }

    public DataRequirement withDelay(Boolean delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 延时参数标记。
     * @return delay
     */
    public Boolean getDelay() {
        return delay;
    }

    public void setDelay(Boolean delay) {
        this.delay = delay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataRequirement that = (DataRequirement) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.conditions, that.conditions) && Objects.equals(this.value, that.value)
            && Objects.equals(this.usedSteps, that.usedSteps) && Objects.equals(this.delay, that.delay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, conditions, value, usedSteps, delay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataRequirement {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    usedSteps: ").append(toIndentedString(usedSteps)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
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
