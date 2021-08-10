package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PostPaidServerEip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iptype")

    private String iptype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private PostPaidServerEipBandwidth bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendparam")

    private PostPaidServerEipExtendParam extendparam;

    public PostPaidServerEip withIptype(String iptype) {
        this.iptype = iptype;
        return this;
    }

    /** 弹性IP地址类型。 详情请参见“[申请弹性公网IP](https://support.huaweicloud.com/api-eip/eip_api_0001.html)”章节的“publicip”字段说明。
     * 
     * @return iptype */
    public String getIptype() {
        return iptype;
    }

    public void setIptype(String iptype) {
        this.iptype = iptype;
    }

    public PostPaidServerEip withBandwidth(PostPaidServerEipBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public PostPaidServerEip withBandwidth(Consumer<PostPaidServerEipBandwidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new PostPaidServerEipBandwidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /** Get bandwidth
     * 
     * @return bandwidth */
    public PostPaidServerEipBandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(PostPaidServerEipBandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    public PostPaidServerEip withExtendparam(PostPaidServerEipExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public PostPaidServerEip withExtendparam(Consumer<PostPaidServerEipExtendParam> extendparamSetter) {
        if (this.extendparam == null) {
            this.extendparam = new PostPaidServerEipExtendParam();
            extendparamSetter.accept(this.extendparam);
        }

        return this;
    }

    /** Get extendparam
     * 
     * @return extendparam */
    public PostPaidServerEipExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(PostPaidServerEipExtendParam extendparam) {
        this.extendparam = extendparam;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPaidServerEip postPaidServerEip = (PostPaidServerEip) o;
        return Objects.equals(this.iptype, postPaidServerEip.iptype)
            && Objects.equals(this.bandwidth, postPaidServerEip.bandwidth)
            && Objects.equals(this.extendparam, postPaidServerEip.extendparam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iptype, bandwidth, extendparam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerEip {\n");
        sb.append("    iptype: ").append(toIndentedString(iptype)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
