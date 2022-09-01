package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 公网访问信息。
 */
public class CreateClusterPublicIpReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    @JacksonXmlProperty(localName = "eip")

    private CreateClusterPublicEip eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elbWhiteListReq")

    @JacksonXmlProperty(localName = "elbWhiteListReq")

    private CreateClusterElbWhiteList elbWhiteListReq;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicBindType")

    @JacksonXmlProperty(localName = "publicBindType")

    private String publicBindType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eipId")

    @JacksonXmlProperty(localName = "eipId")

    private String eipId;

    public CreateClusterPublicIpReq withEip(CreateClusterPublicEip eip) {
        this.eip = eip;
        return this;
    }

    public CreateClusterPublicIpReq withEip(Consumer<CreateClusterPublicEip> eipSetter) {
        if (this.eip == null) {
            this.eip = new CreateClusterPublicEip();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public CreateClusterPublicEip getEip() {
        return eip;
    }

    public void setEip(CreateClusterPublicEip eip) {
        this.eip = eip;
    }

    public CreateClusterPublicIpReq withElbWhiteListReq(CreateClusterElbWhiteList elbWhiteListReq) {
        this.elbWhiteListReq = elbWhiteListReq;
        return this;
    }

    public CreateClusterPublicIpReq withElbWhiteListReq(Consumer<CreateClusterElbWhiteList> elbWhiteListReqSetter) {
        if (this.elbWhiteListReq == null) {
            this.elbWhiteListReq = new CreateClusterElbWhiteList();
            elbWhiteListReqSetter.accept(this.elbWhiteListReq);
        }

        return this;
    }

    /**
     * Get elbWhiteListReq
     * @return elbWhiteListReq
     */
    public CreateClusterElbWhiteList getElbWhiteListReq() {
        return elbWhiteListReq;
    }

    public void setElbWhiteListReq(CreateClusterElbWhiteList elbWhiteListReq) {
        this.elbWhiteListReq = elbWhiteListReq;
    }

    public CreateClusterPublicIpReq withPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
        return this;
    }

    /**
     * 是否自动绑定弹性公网IP。auto_assign为自动分配，bind_existing为绑定已有IP，需要填写eipId字段。
     * @return publicBindType
     */
    public String getPublicBindType() {
        return publicBindType;
    }

    public void setPublicBindType(String publicBindType) {
        this.publicBindType = publicBindType;
    }

    public CreateClusterPublicIpReq withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * 弹性公网IP的ID。
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterPublicIpReq createClusterPublicIpReq = (CreateClusterPublicIpReq) o;
        return Objects.equals(this.eip, createClusterPublicIpReq.eip)
            && Objects.equals(this.elbWhiteListReq, createClusterPublicIpReq.elbWhiteListReq)
            && Objects.equals(this.publicBindType, createClusterPublicIpReq.publicBindType)
            && Objects.equals(this.eipId, createClusterPublicIpReq.eipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eip, elbWhiteListReq, publicBindType, eipId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterPublicIpReq {\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    elbWhiteListReq: ").append(toIndentedString(elbWhiteListReq)).append("\n");
        sb.append("    publicBindType: ").append(toIndentedString(publicBindType)).append("\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
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
