package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Out2in
 */
public class Out2in {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ip")

    private List<ItemVO> dstIp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_port")

    private List<ItemVO> dstPort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ip")

    private List<ItemVO> srcIp = null;

    public Out2in withDstIp(List<ItemVO> dstIp) {
        this.dstIp = dstIp;
        return this;
    }

    public Out2in addDstIpItem(ItemVO dstIpItem) {
        if (this.dstIp == null) {
            this.dstIp = new ArrayList<>();
        }
        this.dstIp.add(dstIpItem);
        return this;
    }

    public Out2in withDstIp(Consumer<List<ItemVO>> dstIpSetter) {
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

    public Out2in withDstPort(List<ItemVO> dstPort) {
        this.dstPort = dstPort;
        return this;
    }

    public Out2in addDstPortItem(ItemVO dstPortItem) {
        if (this.dstPort == null) {
            this.dstPort = new ArrayList<>();
        }
        this.dstPort.add(dstPortItem);
        return this;
    }

    public Out2in withDstPort(Consumer<List<ItemVO>> dstPortSetter) {
        if (this.dstPort == null) {
            this.dstPort = new ArrayList<>();
        }
        dstPortSetter.accept(this.dstPort);
        return this;
    }

    /**
     * **参数解释**： TOP开放端口 **取值范围**： 不涉及
     * @return dstPort
     */
    public List<ItemVO> getDstPort() {
        return dstPort;
    }

    public void setDstPort(List<ItemVO> dstPort) {
        this.dstPort = dstPort;
    }

    public Out2in withSrcIp(List<ItemVO> srcIp) {
        this.srcIp = srcIp;
        return this;
    }

    public Out2in addSrcIpItem(ItemVO srcIpItem) {
        if (this.srcIp == null) {
            this.srcIp = new ArrayList<>();
        }
        this.srcIp.add(srcIpItem);
        return this;
    }

    public Out2in withSrcIp(Consumer<List<ItemVO>> srcIpSetter) {
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
        Out2in that = (Out2in) obj;
        return Objects.equals(this.dstIp, that.dstIp) && Objects.equals(this.dstPort, that.dstPort)
            && Objects.equals(this.srcIp, that.srcIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dstIp, dstPort, srcIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Out2in {\n");
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
