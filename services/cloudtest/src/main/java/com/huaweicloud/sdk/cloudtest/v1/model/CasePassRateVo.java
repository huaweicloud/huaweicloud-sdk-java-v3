package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 计算用例通过率
 */
public class CasePassRateVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pass_rate")

    private String passRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_number_list")

    private List<NameAndValueVo> resultNumberList = null;

    public CasePassRateVo withPassRate(String passRate) {
        this.passRate = passRate;
        return this;
    }

    /**
     * 用例通过率
     * @return passRate
     */
    public String getPassRate() {
        return passRate;
    }

    public void setPassRate(String passRate) {
        this.passRate = passRate;
    }

    public CasePassRateVo withResultNumberList(List<NameAndValueVo> resultNumberList) {
        this.resultNumberList = resultNumberList;
        return this;
    }

    public CasePassRateVo addResultNumberListItem(NameAndValueVo resultNumberListItem) {
        if (this.resultNumberList == null) {
            this.resultNumberList = new ArrayList<>();
        }
        this.resultNumberList.add(resultNumberListItem);
        return this;
    }

    public CasePassRateVo withResultNumberList(Consumer<List<NameAndValueVo>> resultNumberListSetter) {
        if (this.resultNumberList == null) {
            this.resultNumberList = new ArrayList<>();
        }
        resultNumberListSetter.accept(this.resultNumberList);
        return this;
    }

    /**
     * 用户自定义结果对应的用例数目
     * @return resultNumberList
     */
    public List<NameAndValueVo> getResultNumberList() {
        return resultNumberList;
    }

    public void setResultNumberList(List<NameAndValueVo> resultNumberList) {
        this.resultNumberList = resultNumberList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CasePassRateVo that = (CasePassRateVo) obj;
        return Objects.equals(this.passRate, that.passRate)
            && Objects.equals(this.resultNumberList, that.resultNumberList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passRate, resultNumberList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CasePassRateVo {\n");
        sb.append("    passRate: ").append(toIndentedString(passRate)).append("\n");
        sb.append("    resultNumberList: ").append(toIndentedString(resultNumberList)).append("\n");
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
