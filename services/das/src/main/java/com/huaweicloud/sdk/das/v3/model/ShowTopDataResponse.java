package com.huaweicloud.sdk.das.v3.model;

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
public class ShowTopDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_data_list")

    private List<TopDataInfo> topDataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_timestamp")

    private Long collectTimestamp;

    public ShowTopDataResponse withTopDataList(List<TopDataInfo> topDataList) {
        this.topDataList = topDataList;
        return this;
    }

    public ShowTopDataResponse addTopDataListItem(TopDataInfo topDataListItem) {
        if (this.topDataList == null) {
            this.topDataList = new ArrayList<>();
        }
        this.topDataList.add(topDataListItem);
        return this;
    }

    public ShowTopDataResponse withTopDataList(Consumer<List<TopDataInfo>> topDataListSetter) {
        if (this.topDataList == null) {
            this.topDataList = new ArrayList<>();
        }
        topDataListSetter.accept(this.topDataList);
        return this;
    }

    /**
     * Top库表数据列表
     * @return topDataList
     */
    public List<TopDataInfo> getTopDataList() {
        return topDataList;
    }

    public void setTopDataList(List<TopDataInfo> topDataList) {
        this.topDataList = topDataList;
    }

    public ShowTopDataResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowTopDataResponse withCollectTimestamp(Long collectTimestamp) {
        this.collectTimestamp = collectTimestamp;
        return this;
    }

    /**
     * 采集时间（Unix timestamp），单位：毫秒
     * @return collectTimestamp
     */
    public Long getCollectTimestamp() {
        return collectTimestamp;
    }

    public void setCollectTimestamp(Long collectTimestamp) {
        this.collectTimestamp = collectTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTopDataResponse that = (ShowTopDataResponse) obj;
        return Objects.equals(this.topDataList, that.topDataList) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.collectTimestamp, that.collectTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topDataList, totalCount, collectTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopDataResponse {\n");
        sb.append("    topDataList: ").append(toIndentedString(topDataList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    collectTimestamp: ").append(toIndentedString(collectTimestamp)).append("\n");
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
