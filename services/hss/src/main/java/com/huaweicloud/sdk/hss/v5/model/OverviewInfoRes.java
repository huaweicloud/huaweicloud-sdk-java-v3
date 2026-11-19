package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 安全总览信息
 */
public class OverviewInfoRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_info_list")

    private List<Object> dashboardInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_trend_info_list")

    private List<Object> riskyTrendInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_distribution_info_list")

    private List<Object> riskyDistributionInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_risky_host_info_list")

    private List<Object> topRiskyHostInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_account_crack_info_list")

    private List<Object> topAccountCrackInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_info_list")

    private List<Object> hostInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overall_situation_info_list")

    private List<Object> overallSituationInfoList = null;

    public OverviewInfoRes withDashboardInfoList(List<Object> dashboardInfoList) {
        this.dashboardInfoList = dashboardInfoList;
        return this;
    }

    public OverviewInfoRes addDashboardInfoListItem(Object dashboardInfoListItem) {
        if (this.dashboardInfoList == null) {
            this.dashboardInfoList = new ArrayList<>();
        }
        this.dashboardInfoList.add(dashboardInfoListItem);
        return this;
    }

    public OverviewInfoRes withDashboardInfoList(Consumer<List<Object>> dashboardInfoListSetter) {
        if (this.dashboardInfoList == null) {
            this.dashboardInfoList = new ArrayList<>();
        }
        dashboardInfoListSetter.accept(this.dashboardInfoList);
        return this;
    }

    /**
     * **参数解释**： 安全总览内容列表 **取值范围**： 0-100个DashboardInfo对象 
     * @return dashboardInfoList
     */
    public List<Object> getDashboardInfoList() {
        return dashboardInfoList;
    }

    public void setDashboardInfoList(List<Object> dashboardInfoList) {
        this.dashboardInfoList = dashboardInfoList;
    }

    public OverviewInfoRes withRiskyTrendInfoList(List<Object> riskyTrendInfoList) {
        this.riskyTrendInfoList = riskyTrendInfoList;
        return this;
    }

    public OverviewInfoRes addRiskyTrendInfoListItem(Object riskyTrendInfoListItem) {
        if (this.riskyTrendInfoList == null) {
            this.riskyTrendInfoList = new ArrayList<>();
        }
        this.riskyTrendInfoList.add(riskyTrendInfoListItem);
        return this;
    }

    public OverviewInfoRes withRiskyTrendInfoList(Consumer<List<Object>> riskyTrendInfoListSetter) {
        if (this.riskyTrendInfoList == null) {
            this.riskyTrendInfoList = new ArrayList<>();
        }
        riskyTrendInfoListSetter.accept(this.riskyTrendInfoList);
        return this;
    }

    /**
     * **参数解释**： 风险趋势内容列表 **取值范围**： 0-100个RiskyTrendInfo对象 
     * @return riskyTrendInfoList
     */
    public List<Object> getRiskyTrendInfoList() {
        return riskyTrendInfoList;
    }

    public void setRiskyTrendInfoList(List<Object> riskyTrendInfoList) {
        this.riskyTrendInfoList = riskyTrendInfoList;
    }

    public OverviewInfoRes withRiskyDistributionInfoList(List<Object> riskyDistributionInfoList) {
        this.riskyDistributionInfoList = riskyDistributionInfoList;
        return this;
    }

    public OverviewInfoRes addRiskyDistributionInfoListItem(Object riskyDistributionInfoListItem) {
        if (this.riskyDistributionInfoList == null) {
            this.riskyDistributionInfoList = new ArrayList<>();
        }
        this.riskyDistributionInfoList.add(riskyDistributionInfoListItem);
        return this;
    }

    public OverviewInfoRes withRiskyDistributionInfoList(Consumer<List<Object>> riskyDistributionInfoListSetter) {
        if (this.riskyDistributionInfoList == null) {
            this.riskyDistributionInfoList = new ArrayList<>();
        }
        riskyDistributionInfoListSetter.accept(this.riskyDistributionInfoList);
        return this;
    }

    /**
     * **参数解释**： 风险分布内容列表 **取值范围**： 0-100个RiskyDistributionInfo对象 
     * @return riskyDistributionInfoList
     */
    public List<Object> getRiskyDistributionInfoList() {
        return riskyDistributionInfoList;
    }

    public void setRiskyDistributionInfoList(List<Object> riskyDistributionInfoList) {
        this.riskyDistributionInfoList = riskyDistributionInfoList;
    }

    public OverviewInfoRes withTopRiskyHostInfoList(List<Object> topRiskyHostInfoList) {
        this.topRiskyHostInfoList = topRiskyHostInfoList;
        return this;
    }

    public OverviewInfoRes addTopRiskyHostInfoListItem(Object topRiskyHostInfoListItem) {
        if (this.topRiskyHostInfoList == null) {
            this.topRiskyHostInfoList = new ArrayList<>();
        }
        this.topRiskyHostInfoList.add(topRiskyHostInfoListItem);
        return this;
    }

    public OverviewInfoRes withTopRiskyHostInfoList(Consumer<List<Object>> topRiskyHostInfoListSetter) {
        if (this.topRiskyHostInfoList == null) {
            this.topRiskyHostInfoList = new ArrayList<>();
        }
        topRiskyHostInfoListSetter.accept(this.topRiskyHostInfoList);
        return this;
    }

    /**
     * **参数解释**： top5风险主机列表 **取值范围**： 0-5个TopRiskyHostInfo对象 
     * @return topRiskyHostInfoList
     */
    public List<Object> getTopRiskyHostInfoList() {
        return topRiskyHostInfoList;
    }

    public void setTopRiskyHostInfoList(List<Object> topRiskyHostInfoList) {
        this.topRiskyHostInfoList = topRiskyHostInfoList;
    }

    public OverviewInfoRes withTopAccountCrackInfoList(List<Object> topAccountCrackInfoList) {
        this.topAccountCrackInfoList = topAccountCrackInfoList;
        return this;
    }

    public OverviewInfoRes addTopAccountCrackInfoListItem(Object topAccountCrackInfoListItem) {
        if (this.topAccountCrackInfoList == null) {
            this.topAccountCrackInfoList = new ArrayList<>();
        }
        this.topAccountCrackInfoList.add(topAccountCrackInfoListItem);
        return this;
    }

    public OverviewInfoRes withTopAccountCrackInfoList(Consumer<List<Object>> topAccountCrackInfoListSetter) {
        if (this.topAccountCrackInfoList == null) {
            this.topAccountCrackInfoList = new ArrayList<>();
        }
        topAccountCrackInfoListSetter.accept(this.topAccountCrackInfoList);
        return this;
    }

    /**
     * **参数解释**： top5暴力破解来源列表 **取值范围**： 0-5个TopAccountCrackInfo对象 
     * @return topAccountCrackInfoList
     */
    public List<Object> getTopAccountCrackInfoList() {
        return topAccountCrackInfoList;
    }

    public void setTopAccountCrackInfoList(List<Object> topAccountCrackInfoList) {
        this.topAccountCrackInfoList = topAccountCrackInfoList;
    }

    public OverviewInfoRes withHostInfoList(List<Object> hostInfoList) {
        this.hostInfoList = hostInfoList;
        return this;
    }

    public OverviewInfoRes addHostInfoListItem(Object hostInfoListItem) {
        if (this.hostInfoList == null) {
            this.hostInfoList = new ArrayList<>();
        }
        this.hostInfoList.add(hostInfoListItem);
        return this;
    }

    public OverviewInfoRes withHostInfoList(Consumer<List<Object>> hostInfoListSetter) {
        if (this.hostInfoList == null) {
            this.hostInfoList = new ArrayList<>();
        }
        hostInfoListSetter.accept(this.hostInfoList);
        return this;
    }

    /**
     * **参数解释**： 服务器列表 **取值范围**： 0-200个HostInfo对象 
     * @return hostInfoList
     */
    public List<Object> getHostInfoList() {
        return hostInfoList;
    }

    public void setHostInfoList(List<Object> hostInfoList) {
        this.hostInfoList = hostInfoList;
    }

    public OverviewInfoRes withOverallSituationInfoList(List<Object> overallSituationInfoList) {
        this.overallSituationInfoList = overallSituationInfoList;
        return this;
    }

    public OverviewInfoRes addOverallSituationInfoListItem(Object overallSituationInfoListItem) {
        if (this.overallSituationInfoList == null) {
            this.overallSituationInfoList = new ArrayList<>();
        }
        this.overallSituationInfoList.add(overallSituationInfoListItem);
        return this;
    }

    public OverviewInfoRes withOverallSituationInfoList(Consumer<List<Object>> overallSituationInfoListSetter) {
        if (this.overallSituationInfoList == null) {
            this.overallSituationInfoList = new ArrayList<>();
        }
        overallSituationInfoListSetter.accept(this.overallSituationInfoList);
        return this;
    }

    /**
     * **参数解释**： 总体情况列表 **取值范围**： 0-100个OverallSituationInfo对象 
     * @return overallSituationInfoList
     */
    public List<Object> getOverallSituationInfoList() {
        return overallSituationInfoList;
    }

    public void setOverallSituationInfoList(List<Object> overallSituationInfoList) {
        this.overallSituationInfoList = overallSituationInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OverviewInfoRes that = (OverviewInfoRes) obj;
        return Objects.equals(this.dashboardInfoList, that.dashboardInfoList)
            && Objects.equals(this.riskyTrendInfoList, that.riskyTrendInfoList)
            && Objects.equals(this.riskyDistributionInfoList, that.riskyDistributionInfoList)
            && Objects.equals(this.topRiskyHostInfoList, that.topRiskyHostInfoList)
            && Objects.equals(this.topAccountCrackInfoList, that.topAccountCrackInfoList)
            && Objects.equals(this.hostInfoList, that.hostInfoList)
            && Objects.equals(this.overallSituationInfoList, that.overallSituationInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardInfoList,
            riskyTrendInfoList,
            riskyDistributionInfoList,
            topRiskyHostInfoList,
            topAccountCrackInfoList,
            hostInfoList,
            overallSituationInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverviewInfoRes {\n");
        sb.append("    dashboardInfoList: ").append(toIndentedString(dashboardInfoList)).append("\n");
        sb.append("    riskyTrendInfoList: ").append(toIndentedString(riskyTrendInfoList)).append("\n");
        sb.append("    riskyDistributionInfoList: ").append(toIndentedString(riskyDistributionInfoList)).append("\n");
        sb.append("    topRiskyHostInfoList: ").append(toIndentedString(topRiskyHostInfoList)).append("\n");
        sb.append("    topAccountCrackInfoList: ").append(toIndentedString(topAccountCrackInfoList)).append("\n");
        sb.append("    hostInfoList: ").append(toIndentedString(hostInfoList)).append("\n");
        sb.append("    overallSituationInfoList: ").append(toIndentedString(overallSituationInfoList)).append("\n");
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
