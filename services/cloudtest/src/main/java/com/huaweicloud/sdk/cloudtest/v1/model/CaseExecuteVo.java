package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 需求关联用例执行率情况
 */
public class CaseExecuteVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_rate")

    private String executeRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executed_number")

    private Integer executedNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_executed_number")

    private Integer notExecutedNumber;

    public CaseExecuteVo withExecuteRate(String executeRate) {
        this.executeRate = executeRate;
        return this;
    }

    /**
     * 需求关联用例执行率
     * @return executeRate
     */
    public String getExecuteRate() {
        return executeRate;
    }

    public void setExecuteRate(String executeRate) {
        this.executeRate = executeRate;
    }

    public CaseExecuteVo withExecutedNumber(Integer executedNumber) {
        this.executedNumber = executedNumber;
        return this;
    }

    /**
     * 需求关联已执行用例总数
     * @return executedNumber
     */
    public Integer getExecutedNumber() {
        return executedNumber;
    }

    public void setExecutedNumber(Integer executedNumber) {
        this.executedNumber = executedNumber;
    }

    public CaseExecuteVo withNotExecutedNumber(Integer notExecutedNumber) {
        this.notExecutedNumber = notExecutedNumber;
        return this;
    }

    /**
     * 需求关联未执行用例总数
     * @return notExecutedNumber
     */
    public Integer getNotExecutedNumber() {
        return notExecutedNumber;
    }

    public void setNotExecutedNumber(Integer notExecutedNumber) {
        this.notExecutedNumber = notExecutedNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CaseExecuteVo that = (CaseExecuteVo) obj;
        return Objects.equals(this.executeRate, that.executeRate)
            && Objects.equals(this.executedNumber, that.executedNumber)
            && Objects.equals(this.notExecutedNumber, that.notExecutedNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executeRate, executedNumber, notExecutedNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseExecuteVo {\n");
        sb.append("    executeRate: ").append(toIndentedString(executeRate)).append("\n");
        sb.append("    executedNumber: ").append(toIndentedString(executedNumber)).append("\n");
        sb.append("    notExecutedNumber: ").append(toIndentedString(notExecutedNumber)).append("\n");
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
