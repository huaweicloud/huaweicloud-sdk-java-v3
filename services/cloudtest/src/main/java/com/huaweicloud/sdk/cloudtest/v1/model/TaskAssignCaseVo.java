package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class TaskAssignCaseVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private Integer sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_uri")

    private String caseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_available")

    private Integer isAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_name")

    private String testCaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_number")

    private String testCaseNumber;

    public TaskAssignCaseVo withSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序顺序
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public TaskAssignCaseVo withCaseUri(String caseUri) {
        this.caseUri = caseUri;
        return this;
    }

    /**
     * 用例uri
     * @return caseUri
     */
    public String getCaseUri() {
        return caseUri;
    }

    public void setCaseUri(String caseUri) {
        this.caseUri = caseUri;
    }

    public TaskAssignCaseVo withIsAvailable(Integer isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    /**
     * 是否可用
     * @return isAvailable
     */
    public Integer getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Integer isAvailable) {
        this.isAvailable = isAvailable;
    }

    public TaskAssignCaseVo withTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
        return this;
    }

    /**
     * 用例名称
     * @return testCaseName
     */
    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public TaskAssignCaseVo withTestCaseNumber(String testCaseNumber) {
        this.testCaseNumber = testCaseNumber;
        return this;
    }

    /**
     * 用例编号
     * @return testCaseNumber
     */
    public String getTestCaseNumber() {
        return testCaseNumber;
    }

    public void setTestCaseNumber(String testCaseNumber) {
        this.testCaseNumber = testCaseNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskAssignCaseVo that = (TaskAssignCaseVo) obj;
        return Objects.equals(this.sort, that.sort) && Objects.equals(this.caseUri, that.caseUri)
            && Objects.equals(this.isAvailable, that.isAvailable)
            && Objects.equals(this.testCaseName, that.testCaseName)
            && Objects.equals(this.testCaseNumber, that.testCaseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sort, caseUri, isAvailable, testCaseName, testCaseNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskAssignCaseVo {\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    caseUri: ").append(toIndentedString(caseUri)).append("\n");
        sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
        sb.append("    testCaseName: ").append(toIndentedString(testCaseName)).append("\n");
        sb.append("    testCaseNumber: ").append(toIndentedString(testCaseNumber)).append("\n");
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
