package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CatalogAttributeVO
 */
public class CatalogAttributeVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualifiedName")

    private String qualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nameEng")

    private String nameEng;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataOwner")

    private String dataOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataOwnerList")

    private List<String> dataOwnerList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createBy")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTime")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateBy")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent")

    private CatalogAttributeVOParent parent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parentId")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l1")

    private Boolean l1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l2")

    private Boolean l2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l3")

    private Boolean l3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenantId")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_defined_fields")

    private List<SelfDefinedFieldVO> selfDefinedFields = null;

    public CatalogAttributeVO withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CatalogAttributeVO withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * 名称。
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public CatalogAttributeVO withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 主题所属层级。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public CatalogAttributeVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CatalogAttributeVO withNameEng(String nameEng) {
        this.nameEng = nameEng;
        return this;
    }

    /**
     * 英文名称。
     * @return nameEng
     */
    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public CatalogAttributeVO withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public CatalogAttributeVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CatalogAttributeVO withDataOwner(String dataOwner) {
        this.dataOwner = dataOwner;
        return this;
    }

    /**
     * 数据主体。
     * @return dataOwner
     */
    public String getDataOwner() {
        return dataOwner;
    }

    public void setDataOwner(String dataOwner) {
        this.dataOwner = dataOwner;
    }

    public CatalogAttributeVO withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 责任人。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CatalogAttributeVO withDataOwnerList(List<String> dataOwnerList) {
        this.dataOwnerList = dataOwnerList;
        return this;
    }

    public CatalogAttributeVO addDataOwnerListItem(String dataOwnerListItem) {
        if (this.dataOwnerList == null) {
            this.dataOwnerList = new ArrayList<>();
        }
        this.dataOwnerList.add(dataOwnerListItem);
        return this;
    }

    public CatalogAttributeVO withDataOwnerList(Consumer<List<String>> dataOwnerListSetter) {
        if (this.dataOwnerList == null) {
            this.dataOwnerList = new ArrayList<>();
        }
        dataOwnerListSetter.accept(this.dataOwnerList);
        return this;
    }

    /**
     * 数据主体列表。
     * @return dataOwnerList
     */
    public List<String> getDataOwnerList() {
        return dataOwnerList;
    }

    public void setDataOwnerList(List<String> dataOwnerList) {
        this.dataOwnerList = dataOwnerList;
    }

    public CatalogAttributeVO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CatalogAttributeVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public CatalogAttributeVO withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public CatalogAttributeVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public CatalogAttributeVO withParent(CatalogAttributeVOParent parent) {
        this.parent = parent;
        return this;
    }

    public CatalogAttributeVO withParent(Consumer<CatalogAttributeVOParent> parentSetter) {
        if (this.parent == null) {
            this.parent = new CatalogAttributeVOParent();
            parentSetter.accept(this.parent);
        }

        return this;
    }

    /**
     * Get parent
     * @return parent
     */
    public CatalogAttributeVOParent getParent() {
        return parent;
    }

    public void setParent(CatalogAttributeVOParent parent) {
        this.parent = parent;
    }

    public CatalogAttributeVO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父节点ID。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public CatalogAttributeVO withL1(Boolean l1) {
        this.l1 = l1;
        return this;
    }

    /**
     * 是否为L1层。
     * @return l1
     */
    public Boolean getL1() {
        return l1;
    }

    public void setL1(Boolean l1) {
        this.l1 = l1;
    }

    public CatalogAttributeVO withL2(Boolean l2) {
        this.l2 = l2;
        return this;
    }

    /**
     * 是否为L2层。
     * @return l2
     */
    public Boolean getL2() {
        return l2;
    }

    public void setL2(Boolean l2) {
        this.l2 = l2;
    }

    public CatalogAttributeVO withL3(Boolean l3) {
        this.l3 = l3;
        return this;
    }

    /**
     * 是否为L3层。
     * @return l3
     */
    public Boolean getL3() {
        return l3;
    }

    public void setL3(Boolean l3) {
        this.l3 = l3;
    }

    public CatalogAttributeVO withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * 顺序编号。
     * @return ordinal
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public CatalogAttributeVO withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CatalogAttributeVO withSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
        return this;
    }

    public CatalogAttributeVO addSelfDefinedFieldsItem(SelfDefinedFieldVO selfDefinedFieldsItem) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        this.selfDefinedFields.add(selfDefinedFieldsItem);
        return this;
    }

    public CatalogAttributeVO withSelfDefinedFields(Consumer<List<SelfDefinedFieldVO>> selfDefinedFieldsSetter) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        selfDefinedFieldsSetter.accept(this.selfDefinedFields);
        return this;
    }

    /**
     * 自定义项。
     * @return selfDefinedFields
     */
    public List<SelfDefinedFieldVO> getSelfDefinedFields() {
        return selfDefinedFields;
    }

    public void setSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatalogAttributeVO that = (CatalogAttributeVO) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.qualifiedName, that.qualifiedName)
            && Objects.equals(this.level, that.level) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nameEng, that.nameEng) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.description, that.description) && Objects.equals(this.dataOwner, that.dataOwner)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.dataOwnerList, that.dataOwnerList)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.parent, that.parent) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.l1, that.l1) && Objects.equals(this.l2, that.l2) && Objects.equals(this.l3, that.l3)
            && Objects.equals(this.ordinal, that.ordinal) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.selfDefinedFields, that.selfDefinedFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path,
            qualifiedName,
            level,
            name,
            nameEng,
            alias,
            description,
            dataOwner,
            owner,
            dataOwnerList,
            createTime,
            createBy,
            updateTime,
            updateBy,
            parent,
            parentId,
            l1,
            l2,
            l3,
            ordinal,
            tenantId,
            selfDefinedFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogAttributeVO {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameEng: ").append(toIndentedString(nameEng)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dataOwner: ").append(toIndentedString(dataOwner)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    dataOwnerList: ").append(toIndentedString(dataOwnerList)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    l1: ").append(toIndentedString(l1)).append("\n");
        sb.append("    l2: ").append(toIndentedString(l2)).append("\n");
        sb.append("    l3: ").append(toIndentedString(l3)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    selfDefinedFields: ").append(toIndentedString(selfDefinedFields)).append("\n");
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
