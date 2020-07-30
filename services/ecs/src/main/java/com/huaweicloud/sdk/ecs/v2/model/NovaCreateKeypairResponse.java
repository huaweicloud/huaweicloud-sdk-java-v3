package com.huaweicloud.sdk.ecs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaKeypair;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class NovaCreateKeypairResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keypair")
    
    private NovaKeypair keypair = null;

    public NovaCreateKeypairResponse withKeypair(NovaKeypair keypair) {
        this.keypair = keypair;
        return this;
    }

    public NovaCreateKeypairResponse withKeypair(Consumer<NovaKeypair> keypairSetter) {
        if(this.keypair == null ){
            this.keypair = new NovaKeypair();
            keypairSetter.accept(this.keypair);
        }
        
        return this;
    }


    /**
     * Get keypair
     * @return keypair
     */
    public NovaKeypair getKeypair() {
        return keypair;
    }

    public void setKeypair(NovaKeypair keypair) {
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
        NovaCreateKeypairResponse novaCreateKeypairResponse = (NovaCreateKeypairResponse) o;
        return Objects.equals(this.keypair, novaCreateKeypairResponse.keypair);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keypair);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaCreateKeypairResponse {\n");
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

