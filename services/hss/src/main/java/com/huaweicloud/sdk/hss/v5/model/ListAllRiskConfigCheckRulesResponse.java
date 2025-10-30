package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAllRiskConfigCheckRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pass_num")

    private Integer passNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processed_num")

    private Integer processedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<CheckRulesResponseInfo> dataList = null;

    public ListAllRiskConfigCheckRulesResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释** 风险总数 **取值范围** 取值0-200000
     * minimum: 0
     * maximum: 200000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListAllRiskConfigCheckRulesResponse withPassNum(Integer passNum) {
        this.passNum = passNum;
        return this;
    }

    /**
     * **参数解释** 已通过检查项数量 **取值范围** 取值0-200000
     * minimum: 0
     * maximum: 200000
     * @return passNum
     */
    public Integer getPassNum() {
        return passNum;
    }

    public void setPassNum(Integer passNum) {
        this.passNum = passNum;
    }

    public ListAllRiskConfigCheckRulesResponse withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * **参数解释** 未通过检查项数量 **取值范围** 取值0-200000
     * minimum: 0
     * maximum: 200000
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public ListAllRiskConfigCheckRulesResponse withProcessedNum(Integer processedNum) {
        this.processedNum = processedNum;
        return this;
    }

    /**
     * **参数解释** 已处理检查项数量 **取值范围** 取值0-200000
     * minimum: 0
     * maximum: 200000
     * @return processedNum
     */
    public Integer getProcessedNum() {
        return processedNum;
    }

    public void setProcessedNum(Integer processedNum) {
        this.processedNum = processedNum;
    }

    public ListAllRiskConfigCheckRulesResponse withDataList(List<CheckRulesResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListAllRiskConfigCheckRulesResponse addDataListItem(CheckRulesResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListAllRiskConfigCheckRulesResponse withDataList(Consumer<List<CheckRulesResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释** 数据列表
     * @return dataList
     */
    public List<CheckRulesResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<CheckRulesResponseInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllRiskConfigCheckRulesResponse that = (ListAllRiskConfigCheckRulesResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.passNum, that.passNum)
            && Objects.equals(this.failedNum, that.failedNum) && Objects.equals(this.processedNum, that.processedNum)
            && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, passNum, failedNum, processedNum, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllRiskConfigCheckRulesResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    passNum: ").append(toIndentedString(passNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    processedNum: ").append(toIndentedString(processedNum)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
