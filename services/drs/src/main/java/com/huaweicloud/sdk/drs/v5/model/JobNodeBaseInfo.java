package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 任务实例基本信息体。
 */
public class JobNodeBaseInfo {

    /**
     * 实例类型。取值： - single：单机。 - ha：主备。
     */
    public static final class InstanceTypeEnum {

        /**
         * Enum SINGLE for value: "single"
         */
        public static final InstanceTypeEnum SINGLE = new InstanceTypeEnum("single");

        /**
         * Enum HA for value: "ha"
         */
        public static final InstanceTypeEnum HA = new InstanceTypeEnum("ha");

        private static final Map<String, InstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceTypeEnum> createStaticFields() {
            Map<String, InstanceTypeEnum> map = new HashMap<>();
            map.put("single", SINGLE);
            map.put("ha", HA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceTypeEnum(String value) {
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
        public static InstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceTypeEnum(value));
        }

        public static InstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceTypeEnum) {
                return this.value.equals(((InstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private InstanceTypeEnum instanceType;

    /**
     * CPU架构。取值： - x86 - arm
     */
    public static final class ArchEnum {

        /**
         * Enum X86 for value: "x86"
         */
        public static final ArchEnum X86 = new ArchEnum("x86");

        /**
         * Enum ARM for value: "arm"
         */
        public static final ArchEnum ARM = new ArchEnum("arm");

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("x86", X86);
            map.put("arm", ARM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchEnum(String value) {
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
        public static ArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ArchEnum(value));
        }

        public static ArchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchEnum) {
                return this.value.equals(((ArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private ArchEnum arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    public JobNodeBaseInfo withInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 实例类型。取值： - single：单机。 - ha：主备。
     * @return instanceType
     */
    public InstanceTypeEnum getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
    }

    public JobNodeBaseInfo withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /**
     * CPU架构。取值： - x86 - arm
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    public JobNodeBaseInfo withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用区ID。 约束：对于任务实例类型不是单机的实例，需要分别为实例所有节点指定可用区，并用“,”英文逗号隔开。示例： - 实例类型为single：\"cn-north-4a\" - 实例类型为ha：\"cn-north-4a,cn-north-4b\"
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public JobNodeBaseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。 CREATING：创建中，CREATE_FAILED：创建失败，CONFIGURATION：配置中，WAITING_FOR_START：等待启动中，RELEASE_RESOURCE_COMPLETE：已结束，DELETED：已删除，INCRE_TRANSFER_STARTED：增量迁移中，INCRE_TRANSFER_FAILED：增量迁移失败，FULL_TRANSFER_STARTED：全量迁移中，FULL_TRANSFER_COMPLETE：全量迁移完成，PAUSING：暂停中，FULL_TRANSFER_FAILED：全量迁移失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JobNodeBaseInfo withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 任务主备角色。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobNodeBaseInfo that = (JobNodeBaseInfo) obj;
        return Objects.equals(this.instanceType, that.instanceType) && Objects.equals(this.arch, that.arch)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.status, that.status)
            && Objects.equals(this.role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceType, arch, availabilityZone, status, role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobNodeBaseInfo {\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
