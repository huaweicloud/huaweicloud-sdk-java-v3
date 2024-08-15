package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchListResourceResponseData
 */
public class BatchListResourceResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_state")

    private String agentState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, Object> properties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingest_properties")

    private Map<String, String> ingestProperties = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delegated")

    private Boolean isDelegated;

    public BatchListResourceResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * CMDB分配的资源ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchListResourceResponseData withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 云服务分配的资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public BatchListResourceResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchListResourceResponseData withProvider(String provider) {
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

    public BatchListResourceResponseData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BatchListResourceResponseData withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Openstack中的项目I
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BatchListResourceResponseData withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public BatchListResourceResponseData withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * 企业项目ID
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public BatchListResourceResponseData withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public BatchListResourceResponseData addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchListResourceResponseData withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public BatchListResourceResponseData withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * uniAgent唯一id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public BatchListResourceResponseData withAgentState(String agentState) {
        this.agentState = agentState;
        return this;
    }

    /**
     * uniAgent状态
     * @return agentState
     */
    public String getAgentState() {
        return agentState;
    }

    public void setAgentState(String agentState) {
        this.agentState = agentState;
    }

    public BatchListResourceResponseData withProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public BatchListResourceResponseData putPropertiesItem(String key, Object propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public BatchListResourceResponseData withProperties(Consumer<Map<String, Object>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 资源详细属性
     * @return properties
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public BatchListResourceResponseData withIngestProperties(Map<String, String> ingestProperties) {
        this.ingestProperties = ingestProperties;
        return this;
    }

    public BatchListResourceResponseData putIngestPropertiesItem(String key, String ingestPropertiesItem) {
        if (this.ingestProperties == null) {
            this.ingestProperties = new HashMap<>();
        }
        this.ingestProperties.put(key, ingestPropertiesItem);
        return this;
    }

    public BatchListResourceResponseData withIngestProperties(Consumer<Map<String, String>> ingestPropertiesSetter) {
        if (this.ingestProperties == null) {
            this.ingestProperties = new HashMap<>();
        }
        ingestPropertiesSetter.accept(this.ingestProperties);
        return this;
    }

    /**
     * 采集属性
     * @return ingestProperties
     */
    public Map<String, String> getIngestProperties() {
        return ingestProperties;
    }

    public void setIngestProperties(Map<String, String> ingestProperties) {
        this.ingestProperties = ingestProperties;
    }

    public BatchListResourceResponseData withIsDelegated(Boolean isDelegated) {
        this.isDelegated = isDelegated;
        return this;
    }

    /**
     * 是否已托管
     * @return isDelegated
     */
    public Boolean getIsDelegated() {
        return isDelegated;
    }

    public void setIsDelegated(Boolean isDelegated) {
        this.isDelegated = isDelegated;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchListResourceResponseData that = (BatchListResourceResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.type, that.type) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.epId, that.epId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.agentState, that.agentState) && Objects.equals(this.properties, that.properties)
            && Objects.equals(this.ingestProperties, that.ingestProperties)
            && Objects.equals(this.isDelegated, that.isDelegated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            resourceId,
            name,
            provider,
            type,
            projectId,
            regionId,
            epId,
            tags,
            agentId,
            agentState,
            properties,
            ingestProperties,
            isDelegated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListResourceResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    ingestProperties: ").append(toIndentedString(ingestProperties)).append("\n");
        sb.append("    isDelegated: ").append(toIndentedString(isDelegated)).append("\n");
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
