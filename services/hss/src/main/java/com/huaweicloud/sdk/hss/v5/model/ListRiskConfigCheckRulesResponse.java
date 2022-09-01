package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRiskConfigCheckRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    @JacksonXmlProperty(localName = "total_num")

    private Long totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    @JacksonXmlProperty(localName = "data_list")

    private List<CheckRuleRiskInfoResponseInfo> dataList = null;

    public ListRiskConfigCheckRulesResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 风险总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalNum
     */
    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public ListRiskConfigCheckRulesResponse withDataList(List<CheckRuleRiskInfoResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListRiskConfigCheckRulesResponse addDataListItem(CheckRuleRiskInfoResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListRiskConfigCheckRulesResponse withDataList(Consumer<List<CheckRuleRiskInfoResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 数据列表
     * @return dataList
     */
    public List<CheckRuleRiskInfoResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<CheckRuleRiskInfoResponseInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRiskConfigCheckRulesResponse listRiskConfigCheckRulesResponse = (ListRiskConfigCheckRulesResponse) o;
        return Objects.equals(this.totalNum, listRiskConfigCheckRulesResponse.totalNum)
            && Objects.equals(this.dataList, listRiskConfigCheckRulesResponse.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRiskConfigCheckRulesResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
