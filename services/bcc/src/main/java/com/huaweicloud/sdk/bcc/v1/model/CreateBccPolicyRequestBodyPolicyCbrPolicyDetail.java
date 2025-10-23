package com.huaweicloud.sdk.bcc.v1.model;

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
 * cbr策略详情
 */
public class CreateBccPolicyRequestBodyPolicyCbrPolicyDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_definition")

    private CreateBccPolicyRequestBodyPolicyCbrPolicyDetailOperationDefinition operationDefinition;

    /**
     * 保护类型,本地备份backup，异地复制replication
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

    private CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger trigger;

    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetail withOperationDefinition(
        CreateBccPolicyRequestBodyPolicyCbrPolicyDetailOperationDefinition operationDefinition) {
        this.operationDefinition = operationDefinition;
        return this;
    }

    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetail withOperationDefinition(
        Consumer<CreateBccPolicyRequestBodyPolicyCbrPolicyDetailOperationDefinition> operationDefinitionSetter) {
        if (this.operationDefinition == null) {
            this.operationDefinition = new CreateBccPolicyRequestBodyPolicyCbrPolicyDetailOperationDefinition();
            operationDefinitionSetter.accept(this.operationDefinition);
        }

        return this;
    }

    /**
     * Get operationDefinition
     * @return operationDefinition
     */
    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetailOperationDefinition getOperationDefinition() {
        return operationDefinition;
    }

    public void setOperationDefinition(
        CreateBccPolicyRequestBodyPolicyCbrPolicyDetailOperationDefinition operationDefinition) {
        this.operationDefinition = operationDefinition;
    }

    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetail withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 保护类型,本地备份backup，异地复制replication
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetail withTrigger(
        CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetail withTrigger(
        Consumer<CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger getTrigger() {
        return trigger;
    }

    public void setTrigger(CreateBccPolicyRequestBodyPolicyCbrPolicyDetailTrigger trigger) {
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
        CreateBccPolicyRequestBodyPolicyCbrPolicyDetail that = (CreateBccPolicyRequestBodyPolicyCbrPolicyDetail) obj;
        return Objects.equals(this.operationDefinition, that.operationDefinition)
            && Objects.equals(this.operationType, that.operationType) && Objects.equals(this.trigger, that.trigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationDefinition, operationType, trigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBccPolicyRequestBodyPolicyCbrPolicyDetail {\n");
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
