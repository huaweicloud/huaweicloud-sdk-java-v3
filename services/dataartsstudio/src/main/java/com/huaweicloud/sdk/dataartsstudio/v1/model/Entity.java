package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产信息
 */
public class Entity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private BigDecimal version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relationship_attributes")

    private Object relationshipAttributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "super_type_names")

    private List<String> superTypeNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_attributes")

    private Object businessAttributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_attributes")

    private Object multiAttributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privilege_info")

    private EntityPrivilegeInfo privilegeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extended_attributes")

    private Object extendedAttributes;

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

    public Entity withVersion(BigDecimal version) {
        this.version = version;
        return this;
    }

    /**
     * 数据版本
     * @return version
     */
    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public Entity withRelationshipAttributes(Object relationshipAttributes) {
        this.relationshipAttributes = relationshipAttributes;
        return this;
    }

    /**
     * 关联关系属性，数据类型Map<String, Object>
     * @return relationshipAttributes
     */
    public Object getRelationshipAttributes() {
        return relationshipAttributes;
    }

    public void setRelationshipAttributes(Object relationshipAttributes) {
        this.relationshipAttributes = relationshipAttributes;
    }

    public Entity withSuperTypeNames(List<String> superTypeNames) {
        this.superTypeNames = superTypeNames;
        return this;
    }

    public Entity addSuperTypeNamesItem(String superTypeNamesItem) {
        if (this.superTypeNames == null) {
            this.superTypeNames = new ArrayList<>();
        }
        this.superTypeNames.add(superTypeNamesItem);
        return this;
    }

    public Entity withSuperTypeNames(Consumer<List<String>> superTypeNamesSetter) {
        if (this.superTypeNames == null) {
            this.superTypeNames = new ArrayList<>();
        }
        superTypeNamesSetter.accept(this.superTypeNames);
        return this;
    }

    /**
     * 父类资产类型
     * @return superTypeNames
     */
    public List<String> getSuperTypeNames() {
        return superTypeNames;
    }

    public void setSuperTypeNames(List<String> superTypeNames) {
        this.superTypeNames = superTypeNames;
    }

    public Entity withBusinessAttributes(Object businessAttributes) {
        this.businessAttributes = businessAttributes;
        return this;
    }

    /**
     * 业务属性，数据类型Map<String, Map<String, Object>>
     * @return businessAttributes
     */
    public Object getBusinessAttributes() {
        return businessAttributes;
    }

    public void setBusinessAttributes(Object businessAttributes) {
        this.businessAttributes = businessAttributes;
    }

    public Entity withMultiAttributes(Object multiAttributes) {
        this.multiAttributes = multiAttributes;
        return this;
    }

    /**
     * 承担密级和标签的多值对象数据结构，数据结构Map<String, List<Map<String, Object>>>
     * @return multiAttributes
     */
    public Object getMultiAttributes() {
        return multiAttributes;
    }

    public void setMultiAttributes(Object multiAttributes) {
        this.multiAttributes = multiAttributes;
    }

    public Entity withPrivilegeInfo(EntityPrivilegeInfo privilegeInfo) {
        this.privilegeInfo = privilegeInfo;
        return this;
    }

    public Entity withPrivilegeInfo(Consumer<EntityPrivilegeInfo> privilegeInfoSetter) {
        if (this.privilegeInfo == null) {
            this.privilegeInfo = new EntityPrivilegeInfo();
            privilegeInfoSetter.accept(this.privilegeInfo);
        }

        return this;
    }

    /**
     * Get privilegeInfo
     * @return privilegeInfo
     */
    public EntityPrivilegeInfo getPrivilegeInfo() {
        return privilegeInfo;
    }

    public void setPrivilegeInfo(EntityPrivilegeInfo privilegeInfo) {
        this.privilegeInfo = privilegeInfo;
    }

    public Entity withExtendedAttributes(Object extendedAttributes) {
        this.extendedAttributes = extendedAttributes;
        return this;
    }

    /**
     * 拓展属性，数据结构Map<String, Object>
     * @return extendedAttributes
     */
    public Object getExtendedAttributes() {
        return extendedAttributes;
    }

    public void setExtendedAttributes(Object extendedAttributes) {
        this.extendedAttributes = extendedAttributes;
    }

    public Entity withGuid(String guid) {
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

    public Entity withTypeName(String typeName) {
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

    public Entity withTypeDisplayName(String typeDisplayName) {
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

    public Entity withDisplayText(String displayText) {
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

    public Entity withAttributes(Object attributes) {
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

    public Entity withUpdatedAttributes(List<String> updatedAttributes) {
        this.updatedAttributes = updatedAttributes;
        return this;
    }

    public Entity addUpdatedAttributesItem(String updatedAttributesItem) {
        if (this.updatedAttributes == null) {
            this.updatedAttributes = new ArrayList<>();
        }
        this.updatedAttributes.add(updatedAttributesItem);
        return this;
    }

    public Entity withUpdatedAttributes(Consumer<List<String>> updatedAttributesSetter) {
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

    public Entity withProjectId(String projectId) {
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

    public Entity withDomainId(String domainId) {
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

    public Entity withInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Entity addInstanceIdItem(String instanceIdItem) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceIdItem);
        return this;
    }

    public Entity withInstanceId(Consumer<List<String>> instanceIdSetter) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        instanceIdSetter.accept(this.instanceId);
        return this;
    }

    /**
     * 实例化id
     * @return instanceId
     */
    public List<String> getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
    }

    public Entity withWorkspaceId(List<String> workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    public Entity addWorkspaceIdItem(String workspaceIdItem) {
        if (this.workspaceId == null) {
            this.workspaceId = new ArrayList<>();
        }
        this.workspaceId.add(workspaceIdItem);
        return this;
    }

    public Entity withWorkspaceId(Consumer<List<String>> workspaceIdSetter) {
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

    public Entity withStatus(String status) {
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

    public Entity withCreatedBy(String createdBy) {
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

    public Entity withUpdatedBy(String updatedBy) {
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

    public Entity withCreateTime(String createTime) {
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

    public Entity withUpdateTime(String updateTime) {
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
        Entity that = (Entity) obj;
        return Objects.equals(this.version, that.version)
            && Objects.equals(this.relationshipAttributes, that.relationshipAttributes)
            && Objects.equals(this.superTypeNames, that.superTypeNames)
            && Objects.equals(this.businessAttributes, that.businessAttributes)
            && Objects.equals(this.multiAttributes, that.multiAttributes)
            && Objects.equals(this.privilegeInfo, that.privilegeInfo)
            && Objects.equals(this.extendedAttributes, that.extendedAttributes) && Objects.equals(this.guid, that.guid)
            && Objects.equals(this.typeName, that.typeName)
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
        return Objects.hash(version,
            relationshipAttributes,
            superTypeNames,
            businessAttributes,
            multiAttributes,
            privilegeInfo,
            extendedAttributes,
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
        sb.append("class Entity {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    relationshipAttributes: ").append(toIndentedString(relationshipAttributes)).append("\n");
        sb.append("    superTypeNames: ").append(toIndentedString(superTypeNames)).append("\n");
        sb.append("    businessAttributes: ").append(toIndentedString(businessAttributes)).append("\n");
        sb.append("    multiAttributes: ").append(toIndentedString(multiAttributes)).append("\n");
        sb.append("    privilegeInfo: ").append(toIndentedString(privilegeInfo)).append("\n");
        sb.append("    extendedAttributes: ").append(toIndentedString(extendedAttributes)).append("\n");
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
