package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryDiagnoseItemsReq
 */
public class QueryDiagnoseItemsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_ids")

    private String itemIds;

    public QueryDiagnoseItemsReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * job id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public QueryDiagnoseItemsReq withItemIds(String itemIds) {
        this.itemIds = itemIds;
        return this;
    }

    /**
     * 诊断项id列表
     * @return itemIds
     */
    public String getItemIds() {
        return itemIds;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryDiagnoseItemsReq queryDiagnoseItemsReq = (QueryDiagnoseItemsReq) o;
        return Objects.equals(this.jobId, queryDiagnoseItemsReq.jobId)
            && Objects.equals(this.itemIds, queryDiagnoseItemsReq.itemIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, itemIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDiagnoseItemsReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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
