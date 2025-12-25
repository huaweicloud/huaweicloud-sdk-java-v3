package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LayoutUpdateRequestPojo
 */
public class LayoutUpdateRequestPojo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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
    @JsonProperty(value = "layout_json")

    private Object layoutJson;

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

    public LayoutUpdateRequestPojo withName(String name) {
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

    public LayoutUpdateRequestPojo withDescription(String description) {
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

    public LayoutUpdateRequestPojo withCloudPackId(String cloudPackId) {
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

    public LayoutUpdateRequestPojo withCloudPackName(String cloudPackName) {
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

    public LayoutUpdateRequestPojo withCloudPackVersion(String cloudPackVersion) {
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

    public LayoutUpdateRequestPojo withIsBuiltIn(Boolean isBuiltIn) {
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

    public LayoutUpdateRequestPojo withIsTemplate(Boolean isTemplate) {
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

    public LayoutUpdateRequestPojo withLayoutJson(Object layoutJson) {
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

    public LayoutUpdateRequestPojo withFieldsSum(Integer fieldsSum) {
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

    public LayoutUpdateRequestPojo withWizardsSum(Integer wizardsSum) {
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

    public LayoutUpdateRequestPojo withSectionsSum(Integer sectionsSum) {
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

    public LayoutUpdateRequestPojo withTabsSum(Integer tabsSum) {
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

    public LayoutUpdateRequestPojo withBoaVersion(String boaVersion) {
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
        LayoutUpdateRequestPojo that = (LayoutUpdateRequestPojo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.cloudPackId, that.cloudPackId)
            && Objects.equals(this.cloudPackName, that.cloudPackName)
            && Objects.equals(this.cloudPackVersion, that.cloudPackVersion)
            && Objects.equals(this.isBuiltIn, that.isBuiltIn) && Objects.equals(this.isTemplate, that.isTemplate)
            && Objects.equals(this.layoutJson, that.layoutJson) && Objects.equals(this.fieldsSum, that.fieldsSum)
            && Objects.equals(this.wizardsSum, that.wizardsSum) && Objects.equals(this.sectionsSum, that.sectionsSum)
            && Objects.equals(this.tabsSum, that.tabsSum) && Objects.equals(this.boaVersion, that.boaVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            cloudPackId,
            cloudPackName,
            cloudPackVersion,
            isBuiltIn,
            isTemplate,
            layoutJson,
            fieldsSum,
            wizardsSum,
            sectionsSum,
            tabsSum,
            boaVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LayoutUpdateRequestPojo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cloudPackId: ").append(toIndentedString(cloudPackId)).append("\n");
        sb.append("    cloudPackName: ").append(toIndentedString(cloudPackName)).append("\n");
        sb.append("    cloudPackVersion: ").append(toIndentedString(cloudPackVersion)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
        sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
        sb.append("    layoutJson: ").append(toIndentedString(layoutJson)).append("\n");
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
