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
public class ListDeadLockDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_list")

    private List<DeadLockDetail> detailList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListDeadLockDetailResponse withDetailList(List<DeadLockDetail> detailList) {
        this.detailList = detailList;
        return this;
    }

    public ListDeadLockDetailResponse addDetailListItem(DeadLockDetail detailListItem) {
        if (this.detailList == null) {
            this.detailList = new ArrayList<>();
        }
        this.detailList.add(detailListItem);
        return this;
    }

    public ListDeadLockDetailResponse withDetailList(Consumer<List<DeadLockDetail>> detailListSetter) {
        if (this.detailList == null) {
            this.detailList = new ArrayList<>();
        }
        detailListSetter.accept(this.detailList);
        return this;
    }

    /**
     * 死锁明细列表
     * @return detailList
     */
    public List<DeadLockDetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<DeadLockDetail> detailList) {
        this.detailList = detailList;
    }

    public ListDeadLockDetailResponse withTotal(Long total) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDeadLockDetailResponse that = (ListDeadLockDetailResponse) obj;
        return Objects.equals(this.detailList, that.detailList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeadLockDetailResponse {\n");
        sb.append("    detailList: ").append(toIndentedString(detailList)).append("\n");
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
