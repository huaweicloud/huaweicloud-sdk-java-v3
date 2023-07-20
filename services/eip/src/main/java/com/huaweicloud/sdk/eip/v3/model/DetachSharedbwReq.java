package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 共享带宽移出弹性公网IP请求参数
 */
public class DetachSharedbwReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private DetachSharedbwReqPublicip publicip;

    public DetachSharedbwReq withPublicip(DetachSharedbwReqPublicip publicip) {
        this.publicip = publicip;
        return this;
    }

    public DetachSharedbwReq withPublicip(Consumer<DetachSharedbwReqPublicip> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new DetachSharedbwReqPublicip();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public DetachSharedbwReqPublicip getPublicip() {
        return publicip;
    }

    public void setPublicip(DetachSharedbwReqPublicip publicip) {
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
        DetachSharedbwReq that = (DetachSharedbwReq) obj;
        return Objects.equals(this.publicip, that.publicip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachSharedbwReq {\n");
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
