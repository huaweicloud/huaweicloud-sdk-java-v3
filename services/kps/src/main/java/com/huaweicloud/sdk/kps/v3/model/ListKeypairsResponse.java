package com.huaweicloud.sdk.kps.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kps.v3.model.Keypairs;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListKeypairsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keypairs")
    
    private List<Keypairs> keypairs = null;
    
    public ListKeypairsResponse withKeypairs(List<Keypairs> keypairs) {
        this.keypairs = keypairs;
        return this;
    }

    
    public ListKeypairsResponse addKeypairsItem(Keypairs keypairsItem) {
        if(this.keypairs == null) {
            this.keypairs = new ArrayList<>();
        }
        this.keypairs.add(keypairsItem);
        return this;
    }

    public ListKeypairsResponse withKeypairs(Consumer<List<Keypairs>> keypairsSetter) {
        if(this.keypairs == null) {
            this.keypairs = new ArrayList<>();
        }
        keypairsSetter.accept(this.keypairs);
        return this;
    }

    /**
     * SSH密钥对信息详情
     * @return keypairs
     */
    public List<Keypairs> getKeypairs() {
        return keypairs;
    }

    public void setKeypairs(List<Keypairs> keypairs) {
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
        ListKeypairsResponse listKeypairsResponse = (ListKeypairsResponse) o;
        return Objects.equals(this.keypairs, listKeypairsResponse.keypairs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keypairs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeypairsResponse {\n");
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

