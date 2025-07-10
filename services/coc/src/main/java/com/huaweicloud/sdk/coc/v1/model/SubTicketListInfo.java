package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubTicketListInfo
 */
public class SubTicketListInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosting_id")

    private String hostingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties_json")

    private String propertiesJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_json")

    private String tagsJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deleted")

    private Boolean isDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_ticket_id")

    private String mainTicketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_ticket_id")

    private String parentTicketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_ticket_id")

    private String realTicketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_path")

    private String ticketPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_value")

    private String targetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    public SubTicketListInfo withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public SubTicketListInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public SubTicketListInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SubTicketListInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubTicketListInfo withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 资源类型。
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public SubTicketListInfo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public SubTicketListInfo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Region信息。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public SubTicketListInfo withHostingId(String hostingId) {
        this.hostingId = hostingId;
        return this;
    }

    /**
     * 主机ID。
     * @return hostingId
     */
    public String getHostingId() {
        return hostingId;
    }

    public void setHostingId(String hostingId) {
        this.hostingId = hostingId;
    }

    public SubTicketListInfo withPropertiesJson(String propertiesJson) {
        this.propertiesJson = propertiesJson;
        return this;
    }

    /**
     * 资源属性信息。
     * @return propertiesJson
     */
    public String getPropertiesJson() {
        return propertiesJson;
    }

    public void setPropertiesJson(String propertiesJson) {
        this.propertiesJson = propertiesJson;
    }

    public SubTicketListInfo withTagsJson(String tagsJson) {
        this.tagsJson = tagsJson;
        return this;
    }

    /**
     * 资源标签信息。
     * @return tagsJson
     */
    public String getTagsJson() {
        return tagsJson;
    }

    public void setTagsJson(String tagsJson) {
        this.tagsJson = tagsJson;
    }

    public SubTicketListInfo withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 是否已删除。
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public SubTicketListInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 变更工单ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubTicketListInfo withMainTicketId(String mainTicketId) {
        this.mainTicketId = mainTicketId;
        return this;
    }

    /**
     * 变更工单主键ID。
     * @return mainTicketId
     */
    public String getMainTicketId() {
        return mainTicketId;
    }

    public void setMainTicketId(String mainTicketId) {
        this.mainTicketId = mainTicketId;
    }

    public SubTicketListInfo withParentTicketId(String parentTicketId) {
        this.parentTicketId = parentTicketId;
        return this;
    }

    /**
     * 父级工单ID。
     * @return parentTicketId
     */
    public String getParentTicketId() {
        return parentTicketId;
    }

    public void setParentTicketId(String parentTicketId) {
        this.parentTicketId = parentTicketId;
    }

    public SubTicketListInfo withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 问题单ID。
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public SubTicketListInfo withRealTicketId(String realTicketId) {
        this.realTicketId = realTicketId;
        return this;
    }

    /**
     * 问题单单号。
     * @return realTicketId
     */
    public String getRealTicketId() {
        return realTicketId;
    }

    public void setRealTicketId(String realTicketId) {
        this.realTicketId = realTicketId;
    }

    public SubTicketListInfo withTicketPath(String ticketPath) {
        this.ticketPath = ticketPath;
        return this;
    }

    /**
     * 工单路径。
     * @return ticketPath
     */
    public String getTicketPath() {
        return ticketPath;
    }

    public void setTicketPath(String ticketPath) {
        this.ticketPath = ticketPath;
    }

    public SubTicketListInfo withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * region信息。
     * @return targetValue
     */
    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public SubTicketListInfo withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 子单类型。
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public SubTicketListInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public SubTicketListInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public SubTicketListInfo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创单人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public SubTicketListInfo withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作人。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTicketListInfo that = (SubTicketListInfo) obj;
        return Objects.equals(this.epId, that.epId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.hostingId, that.hostingId)
            && Objects.equals(this.propertiesJson, that.propertiesJson) && Objects.equals(this.tagsJson, that.tagsJson)
            && Objects.equals(this.isDeleted, that.isDeleted) && Objects.equals(this.id, that.id)
            && Objects.equals(this.mainTicketId, that.mainTicketId)
            && Objects.equals(this.parentTicketId, that.parentTicketId) && Objects.equals(this.ticketId, that.ticketId)
            && Objects.equals(this.realTicketId, that.realTicketId) && Objects.equals(this.ticketPath, that.ticketPath)
            && Objects.equals(this.targetValue, that.targetValue) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.operator, that.operator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epId,
            resourceId,
            type,
            name,
            provider,
            domainId,
            regionId,
            hostingId,
            propertiesJson,
            tagsJson,
            isDeleted,
            id,
            mainTicketId,
            parentTicketId,
            ticketId,
            realTicketId,
            ticketPath,
            targetValue,
            targetType,
            createTime,
            updateTime,
            creator,
            operator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTicketListInfo {\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    hostingId: ").append(toIndentedString(hostingId)).append("\n");
        sb.append("    propertiesJson: ").append(toIndentedString(propertiesJson)).append("\n");
        sb.append("    tagsJson: ").append(toIndentedString(tagsJson)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mainTicketId: ").append(toIndentedString(mainTicketId)).append("\n");
        sb.append("    parentTicketId: ").append(toIndentedString(parentTicketId)).append("\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    realTicketId: ").append(toIndentedString(realTicketId)).append("\n");
        sb.append("    ticketPath: ").append(toIndentedString(ticketPath)).append("\n");
        sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
