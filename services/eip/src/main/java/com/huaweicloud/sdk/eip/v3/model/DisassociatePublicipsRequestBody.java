package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 解绑弹性公网IP的请求体
 */
public class DisassociatePublicipsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    private DisassociatePublicipsOption publicip;

    public DisassociatePublicipsRequestBody withPublicip(DisassociatePublicipsOption publicip) {
        this.publicip = publicip;
        return this;
    }

    public DisassociatePublicipsRequestBody withPublicip(Consumer<DisassociatePublicipsOption> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new DisassociatePublicipsOption();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public DisassociatePublicipsOption getPublicip() {
        return publicip;
    }

    public void setPublicip(DisassociatePublicipsOption publicip) {
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
        DisassociatePublicipsRequestBody that = (DisassociatePublicipsRequestBody) obj;
        return Objects.equals(this.publicip, that.publicip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociatePublicipsRequestBody {\n");
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
