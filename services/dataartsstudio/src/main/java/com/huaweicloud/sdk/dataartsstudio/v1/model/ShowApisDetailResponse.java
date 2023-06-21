package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowApisDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_num")

    private Integer callNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Integer successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_num")

    private Integer failNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "legal_num")

    private Integer legalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "illegal_num")

    private Integer illegalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_time_avg")

    private BigDecimal costTimeAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_cost_time_avg")

    private BigDecimal successCostTimeAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_cost_time_avg")

    private BigDecimal failCostTimeAvg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_rate")

    private BigDecimal successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_rate")

    private BigDecimal failRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "legal_rate")

    private BigDecimal legalRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "illegal_rate")

    private BigDecimal illegalRate;

    public ShowApisDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 统计对象编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowApisDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 统计对象名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowApisDetailResponse withCallNum(Integer callNum) {
        this.callNum = callNum;
        return this;
    }

    /**
     * 调用总量
     * @return callNum
     */
    public Integer getCallNum() {
        return callNum;
    }

    public void setCallNum(Integer callNum) {
        this.callNum = callNum;
    }

    public ShowApisDetailResponse withSuccessNum(Integer successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * 成功调用量(取数成功)
     * @return successNum
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public ShowApisDetailResponse withFailNum(Integer failNum) {
        this.failNum = failNum;
        return this;
    }

    /**
     * 失败调用量(取数失败)
     * @return failNum
     */
    public Integer getFailNum() {
        return failNum;
    }

    public void setFailNum(Integer failNum) {
        this.failNum = failNum;
    }

    public ShowApisDetailResponse withLegalNum(Integer legalNum) {
        this.legalNum = legalNum;
        return this;
    }

    /**
     * 合法调用量(通过校验)
     * @return legalNum
     */
    public Integer getLegalNum() {
        return legalNum;
    }

    public void setLegalNum(Integer legalNum) {
        this.legalNum = legalNum;
    }

    public ShowApisDetailResponse withIllegalNum(Integer illegalNum) {
        this.illegalNum = illegalNum;
        return this;
    }

    /**
     * 非法调用量(无法通过校验)
     * @return illegalNum
     */
    public Integer getIllegalNum() {
        return illegalNum;
    }

    public void setIllegalNum(Integer illegalNum) {
        this.illegalNum = illegalNum;
    }

    public ShowApisDetailResponse withCostTimeAvg(BigDecimal costTimeAvg) {
        this.costTimeAvg = costTimeAvg;
        return this;
    }

    /**
     * 请求平均时长
     * @return costTimeAvg
     */
    public BigDecimal getCostTimeAvg() {
        return costTimeAvg;
    }

    public void setCostTimeAvg(BigDecimal costTimeAvg) {
        this.costTimeAvg = costTimeAvg;
    }

    public ShowApisDetailResponse withSuccessCostTimeAvg(BigDecimal successCostTimeAvg) {
        this.successCostTimeAvg = successCostTimeAvg;
        return this;
    }

    /**
     * 成功请求平均时长
     * @return successCostTimeAvg
     */
    public BigDecimal getSuccessCostTimeAvg() {
        return successCostTimeAvg;
    }

    public void setSuccessCostTimeAvg(BigDecimal successCostTimeAvg) {
        this.successCostTimeAvg = successCostTimeAvg;
    }

    public ShowApisDetailResponse withFailCostTimeAvg(BigDecimal failCostTimeAvg) {
        this.failCostTimeAvg = failCostTimeAvg;
        return this;
    }

    /**
     * 失败请求平均时长
     * @return failCostTimeAvg
     */
    public BigDecimal getFailCostTimeAvg() {
        return failCostTimeAvg;
    }

    public void setFailCostTimeAvg(BigDecimal failCostTimeAvg) {
        this.failCostTimeAvg = failCostTimeAvg;
    }

    public ShowApisDetailResponse withSuccessRate(BigDecimal successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 成功率
     * @return successRate
     */
    public BigDecimal getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(BigDecimal successRate) {
        this.successRate = successRate;
    }

    public ShowApisDetailResponse withFailRate(BigDecimal failRate) {
        this.failRate = failRate;
        return this;
    }

    /**
     * 失败率
     * @return failRate
     */
    public BigDecimal getFailRate() {
        return failRate;
    }

    public void setFailRate(BigDecimal failRate) {
        this.failRate = failRate;
    }

    public ShowApisDetailResponse withLegalRate(BigDecimal legalRate) {
        this.legalRate = legalRate;
        return this;
    }

    /**
     * 合法率
     * @return legalRate
     */
    public BigDecimal getLegalRate() {
        return legalRate;
    }

    public void setLegalRate(BigDecimal legalRate) {
        this.legalRate = legalRate;
    }

    public ShowApisDetailResponse withIllegalRate(BigDecimal illegalRate) {
        this.illegalRate = illegalRate;
        return this;
    }

    /**
     * 非法率
     * @return illegalRate
     */
    public BigDecimal getIllegalRate() {
        return illegalRate;
    }

    public void setIllegalRate(BigDecimal illegalRate) {
        this.illegalRate = illegalRate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowApisDetailResponse showApisDetailResponse = (ShowApisDetailResponse) o;
        return Objects.equals(this.id, showApisDetailResponse.id)
            && Objects.equals(this.name, showApisDetailResponse.name)
            && Objects.equals(this.callNum, showApisDetailResponse.callNum)
            && Objects.equals(this.successNum, showApisDetailResponse.successNum)
            && Objects.equals(this.failNum, showApisDetailResponse.failNum)
            && Objects.equals(this.legalNum, showApisDetailResponse.legalNum)
            && Objects.equals(this.illegalNum, showApisDetailResponse.illegalNum)
            && Objects.equals(this.costTimeAvg, showApisDetailResponse.costTimeAvg)
            && Objects.equals(this.successCostTimeAvg, showApisDetailResponse.successCostTimeAvg)
            && Objects.equals(this.failCostTimeAvg, showApisDetailResponse.failCostTimeAvg)
            && Objects.equals(this.successRate, showApisDetailResponse.successRate)
            && Objects.equals(this.failRate, showApisDetailResponse.failRate)
            && Objects.equals(this.legalRate, showApisDetailResponse.legalRate)
            && Objects.equals(this.illegalRate, showApisDetailResponse.illegalRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            callNum,
            successNum,
            failNum,
            legalNum,
            illegalNum,
            costTimeAvg,
            successCostTimeAvg,
            failCostTimeAvg,
            successRate,
            failRate,
            legalRate,
            illegalRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApisDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    callNum: ").append(toIndentedString(callNum)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failNum: ").append(toIndentedString(failNum)).append("\n");
        sb.append("    legalNum: ").append(toIndentedString(legalNum)).append("\n");
        sb.append("    illegalNum: ").append(toIndentedString(illegalNum)).append("\n");
        sb.append("    costTimeAvg: ").append(toIndentedString(costTimeAvg)).append("\n");
        sb.append("    successCostTimeAvg: ").append(toIndentedString(successCostTimeAvg)).append("\n");
        sb.append("    failCostTimeAvg: ").append(toIndentedString(failCostTimeAvg)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    failRate: ").append(toIndentedString(failRate)).append("\n");
        sb.append("    legalRate: ").append(toIndentedString(legalRate)).append("\n");
        sb.append("    illegalRate: ").append(toIndentedString(illegalRate)).append("\n");
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
