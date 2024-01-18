package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关系列表
 */
public class Lineage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type_name")

    private String relationTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep1_id")

    private String ep1Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep1_type_name")

    private String ep1TypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep2_id")

    private String ep2Id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep2_type_name")

    private String ep2TypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end1")

    private Entity end1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end2")

    private Entity end2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "propagate_tag")

    private String propagateTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_display_name")

    private String typeDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_text")

    private String displayText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private Object attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_attributes")

    private List<String> updatedAttributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private List<String> instanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private List<String> workspaceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private String updatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public Lineage withRelationTypeName(String relationTypeName) {
        this.relationTypeName = relationTypeName;
        return this;
    }

    /**
     * 关系类型。PARENT_CHILD,LOGICAL_PHYSICAL,PK_FK,DATA_FLOW,INSTANCE_OF,JOIN,IS_A,UP_DOWN,ASSOCIATION,WORK_FLOW
     * @return relationTypeName
     */
    public String getRelationTypeName() {
        return relationTypeName;
    }

    public void setRelationTypeName(String relationTypeName) {
        this.relationTypeName = relationTypeName;
    }

    public Lineage withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 血缘流向，IN,OUT,BOTH
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Lineage withEp1Id(String ep1Id) {
        this.ep1Id = ep1Id;
        return this;
    }

    /**
     * 节点一资产guid
     * @return ep1Id
     */
    public String getEp1Id() {
        return ep1Id;
    }

    public void setEp1Id(String ep1Id) {
        this.ep1Id = ep1Id;
    }

    public Lineage withEp1TypeName(String ep1TypeName) {
        this.ep1TypeName = ep1TypeName;
        return this;
    }

    /**
     * 节点一资产类型
     * @return ep1TypeName
     */
    public String getEp1TypeName() {
        return ep1TypeName;
    }

    public void setEp1TypeName(String ep1TypeName) {
        this.ep1TypeName = ep1TypeName;
    }

    public Lineage withEp2Id(String ep2Id) {
        this.ep2Id = ep2Id;
        return this;
    }

    /**
     * 节点二资产guid
     * @return ep2Id
     */
    public String getEp2Id() {
        return ep2Id;
    }

    public void setEp2Id(String ep2Id) {
        this.ep2Id = ep2Id;
    }

    public Lineage withEp2TypeName(String ep2TypeName) {
        this.ep2TypeName = ep2TypeName;
        return this;
    }

    /**
     * 节点二资产类型
     * @return ep2TypeName
     */
    public String getEp2TypeName() {
        return ep2TypeName;
    }

    public void setEp2TypeName(String ep2TypeName) {
        this.ep2TypeName = ep2TypeName;
    }

    public Lineage withEnd1(Entity end1) {
        this.end1 = end1;
        return this;
    }

    public Lineage withEnd1(Consumer<Entity> end1Setter) {
        if (this.end1 == null) {
            this.end1 = new Entity();
            end1Setter.accept(this.end1);
        }

        return this;
    }

    /**
     * Get end1
     * @return end1
     */
    public Entity getEnd1() {
        return end1;
    }

    public void setEnd1(Entity end1) {
        this.end1 = end1;
    }

    public Lineage withEnd2(Entity end2) {
        this.end2 = end2;
        return this;
    }

    public Lineage withEnd2(Consumer<Entity> end2Setter) {
        if (this.end2 == null) {
            this.end2 = new Entity();
            end2Setter.accept(this.end2);
        }

        return this;
    }

    /**
     * Get end2
     * @return end2
     */
    public Entity getEnd2() {
        return end2;
    }

    public void setEnd2(Entity end2) {
        this.end2 = end2;
    }

    public Lineage withPropagateTag(String propagateTag) {
        this.propagateTag = propagateTag;
        return this;
    }

    /**
     * 关系类型。NONE,ONE_TO_TWO,TWO_TO_ONE,BOTH
     * @return propagateTag
     */
    public String getPropagateTag() {
        return propagateTag;
    }

    public void setPropagateTag(String propagateTag) {
        this.propagateTag = propagateTag;
    }

    public Lineage withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * 资产guid
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Lineage withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 资产类型名称
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Lineage withTypeDisplayName(String typeDisplayName) {
        this.typeDisplayName = typeDisplayName;
        return this;
    }

    /**
     * 类型展示名称
     * @return typeDisplayName
     */
    public String getTypeDisplayName() {
        return typeDisplayName;
    }

    public void setTypeDisplayName(String typeDisplayName) {
        this.typeDisplayName = typeDisplayName;
    }

    public Lineage withDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    /**
     * 展示名称
     * @return displayText
     */
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public Lineage withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * 资产属性，Map<String, Object>
     * @return attributes
     */
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public Lineage withUpdatedAttributes(List<String> updatedAttributes) {
        this.updatedAttributes = updatedAttributes;
        return this;
    }

    public Lineage addUpdatedAttributesItem(String updatedAttributesItem) {
        if (this.updatedAttributes == null) {
            this.updatedAttributes = new ArrayList<>();
        }
        this.updatedAttributes.add(updatedAttributesItem);
        return this;
    }

    public Lineage withUpdatedAttributes(Consumer<List<String>> updatedAttributesSetter) {
        if (this.updatedAttributes == null) {
            this.updatedAttributes = new ArrayList<>();
        }
        updatedAttributesSetter.accept(this.updatedAttributes);
        return this;
    }

    /**
     * 修改属性列表
     * @return updatedAttributes
     */
    public List<String> getUpdatedAttributes() {
        return updatedAttributes;
    }

    public void setUpdatedAttributes(List<String> updatedAttributes) {
        this.updatedAttributes = updatedAttributes;
    }

    public Lineage withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Lineage withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 主账号id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Lineage withInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Lineage addInstanceIdItem(String instanceIdItem) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceIdItem);
        return this;
    }

    public Lineage withInstanceId(Consumer<List<String>> instanceIdSetter) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        instanceIdSetter.accept(this.instanceId);
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public List<String> getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
    }

    public Lineage withWorkspaceId(List<String> workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public Lineage addWorkspaceIdItem(String workspaceIdItem) {
        if (this.workspaceId == null) {
            this.workspaceId = new ArrayList<>();
        }
        this.workspaceId.add(workspaceIdItem);
        return this;
    }

    public Lineage withWorkspaceId(Consumer<List<String>> workspaceIdSetter) {
        if (this.workspaceId == null) {
            this.workspaceId = new ArrayList<>();
        }
        workspaceIdSetter.accept(this.workspaceId);
        return this;
    }

    /**
     * 空间id列表
     * @return workspaceId
     */
    public List<String> getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(List<String> workspaceId) {
        this.workspaceId = workspaceId;
    }

    public Lineage withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Lineage withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建人
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Lineage withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * 修改人
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Lineage withCreateTime(String createTime) {
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

    public Lineage withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Lineage that = (Lineage) obj;
        return Objects.equals(this.relationTypeName, that.relationTypeName)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.ep1Id, that.ep1Id)
            && Objects.equals(this.ep1TypeName, that.ep1TypeName) && Objects.equals(this.ep2Id, that.ep2Id)
            && Objects.equals(this.ep2TypeName, that.ep2TypeName) && Objects.equals(this.end1, that.end1)
            && Objects.equals(this.end2, that.end2) && Objects.equals(this.propagateTag, that.propagateTag)
            && Objects.equals(this.guid, that.guid) && Objects.equals(this.typeName, that.typeName)
            && Objects.equals(this.typeDisplayName, that.typeDisplayName)
            && Objects.equals(this.displayText, that.displayText) && Objects.equals(this.attributes, that.attributes)
            && Objects.equals(this.updatedAttributes, that.updatedAttributes)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.updatedBy, that.updatedBy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relationTypeName,
            direction,
            ep1Id,
            ep1TypeName,
            ep2Id,
            ep2TypeName,
            end1,
            end2,
            propagateTag,
            guid,
            typeName,
            typeDisplayName,
            displayText,
            attributes,
            updatedAttributes,
            projectId,
            domainId,
            instanceId,
            workspaceId,
            status,
            createdBy,
            updatedBy,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Lineage {\n");
        sb.append("    relationTypeName: ").append(toIndentedString(relationTypeName)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    ep1Id: ").append(toIndentedString(ep1Id)).append("\n");
        sb.append("    ep1TypeName: ").append(toIndentedString(ep1TypeName)).append("\n");
        sb.append("    ep2Id: ").append(toIndentedString(ep2Id)).append("\n");
        sb.append("    ep2TypeName: ").append(toIndentedString(ep2TypeName)).append("\n");
        sb.append("    end1: ").append(toIndentedString(end1)).append("\n");
        sb.append("    end2: ").append(toIndentedString(end2)).append("\n");
        sb.append("    propagateTag: ").append(toIndentedString(propagateTag)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    typeDisplayName: ").append(toIndentedString(typeDisplayName)).append("\n");
        sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    updatedAttributes: ").append(toIndentedString(updatedAttributes)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
