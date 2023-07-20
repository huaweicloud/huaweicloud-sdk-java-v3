package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 共享带宽加入弹性公网IP请求参数
 */
public class AttachSharebwReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private AttachSharebwDict publicip;

    public AttachSharebwReq withPublicip(AttachSharebwDict publicip) {
        this.publicip = publicip;
        return this;
    }

    public AttachSharebwReq withPublicip(Consumer<AttachSharebwDict> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new AttachSharebwDict();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public AttachSharebwDict getPublicip() {
        return publicip;
    }

    public void setPublicip(AttachSharebwDict publicip) {
        this.publicip = publicip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachSharebwReq that = (AttachSharebwReq) obj;
        return Objects.equals(this.publicip, that.publicip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachSharebwReq {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
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
