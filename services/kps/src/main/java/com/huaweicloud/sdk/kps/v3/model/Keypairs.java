package com.huaweicloud.sdk.kps.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kps.v3.model.Keypair;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Keypairs
 */
public class Keypairs  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keypair")
    
    private Keypair keypair;

    public Keypairs withKeypair(Keypair keypair) {
        this.keypair = keypair;
        return this;
    }

    public Keypairs withKeypair(Consumer<Keypair> keypairSetter) {
        if(this.keypair == null ){
            this.keypair = new Keypair();
            keypairSetter.accept(this.keypair);
        }
        
        return this;
    }


    /**
     * Get keypair
     * @return keypair
     */
    public Keypair getKeypair() {
        return keypair;
    }

    public void setKeypair(Keypair keypair) {
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
        Keypairs keypairs = (Keypairs) o;
        return Objects.equals(this.keypair, keypairs.keypair);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keypair);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Keypairs {\n");
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

