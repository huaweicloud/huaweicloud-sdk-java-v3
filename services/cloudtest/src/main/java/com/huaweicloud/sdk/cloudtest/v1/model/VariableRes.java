package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VariableRes
 */
public class VariableRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "by_order")

    private Integer byOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_stamp")

    private Long createTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_string")

    private String createTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currentPermission")

    private String currentPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dynamicParamFlag")

    private Boolean dynamicParamFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "functionParams")

    private String functionParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupId")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSensitiveInfo")

    private Boolean isSensitiveInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSensitiveModified")

    private Boolean isSensitiveModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Integer locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    private Integer nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_node_id")

    private String parentNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    private String property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitiveInfoSetterTime")

    private String sensitiveInfoSetterTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitiveInfoSetterUser")

    private String sensitiveInfoSetterUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceId")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_stamp")

    private Long updateTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_string")

    private String updateTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variableType")

    private Integer variableType;

    public VariableRes withByOrder(Integer byOrder) {
        this.byOrder = byOrder;
        return this;
    }

    /**
     * Get byOrder
     * @return byOrder
     */
    public Integer getByOrder() {
        return byOrder;
    }

    public void setByOrder(Integer byOrder) {
        this.byOrder = byOrder;
    }

    public VariableRes withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public VariableRes withCreateTime(String createTime) {
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

    public VariableRes withCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }

    /**
     * Get createTimeStamp
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public VariableRes withCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
        return this;
    }

    /**
     * Get createTimeString
     * @return createTimeString
     */
    public String getCreateTimeString() {
        return createTimeString;
    }

    public void setCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
    }

    public VariableRes withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public VariableRes withCurrentPermission(String currentPermission) {
        this.currentPermission = currentPermission;
        return this;
    }

    /**
     * Get currentPermission
     * @return currentPermission
     */
    public String getCurrentPermission() {
        return currentPermission;
    }

    public void setCurrentPermission(String currentPermission) {
        this.currentPermission = currentPermission;
    }

    public VariableRes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VariableRes withDynamicParamFlag(Boolean dynamicParamFlag) {
        this.dynamicParamFlag = dynamicParamFlag;
        return this;
    }

    /**
     * Get dynamicParamFlag
     * @return dynamicParamFlag
     */
    public Boolean getDynamicParamFlag() {
        return dynamicParamFlag;
    }

    public void setDynamicParamFlag(Boolean dynamicParamFlag) {
        this.dynamicParamFlag = dynamicParamFlag;
    }

    public VariableRes withFunctionParams(String functionParams) {
        this.functionParams = functionParams;
        return this;
    }

    /**
     * Get functionParams
     * @return functionParams
     */
    public String getFunctionParams() {
        return functionParams;
    }

    public void setFunctionParams(String functionParams) {
        this.functionParams = functionParams;
    }

    public VariableRes withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get groupId
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public VariableRes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VariableRes withIsSensitiveInfo(Boolean isSensitiveInfo) {
        this.isSensitiveInfo = isSensitiveInfo;
        return this;
    }

    /**
     * Get isSensitiveInfo
     * @return isSensitiveInfo
     */
    public Boolean getIsSensitiveInfo() {
        return isSensitiveInfo;
    }

    public void setIsSensitiveInfo(Boolean isSensitiveInfo) {
        this.isSensitiveInfo = isSensitiveInfo;
    }

    public VariableRes withIsSensitiveModified(Boolean isSensitiveModified) {
        this.isSensitiveModified = isSensitiveModified;
        return this;
    }

    /**
     * Get isSensitiveModified
     * @return isSensitiveModified
     */
    public Boolean getIsSensitiveModified() {
        return isSensitiveModified;
    }

    public void setIsSensitiveModified(Boolean isSensitiveModified) {
        this.isSensitiveModified = isSensitiveModified;
    }

    public VariableRes withLocked(Integer locked) {
        this.locked = locked;
        return this;
    }

    /**
     * Get locked
     * @return locked
     */
    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public VariableRes withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VariableRes withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public VariableRes withNodeType(Integer nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * Get nodeType
     * @return nodeType
     */
    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public VariableRes withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Get parentId
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public VariableRes withParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
        return this;
    }

    /**
     * Get parentNodeId
     * @return parentNodeId
     */
    public String getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public VariableRes withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * Get property
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public VariableRes withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public VariableRes withSensitiveInfoSetterTime(String sensitiveInfoSetterTime) {
        this.sensitiveInfoSetterTime = sensitiveInfoSetterTime;
        return this;
    }

    /**
     * Get sensitiveInfoSetterTime
     * @return sensitiveInfoSetterTime
     */
    public String getSensitiveInfoSetterTime() {
        return sensitiveInfoSetterTime;
    }

    public void setSensitiveInfoSetterTime(String sensitiveInfoSetterTime) {
        this.sensitiveInfoSetterTime = sensitiveInfoSetterTime;
    }

    public VariableRes withSensitiveInfoSetterUser(String sensitiveInfoSetterUser) {
        this.sensitiveInfoSetterUser = sensitiveInfoSetterUser;
        return this;
    }

    /**
     * Get sensitiveInfoSetterUser
     * @return sensitiveInfoSetterUser
     */
    public String getSensitiveInfoSetterUser() {
        return sensitiveInfoSetterUser;
    }

    public void setSensitiveInfoSetterUser(String sensitiveInfoSetterUser) {
        this.sensitiveInfoSetterUser = sensitiveInfoSetterUser;
    }

    public VariableRes withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Get sourceId
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public VariableRes withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VariableRes withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public VariableRes withUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
        return this;
    }

    /**
     * Get updateTimeStamp
     * @return updateTimeStamp
     */
    public Long getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    public VariableRes withUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
        return this;
    }

    /**
     * Get updateTimeString
     * @return updateTimeString
     */
    public String getUpdateTimeString() {
        return updateTimeString;
    }

    public void setUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
    }

    public VariableRes withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新人
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public VariableRes withVariableType(Integer variableType) {
        this.variableType = variableType;
        return this;
    }

    /**
     * Get variableType
     * @return variableType
     */
    public Integer getVariableType() {
        return variableType;
    }

    public void setVariableType(Integer variableType) {
        this.variableType = variableType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VariableRes that = (VariableRes) obj;
        return Objects.equals(this.byOrder, that.byOrder) && Objects.equals(this.category, that.category)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimeStamp, that.createTimeStamp)
            && Objects.equals(this.createTimeString, that.createTimeString)
            && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.currentPermission, that.currentPermission)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.dynamicParamFlag, that.dynamicParamFlag)
            && Objects.equals(this.functionParams, that.functionParams) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.id, that.id) && Objects.equals(this.isSensitiveInfo, that.isSensitiveInfo)
            && Objects.equals(this.isSensitiveModified, that.isSensitiveModified)
            && Objects.equals(this.locked, that.locked) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.parentNodeId, that.parentNodeId)
            && Objects.equals(this.property, that.property) && Objects.equals(this.region, that.region)
            && Objects.equals(this.sensitiveInfoSetterTime, that.sensitiveInfoSetterTime)
            && Objects.equals(this.sensitiveInfoSetterUser, that.sensitiveInfoSetterUser)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimeStamp, that.updateTimeStamp)
            && Objects.equals(this.updateTimeString, that.updateTimeString)
            && Objects.equals(this.updateUser, that.updateUser) && Objects.equals(this.variableType, that.variableType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(byOrder,
            category,
            createTime,
            createTimeStamp,
            createTimeString,
            createUser,
            currentPermission,
            description,
            dynamicParamFlag,
            functionParams,
            groupId,
            id,
            isSensitiveInfo,
            isSensitiveModified,
            locked,
            name,
            nodeId,
            nodeType,
            parentId,
            parentNodeId,
            property,
            region,
            sensitiveInfoSetterTime,
            sensitiveInfoSetterUser,
            sourceId,
            type,
            updateTime,
            updateTimeStamp,
            updateTimeString,
            updateUser,
            variableType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VariableRes {\n");
        sb.append("    byOrder: ").append(toIndentedString(byOrder)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimeStamp: ").append(toIndentedString(createTimeStamp)).append("\n");
        sb.append("    createTimeString: ").append(toIndentedString(createTimeString)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    currentPermission: ").append(toIndentedString(currentPermission)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dynamicParamFlag: ").append(toIndentedString(dynamicParamFlag)).append("\n");
        sb.append("    functionParams: ").append(toIndentedString(functionParams)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isSensitiveInfo: ").append(toIndentedString(isSensitiveInfo)).append("\n");
        sb.append("    isSensitiveModified: ").append(toIndentedString(isSensitiveModified)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    parentNodeId: ").append(toIndentedString(parentNodeId)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    sensitiveInfoSetterTime: ").append(toIndentedString(sensitiveInfoSetterTime)).append("\n");
        sb.append("    sensitiveInfoSetterUser: ").append(toIndentedString(sensitiveInfoSetterUser)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimeStamp: ").append(toIndentedString(updateTimeStamp)).append("\n");
        sb.append("    updateTimeString: ").append(toIndentedString(updateTimeString)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
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
