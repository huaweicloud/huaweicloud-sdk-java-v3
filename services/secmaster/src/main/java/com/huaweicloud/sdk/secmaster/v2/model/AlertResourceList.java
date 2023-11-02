package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlertResourceList
 */
public class AlertResourceList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_name")

    private String epName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    public AlertResourceList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云服务资源id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AlertResourceList withName(String name) {
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

    public AlertResourceList withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型；引用华为云RMS type字段
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AlertResourceList withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 云服务名称；引用华为云RMS provider字段
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public AlertResourceList withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域；按照华为云regionId填写，如cn-north-1等
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AlertResourceList withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 资源所属账号ID，UUID格式
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AlertResourceList withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 资源所属项目ID，UUID格式
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AlertResourceList withEpId(String epId) {
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

    public AlertResourceList withEpName(String epName) {
        this.epName = epName;
        return this;
    }

    /**
     * 企业项目名称
     * @return epName
     */
    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public AlertResourceList withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 资源标签 1、最多50个key/values对 2、values：最大255字符，取值范围：字母数字,空格,+, -, =, ., _, :, /,@
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertResourceList that = (AlertResourceList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.epId, that.epId)
            && Objects.equals(this.epName, that.epName) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, provider, regionId, domainId, projectId, epId, epName, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertResourceList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    epName: ").append(toIndentedString(epName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
