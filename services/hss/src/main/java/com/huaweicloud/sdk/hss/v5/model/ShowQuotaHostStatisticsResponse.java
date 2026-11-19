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
public class ShowQuotaHostStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_total_num")

    private Integer hostTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<QuotaHostStatistics> dataList = null;

    public ShowQuotaHostStatisticsResponse withHostTotalNum(Integer hostTotalNum) {
        this.hostTotalNum = hostTotalNum;
        return this;
    }

    /**
     * **参数解释**: 主机总数量 **取值范围**: 最小值0，最大值2147483647 
     * @return hostTotalNum
     */
    public Integer getHostTotalNum() {
        return hostTotalNum;
    }

    public void setHostTotalNum(Integer hostTotalNum) {
        this.hostTotalNum = hostTotalNum;
    }

    public ShowQuotaHostStatisticsResponse withDataList(List<QuotaHostStatistics> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ShowQuotaHostStatisticsResponse addDataListItem(QuotaHostStatistics dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ShowQuotaHostStatisticsResponse withDataList(Consumer<List<QuotaHostStatistics>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 配额信息列表，包含各版本的配额统计 **取值范围**: 0-200个QuotaHostStatistics对象 
     * @return dataList
     */
    public List<QuotaHostStatistics> getDataList() {
        return dataList;
    }

    public void setDataList(List<QuotaHostStatistics> dataList) {
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
        ShowQuotaHostStatisticsResponse that = (ShowQuotaHostStatisticsResponse) obj;
        return Objects.equals(this.hostTotalNum, that.hostTotalNum) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostTotalNum, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQuotaHostStatisticsResponse {\n");
        sb.append("    hostTotalNum: ").append(toIndentedString(hostTotalNum)).append("\n");
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
