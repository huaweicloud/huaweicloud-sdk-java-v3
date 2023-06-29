package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AgentDimension
 */
public class AgentDimension {

    /**
     * 维度名称，枚举类型，类型有：   mount_point：挂载点，   disk：磁盘，   proc：进程，   gpu：显卡，   raid: RAID控制器
     */
    public static final class NameEnum {

        /**
         * Enum MOUNT_POINT for value: "mount_point"
         */
        public static final NameEnum MOUNT_POINT = new NameEnum("mount_point");

        /**
         * Enum DISK for value: "disk"
         */
        public static final NameEnum DISK = new NameEnum("disk");

        /**
         * Enum PROC for value: "proc"
         */
        public static final NameEnum PROC = new NameEnum("proc");

        /**
         * Enum GPU for value: "gpu"
         */
        public static final NameEnum GPU = new NameEnum("gpu");

        /**
         * Enum RAID for value: "raid"
         */
        public static final NameEnum RAID = new NameEnum("raid");

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("mount_point", MOUNT_POINT);
            map.put("disk", DISK);
            map.put("proc", PROC);
            map.put("gpu", GPU);
            map.put("raid", RAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
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
        public static NameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NameEnum(value));
        }

        public static NameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private NameEnum name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_value")

    private String originValue;

    public AgentDimension withName(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * 维度名称，枚举类型，类型有：   mount_point：挂载点，   disk：磁盘，   proc：进程，   gpu：显卡，   raid: RAID控制器
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public AgentDimension withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 维度值，32位字符串，如：2e84018fc8b4484b94e89aae212fe615
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public AgentDimension withOriginValue(String originValue) {
        this.originValue = originValue;
        return this;
    }

    /**
     * 实际维度信息，字符串，如：vda。
     * @return originValue
     */
    public String getOriginValue() {
        return originValue;
    }

    public void setOriginValue(String originValue) {
        this.originValue = originValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentDimension that = (AgentDimension) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value)
            && Objects.equals(this.originValue, that.originValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, originValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentDimension {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    originValue: ").append(toIndentedString(originValue)).append("\n");
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
