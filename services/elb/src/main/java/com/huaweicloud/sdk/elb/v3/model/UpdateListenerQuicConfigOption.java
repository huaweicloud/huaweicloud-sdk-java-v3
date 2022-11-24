package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 当前监听器关联的QUIC监听器配置信息，仅protocol为HTTPS时有效。  对于TCP/UDP/HTTP/QUIC监听器，若该字段非空则报错。  &gt; 客户端向服务端发送正常的HTTP协议请求并携带了支持QUIC协议的信息。 如果服务端监听器开启了升级QUIC，那么就会在响应头中加入服务端支持的QUIC端口和版本信息。 客户端再次请求时会同时发送TCP(HTTPS)和UDP(QUIC)请求，若QUIC请求成功，则后续继续使用QUIC交互。  [不支持QUIC协议。](tag:hws_eu,g42,hk_g42,hcso_dt)
 */
public class UpdateListenerQuicConfigOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quic_listener_id")

    private String quicListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_quic_upgrade")

    private Boolean enableQuicUpgrade;

    public UpdateListenerQuicConfigOption withQuicListenerId(String quicListenerId) {
        this.quicListenerId = quicListenerId;
        return this;
    }

    /**
     * 监听器关联的QUIC监听器ID。指定的listener id必须已存在，且协议类型为QUIC，不能指定为null，否则与enable_quic_upgrade冲突。
     * @return quicListenerId
     */
    public String getQuicListenerId() {
        return quicListenerId;
    }

    public void setQuicListenerId(String quicListenerId) {
        this.quicListenerId = quicListenerId;
    }

    public UpdateListenerQuicConfigOption withEnableQuicUpgrade(Boolean enableQuicUpgrade) {
        this.enableQuicUpgrade = enableQuicUpgrade;
        return this;
    }

    /**
     * QUIC升级的开启状态。 True:开启QUIC升级； Flase：关闭QUIC升级； 开启HTTPS监听器升级QUIC监听器能力
     * @return enableQuicUpgrade
     */
    public Boolean getEnableQuicUpgrade() {
        return enableQuicUpgrade;
    }

    public void setEnableQuicUpgrade(Boolean enableQuicUpgrade) {
        this.enableQuicUpgrade = enableQuicUpgrade;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateListenerQuicConfigOption updateListenerQuicConfigOption = (UpdateListenerQuicConfigOption) o;
        return Objects.equals(this.quicListenerId, updateListenerQuicConfigOption.quicListenerId)
            && Objects.equals(this.enableQuicUpgrade, updateListenerQuicConfigOption.enableQuicUpgrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quicListenerId, enableQuicUpgrade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateListenerQuicConfigOption {\n");
        sb.append("    quicListenerId: ").append(toIndentedString(quicListenerId)).append("\n");
        sb.append("    enableQuicUpgrade: ").append(toIndentedString(enableQuicUpgrade)).append("\n");
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
