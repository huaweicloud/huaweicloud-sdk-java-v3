package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListFactoryPendingItemsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<ListFactoryPendingItemsRespData> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListFactoryPendingItemsResponse withData(List<ListFactoryPendingItemsRespData> data) {
        this.data = data;
        return this;
    }

    public ListFactoryPendingItemsResponse addDataItem(ListFactoryPendingItemsRespData dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListFactoryPendingItemsResponse withData(Consumer<List<ListFactoryPendingItemsRespData>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 待发布包信息
     * @return data
     */
    public List<ListFactoryPendingItemsRespData> getData() {
        return data;
    }

    public void setData(List<ListFactoryPendingItemsRespData> data) {
        this.data = data;
    }

    public ListFactoryPendingItemsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 待发布包数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFactoryPendingItemsResponse that = (ListFactoryPendingItemsResponse) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFactoryPendingItemsResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
