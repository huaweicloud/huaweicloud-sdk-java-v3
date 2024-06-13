package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class TestItemVo {

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
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequence")

    private String frequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

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
    @JsonProperty(value = "is_feature")

    private String isFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relate_htsm")

    private String relateHtsm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_unique_id")

    private String awUniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_mind_id")

    private String testMindId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_mind_url")

    private String testMindUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_total")

    private Integer caseTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execd_total")

    private Integer execdTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_direct_relation")

    private Boolean isDirectRelation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_child")

    private Boolean hasChild;

    public TestItemVo withUri(String uri) {
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

    public TestItemVo withType(String type) {
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

    public TestItemVo withAuthor(String author) {
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

    public TestItemVo withName(String name) {
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

    public TestItemVo withRank(Integer rank) {
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

    public TestItemVo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 责任人
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TestItemVo withFrequence(String frequence) {
        this.frequence = frequence;
        return this;
    }

    /**
     * frequence值
     * @return frequence
     */
    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    public TestItemVo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TestItemVo withLastModifier(String lastModifier) {
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

    public TestItemVo withLastModified(OffsetDateTime lastModified) {
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

    public TestItemVo withLastModifiedTimestamp(Long lastModifiedTimestamp) {
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

    public TestItemVo withLastChangeTime(OffsetDateTime lastChangeTime) {
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

    public TestItemVo withVersionUri(String versionUri) {
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

    public TestItemVo withOriginUri(String originUri) {
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

    public TestItemVo withParentUri(String parentUri) {
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

    public TestItemVo withParentPath(String parentPath) {
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

    public TestItemVo withCreationVersionUri(String creationVersionUri) {
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

    public TestItemVo withCreationDate(OffsetDateTime creationDate) {
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

    public TestItemVo withCreationDateTimestamp(Long creationDateTimestamp) {
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

    public TestItemVo withAuthorName(String authorName) {
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

    public TestItemVo withComment(String comment) {
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

    public TestItemVo withNumber(String number) {
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

    public TestItemVo withIsFeature(String isFeature) {
        this.isFeature = isFeature;
        return this;
    }

    /**
     * 是否特性
     * @return isFeature
     */
    public String getIsFeature() {
        return isFeature;
    }

    public void setIsFeature(String isFeature) {
        this.isFeature = isFeature;
    }

    public TestItemVo withRelateHtsm(String relateHtsm) {
        this.relateHtsm = relateHtsm;
        return this;
    }

    /**
     * 是否关联特性
     * @return relateHtsm
     */
    public String getRelateHtsm() {
        return relateHtsm;
    }

    public void setRelateHtsm(String relateHtsm) {
        this.relateHtsm = relateHtsm;
    }

    public TestItemVo withAwUniqueId(String awUniqueId) {
        this.awUniqueId = awUniqueId;
        return this;
    }

    /**
     * aw id
     * @return awUniqueId
     */
    public String getAwUniqueId() {
        return awUniqueId;
    }

    public void setAwUniqueId(String awUniqueId) {
        this.awUniqueId = awUniqueId;
    }

    public TestItemVo withTestMindId(String testMindId) {
        this.testMindId = testMindId;
        return this;
    }

    /**
     * 脑图id
     * @return testMindId
     */
    public String getTestMindId() {
        return testMindId;
    }

    public void setTestMindId(String testMindId) {
        this.testMindId = testMindId;
    }

    public TestItemVo withTestMindUrl(String testMindUrl) {
        this.testMindUrl = testMindUrl;
        return this;
    }

    /**
     * 脑图url
     * @return testMindUrl
     */
    public String getTestMindUrl() {
        return testMindUrl;
    }

    public void setTestMindUrl(String testMindUrl) {
        this.testMindUrl = testMindUrl;
    }

    public TestItemVo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public TestItemVo withCaseTotal(Integer caseTotal) {
        this.caseTotal = caseTotal;
        return this;
    }

    /**
     * 用例总数
     * @return caseTotal
     */
    public Integer getCaseTotal() {
        return caseTotal;
    }

    public void setCaseTotal(Integer caseTotal) {
        this.caseTotal = caseTotal;
    }

    public TestItemVo withExecdTotal(Integer execdTotal) {
        this.execdTotal = execdTotal;
        return this;
    }

    /**
     * 执行总数
     * @return execdTotal
     */
    public Integer getExecdTotal() {
        return execdTotal;
    }

    public void setExecdTotal(Integer execdTotal) {
        this.execdTotal = execdTotal;
    }

    public TestItemVo withIsDirectRelation(Boolean isDirectRelation) {
        this.isDirectRelation = isDirectRelation;
        return this;
    }

    /**
     * is_direct_relation
     * @return isDirectRelation
     */
    public Boolean getIsDirectRelation() {
        return isDirectRelation;
    }

    public void setIsDirectRelation(Boolean isDirectRelation) {
        this.isDirectRelation = isDirectRelation;
    }

    public TestItemVo withHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
        return this;
    }

    /**
     * 是否有子特性
     * @return hasChild
     */
    public Boolean getHasChild() {
        return hasChild;
    }

    public void setHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestItemVo that = (TestItemVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.type, that.type)
            && Objects.equals(this.author, that.author) && Objects.equals(this.name, that.name)
            && Objects.equals(this.rank, that.rank) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.frequence, that.frequence) && Objects.equals(this.region, that.region)
            && Objects.equals(this.lastModifier, that.lastModifier)
            && Objects.equals(this.lastModified, that.lastModified)
            && Objects.equals(this.lastModifiedTimestamp, that.lastModifiedTimestamp)
            && Objects.equals(this.lastChangeTime, that.lastChangeTime)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.originUri, that.originUri)
            && Objects.equals(this.parentUri, that.parentUri) && Objects.equals(this.parentPath, that.parentPath)
            && Objects.equals(this.creationVersionUri, that.creationVersionUri)
            && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.creationDateTimestamp, that.creationDateTimestamp)
            && Objects.equals(this.authorName, that.authorName) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.number, that.number) && Objects.equals(this.isFeature, that.isFeature)
            && Objects.equals(this.relateHtsm, that.relateHtsm) && Objects.equals(this.awUniqueId, that.awUniqueId)
            && Objects.equals(this.testMindId, that.testMindId) && Objects.equals(this.testMindUrl, that.testMindUrl)
            && Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.caseTotal, that.caseTotal)
            && Objects.equals(this.execdTotal, that.execdTotal)
            && Objects.equals(this.isDirectRelation, that.isDirectRelation)
            && Objects.equals(this.hasChild, that.hasChild);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            type,
            author,
            name,
            rank,
            owner,
            frequence,
            region,
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
            isFeature,
            relateHtsm,
            awUniqueId,
            testMindId,
            testMindUrl,
            projectUuid,
            caseTotal,
            execdTotal,
            isDirectRelation,
            hasChild);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestItemVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    frequence: ").append(toIndentedString(frequence)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
        sb.append("    isFeature: ").append(toIndentedString(isFeature)).append("\n");
        sb.append("    relateHtsm: ").append(toIndentedString(relateHtsm)).append("\n");
        sb.append("    awUniqueId: ").append(toIndentedString(awUniqueId)).append("\n");
        sb.append("    testMindId: ").append(toIndentedString(testMindId)).append("\n");
        sb.append("    testMindUrl: ").append(toIndentedString(testMindUrl)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    caseTotal: ").append(toIndentedString(caseTotal)).append("\n");
        sb.append("    execdTotal: ").append(toIndentedString(execdTotal)).append("\n");
        sb.append("    isDirectRelation: ").append(toIndentedString(isDirectRelation)).append("\n");
        sb.append("    hasChild: ").append(toIndentedString(hasChild)).append("\n");
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
