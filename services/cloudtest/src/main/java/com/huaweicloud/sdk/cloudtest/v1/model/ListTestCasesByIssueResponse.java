package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTestCasesByIssueResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_status_map")

    private Map<String, Integer> caseStatusMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_create")

    private Integer newCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "designing")

    private Integer designing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished")

    private Integer finished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testing")

    private Integer testing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_num")

    private Integer testCaseNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcases")

    private List<TestCaseVo> testcases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListTestCasesByIssueResponse withCaseStatusMap(Map<String, Integer> caseStatusMap) {
        this.caseStatusMap = caseStatusMap;
        return this;
    }

    public ListTestCasesByIssueResponse putCaseStatusMapItem(String key, Integer caseStatusMapItem) {
        if (this.caseStatusMap == null) {
            this.caseStatusMap = new HashMap<>();
        }
        this.caseStatusMap.put(key, caseStatusMapItem);
        return this;
    }

    public ListTestCasesByIssueResponse withCaseStatusMap(Consumer<Map<String, Integer>> caseStatusMapSetter) {
        if (this.caseStatusMap == null) {
            this.caseStatusMap = new HashMap<>();
        }
        caseStatusMapSetter.accept(this.caseStatusMap);
        return this;
    }

    /**
     * 用例状态
     * @return caseStatusMap
     */
    public Map<String, Integer> getCaseStatusMap() {
        return caseStatusMap;
    }

    public void setCaseStatusMap(Map<String, Integer> caseStatusMap) {
        this.caseStatusMap = caseStatusMap;
    }

    public ListTestCasesByIssueResponse withNewCreate(Integer newCreate) {
        this.newCreate = newCreate;
        return this;
    }

    /**
     * 新建态
     * @return newCreate
     */
    public Integer getNewCreate() {
        return newCreate;
    }

    public void setNewCreate(Integer newCreate) {
        this.newCreate = newCreate;
    }

    public ListTestCasesByIssueResponse withDesigning(Integer designing) {
        this.designing = designing;
        return this;
    }

    /**
     * 设计态
     * @return designing
     */
    public Integer getDesigning() {
        return designing;
    }

    public void setDesigning(Integer designing) {
        this.designing = designing;
    }

    public ListTestCasesByIssueResponse withFinished(Integer finished) {
        this.finished = finished;
        return this;
    }

    /**
     * 完成态
     * @return finished
     */
    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public ListTestCasesByIssueResponse withTesting(Integer testing) {
        this.testing = testing;
        return this;
    }

    /**
     * 测试态
     * @return testing
     */
    public Integer getTesting() {
        return testing;
    }

    public void setTesting(Integer testing) {
        this.testing = testing;
    }

    public ListTestCasesByIssueResponse withTestCaseNum(Integer testCaseNum) {
        this.testCaseNum = testCaseNum;
        return this;
    }

    /**
     * 需求关联的用例数量
     * @return testCaseNum
     */
    public Integer getTestCaseNum() {
        return testCaseNum;
    }

    public void setTestCaseNum(Integer testCaseNum) {
        this.testCaseNum = testCaseNum;
    }

    public ListTestCasesByIssueResponse withTestcases(List<TestCaseVo> testcases) {
        this.testcases = testcases;
        return this;
    }

    public ListTestCasesByIssueResponse addTestcasesItem(TestCaseVo testcasesItem) {
        if (this.testcases == null) {
            this.testcases = new ArrayList<>();
        }
        this.testcases.add(testcasesItem);
        return this;
    }

    public ListTestCasesByIssueResponse withTestcases(Consumer<List<TestCaseVo>> testcasesSetter) {
        if (this.testcases == null) {
            this.testcases = new ArrayList<>();
        }
        testcasesSetter.accept(this.testcases);
        return this;
    }

    /**
     * 用例详情
     * @return testcases
     */
    public List<TestCaseVo> getTestcases() {
        return testcases;
    }

    public void setTestcases(List<TestCaseVo> testcases) {
        this.testcases = testcases;
    }

    public ListTestCasesByIssueResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 用例总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTestCasesByIssueResponse that = (ListTestCasesByIssueResponse) obj;
        return Objects.equals(this.caseStatusMap, that.caseStatusMap) && Objects.equals(this.newCreate, that.newCreate)
            && Objects.equals(this.designing, that.designing) && Objects.equals(this.finished, that.finished)
            && Objects.equals(this.testing, that.testing) && Objects.equals(this.testCaseNum, that.testCaseNum)
            && Objects.equals(this.testcases, that.testcases) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseStatusMap, newCreate, designing, finished, testing, testCaseNum, testcases, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTestCasesByIssueResponse {\n");
        sb.append("    caseStatusMap: ").append(toIndentedString(caseStatusMap)).append("\n");
        sb.append("    newCreate: ").append(toIndentedString(newCreate)).append("\n");
        sb.append("    designing: ").append(toIndentedString(designing)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    testing: ").append(toIndentedString(testing)).append("\n");
        sb.append("    testCaseNum: ").append(toIndentedString(testCaseNum)).append("\n");
        sb.append("    testcases: ").append(toIndentedString(testcases)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
