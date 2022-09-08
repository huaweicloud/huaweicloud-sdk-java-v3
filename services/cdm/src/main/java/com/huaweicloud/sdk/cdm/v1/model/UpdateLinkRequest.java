package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateLinkRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link_name")

    private String linkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CdmCreateAndUpdateLinkReq body;

    public UpdateLinkRequest withClusterId(String clusterId) {
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

    public UpdateLinkRequest withLinkName(String linkName) {
        this.linkName = linkName;
        return this;
    }

    /**
     * 连接名称
     * @return linkName
     */
    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public UpdateLinkRequest withBody(CdmCreateAndUpdateLinkReq body) {
        this.body = body;
        return this;
    }

    public UpdateLinkRequest withBody(Consumer<CdmCreateAndUpdateLinkReq> bodySetter) {
        if (this.body == null) {
            this.body = new CdmCreateAndUpdateLinkReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CdmCreateAndUpdateLinkReq getBody() {
        return body;
    }

    public void setBody(CdmCreateAndUpdateLinkReq body) {
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
        UpdateLinkRequest updateLinkRequest = (UpdateLinkRequest) o;
        return Objects.equals(this.clusterId, updateLinkRequest.clusterId)
            && Objects.equals(this.linkName, updateLinkRequest.linkName)
            && Objects.equals(this.body, updateLinkRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, linkName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLinkRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    linkName: ").append(toIndentedString(linkName)).append("\n");
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
