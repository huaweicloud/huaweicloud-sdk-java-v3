package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowAlertRspResourceList
 */
public class ShowAlertRspResourceList {

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
    @JsonProperty(value = "domain_id")

    private String domainId;

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
    @JsonProperty(value = "ep_name")

    private String epName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    public ShowAlertRspResourceList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Id value
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAlertRspResourceList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name, display only
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowAlertRspResourceList withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The name, display only
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowAlertRspResourceList withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Id value
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowAlertRspResourceList withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Id value
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowAlertRspResourceList withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Id value
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowAlertRspResourceList withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * Id value
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public ShowAlertRspResourceList withEpName(String epName) {
        this.epName = epName;
        return this;
    }

    /**
     * The name, display only
     * @return epName
     */
    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public ShowAlertRspResourceList withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Id value
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAlertRspResourceList showAlertRspResourceList = (ShowAlertRspResourceList) o;
        return Objects.equals(this.id, showAlertRspResourceList.id)
            && Objects.equals(this.name, showAlertRspResourceList.name)
            && Objects.equals(this.type, showAlertRspResourceList.type)
            && Objects.equals(this.domainId, showAlertRspResourceList.domainId)
            && Objects.equals(this.projectId, showAlertRspResourceList.projectId)
            && Objects.equals(this.regionId, showAlertRspResourceList.regionId)
            && Objects.equals(this.epId, showAlertRspResourceList.epId)
            && Objects.equals(this.epName, showAlertRspResourceList.epName)
            && Objects.equals(this.tags, showAlertRspResourceList.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, domainId, projectId, regionId, epId, epName, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlertRspResourceList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
