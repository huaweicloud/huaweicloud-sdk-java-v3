package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PreTestCaseInfo
 */
public class PreTestCaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_template")

    private AlertTemplate alertTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCases")

    private List<TestCaseBasicInfo> testCases = null;

    public PreTestCaseInfo withAlertTemplate(AlertTemplate alertTemplate) {
        this.alertTemplate = alertTemplate;
        return this;
    }

    public PreTestCaseInfo withAlertTemplate(Consumer<AlertTemplate> alertTemplateSetter) {
        if (this.alertTemplate == null) {
            this.alertTemplate = new AlertTemplate();
            alertTemplateSetter.accept(this.alertTemplate);
        }

        return this;
    }

    /**
     * Get alertTemplate
     * @return alertTemplate
     */
    public AlertTemplate getAlertTemplate() {
        return alertTemplate;
    }

    public void setAlertTemplate(AlertTemplate alertTemplate) {
        this.alertTemplate = alertTemplate;
    }

    public PreTestCaseInfo withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 0 关闭，1开启
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public PreTestCaseInfo withTestCases(List<TestCaseBasicInfo> testCases) {
        this.testCases = testCases;
        return this;
    }

    public PreTestCaseInfo addTestCasesItem(TestCaseBasicInfo testCasesItem) {
        if (this.testCases == null) {
            this.testCases = new ArrayList<>();
        }
        this.testCases.add(testCasesItem);
        return this;
    }

    public PreTestCaseInfo withTestCases(Consumer<List<TestCaseBasicInfo>> testCasesSetter) {
        if (this.testCases == null) {
            this.testCases = new ArrayList<>();
        }
        testCasesSetter.accept(this.testCases);
        return this;
    }

    /**
     * 用例列表
     * @return testCases
     */
    public List<TestCaseBasicInfo> getTestCases() {
        return testCases;
    }

    public void setTestCases(List<TestCaseBasicInfo> testCases) {
        this.testCases = testCases;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreTestCaseInfo that = (PreTestCaseInfo) obj;
        return Objects.equals(this.alertTemplate, that.alertTemplate) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.testCases, that.testCases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertTemplate, enable, testCases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreTestCaseInfo {\n");
        sb.append("    alertTemplate: ").append(toIndentedString(alertTemplate)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
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
