package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CompliancePackageModel
 */
public class CompliancePackageModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_catalog_vo_list")

    private List<BaselineCatalogModel> specCatalogVoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classify")

    private String classify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "areas")

    private String areas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_items_num")

    private Integer checkItemsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_auto_check_items")

    private Boolean hasAutoCheckItems;

    public CompliancePackageModel withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 遵从包的uuid
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public CompliancePackageModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 遵从包的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompliancePackageModel withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 遵从包的版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CompliancePackageModel withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 遵从包的责任人
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CompliancePackageModel withSpecCatalogVoList(List<BaselineCatalogModel> specCatalogVoList) {
        this.specCatalogVoList = specCatalogVoList;
        return this;
    }

    public CompliancePackageModel addSpecCatalogVoListItem(BaselineCatalogModel specCatalogVoListItem) {
        if (this.specCatalogVoList == null) {
            this.specCatalogVoList = new ArrayList<>();
        }
        this.specCatalogVoList.add(specCatalogVoListItem);
        return this;
    }

    public CompliancePackageModel withSpecCatalogVoList(Consumer<List<BaselineCatalogModel>> specCatalogVoListSetter) {
        if (this.specCatalogVoList == null) {
            this.specCatalogVoList = new ArrayList<>();
        }
        specCatalogVoListSetter.accept(this.specCatalogVoList);
        return this;
    }

    /**
     * 遵从包的目录列表
     * @return specCatalogVoList
     */
    public List<BaselineCatalogModel> getSpecCatalogVoList() {
        return specCatalogVoList;
    }

    public void setSpecCatalogVoList(List<BaselineCatalogModel> specCatalogVoList) {
        this.specCatalogVoList = specCatalogVoList;
    }

    public CompliancePackageModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对遵从包的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CompliancePackageModel withClassify(String classify) {
        this.classify = classify;
        return this;
    }

    /**
     * 遵从包的分类
     * @return classify
     */
    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public CompliancePackageModel withAreas(String areas) {
        this.areas = areas;
        return this;
    }

    /**
     * 遵从包适用的领域
     * @return areas
     */
    public String getAreas() {
        return areas;
    }

    public void setAreas(String areas) {
        this.areas = areas;
    }

    public CompliancePackageModel withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 遵从包适用的区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CompliancePackageModel withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * 表示遵从包的状态 0：未启用 1: 启用
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public CompliancePackageModel withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 表示遵从包的类型 0：内置 1: 自定义
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CompliancePackageModel withCheckItemsNum(Integer checkItemsNum) {
        this.checkItemsNum = checkItemsNum;
        return this;
    }

    /**
     * 表示该遵从包包含的检查项个数
     * @return checkItemsNum
     */
    public Integer getCheckItemsNum() {
        return checkItemsNum;
    }

    public void setCheckItemsNum(Integer checkItemsNum) {
        this.checkItemsNum = checkItemsNum;
    }

    public CompliancePackageModel withHasAutoCheckItems(Boolean hasAutoCheckItems) {
        this.hasAutoCheckItems = hasAutoCheckItems;
        return this;
    }

    /**
     * 表示该遵从包是否包含自动检查项
     * @return hasAutoCheckItems
     */
    public Boolean getHasAutoCheckItems() {
        return hasAutoCheckItems;
    }

    public void setHasAutoCheckItems(Boolean hasAutoCheckItems) {
        this.hasAutoCheckItems = hasAutoCheckItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompliancePackageModel that = (CompliancePackageModel) obj;
        return Objects.equals(this.uuid, that.uuid) && Objects.equals(this.name, that.name)
            && Objects.equals(this.version, that.version) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.specCatalogVoList, that.specCatalogVoList)
            && Objects.equals(this.description, that.description) && Objects.equals(this.classify, that.classify)
            && Objects.equals(this.areas, that.areas) && Objects.equals(this.region, that.region)
            && Objects.equals(this.state, that.state) && Objects.equals(this.type, that.type)
            && Objects.equals(this.checkItemsNum, that.checkItemsNum)
            && Objects.equals(this.hasAutoCheckItems, that.hasAutoCheckItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid,
            name,
            version,
            owner,
            specCatalogVoList,
            description,
            classify,
            areas,
            region,
            state,
            type,
            checkItemsNum,
            hasAutoCheckItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompliancePackageModel {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    specCatalogVoList: ").append(toIndentedString(specCatalogVoList)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    classify: ").append(toIndentedString(classify)).append("\n");
        sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    checkItemsNum: ").append(toIndentedString(checkItemsNum)).append("\n");
        sb.append("    hasAutoCheckItems: ").append(toIndentedString(hasAutoCheckItems)).append("\n");
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
