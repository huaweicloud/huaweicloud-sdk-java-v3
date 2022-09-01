package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新SSH密钥对描述
 */
public class UpdateKeypairDescriptionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair")

    @JacksonXmlProperty(localName = "keypair")

    private UpdateKeypairDescriptionReq keypair;

    public UpdateKeypairDescriptionRequestBody withKeypair(UpdateKeypairDescriptionReq keypair) {
        this.keypair = keypair;
        return this;
    }

    public UpdateKeypairDescriptionRequestBody withKeypair(Consumer<UpdateKeypairDescriptionReq> keypairSetter) {
        if (this.keypair == null) {
            this.keypair = new UpdateKeypairDescriptionReq();
            keypairSetter.accept(this.keypair);
        }

        return this;
    }

    /**
     * Get keypair
     * @return keypair
     */
    public UpdateKeypairDescriptionReq getKeypair() {
        return keypair;
    }

    public void setKeypair(UpdateKeypairDescriptionReq keypair) {
        this.keypair = keypair;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateKeypairDescriptionRequestBody updateKeypairDescriptionRequestBody =
            (UpdateKeypairDescriptionRequestBody) o;
        return Objects.equals(this.keypair, updateKeypairDescriptionRequestBody.keypair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeypairDescriptionRequestBody {\n");
        sb.append("    keypair: ").append(toIndentedString(keypair)).append("\n");
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
