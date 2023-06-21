package com.huaweicloud.sdk.tics.v1.model;

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
public class ListNoticesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lists")

    private List<TicsApproveLogVo> lists = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public ListNoticesResponse withLists(List<TicsApproveLogVo> lists) {
        this.lists = lists;
        return this;
    }

    public ListNoticesResponse addListsItem(TicsApproveLogVo listsItem) {
        if (this.lists == null) {
            this.lists = new ArrayList<>();
        }
        this.lists.add(listsItem);
        return this;
    }

    public ListNoticesResponse withLists(Consumer<List<TicsApproveLogVo>> listsSetter) {
        if (this.lists == null) {
            this.lists = new ArrayList<>();
        }
        listsSetter.accept(this.lists);
        return this;
    }

    /**
     * 实例集合
     * @return lists
     */
    public List<TicsApproveLogVo> getLists() {
        return lists;
    }

    public void setLists(List<TicsApproveLogVo> lists) {
        this.lists = lists;
    }

    public ListNoticesResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNoticesResponse listNoticesResponse = (ListNoticesResponse) o;
        return Objects.equals(this.lists, listNoticesResponse.lists)
            && Objects.equals(this.total, listNoticesResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lists, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNoticesResponse {\n");
        sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
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
