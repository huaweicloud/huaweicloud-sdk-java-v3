package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 布局详情
 */
public class LayoutDetailInfo {

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
    @JsonProperty(value = "is_built_in")

    private Boolean isBuiltIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_template")

    private Boolean isTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

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
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_name")

    private String enName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_json")

    private String layoutJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail")

    private String thumbnail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_by")

    private String usedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_cfg")

    private String layoutCfg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_type")

    private String layoutType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_id")

    private String bindingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_name")

    private String bindingName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_code")

    private String bindingCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields_sum")

    private Integer fieldsSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wizards_sum")

    private Integer wizardsSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sections_sum")

    private Integer sectionsSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules_sum")

    private Integer modulesSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tabs_sum")

    private Integer tabsSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boa_version")

    private String boaVersion;

    public LayoutDetailInfo withCloudPackId(String cloudPackId) {
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

    public LayoutDetailInfo withCloudPackName(String cloudPackName) {
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

    public LayoutDetailInfo withCloudPackVersion(String cloudPackVersion) {
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

    public LayoutDetailInfo withIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }

    /**
     * 是否内置，true内置，false非内置
     * @return isBuiltIn
     */
    public Boolean getIsBuiltIn() {
        return isBuiltIn;
    }

    public void setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
    }

    public LayoutDetailInfo withIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }

    /**
     * 是否为模板
     * @return isTemplate
     */
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public LayoutDetailInfo withCreateTime(String createTime) {
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

    public LayoutDetailInfo withCreatorId(String creatorId) {
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

    public LayoutDetailInfo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父布局ID
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public LayoutDetailInfo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建者名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public LayoutDetailInfo withDescription(String description) {
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

    public LayoutDetailInfo withEnDescription(String enDescription) {
        this.enDescription = enDescription;
        return this;
    }

    /**
     * 英文描述信息
     * @return enDescription
     */
    public String getEnDescription() {
        return enDescription;
    }

    public void setEnDescription(String enDescription) {
        this.enDescription = enDescription;
    }

    public LayoutDetailInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 订阅包id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LayoutDetailInfo withName(String name) {
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

    public LayoutDetailInfo withEnName(String enName) {
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

    public LayoutDetailInfo withLayoutJson(String layoutJson) {
        this.layoutJson = layoutJson;
        return this;
    }

    /**
     * 布局下的wizard id列表
     * @return layoutJson
     */
    public String getLayoutJson() {
        return layoutJson;
    }

    public void setLayoutJson(String layoutJson) {
        this.layoutJson = layoutJson;
    }

    public LayoutDetailInfo withProjectId(String projectId) {
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

    public LayoutDetailInfo withUpdateTime(String updateTime) {
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

    public LayoutDetailInfo withWorkspaceId(String workspaceId) {
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

    public LayoutDetailInfo withRegionId(String regionId) {
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

    public LayoutDetailInfo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 用户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public LayoutDetailInfo withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * 模板缩略图，当布局为模板时不为空
     * @return thumbnail
     */
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public LayoutDetailInfo withUsedBy(String usedBy) {
        this.usedBy = usedBy;
        return this;
    }

    /**
     * 被什么业务使用，DATACLASS/AOP_WORKFLOW/SECURITY_REPORT/DASHBOARD，及对应的字段
     * @return usedBy
     */
    public String getUsedBy() {
        return usedBy;
    }

    public void setUsedBy(String usedBy) {
        this.usedBy = usedBy;
    }

    public LayoutDetailInfo withLayoutCfg(String layoutCfg) {
        this.layoutCfg = layoutCfg;
        return this;
    }

    /**
     * 前端根据该值绑定图标
     * @return layoutCfg
     */
    public String getLayoutCfg() {
        return layoutCfg;
    }

    public void setLayoutCfg(String layoutCfg) {
        this.layoutCfg = layoutCfg;
    }

    public LayoutDetailInfo withLayoutType(String layoutType) {
        this.layoutType = layoutType;
        return this;
    }

    /**
     * 布局类型；used_by为SECURITY_REPORT/DASHBOARD时不返回该字段
     * @return layoutType
     */
    public String getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(String layoutType) {
        this.layoutType = layoutType;
    }

    public LayoutDetailInfo withBindingId(String bindingId) {
        this.bindingId = bindingId;
        return this;
    }

    /**
     * 数据类ID或流程ID；used_by为SECURITY_REPORT/DASHBOARD时不返回该字段
     * @return bindingId
     */
    public String getBindingId() {
        return bindingId;
    }

    public void setBindingId(String bindingId) {
        this.bindingId = bindingId;
    }

    public LayoutDetailInfo withBindingName(String bindingName) {
        this.bindingName = bindingName;
        return this;
    }

    /**
     * 数据类名称或流程名称；used_by为SECURITY_REPORT/DASHBOARD时不返回该字段
     * @return bindingName
     */
    public String getBindingName() {
        return bindingName;
    }

    public void setBindingName(String bindingName) {
        this.bindingName = bindingName;
    }

    public LayoutDetailInfo withBindingCode(String bindingCode) {
        this.bindingCode = bindingCode;
        return this;
    }

    /**
     * 数据类或流程英文名称；used_by为SECURITY_REPORT/DASHBOARD时不返回该字段
     * @return bindingCode
     */
    public String getBindingCode() {
        return bindingCode;
    }

    public void setBindingCode(String bindingCode) {
        this.bindingCode = bindingCode;
    }

    public LayoutDetailInfo withFieldsSum(Integer fieldsSum) {
        this.fieldsSum = fieldsSum;
        return this;
    }

    /**
     * 字段总数；used_by为SECURITY_REPORT/DASHBOARD时不返回该字段
     * minimum: 0
     * maximum: 65525
     * @return fieldsSum
     */
    public Integer getFieldsSum() {
        return fieldsSum;
    }

    public void setFieldsSum(Integer fieldsSum) {
        this.fieldsSum = fieldsSum;
    }

    public LayoutDetailInfo withWizardsSum(Integer wizardsSum) {
        this.wizardsSum = wizardsSum;
        return this;
    }

    /**
     * 页面总数；used_by为SECURITY_REPORT/DASHBOARD时不返回该字段
     * minimum: 0
     * maximum: 65525
     * @return wizardsSum
     */
    public Integer getWizardsSum() {
        return wizardsSum;
    }

    public void setWizardsSum(Integer wizardsSum) {
        this.wizardsSum = wizardsSum;
    }

    public LayoutDetailInfo withSectionsSum(Integer sectionsSum) {
        this.sectionsSum = sectionsSum;
        return this;
    }

    /**
     * 系统区块总数
     * minimum: 0
     * maximum: 65525
     * @return sectionsSum
     */
    public Integer getSectionsSum() {
        return sectionsSum;
    }

    public void setSectionsSum(Integer sectionsSum) {
        this.sectionsSum = sectionsSum;
    }

    public LayoutDetailInfo withModulesSum(Integer modulesSum) {
        this.modulesSum = modulesSum;
        return this;
    }

    /**
     * 系统模块总数
     * minimum: 0
     * maximum: 65525
     * @return modulesSum
     */
    public Integer getModulesSum() {
        return modulesSum;
    }

    public void setModulesSum(Integer modulesSum) {
        this.modulesSum = modulesSum;
    }

    public LayoutDetailInfo withTabsSum(Integer tabsSum) {
        this.tabsSum = tabsSum;
        return this;
    }

    /**
     * 自定义指标总数
     * minimum: 0
     * maximum: 65525
     * @return tabsSum
     */
    public Integer getTabsSum() {
        return tabsSum;
    }

    public void setTabsSum(Integer tabsSum) {
        this.tabsSum = tabsSum;
    }

    public LayoutDetailInfo withVersion(String version) {
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

    public LayoutDetailInfo withBoaVersion(String boaVersion) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LayoutDetailInfo that = (LayoutDetailInfo) obj;
        return Objects.equals(this.cloudPackId, that.cloudPackId)
            && Objects.equals(this.cloudPackName, that.cloudPackName)
            && Objects.equals(this.cloudPackVersion, that.cloudPackVersion)
            && Objects.equals(this.isBuiltIn, that.isBuiltIn) && Objects.equals(this.isTemplate, that.isTemplate)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enDescription, that.enDescription) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.enName, that.enName)
            && Objects.equals(this.layoutJson, that.layoutJson) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.thumbnail, that.thumbnail) && Objects.equals(this.usedBy, that.usedBy)
            && Objects.equals(this.layoutCfg, that.layoutCfg) && Objects.equals(this.layoutType, that.layoutType)
            && Objects.equals(this.bindingId, that.bindingId) && Objects.equals(this.bindingName, that.bindingName)
            && Objects.equals(this.bindingCode, that.bindingCode) && Objects.equals(this.fieldsSum, that.fieldsSum)
            && Objects.equals(this.wizardsSum, that.wizardsSum) && Objects.equals(this.sectionsSum, that.sectionsSum)
            && Objects.equals(this.modulesSum, that.modulesSum) && Objects.equals(this.tabsSum, that.tabsSum)
            && Objects.equals(this.version, that.version) && Objects.equals(this.boaVersion, that.boaVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudPackId,
            cloudPackName,
            cloudPackVersion,
            isBuiltIn,
            isTemplate,
            createTime,
            creatorId,
            parentId,
            creatorName,
            description,
            enDescription,
            id,
            name,
            enName,
            layoutJson,
            projectId,
            updateTime,
            workspaceId,
            regionId,
            domainId,
            thumbnail,
            usedBy,
            layoutCfg,
            layoutType,
            bindingId,
            bindingName,
            bindingCode,
            fieldsSum,
            wizardsSum,
            sectionsSum,
            modulesSum,
            tabsSum,
            version,
            boaVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LayoutDetailInfo {\n");
        sb.append("    cloudPackId: ").append(toIndentedString(cloudPackId)).append("\n");
        sb.append("    cloudPackName: ").append(toIndentedString(cloudPackName)).append("\n");
        sb.append("    cloudPackVersion: ").append(toIndentedString(cloudPackVersion)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enDescription: ").append(toIndentedString(enDescription)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
        sb.append("    layoutJson: ").append(toIndentedString(layoutJson)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
        sb.append("    layoutCfg: ").append(toIndentedString(layoutCfg)).append("\n");
        sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
        sb.append("    bindingId: ").append(toIndentedString(bindingId)).append("\n");
        sb.append("    bindingName: ").append(toIndentedString(bindingName)).append("\n");
        sb.append("    bindingCode: ").append(toIndentedString(bindingCode)).append("\n");
        sb.append("    fieldsSum: ").append(toIndentedString(fieldsSum)).append("\n");
        sb.append("    wizardsSum: ").append(toIndentedString(wizardsSum)).append("\n");
        sb.append("    sectionsSum: ").append(toIndentedString(sectionsSum)).append("\n");
        sb.append("    modulesSum: ").append(toIndentedString(modulesSum)).append("\n");
        sb.append("    tabsSum: ").append(toIndentedString(tabsSum)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    boaVersion: ").append(toIndentedString(boaVersion)).append("\n");
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
