package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HealthReportTableSpaceQuerySpaceTopResp
 */
public class HealthReportTableSpaceQuerySpaceTopResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_data_list")

    private List<HealthReportTableSpaceTopDataDto> topDataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_timestamp")

    private Long collectTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    public HealthReportTableSpaceQuerySpaceTopResp withTopDataList(List<HealthReportTableSpaceTopDataDto> topDataList) {
        this.topDataList = topDataList;
        return this;
    }

    public HealthReportTableSpaceQuerySpaceTopResp addTopDataListItem(
        HealthReportTableSpaceTopDataDto topDataListItem) {
        if (this.topDataList == null) {
            this.topDataList = new ArrayList<>();
        }
        this.topDataList.add(topDataListItem);
        return this;
    }

    public HealthReportTableSpaceQuerySpaceTopResp withTopDataList(
        Consumer<List<HealthReportTableSpaceTopDataDto>> topDataListSetter) {
        if (this.topDataList == null) {
            this.topDataList = new ArrayList<>();
        }
        topDataListSetter.accept(this.topDataList);
        return this;
    }

    /**
     * 库/表大小Top列表。
     * @return topDataList
     */
    public List<HealthReportTableSpaceTopDataDto> getTopDataList() {
        return topDataList;
    }

    public void setTopDataList(List<HealthReportTableSpaceTopDataDto> topDataList) {
        this.topDataList = topDataList;
    }

    public HealthReportTableSpaceQuerySpaceTopResp withCollectTimestamp(Long collectTimestamp) {
        this.collectTimestamp = collectTimestamp;
        return this;
    }

    /**
     * 采集时间
     * @return collectTimestamp
     */
    public Long getCollectTimestamp() {
        return collectTimestamp;
    }

    public void setCollectTimestamp(Long collectTimestamp) {
        this.collectTimestamp = collectTimestamp;
    }

    public HealthReportTableSpaceQuerySpaceTopResp withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总大小。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportTableSpaceQuerySpaceTopResp that = (HealthReportTableSpaceQuerySpaceTopResp) obj;
        return Objects.equals(this.topDataList, that.topDataList)
            && Objects.equals(this.collectTimestamp, that.collectTimestamp)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topDataList, collectTimestamp, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportTableSpaceQuerySpaceTopResp {\n");
        sb.append("    topDataList: ").append(toIndentedString(topDataList)).append("\n");
        sb.append("    collectTimestamp: ").append(toIndentedString(collectTimestamp)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
