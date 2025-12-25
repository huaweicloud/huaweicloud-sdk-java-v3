package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模块详情
 */
public class ModuleDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_pack_id")

    private String cloudPackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_pack_name")

    private String cloudPackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_pack_version")

    private String cloudPackVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_description")

    private String enDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_json")

    private String moduleJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_name")

    private String enName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail")

    private String thumbnail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_type")

    private String moduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_built_in")

    private Boolean isBuiltIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_query")

    private String dataQuery;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boa_version")

    private String boaVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ModuleDetailInfo withCloudPackId(String cloudPackId) {
        this.cloudPackId = cloudPackId;
        return this;
    }

    /**
     * 订阅包id
     * @return cloudPackId
     */
    public String getCloudPackId() {
        return cloudPackId;
    }

    public void setCloudPackId(String cloudPackId) {
        this.cloudPackId = cloudPackId;
    }

    public ModuleDetailInfo withCloudPackName(String cloudPackName) {
        this.cloudPackName = cloudPackName;
        return this;
    }

    /**
     * 订阅包名称
     * @return cloudPackName
     */
    public String getCloudPackName() {
        return cloudPackName;
    }

    public void setCloudPackName(String cloudPackName) {
        this.cloudPackName = cloudPackName;
    }

    public ModuleDetailInfo withCloudPackVersion(String cloudPackVersion) {
        this.cloudPackVersion = cloudPackVersion;
        return this;
    }

    /**
     * 订阅包版本
     * @return cloudPackVersion
     */
    public String getCloudPackVersion() {
        return cloudPackVersion;
    }

    public void setCloudPackVersion(String cloudPackVersion) {
        this.cloudPackVersion = cloudPackVersion;
    }

    public ModuleDetailInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ModuleDetailInfo withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建者ID
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ModuleDetailInfo withDescription(String description) {
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

    public ModuleDetailInfo withEnDescription(String enDescription) {
        this.enDescription = enDescription;
        return this;
    }

    /**
     * 英文描述
     * @return enDescription
     */
    public String getEnDescription() {
        return enDescription;
    }

    public void setEnDescription(String enDescription) {
        this.enDescription = enDescription;
    }

    public ModuleDetailInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模块ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModuleDetailInfo withModuleJson(String moduleJson) {
        this.moduleJson = moduleJson;
        return this;
    }

    /**
     * 模块相关信息，当module为指标卡片时，items中的字段id也为指标id
     * @return moduleJson
     */
    public String getModuleJson() {
        return moduleJson;
    }

    public void setModuleJson(String moduleJson) {
        this.moduleJson = moduleJson;
    }

    public ModuleDetailInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModuleDetailInfo withEnName(String enName) {
        this.enName = enName;
        return this;
    }

    /**
     * 英文名称
     * @return enName
     */
    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public ModuleDetailInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ModuleDetailInfo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ModuleDetailInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ModuleDetailInfo withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * 模块缩略图
     * @return thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public ModuleDetailInfo withModuleType(String moduleType) {
        this.moduleType = moduleType;
        return this;
    }

    /**
     * 模块类型,tab/section
     * @return moduleType
     */
    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }

    public ModuleDetailInfo withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 模块标签
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ModuleDetailInfo withIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }

    /**
     * 是否为系统模块
     * @return isBuiltIn
     */
    public Boolean getIsBuiltIn() {
        return isBuiltIn;
    }

    public void setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
    }

    public ModuleDetailInfo withDataQuery(String dataQuery) {
        this.dataQuery = dataQuery;
        return this;
    }

    /**
     * 数据查询方式
     * @return dataQuery
     */
    public String getDataQuery() {
        return dataQuery;
    }

    public void setDataQuery(String dataQuery) {
        this.dataQuery = dataQuery;
    }

    public ModuleDetailInfo withBoaVersion(String boaVersion) {
        this.boaVersion = boaVersion;
        return this;
    }

    /**
     * BOA底座版本
     * @return boaVersion
     */
    public String getBoaVersion() {
        return boaVersion;
    }

    public void setBoaVersion(String boaVersion) {
        this.boaVersion = boaVersion;
    }

    public ModuleDetailInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 安全云脑版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModuleDetailInfo that = (ModuleDetailInfo) obj;
        return Objects.equals(this.cloudPackId, that.cloudPackId)
            && Objects.equals(this.cloudPackName, that.cloudPackName)
            && Objects.equals(this.cloudPackVersion, that.cloudPackVersion)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enDescription, that.enDescription) && Objects.equals(this.id, that.id)
            && Objects.equals(this.moduleJson, that.moduleJson) && Objects.equals(this.name, that.name)
            && Objects.equals(this.enName, that.enName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.thumbnail, that.thumbnail) && Objects.equals(this.moduleType, that.moduleType)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.isBuiltIn, that.isBuiltIn)
            && Objects.equals(this.dataQuery, that.dataQuery) && Objects.equals(this.boaVersion, that.boaVersion)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudPackId,
            cloudPackName,
            cloudPackVersion,
            createTime,
            creatorId,
            description,
            enDescription,
            id,
            moduleJson,
            name,
            enName,
            projectId,
            workspaceId,
            updateTime,
            thumbnail,
            moduleType,
            tag,
            isBuiltIn,
            dataQuery,
            boaVersion,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModuleDetailInfo {\n");
        sb.append("    cloudPackId: ").append(toIndentedString(cloudPackId)).append("\n");
        sb.append("    cloudPackName: ").append(toIndentedString(cloudPackName)).append("\n");
        sb.append("    cloudPackVersion: ").append(toIndentedString(cloudPackVersion)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enDescription: ").append(toIndentedString(enDescription)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    moduleJson: ").append(toIndentedString(moduleJson)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
        sb.append("    dataQuery: ").append(toIndentedString(dataQuery)).append("\n");
        sb.append("    boaVersion: ").append(toIndentedString(boaVersion)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
