package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 响应码统计信息，包含WAF和上游服务器各响应码的时间线统计。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_source_waf_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceWafInfoList> responseSourceWafInfoList =
        null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_source_upstream_info_list")

    private List<SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceUpstreamInfoList> responseSourceUpstreamInfoList =
        null;

    public SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo withResponseSourceWafInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceWafInfoList> responseSourceWafInfoList) {
        this.responseSourceWafInfoList = responseSourceWafInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo addResponseSourceWafInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceWafInfoList responseSourceWafInfoListItem) {
        if (this.responseSourceWafInfoList == null) {
            this.responseSourceWafInfoList = new ArrayList<>();
        }
        this.responseSourceWafInfoList.add(responseSourceWafInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo withResponseSourceWafInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceWafInfoList>> responseSourceWafInfoListSetter) {
        if (this.responseSourceWafInfoList == null) {
            this.responseSourceWafInfoList = new ArrayList<>();
        }
        responseSourceWafInfoListSetter.accept(this.responseSourceWafInfoList);
        return this;
    }

    /**
     * **参数解释：** WAF响应码统计列表，包含各响应码按时间线的WAF返回数量。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return responseSourceWafInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceWafInfoList> getResponseSourceWafInfoList() {
        return responseSourceWafInfoList;
    }

    public void setResponseSourceWafInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceWafInfoList> responseSourceWafInfoList) {
        this.responseSourceWafInfoList = responseSourceWafInfoList;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo withResponseSourceUpstreamInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceUpstreamInfoList> responseSourceUpstreamInfoList) {
        this.responseSourceUpstreamInfoList = responseSourceUpstreamInfoList;
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo addResponseSourceUpstreamInfoListItem(
        SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceUpstreamInfoList responseSourceUpstreamInfoListItem) {
        if (this.responseSourceUpstreamInfoList == null) {
            this.responseSourceUpstreamInfoList = new ArrayList<>();
        }
        this.responseSourceUpstreamInfoList.add(responseSourceUpstreamInfoListItem);
        return this;
    }

    public SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo withResponseSourceUpstreamInfoList(
        Consumer<List<SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceUpstreamInfoList>> responseSourceUpstreamInfoListSetter) {
        if (this.responseSourceUpstreamInfoList == null) {
            this.responseSourceUpstreamInfoList = new ArrayList<>();
        }
        responseSourceUpstreamInfoListSetter.accept(this.responseSourceUpstreamInfoList);
        return this;
    }

    /**
     * **参数解释：** 上游响应码统计列表，包含各响应码按时间线的上游返回数量。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return responseSourceUpstreamInfoList
     */
    public List<SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceUpstreamInfoList> getResponseSourceUpstreamInfoList() {
        return responseSourceUpstreamInfoList;
    }

    public void setResponseSourceUpstreamInfoList(
        List<SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfoResponseSourceUpstreamInfoList> responseSourceUpstreamInfoList) {
        this.responseSourceUpstreamInfoList = responseSourceUpstreamInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo that =
            (SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo) obj;
        return Objects.equals(this.responseSourceWafInfoList, that.responseSourceWafInfoList)
            && Objects.equals(this.responseSourceUpstreamInfoList, that.responseSourceUpstreamInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseSourceWafInfoList, responseSourceUpstreamInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityReportContentResponseReportContentSubscriptionInfoResponseCodeStatisticsInfo {\n");
        sb.append("    responseSourceWafInfoList: ").append(toIndentedString(responseSourceWafInfoList)).append("\n");
        sb.append("    responseSourceUpstreamInfoList: ")
            .append(toIndentedString(responseSourceUpstreamInfoList))
            .append("\n");
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
