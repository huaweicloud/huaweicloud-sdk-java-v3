package com.huaweicloud.sdk.ces.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAgentInvocationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * **参数解释**: 主机类型，仅支持ECS弹性云服务器和BMS裸金属服务器 **约束限制**: 不涉及 **取值范围**: - ECS: 弹性云服务器 - BMS：裸金属服务器 **默认取值**: 不涉及 
     */
    public static final class InstanceTypeEnum {

        /**
         * Enum ECS for value: "ECS"
         */
        public static final InstanceTypeEnum ECS = new InstanceTypeEnum("ECS");

        /**
         * Enum BMS for value: "BMS"
         */
        public static final InstanceTypeEnum BMS = new InstanceTypeEnum("BMS");

        private static final Map<String, InstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceTypeEnum> createStaticFields() {
            Map<String, InstanceTypeEnum> map = new HashMap<>();
            map.put("ECS", ECS);
            map.put("BMS", BMS);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_id")

    private String invocationId;

    /**
     * **参数解释**: 任务类型, 仅包含：INSTALL安装, UPDATE升级, ROLLBACK回退，RETRY重试，SET_REMOTE_INSTALLER设置远程安装主机，REMOTE_INSTALL执行远程安装。 **约束限制**: 不涉及。 **取值范围**: - INSTALL：安装 - UPDATE：升级 - ROLLBACK：回退 - RETRY：重试 - SET_REMOTE_INSTALLER：设置远程安装主机 - REMOTE_INSTALL：执行远程安装 **默认取值**: 不涉及 
     */
    public static final class InvocationTypeEnum {

        /**
         * Enum INSTALL for value: "INSTALL"
         */
        public static final InvocationTypeEnum INSTALL = new InvocationTypeEnum("INSTALL");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final InvocationTypeEnum UPDATE = new InvocationTypeEnum("UPDATE");

        /**
         * Enum ROLLBACK for value: "ROLLBACK"
         */
        public static final InvocationTypeEnum ROLLBACK = new InvocationTypeEnum("ROLLBACK");

        /**
         * Enum RETRY for value: "RETRY"
         */
        public static final InvocationTypeEnum RETRY = new InvocationTypeEnum("RETRY");

        /**
         * Enum SET_REMOTE_INSTALLER for value: "SET_REMOTE_INSTALLER"
         */
        public static final InvocationTypeEnum SET_REMOTE_INSTALLER = new InvocationTypeEnum("SET_REMOTE_INSTALLER");

        /**
         * Enum REMOTE_INSTALL for value: "REMOTE_INSTALL"
         */
        public static final InvocationTypeEnum REMOTE_INSTALL = new InvocationTypeEnum("REMOTE_INSTALL");

        private static final Map<String, InvocationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvocationTypeEnum> createStaticFields() {
            Map<String, InvocationTypeEnum> map = new HashMap<>();
            map.put("INSTALL", INSTALL);
            map.put("UPDATE", UPDATE);
            map.put("ROLLBACK", ROLLBACK);
            map.put("RETRY", RETRY);
            map.put("SET_REMOTE_INSTALLER", SET_REMOTE_INSTALLER);
            map.put("REMOTE_INSTALL", REMOTE_INSTALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InvocationTypeEnum(String value) {
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
        public static InvocationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InvocationTypeEnum(value));
        }

        public static InvocationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InvocationTypeEnum) {
                return this.value.equals(((InvocationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_type")

    private InvocationTypeEnum invocationType;

    /**
     * **参数解释**: 任务对象, 支持telescope监控 **约束限制**: 不涉及。 **取值范围**: - telescope: 主机监控插件telescope **默认取值**: telescope。 
     */
    public static final class InvocationTargetEnum {

        /**
         * Enum TELESCOPE for value: "telescope"
         */
        public static final InvocationTargetEnum TELESCOPE = new InvocationTargetEnum("telescope");

        private static final Map<String, InvocationTargetEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvocationTargetEnum> createStaticFields() {
            Map<String, InvocationTargetEnum> map = new HashMap<>();
            map.put("telescope", TELESCOPE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InvocationTargetEnum(String value) {
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
        public static InvocationTargetEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InvocationTargetEnum(value));
        }

        public static InvocationTargetEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InvocationTargetEnum) {
                return this.value.equals(((InvocationTargetEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_target")

    private InvocationTargetEnum invocationTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListAgentInvocationsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 主机id **约束限制**: 不涉及 **取值范围**: 1到64个字符的字符串，且只包含字母、数字和连字符 **默认取值**: 不涉及 
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListAgentInvocationsRequest withInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * **参数解释**: 主机类型，仅支持ECS弹性云服务器和BMS裸金属服务器 **约束限制**: 不涉及 **取值范围**: - ECS: 弹性云服务器 - BMS：裸金属服务器 **默认取值**: 不涉及 
     * @return instanceType
     */
    public InstanceTypeEnum getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
    }

    public ListAgentInvocationsRequest withInvocationId(String invocationId) {
        this.invocationId = invocationId;
        return this;
    }

    /**
     * **参数解释**: 任务id **约束限制**: 不涉及 **取值范围**: 以字母或数字开头，后续可包含字母、数字、下划线或连字符的字符串，长度至少为 1 **默认取值**: 不涉及 
     * @return invocationId
     */
    public String getInvocationId() {
        return invocationId;
    }

    public void setInvocationId(String invocationId) {
        this.invocationId = invocationId;
    }

    public ListAgentInvocationsRequest withInvocationType(InvocationTypeEnum invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    /**
     * **参数解释**: 任务类型, 仅包含：INSTALL安装, UPDATE升级, ROLLBACK回退，RETRY重试，SET_REMOTE_INSTALLER设置远程安装主机，REMOTE_INSTALL执行远程安装。 **约束限制**: 不涉及。 **取值范围**: - INSTALL：安装 - UPDATE：升级 - ROLLBACK：回退 - RETRY：重试 - SET_REMOTE_INSTALLER：设置远程安装主机 - REMOTE_INSTALL：执行远程安装 **默认取值**: 不涉及 
     * @return invocationType
     */
    public InvocationTypeEnum getInvocationType() {
        return invocationType;
    }

    public void setInvocationType(InvocationTypeEnum invocationType) {
        this.invocationType = invocationType;
    }

    public ListAgentInvocationsRequest withInvocationTarget(InvocationTargetEnum invocationTarget) {
        this.invocationTarget = invocationTarget;
        return this;
    }

    /**
     * **参数解释**: 任务对象, 支持telescope监控 **约束限制**: 不涉及。 **取值范围**: - telescope: 主机监控插件telescope **默认取值**: telescope。 
     * @return invocationTarget
     */
    public InvocationTargetEnum getInvocationTarget() {
        return invocationTarget;
    }

    public void setInvocationTarget(InvocationTargetEnum invocationTarget) {
        this.invocationTarget = invocationTarget;
    }

    public ListAgentInvocationsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 分页偏移量 **约束限制**: 不涉及 **取值范围**: 数字范围为[0,9999999999999] **默认取值**: 0 
     * minimum: 0
     * maximum: 9999999999999
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListAgentInvocationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 分页大小。 **约束限制**: 不涉及。 **取值范围**: 数字范围为[1,100] **默认取值**: 100 
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgentInvocationsRequest that = (ListAgentInvocationsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.invocationId, that.invocationId)
            && Objects.equals(this.invocationType, that.invocationType)
            && Objects.equals(this.invocationTarget, that.invocationTarget) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceType, invocationId, invocationType, invocationTarget, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentInvocationsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    invocationId: ").append(toIndentedString(invocationId)).append("\n");
        sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
        sb.append("    invocationTarget: ").append(toIndentedString(invocationTarget)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
