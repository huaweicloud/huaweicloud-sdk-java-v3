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
public class TestcasePlanVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_uri")

    private String testcaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_number")

    private String testcaseNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plans")

    private List<TestPlanVo> plans = null;

    public TestcasePlanVo withTestcaseUri(String testcaseUri) {
        this.testcaseUri = testcaseUri;
        return this;
    }

    /**
     * 测试用例URI
     * @return testcaseUri
     */
    public String getTestcaseUri() {
        return testcaseUri;
    }

    public void setTestcaseUri(String testcaseUri) {
        this.testcaseUri = testcaseUri;
    }

    public TestcasePlanVo withTestcaseNumber(String testcaseNumber) {
        this.testcaseNumber = testcaseNumber;
        return this;
    }

    /**
     * 测试用例用例编号
     * @return testcaseNumber
     */
    public String getTestcaseNumber() {
        return testcaseNumber;
    }

    public void setTestcaseNumber(String testcaseNumber) {
        this.testcaseNumber = testcaseNumber;
    }

    public TestcasePlanVo withPlans(List<TestPlanVo> plans) {
        this.plans = plans;
        return this;
    }

    public TestcasePlanVo addPlansItem(TestPlanVo plansItem) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }
        this.plans.add(plansItem);
        return this;
    }

    public TestcasePlanVo withPlans(Consumer<List<TestPlanVo>> plansSetter) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }
        plansSetter.accept(this.plans);
        return this;
    }

    /**
     * 测试计划信息
     * @return plans
     */
    public List<TestPlanVo> getPlans() {
        return plans;
    }

    public void setPlans(List<TestPlanVo> plans) {
        this.plans = plans;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestcasePlanVo that = (TestcasePlanVo) obj;
        return Objects.equals(this.testcaseUri, that.testcaseUri)
            && Objects.equals(this.testcaseNumber, that.testcaseNumber) && Objects.equals(this.plans, that.plans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testcaseUri, testcaseNumber, plans);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestcasePlanVo {\n");
        sb.append("    testcaseUri: ").append(toIndentedString(testcaseUri)).append("\n");
        sb.append("    testcaseNumber: ").append(toIndentedString(testcaseNumber)).append("\n");
        sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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
