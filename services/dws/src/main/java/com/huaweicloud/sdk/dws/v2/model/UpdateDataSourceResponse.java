package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateDataSourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_id")

    private String dataSourceId;

    public UpdateDataSourceResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 更新数据源job_id。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public UpdateDataSourceResponse withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * 数据源id。
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDataSourceResponse that = (UpdateDataSourceResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.dataSourceId, that.dataSourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, dataSourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDataSourceResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
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
