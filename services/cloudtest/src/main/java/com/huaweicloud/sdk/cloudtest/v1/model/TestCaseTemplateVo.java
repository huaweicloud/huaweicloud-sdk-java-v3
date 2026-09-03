package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TestCaseTemplateVo
 */
public class TestCaseTemplateVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alertTemplateId")

    private String alertTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id")

    private String testcaseId;

    public TestCaseTemplateVo withAlertTemplateId(String alertTemplateId) {
        this.alertTemplateId = alertTemplateId;
        return this;
    }

    /**
     * 用例对应的告警模板id
     * @return alertTemplateId
     */
    public String getAlertTemplateId() {
        return alertTemplateId;
    }

    public void setAlertTemplateId(String alertTemplateId) {
        this.alertTemplateId = alertTemplateId;
    }

    public TestCaseTemplateVo withTestcaseId(String testcaseId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCaseTemplateVo that = (TestCaseTemplateVo) obj;
        return Objects.equals(this.alertTemplateId, that.alertTemplateId)
            && Objects.equals(this.testcaseId, that.testcaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertTemplateId, testcaseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseTemplateVo {\n");
        sb.append("    alertTemplateId: ").append(toIndentedString(alertTemplateId)).append("\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
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
