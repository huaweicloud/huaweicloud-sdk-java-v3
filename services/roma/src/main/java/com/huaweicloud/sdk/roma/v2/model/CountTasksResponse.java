package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CountTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_task_details")

    private TaskStatisticDetails commonTaskDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cdc_task_details")

    private TaskStatisticDetails cdcTaskDetails;

    public CountTasksResponse withCommonTaskDetails(TaskStatisticDetails commonTaskDetails) {
        this.commonTaskDetails = commonTaskDetails;
        return this;
    }

    public CountTasksResponse withCommonTaskDetails(Consumer<TaskStatisticDetails> commonTaskDetailsSetter) {
        if (this.commonTaskDetails == null) {
            this.commonTaskDetails = new TaskStatisticDetails();
            commonTaskDetailsSetter.accept(this.commonTaskDetails);
        }

        return this;
    }

    /** Get commonTaskDetails
     * 
     * @return commonTaskDetails */
    public TaskStatisticDetails getCommonTaskDetails() {
        return commonTaskDetails;
    }

    public void setCommonTaskDetails(TaskStatisticDetails commonTaskDetails) {
        this.commonTaskDetails = commonTaskDetails;
    }

    public CountTasksResponse withCdcTaskDetails(TaskStatisticDetails cdcTaskDetails) {
        this.cdcTaskDetails = cdcTaskDetails;
        return this;
    }

    public CountTasksResponse withCdcTaskDetails(Consumer<TaskStatisticDetails> cdcTaskDetailsSetter) {
        if (this.cdcTaskDetails == null) {
            this.cdcTaskDetails = new TaskStatisticDetails();
            cdcTaskDetailsSetter.accept(this.cdcTaskDetails);
        }

        return this;
    }

    /** Get cdcTaskDetails
     * 
     * @return cdcTaskDetails */
    public TaskStatisticDetails getCdcTaskDetails() {
        return cdcTaskDetails;
    }

    public void setCdcTaskDetails(TaskStatisticDetails cdcTaskDetails) {
        this.cdcTaskDetails = cdcTaskDetails;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountTasksResponse countTasksResponse = (CountTasksResponse) o;
        return Objects.equals(this.commonTaskDetails, countTasksResponse.commonTaskDetails)
            && Objects.equals(this.cdcTaskDetails, countTasksResponse.cdcTaskDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonTaskDetails, cdcTaskDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountTasksResponse {\n");
        sb.append("    commonTaskDetails: ").append(toIndentedString(commonTaskDetails)).append("\n");
        sb.append("    cdcTaskDetails: ").append(toIndentedString(cdcTaskDetails)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
