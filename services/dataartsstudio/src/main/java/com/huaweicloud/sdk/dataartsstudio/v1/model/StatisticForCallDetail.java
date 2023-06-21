package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StatisticForCallDetail
 */
public class StatisticForCallDetail {

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

    public StatisticForCallDetail withId(String id) {
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

    public StatisticForCallDetail withName(String name) {
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

    public StatisticForCallDetail withCallNum(Integer callNum) {
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

    public StatisticForCallDetail withSuccessNum(Integer successNum) {
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

    public StatisticForCallDetail withFailNum(Integer failNum) {
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

    public StatisticForCallDetail withLegalNum(Integer legalNum) {
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

    public StatisticForCallDetail withIllegalNum(Integer illegalNum) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatisticForCallDetail statisticForCallDetail = (StatisticForCallDetail) o;
        return Objects.equals(this.id, statisticForCallDetail.id)
            && Objects.equals(this.name, statisticForCallDetail.name)
            && Objects.equals(this.callNum, statisticForCallDetail.callNum)
            && Objects.equals(this.successNum, statisticForCallDetail.successNum)
            && Objects.equals(this.failNum, statisticForCallDetail.failNum)
            && Objects.equals(this.legalNum, statisticForCallDetail.legalNum)
            && Objects.equals(this.illegalNum, statisticForCallDetail.illegalNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, callNum, successNum, failNum, legalNum, illegalNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticForCallDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
