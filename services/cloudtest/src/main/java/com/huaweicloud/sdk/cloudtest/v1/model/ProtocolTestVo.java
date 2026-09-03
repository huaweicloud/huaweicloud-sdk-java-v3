package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProtocolTestVo
 */
public class ProtocolTestVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http")

    private HttpVo http;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ping")

    private List<PingVo> ping = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "point_host")

    private List<String> pointHost = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    public ProtocolTestVo withHttp(HttpVo http) {
        this.http = http;
        return this;
    }

    public ProtocolTestVo withHttp(Consumer<HttpVo> httpSetter) {
        if (this.http == null) {
            this.http = new HttpVo();
            httpSetter.accept(this.http);
        }

        return this;
    }

    /**
     * Get http
     * @return http
     */
    public HttpVo getHttp() {
        return http;
    }

    public void setHttp(HttpVo http) {
        this.http = http;
    }

    public ProtocolTestVo withPing(List<PingVo> ping) {
        this.ping = ping;
        return this;
    }

    public ProtocolTestVo addPingItem(PingVo pingItem) {
        if (this.ping == null) {
            this.ping = new ArrayList<>();
        }
        this.ping.add(pingItem);
        return this;
    }

    public ProtocolTestVo withPing(Consumer<List<PingVo>> pingSetter) {
        if (this.ping == null) {
            this.ping = new ArrayList<>();
        }
        pingSetter.accept(this.ping);
        return this;
    }

    /**
     * ping拨测任务信息
     * @return ping
     */
    public List<PingVo> getPing() {
        return ping;
    }

    public void setPing(List<PingVo> ping) {
        this.ping = ping;
    }

    public ProtocolTestVo withPointHost(List<String> pointHost) {
        this.pointHost = pointHost;
        return this;
    }

    public ProtocolTestVo addPointHostItem(String pointHostItem) {
        if (this.pointHost == null) {
            this.pointHost = new ArrayList<>();
        }
        this.pointHost.add(pointHostItem);
        return this;
    }

    public ProtocolTestVo withPointHost(Consumer<List<String>> pointHostSetter) {
        if (this.pointHost == null) {
            this.pointHost = new ArrayList<>();
        }
        pointHostSetter.accept(this.pointHost);
        return this;
    }

    /**
     * ping/http节点地址
     * @return pointHost
     */
    public List<String> getPointHost() {
        return pointHost;
    }

    public void setPointHost(List<String> pointHost) {
        this.pointHost = pointHost;
    }

    public ProtocolTestVo withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtocolTestVo that = (ProtocolTestVo) obj;
        return Objects.equals(this.http, that.http) && Objects.equals(this.ping, that.ping)
            && Objects.equals(this.pointHost, that.pointHost) && Objects.equals(this.protocol, that.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(http, ping, pointHost, protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtocolTestVo {\n");
        sb.append("    http: ").append(toIndentedString(http)).append("\n");
        sb.append("    ping: ").append(toIndentedString(ping)).append("\n");
        sb.append("    pointHost: ").append(toIndentedString(pointHost)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
