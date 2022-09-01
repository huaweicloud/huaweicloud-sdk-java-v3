package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DmsKafkaInfo
 */
public class DmsKafkaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    @JacksonXmlProperty(localName = "addr")

    private List<String> addr = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_fade_enable")

    @JacksonXmlProperty(localName = "order_fade_enable")

    private Boolean orderFadeEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_fade_cache")

    @JacksonXmlProperty(localName = "order_fade_cache")

    private Long orderFadeCache;

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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DmsKafkaInfo dmsKafkaInfo = (DmsKafkaInfo) o;
        return Objects.equals(this.addr, dmsKafkaInfo.addr)
            && Objects.equals(this.orderFadeEnable, dmsKafkaInfo.orderFadeEnable)
            && Objects.equals(this.orderFadeCache, dmsKafkaInfo.orderFadeCache);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addr, orderFadeEnable, orderFadeCache);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DmsKafkaInfo {\n");
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
