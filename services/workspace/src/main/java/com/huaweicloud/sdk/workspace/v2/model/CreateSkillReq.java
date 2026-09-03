package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建企业自研技能请求。
 */
public class CreateSkillReq {

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

    private List<CreateSkillPackage> packages = null;

    public CreateSkillReq withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * 技能slug，创建后不可修改。
     * @return slug
     */
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public CreateSkillReq withDisplayName(String displayName) {
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

    public CreateSkillReq withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * 别名（业务界面可修改的名称）。
     * @return aliasName
     */
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public CreateSkillReq withDescription(String description) {
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

    public CreateSkillReq withCategory(SkillCategoryEnum category) {
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

    public CreateSkillReq withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateSkillReq addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateSkillReq withTags(Consumer<List<String>> tagsSetter) {
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

    public CreateSkillReq withCover(String cover) {
        this.cover = cover;
        return this;
    }

    /**
     * 封面图 base64 编码。
     * @return cover
     */
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public CreateSkillReq withSource(SkillSourceEnum source) {
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

    public CreateSkillReq withSupportOsTypes(List<String> supportOsTypes) {
        this.supportOsTypes = supportOsTypes;
        return this;
    }

    public CreateSkillReq addSupportOsTypesItem(String supportOsTypesItem) {
        if (this.supportOsTypes == null) {
            this.supportOsTypes = new ArrayList<>();
        }
        this.supportOsTypes.add(supportOsTypesItem);
        return this;
    }

    public CreateSkillReq withSupportOsTypes(Consumer<List<String>> supportOsTypesSetter) {
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

    public CreateSkillReq withPackages(List<CreateSkillPackage> packages) {
        this.packages = packages;
        return this;
    }

    public CreateSkillReq addPackagesItem(CreateSkillPackage packagesItem) {
        if (this.packages == null) {
            this.packages = new ArrayList<>();
        }
        this.packages.add(packagesItem);
        return this;
    }

    public CreateSkillReq withPackages(Consumer<List<CreateSkillPackage>> packagesSetter) {
        if (this.packages == null) {
            this.packages = new ArrayList<>();
        }
        packagesSetter.accept(this.packages);
        return this;
    }

    /**
     * 技能包信息列表。
     * @return packages
     */
    public List<CreateSkillPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<CreateSkillPackage> packages) {
        this.packages = packages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSkillReq that = (CreateSkillReq) obj;
        return Objects.equals(this.slug, that.slug) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.aliasName, that.aliasName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.category, that.category) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.cover, that.cover) && Objects.equals(this.source, that.source)
            && Objects.equals(this.supportOsTypes, that.supportOsTypes) && Objects.equals(this.packages, that.packages);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(slug, displayName, aliasName, description, category, tags, cover, source, supportOsTypes, packages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSkillReq {\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    supportOsTypes: ").append(toIndentedString(supportOsTypes)).append("\n");
        sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
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
