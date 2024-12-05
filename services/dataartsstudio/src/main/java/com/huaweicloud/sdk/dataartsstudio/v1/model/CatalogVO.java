package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主题目录。
 */
public class CatalogVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_ch")

    private String nameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualified_name")

    private String qualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_biz")

    private BizVersionManageVO newBiz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_owner")

    private String dataOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_owner_list")

    private String dataOwnerList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_department")

    private String dataDepartment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ordinal")

    private Integer ordinal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swap_order_id")

    private String swapOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qualified_id")

    private String qualifiedId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_public")

    private Boolean fromPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children_num")

    private Integer childrenNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<CatalogVO> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self_defined_fields")

    private List<SelfDefinedFieldVO> selfDefinedFields = null;

    public CatalogVO withNameCh(String nameCh) {
        this.nameCh = nameCh;
        return this;
    }

    /**
     * 中文名称。
     * @return nameCh
     */
    public String getNameCh() {
        return nameCh;
    }

    public void setNameCh(String nameCh) {
        this.nameCh = nameCh;
    }

    public CatalogVO withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 英文名称。
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public CatalogVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CatalogVO withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * 扩展名。
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public CatalogVO withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * guid，自动生成。
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public CatalogVO withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 编码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CatalogVO withAlias(String alias) {
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

    public CatalogVO withStatus(BizStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public BizStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BizStatusEnum status) {
        this.status = status;
    }

    public CatalogVO withNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
        return this;
    }

    public CatalogVO withNewBiz(Consumer<BizVersionManageVO> newBizSetter) {
        if (this.newBiz == null) {
            this.newBiz = new BizVersionManageVO();
            newBizSetter.accept(this.newBiz);
        }

        return this;
    }

    /**
     * Get newBiz
     * @return newBiz
     */
    public BizVersionManageVO getNewBiz() {
        return newBiz;
    }

    public void setNewBiz(BizVersionManageVO newBiz) {
        this.newBiz = newBiz;
    }

    public CatalogVO withDataOwner(String dataOwner) {
        this.dataOwner = dataOwner;
        return this;
    }

    /**
     * 数据所有者。
     * @return dataOwner
     */
    public String getDataOwner() {
        return dataOwner;
    }

    public void setDataOwner(String dataOwner) {
        this.dataOwner = dataOwner;
    }

    public CatalogVO withDataOwnerList(String dataOwnerList) {
        this.dataOwnerList = dataOwnerList;
        return this;
    }

    /**
     * 数据所有者集合。
     * @return dataOwnerList
     */
    public String getDataOwnerList() {
        return dataOwnerList;
    }

    public void setDataOwnerList(String dataOwnerList) {
        this.dataOwnerList = dataOwnerList;
    }

    public CatalogVO withDataDepartment(String dataDepartment) {
        this.dataDepartment = dataDepartment;
        return this;
    }

    /**
     * 数据域。
     * @return dataDepartment
     */
    public String getDataDepartment() {
        return dataDepartment;
    }

    public void setDataDepartment(String dataDepartment) {
        this.dataDepartment = dataDepartment;
    }

    public CatalogVO withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 路径信息。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CatalogVO withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 层级信息。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public CatalogVO withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * 序号。
     * @return ordinal
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public CatalogVO withOwner(String owner) {
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

    public CatalogVO withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父目录ID，木有则为根目录，ID字符串。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public CatalogVO withSwapOrderId(String swapOrderId) {
        this.swapOrderId = swapOrderId;
        return this;
    }

    /**
     * 同层排序，目标节点的ID，ID字符串。
     * @return swapOrderId
     */
    public String getSwapOrderId() {
        return swapOrderId;
    }

    public void setSwapOrderId(String swapOrderId) {
        this.swapOrderId = swapOrderId;
    }

    public CatalogVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主题ID，ID字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CatalogVO withQualifiedId(String qualifiedId) {
        this.qualifiedId = qualifiedId;
        return this;
    }

    /**
     * 认证ID，自动生成。
     * @return qualifiedId
     */
    public String getQualifiedId() {
        return qualifiedId;
    }

    public void setQualifiedId(String qualifiedId) {
        this.qualifiedId = qualifiedId;
    }

    public CatalogVO withFromPublic(Boolean fromPublic) {
        this.fromPublic = fromPublic;
        return this;
    }

    /**
     * 是否来自公共层。
     * @return fromPublic
     */
    public Boolean getFromPublic() {
        return fromPublic;
    }

    public void setFromPublic(Boolean fromPublic) {
        this.fromPublic = fromPublic;
    }

    public CatalogVO withCreateBy(String createBy) {
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

    public CatalogVO withUpdateBy(String updateBy) {
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

    public CatalogVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public CatalogVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public CatalogVO withChildrenNum(Integer childrenNum) {
        this.childrenNum = childrenNum;
        return this;
    }

    /**
     * 拥有子流程的数量，不包括子流程的子流程，前端不传。
     * @return childrenNum
     */
    public Integer getChildrenNum() {
        return childrenNum;
    }

    public void setChildrenNum(Integer childrenNum) {
        this.childrenNum = childrenNum;
    }

    public CatalogVO withChildren(List<CatalogVO> children) {
        this.children = children;
        return this;
    }

    public CatalogVO addChildrenItem(CatalogVO childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public CatalogVO withChildren(Consumer<List<CatalogVO>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 下层子目录，只读。
     * @return children
     */
    public List<CatalogVO> getChildren() {
        return children;
    }

    public void setChildren(List<CatalogVO> children) {
        this.children = children;
    }

    public CatalogVO withSelfDefinedFields(List<SelfDefinedFieldVO> selfDefinedFields) {
        this.selfDefinedFields = selfDefinedFields;
        return this;
    }

    public CatalogVO addSelfDefinedFieldsItem(SelfDefinedFieldVO selfDefinedFieldsItem) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        this.selfDefinedFields.add(selfDefinedFieldsItem);
        return this;
    }

    public CatalogVO withSelfDefinedFields(Consumer<List<SelfDefinedFieldVO>> selfDefinedFieldsSetter) {
        if (this.selfDefinedFields == null) {
            this.selfDefinedFields = new ArrayList<>();
        }
        selfDefinedFieldsSetter.accept(this.selfDefinedFields);
        return this;
    }

    /**
     * 属性自定义项。
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
        CatalogVO that = (CatalogVO) obj;
        return Objects.equals(this.nameCh, that.nameCh) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.qualifiedName, that.qualifiedName) && Objects.equals(this.guid, that.guid)
            && Objects.equals(this.code, that.code) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.status, that.status) && Objects.equals(this.newBiz, that.newBiz)
            && Objects.equals(this.dataOwner, that.dataOwner) && Objects.equals(this.dataOwnerList, that.dataOwnerList)
            && Objects.equals(this.dataDepartment, that.dataDepartment) && Objects.equals(this.path, that.path)
            && Objects.equals(this.level, that.level) && Objects.equals(this.ordinal, that.ordinal)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.swapOrderId, that.swapOrderId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.qualifiedId, that.qualifiedId) && Objects.equals(this.fromPublic, that.fromPublic)
            && Objects.equals(this.createBy, that.createBy) && Objects.equals(this.updateBy, that.updateBy)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.childrenNum, that.childrenNum) && Objects.equals(this.children, that.children)
            && Objects.equals(this.selfDefinedFields, that.selfDefinedFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCh,
            nameEn,
            description,
            qualifiedName,
            guid,
            code,
            alias,
            status,
            newBiz,
            dataOwner,
            dataOwnerList,
            dataDepartment,
            path,
            level,
            ordinal,
            owner,
            parentId,
            swapOrderId,
            id,
            qualifiedId,
            fromPublic,
            createBy,
            updateBy,
            createTime,
            updateTime,
            childrenNum,
            children,
            selfDefinedFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogVO {\n");
        sb.append("    nameCh: ").append(toIndentedString(nameCh)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    qualifiedName: ").append(toIndentedString(qualifiedName)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    newBiz: ").append(toIndentedString(newBiz)).append("\n");
        sb.append("    dataOwner: ").append(toIndentedString(dataOwner)).append("\n");
        sb.append("    dataOwnerList: ").append(toIndentedString(dataOwnerList)).append("\n");
        sb.append("    dataDepartment: ").append(toIndentedString(dataDepartment)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    swapOrderId: ").append(toIndentedString(swapOrderId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    qualifiedId: ").append(toIndentedString(qualifiedId)).append("\n");
        sb.append("    fromPublic: ").append(toIndentedString(fromPublic)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    childrenNum: ").append(toIndentedString(childrenNum)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
