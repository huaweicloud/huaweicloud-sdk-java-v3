package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作项流转数据对象
 */
public class WorkItemStatusFlowVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_name")

    private String parentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_type")

    private String parentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private String statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_type")

    private String statusType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_to")

    private List<StatusFlowDirectToVo> directTo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assign_to")

    private String assignTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required_assign")

    private Boolean requiredAssign;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required_notes")

    private Boolean requiredNotes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type")

    private Boolean fieldType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    public WorkItemStatusFlowVo withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     *  父状态的名称
     * @return parentName
     */
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public WorkItemStatusFlowVo withParentType(String parentType) {
        this.parentType = parentType;
        return this;
    }

    /**
     * 父状态的类型
     * @return parentType
     */
    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public WorkItemStatusFlowVo withStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * 状态id
     * @return statusId
     */
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public WorkItemStatusFlowVo withName(String name) {
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

    public WorkItemStatusFlowVo withStatusType(String statusType) {
        this.statusType = statusType;
        return this;
    }

    /**
     * 状态类型
     * @return statusType
     */
    public String getStatusType() {
        return statusType;
    }

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public WorkItemStatusFlowVo withDirectTo(List<StatusFlowDirectToVo> directTo) {
        this.directTo = directTo;
        return this;
    }

    public WorkItemStatusFlowVo addDirectToItem(StatusFlowDirectToVo directToItem) {
        if (this.directTo == null) {
            this.directTo = new ArrayList<>();
        }
        this.directTo.add(directToItem);
        return this;
    }

    public WorkItemStatusFlowVo withDirectTo(Consumer<List<StatusFlowDirectToVo>> directToSetter) {
        if (this.directTo == null) {
            this.directTo = new ArrayList<>();
        }
        directToSetter.accept(this.directTo);
        return this;
    }

    /**
     * 流转到的数据
     * @return directTo
     */
    public List<StatusFlowDirectToVo> getDirectTo() {
        return directTo;
    }

    public void setDirectTo(List<StatusFlowDirectToVo> directTo) {
        this.directTo = directTo;
    }

    public WorkItemStatusFlowVo withAssignTo(String assignTo) {
        this.assignTo = assignTo;
        return this;
    }

    /**
     * 处理人的uuid
     * @return assignTo
     */
    public String getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(String assignTo) {
        this.assignTo = assignTo;
    }

    public WorkItemStatusFlowVo withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 评论内容
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public WorkItemStatusFlowVo withRequiredAssign(Boolean requiredAssign) {
        this.requiredAssign = requiredAssign;
        return this;
    }

    /**
     * 处理人是否必填
     * @return requiredAssign
     */
    public Boolean getRequiredAssign() {
        return requiredAssign;
    }

    public void setRequiredAssign(Boolean requiredAssign) {
        this.requiredAssign = requiredAssign;
    }

    public WorkItemStatusFlowVo withRequiredNotes(Boolean requiredNotes) {
        this.requiredNotes = requiredNotes;
        return this;
    }

    /**
     * 评论是否必填
     * @return requiredNotes
     */
    public Boolean getRequiredNotes() {
        return requiredNotes;
    }

    public void setRequiredNotes(Boolean requiredNotes) {
        this.requiredNotes = requiredNotes;
    }

    public WorkItemStatusFlowVo withFieldType(Boolean fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * 是否是字段值，true 处理人的信息是字段值， false 处理人的值是用户的信息,固定值
     * @return fieldType
     */
    public Boolean getFieldType() {
        return fieldType;
    }

    public void setFieldType(Boolean fieldType) {
        this.fieldType = fieldType;
    }

    public WorkItemStatusFlowVo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父状态的uuid
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkItemStatusFlowVo workItemStatusFlowVo = (WorkItemStatusFlowVo) o;
        return Objects.equals(this.parentName, workItemStatusFlowVo.parentName)
            && Objects.equals(this.parentType, workItemStatusFlowVo.parentType)
            && Objects.equals(this.statusId, workItemStatusFlowVo.statusId)
            && Objects.equals(this.name, workItemStatusFlowVo.name)
            && Objects.equals(this.statusType, workItemStatusFlowVo.statusType)
            && Objects.equals(this.directTo, workItemStatusFlowVo.directTo)
            && Objects.equals(this.assignTo, workItemStatusFlowVo.assignTo)
            && Objects.equals(this.comment, workItemStatusFlowVo.comment)
            && Objects.equals(this.requiredAssign, workItemStatusFlowVo.requiredAssign)
            && Objects.equals(this.requiredNotes, workItemStatusFlowVo.requiredNotes)
            && Objects.equals(this.fieldType, workItemStatusFlowVo.fieldType)
            && Objects.equals(this.parentId, workItemStatusFlowVo.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentName,
            parentType,
            statusId,
            name,
            statusType,
            directTo,
            assignTo,
            comment,
            requiredAssign,
            requiredNotes,
            fieldType,
            parentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemStatusFlowVo {\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
        sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
        sb.append("    directTo: ").append(toIndentedString(directTo)).append("\n");
        sb.append("    assignTo: ").append(toIndentedString(assignTo)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    requiredAssign: ").append(toIndentedString(requiredAssign)).append("\n");
        sb.append("    requiredNotes: ").append(toIndentedString(requiredNotes)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
