package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAlterKibanaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    @JacksonXmlProperty(localName = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdatePublicKibanaBandwidthReq body;

    public UpdateAlterKibanaRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定待修改kibana公网带宽的集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateAlterKibanaRequest withBody(UpdatePublicKibanaBandwidthReq body) {
        this.body = body;
        return this;
    }

    public UpdateAlterKibanaRequest withBody(Consumer<UpdatePublicKibanaBandwidthReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePublicKibanaBandwidthReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePublicKibanaBandwidthReq getBody() {
        return body;
    }

    public void setBody(UpdatePublicKibanaBandwidthReq body) {
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
        UpdateAlterKibanaRequest updateAlterKibanaRequest = (UpdateAlterKibanaRequest) o;
        return Objects.equals(this.clusterId, updateAlterKibanaRequest.clusterId)
            && Objects.equals(this.body, updateAlterKibanaRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlterKibanaRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
