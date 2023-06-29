package com.huaweicloud.sdk.ief.v1.model;

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
public class ListEdgeNodeCertsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_certs")

    private List<NodeCert> nodeCerts = null;

    public ListEdgeNodeCertsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 节点上已关联的应用证书和设备证书的数目
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListEdgeNodeCertsResponse withNodeCerts(List<NodeCert> nodeCerts) {
        this.nodeCerts = nodeCerts;
        return this;
    }

    public ListEdgeNodeCertsResponse addNodeCertsItem(NodeCert nodeCertsItem) {
        if (this.nodeCerts == null) {
            this.nodeCerts = new ArrayList<>();
        }
        this.nodeCerts.add(nodeCertsItem);
        return this;
    }

    public ListEdgeNodeCertsResponse withNodeCerts(Consumer<List<NodeCert>> nodeCertsSetter) {
        if (this.nodeCerts == null) {
            this.nodeCerts = new ArrayList<>();
        }
        nodeCertsSetter.accept(this.nodeCerts);
        return this;
    }

    /**
     * 节点上的证书列表
     * @return nodeCerts
     */
    public List<NodeCert> getNodeCerts() {
        return nodeCerts;
    }

    public void setNodeCerts(List<NodeCert> nodeCerts) {
        this.nodeCerts = nodeCerts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEdgeNodeCertsResponse that = (ListEdgeNodeCertsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.nodeCerts, that.nodeCerts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, nodeCerts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeNodeCertsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    nodeCerts: ").append(toIndentedString(nodeCerts)).append("\n");
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
