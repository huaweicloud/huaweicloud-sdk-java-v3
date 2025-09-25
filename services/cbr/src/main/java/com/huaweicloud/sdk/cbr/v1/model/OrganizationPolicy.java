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
 * 组织策略
 */
public class OrganizationPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 组织策略类型 - backup: 备份 -  replication: 复制
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
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_enabled")

    private Boolean policyEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_operation_definition")

    private PolicyoODCreate policyOperationDefinition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_trigger")

    private PolicyTriggerReq policyTrigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_scope")

    private String effectiveScope;

    public OrganizationPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 组织策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OrganizationPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组织策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 组织策略描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrganizationPolicy withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 组织策略类型 - backup: 备份 -  replication: 复制
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public OrganizationPolicy withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 组织策略所属账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public OrganizationPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public OrganizationPolicy withPolicyEnabled(Boolean policyEnabled) {
        this.policyEnabled = policyEnabled;
        return this;
    }

    /**
     * 策略是否开启
     * @return policyEnabled
     */
    public Boolean getPolicyEnabled() {
        return policyEnabled;
    }

    public void setPolicyEnabled(Boolean policyEnabled) {
        this.policyEnabled = policyEnabled;
    }

    public OrganizationPolicy withPolicyOperationDefinition(PolicyoODCreate policyOperationDefinition) {
        this.policyOperationDefinition = policyOperationDefinition;
        return this;
    }

    public OrganizationPolicy withPolicyOperationDefinition(Consumer<PolicyoODCreate> policyOperationDefinitionSetter) {
        if (this.policyOperationDefinition == null) {
            this.policyOperationDefinition = new PolicyoODCreate();
            policyOperationDefinitionSetter.accept(this.policyOperationDefinition);
        }

        return this;
    }

    /**
     * Get policyOperationDefinition
     * @return policyOperationDefinition
     */
    public PolicyoODCreate getPolicyOperationDefinition() {
        return policyOperationDefinition;
    }

    public void setPolicyOperationDefinition(PolicyoODCreate policyOperationDefinition) {
        this.policyOperationDefinition = policyOperationDefinition;
    }

    public OrganizationPolicy withPolicyTrigger(PolicyTriggerReq policyTrigger) {
        this.policyTrigger = policyTrigger;
        return this;
    }

    public OrganizationPolicy withPolicyTrigger(Consumer<PolicyTriggerReq> policyTriggerSetter) {
        if (this.policyTrigger == null) {
            this.policyTrigger = new PolicyTriggerReq();
            policyTriggerSetter.accept(this.policyTrigger);
        }

        return this;
    }

    /**
     * Get policyTrigger
     * @return policyTrigger
     */
    public PolicyTriggerReq getPolicyTrigger() {
        return policyTrigger;
    }

    public void setPolicyTrigger(PolicyTriggerReq policyTrigger) {
        this.policyTrigger = policyTrigger;
    }

    public OrganizationPolicy withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 组织策略状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrganizationPolicy withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 组织策略所属账号
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public OrganizationPolicy withEffectiveScope(String effectiveScope) {
        this.effectiveScope = effectiveScope;
        return this;
    }

    /**
     * 组织策略生效范围
     * @return effectiveScope
     */
    public String getEffectiveScope() {
        return effectiveScope;
    }

    public void setEffectiveScope(String effectiveScope) {
        this.effectiveScope = effectiveScope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrganizationPolicy that = (OrganizationPolicy) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.operationType, that.operationType) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.policyEnabled, that.policyEnabled)
            && Objects.equals(this.policyOperationDefinition, that.policyOperationDefinition)
            && Objects.equals(this.policyTrigger, that.policyTrigger) && Objects.equals(this.status, that.status)
            && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.effectiveScope, that.effectiveScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            operationType,
            domainId,
            policyName,
            policyEnabled,
            policyOperationDefinition,
            policyTrigger,
            status,
            domainName,
            effectiveScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationPolicy {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyEnabled: ").append(toIndentedString(policyEnabled)).append("\n");
        sb.append("    policyOperationDefinition: ").append(toIndentedString(policyOperationDefinition)).append("\n");
        sb.append("    policyTrigger: ").append(toIndentedString(policyTrigger)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    effectiveScope: ").append(toIndentedString(effectiveScope)).append("\n");
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
