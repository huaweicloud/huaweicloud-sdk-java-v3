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
public class ExternalTestCaseHistoryVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private String author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changes")

    private List<ResourceChangeExternalVo> changes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id")

    private String testcaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date")

    private OffsetDateTime creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_date_timestamp")

    private Long createDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ExternalTestCaseHistoryVo withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * 资源历史记录创建人ID
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ExternalTestCaseHistoryVo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 逻辑region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ExternalTestCaseHistoryVo withChanges(List<ResourceChangeExternalVo> changes) {
        this.changes = changes;
        return this;
    }

    public ExternalTestCaseHistoryVo addChangesItem(ResourceChangeExternalVo changesItem) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        this.changes.add(changesItem);
        return this;
    }

    public ExternalTestCaseHistoryVo withChanges(Consumer<List<ResourceChangeExternalVo>> changesSetter) {
        if (this.changes == null) {
            this.changes = new ArrayList<>();
        }
        changesSetter.accept(this.changes);
        return this;
    }

    /**
     * 历史记录字段变更列表
     * @return changes
     */
    public List<ResourceChangeExternalVo> getChanges() {
        return changes;
    }

    public void setChanges(List<ResourceChangeExternalVo> changes) {
        this.changes = changes;
    }

    public ExternalTestCaseHistoryVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 历史记录id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExternalTestCaseHistoryVo withTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
        return this;
    }

    /**
     * 用例id
     * @return testcaseId
     */
    public String getTestcaseId() {
        return testcaseId;
    }

    public void setTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
    }

    public ExternalTestCaseHistoryVo withCreationDate(OffsetDateTime creationDate) {
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

    public ExternalTestCaseHistoryVo withCreateDateTimestamp(Long createDateTimestamp) {
        this.createDateTimestamp = createDateTimestamp;
        return this;
    }

    /**
     * 创建时间时间戳
     * @return createDateTimestamp
     */
    public Long getCreateDateTimestamp() {
        return createDateTimestamp;
    }

    public void setCreateDateTimestamp(Long createDateTimestamp) {
        this.createDateTimestamp = createDateTimestamp;
    }

    public ExternalTestCaseHistoryVo withAuthorName(String authorName) {
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

    public ExternalTestCaseHistoryVo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExternalTestCaseHistoryVo that = (ExternalTestCaseHistoryVo) obj;
        return Objects.equals(this.author, that.author) && Objects.equals(this.region, that.region)
            && Objects.equals(this.changes, that.changes) && Objects.equals(this.id, that.id)
            && Objects.equals(this.testcaseId, that.testcaseId) && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.createDateTimestamp, that.createDateTimestamp)
            && Objects.equals(this.authorName, that.authorName) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(author, region, changes, id, testcaseId, creationDate, createDateTimestamp, authorName, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalTestCaseHistoryVo {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    createDateTimestamp: ").append(toIndentedString(createDateTimestamp)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
