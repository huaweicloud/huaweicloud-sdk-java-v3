package com.huaweicloud.sdk.iotedge.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class InvokeKubeApiRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forward-Target")

    private String xForwardTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forward-Headers")

    private String xForwardHeaders;

    public InvokeKubeApiRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 边缘集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public InvokeKubeApiRequest withXForwardTarget(String xForwardTarget) {
        this.xForwardTarget = xForwardTarget;
        return this;
    }

    /**
     * 透传的k8s的API，{method} {uri}?{query_param}
     * @return xForwardTarget
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forward-Target")
    public String getXForwardTarget() {
        return xForwardTarget;
    }

    public void setXForwardTarget(String xForwardTarget) {
        this.xForwardTarget = xForwardTarget;
    }

    public InvokeKubeApiRequest withXForwardHeaders(String xForwardHeaders) {
        this.xForwardHeaders = xForwardHeaders;
        return this;
    }

    /**
     * 透传的API的header
     * @return xForwardHeaders
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forward-Headers")
    public String getXForwardHeaders() {
        return xForwardHeaders;
    }

    public void setXForwardHeaders(String xForwardHeaders) {
        this.xForwardHeaders = xForwardHeaders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvokeKubeApiRequest that = (InvokeKubeApiRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.xForwardTarget, that.xForwardTarget)
            && Objects.equals(this.xForwardHeaders, that.xForwardHeaders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, xForwardTarget, xForwardHeaders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvokeKubeApiRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    xForwardTarget: ").append(toIndentedString(xForwardTarget)).append("\n");
        sb.append("    xForwardHeaders: ").append(toIndentedString(xForwardHeaders)).append("\n");
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
