package com.huaweicloud.sdk.cbr.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.PolicyTriggerReq;
import com.huaweicloud.sdk.cbr.v1.model.PolicyoODCreate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PolicyCreate
 */
public class PolicyCreate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enabled")
    
    private Boolean enabled = true;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_definition")
    
    private PolicyoODCreate operationDefinition = null;
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OperationTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationTypeEnum(value);
            }
            return result;
        }

        public static OperationTypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof OperationTypeEnum) {
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
    @JsonProperty(value="operation_type")
    
    private OperationTypeEnum operationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger")
    
    private PolicyTriggerReq trigger = null;

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
        if(this.operationDefinition == null ){
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
        if(this.trigger == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyCreate policyCreate = (PolicyCreate) o;
        return Objects.equals(this.enabled, policyCreate.enabled) &&
            Objects.equals(this.name, policyCreate.name) &&
            Objects.equals(this.operationDefinition, policyCreate.operationDefinition) &&
            Objects.equals(this.operationType, policyCreate.operationType) &&
            Objects.equals(this.trigger, policyCreate.trigger);
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

