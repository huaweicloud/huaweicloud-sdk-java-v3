package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.VaultAddResourceReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class AddVaultResourceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vault_id")
    
    private String vaultId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private VaultAddResourceReq body;

    public AddVaultResourceRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    


    /**
     * Get vaultId
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    

    public AddVaultResourceRequest withBody(VaultAddResourceReq body) {
        this.body = body;
        return this;
    }

    public AddVaultResourceRequest withBody(Consumer<VaultAddResourceReq> bodySetter) {
        if(this.body == null ){
            this.body = new VaultAddResourceReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public VaultAddResourceReq getBody() {
        return body;
    }

    public void setBody(VaultAddResourceReq body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddVaultResourceRequest addVaultResourceRequest = (AddVaultResourceRequest) o;
        return Objects.equals(this.vaultId, addVaultResourceRequest.vaultId) &&
            Objects.equals(this.body, addVaultResourceRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vaultId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddVaultResourceRequest {\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

