package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Policy
 */
public class Policy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    @JacksonXmlProperty(localName = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_definition")

    @JacksonXmlProperty(localName = "operation_definition")

    private PolicyoODCreate operationDefinition;

    /**
     * 策略类型,例如 ‘backup’：自动备份
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
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationTypeEnum(value);
            }
            return result;
        }

        public static OperationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "operation_type")

    private OperationTypeEnum operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    @JacksonXmlProperty(localName = "trigger")

    private PolicyTriggerResp trigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_vaults")

    @JacksonXmlProperty(localName = "associated_vaults")

    private List<PolicyAssociateVault> associatedVaults = null;

    public Policy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 策略是否启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Policy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Policy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Policy withOperationDefinition(PolicyoODCreate operationDefinition) {
        this.operationDefinition = operationDefinition;
        return this;
    }

    public Policy withOperationDefinition(Consumer<PolicyoODCreate> operationDefinitionSetter) {
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

    public Policy withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 策略类型,例如 ‘backup’：自动备份
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public Policy withTrigger(PolicyTriggerResp trigger) {
        this.trigger = trigger;
        return this;
    }

    public Policy withTrigger(Consumer<PolicyTriggerResp> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new PolicyTriggerResp();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public PolicyTriggerResp getTrigger() {
        return trigger;
    }

    public void setTrigger(PolicyTriggerResp trigger) {
        this.trigger = trigger;
    }

    public Policy withAssociatedVaults(List<PolicyAssociateVault> associatedVaults) {
        this.associatedVaults = associatedVaults;
        return this;
    }

    public Policy addAssociatedVaultsItem(PolicyAssociateVault associatedVaultsItem) {
        if (this.associatedVaults == null) {
            this.associatedVaults = new ArrayList<>();
        }
        this.associatedVaults.add(associatedVaultsItem);
        return this;
    }

    public Policy withAssociatedVaults(Consumer<List<PolicyAssociateVault>> associatedVaultsSetter) {
        if (this.associatedVaults == null) {
            this.associatedVaults = new ArrayList<>();
        }
        associatedVaultsSetter.accept(this.associatedVaults);
        return this;
    }

    /**
     * 关联的存储库
     * @return associatedVaults
     */
    public List<PolicyAssociateVault> getAssociatedVaults() {
        return associatedVaults;
    }

    public void setAssociatedVaults(List<PolicyAssociateVault> associatedVaults) {
        this.associatedVaults = associatedVaults;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Policy policy = (Policy) o;
        return Objects.equals(this.enabled, policy.enabled) && Objects.equals(this.id, policy.id)
            && Objects.equals(this.name, policy.name)
            && Objects.equals(this.operationDefinition, policy.operationDefinition)
            && Objects.equals(this.operationType, policy.operationType) && Objects.equals(this.trigger, policy.trigger)
            && Objects.equals(this.associatedVaults, policy.associatedVaults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, id, name, operationDefinition, operationType, trigger, associatedVaults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Policy {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operationDefinition: ").append(toIndentedString(operationDefinition)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    associatedVaults: ").append(toIndentedString(associatedVaults)).append("\n");
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
