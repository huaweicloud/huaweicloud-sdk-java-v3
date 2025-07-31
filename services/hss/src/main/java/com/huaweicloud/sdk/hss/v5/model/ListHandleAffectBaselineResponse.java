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
public class ListHandleAffectBaselineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_rule_num")

    private Integer totalRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_num")

    private Integer ruleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<HandleAffectBaselineInfo> dataList = null;

    public ListHandleAffectBaselineResponse withTotalRuleNum(Integer totalRuleNum) {
        this.totalRuleNum = totalRuleNum;
        return this;
    }

    /**
     * **参数解释** 该操作影响的范围的总数 **取值范围**   取值0-5000
     * minimum: 0
     * maximum: 5000
     * @return totalRuleNum
     */
    public Integer getTotalRuleNum() {
        return totalRuleNum;
    }

    public void setTotalRuleNum(Integer totalRuleNum) {
        this.totalRuleNum = totalRuleNum;
    }

    public ListHandleAffectBaselineResponse withRuleNum(Integer ruleNum) {
        this.ruleNum = ruleNum;
        return this;
    }

    /**
     * **参数解释** 该操作影响的检查项数 **取值范围**   取值0-5000
     * minimum: 0
     * maximum: 5000
     * @return ruleNum
     */
    public Integer getRuleNum() {
        return ruleNum;
    }

    public void setRuleNum(Integer ruleNum) {
        this.ruleNum = ruleNum;
    }

    public ListHandleAffectBaselineResponse withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释** 该操作影响的主机数 **取值范围**   取值0-5000
     * minimum: 0
     * maximum: 5000
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public ListHandleAffectBaselineResponse withDataList(List<HandleAffectBaselineInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListHandleAffectBaselineResponse addDataListItem(HandleAffectBaselineInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListHandleAffectBaselineResponse withDataList(Consumer<List<HandleAffectBaselineInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释** 该操作影响范围的详细信息的列表
     * @return dataList
     */
    public List<HandleAffectBaselineInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<HandleAffectBaselineInfo> dataList) {
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
        ListHandleAffectBaselineResponse that = (ListHandleAffectBaselineResponse) obj;
        return Objects.equals(this.totalRuleNum, that.totalRuleNum) && Objects.equals(this.ruleNum, that.ruleNum)
            && Objects.equals(this.hostNum, that.hostNum) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRuleNum, ruleNum, hostNum, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHandleAffectBaselineResponse {\n");
        sb.append("    totalRuleNum: ").append(toIndentedString(totalRuleNum)).append("\n");
        sb.append("    ruleNum: ").append(toIndentedString(ruleNum)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
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
