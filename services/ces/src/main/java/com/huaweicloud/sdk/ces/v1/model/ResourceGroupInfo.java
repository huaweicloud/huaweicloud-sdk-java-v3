package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释** 资源分组信息。
 */
public class ResourceGroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_ids")

    private List<String> relationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_statistics")

    private InstanceStatistics instanceStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusSchemaResp status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<Resource> resources = null;

    public ResourceGroupInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释** 资源分组名称。 **取值范围** 包含字母、数字、_、-或汉字，长度为[1,128]个字符。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ResourceGroupInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释** 资源添加/匹配方式。 **取值范围** 取值只能为EPS（匹配企业项目），TAG（匹配标签），NAME（匹配实例名称），COMB（组合匹配），Manual/空值（手动添加）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceGroupInfo withRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
        return this;
    }

    public ResourceGroupInfo addRelationIdsItem(String relationIdsItem) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        this.relationIds.add(relationIdsItem);
        return this;
    }

    public ResourceGroupInfo withRelationIds(Consumer<List<String>> relationIdsSetter) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        relationIdsSetter.accept(this.relationIds);
        return this;
    }

    /**
     * **参数解释** 企业项目ID列表。
     * @return relationIds
     */
    public List<String> getRelationIds() {
        return relationIds;
    }

    public void setRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
    }

    public ResourceGroupInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 资源分组ID。  **取值范围**： 以rg开头，后跟22位由字母或数字组成的字符串。长度为[2,24]个字符。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ResourceGroupInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释** 资源分组的创建时间，UNIX时间戳，单位毫秒；如：1603819753000。 **取值范围** 在[0,9223372036854775807]区间内
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ResourceGroupInfo withInstanceStatistics(InstanceStatistics instanceStatistics) {
        this.instanceStatistics = instanceStatistics;
        return this;
    }

    public ResourceGroupInfo withInstanceStatistics(Consumer<InstanceStatistics> instanceStatisticsSetter) {
        if (this.instanceStatistics == null) {
            this.instanceStatistics = new InstanceStatistics();
            instanceStatisticsSetter.accept(this.instanceStatistics);
        }

        return this;
    }

    /**
     * Get instanceStatistics
     * @return instanceStatistics
     */
    public InstanceStatistics getInstanceStatistics() {
        return instanceStatistics;
    }

    public void setInstanceStatistics(InstanceStatistics instanceStatistics) {
        this.instanceStatistics = instanceStatistics;
    }

    public ResourceGroupInfo withStatus(StatusSchemaResp status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusSchemaResp getStatus() {
        return status;
    }

    public void setStatus(StatusSchemaResp status) {
        this.status = status;
    }

    public ResourceGroupInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释** 资源分组归属企业项目ID。 **取值范围** 由数字、字母和-组成，或者为0（默认企业项目ID）。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ResourceGroupInfo withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public ResourceGroupInfo addResourcesItem(Resource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ResourceGroupInfo withResources(Consumer<List<Resource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * **参数解释** 一组或者多个资源信息，默认为空。
     * @return resources
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceGroupInfo that = (ResourceGroupInfo) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.relationIds, that.relationIds) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.instanceStatistics, that.instanceStatistics)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName,
            type,
            relationIds,
            groupId,
            createTime,
            instanceStatistics,
            status,
            enterpriseProjectId,
            resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceGroupInfo {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    relationIds: ").append(toIndentedString(relationIds)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    instanceStatistics: ").append(toIndentedString(instanceStatistics)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
