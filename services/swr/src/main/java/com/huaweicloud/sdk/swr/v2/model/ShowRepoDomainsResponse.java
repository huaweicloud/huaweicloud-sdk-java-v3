package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ShowRepoDomainsResponse */
public class ShowRepoDomainsResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository")

    private String repository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_domain")

    private String accessDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permit")

    private String permit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deadline")

    private String deadline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    public ShowRepoDomainsResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /** 命名空间
     * 
     * @return namespace */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowRepoDomainsResponse withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /** 镜像仓库
     * 
     * @return repository */
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public ShowRepoDomainsResponse withAccessDomain(String accessDomain) {
        this.accessDomain = accessDomain;
        return this;
    }

    /** 共享租户名
     * 
     * @return accessDomain */
    public String getAccessDomain() {
        return accessDomain;
    }

    public void setAccessDomain(String accessDomain) {
        this.accessDomain = accessDomain;
    }

    public ShowRepoDomainsResponse withPermit(String permit) {
        this.permit = permit;
        return this;
    }

    /** 权限
     * 
     * @return permit */
    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public ShowRepoDomainsResponse withDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }

    /** 截止时间
     * 
     * @return deadline */
    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public ShowRepoDomainsResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowRepoDomainsResponse withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /** 创建者ID
     * 
     * @return creatorId */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ShowRepoDomainsResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /** 创建者名称
     * 
     * @return creatorName */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ShowRepoDomainsResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    /** 镜像创建时间，UTC时间格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * 
     * @return created */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ShowRepoDomainsResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /** 镜像更新时间，UTC时间格式，时间为UTC标准时间，用户需要根据本地时间计算偏移量；如东8区需要+8:00
     * 
     * @return updated */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ShowRepoDomainsResponse withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /** 是否过期：true:有效；false:过期
     * 
     * @return status */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
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
        ShowRepoDomainsResponse showRepoDomainsResponse = (ShowRepoDomainsResponse) o;
        return Objects.equals(this.namespace, showRepoDomainsResponse.namespace)
            && Objects.equals(this.repository, showRepoDomainsResponse.repository)
            && Objects.equals(this.accessDomain, showRepoDomainsResponse.accessDomain)
            && Objects.equals(this.permit, showRepoDomainsResponse.permit)
            && Objects.equals(this.deadline, showRepoDomainsResponse.deadline)
            && Objects.equals(this.description, showRepoDomainsResponse.description)
            && Objects.equals(this.creatorId, showRepoDomainsResponse.creatorId)
            && Objects.equals(this.creatorName, showRepoDomainsResponse.creatorName)
            && Objects.equals(this.created, showRepoDomainsResponse.created)
            && Objects.equals(this.updated, showRepoDomainsResponse.updated)
            && Objects.equals(this.status, showRepoDomainsResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace,
            repository,
            accessDomain,
            permit,
            deadline,
            description,
            creatorId,
            creatorName,
            created,
            updated,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRepoDomainsResponse {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    accessDomain: ").append(toIndentedString(accessDomain)).append("\n");
        sb.append("    permit: ").append(toIndentedString(permit)).append("\n");
        sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
