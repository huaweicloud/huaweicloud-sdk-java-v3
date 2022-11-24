package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新测试用例信息请求体
 */
public class UpdateTestCaseRequestBody {

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

    private ExternalServiceBizCase extendInfo;

    public UpdateTestCaseRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云测页面上显示的用例名称，长度为[3-128]位字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateTestCaseRequestBody withServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 注册测试类型服务接口返回的服务id，取值范围为10-9999
     * @return serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public UpdateTestCaseRequestBody withRankId(String rankId) {
        this.rankId = rankId;
        return this;
    }

    /**
     * 测试用例等级，可选值为[0,1,2,3,4]，不填时云测默认为2
     * @return rankId
     */
    public String getRankId() {
        return rankId;
    }

    public void setRankId(String rankId) {
        this.rankId = rankId;
    }

    public UpdateTestCaseRequestBody withTestcaseNumber(String testcaseNumber) {
        this.testcaseNumber = testcaseNumber;
        return this;
    }

    /**
     * 用例编号，不填该值时云测会自动生成，长度为[3-128]位字符
     * @return testcaseNumber
     */
    public String getTestcaseNumber() {
        return testcaseNumber;
    }

    public void setTestcaseNumber(String testcaseNumber) {
        this.testcaseNumber = testcaseNumber;
    }

    public UpdateTestCaseRequestBody withExtendInfo(ExternalServiceBizCase extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    public UpdateTestCaseRequestBody withExtendInfo(Consumer<ExternalServiceBizCase> extendInfoSetter) {
        if (this.extendInfo == null) {
            this.extendInfo = new ExternalServiceBizCase();
            extendInfoSetter.accept(this.extendInfo);
        }

        return this;
    }

    /**
     * Get extendInfo
     * @return extendInfo
     */
    public ExternalServiceBizCase getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(ExternalServiceBizCase extendInfo) {
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
        UpdateTestCaseRequestBody updateTestCaseRequestBody = (UpdateTestCaseRequestBody) o;
        return Objects.equals(this.name, updateTestCaseRequestBody.name)
            && Objects.equals(this.serviceId, updateTestCaseRequestBody.serviceId)
            && Objects.equals(this.rankId, updateTestCaseRequestBody.rankId)
            && Objects.equals(this.testcaseNumber, updateTestCaseRequestBody.testcaseNumber)
            && Objects.equals(this.extendInfo, updateTestCaseRequestBody.extendInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serviceId, rankId, testcaseNumber, extendInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTestCaseRequestBody {\n");
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
