package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修复详情。
 */
public class QueryRepairDetailResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_details")

    private List<QueryRepairDetailRespRepairDetails> repairDetails = null;

    public QueryRepairDetailResp withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public QueryRepairDetailResp withRepairDetails(List<QueryRepairDetailRespRepairDetails> repairDetails) {
        this.repairDetails = repairDetails;
        return this;
    }

    public QueryRepairDetailResp addRepairDetailsItem(QueryRepairDetailRespRepairDetails repairDetailsItem) {
        if (this.repairDetails == null) {
            this.repairDetails = new ArrayList<>();
        }
        this.repairDetails.add(repairDetailsItem);
        return this;
    }

    public QueryRepairDetailResp withRepairDetails(
        Consumer<List<QueryRepairDetailRespRepairDetails>> repairDetailsSetter) {
        if (this.repairDetails == null) {
            this.repairDetails = new ArrayList<>();
        }
        repairDetailsSetter.accept(this.repairDetails);
        return this;
    }

    /**
     * 修复详情。
     * @return repairDetails
     */
    public List<QueryRepairDetailRespRepairDetails> getRepairDetails() {
        return repairDetails;
    }

    public void setRepairDetails(List<QueryRepairDetailRespRepairDetails> repairDetails) {
        this.repairDetails = repairDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryRepairDetailResp that = (QueryRepairDetailResp) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.repairDetails, that.repairDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, repairDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryRepairDetailResp {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    repairDetails: ").append(toIndentedString(repairDetails)).append("\n");
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
