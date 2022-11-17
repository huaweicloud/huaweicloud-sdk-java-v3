package com.huaweicloud.sdk.clouddeploy.v2.model;

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
 * 部署参数类
 */
public class ConfigInfoDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 类型，如果填写name字段，则type必选,若type为空则默认为text
     */
    public static final class TypeEnum {

        /**
         * Enum TEXT for value: "text"
         */
        public static final TypeEnum TEXT = new TypeEnum("text");

        /**
         * Enum HOST_GROUP for value: "host_group"
         */
        public static final TypeEnum HOST_GROUP = new TypeEnum("host_group");

        /**
         * Enum ENUM for value: "enum"
         */
        public static final TypeEnum ENUM = new TypeEnum("enum");

        /**
         * Enum ENCRYPT for value: "encrypt"
         */
        public static final TypeEnum ENCRYPT = new TypeEnum("encrypt");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("text", TEXT);
            map.put("host_group", HOST_GROUP);
            map.put("enum", ENUM);
            map.put("encrypt", ENCRYPT);
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
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    /**
     * 表示是否为静态参数，值为1时不支持执行时变更参数，值为0时支持，并且也会把该参数上报流水线
     */
    public static final class StaticStatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StaticStatusEnum NUMBER_0 = new StaticStatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StaticStatusEnum NUMBER_1 = new StaticStatusEnum(1);

        private static final Map<Integer, StaticStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StaticStatusEnum> createStaticFields() {
            Map<Integer, StaticStatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StaticStatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StaticStatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StaticStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StaticStatusEnum(value);
            }
            return result;
        }

        public static StaticStatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            StaticStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StaticStatusEnum) {
                return this.value.equals(((StaticStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_status")

    private StaticStatusEnum staticStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private List<ParamTypeLimits> limits = null;

    public ConfigInfoDO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 部署参数名称，用户可自定义
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConfigInfoDO withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 类型，如果填写name字段，则type必选,若type为空则默认为text
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ConfigInfoDO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConfigInfoDO withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 部署参数值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ConfigInfoDO withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 部署任务id，创建部署任务后由系统自动生成
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ConfigInfoDO withStaticStatus(StaticStatusEnum staticStatus) {
        this.staticStatus = staticStatus;
        return this;
    }

    /**
     * 表示是否为静态参数，值为1时不支持执行时变更参数，值为0时支持，并且也会把该参数上报流水线
     * @return staticStatus
     */
    public StaticStatusEnum getStaticStatus() {
        return staticStatus;
    }

    public void setStaticStatus(StaticStatusEnum staticStatus) {
        this.staticStatus = staticStatus;
    }

    public ConfigInfoDO withLimits(List<ParamTypeLimits> limits) {
        this.limits = limits;
        return this;
    }

    public ConfigInfoDO addLimitsItem(ParamTypeLimits limitsItem) {
        if (this.limits == null) {
            this.limits = new ArrayList<>();
        }
        this.limits.add(limitsItem);
        return this;
    }

    public ConfigInfoDO withLimits(Consumer<List<ParamTypeLimits>> limitsSetter) {
        if (this.limits == null) {
            this.limits = new ArrayList<>();
        }
        limitsSetter.accept(this.limits);
        return this;
    }

    /**
     * 当参数类型为enum枚举类型时，必须填写可选值
     * @return limits
     */
    public List<ParamTypeLimits> getLimits() {
        return limits;
    }

    public void setLimits(List<ParamTypeLimits> limits) {
        this.limits = limits;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigInfoDO configInfoDO = (ConfigInfoDO) o;
        return Objects.equals(this.name, configInfoDO.name) && Objects.equals(this.type, configInfoDO.type)
            && Objects.equals(this.description, configInfoDO.description)
            && Objects.equals(this.value, configInfoDO.value) && Objects.equals(this.taskId, configInfoDO.taskId)
            && Objects.equals(this.staticStatus, configInfoDO.staticStatus)
            && Objects.equals(this.limits, configInfoDO.limits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, description, value, taskId, staticStatus, limits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigInfoDO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    staticStatus: ").append(toIndentedString(staticStatus)).append("\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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
