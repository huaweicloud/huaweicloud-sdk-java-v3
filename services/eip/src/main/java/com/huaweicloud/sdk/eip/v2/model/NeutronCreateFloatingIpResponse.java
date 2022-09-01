package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronCreateFloatingIpResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floatingip")

    @JacksonXmlProperty(localName = "floatingip")

    private PostAndPutFloatingIpResp floatingip;

    public NeutronCreateFloatingIpResponse withFloatingip(PostAndPutFloatingIpResp floatingip) {
        this.floatingip = floatingip;
        return this;
    }

    public NeutronCreateFloatingIpResponse withFloatingip(Consumer<PostAndPutFloatingIpResp> floatingipSetter) {
        if (this.floatingip == null) {
            this.floatingip = new PostAndPutFloatingIpResp();
            floatingipSetter.accept(this.floatingip);
        }

        return this;
    }

    /**
     * Get floatingip
     * @return floatingip
     */
    public PostAndPutFloatingIpResp getFloatingip() {
        return floatingip;
    }

    public void setFloatingip(PostAndPutFloatingIpResp floatingip) {
        this.floatingip = floatingip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronCreateFloatingIpResponse neutronCreateFloatingIpResponse = (NeutronCreateFloatingIpResponse) o;
        return Objects.equals(this.floatingip, neutronCreateFloatingIpResponse.floatingip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floatingip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateFloatingIpResponse {\n");
        sb.append("    floatingip: ").append(toIndentedString(floatingip)).append("\n");
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
