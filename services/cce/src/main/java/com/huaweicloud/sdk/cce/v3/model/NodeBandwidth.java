package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class NodeBandwidth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargemode")

    @JacksonXmlProperty(localName = "chargemode")

    private String chargemode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sharetype")

    @JacksonXmlProperty(localName = "sharetype")

    private String sharetype;

    public NodeBandwidth withChargemode(String chargemode) {
        this.chargemode = chargemode;
        return this;
    }

    /**
     * 带宽的计费类型：  - 未传该字段，表示按带宽计费。 - 字段值为空，表示按带宽计费。  - 字段值为“traffic”，表示按流量计费。  - 字段为其它值，会导致创建云服务器失败。  > - 按带宽计费：按公网传输速率（单位为Mbps）计费。当您的带宽利用率高于10%时，建议优先选择按带宽计费。 > - 按流量计费：只允许在创建按需节点时指定，按公网传输的数据总量（单位为GB）计费。当您的带宽利用率低于10%时，建议优先选择按流量计费。 
     * @return chargemode
     */
    public String getChargemode() {
        return chargemode;
    }

    public void setChargemode(String chargemode) {
        this.chargemode = chargemode;
    }

    public NodeBandwidth withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 带宽大小，取值请参见取值请参见申请EIP接口中bandwidth.size说明。 [链接请参见[申请EIP](https://support.huaweicloud.com/api-eip/eip_api_0001.html)](tag:hws) [链接请参见[申请EIP](https://support.huaweicloud.com/intl/zh-cn/api-eip/eip_api_0001.html)](tag:hws_hk) 
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public NodeBandwidth withSharetype(String sharetype) {
        this.sharetype = sharetype;
        return this;
    }

    /**
     * 带宽的共享类型，共享类型枚举：PER，表示独享。WHOLE，表示共享。
     * @return sharetype
     */
    public String getSharetype() {
        return sharetype;
    }

    public void setSharetype(String sharetype) {
        this.sharetype = sharetype;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeBandwidth nodeBandwidth = (NodeBandwidth) o;
        return Objects.equals(this.chargemode, nodeBandwidth.chargemode)
            && Objects.equals(this.size, nodeBandwidth.size) && Objects.equals(this.sharetype, nodeBandwidth.sharetype);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargemode, size, sharetype);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeBandwidth {\n");
        sb.append("    chargemode: ").append(toIndentedString(chargemode)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sharetype: ").append(toIndentedString(sharetype)).append("\n");
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
