package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 每个测试类型的用例通过率
 */
public class DetailTestTypeCasePassRateVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_type")

    private Integer testType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_pass_rate")

    private String casePassRate;

    public DetailTestTypeCasePassRateVo withTestType(Integer testType) {
        this.testType = testType;
        return this;
    }

    /**
     * 测试类型
     * @return testType
     */
    public Integer getTestType() {
        return testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public DetailTestTypeCasePassRateVo withCasePassRate(String casePassRate) {
        this.casePassRate = casePassRate;
        return this;
    }

    /**
     * 用例通过率
     * @return casePassRate
     */
    public String getCasePassRate() {
        return casePassRate;
    }

    public void setCasePassRate(String casePassRate) {
        this.casePassRate = casePassRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetailTestTypeCasePassRateVo that = (DetailTestTypeCasePassRateVo) obj;
        return Objects.equals(this.testType, that.testType) && Objects.equals(this.casePassRate, that.casePassRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testType, casePassRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetailTestTypeCasePassRateVo {\n");
        sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
        sb.append("    casePassRate: ").append(toIndentedString(casePassRate)).append("\n");
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
