package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class NovaCreateKeypairRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair")

    private NovaCreateKeypairOption keypair;

    public NovaCreateKeypairRequestBody withKeypair(NovaCreateKeypairOption keypair) {
        this.keypair = keypair;
        return this;
    }

    public NovaCreateKeypairRequestBody withKeypair(Consumer<NovaCreateKeypairOption> keypairSetter) {
        if (this.keypair == null) {
            this.keypair = new NovaCreateKeypairOption();
            keypairSetter.accept(this.keypair);
        }

        return this;
    }

    /**
     * Get keypair
     * @return keypair
     */
    public NovaCreateKeypairOption getKeypair() {
        return keypair;
    }

    public void setKeypair(NovaCreateKeypairOption keypair) {
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
        NovaCreateKeypairRequestBody that = (NovaCreateKeypairRequestBody) obj;
        return Objects.equals(this.keypair, that.keypair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaCreateKeypairRequestBody {\n");
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
