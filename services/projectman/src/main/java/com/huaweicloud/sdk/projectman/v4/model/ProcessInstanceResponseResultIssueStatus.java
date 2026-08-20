package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作项状态
 */
public class ProcessInstanceResponseResultIssueStatus {

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

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_date")

    private String modifiedDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linkage_node_fields")

    private Boolean linkageNodeFields;

    public ProcessInstanceResponseResultIssueStatus withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 状态id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessInstanceResponseResultIssueStatus withBelonging(String belonging) {
        this.belonging = belonging;
        return this;
    }

    /**
     * **参数解释**： 工作项的状态属性。 **取值范围**： START、IN_PROGRESS、END。
     * @return belonging
     */
    public String getBelonging() {
        return belonging;
    }

    public void setBelonging(String belonging) {
        this.belonging = belonging;
    }

    public ProcessInstanceResponseResultIssueStatus withSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    /**
     * 空间id
     * @return spaceId
     */
    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public ProcessInstanceResponseResultIssueStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 状态名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProcessInstanceResponseResultIssueStatus withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 状态码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProcessInstanceResponseResultIssueStatus withDefinitionType(String definitionType) {
        this.definitionType = definitionType;
        return this;
    }

    /**
     * 定义类型
     * @return definitionType
     */
    public String getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(String definitionType) {
        this.definitionType = definitionType;
    }

    public ProcessInstanceResponseResultIssueStatus withBelongDefinitionType(Integer belongDefinitionType) {
        this.belongDefinitionType = belongDefinitionType;
        return this;
    }

    /**
     * 所属字段定义类型
     * @return belongDefinitionType
     */
    public Integer getBelongDefinitionType() {
        return belongDefinitionType;
    }

    public void setBelongDefinitionType(Integer belongDefinitionType) {
        this.belongDefinitionType = belongDefinitionType;
    }

    public ProcessInstanceResponseResultIssueStatus withDisplayValue(String displayValue) {
        this.displayValue = displayValue;
        return this;
    }

    /**
     * 显示值
     * @return displayValue
     */
    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    public ProcessInstanceResponseResultIssueStatus withPosition(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * 排序位置
     * @return position
     */
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public ProcessInstanceResponseResultIssueStatus withDisplayable(Integer displayable) {
        this.displayable = displayable;
        return this;
    }

    /**
     * 可显示
     * @return displayable
     */
    public Integer getDisplayable() {
        return displayable;
    }

    public void setDisplayable(Integer displayable) {
        this.displayable = displayable;
    }

    public ProcessInstanceResponseResultIssueStatus withEditable(Integer editable) {
        this.editable = editable;
        return this;
    }

    /**
     * 可编辑
     * @return editable
     */
    public Integer getEditable() {
        return editable;
    }

    public void setEditable(Integer editable) {
        this.editable = editable;
    }

    public ProcessInstanceResponseResultIssueStatus withDeletable(Integer deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * 可删除
     * @return deletable
     */
    public Integer getDeletable() {
        return deletable;
    }

    public void setDeletable(Integer deletable) {
        this.deletable = deletable;
    }

    public ProcessInstanceResponseResultIssueStatus withMutable(Integer mutable) {
        this.mutable = mutable;
        return this;
    }

    /**
     * 可变的
     * @return mutable
     */
    public Integer getMutable() {
        return mutable;
    }

    public void setMutable(Integer mutable) {
        this.mutable = mutable;
    }

    public ProcessInstanceResponseResultIssueStatus withTitlePy(String titlePy) {
        this.titlePy = titlePy;
        return this;
    }

    /**
     * 状态拼音
     * @return titlePy
     */
    public String getTitlePy() {
        return titlePy;
    }

    public void setTitlePy(String titlePy) {
        this.titlePy = titlePy;
    }

    public ProcessInstanceResponseResultIssueStatus withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 状态创建人
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ProcessInstanceResponseResultIssueStatus withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 状态创建时间
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public ProcessInstanceResponseResultIssueStatus withModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * 状态最后修改时间
     * @return modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public ProcessInstanceResponseResultIssueStatus withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 状态最后修改人
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public ProcessInstanceResponseResultIssueStatus withLinkageNodeFields(Boolean linkageNodeFields) {
        this.linkageNodeFields = linkageNodeFields;
        return this;
    }

    /**
     * 是否链接节点字段
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
        ProcessInstanceResponseResultIssueStatus that = (ProcessInstanceResponseResultIssueStatus) obj;
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
        sb.append("class ProcessInstanceResponseResultIssueStatus {\n");
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
