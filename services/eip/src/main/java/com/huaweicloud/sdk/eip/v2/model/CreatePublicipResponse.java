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
public class CreatePublicipResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip")

    @JacksonXmlProperty(localName = "publicip")

    private PublicipCreateResp publicip;

    public CreatePublicipResponse withPublicip(PublicipCreateResp publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreatePublicipResponse withPublicip(Consumer<PublicipCreateResp> publicipSetter) {
        if (this.publicip == null) {
            this.publicip = new PublicipCreateResp();
            publicipSetter.accept(this.publicip);
        }

        return this;
    }

    /**
     * Get publicip
     * @return publicip
     */
    public PublicipCreateResp getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicipCreateResp publicip) {
        this.publicip = publicip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePublicipResponse createPublicipResponse = (CreatePublicipResponse) o;
        return Objects.equals(this.publicip, createPublicipResponse.publicip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePublicipResponse {\n");
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
