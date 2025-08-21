package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * In2Out
 */
public class In2Out {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_host")

    private List<ItemVO> dstHost = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private List<ItemVO> dstIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private List<ItemVO> dstPort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private List<ItemVO> srcIp = null;

    public In2Out withDstHost(List<ItemVO> dstHost) {
        this.dstHost = dstHost;
        return this;
    }

    public In2Out addDstHostItem(ItemVO dstHostItem) {
        if (this.dstHost == null) {
            this.dstHost = new ArrayList<>();
        }
        this.dstHost.add(dstHostItem);
        return this;
    }

    public In2Out withDstHost(Consumer<List<ItemVO>> dstHostSetter) {
        if (this.dstHost == null) {
            this.dstHost = new ArrayList<>();
        }
        dstHostSetter.accept(this.dstHost);
        return this;
    }

    /**
     * **参数解释**： TOP访问域名 **取值范围**： 不涉及
     * @return dstHost
     */
    public List<ItemVO> getDstHost() {
        return dstHost;
    }

    public void setDstHost(List<ItemVO> dstHost) {
        this.dstHost = dstHost;
    }

    public In2Out withDstIp(List<ItemVO> dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    public In2Out addDstIpItem(ItemVO dstIpItem) {
        if (this.dstIp == null) {
            this.dstIp = new ArrayList<>();
        }
        this.dstIp.add(dstIpItem);
        return this;
    }

    public In2Out withDstIp(Consumer<List<ItemVO>> dstIpSetter) {
        if (this.dstIp == null) {
            this.dstIp = new ArrayList<>();
        }
        dstIpSetter.accept(this.dstIp);
        return this;
    }

    /**
     * **参数解释**： TOP访问目的IP **取值范围**： 不涉及
     * @return dstIp
     */
    public List<ItemVO> getDstIp() {
        return dstIp;
    }

    public void setDstIp(List<ItemVO> dstIp) {
        this.dstIp = dstIp;
    }

    public In2Out withDstPort(List<ItemVO> dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    public In2Out addDstPortItem(ItemVO dstPortItem) {
        if (this.dstPort == null) {
            this.dstPort = new ArrayList<>();
        }
        this.dstPort.add(dstPortItem);
        return this;
    }

    public In2Out withDstPort(Consumer<List<ItemVO>> dstPortSetter) {
        if (this.dstPort == null) {
            this.dstPort = new ArrayList<>();
        }
        dstPortSetter.accept(this.dstPort);
        return this;
    }

    /**
     * **参数解释**： TOP访问端口 **取值范围**： 不涉及
     * @return dstPort
     */
    public List<ItemVO> getDstPort() {
        return dstPort;
    }

    public void setDstPort(List<ItemVO> dstPort) {
        this.dstPort = dstPort;
    }

    public In2Out withSrcIp(List<ItemVO> srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    public In2Out addSrcIpItem(ItemVO srcIpItem) {
        if (this.srcIp == null) {
            this.srcIp = new ArrayList<>();
        }
        this.srcIp.add(srcIpItem);
        return this;
    }

    public In2Out withSrcIp(Consumer<List<ItemVO>> srcIpSetter) {
        if (this.srcIp == null) {
            this.srcIp = new ArrayList<>();
        }
        srcIpSetter.accept(this.srcIp);
        return this;
    }

    /**
     * **参数解释**： TOP访问源IP **取值范围**： 不涉及
     * @return srcIp
     */
    public List<ItemVO> getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(List<ItemVO> srcIp) {
        this.srcIp = srcIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        In2Out that = (In2Out) obj;
        return Objects.equals(this.dstHost, that.dstHost) && Objects.equals(this.dstIp, that.dstIp)
            && Objects.equals(this.dstPort, that.dstPort) && Objects.equals(this.srcIp, that.srcIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dstHost, dstIp, dstPort, srcIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class In2Out {\n");
        sb.append("    dstHost: ").append(toIndentedString(dstHost)).append("\n");
        sb.append("    dstIp: ").append(toIndentedString(dstIp)).append("\n");
        sb.append("    dstPort: ").append(toIndentedString(dstPort)).append("\n");
        sb.append("    srcIp: ").append(toIndentedString(srcIp)).append("\n");
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
