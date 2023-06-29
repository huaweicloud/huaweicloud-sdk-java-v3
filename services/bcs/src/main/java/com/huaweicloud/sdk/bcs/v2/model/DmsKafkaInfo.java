package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DmsKafkaInfo
 */
public class DmsKafkaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_detail")

    private String statusDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_fade_enabled")

    private Boolean orderFadeEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private List<String> addr = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_fade_enable")

    private Boolean orderFadeEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_fade_cache")

    private Long orderFadeCache;

    public DmsKafkaInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DmsKafkaInfo withStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    /**
     * 状态详情
     * @return statusDetail
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public DmsKafkaInfo withOrderFadeEnabled(Boolean orderFadeEnabled) {
        this.orderFadeEnabled = orderFadeEnabled;
        return this;
    }

    /**
     * 是否允许order老化
     * @return orderFadeEnabled
     */
    public Boolean getOrderFadeEnabled() {
        return orderFadeEnabled;
    }

    public void setOrderFadeEnabled(Boolean orderFadeEnabled) {
        this.orderFadeEnabled = orderFadeEnabled;
    }

    public DmsKafkaInfo withAddr(List<String> addr) {
        this.addr = addr;
        return this;
    }

    public DmsKafkaInfo addAddrItem(String addrItem) {
        if (this.addr == null) {
            this.addr = new ArrayList<>();
        }
        this.addr.add(addrItem);
        return this;
    }

    public DmsKafkaInfo withAddr(Consumer<List<String>> addrSetter) {
        if (this.addr == null) {
            this.addr = new ArrayList<>();
        }
        addrSetter.accept(this.addr);
        return this;
    }

    /**
     * Kafka连接地址
     * @return addr
     */
    public List<String> getAddr() {
        return addr;
    }

    public void setAddr(List<String> addr) {
        this.addr = addr;
    }

    public DmsKafkaInfo withOrderFadeEnable(Boolean orderFadeEnable) {
        this.orderFadeEnable = orderFadeEnable;
        return this;
    }

    /**
     * Kafka模式下，是否开启共识节点老化
     * @return orderFadeEnable
     */
    public Boolean getOrderFadeEnable() {
        return orderFadeEnable;
    }

    public void setOrderFadeEnable(Boolean orderFadeEnable) {
        this.orderFadeEnable = orderFadeEnable;
    }

    public DmsKafkaInfo withOrderFadeCache(Long orderFadeCache) {
        this.orderFadeCache = orderFadeCache;
        return this;
    }

    /**
     * Kafka模式下，开启共识节点后的老化阈值
     * @return orderFadeCache
     */
    public Long getOrderFadeCache() {
        return orderFadeCache;
    }

    public void setOrderFadeCache(Long orderFadeCache) {
        this.orderFadeCache = orderFadeCache;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DmsKafkaInfo that = (DmsKafkaInfo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.statusDetail, that.statusDetail)
            && Objects.equals(this.orderFadeEnabled, that.orderFadeEnabled) && Objects.equals(this.addr, that.addr)
            && Objects.equals(this.orderFadeEnable, that.orderFadeEnable)
            && Objects.equals(this.orderFadeCache, that.orderFadeCache);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, statusDetail, orderFadeEnabled, addr, orderFadeEnable, orderFadeCache);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DmsKafkaInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
        sb.append("    orderFadeEnabled: ").append(toIndentedString(orderFadeEnabled)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    orderFadeEnable: ").append(toIndentedString(orderFadeEnable)).append("\n");
        sb.append("    orderFadeCache: ").append(toIndentedString(orderFadeCache)).append("\n");
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
