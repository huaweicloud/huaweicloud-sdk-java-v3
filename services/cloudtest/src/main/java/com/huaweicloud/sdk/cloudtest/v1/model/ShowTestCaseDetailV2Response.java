package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTestCaseDetailV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id")

    private String testcaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private Integer serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_number")

    private String testcaseNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_id")

    private Integer rankId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private String statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_user")

    private AssignedUserInfo assignedUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_count")

    private Integer executeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_id")

    private String resultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_info")

    private ExtendInfo extendInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ShowTestCaseDetailV2Response withTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
        return this;
    }

    /**
     * 测试用例唯一标识
     * @return testcaseId
     */
    public String getTestcaseId() {
        return testcaseId;
    }

    public void setTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
    }

    public ShowTestCaseDetailV2Response withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 软开云项目唯一标识
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowTestCaseDetailV2Response withServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 注册测试类型服务接口返回的服务id
     * @return serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public ShowTestCaseDetailV2Response withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 测试用例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowTestCaseDetailV2Response withTestcaseNumber(String testcaseNumber) {
        this.testcaseNumber = testcaseNumber;
        return this;
    }

    /**
     * 测试用例编号
     * @return testcaseNumber
     */
    public String getTestcaseNumber() {
        return testcaseNumber;
    }

    public void setTestcaseNumber(String testcaseNumber) {
        this.testcaseNumber = testcaseNumber;
    }

    public ShowTestCaseDetailV2Response withRankId(Integer rankId) {
        this.rankId = rankId;
        return this;
    }

    /**
     * 测试用例等级
     * @return rankId
     */
    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public ShowTestCaseDetailV2Response withStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * 测试用例状态
     * @return statusId
     */
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public ShowTestCaseDetailV2Response withAssignedUser(AssignedUserInfo assignedUser) {
        this.assignedUser = assignedUser;
        return this;
    }

    public ShowTestCaseDetailV2Response withAssignedUser(Consumer<AssignedUserInfo> assignedUserSetter) {
        if (this.assignedUser == null) {
            this.assignedUser = new AssignedUserInfo();
            assignedUserSetter.accept(this.assignedUser);
        }

        return this;
    }

    /**
     * Get assignedUser
     * @return assignedUser
     */
    public AssignedUserInfo getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(AssignedUserInfo assignedUser) {
        this.assignedUser = assignedUser;
    }

    public ShowTestCaseDetailV2Response withExecuteCount(Integer executeCount) {
        this.executeCount = executeCount;
        return this;
    }

    /**
     * 测试用例执行次数
     * @return executeCount
     */
    public Integer getExecuteCount() {
        return executeCount;
    }

    public void setExecuteCount(Integer executeCount) {
        this.executeCount = executeCount;
    }

    public ShowTestCaseDetailV2Response withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * 测试用例执行结果
     * @return resultId
     */
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public ShowTestCaseDetailV2Response withExtendInfo(ExtendInfo extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    public ShowTestCaseDetailV2Response withExtendInfo(Consumer<ExtendInfo> extendInfoSetter) {
        if (this.extendInfo == null) {
            this.extendInfo = new ExtendInfo();
            extendInfoSetter.accept(this.extendInfo);
        }

        return this;
    }

    /**
     * Get extendInfo
     * @return extendInfo
     */
    public ExtendInfo getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(ExtendInfo extendInfo) {
        this.extendInfo = extendInfo;
    }

    public ShowTestCaseDetailV2Response withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 接口调用失败错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowTestCaseDetailV2Response withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 接口调用失败错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTestCaseDetailV2Response that = (ShowTestCaseDetailV2Response) obj;
        return Objects.equals(this.testcaseId, that.testcaseId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.testcaseNumber, that.testcaseNumber) && Objects.equals(this.rankId, that.rankId)
            && Objects.equals(this.statusId, that.statusId) && Objects.equals(this.assignedUser, that.assignedUser)
            && Objects.equals(this.executeCount, that.executeCount) && Objects.equals(this.resultId, that.resultId)
            && Objects.equals(this.extendInfo, that.extendInfo) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testcaseId,
            projectId,
            serviceId,
            name,
            testcaseNumber,
            rankId,
            statusId,
            assignedUser,
            executeCount,
            resultId,
            extendInfo,
            errorCode,
            errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTestCaseDetailV2Response {\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    testcaseNumber: ").append(toIndentedString(testcaseNumber)).append("\n");
        sb.append("    rankId: ").append(toIndentedString(rankId)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    assignedUser: ").append(toIndentedString(assignedUser)).append("\n");
        sb.append("    executeCount: ").append(toIndentedString(executeCount)).append("\n");
        sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
        sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
