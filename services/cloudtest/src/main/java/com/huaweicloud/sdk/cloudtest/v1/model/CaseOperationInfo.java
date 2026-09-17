package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DevCloud任务关联用例类
 */
public class CaseOperationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_cases_info")

    private List<AssignCaseInfo> testCasesInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_up_cases_info")

    private List<AssignCaseInfo> setUpCasesInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tear_down_cases_info")

    private List<AssignCaseInfo> tearDownCasesInfo = null;

    public CaseOperationInfo withTestCasesInfo(List<AssignCaseInfo> testCasesInfo) {
        this.testCasesInfo = testCasesInfo;
        return this;
    }

    public CaseOperationInfo addTestCasesInfoItem(AssignCaseInfo testCasesInfoItem) {
        if (this.testCasesInfo == null) {
            this.testCasesInfo = new ArrayList<>();
        }
        this.testCasesInfo.add(testCasesInfoItem);
        return this;
    }

    public CaseOperationInfo withTestCasesInfo(Consumer<List<AssignCaseInfo>> testCasesInfoSetter) {
        if (this.testCasesInfo == null) {
            this.testCasesInfo = new ArrayList<>();
        }
        testCasesInfoSetter.accept(this.testCasesInfo);
        return this;
    }

    /**
     * 用例关联信息
     * @return testCasesInfo
     */
    public List<AssignCaseInfo> getTestCasesInfo() {
        return testCasesInfo;
    }

    public void setTestCasesInfo(List<AssignCaseInfo> testCasesInfo) {
        this.testCasesInfo = testCasesInfo;
    }

    public CaseOperationInfo withSetUpCasesInfo(List<AssignCaseInfo> setUpCasesInfo) {
        this.setUpCasesInfo = setUpCasesInfo;
        return this;
    }

    public CaseOperationInfo addSetUpCasesInfoItem(AssignCaseInfo setUpCasesInfoItem) {
        if (this.setUpCasesInfo == null) {
            this.setUpCasesInfo = new ArrayList<>();
        }
        this.setUpCasesInfo.add(setUpCasesInfoItem);
        return this;
    }

    public CaseOperationInfo withSetUpCasesInfo(Consumer<List<AssignCaseInfo>> setUpCasesInfoSetter) {
        if (this.setUpCasesInfo == null) {
            this.setUpCasesInfo = new ArrayList<>();
        }
        setUpCasesInfoSetter.accept(this.setUpCasesInfo);
        return this;
    }

    /**
     * 前置用例关联信息
     * @return setUpCasesInfo
     */
    public List<AssignCaseInfo> getSetUpCasesInfo() {
        return setUpCasesInfo;
    }

    public void setSetUpCasesInfo(List<AssignCaseInfo> setUpCasesInfo) {
        this.setUpCasesInfo = setUpCasesInfo;
    }

    public CaseOperationInfo withTearDownCasesInfo(List<AssignCaseInfo> tearDownCasesInfo) {
        this.tearDownCasesInfo = tearDownCasesInfo;
        return this;
    }

    public CaseOperationInfo addTearDownCasesInfoItem(AssignCaseInfo tearDownCasesInfoItem) {
        if (this.tearDownCasesInfo == null) {
            this.tearDownCasesInfo = new ArrayList<>();
        }
        this.tearDownCasesInfo.add(tearDownCasesInfoItem);
        return this;
    }

    public CaseOperationInfo withTearDownCasesInfo(Consumer<List<AssignCaseInfo>> tearDownCasesInfoSetter) {
        if (this.tearDownCasesInfo == null) {
            this.tearDownCasesInfo = new ArrayList<>();
        }
        tearDownCasesInfoSetter.accept(this.tearDownCasesInfo);
        return this;
    }

    /**
     * 后置用例关联信息
     * @return tearDownCasesInfo
     */
    public List<AssignCaseInfo> getTearDownCasesInfo() {
        return tearDownCasesInfo;
    }

    public void setTearDownCasesInfo(List<AssignCaseInfo> tearDownCasesInfo) {
        this.tearDownCasesInfo = tearDownCasesInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseOperationInfo that = (CaseOperationInfo) obj;
        return Objects.equals(this.testCasesInfo, that.testCasesInfo)
            && Objects.equals(this.setUpCasesInfo, that.setUpCasesInfo)
            && Objects.equals(this.tearDownCasesInfo, that.tearDownCasesInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testCasesInfo, setUpCasesInfo, tearDownCasesInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseOperationInfo {\n");
        sb.append("    testCasesInfo: ").append(toIndentedString(testCasesInfo)).append("\n");
        sb.append("    setUpCasesInfo: ").append(toIndentedString(setUpCasesInfo)).append("\n");
        sb.append("    tearDownCasesInfo: ").append(toIndentedString(tearDownCasesInfo)).append("\n");
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
