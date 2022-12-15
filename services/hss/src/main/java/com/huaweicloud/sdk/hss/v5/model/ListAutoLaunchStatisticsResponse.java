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
public class ListAutoLaunchStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<AutoLaunchStatisticsResponseInfo> dataList = null;

    public ListAutoLaunchStatisticsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 自启动项统计信息总数,
     * minimum: 0
     * maximum: 10000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListAutoLaunchStatisticsResponse withDataList(List<AutoLaunchStatisticsResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListAutoLaunchStatisticsResponse addDataListItem(AutoLaunchStatisticsResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListAutoLaunchStatisticsResponse withDataList(
        Consumer<List<AutoLaunchStatisticsResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 自启动项统计信息列表
     * @return dataList
     */
    public List<AutoLaunchStatisticsResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<AutoLaunchStatisticsResponseInfo> dataList) {
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
        ListAutoLaunchStatisticsResponse listAutoLaunchStatisticsResponse = (ListAutoLaunchStatisticsResponse) o;
        return Objects.equals(this.totalNum, listAutoLaunchStatisticsResponse.totalNum)
            && Objects.equals(this.dataList, listAutoLaunchStatisticsResponse.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutoLaunchStatisticsResponse {\n");
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
