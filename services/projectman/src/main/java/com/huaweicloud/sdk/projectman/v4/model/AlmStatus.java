package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlmStatus
 */
public class AlmStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belonging")

    private String belonging;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_id")

    private String spaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition_type")

    private String definitionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "belong_definition_type")

    private Integer belongDefinitionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_value")

    private String displayValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private Integer position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayable")

    private Integer displayable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editable")

    private Integer editable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletable")

    private Integer deletable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mutable")

    private Integer mutable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title_py")

    private String titlePy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private Long createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private Long modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linkage_node_fields")

    private Boolean linkageNodeFields;

    public AlmStatus withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 状态ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AlmStatus withBelonging(String belonging) {
        this.belonging = belonging;
        return this;
    }

    /**
     * 工作项的状态属性。
     * @return belonging
     */
    public String getBelonging() {
        return belonging;
    }

    public void setBelonging(String belonging) {
        this.belonging = belonging;
    }

    public AlmStatus withSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    /**
     * 状态所属的项目空间ID。
     * @return spaceId
     */
    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public AlmStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 状态名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlmStatus withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 状态code值。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AlmStatus withDefinitionType(String definitionType) {
        this.definitionType = definitionType;
        return this;
    }

    /**
     * 状态定义级别，1,2,3为系统级，4为租户自定义，5为项目自定义。
     * @return definitionType
     */
    public String getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(String definitionType) {
        this.definitionType = definitionType;
    }

    public AlmStatus withBelongDefinitionType(Integer belongDefinitionType) {
        this.belongDefinitionType = belongDefinitionType;
        return this;
    }

    /**
     * 状态归属定义级别，1,2,3为系统级，4为租户自定义，5为项目自定义。区别于definition_type。如果为系统级和租户自定义级，在项目中会复制一份元数据，归属于项目空间。
     * @return belongDefinitionType
     */
    public Integer getBelongDefinitionType() {
        return belongDefinitionType;
    }

    public void setBelongDefinitionType(Integer belongDefinitionType) {
        this.belongDefinitionType = belongDefinitionType;
    }

    public AlmStatus withDisplayValue(String displayValue) {
        this.displayValue = displayValue;
        return this;
    }

    /**
     * 状态名称，和name值相同。
     * @return displayValue
     */
    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public AlmStatus withPosition(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * 位置顺序。
     * @return position
     */
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public AlmStatus withDisplayable(Integer displayable) {
        this.displayable = displayable;
        return this;
    }

    /**
     * 是否显示。
     * @return displayable
     */
    public Integer getDisplayable() {
        return displayable;
    }

    public void setDisplayable(Integer displayable) {
        this.displayable = displayable;
    }

    public AlmStatus withEditable(Integer editable) {
        this.editable = editable;
        return this;
    }

    /**
     * 是否可编辑。
     * @return editable
     */
    public Integer getEditable() {
        return editable;
    }

    public void setEditable(Integer editable) {
        this.editable = editable;
    }

    public AlmStatus withDeletable(Integer deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * 是否可删除。
     * @return deletable
     */
    public Integer getDeletable() {
        return deletable;
    }

    public void setDeletable(Integer deletable) {
        this.deletable = deletable;
    }

    public AlmStatus withMutable(Integer mutable) {
        this.mutable = mutable;
        return this;
    }

    /**
     * 是否可变，即是否为固定值。
     * @return mutable
     */
    public Integer getMutable() {
        return mutable;
    }

    public void setMutable(Integer mutable) {
        this.mutable = mutable;
    }

    public AlmStatus withTitlePy(String titlePy) {
        this.titlePy = titlePy;
        return this;
    }

    /**
     * 标题的拼音首字母。
     * @return titlePy
     */
    public String getTitlePy() {
        return titlePy;
    }

    public void setTitlePy(String titlePy) {
        this.titlePy = titlePy;
    }

    public AlmStatus withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建人用户ID。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public AlmStatus withCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 创建时间。Unix时间戳，精度为毫秒。
     * @return createdDate
     */
    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public AlmStatus withModifiedDate(Long modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 最近修改时间。Unix时间戳，精度为毫秒。
     * @return modifiedDate
     */
    public Long getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Long modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public AlmStatus withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 最近修改人用户ID。
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public AlmStatus withLinkageNodeFields(Boolean linkageNodeFields) {
        this.linkageNodeFields = linkageNodeFields;
        return this;
    }

    /**
     * 工作流配置中用于标识是否新增“节点责任人/节点结束时间”。
     * @return linkageNodeFields
     */
    public Boolean getLinkageNodeFields() {
        return linkageNodeFields;
    }

    public void setLinkageNodeFields(Boolean linkageNodeFields) {
        this.linkageNodeFields = linkageNodeFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlmStatus that = (AlmStatus) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.belonging, that.belonging)
            && Objects.equals(this.spaceId, that.spaceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.code, that.code) && Objects.equals(this.definitionType, that.definitionType)
            && Objects.equals(this.belongDefinitionType, that.belongDefinitionType)
            && Objects.equals(this.displayValue, that.displayValue) && Objects.equals(this.position, that.position)
            && Objects.equals(this.displayable, that.displayable) && Objects.equals(this.editable, that.editable)
            && Objects.equals(this.deletable, that.deletable) && Objects.equals(this.mutable, that.mutable)
            && Objects.equals(this.titlePy, that.titlePy) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.modifiedDate, that.modifiedDate) && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.linkageNodeFields, that.linkageNodeFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            belonging,
            spaceId,
            name,
            code,
            definitionType,
            belongDefinitionType,
            displayValue,
            position,
            displayable,
            editable,
            deletable,
            mutable,
            titlePy,
            createdBy,
            createdDate,
            modifiedDate,
            modifiedBy,
            linkageNodeFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlmStatus {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    belonging: ").append(toIndentedString(belonging)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    definitionType: ").append(toIndentedString(definitionType)).append("\n");
        sb.append("    belongDefinitionType: ").append(toIndentedString(belongDefinitionType)).append("\n");
        sb.append("    displayValue: ").append(toIndentedString(displayValue)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    displayable: ").append(toIndentedString(displayable)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
        sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
        sb.append("    mutable: ").append(toIndentedString(mutable)).append("\n");
        sb.append("    titlePy: ").append(toIndentedString(titlePy)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    linkageNodeFields: ").append(toIndentedString(linkageNodeFields)).append("\n");
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
