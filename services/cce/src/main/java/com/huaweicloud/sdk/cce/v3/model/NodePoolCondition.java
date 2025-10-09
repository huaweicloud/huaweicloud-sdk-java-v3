package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 节点池/伸缩组详细状态。
 */
public class NodePoolCondition {

    /**
     * **参数解释**： 状态类型。 **约束限制**： 不涉及 **取值范围**： - \"TaintSynchronizing\": 节点池正在同步节点K8s污点，不影响节点池可扩容状态（该状态类型为节点池级别，伸缩组中无该状态类型）。 - \"LabelSynchronizing\": 节点池正在同步节点K8s标签，不影响节点池可扩容状态（该状态类型为节点池级别，伸缩组中无该状态类型）。 - \"UserTagsSynchronizing\": 节点池正在同步节点资源标签，不影响节点池可扩容状态（该状态类型为节点池级别，伸缩组中无该状态类型）。 - \"ConfigurationSynchronizing\": 节点池正在同步节点配置，不影响节点池可扩容状态（该状态类型为节点池级别，伸缩组中无该状态类型）。 - \"Scalable\"：节点池/伸缩组实际的可扩容状态，如果状态为\"False\"时则不会再次触发节点池扩容行为。 - \"QuotaInsufficient\"：节点池/伸缩组扩容依赖的配额不足，影响节点池可扩容状态。 - \"ResourceInsufficient\"：节点池/伸缩组扩容依赖的资源不足，影响节点池可扩容状态。 - \"UnexpectedError\"：节点池/伸缩组非预期扩容失败，影响节点池可扩容状态。 [- \"LockedByOrder\"：节点池/伸缩组被订单锁定，此时Reason为待支付订单ID。](tag:hws,hws_hk) - \"Error\"：节点池/伸缩组错误，通常由于删除失败触发。  **默认取值**： 不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum TAINTSYNCHRONIZING for value: "TaintSynchronizing"
         */
        public static final TypeEnum TAINTSYNCHRONIZING = new TypeEnum("TaintSynchronizing");

        /**
         * Enum LABELSYNCHRONIZING for value: "LabelSynchronizing"
         */
        public static final TypeEnum LABELSYNCHRONIZING = new TypeEnum("LabelSynchronizing");

        /**
         * Enum USERTAGSSYNCHRONIZING for value: "UserTagsSynchronizing"
         */
        public static final TypeEnum USERTAGSSYNCHRONIZING = new TypeEnum("UserTagsSynchronizing");

        /**
         * Enum CONFIGURATIONSYNCHRONIZING for value: "ConfigurationSynchronizing"
         */
        public static final TypeEnum CONFIGURATIONSYNCHRONIZING = new TypeEnum("ConfigurationSynchronizing");

        /**
         * Enum SCALABLE for value: "Scalable"
         */
        public static final TypeEnum SCALABLE = new TypeEnum("Scalable");

        /**
         * Enum QUOTAINSUFFICIENT for value: "QuotaInsufficient"
         */
        public static final TypeEnum QUOTAINSUFFICIENT = new TypeEnum("QuotaInsufficient");

        /**
         * Enum RESOURCEINSUFFICIENT for value: "ResourceInsufficient"
         */
        public static final TypeEnum RESOURCEINSUFFICIENT = new TypeEnum("ResourceInsufficient");

        /**
         * Enum UNEXPECTEDERROR for value: "UnexpectedError"
         */
        public static final TypeEnum UNEXPECTEDERROR = new TypeEnum("UnexpectedError");

        /**
         * Enum LOCKEDBYORDER for value: "LockedByOrder"
         */
        public static final TypeEnum LOCKEDBYORDER = new TypeEnum("LockedByOrder");

        /**
         * Enum ERROR for value: "Error"
         */
        public static final TypeEnum ERROR = new TypeEnum("Error");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("TaintSynchronizing", TAINTSYNCHRONIZING);
            map.put("LabelSynchronizing", LABELSYNCHRONIZING);
            map.put("UserTagsSynchronizing", USERTAGSSYNCHRONIZING);
            map.put("ConfigurationSynchronizing", CONFIGURATIONSYNCHRONIZING);
            map.put("Scalable", SCALABLE);
            map.put("QuotaInsufficient", QUOTAINSUFFICIENT);
            map.put("ResourceInsufficient", RESOURCEINSUFFICIENT);
            map.put("UnexpectedError", UNEXPECTEDERROR);
            map.put("LockedByOrder", LOCKEDBYORDER);
            map.put("Error", ERROR);
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
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastProbeTime")

    private String lastProbeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastTransitTime")

    private String lastTransitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public NodePoolCondition withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 状态类型。 **约束限制**： 不涉及 **取值范围**： - \"TaintSynchronizing\": 节点池正在同步节点K8s污点，不影响节点池可扩容状态（该状态类型为节点池级别，伸缩组中无该状态类型）。 - \"LabelSynchronizing\": 节点池正在同步节点K8s标签，不影响节点池可扩容状态（该状态类型为节点池级别，伸缩组中无该状态类型）。 - \"UserTagsSynchronizing\": 节点池正在同步节点资源标签，不影响节点池可扩容状态（该状态类型为节点池级别，伸缩组中无该状态类型）。 - \"ConfigurationSynchronizing\": 节点池正在同步节点配置，不影响节点池可扩容状态（该状态类型为节点池级别，伸缩组中无该状态类型）。 - \"Scalable\"：节点池/伸缩组实际的可扩容状态，如果状态为\"False\"时则不会再次触发节点池扩容行为。 - \"QuotaInsufficient\"：节点池/伸缩组扩容依赖的配额不足，影响节点池可扩容状态。 - \"ResourceInsufficient\"：节点池/伸缩组扩容依赖的资源不足，影响节点池可扩容状态。 - \"UnexpectedError\"：节点池/伸缩组非预期扩容失败，影响节点池可扩容状态。 [- \"LockedByOrder\"：节点池/伸缩组被订单锁定，此时Reason为待支付订单ID。](tag:hws,hws_hk) - \"Error\"：节点池/伸缩组错误，通常由于删除失败触发。  **默认取值**： 不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public NodePoolCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Condition当前状态，取值如下 - \"True\" - \"False\" 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NodePoolCondition withLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
        return this;
    }

    /**
     * 上次状态检查时间。
     * @return lastProbeTime
     */
    public String getLastProbeTime() {
        return lastProbeTime;
    }

    public void setLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
    }

    public NodePoolCondition withLastTransitTime(String lastTransitTime) {
        this.lastTransitTime = lastTransitTime;
        return this;
    }

    /**
     * 上次状态变更时间。
     * @return lastTransitTime
     */
    public String getLastTransitTime() {
        return lastTransitTime;
    }

    public void setLastTransitTime(String lastTransitTime) {
        this.lastTransitTime = lastTransitTime;
    }

    public NodePoolCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 上次状态变更原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public NodePoolCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Condition详细描述。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodePoolCondition that = (NodePoolCondition) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.status, that.status)
            && Objects.equals(this.lastProbeTime, that.lastProbeTime)
            && Objects.equals(this.lastTransitTime, that.lastTransitTime) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, status, lastProbeTime, lastTransitTime, reason, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolCondition {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
        sb.append("    lastTransitTime: ").append(toIndentedString(lastTransitTime)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
