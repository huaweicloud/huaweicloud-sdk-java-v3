package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VpcsData
 */
public class VpcsData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inbound_endpoint_count")

    private Integer inboundEndpointCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outbound_endpoint_count")

    private Integer outboundEndpointCount;

    public VpcsData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * VPC的ID，UUID形式的一个资源标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VpcsData withInboundEndpointCount(Integer inboundEndpointCount) {
        this.inboundEndpointCount = inboundEndpointCount;
        return this;
    }

    /**
     * VPC下入站终端节点的数量。
     * @return inboundEndpointCount
     */
    public Integer getInboundEndpointCount() {
        return inboundEndpointCount;
    }

    public void setInboundEndpointCount(Integer inboundEndpointCount) {
        this.inboundEndpointCount = inboundEndpointCount;
    }

    public VpcsData withOutboundEndpointCount(Integer outboundEndpointCount) {
        this.outboundEndpointCount = outboundEndpointCount;
        return this;
    }

    /**
     * VPC下出站终端节点的数量。
     * @return outboundEndpointCount
     */
    public Integer getOutboundEndpointCount() {
        return outboundEndpointCount;
    }

    public void setOutboundEndpointCount(Integer outboundEndpointCount) {
        this.outboundEndpointCount = outboundEndpointCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpcsData that = (VpcsData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.inboundEndpointCount, that.inboundEndpointCount)
            && Objects.equals(this.outboundEndpointCount, that.outboundEndpointCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inboundEndpointCount, outboundEndpointCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcsData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inboundEndpointCount: ").append(toIndentedString(inboundEndpointCount)).append("\n");
        sb.append("    outboundEndpointCount: ").append(toIndentedString(outboundEndpointCount)).append("\n");
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
