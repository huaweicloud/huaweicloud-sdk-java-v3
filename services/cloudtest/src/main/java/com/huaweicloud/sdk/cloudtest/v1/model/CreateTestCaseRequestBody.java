package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建测试用例请求体
 */
public class CreateTestCaseRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private Integer serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_id")

    private String rankId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_number")

    private String testcaseNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_info")

    private ExternalServiceCaseInfo extendInfo;

    public CreateTestCaseRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 页面上显示的用例名称，长度为[3-128]位字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateTestCaseRequestBody withServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 该值由注册接口返回,取值范围为10-9999
     * @return serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public CreateTestCaseRequestBody withRankId(String rankId) {
        this.rankId = rankId;
        return this;
    }

    /**
     * 测试用例等级，可选值为[0,1,2,3,4]，不填时默认为2
     * @return rankId
     */
    public String getRankId() {
        return rankId;
    }

    public void setRankId(String rankId) {
        this.rankId = rankId;
    }

    public CreateTestCaseRequestBody withTestcaseNumber(String testcaseNumber) {
        this.testcaseNumber = testcaseNumber;
        return this;
    }

    /**
     * 用例编号，不填该值时会自动生成，长度为[3-128]位字符
     * @return testcaseNumber
     */
    public String getTestcaseNumber() {
        return testcaseNumber;
    }

    public void setTestcaseNumber(String testcaseNumber) {
        this.testcaseNumber = testcaseNumber;
    }

    public CreateTestCaseRequestBody withExtendInfo(ExternalServiceCaseInfo extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    public CreateTestCaseRequestBody withExtendInfo(Consumer<ExternalServiceCaseInfo> extendInfoSetter) {
        if (this.extendInfo == null) {
            this.extendInfo = new ExternalServiceCaseInfo();
            extendInfoSetter.accept(this.extendInfo);
        }

        return this;
    }

    /**
     * Get extendInfo
     * @return extendInfo
     */
    public ExternalServiceCaseInfo getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(ExternalServiceCaseInfo extendInfo) {
        this.extendInfo = extendInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTestCaseRequestBody createTestCaseRequestBody = (CreateTestCaseRequestBody) o;
        return Objects.equals(this.name, createTestCaseRequestBody.name)
            && Objects.equals(this.serviceId, createTestCaseRequestBody.serviceId)
            && Objects.equals(this.rankId, createTestCaseRequestBody.rankId)
            && Objects.equals(this.testcaseNumber, createTestCaseRequestBody.testcaseNumber)
            && Objects.equals(this.extendInfo, createTestCaseRequestBody.extendInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serviceId, rankId, testcaseNumber, extendInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTestCaseRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    rankId: ").append(toIndentedString(rankId)).append("\n");
        sb.append("    testcaseNumber: ").append(toIndentedString(testcaseNumber)).append("\n");
        sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
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
