package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SSH密钥对的详情
 */
public class CreateKeypairResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair")

    private CreateKeypairResp keypair;

    public CreateKeypairResponseBody withKeypair(CreateKeypairResp keypair) {
        this.keypair = keypair;
        return this;
    }

    public CreateKeypairResponseBody withKeypair(Consumer<CreateKeypairResp> keypairSetter) {
        if (this.keypair == null) {
            this.keypair = new CreateKeypairResp();
            keypairSetter.accept(this.keypair);
        }

        return this;
    }

    /**
     * Get keypair
     * @return keypair
     */
    public CreateKeypairResp getKeypair() {
        return keypair;
    }

    public void setKeypair(CreateKeypairResp keypair) {
        this.keypair = keypair;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKeypairResponseBody that = (CreateKeypairResponseBody) obj;
        return Objects.equals(this.keypair, that.keypair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKeypairResponseBody {\n");
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
