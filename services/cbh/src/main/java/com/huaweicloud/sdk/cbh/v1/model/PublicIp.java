package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 弹性IP
 */
public class PublicIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_eip")

    private String publicEip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private Eip eip;

    public PublicIp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 已分配的弹性IP 和EIP只能有一个
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicIp withPublicEip(String publicEip) {
        this.publicEip = publicEip;
        return this;
    }

    /**
     * 已分配的弹性IP的地址Address
     * @return publicEip
     */
    public String getPublicEip() {
        return publicEip;
    }

    public void setPublicEip(String publicEip) {
        this.publicEip = publicEip;
    }

    public PublicIp withEip(Eip eip) {
        this.eip = eip;
        return this;
    }

    public PublicIp withEip(Consumer<Eip> eipSetter) {
        if (this.eip == null) {
            this.eip = new Eip();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public Eip getEip() {
        return eip;
    }

    public void setEip(Eip eip) {
        this.eip = eip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicIp publicIp = (PublicIp) o;
        return Objects.equals(this.id, publicIp.id) && Objects.equals(this.publicEip, publicIp.publicEip)
            && Objects.equals(this.eip, publicIp.eip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, publicEip, eip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    publicEip: ").append(toIndentedString(publicEip)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
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
