package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloudTestCaseInfo
 */
public class CloudTestCaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id")

    private String caseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseType")

    private Integer caseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_forbidden")

    private Integer isForbidden;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private CommonDto owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private CommonDto result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scriptUrl")

    private String scriptUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private CommonDto status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseName")

    private String testCaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseNumber")

    private String testCaseNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmssVersionUri")

    private String tmssVersionUri;

    public CloudTestCaseInfo withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * 用例id
     * @return caseId
     */
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public CloudTestCaseInfo withCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }

    /**
     * tmss用例类型
     * @return caseType
     */
    public Integer getCaseType() {
        return caseType;
    }

    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }

    public CloudTestCaseInfo withIsForbidden(Integer isForbidden) {
        this.isForbidden = isForbidden;
        return this;
    }

    /**
     * 是否未禁用，1为未禁用，0为已禁用
     * @return isForbidden
     */
    public Integer getIsForbidden() {
        return isForbidden;
    }

    public void setIsForbidden(Integer isForbidden) {
        this.isForbidden = isForbidden;
    }

    public CloudTestCaseInfo withOwner(CommonDto owner) {
        this.owner = owner;
        return this;
    }

    public CloudTestCaseInfo withOwner(Consumer<CommonDto> ownerSetter) {
        if (this.owner == null) {
            this.owner = new CommonDto();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public CommonDto getOwner() {
        return owner;
    }

    public void setOwner(CommonDto owner) {
        this.owner = owner;
    }

    public CloudTestCaseInfo withResult(CommonDto result) {
        this.result = result;
        return this;
    }

    public CloudTestCaseInfo withResult(Consumer<CommonDto> resultSetter) {
        if (this.result == null) {
            this.result = new CommonDto();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public CommonDto getResult() {
        return result;
    }

    public void setResult(CommonDto result) {
        this.result = result;
    }

    public CloudTestCaseInfo withScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
        return this;
    }

    /**
     * 用例脚本路径
     * @return scriptUrl
     */
    public String getScriptUrl() {
        return scriptUrl;
    }

    public void setScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
    }

    public CloudTestCaseInfo withStatus(CommonDto status) {
        this.status = status;
        return this;
    }

    public CloudTestCaseInfo withStatus(Consumer<CommonDto> statusSetter) {
        if (this.status == null) {
            this.status = new CommonDto();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public CommonDto getStatus() {
        return status;
    }

    public void setStatus(CommonDto status) {
        this.status = status;
    }

    public CloudTestCaseInfo withTestCaseName(String testCaseName) {
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

    public CloudTestCaseInfo withTestCaseNumber(String testCaseNumber) {
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

    public CloudTestCaseInfo withTmssVersionUri(String tmssVersionUri) {
        this.tmssVersionUri = tmssVersionUri;
        return this;
    }

    /**
     * tmss版本地址
     * @return tmssVersionUri
     */
    public String getTmssVersionUri() {
        return tmssVersionUri;
    }

    public void setTmssVersionUri(String tmssVersionUri) {
        this.tmssVersionUri = tmssVersionUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudTestCaseInfo that = (CloudTestCaseInfo) obj;
        return Objects.equals(this.caseId, that.caseId) && Objects.equals(this.caseType, that.caseType)
            && Objects.equals(this.isForbidden, that.isForbidden) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.result, that.result) && Objects.equals(this.scriptUrl, that.scriptUrl)
            && Objects.equals(this.status, that.status) && Objects.equals(this.testCaseName, that.testCaseName)
            && Objects.equals(this.testCaseNumber, that.testCaseNumber)
            && Objects.equals(this.tmssVersionUri, that.tmssVersionUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseId,
            caseType,
            isForbidden,
            owner,
            result,
            scriptUrl,
            status,
            testCaseName,
            testCaseNumber,
            tmssVersionUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudTestCaseInfo {\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
        sb.append("    isForbidden: ").append(toIndentedString(isForbidden)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    scriptUrl: ").append(toIndentedString(scriptUrl)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    testCaseName: ").append(toIndentedString(testCaseName)).append("\n");
        sb.append("    testCaseNumber: ").append(toIndentedString(testCaseNumber)).append("\n");
        sb.append("    tmssVersionUri: ").append(toIndentedString(tmssVersionUri)).append("\n");
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
