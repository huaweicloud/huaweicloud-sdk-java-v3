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
public class ListLockBlockingDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_list")

    private List<ListLockBlockingDetailRespDetailList> detailList = null;

    public ListLockBlockingDetailResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListLockBlockingDetailResponse withDetailList(List<ListLockBlockingDetailRespDetailList> detailList) {
        this.detailList = detailList;
        return this;
    }

    public ListLockBlockingDetailResponse addDetailListItem(ListLockBlockingDetailRespDetailList detailListItem) {
        if (this.detailList == null) {
            this.detailList = new ArrayList<>();
        }
        this.detailList.add(detailListItem);
        return this;
    }

    public ListLockBlockingDetailResponse withDetailList(
        Consumer<List<ListLockBlockingDetailRespDetailList>> detailListSetter) {
        if (this.detailList == null) {
            this.detailList = new ArrayList<>();
        }
        detailListSetter.accept(this.detailList);
        return this;
    }

    /**
     * 锁阻塞明细列表
     * @return detailList
     */
    public List<ListLockBlockingDetailRespDetailList> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<ListLockBlockingDetailRespDetailList> detailList) {
        this.detailList = detailList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLockBlockingDetailResponse that = (ListLockBlockingDetailResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.detailList, that.detailList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, detailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLockBlockingDetailResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    detailList: ").append(toIndentedString(detailList)).append("\n");
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
