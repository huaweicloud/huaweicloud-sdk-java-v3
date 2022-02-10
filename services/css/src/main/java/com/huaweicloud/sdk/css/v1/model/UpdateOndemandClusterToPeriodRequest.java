package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateOndemandClusterToPeriodRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PeriodReq body;

    public UpdateOndemandClusterToPeriodRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /** 指定待查询的集群ID。
     * 
     * @return clusterId */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateOndemandClusterToPeriodRequest withBody(PeriodReq body) {
        this.body = body;
        return this;
    }

    public UpdateOndemandClusterToPeriodRequest withBody(Consumer<PeriodReq> bodySetter) {
        if (this.body == null) {
            this.body = new PeriodReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public PeriodReq getBody() {
        return body;
    }

    public void setBody(PeriodReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateOndemandClusterToPeriodRequest updateOndemandClusterToPeriodRequest =
            (UpdateOndemandClusterToPeriodRequest) o;
        return Objects.equals(this.clusterId, updateOndemandClusterToPeriodRequest.clusterId)
            && Objects.equals(this.body, updateOndemandClusterToPeriodRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOndemandClusterToPeriodRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
