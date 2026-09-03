package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例绑定的技能列表项响应。
 */
public class InstanceSkillItemVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skill_id")

    private String skillId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slug")

    private String slug;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_name")

    private String aliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_type")

    private SkillOwnerTypeEnum ownerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_status")

    private InstallStatusEnum installStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed_at")

    private String installedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover")

    private String cover;

    public InstanceSkillItemVO withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * 技能id。
     * @return skillId
     */
    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public InstanceSkillItemVO withDisplayName(String displayName) {
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

    public InstanceSkillItemVO withSlug(String slug) {
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

    public InstanceSkillItemVO withAliasName(String aliasName) {
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

    public InstanceSkillItemVO withDescription(String description) {
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

    public InstanceSkillItemVO withOwnerType(SkillOwnerTypeEnum ownerType) {
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

    public InstanceSkillItemVO withInstallStatus(InstallStatusEnum installStatus) {
        this.installStatus = installStatus;
        return this;
    }

    /**
     * Get installStatus
     * @return installStatus
     */
    public InstallStatusEnum getInstallStatus() {
        return installStatus;
    }

    public void setInstallStatus(InstallStatusEnum installStatus) {
        this.installStatus = installStatus;
    }

    public InstanceSkillItemVO withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 安装的技能包id。
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public InstanceSkillItemVO withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 安装的技能包版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public InstanceSkillItemVO withInstalledAt(String installedAt) {
        this.installedAt = installedAt;
        return this;
    }

    /**
     * 安装时间（ISO8601格式，UTC时区）。
     * @return installedAt
     */
    public String getInstalledAt() {
        return installedAt;
    }

    public void setInstalledAt(String installedAt) {
        this.installedAt = installedAt;
    }

    public InstanceSkillItemVO withCover(String cover) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceSkillItemVO that = (InstanceSkillItemVO) obj;
        return Objects.equals(this.skillId, that.skillId) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.slug, that.slug) && Objects.equals(this.aliasName, that.aliasName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.ownerType, that.ownerType)
            && Objects.equals(this.installStatus, that.installStatus) && Objects.equals(this.packageId, that.packageId)
            && Objects.equals(this.version, that.version) && Objects.equals(this.installedAt, that.installedAt)
            && Objects.equals(this.cover, that.cover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId,
            displayName,
            slug,
            aliasName,
            description,
            ownerType,
            installStatus,
            packageId,
            version,
            installedAt,
            cover);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceSkillItemVO {\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    installStatus: ").append(toIndentedString(installStatus)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    installedAt: ").append(toIndentedString(installedAt)).append("\n");
        sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
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
