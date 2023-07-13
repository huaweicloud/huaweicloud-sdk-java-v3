package com.huaweicloud.sdk.cbr.v1.model;

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
 * PolicyCreate
 */
public class PolicyCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_definition")

    private PolicyoODCreate operationDefinition;

    /**
     * 策略类型，如备份，复制 Enum:[ backup，replication]
     */
    public static final class OperationTypeEnum {

        /**
         * Enum BACKUP for value: "backup"
         */
        public static final OperationTypeEnum BACKUP = new OperationTypeEnum("backup");

        /**
         * Enum REPLICATION for value: "replication"
         */
        public static final OperationTypeEnum REPLICATION = new OperationTypeEnum("replication");

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("backup", BACKUP);
            map.put("replication", REPLICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypeEnum(String value) {
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
        public static OperationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationTypeEnum(value));
        }

        public static OperationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypeEnum) {
                return this.value.equals(((OperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private OperationTypeEnum operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private PolicyTriggerReq trigger;

    public PolicyCreate withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用策略
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public PolicyCreate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称，长度限制：1- 64，只能由中文、字母、数字、“_”、“-”组成。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PolicyCreate withOperationDefinition(PolicyoODCreate operationDefinition) {
        this.operationDefinition = operationDefinition;
        return this;
    }

    public PolicyCreate withOperationDefinition(Consumer<PolicyoODCreate> operationDefinitionSetter) {
        if (this.operationDefinition == null) {
            this.operationDefinition = new PolicyoODCreate();
            operationDefinitionSetter.accept(this.operationDefinition);
        }

        return this;
    }

    /**
     * Get operationDefinition
     * @return operationDefinition
     */
    public PolicyoODCreate getOperationDefinition() {
        return operationDefinition;
    }

    public void setOperationDefinition(PolicyoODCreate operationDefinition) {
        this.operationDefinition = operationDefinition;
    }

    public PolicyCreate withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 策略类型，如备份，复制 Enum:[ backup，replication]
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public PolicyCreate withTrigger(PolicyTriggerReq trigger) {
        this.trigger = trigger;
        return this;
    }

    public PolicyCreate withTrigger(Consumer<PolicyTriggerReq> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new PolicyTriggerReq();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public PolicyTriggerReq getTrigger() {
        return trigger;
    }

    public void setTrigger(PolicyTriggerReq trigger) {
        this.trigger = trigger;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyCreate that = (PolicyCreate) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.name, that.name)
            && Objects.equals(this.operationDefinition, that.operationDefinition)
            && Objects.equals(this.operationType, that.operationType) && Objects.equals(this.trigger, that.trigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, name, operationDefinition, operationType, trigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyCreate {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operationDefinition: ").append(toIndentedString(operationDefinition)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
