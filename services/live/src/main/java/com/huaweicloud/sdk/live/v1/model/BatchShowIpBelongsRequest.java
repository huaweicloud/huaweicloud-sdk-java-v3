package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchShowIpBelongsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private List<String> ip = null;

    public BatchShowIpBelongsRequest withIp(List<String> ip) {
        this.ip = ip;
        return this;
    }

    public BatchShowIpBelongsRequest addIpItem(String ipItem) {
        if (this.ip == null) {
            this.ip = new ArrayList<>();
        }
        this.ip.add(ipItem);
        return this;
    }

    public BatchShowIpBelongsRequest withIp(Consumer<List<String>> ipSetter) {
        if (this.ip == null) {
            this.ip = new ArrayList<>();
        }
        ipSetter.accept(this.ip);
        return this;
    }

    /**
     * IP地址列表，最多20个。
     * @return ip
     */
    public List<String> getIp() {
        return ip;
    }

    public void setIp(List<String> ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchShowIpBelongsRequest that = (BatchShowIpBelongsRequest) obj;
        return Objects.equals(this.ip, that.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowIpBelongsRequest {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
