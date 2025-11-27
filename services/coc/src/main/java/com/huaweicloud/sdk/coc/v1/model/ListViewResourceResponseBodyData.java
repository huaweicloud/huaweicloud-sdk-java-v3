package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListViewResourceResponseBodyData
 */
public class ListViewResourceResponseBodyData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_id")

    private String viewId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rms_resource_id")

    private String rmsResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_name")

    private String epName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ListViewResourceResponseBodyTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Object properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingest_properties")

    private Object ingestProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_state")

    private String agentState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_ip")

    private String innerIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_group_list")

    private Object associatedGroupList;

    public ListViewResourceResponseBodyData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** id。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListViewResourceResponseBodyData withViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }

    /**
     * **参数解释：** 视图id。 **取值范围：** 不涉及。
     * @return viewId
     */
    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public ListViewResourceResponseBodyData withRmsResourceId(String rmsResourceId) {
        this.rmsResourceId = rmsResourceId;
        return this;
    }

    /**
     * **参数解释：** 对应rms_resource集合中的id值。 **取值范围：** 不涉及。
     * @return rmsResourceId
     */
    public String getRmsResourceId() {
        return rmsResourceId;
    }

    public void setRmsResourceId(String rmsResourceId) {
        this.rmsResourceId = rmsResourceId;
    }

    public ListViewResourceResponseBodyData withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释：** 资源id。。 **取值范围：** 跨账号资源下且视图管理下对应的资源id。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListViewResourceResponseBodyData withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释：** 租户id。 **取值范围：** 用户登录租户对应的账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListViewResourceResponseBodyData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 资源名称。 **取值范围：** 视图下的资源名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListViewResourceResponseBodyData withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * **参数解释：** 企业项目ID。 **取值范围：** 请选择[[企业管理](https://support.huaweicloud.com/usermanual-em/em_eps_qs_0400.html)](tag:hws)[[企业管理](https://support.huaweicloud.com/intl/zh-cn/usermanual-em/em_eps_qs_0400.html)](tag:hws_hk)中存在的项目ID。。
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public ListViewResourceResponseBodyData withEpName(String epName) {
        this.epName = epName;
        return this;
    }

    /**
     * **参数解释：** 企业项目名称。 **取值范围：** 不涉及。
     * @return epName
     */
    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public ListViewResourceResponseBodyData withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** Openstack中的项目ID。 **取值范围：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListViewResourceResponseBodyData withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * **参数解释：** 云服务名称。 **取值范围：** 不涉及。
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ListViewResourceResponseBodyData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 资源类型。 **取值范围：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListViewResourceResponseBodyData withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * **参数解释：** 区域id。 **取值范围：** 不涉及。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListViewResourceResponseBodyData withTags(List<ListViewResourceResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }

    public ListViewResourceResponseBodyData addTagsItem(ListViewResourceResponseBodyTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListViewResourceResponseBodyData withTags(Consumer<List<ListViewResourceResponseBodyTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 标签键值对。 **取值范围：** 不涉及。
     * @return tags
     */
    public List<ListViewResourceResponseBodyTags> getTags() {
        return tags;
    }

    public void setTags(List<ListViewResourceResponseBodyTags> tags) {
        this.tags = tags;
    }

    public ListViewResourceResponseBodyData withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * **参数解释：** 存储资源的附加字段信息，通常用于展示、筛选等。 **取值范围：** 不涉及。
     * @return properties
     */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public ListViewResourceResponseBodyData withIngestProperties(Object ingestProperties) {
        this.ingestProperties = ingestProperties;
        return this;
    }

    /**
     * **参数解释：** 数据采集属性,描述视图系统采集该资源时所记录的附加信息。 **取值范围：** 不涉及。
     * @return ingestProperties
     */
    public Object getIngestProperties() {
        return ingestProperties;
    }

    public void setIngestProperties(Object ingestProperties) {
        this.ingestProperties = ingestProperties;
    }

    public ListViewResourceResponseBodyData withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释：** uniagent的id值。 **取值范围：** 不涉及。
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ListViewResourceResponseBodyData withAgentState(String agentState) {
        this.agentState = agentState;
        return this;
    }

    /**
     * **参数解释：** uniagent的状态。 **取值范围：** 不涉及。
     * @return agentState
     */
    public String getAgentState() {
        return agentState;
    }

    public void setAgentState(String agentState) {
        this.agentState = agentState;
    }

    public ListViewResourceResponseBodyData withInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }

    /**
     * **参数解释：** 资源内网ip。 **取值范围：** 不涉及。
     * @return innerIp
     */
    public String getInnerIp() {
        return innerIp;
    }

    public void setInnerIp(String innerIp) {
        this.innerIp = innerIp;
    }

    public ListViewResourceResponseBodyData withAssociatedGroupList(Object associatedGroupList) {
        this.associatedGroupList = associatedGroupList;
        return this;
    }

    /**
     * **参数解释：** 绑定的资源组信息列表。 **取值范围：** 不涉及。
     * @return associatedGroupList
     */
    public Object getAssociatedGroupList() {
        return associatedGroupList;
    }

    public void setAssociatedGroupList(Object associatedGroupList) {
        this.associatedGroupList = associatedGroupList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListViewResourceResponseBodyData that = (ListViewResourceResponseBodyData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.viewId, that.viewId)
            && Objects.equals(this.rmsResourceId, that.rmsResourceId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.epId, that.epId)
            && Objects.equals(this.epName, that.epName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.type, that.type)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.ingestProperties, that.ingestProperties)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.agentState, that.agentState)
            && Objects.equals(this.innerIp, that.innerIp)
            && Objects.equals(this.associatedGroupList, that.associatedGroupList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            viewId,
            rmsResourceId,
            resourceId,
            domainId,
            name,
            epId,
            epName,
            projectId,
            provider,
            type,
            regionId,
            tags,
            properties,
            ingestProperties,
            agentId,
            agentState,
            innerIp,
            associatedGroupList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListViewResourceResponseBodyData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
        sb.append("    rmsResourceId: ").append(toIndentedString(rmsResourceId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    epName: ").append(toIndentedString(epName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    ingestProperties: ").append(toIndentedString(ingestProperties)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
        sb.append("    innerIp: ").append(toIndentedString(innerIp)).append("\n");
        sb.append("    associatedGroupList: ").append(toIndentedString(associatedGroupList)).append("\n");
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
