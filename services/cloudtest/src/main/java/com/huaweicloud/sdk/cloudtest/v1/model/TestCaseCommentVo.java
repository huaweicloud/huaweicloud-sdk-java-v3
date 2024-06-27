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
public class TestCaseCommentVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notifier")

    private List<String> notifier = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_uri")

    private String testCaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_timestamp")

    private Long createTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_timestamp")

    private Long updateTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    public TestCaseCommentVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get uri
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TestCaseCommentVo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public TestCaseCommentVo withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get comment
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public TestCaseCommentVo withNotifier(List<String> notifier) {
        this.notifier = notifier;
        return this;
    }

    public TestCaseCommentVo addNotifierItem(String notifierItem) {
        if (this.notifier == null) {
            this.notifier = new ArrayList<>();
        }
        this.notifier.add(notifierItem);
        return this;
    }

    public TestCaseCommentVo withNotifier(Consumer<List<String>> notifierSetter) {
        if (this.notifier == null) {
            this.notifier = new ArrayList<>();
        }
        notifierSetter.accept(this.notifier);
        return this;
    }

    /**
     * Get notifier
     * @return notifier
     */
    public List<String> getNotifier() {
        return notifier;
    }

    public void setNotifier(List<String> notifier) {
        this.notifier = notifier;
    }

    public TestCaseCommentVo withTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
        return this;
    }

    /**
     * Get testCaseUri
     * @return testCaseUri
     */
    public String getTestCaseUri() {
        return testCaseUri;
    }

    public void setTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
    }

    public TestCaseCommentVo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get createTime
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public TestCaseCommentVo withCreateTimeTimestamp(Long createTimeTimestamp) {
        this.createTimeTimestamp = createTimeTimestamp;
        return this;
    }

    /**
     * 创建时间时间戳
     * @return createTimeTimestamp
     */
    public Long getCreateTimeTimestamp() {
        return createTimeTimestamp;
    }

    public void setCreateTimeTimestamp(Long createTimeTimestamp) {
        this.createTimeTimestamp = createTimeTimestamp;
    }

    public TestCaseCommentVo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get updateTime
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public TestCaseCommentVo withUpdateTimeTimestamp(Long updateTimeTimestamp) {
        this.updateTimeTimestamp = updateTimeTimestamp;
        return this;
    }

    /**
     * 更新时间时间戳
     * @return updateTimeTimestamp
     */
    public Long getUpdateTimeTimestamp() {
        return updateTimeTimestamp;
    }

    public void setUpdateTimeTimestamp(Long updateTimeTimestamp) {
        this.updateTimeTimestamp = updateTimeTimestamp;
    }

    public TestCaseCommentVo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * Get projectUuid
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public TestCaseCommentVo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * Get versionUri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public TestCaseCommentVo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCaseCommentVo that = (TestCaseCommentVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.comment, that.comment) && Objects.equals(this.notifier, that.notifier)
            && Objects.equals(this.testCaseUri, that.testCaseUri) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimeTimestamp, that.createTimeTimestamp)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimeTimestamp, that.updateTimeTimestamp)
            && Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.versionUri, that.versionUri)
            && Objects.equals(this.displayName, that.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            creator,
            comment,
            notifier,
            testCaseUri,
            createTime,
            createTimeTimestamp,
            updateTime,
            updateTimeTimestamp,
            projectUuid,
            versionUri,
            displayName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseCommentVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    notifier: ").append(toIndentedString(notifier)).append("\n");
        sb.append("    testCaseUri: ").append(toIndentedString(testCaseUri)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimeTimestamp: ").append(toIndentedString(createTimeTimestamp)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimeTimestamp: ").append(toIndentedString(updateTimeTimestamp)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
