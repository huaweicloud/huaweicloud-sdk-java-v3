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

    public VpcsData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * vpc的ID，uuid形式的一个资源标识。
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
     * vpc下入站终端节点的数量。
     * @return inboundEndpointCount
     */
    public Integer getInboundEndpointCount() {
        return inboundEndpointCount;
    }

    public void setInboundEndpointCount(Integer inboundEndpointCount) {
        this.inboundEndpointCount = inboundEndpointCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcsData vpcsData = (VpcsData) o;
        return Objects.equals(this.id, vpcsData.id)
            && Objects.equals(this.inboundEndpointCount, vpcsData.inboundEndpointCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inboundEndpointCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcsData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inboundEndpointCount: ").append(toIndentedString(inboundEndpointCount)).append("\n");
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
