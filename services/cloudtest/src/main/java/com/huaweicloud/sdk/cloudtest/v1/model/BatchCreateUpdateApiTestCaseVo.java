package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class BatchCreateUpdateApiTestCaseVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private String author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank")

    private Integer rank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modifier")

    private String lastModifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private OffsetDateTime lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_timestamp")

    private Long lastModifiedTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_change_time")

    private OffsetDateTime lastChangeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_uri")

    private String originUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_uri")

    private String parentUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_path")

    private String parentPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_version_uri")

    private String creationVersionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date")

    private OffsetDateTime creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date_timestamp")

    private Long creationDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_list")

    private List<TestCaseVo> successList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_list")

    private List<TestCaseInfo> failedList = null;

    public BatchCreateUpdateApiTestCaseVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 资源URI
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public BatchCreateUpdateApiTestCaseVo withType(String type) {
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

    public BatchCreateUpdateApiTestCaseVo withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * 创建人
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BatchCreateUpdateApiTestCaseVo withName(String name) {
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

    public BatchCreateUpdateApiTestCaseVo withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * 级别
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public BatchCreateUpdateApiTestCaseVo withLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
        return this;
    }

    /**
     * 最后修改人
     * @return lastModifier
     */
    public String getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    public BatchCreateUpdateApiTestCaseVo withLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 最后修改时间
     * @return lastModified
     */
    public OffsetDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public BatchCreateUpdateApiTestCaseVo withLastModifiedTimestamp(Long lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
        return this;
    }

    /**
     * 修改时间时间戳
     * @return lastModifiedTimestamp
     */
    public Long getLastModifiedTimestamp() {
        return lastModifiedTimestamp;
    }

    public void setLastModifiedTimestamp(Long lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    public BatchCreateUpdateApiTestCaseVo withLastChangeTime(OffsetDateTime lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
        return this;
    }

    /**
     * 最后变更时间
     * @return lastChangeTime
     */
    public OffsetDateTime getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(OffsetDateTime lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }

    public BatchCreateUpdateApiTestCaseVo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 版本URI
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public BatchCreateUpdateApiTestCaseVo withOriginUri(String originUri) {
        this.originUri = originUri;
        return this;
    }

    /**
     * 源资源URI
     * @return originUri
     */
    public String getOriginUri() {
        return originUri;
    }

    public void setOriginUri(String originUri) {
        this.originUri = originUri;
    }

    public BatchCreateUpdateApiTestCaseVo withParentUri(String parentUri) {
        this.parentUri = parentUri;
        return this;
    }

    /**
     * 父资源URI
     * @return parentUri
     */
    public String getParentUri() {
        return parentUri;
    }

    public void setParentUri(String parentUri) {
        this.parentUri = parentUri;
    }

    public BatchCreateUpdateApiTestCaseVo withParentPath(String parentPath) {
        this.parentPath = parentPath;
        return this;
    }

    /**
     * 父资源路径
     * @return parentPath
     */
    public String getParentPath() {
        return parentPath;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public BatchCreateUpdateApiTestCaseVo withCreationVersionUri(String creationVersionUri) {
        this.creationVersionUri = creationVersionUri;
        return this;
    }

    /**
     * 创建版本URI
     * @return creationVersionUri
     */
    public String getCreationVersionUri() {
        return creationVersionUri;
    }

    public void setCreationVersionUri(String creationVersionUri) {
        this.creationVersionUri = creationVersionUri;
    }

    public BatchCreateUpdateApiTestCaseVo withCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 创建时间
     * @return creationDate
     */
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public BatchCreateUpdateApiTestCaseVo withCreationDateTimestamp(Long creationDateTimestamp) {
        this.creationDateTimestamp = creationDateTimestamp;
        return this;
    }

    /**
     * 创建时间时间戳
     * @return creationDateTimestamp
     */
    public Long getCreationDateTimestamp() {
        return creationDateTimestamp;
    }

    public void setCreationDateTimestamp(Long creationDateTimestamp) {
        this.creationDateTimestamp = creationDateTimestamp;
    }

    public BatchCreateUpdateApiTestCaseVo withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * 创建人名称
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public BatchCreateUpdateApiTestCaseVo withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 备注
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BatchCreateUpdateApiTestCaseVo withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BatchCreateUpdateApiTestCaseVo withSuccessList(List<TestCaseVo> successList) {
        this.successList = successList;
        return this;
    }

    public BatchCreateUpdateApiTestCaseVo addSuccessListItem(TestCaseVo successListItem) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        this.successList.add(successListItem);
        return this;
    }

    public BatchCreateUpdateApiTestCaseVo withSuccessList(Consumer<List<TestCaseVo>> successListSetter) {
        if (this.successList == null) {
            this.successList = new ArrayList<>();
        }
        successListSetter.accept(this.successList);
        return this;
    }

    /**
     * 创建成功的用例列表
     * @return successList
     */
    public List<TestCaseVo> getSuccessList() {
        return successList;
    }

    public void setSuccessList(List<TestCaseVo> successList) {
        this.successList = successList;
    }

    public BatchCreateUpdateApiTestCaseVo withFailedList(List<TestCaseInfo> failedList) {
        this.failedList = failedList;
        return this;
    }

    public BatchCreateUpdateApiTestCaseVo addFailedListItem(TestCaseInfo failedListItem) {
        if (this.failedList == null) {
            this.failedList = new ArrayList<>();
        }
        this.failedList.add(failedListItem);
        return this;
    }

    public BatchCreateUpdateApiTestCaseVo withFailedList(Consumer<List<TestCaseInfo>> failedListSetter) {
        if (this.failedList == null) {
            this.failedList = new ArrayList<>();
        }
        failedListSetter.accept(this.failedList);
        return this;
    }

    /**
     * 创建失败的用例列表
     * @return failedList
     */
    public List<TestCaseInfo> getFailedList() {
        return failedList;
    }

    public void setFailedList(List<TestCaseInfo> failedList) {
        this.failedList = failedList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateUpdateApiTestCaseVo that = (BatchCreateUpdateApiTestCaseVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.type, that.type)
            && Objects.equals(this.author, that.author) && Objects.equals(this.name, that.name)
            && Objects.equals(this.rank, that.rank) && Objects.equals(this.lastModifier, that.lastModifier)
            && Objects.equals(this.lastModified, that.lastModified)
            && Objects.equals(this.lastModifiedTimestamp, that.lastModifiedTimestamp)
            && Objects.equals(this.lastChangeTime, that.lastChangeTime)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.originUri, that.originUri)
            && Objects.equals(this.parentUri, that.parentUri) && Objects.equals(this.parentPath, that.parentPath)
            && Objects.equals(this.creationVersionUri, that.creationVersionUri)
            && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.creationDateTimestamp, that.creationDateTimestamp)
            && Objects.equals(this.authorName, that.authorName) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.number, that.number) && Objects.equals(this.successList, that.successList)
            && Objects.equals(this.failedList, that.failedList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            type,
            author,
            name,
            rank,
            lastModifier,
            lastModified,
            lastModifiedTimestamp,
            lastChangeTime,
            versionUri,
            originUri,
            parentUri,
            parentPath,
            creationVersionUri,
            creationDate,
            creationDateTimestamp,
            authorName,
            comment,
            number,
            successList,
            failedList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateUpdateApiTestCaseVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    lastModifier: ").append(toIndentedString(lastModifier)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    lastModifiedTimestamp: ").append(toIndentedString(lastModifiedTimestamp)).append("\n");
        sb.append("    lastChangeTime: ").append(toIndentedString(lastChangeTime)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    originUri: ").append(toIndentedString(originUri)).append("\n");
        sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
        sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
        sb.append("    creationVersionUri: ").append(toIndentedString(creationVersionUri)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    creationDateTimestamp: ").append(toIndentedString(creationDateTimestamp)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    successList: ").append(toIndentedString(successList)).append("\n");
        sb.append("    failedList: ").append(toIndentedString(failedList)).append("\n");
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
