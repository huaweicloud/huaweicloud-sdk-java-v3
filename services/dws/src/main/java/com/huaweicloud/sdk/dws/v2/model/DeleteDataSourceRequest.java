package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDataSourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_data_source_id")

    private String extDataSourceId;

    public DeleteDataSourceRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteDataSourceRequest withExtDataSourceId(String extDataSourceId) {
        this.extDataSourceId = extDataSourceId;
        return this;
    }

    /**
     * 数据源id
     * @return extDataSourceId
     */
    public String getExtDataSourceId() {
        return extDataSourceId;
    }

    public void setExtDataSourceId(String extDataSourceId) {
        this.extDataSourceId = extDataSourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteDataSourceRequest deleteDataSourceRequest = (DeleteDataSourceRequest) o;
        return Objects.equals(this.clusterId, deleteDataSourceRequest.clusterId)
            && Objects.equals(this.extDataSourceId, deleteDataSourceRequest.extDataSourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, extDataSourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDataSourceRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    extDataSourceId: ").append(toIndentedString(extDataSourceId)).append("\n");
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
