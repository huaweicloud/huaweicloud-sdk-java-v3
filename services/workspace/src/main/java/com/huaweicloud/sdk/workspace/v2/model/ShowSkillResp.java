package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询企业自研技能详情响应（结构同 ShowCommonSkillResp，owner_type 为 TENANT）。
 */
public class ShowSkillResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slug")

    private String slug;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_name")

    private String aliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private SkillCategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_type")

    private SkillOwnerTypeEnum ownerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility_scope")

    private VisibilityScopeEnum visibilityScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible_domain_ids")

    private List<String> visibleDomainIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private SkillStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_package_id")

    private String currentPackageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover")

    private String cover;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SkillSourceEnum source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_os_types")

    private List<String> supportOsTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packages")

    private List<SkillPackageSummary> packages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_instance_number")

    private Integer attachInstanceNumber;

    public ShowSkillResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 技能id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowSkillResp withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * 技能slug。
     * @return slug
     */
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public ShowSkillResp withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 技能名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShowSkillResp withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * 别名。
     * @return aliasName
     */
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public ShowSkillResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 技能描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowSkillResp withCategory(SkillCategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public SkillCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(SkillCategoryEnum category) {
        this.category = category;
    }

    public ShowSkillResp withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ShowSkillResp addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowSkillResp withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 技能标签。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ShowSkillResp withOwnerType(SkillOwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * Get ownerType
     * @return ownerType
     */
    public SkillOwnerTypeEnum getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(SkillOwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
    }

    public ShowSkillResp withVisibilityScope(VisibilityScopeEnum visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }

    /**
     * Get visibilityScope
     * @return visibilityScope
     */
    public VisibilityScopeEnum getVisibilityScope() {
        return visibilityScope;
    }

    public void setVisibilityScope(VisibilityScopeEnum visibilityScope) {
        this.visibilityScope = visibilityScope;
    }

    public ShowSkillResp withVisibleDomainIds(List<String> visibleDomainIds) {
        this.visibleDomainIds = visibleDomainIds;
        return this;
    }

    public ShowSkillResp addVisibleDomainIdsItem(String visibleDomainIdsItem) {
        if (this.visibleDomainIds == null) {
            this.visibleDomainIds = new ArrayList<>();
        }
        this.visibleDomainIds.add(visibleDomainIdsItem);
        return this;
    }

    public ShowSkillResp withVisibleDomainIds(Consumer<List<String>> visibleDomainIdsSetter) {
        if (this.visibleDomainIds == null) {
            this.visibleDomainIds = new ArrayList<>();
        }
        visibleDomainIdsSetter.accept(this.visibleDomainIds);
        return this;
    }

    /**
     * 可见租户 ID 列表，仅 visibility_scope=SPECIFIC_TENANTS 时返回。
     * @return visibleDomainIds
     */
    public List<String> getVisibleDomainIds() {
        return visibleDomainIds;
    }

    public void setVisibleDomainIds(List<String> visibleDomainIds) {
        this.visibleDomainIds = visibleDomainIds;
    }

    public ShowSkillResp withStatus(SkillStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public SkillStatusEnum getStatus() {
        return status;
    }

    public void setStatus(SkillStatusEnum status) {
        this.status = status;
    }

    public ShowSkillResp withCurrentPackageId(String currentPackageId) {
        this.currentPackageId = currentPackageId;
        return this;
    }

    /**
     * 当前生效的技能包id。
     * @return currentPackageId
     */
    public String getCurrentPackageId() {
        return currentPackageId;
    }

    public void setCurrentPackageId(String currentPackageId) {
        this.currentPackageId = currentPackageId;
    }

    public ShowSkillResp withCover(String cover) {
        this.cover = cover;
        return this;
    }

    /**
     * 技能封面图 base64 编码。
     * @return cover
     */
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public ShowSkillResp withSource(SkillSourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    public SkillSourceEnum getSource() {
        return source;
    }

    public void setSource(SkillSourceEnum source) {
        this.source = source;
    }

    public ShowSkillResp withSupportOsTypes(List<String> supportOsTypes) {
        this.supportOsTypes = supportOsTypes;
        return this;
    }

    public ShowSkillResp addSupportOsTypesItem(String supportOsTypesItem) {
        if (this.supportOsTypes == null) {
            this.supportOsTypes = new ArrayList<>();
        }
        this.supportOsTypes.add(supportOsTypesItem);
        return this;
    }

    public ShowSkillResp withSupportOsTypes(Consumer<List<String>> supportOsTypesSetter) {
        if (this.supportOsTypes == null) {
            this.supportOsTypes = new ArrayList<>();
        }
        supportOsTypesSetter.accept(this.supportOsTypes);
        return this;
    }

    /**
     * 支持的操作系统类型列表。
     * @return supportOsTypes
     */
    public List<String> getSupportOsTypes() {
        return supportOsTypes;
    }

    public void setSupportOsTypes(List<String> supportOsTypes) {
        this.supportOsTypes = supportOsTypes;
    }

    public ShowSkillResp withPackages(List<SkillPackageSummary> packages) {
        this.packages = packages;
        return this;
    }

    public ShowSkillResp addPackagesItem(SkillPackageSummary packagesItem) {
        if (this.packages == null) {
            this.packages = new ArrayList<>();
        }
        this.packages.add(packagesItem);
        return this;
    }

    public ShowSkillResp withPackages(Consumer<List<SkillPackageSummary>> packagesSetter) {
        if (this.packages == null) {
            this.packages = new ArrayList<>();
        }
        packagesSetter.accept(this.packages);
        return this;
    }

    /**
     * 技能包摘要列表。
     * @return packages
     */
    public List<SkillPackageSummary> getPackages() {
        return packages;
    }

    public void setPackages(List<SkillPackageSummary> packages) {
        this.packages = packages;
    }

    public ShowSkillResp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间（ISO8601格式，UTC时区）。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowSkillResp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间（ISO8601格式，UTC时区）。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowSkillResp withAttachInstanceNumber(Integer attachInstanceNumber) {
        this.attachInstanceNumber = attachInstanceNumber;
        return this;
    }

    /**
     * 已绑定实例数量。
     * @return attachInstanceNumber
     */
    public Integer getAttachInstanceNumber() {
        return attachInstanceNumber;
    }

    public void setAttachInstanceNumber(Integer attachInstanceNumber) {
        this.attachInstanceNumber = attachInstanceNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSkillResp that = (ShowSkillResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.slug, that.slug)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.aliasName, that.aliasName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.category, that.category)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.ownerType, that.ownerType)
            && Objects.equals(this.visibilityScope, that.visibilityScope)
            && Objects.equals(this.visibleDomainIds, that.visibleDomainIds) && Objects.equals(this.status, that.status)
            && Objects.equals(this.currentPackageId, that.currentPackageId) && Objects.equals(this.cover, that.cover)
            && Objects.equals(this.source, that.source) && Objects.equals(this.supportOsTypes, that.supportOsTypes)
            && Objects.equals(this.packages, that.packages) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.attachInstanceNumber, that.attachInstanceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            slug,
            displayName,
            aliasName,
            description,
            category,
            tags,
            ownerType,
            visibilityScope,
            visibleDomainIds,
            status,
            currentPackageId,
            cover,
            source,
            supportOsTypes,
            packages,
            createTime,
            updateTime,
            attachInstanceNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSkillResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    visibilityScope: ").append(toIndentedString(visibilityScope)).append("\n");
        sb.append("    visibleDomainIds: ").append(toIndentedString(visibleDomainIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    currentPackageId: ").append(toIndentedString(currentPackageId)).append("\n");
        sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    supportOsTypes: ").append(toIndentedString(supportOsTypes)).append("\n");
        sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    attachInstanceNumber: ").append(toIndentedString(attachInstanceNumber)).append("\n");
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
