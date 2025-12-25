package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LayoutCreateRequestPojo
 */
public class LayoutCreateRequestPojo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

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
    @JsonProperty(value = "layout_json")

    private Object layoutJson;

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
    @JsonProperty(value = "layout_type")

    private String layoutType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_id")

    private String bindingId;

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
    @JsonProperty(value = "tabs_sum")

    private Integer tabsSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boa_version")

    private String boaVersion;

    public LayoutCreateRequestPojo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 布局名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LayoutCreateRequestPojo withDescription(String description) {
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

    public LayoutCreateRequestPojo withCreateTime(String createTime) {
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

    public LayoutCreateRequestPojo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建者
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public LayoutCreateRequestPojo withCloudPackId(String cloudPackId) {
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

    public LayoutCreateRequestPojo withCloudPackName(String cloudPackName) {
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

    public LayoutCreateRequestPojo withCloudPackVersion(String cloudPackVersion) {
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

    public LayoutCreateRequestPojo withIsBuiltIn(Boolean isBuiltIn) {
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

    public LayoutCreateRequestPojo withLayoutJson(Object layoutJson) {
        this.layoutJson = layoutJson;
        return this;
    }

    /**
     * 布局信息
     * @return layoutJson
     */
    public Object getLayoutJson() {
        return layoutJson;
    }

    public void setLayoutJson(Object layoutJson) {
        this.layoutJson = layoutJson;
    }

    public LayoutCreateRequestPojo withRegionId(String regionId) {
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

    public LayoutCreateRequestPojo withDomainId(String domainId) {
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

    public LayoutCreateRequestPojo withThumbnail(String thumbnail) {
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

    public LayoutCreateRequestPojo withUsedBy(String usedBy) {
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

    public LayoutCreateRequestPojo withLayoutType(String layoutType) {
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

    public LayoutCreateRequestPojo withBindingId(String bindingId) {
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

    public LayoutCreateRequestPojo withBindingCode(String bindingCode) {
        this.bindingCode = bindingCode;
        return this;
    }

    /**
     * 数据类名称business_code；used_by为SECURITY_REPORT/DASHBOARD时不返回该字段
     * @return bindingCode
     */
    public String getBindingCode() {
        return bindingCode;
    }

    public void setBindingCode(String bindingCode) {
        this.bindingCode = bindingCode;
    }

    public LayoutCreateRequestPojo withFieldsSum(Integer fieldsSum) {
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

    public LayoutCreateRequestPojo withWizardsSum(Integer wizardsSum) {
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

    public LayoutCreateRequestPojo withSectionsSum(Integer sectionsSum) {
        this.sectionsSum = sectionsSum;
        return this;
    }

    /**
     * 系统指标总数
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

    public LayoutCreateRequestPojo withTabsSum(Integer tabsSum) {
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

    public LayoutCreateRequestPojo withBoaVersion(String boaVersion) {
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
        LayoutCreateRequestPojo that = (LayoutCreateRequestPojo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.cloudPackId, that.cloudPackId)
            && Objects.equals(this.cloudPackName, that.cloudPackName)
            && Objects.equals(this.cloudPackVersion, that.cloudPackVersion)
            && Objects.equals(this.isBuiltIn, that.isBuiltIn) && Objects.equals(this.layoutJson, that.layoutJson)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.thumbnail, that.thumbnail) && Objects.equals(this.usedBy, that.usedBy)
            && Objects.equals(this.layoutType, that.layoutType) && Objects.equals(this.bindingId, that.bindingId)
            && Objects.equals(this.bindingCode, that.bindingCode) && Objects.equals(this.fieldsSum, that.fieldsSum)
            && Objects.equals(this.wizardsSum, that.wizardsSum) && Objects.equals(this.sectionsSum, that.sectionsSum)
            && Objects.equals(this.tabsSum, that.tabsSum) && Objects.equals(this.boaVersion, that.boaVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            createTime,
            creatorName,
            cloudPackId,
            cloudPackName,
            cloudPackVersion,
            isBuiltIn,
            layoutJson,
            regionId,
            domainId,
            thumbnail,
            usedBy,
            layoutType,
            bindingId,
            bindingCode,
            fieldsSum,
            wizardsSum,
            sectionsSum,
            tabsSum,
            boaVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LayoutCreateRequestPojo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    cloudPackId: ").append(toIndentedString(cloudPackId)).append("\n");
        sb.append("    cloudPackName: ").append(toIndentedString(cloudPackName)).append("\n");
        sb.append("    cloudPackVersion: ").append(toIndentedString(cloudPackVersion)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
        sb.append("    layoutJson: ").append(toIndentedString(layoutJson)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
        sb.append("    layoutType: ").append(toIndentedString(layoutType)).append("\n");
        sb.append("    bindingId: ").append(toIndentedString(bindingId)).append("\n");
        sb.append("    bindingCode: ").append(toIndentedString(bindingCode)).append("\n");
        sb.append("    fieldsSum: ").append(toIndentedString(fieldsSum)).append("\n");
        sb.append("    wizardsSum: ").append(toIndentedString(wizardsSum)).append("\n");
        sb.append("    sectionsSum: ").append(toIndentedString(sectionsSum)).append("\n");
        sb.append("    tabsSum: ").append(toIndentedString(tabsSum)).append("\n");
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
