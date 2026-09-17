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
public class ShowTopTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_data_list")

    private List<TopDataInfo> topDataList = null;

    public ShowTopTrendResponse withTopDataList(List<TopDataInfo> topDataList) {
        this.topDataList = topDataList;
        return this;
    }

    public ShowTopTrendResponse addTopDataListItem(TopDataInfo topDataListItem) {
        if (this.topDataList == null) {
            this.topDataList = new ArrayList<>();
        }
        this.topDataList.add(topDataListItem);
        return this;
    }

    public ShowTopTrendResponse withTopDataList(Consumer<List<TopDataInfo>> topDataListSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTopTrendResponse that = (ShowTopTrendResponse) obj;
        return Objects.equals(this.topDataList, that.topDataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topDataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopTrendResponse {\n");
        sb.append("    topDataList: ").append(toIndentedString(topDataList)).append("\n");
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
