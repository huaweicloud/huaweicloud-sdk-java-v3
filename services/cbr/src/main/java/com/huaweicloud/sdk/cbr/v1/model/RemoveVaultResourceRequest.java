package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.VaultRemoveResourceReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RemoveVaultResourceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vault_id")
    
    private String vaultId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private VaultRemoveResourceReq body = null;

    public RemoveVaultResourceRequest withVaultId(String vaultId) {
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

    public RemoveVaultResourceRequest withBody(VaultRemoveResourceReq body) {
        this.body = body;
        return this;
    }

    public RemoveVaultResourceRequest withBody(Consumer<VaultRemoveResourceReq> bodySetter) {
        if(this.body == null ){
            this.body = new VaultRemoveResourceReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public VaultRemoveResourceReq getBody() {
        return body;
    }

    public void setBody(VaultRemoveResourceReq body) {
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
        RemoveVaultResourceRequest removeVaultResourceRequest = (RemoveVaultResourceRequest) o;
        return Objects.equals(this.vaultId, removeVaultResourceRequest.vaultId) &&
            Objects.equals(this.body, removeVaultResourceRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vaultId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveVaultResourceRequest {\n");
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

