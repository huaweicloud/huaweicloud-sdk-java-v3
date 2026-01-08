package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * clone出的监听器信息。
 */
public class CloneListenerResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_ranges")

    private List<ResPortRange> portRanges = null;

    public CloneListenerResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：新监听器ID。 **取值范围**：标准的UUID格式，长度为36个字符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CloneListenerResp withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * **参数解释**：目的负载均衡器ID。 **取值范围**：标准的UUID格式，长度为36个字符。
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public CloneListenerResp withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * **参数解释**：新监听器监听端口。 **取值范围**：1-65535
     * minimum: 1
     * maximum: 65535
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    public CloneListenerResp withPortRanges(List<ResPortRange> portRanges) {
        this.portRanges = portRanges;
        return this;
    }

    public CloneListenerResp addPortRangesItem(ResPortRange portRangesItem) {
        if (this.portRanges == null) {
            this.portRanges = new ArrayList<>();
        }
        this.portRanges.add(portRangesItem);
        return this;
    }

    public CloneListenerResp withPortRanges(Consumer<List<ResPortRange>> portRangesSetter) {
        if (this.portRanges == null) {
            this.portRanges = new ArrayList<>();
        }
        portRangesSetter.accept(this.portRanges);
        return this;
    }

    /**
     * **参数解释**：端口监听范围（闭区间)。
     * @return portRanges
     */
    public List<ResPortRange> getPortRanges() {
        return portRanges;
    }

    public void setPortRanges(List<ResPortRange> portRanges) {
        this.portRanges = portRanges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloneListenerResp that = (CloneListenerResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.loadbalancerId, that.loadbalancerId)
            && Objects.equals(this.protocolPort, that.protocolPort) && Objects.equals(this.portRanges, that.portRanges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, loadbalancerId, protocolPort, portRanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneListenerResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    portRanges: ").append(toIndentedString(portRanges)).append("\n");
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
