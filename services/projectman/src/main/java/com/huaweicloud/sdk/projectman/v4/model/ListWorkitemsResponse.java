package com.huaweicloud.sdk.projectman.v4.model;

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
public class ListWorkitemsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_items")

    private List<Workitems> workItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListWorkitemsResponse withWorkItems(List<Workitems> workItems) {
        this.workItems = workItems;
        return this;
    }

    public ListWorkitemsResponse addWorkItemsItem(Workitems workItemsItem) {
        if (this.workItems == null) {
            this.workItems = new ArrayList<>();
        }
        this.workItems.add(workItemsItem);
        return this;
    }

    public ListWorkitemsResponse withWorkItems(Consumer<List<Workitems>> workItemsSetter) {
        if (this.workItems == null) {
            this.workItems = new ArrayList<>();
        }
        workItemsSetter.accept(this.workItems);
        return this;
    }

    /**
     * 工作项
     * @return workItems
     */
    public List<Workitems> getWorkItems() {
        return workItems;
    }

    public void setWorkItems(List<Workitems> workItems) {
        this.workItems = workItems;
    }

    public ListWorkitemsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
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
        ListWorkitemsResponse that = (ListWorkitemsResponse) obj;
        return Objects.equals(this.workItems, that.workItems) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workItems, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkitemsResponse {\n");
        sb.append("    workItems: ").append(toIndentedString(workItems)).append("\n");
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
