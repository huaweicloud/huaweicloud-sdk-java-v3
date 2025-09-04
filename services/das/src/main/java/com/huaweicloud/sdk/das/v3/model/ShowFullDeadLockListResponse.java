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
public class ShowFullDeadLockListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_deadlock_list")

    private List<FullDeadLockListRespFullDeadlockList> fullDeadlockList = null;

    public ShowFullDeadLockListResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 死锁数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowFullDeadLockListResponse withFullDeadlockList(
        List<FullDeadLockListRespFullDeadlockList> fullDeadlockList) {
        this.fullDeadlockList = fullDeadlockList;
        return this;
    }

    public ShowFullDeadLockListResponse addFullDeadlockListItem(
        FullDeadLockListRespFullDeadlockList fullDeadlockListItem) {
        if (this.fullDeadlockList == null) {
            this.fullDeadlockList = new ArrayList<>();
        }
        this.fullDeadlockList.add(fullDeadlockListItem);
        return this;
    }

    public ShowFullDeadLockListResponse withFullDeadlockList(
        Consumer<List<FullDeadLockListRespFullDeadlockList>> fullDeadlockListSetter) {
        if (this.fullDeadlockList == null) {
            this.fullDeadlockList = new ArrayList<>();
        }
        fullDeadlockListSetter.accept(this.fullDeadlockList);
        return this;
    }

    /**
     * 死锁具体信息
     * @return fullDeadlockList
     */
    public List<FullDeadLockListRespFullDeadlockList> getFullDeadlockList() {
        return fullDeadlockList;
    }

    public void setFullDeadlockList(List<FullDeadLockListRespFullDeadlockList> fullDeadlockList) {
        this.fullDeadlockList = fullDeadlockList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFullDeadLockListResponse that = (ShowFullDeadLockListResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.fullDeadlockList, that.fullDeadlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, fullDeadlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFullDeadLockListResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    fullDeadlockList: ").append(toIndentedString(fullDeadlockList)).append("\n");
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
