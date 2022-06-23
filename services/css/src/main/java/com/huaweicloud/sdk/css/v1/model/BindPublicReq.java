package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BindPublicReq
 */
public class BindPublicReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private BindPublicReqEip eip;

    public BindPublicReq withEip(BindPublicReqEip eip) {
        this.eip = eip;
        return this;
    }

    public BindPublicReq withEip(Consumer<BindPublicReqEip> eipSetter) {
        if (this.eip == null) {
            this.eip = new BindPublicReqEip();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public BindPublicReqEip getEip() {
        return eip;
    }

    public void setEip(BindPublicReqEip eip) {
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
        BindPublicReq bindPublicReq = (BindPublicReq) o;
        return Objects.equals(this.eip, bindPublicReq.eip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindPublicReq {\n");
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
