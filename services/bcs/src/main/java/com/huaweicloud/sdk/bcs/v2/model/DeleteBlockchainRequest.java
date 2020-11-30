package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteBlockchainRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="blockchain_id")
    
    private String blockchainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_delete_storage")
    
    private Boolean isDeleteStorage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_delete_obs")
    
    private Boolean isDeleteObs;

    public DeleteBlockchainRequest withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    


    /**
     * Get blockchainId
     * @return blockchainId
     */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    public DeleteBlockchainRequest withIsDeleteStorage(Boolean isDeleteStorage) {
        this.isDeleteStorage = isDeleteStorage;
        return this;
    }

    


    /**
     * Get isDeleteStorage
     * @return isDeleteStorage
     */
    public Boolean getIsDeleteStorage() {
        return isDeleteStorage;
    }

    public void setIsDeleteStorage(Boolean isDeleteStorage) {
        this.isDeleteStorage = isDeleteStorage;
    }

    public DeleteBlockchainRequest withIsDeleteObs(Boolean isDeleteObs) {
        this.isDeleteObs = isDeleteObs;
        return this;
    }

    


    /**
     * Get isDeleteObs
     * @return isDeleteObs
     */
    public Boolean getIsDeleteObs() {
        return isDeleteObs;
    }

    public void setIsDeleteObs(Boolean isDeleteObs) {
        this.isDeleteObs = isDeleteObs;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteBlockchainRequest deleteBlockchainRequest = (DeleteBlockchainRequest) o;
        return Objects.equals(this.blockchainId, deleteBlockchainRequest.blockchainId) &&
            Objects.equals(this.isDeleteStorage, deleteBlockchainRequest.isDeleteStorage) &&
            Objects.equals(this.isDeleteObs, deleteBlockchainRequest.isDeleteObs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(blockchainId, isDeleteStorage, isDeleteObs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBlockchainRequest {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    isDeleteStorage: ").append(toIndentedString(isDeleteStorage)).append("\n");
        sb.append("    isDeleteObs: ").append(toIndentedString(isDeleteObs)).append("\n");
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

