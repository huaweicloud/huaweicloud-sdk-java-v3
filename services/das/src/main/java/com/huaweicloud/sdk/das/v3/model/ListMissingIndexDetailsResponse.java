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
public class ListMissingIndexDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_list")

    private List<Object> detailList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_time")

    private Long collectTime;

    public ListMissingIndexDetailsResponse withDetailList(List<Object> detailList) {
        this.detailList = detailList;
        return this;
    }

    public ListMissingIndexDetailsResponse addDetailListItem(Object detailListItem) {
        if (this.detailList == null) {
            this.detailList = new ArrayList<>();
        }
        this.detailList.add(detailListItem);
        return this;
    }

    public ListMissingIndexDetailsResponse withDetailList(Consumer<List<Object>> detailListSetter) {
        if (this.detailList == null) {
            this.detailList = new ArrayList<>();
        }
        detailListSetter.accept(this.detailList);
        return this;
    }

    /**
     * 索引缺失明细列表
     * @return detailList
     */
    public List<Object> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Object> detailList) {
        this.detailList = detailList;
    }

    public ListMissingIndexDetailsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListMissingIndexDetailsResponse withCollectTime(Long collectTime) {
        this.collectTime = collectTime;
        return this;
    }

    /**
     * 采集时间
     * @return collectTime
     */
    public Long getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Long collectTime) {
        this.collectTime = collectTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMissingIndexDetailsResponse that = (ListMissingIndexDetailsResponse) obj;
        return Objects.equals(this.detailList, that.detailList) && Objects.equals(this.total, that.total)
            && Objects.equals(this.collectTime, that.collectTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailList, total, collectTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMissingIndexDetailsResponse {\n");
        sb.append("    detailList: ").append(toIndentedString(detailList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    collectTime: ").append(toIndentedString(collectTime)).append("\n");
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
