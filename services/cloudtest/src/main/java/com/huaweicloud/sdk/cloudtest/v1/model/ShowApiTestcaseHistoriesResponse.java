package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowApiTestcaseHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id")

    private String testcaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_name")

    private String testcaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_results")

    private List<TestcaseResult> testcaseResults = null;

    public ShowApiTestcaseHistoriesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 测试用例总数
     * minimum: 0
     * maximum: 2147483647
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowApiTestcaseHistoriesResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 测试服务id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowApiTestcaseHistoriesResponse withTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
        return this;
    }

    /**
     * 测试用例id
     * @return testcaseId
     */
    public String getTestcaseId() {
        return testcaseId;
    }

    public void setTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
    }

    public ShowApiTestcaseHistoriesResponse withTestcaseName(String testcaseName) {
        this.testcaseName = testcaseName;
        return this;
    }

    /**
     * 测试用例名称
     * @return testcaseName
     */
    public String getTestcaseName() {
        return testcaseName;
    }

    public void setTestcaseName(String testcaseName) {
        this.testcaseName = testcaseName;
    }

    public ShowApiTestcaseHistoriesResponse withTestcaseResults(List<TestcaseResult> testcaseResults) {
        this.testcaseResults = testcaseResults;
        return this;
    }

    public ShowApiTestcaseHistoriesResponse addTestcaseResultsItem(TestcaseResult testcaseResultsItem) {
        if (this.testcaseResults == null) {
            this.testcaseResults = new ArrayList<>();
        }
        this.testcaseResults.add(testcaseResultsItem);
        return this;
    }

    public ShowApiTestcaseHistoriesResponse withTestcaseResults(Consumer<List<TestcaseResult>> testcaseResultsSetter) {
        if (this.testcaseResults == null) {
            this.testcaseResults = new ArrayList<>();
        }
        testcaseResultsSetter.accept(this.testcaseResults);
        return this;
    }

    /**
     * 测试用例结果集
     * @return testcaseResults
     */
    public List<TestcaseResult> getTestcaseResults() {
        return testcaseResults;
    }

    public void setTestcaseResults(List<TestcaseResult> testcaseResults) {
        this.testcaseResults = testcaseResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowApiTestcaseHistoriesResponse that = (ShowApiTestcaseHistoriesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.testcaseId, that.testcaseId) && Objects.equals(this.testcaseName, that.testcaseName)
            && Objects.equals(this.testcaseResults, that.testcaseResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, projectId, testcaseId, testcaseName, testcaseResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApiTestcaseHistoriesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
        sb.append("    testcaseName: ").append(toIndentedString(testcaseName)).append("\n");
        sb.append("    testcaseResults: ").append(toIndentedString(testcaseResults)).append("\n");
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
