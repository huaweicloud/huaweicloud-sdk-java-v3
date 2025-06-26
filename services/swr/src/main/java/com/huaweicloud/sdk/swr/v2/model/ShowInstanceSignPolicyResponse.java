package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceSignPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_id")

    private Integer namespaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private TriggerConfig trigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_rules")

    private List<SignScopeRule> scopeRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_key")

    private String signatureKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_method")

    private String signatureMethod;

    public ShowInstanceSignPolicyResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 签名策略ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowInstanceSignPolicyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 签名策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowInstanceSignPolicyResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 签名策略描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowInstanceSignPolicyResponse withNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * 命名空间ID
     * @return namespaceId
     */
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public ShowInstanceSignPolicyResponse withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 命名空间名
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public ShowInstanceSignPolicyResponse withTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
        return this;
    }

    public ShowInstanceSignPolicyResponse withTrigger(Consumer<TriggerConfig> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new TriggerConfig();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public TriggerConfig getTrigger() {
        return trigger;
    }

    public void setTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
    }

    public ShowInstanceSignPolicyResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建者
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowInstanceSignPolicyResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ShowInstanceSignPolicyResponse withScopeRules(List<SignScopeRule> scopeRules) {
        this.scopeRules = scopeRules;
        return this;
    }

    public ShowInstanceSignPolicyResponse addScopeRulesItem(SignScopeRule scopeRulesItem) {
        if (this.scopeRules == null) {
            this.scopeRules = new ArrayList<>();
        }
        this.scopeRules.add(scopeRulesItem);
        return this;
    }

    public ShowInstanceSignPolicyResponse withScopeRules(Consumer<List<SignScopeRule>> scopeRulesSetter) {
        if (this.scopeRules == null) {
            this.scopeRules = new ArrayList<>();
        }
        scopeRulesSetter.accept(this.scopeRules);
        return this;
    }

    /**
     * 作用范围规则
     * @return scopeRules
     */
    public List<SignScopeRule> getScopeRules() {
        return scopeRules;
    }

    public void setScopeRules(List<SignScopeRule> scopeRules) {
        this.scopeRules = scopeRules;
    }

    public ShowInstanceSignPolicyResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowInstanceSignPolicyResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowInstanceSignPolicyResponse withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * 加签算法，KMS的密钥算法EC_P256对应着ECDSA_SHA_256，EC_P384对应着ECDSA_SHA_384，SM2对应着SM2DSA_SM3
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public ShowInstanceSignPolicyResponse withSignatureKey(String signatureKey) {
        this.signatureKey = signatureKey;
        return this;
    }

    /**
     * 签名算法key ID
     * @return signatureKey
     */
    public String getSignatureKey() {
        return signatureKey;
    }

    public void setSignatureKey(String signatureKey) {
        this.signatureKey = signatureKey;
    }

    public ShowInstanceSignPolicyResponse withSignatureMethod(String signatureMethod) {
        this.signatureMethod = signatureMethod;
        return this;
    }

    /**
     * 镜像签名方式
     * @return signatureMethod
     */
    public String getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(String signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceSignPolicyResponse that = (ShowInstanceSignPolicyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.namespaceId, that.namespaceId)
            && Objects.equals(this.namespaceName, that.namespaceName) && Objects.equals(this.trigger, that.trigger)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.scopeRules, that.scopeRules) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.signatureAlgorithm, that.signatureAlgorithm)
            && Objects.equals(this.signatureKey, that.signatureKey)
            && Objects.equals(this.signatureMethod, that.signatureMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            namespaceId,
            namespaceName,
            trigger,
            creator,
            enabled,
            scopeRules,
            createdAt,
            updatedAt,
            signatureAlgorithm,
            signatureKey,
            signatureMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceSignPolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    scopeRules: ").append(toIndentedString(scopeRules)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    signatureKey: ").append(toIndentedString(signatureKey)).append("\n");
        sb.append("    signatureMethod: ").append(toIndentedString(signatureMethod)).append("\n");
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
