package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NovaDeleteKeypairRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keypair_name")
    
    private String keypairName;

    public NovaDeleteKeypairRequest withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    


    /**
     * Get keypairName
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaDeleteKeypairRequest novaDeleteKeypairRequest = (NovaDeleteKeypairRequest) o;
        return Objects.equals(this.keypairName, novaDeleteKeypairRequest.keypairName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keypairName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaDeleteKeypairRequest {\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
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

