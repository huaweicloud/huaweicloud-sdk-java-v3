package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datas")

    private List<DataSummaryRsp> datas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    public ListDataResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 数据对象（目录，文件）总数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListDataResponse withDatas(List<DataSummaryRsp> datas) {
        this.datas = datas;
        return this;
    }

    public ListDataResponse addDatasItem(DataSummaryRsp datasItem) {
        if (this.datas == null) {
            this.datas = new ArrayList<>();
        }
        this.datas.add(datasItem);
        return this;
    }

    public ListDataResponse withDatas(Consumer<List<DataSummaryRsp>> datasSetter) {
        if (this.datas == null) {
            this.datas = new ArrayList<>();
        }
        datasSetter.accept(this.datas);
        return this;
    }

    /**
     * 数据对象列表
     * @return datas
     */
    public List<DataSummaryRsp> getDatas() {
        return datas;
    }

    public void setDatas(List<DataSummaryRsp> datas) {
        this.datas = datas;
    }

    public ListDataResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下一页开始标签
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDataResponse listDataResponse = (ListDataResponse) o;
        return Objects.equals(this.count, listDataResponse.count) && Objects.equals(this.datas, listDataResponse.datas)
            && Objects.equals(this.nextMarker, listDataResponse.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, datas, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    datas: ").append(toIndentedString(datas)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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
