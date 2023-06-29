package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAppsOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_num")

    private Integer applyNum;

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

    public ShowAppsOverviewResponse withApplyNum(Integer applyNum) {
        this.applyNum = applyNum;
        return this;
    }

    /**
     * 申请量
     * @return applyNum
     */
    public Integer getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(Integer applyNum) {
        this.applyNum = applyNum;
    }

    public ShowAppsOverviewResponse withCallNum(Integer callNum) {
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

    public ShowAppsOverviewResponse withSuccessNum(Integer successNum) {
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

    public ShowAppsOverviewResponse withFailNum(Integer failNum) {
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

    public ShowAppsOverviewResponse withLegalNum(Integer legalNum) {
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

    public ShowAppsOverviewResponse withIllegalNum(Integer illegalNum) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAppsOverviewResponse that = (ShowAppsOverviewResponse) obj;
        return Objects.equals(this.applyNum, that.applyNum) && Objects.equals(this.callNum, that.callNum)
            && Objects.equals(this.successNum, that.successNum) && Objects.equals(this.failNum, that.failNum)
            && Objects.equals(this.legalNum, that.legalNum) && Objects.equals(this.illegalNum, that.illegalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyNum, callNum, successNum, failNum, legalNum, illegalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppsOverviewResponse {\n");
        sb.append("    applyNum: ").append(toIndentedString(applyNum)).append("\n");
        sb.append("    callNum: ").append(toIndentedString(callNum)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failNum: ").append(toIndentedString(failNum)).append("\n");
        sb.append("    legalNum: ").append(toIndentedString(legalNum)).append("\n");
        sb.append("    illegalNum: ").append(toIndentedString(illegalNum)).append("\n");
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
