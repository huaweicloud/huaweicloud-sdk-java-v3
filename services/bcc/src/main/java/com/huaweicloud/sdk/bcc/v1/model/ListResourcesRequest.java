package com.huaweicloud.sdk.bcc.v1.model;

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
public class ListResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    /**
     * 云服务类型，如ecs,evs,sfsturbo,workspace,rds,gaussdb
     */
    public static final class ProviderEnum {

        /**
         * Enum ECS for value: "ecs"
         */
        public static final ProviderEnum ECS = new ProviderEnum("ecs");

        /**
         * Enum EVS for value: "evs"
         */
        public static final ProviderEnum EVS = new ProviderEnum("evs");

        /**
         * Enum SFSTURBO for value: "sfsturbo"
         */
        public static final ProviderEnum SFSTURBO = new ProviderEnum("sfsturbo");

        /**
         * Enum WORKSPACE for value: "workspace"
         */
        public static final ProviderEnum WORKSPACE = new ProviderEnum("workspace");

        /**
         * Enum RDS for value: "rds"
         */
        public static final ProviderEnum RDS = new ProviderEnum("rds");

        /**
         * Enum GAUSSDB for value: "gaussdb"
         */
        public static final ProviderEnum GAUSSDB = new ProviderEnum("gaussdb");

        private static final Map<String, ProviderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderEnum> createStaticFields() {
            Map<String, ProviderEnum> map = new HashMap<>();
            map.put("ecs", ECS);
            map.put("evs", EVS);
            map.put("sfsturbo", SFSTURBO);
            map.put("workspace", WORKSPACE);
            map.put("rds", RDS);
            map.put("gaussdb", GAUSSDB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderEnum(String value) {
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
        public static ProviderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProviderEnum(value));
        }

        public static ProviderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderEnum) {
                return this.value.equals(((ProviderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private ProviderEnum provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_name")

    private String vaultName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level_id")

    private String resourceLevelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level_name")

    private String resourceLevelName;

    /**
     * 资源合规结果,complete_match,partial_match,no_match
     */
    public static final class ComplianceResultEnum {

        /**
         * Enum COMPLETE_MATCH for value: "complete_match"
         */
        public static final ComplianceResultEnum COMPLETE_MATCH = new ComplianceResultEnum("complete_match");

        /**
         * Enum PARTIAL_MATCH for value: "partial_match"
         */
        public static final ComplianceResultEnum PARTIAL_MATCH = new ComplianceResultEnum("partial_match");

        /**
         * Enum NO_MATCH for value: "no_match"
         */
        public static final ComplianceResultEnum NO_MATCH = new ComplianceResultEnum("no_match");

        private static final Map<String, ComplianceResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ComplianceResultEnum> createStaticFields() {
            Map<String, ComplianceResultEnum> map = new HashMap<>();
            map.put("complete_match", COMPLETE_MATCH);
            map.put("partial_match", PARTIAL_MATCH);
            map.put("no_match", NO_MATCH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ComplianceResultEnum(String value) {
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
        public static ComplianceResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComplianceResultEnum(value));
        }

        public static ComplianceResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ComplianceResultEnum) {
                return this.value.equals(((ComplianceResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_result")

    private ComplianceResultEnum complianceResult;

    /**
     * 资源保护状态,unprotected,protected
     */
    public static final class InventoryResultEnum {

        /**
         * Enum UNPROTECTED for value: "unprotected"
         */
        public static final InventoryResultEnum UNPROTECTED = new InventoryResultEnum("unprotected");

        /**
         * Enum PROTECTED for value: "protected"
         */
        public static final InventoryResultEnum PROTECTED = new InventoryResultEnum("protected");

        private static final Map<String, InventoryResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InventoryResultEnum> createStaticFields() {
            Map<String, InventoryResultEnum> map = new HashMap<>();
            map.put("unprotected", UNPROTECTED);
            map.put("protected", PROTECTED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InventoryResultEnum(String value) {
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
        public static InventoryResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InventoryResultEnum(value));
        }

        public static InventoryResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InventoryResultEnum) {
                return this.value.equals(((InventoryResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inventory_result")

    private InventoryResultEnum inventoryResult;

    /**
     * 合规规则类型,local_backup_enabled,local_backup_retention,local_backup_frequency,remote_backup_enabled,remote_backup_retention,local_worm_enabledd,remote_worm_enabled,is_cross_account_backup_forced
     */
    public static final class ComplianceRuleTypeEnum {

        /**
         * Enum LOCAL_BACKUP_ENABLED for value: "local_backup_enabled"
         */
        public static final ComplianceRuleTypeEnum LOCAL_BACKUP_ENABLED =
            new ComplianceRuleTypeEnum("local_backup_enabled");

        /**
         * Enum LOCAL_BACKUP_RETENTION for value: "local_backup_retention"
         */
        public static final ComplianceRuleTypeEnum LOCAL_BACKUP_RETENTION =
            new ComplianceRuleTypeEnum("local_backup_retention");

        /**
         * Enum LOCAL_BACKUP_FREQUENCY for value: "local_backup_frequency"
         */
        public static final ComplianceRuleTypeEnum LOCAL_BACKUP_FREQUENCY =
            new ComplianceRuleTypeEnum("local_backup_frequency");

        /**
         * Enum REMOTE_BACKUP_ENABLED for value: "remote_backup_enabled"
         */
        public static final ComplianceRuleTypeEnum REMOTE_BACKUP_ENABLED =
            new ComplianceRuleTypeEnum("remote_backup_enabled");

        /**
         * Enum REMOTE_BACKUP_RETENTION for value: "remote_backup_retention"
         */
        public static final ComplianceRuleTypeEnum REMOTE_BACKUP_RETENTION =
            new ComplianceRuleTypeEnum("remote_backup_retention");

        /**
         * Enum LOCAL_WORM_ENABLEDD for value: "local_worm_enabledd"
         */
        public static final ComplianceRuleTypeEnum LOCAL_WORM_ENABLEDD =
            new ComplianceRuleTypeEnum("local_worm_enabledd");

        /**
         * Enum REMOTE_WORM_ENABLED for value: "remote_worm_enabled"
         */
        public static final ComplianceRuleTypeEnum REMOTE_WORM_ENABLED =
            new ComplianceRuleTypeEnum("remote_worm_enabled");

        /**
         * Enum IS_CROSS_ACCOUNT_BACKUP_FORCED for value: "is_cross_account_backup_forced"
         */
        public static final ComplianceRuleTypeEnum IS_CROSS_ACCOUNT_BACKUP_FORCED =
            new ComplianceRuleTypeEnum("is_cross_account_backup_forced");

        private static final Map<String, ComplianceRuleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ComplianceRuleTypeEnum> createStaticFields() {
            Map<String, ComplianceRuleTypeEnum> map = new HashMap<>();
            map.put("local_backup_enabled", LOCAL_BACKUP_ENABLED);
            map.put("local_backup_retention", LOCAL_BACKUP_RETENTION);
            map.put("local_backup_frequency", LOCAL_BACKUP_FREQUENCY);
            map.put("remote_backup_enabled", REMOTE_BACKUP_ENABLED);
            map.put("remote_backup_retention", REMOTE_BACKUP_RETENTION);
            map.put("local_worm_enabledd", LOCAL_WORM_ENABLEDD);
            map.put("remote_worm_enabled", REMOTE_WORM_ENABLED);
            map.put("is_cross_account_backup_forced", IS_CROSS_ACCOUNT_BACKUP_FORCED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ComplianceRuleTypeEnum(String value) {
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
        public static ComplianceRuleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComplianceRuleTypeEnum(value));
        }

        public static ComplianceRuleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ComplianceRuleTypeEnum) {
                return this.value.equals(((ComplianceRuleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_rule_type")

    private ComplianceRuleTypeEnum complianceRuleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_rule_matched")

    private Boolean complianceRuleMatched;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListResourcesRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListResourcesRequest withRegionId(String regionId) {
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

    public ListResourcesRequest withProvider(ProviderEnum provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 云服务类型，如ecs,evs,sfsturbo,workspace,rds,gaussdb
     * @return provider
     */
    public ProviderEnum getProvider() {
        return provider;
    }

    public void setProvider(ProviderEnum provider) {
        this.provider = provider;
    }

    public ListResourcesRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListResourcesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListResourcesRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签列表, 标签值的格式为key或key=value,用英文逗号分隔，最多支持5对标签的查询，超过5对的只生效前5对
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ListResourcesRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * CBR存储库ID
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public ListResourcesRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * CBR存储库名称
     * @return vaultName
     */
    public String getVaultName() {
        return vaultName;
    }

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    public ListResourcesRequest withResourceLevelId(String resourceLevelId) {
        this.resourceLevelId = resourceLevelId;
        return this;
    }

    /**
     * 资源等级定义ID
     * @return resourceLevelId
     */
    public String getResourceLevelId() {
        return resourceLevelId;
    }

    public void setResourceLevelId(String resourceLevelId) {
        this.resourceLevelId = resourceLevelId;
    }

    public ListResourcesRequest withResourceLevelName(String resourceLevelName) {
        this.resourceLevelName = resourceLevelName;
        return this;
    }

    /**
     * 资源等级名称
     * @return resourceLevelName
     */
    public String getResourceLevelName() {
        return resourceLevelName;
    }

    public void setResourceLevelName(String resourceLevelName) {
        this.resourceLevelName = resourceLevelName;
    }

    public ListResourcesRequest withComplianceResult(ComplianceResultEnum complianceResult) {
        this.complianceResult = complianceResult;
        return this;
    }

    /**
     * 资源合规结果,complete_match,partial_match,no_match
     * @return complianceResult
     */
    public ComplianceResultEnum getComplianceResult() {
        return complianceResult;
    }

    public void setComplianceResult(ComplianceResultEnum complianceResult) {
        this.complianceResult = complianceResult;
    }

    public ListResourcesRequest withInventoryResult(InventoryResultEnum inventoryResult) {
        this.inventoryResult = inventoryResult;
        return this;
    }

    /**
     * 资源保护状态,unprotected,protected
     * @return inventoryResult
     */
    public InventoryResultEnum getInventoryResult() {
        return inventoryResult;
    }

    public void setInventoryResult(InventoryResultEnum inventoryResult) {
        this.inventoryResult = inventoryResult;
    }

    public ListResourcesRequest withComplianceRuleType(ComplianceRuleTypeEnum complianceRuleType) {
        this.complianceRuleType = complianceRuleType;
        return this;
    }

    /**
     * 合规规则类型,local_backup_enabled,local_backup_retention,local_backup_frequency,remote_backup_enabled,remote_backup_retention,local_worm_enabledd,remote_worm_enabled,is_cross_account_backup_forced
     * @return complianceRuleType
     */
    public ComplianceRuleTypeEnum getComplianceRuleType() {
        return complianceRuleType;
    }

    public void setComplianceRuleType(ComplianceRuleTypeEnum complianceRuleType) {
        this.complianceRuleType = complianceRuleType;
    }

    public ListResourcesRequest withComplianceRuleMatched(Boolean complianceRuleMatched) {
        this.complianceRuleMatched = complianceRuleMatched;
        return this;
    }

    /**
     * 合规规则是否符合，必须搭配compliance_rule_type使用
     * @return complianceRuleMatched
     */
    public Boolean getComplianceRuleMatched() {
        return complianceRuleMatched;
    }

    public void setComplianceRuleMatched(Boolean complianceRuleMatched) {
        this.complianceRuleMatched = complianceRuleMatched;
    }

    public ListResourcesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 最大的返回数量
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

    public ListResourcesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页参数，通过上一个请求中返回的marker信息作为输入，获取当前页。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourcesRequest that = (ListResourcesRequest) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.vaultId, that.vaultId) && Objects.equals(this.vaultName, that.vaultName)
            && Objects.equals(this.resourceLevelId, that.resourceLevelId)
            && Objects.equals(this.resourceLevelName, that.resourceLevelName)
            && Objects.equals(this.complianceResult, that.complianceResult)
            && Objects.equals(this.inventoryResult, that.inventoryResult)
            && Objects.equals(this.complianceRuleType, that.complianceRuleType)
            && Objects.equals(this.complianceRuleMatched, that.complianceRuleMatched)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId,
            regionId,
            provider,
            id,
            name,
            tags,
            vaultId,
            vaultName,
            resourceLevelId,
            resourceLevelName,
            complianceResult,
            inventoryResult,
            complianceRuleType,
            complianceRuleMatched,
            limit,
            marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourcesRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    vaultName: ").append(toIndentedString(vaultName)).append("\n");
        sb.append("    resourceLevelId: ").append(toIndentedString(resourceLevelId)).append("\n");
        sb.append("    resourceLevelName: ").append(toIndentedString(resourceLevelName)).append("\n");
        sb.append("    complianceResult: ").append(toIndentedString(complianceResult)).append("\n");
        sb.append("    inventoryResult: ").append(toIndentedString(inventoryResult)).append("\n");
        sb.append("    complianceRuleType: ").append(toIndentedString(complianceRuleType)).append("\n");
        sb.append("    complianceRuleMatched: ").append(toIndentedString(complianceRuleMatched)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
