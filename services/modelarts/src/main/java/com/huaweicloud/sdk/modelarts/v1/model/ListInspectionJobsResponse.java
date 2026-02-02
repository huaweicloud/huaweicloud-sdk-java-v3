package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListInspectionJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inspection_jobs")

    private List<InspectionJob> inspectionJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListInspectionJobsResponse withInspectionJobs(List<InspectionJob> inspectionJobs) {
        this.inspectionJobs = inspectionJobs;
        return this;
    }

    public ListInspectionJobsResponse addInspectionJobsItem(InspectionJob inspectionJobsItem) {
        if (this.inspectionJobs == null) {
            this.inspectionJobs = new ArrayList<>();
        }
        this.inspectionJobs.add(inspectionJobsItem);
        return this;
    }

    public ListInspectionJobsResponse withInspectionJobs(Consumer<List<InspectionJob>> inspectionJobsSetter) {
        if (this.inspectionJobs == null) {
            this.inspectionJobs = new ArrayList<>();
        }
        inspectionJobsSetter.accept(this.inspectionJobs);
        return this;
    }

    /**
     * **参数解释**：巡检作业列表。
     * @return inspectionJobs
     */
    public List<InspectionJob> getInspectionJobs() {
        return inspectionJobs;
    }

    public void setInspectionJobs(List<InspectionJob> inspectionJobs) {
        this.inspectionJobs = inspectionJobs;
    }

    public ListInspectionJobsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：巡检作业总数。 **取值范围**：[0,1000]。
     * minimum: 0
     * maximum: 1000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListInspectionJobsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInspectionJobsResponse that = (ListInspectionJobsResponse) obj;
        return Objects.equals(this.inspectionJobs, that.inspectionJobs) && Objects.equals(this.total, that.total)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inspectionJobs, total, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInspectionJobsResponse {\n");
        sb.append("    inspectionJobs: ").append(toIndentedString(inspectionJobs)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
