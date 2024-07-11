package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class TestCaseReviewVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_name")

    private String testcaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_number")

    private String testcaseNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_stage")

    private String testcaseStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_last_modified")

    private String testcaseLastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_last_modified_timestamp")

    private Long testcaseLastModifiedTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_uri")

    private String testcaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_comment")

    private String closeComment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewer")

    private String reviewer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date")

    private String creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date_timestamp")

    private Long creationDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_user_ids")

    private List<NameAndIdVo> closeUserIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_close_person")

    private String actualClosePerson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_date")

    private String closeDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_date_timestamp")

    private Long closeDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_close_date")

    private String expectCloseDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_close_date_timestamp")

    private Long expectCloseDateTimestamp;

    public TestCaseReviewVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 评审URI
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TestCaseReviewVo withTestcaseName(String testcaseName) {
        this.testcaseName = testcaseName;
        return this;
    }

    /**
     * 用例名称
     * @return testcaseName
     */
    public String getTestcaseName() {
        return testcaseName;
    }

    public void setTestcaseName(String testcaseName) {
        this.testcaseName = testcaseName;
    }

    public TestCaseReviewVo withTestcaseNumber(String testcaseNumber) {
        this.testcaseNumber = testcaseNumber;
        return this;
    }

    /**
     * 用例编号
     * @return testcaseNumber
     */
    public String getTestcaseNumber() {
        return testcaseNumber;
    }

    public void setTestcaseNumber(String testcaseNumber) {
        this.testcaseNumber = testcaseNumber;
    }

    public TestCaseReviewVo withTestcaseStage(String testcaseStage) {
        this.testcaseStage = testcaseStage;
        return this;
    }

    /**
     * 用例阶段
     * @return testcaseStage
     */
    public String getTestcaseStage() {
        return testcaseStage;
    }

    public void setTestcaseStage(String testcaseStage) {
        this.testcaseStage = testcaseStage;
    }

    public TestCaseReviewVo withTestcaseLastModified(String testcaseLastModified) {
        this.testcaseLastModified = testcaseLastModified;
        return this;
    }

    /**
     * 用例修改时间
     * @return testcaseLastModified
     */
    public String getTestcaseLastModified() {
        return testcaseLastModified;
    }

    public void setTestcaseLastModified(String testcaseLastModified) {
        this.testcaseLastModified = testcaseLastModified;
    }

    public TestCaseReviewVo withTestcaseLastModifiedTimestamp(Long testcaseLastModifiedTimestamp) {
        this.testcaseLastModifiedTimestamp = testcaseLastModifiedTimestamp;
        return this;
    }

    /**
     * 用例修改时间时间戳
     * @return testcaseLastModifiedTimestamp
     */
    public Long getTestcaseLastModifiedTimestamp() {
        return testcaseLastModifiedTimestamp;
    }

    public void setTestcaseLastModifiedTimestamp(Long testcaseLastModifiedTimestamp) {
        this.testcaseLastModifiedTimestamp = testcaseLastModifiedTimestamp;
    }

    public TestCaseReviewVo withTestcaseUri(String testcaseUri) {
        this.testcaseUri = testcaseUri;
        return this;
    }

    /**
     * 分支用例URI
     * @return testcaseUri
     */
    public String getTestcaseUri() {
        return testcaseUri;
    }

    public void setTestcaseUri(String testcaseUri) {
        this.testcaseUri = testcaseUri;
    }

    public TestCaseReviewVo withVersionUri(String versionUri) {
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

    public TestCaseReviewVo withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * 版本名称
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public TestCaseReviewVo withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 评审意见
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public TestCaseReviewVo withCloseComment(String closeComment) {
        this.closeComment = closeComment;
        return this;
    }

    /**
     * 闭环意见
     * @return closeComment
     */
    public String getCloseComment() {
        return closeComment;
    }

    public void setCloseComment(String closeComment) {
        this.closeComment = closeComment;
    }

    public TestCaseReviewVo withReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    /**
     * 评审人
     * @return reviewer
     */
    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public TestCaseReviewVo withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 评审创建时间
     * @return creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public TestCaseReviewVo withCreationDateTimestamp(Long creationDateTimestamp) {
        this.creationDateTimestamp = creationDateTimestamp;
        return this;
    }

    /**
     * 评审创建时间时间戳
     * @return creationDateTimestamp
     */
    public Long getCreationDateTimestamp() {
        return creationDateTimestamp;
    }

    public void setCreationDateTimestamp(Long creationDateTimestamp) {
        this.creationDateTimestamp = creationDateTimestamp;
    }

    public TestCaseReviewVo withCloseUserIds(List<NameAndIdVo> closeUserIds) {
        this.closeUserIds = closeUserIds;
        return this;
    }

    public TestCaseReviewVo addCloseUserIdsItem(NameAndIdVo closeUserIdsItem) {
        if (this.closeUserIds == null) {
            this.closeUserIds = new ArrayList<>();
        }
        this.closeUserIds.add(closeUserIdsItem);
        return this;
    }

    public TestCaseReviewVo withCloseUserIds(Consumer<List<NameAndIdVo>> closeUserIdsSetter) {
        if (this.closeUserIds == null) {
            this.closeUserIds = new ArrayList<>();
        }
        closeUserIdsSetter.accept(this.closeUserIds);
        return this;
    }

    /**
     * 指定的闭环人列表
     * @return closeUserIds
     */
    public List<NameAndIdVo> getCloseUserIds() {
        return closeUserIds;
    }

    public void setCloseUserIds(List<NameAndIdVo> closeUserIds) {
        this.closeUserIds = closeUserIds;
    }

    public TestCaseReviewVo withActualClosePerson(String actualClosePerson) {
        this.actualClosePerson = actualClosePerson;
        return this;
    }

    /**
     * 实际闭环人
     * @return actualClosePerson
     */
    public String getActualClosePerson() {
        return actualClosePerson;
    }

    public void setActualClosePerson(String actualClosePerson) {
        this.actualClosePerson = actualClosePerson;
    }

    public TestCaseReviewVo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 评审状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TestCaseReviewVo withCloseDate(String closeDate) {
        this.closeDate = closeDate;
        return this;
    }

    /**
     * 评审闭环时间
     * @return closeDate
     */
    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public TestCaseReviewVo withCloseDateTimestamp(Long closeDateTimestamp) {
        this.closeDateTimestamp = closeDateTimestamp;
        return this;
    }

    /**
     * 评审闭环时间时间戳
     * @return closeDateTimestamp
     */
    public Long getCloseDateTimestamp() {
        return closeDateTimestamp;
    }

    public void setCloseDateTimestamp(Long closeDateTimestamp) {
        this.closeDateTimestamp = closeDateTimestamp;
    }

    public TestCaseReviewVo withExpectCloseDate(String expectCloseDate) {
        this.expectCloseDate = expectCloseDate;
        return this;
    }

    /**
     * 期望闭环时间
     * @return expectCloseDate
     */
    public String getExpectCloseDate() {
        return expectCloseDate;
    }

    public void setExpectCloseDate(String expectCloseDate) {
        this.expectCloseDate = expectCloseDate;
    }

    public TestCaseReviewVo withExpectCloseDateTimestamp(Long expectCloseDateTimestamp) {
        this.expectCloseDateTimestamp = expectCloseDateTimestamp;
        return this;
    }

    /**
     * 期望闭环时间时间戳
     * @return expectCloseDateTimestamp
     */
    public Long getExpectCloseDateTimestamp() {
        return expectCloseDateTimestamp;
    }

    public void setExpectCloseDateTimestamp(Long expectCloseDateTimestamp) {
        this.expectCloseDateTimestamp = expectCloseDateTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCaseReviewVo that = (TestCaseReviewVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.testcaseName, that.testcaseName)
            && Objects.equals(this.testcaseNumber, that.testcaseNumber)
            && Objects.equals(this.testcaseStage, that.testcaseStage)
            && Objects.equals(this.testcaseLastModified, that.testcaseLastModified)
            && Objects.equals(this.testcaseLastModifiedTimestamp, that.testcaseLastModifiedTimestamp)
            && Objects.equals(this.testcaseUri, that.testcaseUri) && Objects.equals(this.versionUri, that.versionUri)
            && Objects.equals(this.versionName, that.versionName) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.closeComment, that.closeComment) && Objects.equals(this.reviewer, that.reviewer)
            && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.creationDateTimestamp, that.creationDateTimestamp)
            && Objects.equals(this.closeUserIds, that.closeUserIds)
            && Objects.equals(this.actualClosePerson, that.actualClosePerson)
            && Objects.equals(this.status, that.status) && Objects.equals(this.closeDate, that.closeDate)
            && Objects.equals(this.closeDateTimestamp, that.closeDateTimestamp)
            && Objects.equals(this.expectCloseDate, that.expectCloseDate)
            && Objects.equals(this.expectCloseDateTimestamp, that.expectCloseDateTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            testcaseName,
            testcaseNumber,
            testcaseStage,
            testcaseLastModified,
            testcaseLastModifiedTimestamp,
            testcaseUri,
            versionUri,
            versionName,
            comment,
            closeComment,
            reviewer,
            creationDate,
            creationDateTimestamp,
            closeUserIds,
            actualClosePerson,
            status,
            closeDate,
            closeDateTimestamp,
            expectCloseDate,
            expectCloseDateTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseReviewVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    testcaseName: ").append(toIndentedString(testcaseName)).append("\n");
        sb.append("    testcaseNumber: ").append(toIndentedString(testcaseNumber)).append("\n");
        sb.append("    testcaseStage: ").append(toIndentedString(testcaseStage)).append("\n");
        sb.append("    testcaseLastModified: ").append(toIndentedString(testcaseLastModified)).append("\n");
        sb.append("    testcaseLastModifiedTimestamp: ")
            .append(toIndentedString(testcaseLastModifiedTimestamp))
            .append("\n");
        sb.append("    testcaseUri: ").append(toIndentedString(testcaseUri)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    closeComment: ").append(toIndentedString(closeComment)).append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    creationDateTimestamp: ").append(toIndentedString(creationDateTimestamp)).append("\n");
        sb.append("    closeUserIds: ").append(toIndentedString(closeUserIds)).append("\n");
        sb.append("    actualClosePerson: ").append(toIndentedString(actualClosePerson)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    closeDate: ").append(toIndentedString(closeDate)).append("\n");
        sb.append("    closeDateTimestamp: ").append(toIndentedString(closeDateTimestamp)).append("\n");
        sb.append("    expectCloseDate: ").append(toIndentedString(expectCloseDate)).append("\n");
        sb.append("    expectCloseDateTimestamp: ").append(toIndentedString(expectCloseDateTimestamp)).append("\n");
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
