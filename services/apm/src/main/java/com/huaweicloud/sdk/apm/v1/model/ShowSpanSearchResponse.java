package com.huaweicloud.sdk.apm.v1.model;

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
public class ShowSpanSearchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_info_list")

    private List<ClientSpanInfo> spanInfoList = null;

    public ShowSpanSearchResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 返回的总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowSpanSearchResponse withSpanInfoList(List<ClientSpanInfo> spanInfoList) {
        this.spanInfoList = spanInfoList;
        return this;
    }

    public ShowSpanSearchResponse addSpanInfoListItem(ClientSpanInfo spanInfoListItem) {
        if (this.spanInfoList == null) {
            this.spanInfoList = new ArrayList<>();
        }
        this.spanInfoList.add(spanInfoListItem);
        return this;
    }

    public ShowSpanSearchResponse withSpanInfoList(Consumer<List<ClientSpanInfo>> spanInfoListSetter) {
        if (this.spanInfoList == null) {
            this.spanInfoList = new ArrayList<>();
        }
        spanInfoListSetter.accept(this.spanInfoList);
        return this;
    }

    /**
     * span信息。
     * @return spanInfoList
     */
    public List<ClientSpanInfo> getSpanInfoList() {
        return spanInfoList;
    }

    public void setSpanInfoList(List<ClientSpanInfo> spanInfoList) {
        this.spanInfoList = spanInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSpanSearchResponse that = (ShowSpanSearchResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.spanInfoList, that.spanInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, spanInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSpanSearchResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    spanInfoList: ").append(toIndentedString(spanInfoList)).append("\n");
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
