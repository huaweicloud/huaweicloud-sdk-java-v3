package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略实体信息
 */
public class CreateRetryPolicyRequestBodyDataObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_list")

    private List<String> retryList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_age")

    private CreateRetryPolicyRequestBodyDataObjectBlockAge blockAge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_target")

    private String blockTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defense_policy_list")

    private List<CreateRetryPolicyRequestBodyDataObjectDefensePolicyList> defensePolicyList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    /**
     * 类型,WHITE/BLOCK,WHITE代表加白(将ip等对象加入白名单),BLOCK代表阻断(将ip等对象加入黑名单)
     */
    public static final class PolicyCategoryEnum {

        /**
         * Enum WHITE for value: "WHITE"
         */
        public static final PolicyCategoryEnum WHITE = new PolicyCategoryEnum("WHITE");

        /**
         * Enum BLOCK for value: "BLOCK"
         */
        public static final PolicyCategoryEnum BLOCK = new PolicyCategoryEnum("BLOCK");

        private static final Map<String, PolicyCategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyCategoryEnum> createStaticFields() {
            Map<String, PolicyCategoryEnum> map = new HashMap<>();
            map.put("WHITE", WHITE);
            map.put("BLOCK", BLOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyCategoryEnum(String value) {
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
        public static PolicyCategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyCategoryEnum(value));
        }

        public static PolicyCategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyCategoryEnum) {
                return this.value.equals(((PolicyCategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_category")

    private PolicyCategoryEnum policyCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private CreateRetryPolicyRequestBodyDataObjectPolicyType policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_direction")

    private String policyDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_scope")

    private String accountScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_scope")

    private String epsScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_scope")

    private String regionScope;

    public CreateRetryPolicyRequestBodyDataObject withRetryList(List<String> retryList) {
        this.retryList = retryList;
        return this;
    }

    public CreateRetryPolicyRequestBodyDataObject addRetryListItem(String retryListItem) {
        if (this.retryList == null) {
            this.retryList = new ArrayList<>();
        }
        this.retryList.add(retryListItem);
        return this;
    }

    public CreateRetryPolicyRequestBodyDataObject withRetryList(Consumer<List<String>> retryListSetter) {
        if (this.retryList == null) {
            this.retryList = new ArrayList<>();
        }
        retryListSetter.accept(this.retryList);
        return this;
    }

    /**
     * 重试策略ID
     * @return retryList
     */
    public List<String> getRetryList() {
        return retryList;
    }

    public void setRetryList(List<String> retryList) {
        this.retryList = retryList;
    }

    public CreateRetryPolicyRequestBodyDataObject withBlockAge(
        CreateRetryPolicyRequestBodyDataObjectBlockAge blockAge) {
        this.blockAge = blockAge;
        return this;
    }

    public CreateRetryPolicyRequestBodyDataObject withBlockAge(
        Consumer<CreateRetryPolicyRequestBodyDataObjectBlockAge> blockAgeSetter) {
        if (this.blockAge == null) {
            this.blockAge = new CreateRetryPolicyRequestBodyDataObjectBlockAge();
            blockAgeSetter.accept(this.blockAge);
        }

        return this;
    }

    /**
     * Get blockAge
     * @return blockAge
     */
    public CreateRetryPolicyRequestBodyDataObjectBlockAge getBlockAge() {
        return blockAge;
    }

    public void setBlockAge(CreateRetryPolicyRequestBodyDataObjectBlockAge blockAge) {
        this.blockAge = blockAge;
    }

    public CreateRetryPolicyRequestBodyDataObject withBlockTarget(String blockTarget) {
        this.blockTarget = blockTarget;
        return this;
    }

    /**
     * 策略对象
     * @return blockTarget
     */
    public String getBlockTarget() {
        return blockTarget;
    }

    public void setBlockTarget(String blockTarget) {
        this.blockTarget = blockTarget;
    }

    public CreateRetryPolicyRequestBodyDataObject withDefensePolicyList(
        List<CreateRetryPolicyRequestBodyDataObjectDefensePolicyList> defensePolicyList) {
        this.defensePolicyList = defensePolicyList;
        return this;
    }

    public CreateRetryPolicyRequestBodyDataObject addDefensePolicyListItem(
        CreateRetryPolicyRequestBodyDataObjectDefensePolicyList defensePolicyListItem) {
        if (this.defensePolicyList == null) {
            this.defensePolicyList = new ArrayList<>();
        }
        this.defensePolicyList.add(defensePolicyListItem);
        return this;
    }

    public CreateRetryPolicyRequestBodyDataObject withDefensePolicyList(
        Consumer<List<CreateRetryPolicyRequestBodyDataObjectDefensePolicyList>> defensePolicyListSetter) {
        if (this.defensePolicyList == null) {
            this.defensePolicyList = new ArrayList<>();
        }
        defensePolicyListSetter.accept(this.defensePolicyList);
        return this;
    }

    /**
     * 与操作连接对应的策略列表
     * @return defensePolicyList
     */
    public List<CreateRetryPolicyRequestBodyDataObjectDefensePolicyList> getDefensePolicyList() {
        return defensePolicyList;
    }

    public void setDefensePolicyList(List<CreateRetryPolicyRequestBodyDataObjectDefensePolicyList> defensePolicyList) {
        this.defensePolicyList = defensePolicyList;
    }

    public CreateRetryPolicyRequestBodyDataObject withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateRetryPolicyRequestBodyDataObject withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 标签
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public CreateRetryPolicyRequestBodyDataObject withPolicyCategory(PolicyCategoryEnum policyCategory) {
        this.policyCategory = policyCategory;
        return this;
    }

    /**
     * 类型,WHITE/BLOCK,WHITE代表加白(将ip等对象加入白名单),BLOCK代表阻断(将ip等对象加入黑名单)
     * @return policyCategory
     */
    public PolicyCategoryEnum getPolicyCategory() {
        return policyCategory;
    }

    public void setPolicyCategory(PolicyCategoryEnum policyCategory) {
        this.policyCategory = policyCategory;
    }

    public CreateRetryPolicyRequestBodyDataObject withPolicyType(
        CreateRetryPolicyRequestBodyDataObjectPolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    public CreateRetryPolicyRequestBodyDataObject withPolicyType(
        Consumer<CreateRetryPolicyRequestBodyDataObjectPolicyType> policyTypeSetter) {
        if (this.policyType == null) {
            this.policyType = new CreateRetryPolicyRequestBodyDataObjectPolicyType();
            policyTypeSetter.accept(this.policyType);
        }

        return this;
    }

    /**
     * Get policyType
     * @return policyType
     */
    public CreateRetryPolicyRequestBodyDataObjectPolicyType getPolicyType() {
        return policyType;
    }

    public void setPolicyType(CreateRetryPolicyRequestBodyDataObjectPolicyType policyType) {
        this.policyType = policyType;
    }

    public CreateRetryPolicyRequestBodyDataObject withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreateRetryPolicyRequestBodyDataObject withPolicyDirection(String policyDirection) {
        this.policyDirection = policyDirection;
        return this;
    }

    /**
     * 出入方向
     * @return policyDirection
     */
    public String getPolicyDirection() {
        return policyDirection;
    }

    public void setPolicyDirection(String policyDirection) {
        this.policyDirection = policyDirection;
    }

    public CreateRetryPolicyRequestBodyDataObject withAccountScope(String accountScope) {
        this.accountScope = accountScope;
        return this;
    }

    /**
     * 账号范围
     * @return accountScope
     */
    public String getAccountScope() {
        return accountScope;
    }

    public void setAccountScope(String accountScope) {
        this.accountScope = accountScope;
    }

    public CreateRetryPolicyRequestBodyDataObject withEpsScope(String epsScope) {
        this.epsScope = epsScope;
        return this;
    }

    /**
     * 企业项目范围
     * @return epsScope
     */
    public String getEpsScope() {
        return epsScope;
    }

    public void setEpsScope(String epsScope) {
        this.epsScope = epsScope;
    }

    public CreateRetryPolicyRequestBodyDataObject withRegionScope(String regionScope) {
        this.regionScope = regionScope;
        return this;
    }

    /**
     * region范围
     * @return regionScope
     */
    public String getRegionScope() {
        return regionScope;
    }

    public void setRegionScope(String regionScope) {
        this.regionScope = regionScope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRetryPolicyRequestBodyDataObject that = (CreateRetryPolicyRequestBodyDataObject) obj;
        return Objects.equals(this.retryList, that.retryList) && Objects.equals(this.blockAge, that.blockAge)
            && Objects.equals(this.blockTarget, that.blockTarget)
            && Objects.equals(this.defensePolicyList, that.defensePolicyList)
            && Objects.equals(this.description, that.description) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.policyCategory, that.policyCategory)
            && Objects.equals(this.policyType, that.policyType) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.policyDirection, that.policyDirection)
            && Objects.equals(this.accountScope, that.accountScope) && Objects.equals(this.epsScope, that.epsScope)
            && Objects.equals(this.regionScope, that.regionScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retryList,
            blockAge,
            blockTarget,
            defensePolicyList,
            description,
            labels,
            policyCategory,
            policyType,
            regionId,
            policyDirection,
            accountScope,
            epsScope,
            regionScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRetryPolicyRequestBodyDataObject {\n");
        sb.append("    retryList: ").append(toIndentedString(retryList)).append("\n");
        sb.append("    blockAge: ").append(toIndentedString(blockAge)).append("\n");
        sb.append("    blockTarget: ").append(toIndentedString(blockTarget)).append("\n");
        sb.append("    defensePolicyList: ").append(toIndentedString(defensePolicyList)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    policyCategory: ").append(toIndentedString(policyCategory)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    policyDirection: ").append(toIndentedString(policyDirection)).append("\n");
        sb.append("    accountScope: ").append(toIndentedString(accountScope)).append("\n");
        sb.append("    epsScope: ").append(toIndentedString(epsScope)).append("\n");
        sb.append("    regionScope: ").append(toIndentedString(regionScope)).append("\n");
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
