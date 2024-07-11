package com.huaweicloud.sdk.rabbitmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowVhostDetailResp
 */
public class ShowVhostDetailResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracing")

    private Boolean tracing;

    public ShowVhostDetailResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Vhost名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowVhostDetailResp withTracing(Boolean tracing) {
        this.tracing = tracing;
        return this;
    }

    /**
     * 是否开启消息轨迹[（AMQP版本不涉及此字段）](tag:hws,hws_hk)。
     * @return tracing
     */
    public Boolean getTracing() {
        return tracing;
    }

    public void setTracing(Boolean tracing) {
        this.tracing = tracing;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVhostDetailResp that = (ShowVhostDetailResp) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.tracing, that.tracing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tracing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVhostDetailResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tracing: ").append(toIndentedString(tracing)).append("\n");
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
