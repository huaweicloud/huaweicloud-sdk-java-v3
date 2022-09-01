package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NovaListKeypairsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypairs")

    @JacksonXmlProperty(localName = "keypairs")

    private List<NovaListKeypairsResult> keypairs = null;

    public NovaListKeypairsResponse withKeypairs(List<NovaListKeypairsResult> keypairs) {
        this.keypairs = keypairs;
        return this;
    }

    public NovaListKeypairsResponse addKeypairsItem(NovaListKeypairsResult keypairsItem) {
        if (this.keypairs == null) {
            this.keypairs = new ArrayList<>();
        }
        this.keypairs.add(keypairsItem);
        return this;
    }

    public NovaListKeypairsResponse withKeypairs(Consumer<List<NovaListKeypairsResult>> keypairsSetter) {
        if (this.keypairs == null) {
            this.keypairs = new ArrayList<>();
        }
        keypairsSetter.accept(this.keypairs);
        return this;
    }

    /**
     * 密钥信息列表。
     * @return keypairs
     */
    public List<NovaListKeypairsResult> getKeypairs() {
        return keypairs;
    }

    public void setKeypairs(List<NovaListKeypairsResult> keypairs) {
        this.keypairs = keypairs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaListKeypairsResponse novaListKeypairsResponse = (NovaListKeypairsResponse) o;
        return Objects.equals(this.keypairs, novaListKeypairsResponse.keypairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaListKeypairsResponse {\n");
        sb.append("    keypairs: ").append(toIndentedString(keypairs)).append("\n");
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
