package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IssuesRelationTestCaseVo
 */
public class IssuesRelationTestCaseVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_relation_id")

    private String drRelationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_name")

    private String statusName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private String author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_id")

    private String authorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date")

    private String creationDate;

    public IssuesRelationTestCaseVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 用例ID
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public IssuesRelationTestCaseVo withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 用例编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public IssuesRelationTestCaseVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssuesRelationTestCaseVo withDrRelationId(String drRelationId) {
        this.drRelationId = drRelationId;
        return this;
    }

    /**
     * 工作项id
     * @return drRelationId
     */
    public String getDrRelationId() {
        return drRelationId;
    }

    public void setDrRelationId(String drRelationId) {
        this.drRelationId = drRelationId;
    }

    public IssuesRelationTestCaseVo withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态ID
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public IssuesRelationTestCaseVo withStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }

    /**
     * 状态名称
     * @return statusName
     */
    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public IssuesRelationTestCaseVo withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * 创建人名称
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public IssuesRelationTestCaseVo withAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * 创建人ID
     * @return authorId
     */
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public IssuesRelationTestCaseVo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 处理人名称
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public IssuesRelationTestCaseVo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目ID
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public IssuesRelationTestCaseVo withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 创建时间
     * @return creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssuesRelationTestCaseVo that = (IssuesRelationTestCaseVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.number, that.number)
            && Objects.equals(this.name, that.name) && Objects.equals(this.drRelationId, that.drRelationId)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.statusName, that.statusName)
            && Objects.equals(this.author, that.author) && Objects.equals(this.authorId, that.authorId)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            number,
            name,
            drRelationId,
            statusCode,
            statusName,
            author,
            authorId,
            owner,
            projectUuid,
            creationDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesRelationTestCaseVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    drRelationId: ").append(toIndentedString(drRelationId)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
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
