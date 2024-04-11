package com.huaweicloud.sdk.drs.v3.model;

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
public class ListDataCompareOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_compare_overview_infos")

    private List<DataCompareOverviewInfo> dataCompareOverviewInfos = null;

    public ListDataCompareOverviewResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 对比信息数量
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListDataCompareOverviewResponse withDataCompareOverviewInfos(
        List<DataCompareOverviewInfo> dataCompareOverviewInfos) {
        this.dataCompareOverviewInfos = dataCompareOverviewInfos;
        return this;
    }

    public ListDataCompareOverviewResponse addDataCompareOverviewInfosItem(
        DataCompareOverviewInfo dataCompareOverviewInfosItem) {
        if (this.dataCompareOverviewInfos == null) {
            this.dataCompareOverviewInfos = new ArrayList<>();
        }
        this.dataCompareOverviewInfos.add(dataCompareOverviewInfosItem);
        return this;
    }

    public ListDataCompareOverviewResponse withDataCompareOverviewInfos(
        Consumer<List<DataCompareOverviewInfo>> dataCompareOverviewInfosSetter) {
        if (this.dataCompareOverviewInfos == null) {
            this.dataCompareOverviewInfos = new ArrayList<>();
        }
        dataCompareOverviewInfosSetter.accept(this.dataCompareOverviewInfos);
        return this;
    }

    /**
     * 信息列表
     * @return dataCompareOverviewInfos
     */
    public List<DataCompareOverviewInfo> getDataCompareOverviewInfos() {
        return dataCompareOverviewInfos;
    }

    public void setDataCompareOverviewInfos(List<DataCompareOverviewInfo> dataCompareOverviewInfos) {
        this.dataCompareOverviewInfos = dataCompareOverviewInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataCompareOverviewResponse that = (ListDataCompareOverviewResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.dataCompareOverviewInfos, that.dataCompareOverviewInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, dataCompareOverviewInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataCompareOverviewResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    dataCompareOverviewInfos: ").append(toIndentedString(dataCompareOverviewInfos)).append("\n");
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
