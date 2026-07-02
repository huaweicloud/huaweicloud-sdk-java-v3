package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class BatchChangeInstanceSpecificationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ids")

    private List<String> jobIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_ids")

    private List<String> orderIds = null;

    public BatchChangeInstanceSpecificationResponse withJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    public BatchChangeInstanceSpecificationResponse addJobIdsItem(String jobIdsItem) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        this.jobIds.add(jobIdsItem);
        return this;
    }

    public BatchChangeInstanceSpecificationResponse withJobIds(Consumer<List<String>> jobIdsSetter) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        jobIdsSetter.accept(this.jobIds);
        return this;
    }

    /**
     * **参数解释**：  批量规格变更的任务ID列表，仅变更按需实例时会返回该参数。  **取值范围**：  不涉及。
     * @return jobIds
     */
    public List<String> getJobIds() {
        return jobIds;
    }

    public void setJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
    }

    public BatchChangeInstanceSpecificationResponse withOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public BatchChangeInstanceSpecificationResponse addOrderIdsItem(String orderIdsItem) {
        if (this.orderIds == null) {
            this.orderIds = new ArrayList<>();
        }
        this.orderIds.add(orderIdsItem);
        return this;
    }

    public BatchChangeInstanceSpecificationResponse withOrderIds(Consumer<List<String>> orderIdsSetter) {
        if (this.orderIds == null) {
            this.orderIds = new ArrayList<>();
        }
        orderIdsSetter.accept(this.orderIds);
        return this;
    }

    /**
     * **参数解释**：  批量规格变更订单ID列表，仅变更包年/包月实例时会返回该参数。  **取值范围**：  不涉及。
     * @return orderIds
     */
    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchChangeInstanceSpecificationResponse that = (BatchChangeInstanceSpecificationResponse) obj;
        return Objects.equals(this.jobIds, that.jobIds) && Objects.equals(this.orderIds, that.orderIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobIds, orderIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchChangeInstanceSpecificationResponse {\n");
        sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
        sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
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
