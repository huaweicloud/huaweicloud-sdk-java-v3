package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteLoadbalancerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    @JacksonXmlProperty(localName = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cascade")

    @JacksonXmlProperty(localName = "cascade")

    private Boolean cascade;

    public DeleteLoadbalancerRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * 负载均衡器id
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public DeleteLoadbalancerRequest withCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }

    /**
     * （不再支持）级联删除负载均衡器
     * @return cascade
     */
    public Boolean getCascade() {
        return cascade;
    }

    public void setCascade(Boolean cascade) {
        this.cascade = cascade;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteLoadbalancerRequest deleteLoadbalancerRequest = (DeleteLoadbalancerRequest) o;
        return Objects.equals(this.loadbalancerId, deleteLoadbalancerRequest.loadbalancerId)
            && Objects.equals(this.cascade, deleteLoadbalancerRequest.cascade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancerId, cascade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLoadbalancerRequest {\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
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
