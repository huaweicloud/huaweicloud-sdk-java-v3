package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowResourceDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_name")

    private String epName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_detail")

    private Map<String, Object> resourceDetail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level")

    private ResourceLevelBase resourceLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_level_manual")

    private Boolean isLevelManual;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_backup_flag")

    private Boolean snapshotBackupFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_backup_flag")

    private Boolean localBackupFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_backup_flag")

    private Boolean remoteBackupFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_rule")

    private ComplianceRule complianceRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inventory_result")

    private String inventoryResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_vaults")

    private List<String> localVaults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_vaults")

    private List<String> remoteVaults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_result")

    private String complianceResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_detail")

    private String complianceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagItem> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_created")

    private Long resourceCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_updated")

    private Long resourceUpdated;

    public ShowResourceDetailResponse withId(String id) {
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

    public ShowResourceDetailResponse withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ShowResourceDetailResponse withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 云服务名称
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ShowResourceDetailResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ShowResourceDetailResponse withRegionId(String regionId) {
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

    public ShowResourceDetailResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Openstack中的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowResourceDetailResponse withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Openstack中的项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ShowResourceDetailResponse withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * 企业项目ID
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public ShowResourceDetailResponse withEpName(String epName) {
        this.epName = epName;
        return this;
    }

    /**
     * 企业项目名称
     * @return epName
     */
    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public ShowResourceDetailResponse withResourceDetail(Map<String, Object> resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    public ShowResourceDetailResponse putResourceDetailItem(String key, Object resourceDetailItem) {
        if (this.resourceDetail == null) {
            this.resourceDetail = new HashMap<>();
        }
        this.resourceDetail.put(key, resourceDetailItem);
        return this;
    }

    public ShowResourceDetailResponse withResourceDetail(Consumer<Map<String, Object>> resourceDetailSetter) {
        if (this.resourceDetail == null) {
            this.resourceDetail = new HashMap<>();
        }
        resourceDetailSetter.accept(this.resourceDetail);
        return this;
    }

    /**
     * 资源详细属性
     * @return resourceDetail
     */
    public Map<String, Object> getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(Map<String, Object> resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public ShowResourceDetailResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 资源状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowResourceDetailResponse withResourceLevel(ResourceLevelBase resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }

    public ShowResourceDetailResponse withResourceLevel(Consumer<ResourceLevelBase> resourceLevelSetter) {
        if (this.resourceLevel == null) {
            this.resourceLevel = new ResourceLevelBase();
            resourceLevelSetter.accept(this.resourceLevel);
        }

        return this;
    }

    /**
     * Get resourceLevel
     * @return resourceLevel
     */
    public ResourceLevelBase getResourceLevel() {
        return resourceLevel;
    }

    public void setResourceLevel(ResourceLevelBase resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    public ShowResourceDetailResponse withIsLevelManual(Boolean isLevelManual) {
        this.isLevelManual = isLevelManual;
        return this;
    }

    /**
     * 等级是否手动指定
     * @return isLevelManual
     */
    public Boolean getIsLevelManual() {
        return isLevelManual;
    }

    public void setIsLevelManual(Boolean isLevelManual) {
        this.isLevelManual = isLevelManual;
    }

    public ShowResourceDetailResponse withSnapshotBackupFlag(Boolean snapshotBackupFlag) {
        this.snapshotBackupFlag = snapshotBackupFlag;
        return this;
    }

    /**
     * 快照备份是否开启
     * @return snapshotBackupFlag
     */
    public Boolean getSnapshotBackupFlag() {
        return snapshotBackupFlag;
    }

    public void setSnapshotBackupFlag(Boolean snapshotBackupFlag) {
        this.snapshotBackupFlag = snapshotBackupFlag;
    }

    public ShowResourceDetailResponse withLocalBackupFlag(Boolean localBackupFlag) {
        this.localBackupFlag = localBackupFlag;
        return this;
    }

    /**
     * 本地备份是否开启
     * @return localBackupFlag
     */
    public Boolean getLocalBackupFlag() {
        return localBackupFlag;
    }

    public void setLocalBackupFlag(Boolean localBackupFlag) {
        this.localBackupFlag = localBackupFlag;
    }

    public ShowResourceDetailResponse withRemoteBackupFlag(Boolean remoteBackupFlag) {
        this.remoteBackupFlag = remoteBackupFlag;
        return this;
    }

    /**
     * 异地备份是否开启
     * @return remoteBackupFlag
     */
    public Boolean getRemoteBackupFlag() {
        return remoteBackupFlag;
    }

    public void setRemoteBackupFlag(Boolean remoteBackupFlag) {
        this.remoteBackupFlag = remoteBackupFlag;
    }

    public ShowResourceDetailResponse withComplianceRule(ComplianceRule complianceRule) {
        this.complianceRule = complianceRule;
        return this;
    }

    public ShowResourceDetailResponse withComplianceRule(Consumer<ComplianceRule> complianceRuleSetter) {
        if (this.complianceRule == null) {
            this.complianceRule = new ComplianceRule();
            complianceRuleSetter.accept(this.complianceRule);
        }

        return this;
    }

    /**
     * Get complianceRule
     * @return complianceRule
     */
    public ComplianceRule getComplianceRule() {
        return complianceRule;
    }

    public void setComplianceRule(ComplianceRule complianceRule) {
        this.complianceRule = complianceRule;
    }

    public ShowResourceDetailResponse withInventoryResult(String inventoryResult) {
        this.inventoryResult = inventoryResult;
        return this;
    }

    /**
     * 资源保护状态
     * @return inventoryResult
     */
    public String getInventoryResult() {
        return inventoryResult;
    }

    public void setInventoryResult(String inventoryResult) {
        this.inventoryResult = inventoryResult;
    }

    public ShowResourceDetailResponse withLocalVaults(List<String> localVaults) {
        this.localVaults = localVaults;
        return this;
    }

    public ShowResourceDetailResponse addLocalVaultsItem(String localVaultsItem) {
        if (this.localVaults == null) {
            this.localVaults = new ArrayList<>();
        }
        this.localVaults.add(localVaultsItem);
        return this;
    }

    public ShowResourceDetailResponse withLocalVaults(Consumer<List<String>> localVaultsSetter) {
        if (this.localVaults == null) {
            this.localVaults = new ArrayList<>();
        }
        localVaultsSetter.accept(this.localVaults);
        return this;
    }

    /**
     * 本地备份存储库
     * @return localVaults
     */
    public List<String> getLocalVaults() {
        return localVaults;
    }

    public void setLocalVaults(List<String> localVaults) {
        this.localVaults = localVaults;
    }

    public ShowResourceDetailResponse withRemoteVaults(List<String> remoteVaults) {
        this.remoteVaults = remoteVaults;
        return this;
    }

    public ShowResourceDetailResponse addRemoteVaultsItem(String remoteVaultsItem) {
        if (this.remoteVaults == null) {
            this.remoteVaults = new ArrayList<>();
        }
        this.remoteVaults.add(remoteVaultsItem);
        return this;
    }

    public ShowResourceDetailResponse withRemoteVaults(Consumer<List<String>> remoteVaultsSetter) {
        if (this.remoteVaults == null) {
            this.remoteVaults = new ArrayList<>();
        }
        remoteVaultsSetter.accept(this.remoteVaults);
        return this;
    }

    /**
     * 异地备份存储库
     * @return remoteVaults
     */
    public List<String> getRemoteVaults() {
        return remoteVaults;
    }

    public void setRemoteVaults(List<String> remoteVaults) {
        this.remoteVaults = remoteVaults;
    }

    public ShowResourceDetailResponse withComplianceResult(String complianceResult) {
        this.complianceResult = complianceResult;
        return this;
    }

    /**
     * 资产合规盘点结果
     * @return complianceResult
     */
    public String getComplianceResult() {
        return complianceResult;
    }

    public void setComplianceResult(String complianceResult) {
        this.complianceResult = complianceResult;
    }

    public ShowResourceDetailResponse withComplianceDetail(String complianceDetail) {
        this.complianceDetail = complianceDetail;
        return this;
    }

    /**
     * 资产合规盘点明细，合规校验针对local_backup_enabled,local_backup_frequency, local_worm_enabled, local_backup_retention 等每一项都给出规则要求值，资源实际值，是否满足匹配。结合多项给出最终的匹配结果。
     * @return complianceDetail
     */
    public String getComplianceDetail() {
        return complianceDetail;
    }

    public void setComplianceDetail(String complianceDetail) {
        this.complianceDetail = complianceDetail;
    }

    public ShowResourceDetailResponse withTags(List<TagItem> tags) {
        this.tags = tags;
        return this;
    }

    public ShowResourceDetailResponse addTagsItem(TagItem tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowResourceDetailResponse withTags(Consumer<List<TagItem>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<TagItem> getTags() {
        return tags;
    }

    public void setTags(List<TagItem> tags) {
        this.tags = tags;
    }

    public ShowResourceDetailResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowResourceDetailResponse withResourceCreated(Long resourceCreated) {
        this.resourceCreated = resourceCreated;
        return this;
    }

    /**
     * 资源创建时间
     * minimum: 0
     * maximum: 2147483647
     * @return resourceCreated
     */
    public Long getResourceCreated() {
        return resourceCreated;
    }

    public void setResourceCreated(Long resourceCreated) {
        this.resourceCreated = resourceCreated;
    }

    public ShowResourceDetailResponse withResourceUpdated(Long resourceUpdated) {
        this.resourceUpdated = resourceUpdated;
        return this;
    }

    /**
     * 资源更新时间
     * minimum: 0
     * maximum: 2147483647
     * @return resourceUpdated
     */
    public Long getResourceUpdated() {
        return resourceUpdated;
    }

    public void setResourceUpdated(Long resourceUpdated) {
        this.resourceUpdated = resourceUpdated;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceDetailResponse that = (ShowResourceDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.epId, that.epId)
            && Objects.equals(this.epName, that.epName) && Objects.equals(this.resourceDetail, that.resourceDetail)
            && Objects.equals(this.state, that.state) && Objects.equals(this.resourceLevel, that.resourceLevel)
            && Objects.equals(this.isLevelManual, that.isLevelManual)
            && Objects.equals(this.snapshotBackupFlag, that.snapshotBackupFlag)
            && Objects.equals(this.localBackupFlag, that.localBackupFlag)
            && Objects.equals(this.remoteBackupFlag, that.remoteBackupFlag)
            && Objects.equals(this.complianceRule, that.complianceRule)
            && Objects.equals(this.inventoryResult, that.inventoryResult)
            && Objects.equals(this.localVaults, that.localVaults)
            && Objects.equals(this.remoteVaults, that.remoteVaults)
            && Objects.equals(this.complianceResult, that.complianceResult)
            && Objects.equals(this.complianceDetail, that.complianceDetail) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.resourceCreated, that.resourceCreated)
            && Objects.equals(this.resourceUpdated, that.resourceUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            resourceName,
            provider,
            resourceType,
            regionId,
            projectId,
            projectName,
            epId,
            epName,
            resourceDetail,
            state,
            resourceLevel,
            isLevelManual,
            snapshotBackupFlag,
            localBackupFlag,
            remoteBackupFlag,
            complianceRule,
            inventoryResult,
            localVaults,
            remoteVaults,
            complianceResult,
            complianceDetail,
            tags,
            domainId,
            resourceCreated,
            resourceUpdated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    epName: ").append(toIndentedString(epName)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    resourceLevel: ").append(toIndentedString(resourceLevel)).append("\n");
        sb.append("    isLevelManual: ").append(toIndentedString(isLevelManual)).append("\n");
        sb.append("    snapshotBackupFlag: ").append(toIndentedString(snapshotBackupFlag)).append("\n");
        sb.append("    localBackupFlag: ").append(toIndentedString(localBackupFlag)).append("\n");
        sb.append("    remoteBackupFlag: ").append(toIndentedString(remoteBackupFlag)).append("\n");
        sb.append("    complianceRule: ").append(toIndentedString(complianceRule)).append("\n");
        sb.append("    inventoryResult: ").append(toIndentedString(inventoryResult)).append("\n");
        sb.append("    localVaults: ").append(toIndentedString(localVaults)).append("\n");
        sb.append("    remoteVaults: ").append(toIndentedString(remoteVaults)).append("\n");
        sb.append("    complianceResult: ").append(toIndentedString(complianceResult)).append("\n");
        sb.append("    complianceDetail: ").append(toIndentedString(complianceDetail)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    resourceCreated: ").append(toIndentedString(resourceCreated)).append("\n");
        sb.append("    resourceUpdated: ").append(toIndentedString(resourceUpdated)).append("\n");
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
