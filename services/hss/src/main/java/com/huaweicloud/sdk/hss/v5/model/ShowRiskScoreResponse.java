package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRiskScoreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_num")

    private Integer riskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_server_num")

    private Integer riskServerNum;

    public ShowRiskScoreResponse withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * 安全评分
     * minimum: 0
     * maximum: 10000
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public ShowRiskScoreResponse withRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }

    /**
     * 安全风险个数
     * minimum: 0
     * maximum: 10000000
     * @return riskNum
     */
    public Integer getRiskNum() {
        return riskNum;
    }

    public void setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
    }

    public ShowRiskScoreResponse withRiskServerNum(Integer riskServerNum) {
        this.riskServerNum = riskServerNum;
        return this;
    }

    /**
     * 安全风险主机个数
     * minimum: 0
     * maximum: 10000000
     * @return riskServerNum
     */
    public Integer getRiskServerNum() {
        return riskServerNum;
    }

    public void setRiskServerNum(Integer riskServerNum) {
        this.riskServerNum = riskServerNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRiskScoreResponse that = (ShowRiskScoreResponse) obj;
        return Objects.equals(this.score, that.score) && Objects.equals(this.riskNum, that.riskNum)
            && Objects.equals(this.riskServerNum, that.riskServerNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, riskNum, riskServerNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRiskScoreResponse {\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    riskNum: ").append(toIndentedString(riskNum)).append("\n");
        sb.append("    riskServerNum: ").append(toIndentedString(riskServerNum)).append("\n");
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
