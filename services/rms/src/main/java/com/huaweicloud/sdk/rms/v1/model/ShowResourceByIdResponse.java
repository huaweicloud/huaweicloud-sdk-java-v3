package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowResourceByIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_name")

    private String epName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checksum")

    private String checksum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_state")

    private String provisioningState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, Object> properties = null;

    public ShowResourceByIdResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 资源id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowResourceByIdResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 资源名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowResourceByIdResponse withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /** 云服务名称
     * 
     * @return provider */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ShowResourceByIdResponse withType(String type) {
        this.type = type;
        return this;
    }

    /** 资源类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowResourceByIdResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /** region id
     * 
     * @return regionId */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowResourceByIdResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** Openstack中的project id
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowResourceByIdResponse withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /** Openstack中的project名称
     * 
     * @return projectName */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ShowResourceByIdResponse withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /** 企业项目id
     * 
     * @return epId */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public ShowResourceByIdResponse withEpName(String epName) {
        this.epName = epName;
        return this;
    }

    /** 企业项目名称
     * 
     * @return epName */
    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public ShowResourceByIdResponse withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /** 资源详情校验码
     * 
     * @return checksum */
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public ShowResourceByIdResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /** 资源创建时间
     * 
     * @return created */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowResourceByIdResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /** 资源更新时间
     * 
     * @return updated */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowResourceByIdResponse withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /** 资源操作状态
     * 
     * @return provisioningState */
    public String getProvisioningState() {
        return provisioningState;
    }

    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    public ShowResourceByIdResponse withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public ShowResourceByIdResponse putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public ShowResourceByIdResponse withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 资源Tag
     * 
     * @return tags */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public ShowResourceByIdResponse withProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public ShowResourceByIdResponse putPropertiesItem(String key, Object propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public ShowResourceByIdResponse withProperties(Consumer<Map<String, Object>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /** 资源详细属性
     * 
     * @return properties */
    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResourceByIdResponse showResourceByIdResponse = (ShowResourceByIdResponse) o;
        return Objects.equals(this.id, showResourceByIdResponse.id)
            && Objects.equals(this.name, showResourceByIdResponse.name)
            && Objects.equals(this.provider, showResourceByIdResponse.provider)
            && Objects.equals(this.type, showResourceByIdResponse.type)
            && Objects.equals(this.regionId, showResourceByIdResponse.regionId)
            && Objects.equals(this.projectId, showResourceByIdResponse.projectId)
            && Objects.equals(this.projectName, showResourceByIdResponse.projectName)
            && Objects.equals(this.epId, showResourceByIdResponse.epId)
            && Objects.equals(this.epName, showResourceByIdResponse.epName)
            && Objects.equals(this.checksum, showResourceByIdResponse.checksum)
            && Objects.equals(this.created, showResourceByIdResponse.created)
            && Objects.equals(this.updated, showResourceByIdResponse.updated)
            && Objects.equals(this.provisioningState, showResourceByIdResponse.provisioningState)
            && Objects.equals(this.tags, showResourceByIdResponse.tags)
            && Objects.equals(this.properties, showResourceByIdResponse.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            provider,
            type,
            regionId,
            projectId,
            projectName,
            epId,
            epName,
            checksum,
            created,
            updated,
            provisioningState,
            tags,
            properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceByIdResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    epName: ").append(toIndentedString(epName)).append("\n");
        sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    provisioningState: ").append(toIndentedString(provisioningState)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
