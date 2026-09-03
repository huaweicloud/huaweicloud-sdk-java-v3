package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloudTestCaseOperationInfo
 */
public class CloudTestCaseOperationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setUpCasesInfo")

    private List<CloudTestCaseInfo> setUpCasesInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tearDownCasesInfo")

    private List<CloudTestCaseInfo> tearDownCasesInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCasesInfo")

    private List<CloudTestCaseInfo> testCasesInfo = null;

    public CloudTestCaseOperationInfo withSetUpCasesInfo(List<CloudTestCaseInfo> setUpCasesInfo) {
        this.setUpCasesInfo = setUpCasesInfo;
        return this;
    }

    public CloudTestCaseOperationInfo addSetUpCasesInfoItem(CloudTestCaseInfo setUpCasesInfoItem) {
        if (this.setUpCasesInfo == null) {
            this.setUpCasesInfo = new ArrayList<>();
        }
        this.setUpCasesInfo.add(setUpCasesInfoItem);
        return this;
    }

    public CloudTestCaseOperationInfo withSetUpCasesInfo(Consumer<List<CloudTestCaseInfo>> setUpCasesInfoSetter) {
        if (this.setUpCasesInfo == null) {
            this.setUpCasesInfo = new ArrayList<>();
        }
        setUpCasesInfoSetter.accept(this.setUpCasesInfo);
        return this;
    }

    /**
     * 前置用例信息
     * @return setUpCasesInfo
     */
    public List<CloudTestCaseInfo> getSetUpCasesInfo() {
        return setUpCasesInfo;
    }

    public void setSetUpCasesInfo(List<CloudTestCaseInfo> setUpCasesInfo) {
        this.setUpCasesInfo = setUpCasesInfo;
    }

    public CloudTestCaseOperationInfo withTearDownCasesInfo(List<CloudTestCaseInfo> tearDownCasesInfo) {
        this.tearDownCasesInfo = tearDownCasesInfo;
        return this;
    }

    public CloudTestCaseOperationInfo addTearDownCasesInfoItem(CloudTestCaseInfo tearDownCasesInfoItem) {
        if (this.tearDownCasesInfo == null) {
            this.tearDownCasesInfo = new ArrayList<>();
        }
        this.tearDownCasesInfo.add(tearDownCasesInfoItem);
        return this;
    }

    public CloudTestCaseOperationInfo withTearDownCasesInfo(Consumer<List<CloudTestCaseInfo>> tearDownCasesInfoSetter) {
        if (this.tearDownCasesInfo == null) {
            this.tearDownCasesInfo = new ArrayList<>();
        }
        tearDownCasesInfoSetter.accept(this.tearDownCasesInfo);
        return this;
    }

    /**
     * 后置用例信息
     * @return tearDownCasesInfo
     */
    public List<CloudTestCaseInfo> getTearDownCasesInfo() {
        return tearDownCasesInfo;
    }

    public void setTearDownCasesInfo(List<CloudTestCaseInfo> tearDownCasesInfo) {
        this.tearDownCasesInfo = tearDownCasesInfo;
    }

    public CloudTestCaseOperationInfo withTestCasesInfo(List<CloudTestCaseInfo> testCasesInfo) {
        this.testCasesInfo = testCasesInfo;
        return this;
    }

    public CloudTestCaseOperationInfo addTestCasesInfoItem(CloudTestCaseInfo testCasesInfoItem) {
        if (this.testCasesInfo == null) {
            this.testCasesInfo = new ArrayList<>();
        }
        this.testCasesInfo.add(testCasesInfoItem);
        return this;
    }

    public CloudTestCaseOperationInfo withTestCasesInfo(Consumer<List<CloudTestCaseInfo>> testCasesInfoSetter) {
        if (this.testCasesInfo == null) {
            this.testCasesInfo = new ArrayList<>();
        }
        testCasesInfoSetter.accept(this.testCasesInfo);
        return this;
    }

    /**
     * 用例信息
     * @return testCasesInfo
     */
    public List<CloudTestCaseInfo> getTestCasesInfo() {
        return testCasesInfo;
    }

    public void setTestCasesInfo(List<CloudTestCaseInfo> testCasesInfo) {
        this.testCasesInfo = testCasesInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudTestCaseOperationInfo that = (CloudTestCaseOperationInfo) obj;
        return Objects.equals(this.setUpCasesInfo, that.setUpCasesInfo)
            && Objects.equals(this.tearDownCasesInfo, that.tearDownCasesInfo)
            && Objects.equals(this.testCasesInfo, that.testCasesInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setUpCasesInfo, tearDownCasesInfo, testCasesInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudTestCaseOperationInfo {\n");
        sb.append("    setUpCasesInfo: ").append(toIndentedString(setUpCasesInfo)).append("\n");
        sb.append("    tearDownCasesInfo: ").append(toIndentedString(tearDownCasesInfo)).append("\n");
        sb.append("    testCasesInfo: ").append(toIndentedString(testCasesInfo)).append("\n");
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
