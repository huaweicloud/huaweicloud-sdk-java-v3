package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云堡垒机实例弹性公网IP信息。可填写null值
 */
public class PublicIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_eip")

    private String publicEip;

    public PublicIp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 弹性IP和EIP只能有一个，弹性IP或EIP的ID。
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
     * 弹性IP地址。
     * @return publicEip
     */
    public String getPublicEip() {
        return publicEip;
    }

    public void setPublicEip(String publicEip) {
        this.publicEip = publicEip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicIp that = (PublicIp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.publicEip, that.publicEip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, publicEip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    publicEip: ").append(toIndentedString(publicEip)).append("\n");
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
