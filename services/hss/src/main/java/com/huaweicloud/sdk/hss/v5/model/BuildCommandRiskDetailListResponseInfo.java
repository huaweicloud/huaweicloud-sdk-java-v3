package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BuildCommandRiskDetailListResponseInfo
 */
public class BuildCommandRiskDetailListResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_num")

    private Integer riskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_list")

    private List<BuildCommandRiskDetailResponseInfo> riskList = null;

    public BuildCommandRiskDetailListResponseInfo withRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }

    /**
     * **参数解释** 镜像构建指令风险详情总数 **取值范围** 取值0-2147483547
     * minimum: 0
     * maximum: 2147483647
     * @return riskNum
     */
    public Integer getRiskNum() {
        return riskNum;
    }

    public void setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
    }

    public BuildCommandRiskDetailListResponseInfo withRiskList(List<BuildCommandRiskDetailResponseInfo> riskList) {
        this.riskList = riskList;
        return this;
    }

    public BuildCommandRiskDetailListResponseInfo addRiskListItem(BuildCommandRiskDetailResponseInfo riskListItem) {
        if (this.riskList == null) {
            this.riskList = new ArrayList<>();
        }
        this.riskList.add(riskListItem);
        return this;
    }

    public BuildCommandRiskDetailListResponseInfo withRiskList(
        Consumer<List<BuildCommandRiskDetailResponseInfo>> riskListSetter) {
        if (this.riskList == null) {
            this.riskList = new ArrayList<>();
        }
        riskListSetter.accept(this.riskList);
        return this;
    }

    /**
     * **参数解释**: 镜像构建指令风险详情列表 **取值范围**: 取值0-2147483647 
     * @return riskList
     */
    public List<BuildCommandRiskDetailResponseInfo> getRiskList() {
        return riskList;
    }

    public void setRiskList(List<BuildCommandRiskDetailResponseInfo> riskList) {
        this.riskList = riskList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildCommandRiskDetailListResponseInfo that = (BuildCommandRiskDetailListResponseInfo) obj;
        return Objects.equals(this.riskNum, that.riskNum) && Objects.equals(this.riskList, that.riskList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskNum, riskList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildCommandRiskDetailListResponseInfo {\n");
        sb.append("    riskNum: ").append(toIndentedString(riskNum)).append("\n");
        sb.append("    riskList: ").append(toIndentedString(riskList)).append("\n");
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
