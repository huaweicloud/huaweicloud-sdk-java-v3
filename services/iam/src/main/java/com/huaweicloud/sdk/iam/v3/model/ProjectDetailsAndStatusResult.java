package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class ProjectDetailsAndStatusResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_domain")

    @JacksonXmlProperty(localName = "is_domain")

    private Boolean isDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    @JacksonXmlProperty(localName = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    @JacksonXmlProperty(localName = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    public ProjectDetailsAndStatusResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 项目所属账号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ProjectDetailsAndStatusResult withIsDomain(Boolean isDomain) {
        this.isDomain = isDomain;
        return this;
    }

    /**
     * false.
     * @return isDomain
     */
    public Boolean getIsDomain() {
        return isDomain;
    }

    public void setIsDomain(Boolean isDomain) {
        this.isDomain = isDomain;
    }

    public ProjectDetailsAndStatusResult withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 如果查询自己创建的项目，则此处返回所属区域的项目ID。  如果查询的是系统内置项目，如cn-north-4，则此处返回账号ID。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public ProjectDetailsAndStatusResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 项目名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectDetailsAndStatusResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 项目描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectDetailsAndStatusResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 项目ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProjectDetailsAndStatusResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 项目是否可用。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ProjectDetailsAndStatusResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 项目状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectDetailsAndStatusResult projectDetailsAndStatusResult = (ProjectDetailsAndStatusResult) o;
        return Objects.equals(this.domainId, projectDetailsAndStatusResult.domainId)
            && Objects.equals(this.isDomain, projectDetailsAndStatusResult.isDomain)
            && Objects.equals(this.parentId, projectDetailsAndStatusResult.parentId)
            && Objects.equals(this.name, projectDetailsAndStatusResult.name)
            && Objects.equals(this.description, projectDetailsAndStatusResult.description)
            && Objects.equals(this.id, projectDetailsAndStatusResult.id)
            && Objects.equals(this.enabled, projectDetailsAndStatusResult.enabled)
            && Objects.equals(this.status, projectDetailsAndStatusResult.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, isDomain, parentId, name, description, id, enabled, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectDetailsAndStatusResult {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    isDomain: ").append(toIndentedString(isDomain)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
