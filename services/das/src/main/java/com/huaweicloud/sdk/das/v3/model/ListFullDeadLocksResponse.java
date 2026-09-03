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
public class ListFullDeadLocksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_dead_lock_list")

    private List<FullDeadLock> fullDeadLockList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListFullDeadLocksResponse withFullDeadLockList(List<FullDeadLock> fullDeadLockList) {
        this.fullDeadLockList = fullDeadLockList;
        return this;
    }

    public ListFullDeadLocksResponse addFullDeadLockListItem(FullDeadLock fullDeadLockListItem) {
        if (this.fullDeadLockList == null) {
            this.fullDeadLockList = new ArrayList<>();
        }
        this.fullDeadLockList.add(fullDeadLockListItem);
        return this;
    }

    public ListFullDeadLocksResponse withFullDeadLockList(Consumer<List<FullDeadLock>> fullDeadLockListSetter) {
        if (this.fullDeadLockList == null) {
            this.fullDeadLockList = new ArrayList<>();
        }
        fullDeadLockListSetter.accept(this.fullDeadLockList);
        return this;
    }

    /**
     * 全量死锁列表
     * @return fullDeadLockList
     */
    public List<FullDeadLock> getFullDeadLockList() {
        return fullDeadLockList;
    }

    public void setFullDeadLockList(List<FullDeadLock> fullDeadLockList) {
        this.fullDeadLockList = fullDeadLockList;
    }

    public ListFullDeadLocksResponse withTotal(Long total) {
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
        ListFullDeadLocksResponse that = (ListFullDeadLocksResponse) obj;
        return Objects.equals(this.fullDeadLockList, that.fullDeadLockList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullDeadLockList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFullDeadLocksResponse {\n");
        sb.append("    fullDeadLockList: ").append(toIndentedString(fullDeadLockList)).append("\n");
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
