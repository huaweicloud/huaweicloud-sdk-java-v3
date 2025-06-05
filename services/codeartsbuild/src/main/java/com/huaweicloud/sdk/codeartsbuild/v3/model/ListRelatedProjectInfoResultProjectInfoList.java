package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListRelatedProjectInfoResultProjectInfoList
 */
public class ListRelatedProjectInfoResultProjectInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_id")

    private String authorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_domain_id")

    private String authorDomainId;

    public ListRelatedProjectInfoResultProjectInfoList withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * 唯一标识
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ListRelatedProjectInfoResultProjectInfoList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 项目名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListRelatedProjectInfoResultProjectInfoList withAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * 用户ID
     * @return authorId
     */
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public ListRelatedProjectInfoResultProjectInfoList withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListRelatedProjectInfoResultProjectInfoList withAuthorDomainId(String authorDomainId) {
        this.authorDomainId = authorDomainId;
        return this;
    }

    /**
     * 项目创建者租户ID
     * @return authorDomainId
     */
    public String getAuthorDomainId() {
        return authorDomainId;
    }

    public void setAuthorDomainId(String authorDomainId) {
        this.authorDomainId = authorDomainId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRelatedProjectInfoResultProjectInfoList that = (ListRelatedProjectInfoResultProjectInfoList) obj;
        return Objects.equals(this.identifier, that.identifier) && Objects.equals(this.name, that.name)
            && Objects.equals(this.authorId, that.authorId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.authorDomainId, that.authorDomainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, name, authorId, status, authorDomainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRelatedProjectInfoResultProjectInfoList {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    authorDomainId: ").append(toIndentedString(authorDomainId)).append("\n");
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
