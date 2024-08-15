package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListResourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id_list")

    private List<String> resourceIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_id")

    private String azId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private String ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_state")

    private String agentState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key")

    private String tagKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_cluster_id")

    private String cceClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delegated")

    private Boolean isDelegated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ListResourceRequest withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 云服务名称
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ListResourceRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型名称
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListResourceRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 最大的返回数量
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListResourceRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页参数，通过上一个请求中返回的marker信息作为输入，获取当前页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListResourceRequest withResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }

    public ListResourceRequest addResourceIdListItem(String resourceIdListItem) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        this.resourceIdList.add(resourceIdListItem);
        return this;
    }

    public ListResourceRequest withResourceIdList(Consumer<List<String>> resourceIdListSetter) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        resourceIdListSetter.accept(this.resourceIdList);
        return this;
    }

    /**
     * 资源id列表
     * @return resourceIdList
     */
    public List<String> getResourceIdList() {
        return resourceIdList;
    }

    public void setResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
    }

    public ListResourceRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListResourceRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListResourceRequest withAzId(String azId) {
        this.azId = azId;
        return this;
    }

    /**
     * az id
     * @return azId
     */
    public String getAzId() {
        return azId;
    }

    public void setAzId(String azId) {
        this.azId = azId;
    }

    public ListResourceRequest withIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * ip类型，fixed：内网IP，floating：弹性公网IP
     * @return ipType
     */
    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public ListResourceRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ListResourceRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListResourceRequest withAgentState(String agentState) {
        this.agentState = agentState;
        return this;
    }

    /**
     * agent状态
     * @return agentState
     */
    public String getAgentState() {
        return agentState;
    }

    public void setAgentState(String agentState) {
        this.agentState = agentState;
    }

    public ListResourceRequest withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称，模糊匹配
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public ListResourceRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListResourceRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 标签的值
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ListResourceRequest withTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    /**
     * 标签的key
     * @return tagKey
     */
    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public ListResourceRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListResourceRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件id
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ListResourceRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用id
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ListResourceRequest withCceClusterId(String cceClusterId) {
        this.cceClusterId = cceClusterId;
        return this;
    }

    /**
     * cce集群id
     * @return cceClusterId
     */
    public String getCceClusterId() {
        return cceClusterId;
    }

    public void setCceClusterId(String cceClusterId) {
        this.cceClusterId = cceClusterId;
    }

    public ListResourceRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * vpc id
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ListResourceRequest withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * 企业项目id
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public ListResourceRequest withIsDelegated(Boolean isDelegated) {
        this.isDelegated = isDelegated;
        return this;
    }

    /**
     * 资源是否已托管
     * @return isDelegated
     */
    public Boolean getIsDelegated() {
        return isDelegated;
    }

    public void setIsDelegated(Boolean isDelegated) {
        this.isDelegated = isDelegated;
    }

    public ListResourceRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * project id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourceRequest that = (ListResourceRequest) obj;
        return Objects.equals(this.provider, that.provider) && Objects.equals(this.type, that.type)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.resourceIdList, that.resourceIdList) && Objects.equals(this.name, that.name)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.azId, that.azId)
            && Objects.equals(this.ipType, that.ipType) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.status, that.status) && Objects.equals(this.agentState, that.agentState)
            && Objects.equals(this.imageName, that.imageName) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.tagKey, that.tagKey)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.applicationId, that.applicationId)
            && Objects.equals(this.cceClusterId, that.cceClusterId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.epId, that.epId) && Objects.equals(this.isDelegated, that.isDelegated)
            && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider,
            type,
            limit,
            marker,
            resourceIdList,
            name,
            regionId,
            azId,
            ipType,
            ip,
            status,
            agentState,
            imageName,
            osType,
            tag,
            tagKey,
            groupId,
            componentId,
            applicationId,
            cceClusterId,
            vpcId,
            epId,
            isDelegated,
            projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceRequest {\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    resourceIdList: ").append(toIndentedString(resourceIdList)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    azId: ").append(toIndentedString(azId)).append("\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    cceClusterId: ").append(toIndentedString(cceClusterId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    isDelegated: ").append(toIndentedString(isDelegated)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
