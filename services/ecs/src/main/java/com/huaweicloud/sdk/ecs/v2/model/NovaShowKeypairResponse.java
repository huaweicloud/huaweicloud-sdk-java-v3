package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NovaShowKeypairResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair")

    private NovaKeypairDetail keypair;

    public NovaShowKeypairResponse withKeypair(NovaKeypairDetail keypair) {
        this.keypair = keypair;
        return this;
    }

    public NovaShowKeypairResponse withKeypair(Consumer<NovaKeypairDetail> keypairSetter) {
        if (this.keypair == null) {
            this.keypair = new NovaKeypairDetail();
            keypairSetter.accept(this.keypair);
        }

        return this;
    }

    /**
     * Get keypair
     * @return keypair
     */
    public NovaKeypairDetail getKeypair() {
        return keypair;
    }

    public void setKeypair(NovaKeypairDetail keypair) {
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
        NovaShowKeypairResponse that = (NovaShowKeypairResponse) obj;
        return Objects.equals(this.keypair, that.keypair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaShowKeypairResponse {\n");
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
