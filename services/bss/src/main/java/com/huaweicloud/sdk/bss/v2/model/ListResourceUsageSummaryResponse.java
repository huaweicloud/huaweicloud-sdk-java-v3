package com.huaweicloud.sdk.bss.v2.model;

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
public class ListResourceUsageSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary_usage_info_list")

    private List<StatUsageSummaryInfo> summaryUsageInfoList = null;

    public ListResourceUsageSummaryResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总条数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListResourceUsageSummaryResponse withSummaryUsageInfoList(List<StatUsageSummaryInfo> summaryUsageInfoList) {
        this.summaryUsageInfoList = summaryUsageInfoList;
        return this;
    }

    public ListResourceUsageSummaryResponse addSummaryUsageInfoListItem(StatUsageSummaryInfo summaryUsageInfoListItem) {
        if (this.summaryUsageInfoList == null) {
            this.summaryUsageInfoList = new ArrayList<>();
        }
        this.summaryUsageInfoList.add(summaryUsageInfoListItem);
        return this;
    }

    public ListResourceUsageSummaryResponse withSummaryUsageInfoList(
        Consumer<List<StatUsageSummaryInfo>> summaryUsageInfoListSetter) {
        if (this.summaryUsageInfoList == null) {
            this.summaryUsageInfoList = new ArrayList<>();
        }
        summaryUsageInfoListSetter.accept(this.summaryUsageInfoList);
        return this;
    }

    /**
     * 统计值，按照资源ID维度返回的月度统计结果。具体请参见表3。  说明： 每月2日20点后可查询上月数据；若查询当月数据，则只返回资源ID。
     * @return summaryUsageInfoList
     */
    public List<StatUsageSummaryInfo> getSummaryUsageInfoList() {
        return summaryUsageInfoList;
    }

    public void setSummaryUsageInfoList(List<StatUsageSummaryInfo> summaryUsageInfoList) {
        this.summaryUsageInfoList = summaryUsageInfoList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourceUsageSummaryResponse listResourceUsageSummaryResponse = (ListResourceUsageSummaryResponse) o;
        return Objects.equals(this.totalCount, listResourceUsageSummaryResponse.totalCount)
            && Objects.equals(this.summaryUsageInfoList, listResourceUsageSummaryResponse.summaryUsageInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, summaryUsageInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceUsageSummaryResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    summaryUsageInfoList: ").append(toIndentedString(summaryUsageInfoList)).append("\n");
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
