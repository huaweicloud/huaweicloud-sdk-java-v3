package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PipelineTemplateSimpleVO
 */
public class PipelineTemplateSimpleVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_version")

    private String manifestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_system")

    private Boolean isSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updater_id")

    private String updaterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_collect")

    private Boolean isCollect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_show_source")

    private String isShowSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stages")

    private List<PipelineTemplateSimpleVOStages> stages = null;

    public PipelineTemplateSimpleVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模板ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PipelineTemplateSimpleVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineTemplateSimpleVO withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 模板图标
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public PipelineTemplateSimpleVO withManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
        return this;
    }

    /**
     * 流水线结构定义版本，新版默认为3.0
     * @return manifestVersion
     */
    public String getManifestVersion() {
        return manifestVersion;
    }

    public void setManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
    }

    public PipelineTemplateSimpleVO withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 模板语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public PipelineTemplateSimpleVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PipelineTemplateSimpleVO withIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
        return this;
    }

    /**
     * 是否系统模板
     * @return isSystem
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public PipelineTemplateSimpleVO withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 模板局点
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public PipelineTemplateSimpleVO withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 模板所属租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public PipelineTemplateSimpleVO withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 模板创建人ID
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public PipelineTemplateSimpleVO withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 模板创建人名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public PipelineTemplateSimpleVO withUpdaterId(String updaterId) {
        this.updaterId = updaterId;
        return this;
    }

    /**
     * 模板更新人ID
     * @return updaterId
     */
    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    public PipelineTemplateSimpleVO withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public PipelineTemplateSimpleVO withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public PipelineTemplateSimpleVO withIsCollect(Boolean isCollect) {
        this.isCollect = isCollect;
        return this;
    }

    /**
     * 是否收藏
     * @return isCollect
     */
    public Boolean getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(Boolean isCollect) {
        this.isCollect = isCollect;
    }

    public PipelineTemplateSimpleVO withIsShowSource(String isShowSource) {
        this.isShowSource = isShowSource;
        return this;
    }

    /**
     * 是否展示流水线源
     * @return isShowSource
     */
    public String getIsShowSource() {
        return isShowSource;
    }

    public void setIsShowSource(String isShowSource) {
        this.isShowSource = isShowSource;
    }

    public PipelineTemplateSimpleVO withStages(List<PipelineTemplateSimpleVOStages> stages) {
        this.stages = stages;
        return this;
    }

    public PipelineTemplateSimpleVO addStagesItem(PipelineTemplateSimpleVOStages stagesItem) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        this.stages.add(stagesItem);
        return this;
    }

    public PipelineTemplateSimpleVO withStages(Consumer<List<PipelineTemplateSimpleVOStages>> stagesSetter) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        stagesSetter.accept(this.stages);
        return this;
    }

    /**
     * 模板编排stages
     * @return stages
     */
    public List<PipelineTemplateSimpleVOStages> getStages() {
        return stages;
    }

    public void setStages(List<PipelineTemplateSimpleVOStages> stages) {
        this.stages = stages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineTemplateSimpleVO that = (PipelineTemplateSimpleVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.icon, that.icon) && Objects.equals(this.manifestVersion, that.manifestVersion)
            && Objects.equals(this.language, that.language) && Objects.equals(this.description, that.description)
            && Objects.equals(this.isSystem, that.isSystem) && Objects.equals(this.region, that.region)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.updaterId, that.updaterId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.isCollect, that.isCollect) && Objects.equals(this.isShowSource, that.isShowSource)
            && Objects.equals(this.stages, that.stages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            icon,
            manifestVersion,
            language,
            description,
            isSystem,
            region,
            domainId,
            creatorId,
            creatorName,
            updaterId,
            createTime,
            updateTime,
            isCollect,
            isShowSource,
            stages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineTemplateSimpleVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    isCollect: ").append(toIndentedString(isCollect)).append("\n");
        sb.append("    isShowSource: ").append(toIndentedString(isShowSource)).append("\n");
        sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
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
