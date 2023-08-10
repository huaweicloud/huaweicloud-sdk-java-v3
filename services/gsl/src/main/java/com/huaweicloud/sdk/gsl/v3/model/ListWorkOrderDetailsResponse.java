package com.huaweicloud.sdk.gsl.v3.model;

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
public class ListWorkOrderDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_order_details")

    private List<WorkOrderDetailVo> workOrderDetails = null;

    public ListWorkOrderDetailsResponse withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页的记录数
     * minimum: 10
     * maximum: 500
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListWorkOrderDetailsResponse withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 页码，最小值是1，最大值为1000000。默认值是1.
     * minimum: 1
     * maximum: 1000000
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListWorkOrderDetailsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 记录总数
     * minimum: 0
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListWorkOrderDetailsResponse withWorkOrderDetails(List<WorkOrderDetailVo> workOrderDetails) {
        this.workOrderDetails = workOrderDetails;
        return this;
    }

    public ListWorkOrderDetailsResponse addWorkOrderDetailsItem(WorkOrderDetailVo workOrderDetailsItem) {
        if (this.workOrderDetails == null) {
            this.workOrderDetails = new ArrayList<>();
        }
        this.workOrderDetails.add(workOrderDetailsItem);
        return this;
    }

    public ListWorkOrderDetailsResponse withWorkOrderDetails(Consumer<List<WorkOrderDetailVo>> workOrderDetailsSetter) {
        if (this.workOrderDetails == null) {
            this.workOrderDetails = new ArrayList<>();
        }
        workOrderDetailsSetter.accept(this.workOrderDetails);
        return this;
    }

    /**
     * 业务受理明细列表
     * @return workOrderDetails
     */
    public List<WorkOrderDetailVo> getWorkOrderDetails() {
        return workOrderDetails;
    }

    public void setWorkOrderDetails(List<WorkOrderDetailVo> workOrderDetails) {
        this.workOrderDetails = workOrderDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkOrderDetailsResponse that = (ListWorkOrderDetailsResponse) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.count, that.count) && Objects.equals(this.workOrderDetails, that.workOrderDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, count, workOrderDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkOrderDetailsResponse {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    workOrderDetails: ").append(toIndentedString(workOrderDetails)).append("\n");
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
