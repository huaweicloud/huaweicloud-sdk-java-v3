package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UnBindPublicReq
 */
public class UnBindPublicReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private UnBindPublicReqEipReq eip;

    public UnBindPublicReq withEip(UnBindPublicReqEipReq eip) {
        this.eip = eip;
        return this;
    }

    public UnBindPublicReq withEip(Consumer<UnBindPublicReqEipReq> eipSetter) {
        if (this.eip == null) {
            this.eip = new UnBindPublicReqEipReq();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public UnBindPublicReqEipReq getEip() {
        return eip;
    }

    public void setEip(UnBindPublicReqEipReq eip) {
        this.eip = eip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnBindPublicReq that = (UnBindPublicReq) obj;
        return Objects.equals(this.eip, that.eip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnBindPublicReq {\n");
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
