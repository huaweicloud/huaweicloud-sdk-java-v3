package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务关联用例信息
 */
public class CaseOperationVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_cases_info")

    private List<TaskAssignCaseVo> testCasesInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_up_cases_info")

    private List<TaskAssignCaseVo> setUpCasesInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tear_down_cases_info")

    private List<TaskAssignCaseVo> tearDownCasesInfo = null;

    public CaseOperationVo withTestCasesInfo(List<TaskAssignCaseVo> testCasesInfo) {
        this.testCasesInfo = testCasesInfo;
        return this;
    }

    public CaseOperationVo addTestCasesInfoItem(TaskAssignCaseVo testCasesInfoItem) {
        if (this.testCasesInfo == null) {
            this.testCasesInfo = new ArrayList<>();
        }
        this.testCasesInfo.add(testCasesInfoItem);
        return this;
    }

    public CaseOperationVo withTestCasesInfo(Consumer<List<TaskAssignCaseVo>> testCasesInfoSetter) {
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
    public List<TaskAssignCaseVo> getTestCasesInfo() {
        return testCasesInfo;
    }

    public void setTestCasesInfo(List<TaskAssignCaseVo> testCasesInfo) {
        this.testCasesInfo = testCasesInfo;
    }

    public CaseOperationVo withSetUpCasesInfo(List<TaskAssignCaseVo> setUpCasesInfo) {
        this.setUpCasesInfo = setUpCasesInfo;
        return this;
    }

    public CaseOperationVo addSetUpCasesInfoItem(TaskAssignCaseVo setUpCasesInfoItem) {
        if (this.setUpCasesInfo == null) {
            this.setUpCasesInfo = new ArrayList<>();
        }
        this.setUpCasesInfo.add(setUpCasesInfoItem);
        return this;
    }

    public CaseOperationVo withSetUpCasesInfo(Consumer<List<TaskAssignCaseVo>> setUpCasesInfoSetter) {
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
    public List<TaskAssignCaseVo> getSetUpCasesInfo() {
        return setUpCasesInfo;
    }

    public void setSetUpCasesInfo(List<TaskAssignCaseVo> setUpCasesInfo) {
        this.setUpCasesInfo = setUpCasesInfo;
    }

    public CaseOperationVo withTearDownCasesInfo(List<TaskAssignCaseVo> tearDownCasesInfo) {
        this.tearDownCasesInfo = tearDownCasesInfo;
        return this;
    }

    public CaseOperationVo addTearDownCasesInfoItem(TaskAssignCaseVo tearDownCasesInfoItem) {
        if (this.tearDownCasesInfo == null) {
            this.tearDownCasesInfo = new ArrayList<>();
        }
        this.tearDownCasesInfo.add(tearDownCasesInfoItem);
        return this;
    }

    public CaseOperationVo withTearDownCasesInfo(Consumer<List<TaskAssignCaseVo>> tearDownCasesInfoSetter) {
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
    public List<TaskAssignCaseVo> getTearDownCasesInfo() {
        return tearDownCasesInfo;
    }

    public void setTearDownCasesInfo(List<TaskAssignCaseVo> tearDownCasesInfo) {
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
        CaseOperationVo that = (CaseOperationVo) obj;
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
        sb.append("class CaseOperationVo {\n");
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
