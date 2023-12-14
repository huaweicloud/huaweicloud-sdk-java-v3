package com.huaweicloud.sdk.dws.v2.model;

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
public class ListTablesStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private Long collectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ListTablesStatisticDto> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListTablesStatisticResponse withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * 数据采集时间毫秒级时间戳。
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    public ListTablesStatisticResponse withData(List<ListTablesStatisticDto> data) {
        this.data = data;
        return this;
    }

    public ListTablesStatisticResponse addDataItem(ListTablesStatisticDto dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListTablesStatisticResponse withData(Consumer<List<ListTablesStatisticDto>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 表倾斜率或脏页率列表。
     * @return data
     */
    public List<ListTablesStatisticDto> getData() {
        return data;
    }

    public void setData(List<ListTablesStatisticDto> data) {
        this.data = data;
    }

    public ListTablesStatisticResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总列表大小。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTablesStatisticResponse that = (ListTablesStatisticResponse) obj;
        return Objects.equals(this.collectTime, that.collectTime) && Objects.equals(this.data, that.data)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectTime, data, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTablesStatisticResponse {\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
