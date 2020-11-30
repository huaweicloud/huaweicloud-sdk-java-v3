package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.BatchAddPeersToChannelRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchAddPeersToChannelRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="blockchain_id")
    
    private String blockchainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchAddPeersToChannelRequestBody body = null;

    public BatchAddPeersToChannelRequest withBlockchainId(String blockchainId) {
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

    public BatchAddPeersToChannelRequest withBody(BatchAddPeersToChannelRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchAddPeersToChannelRequest withBody(Consumer<BatchAddPeersToChannelRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchAddPeersToChannelRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchAddPeersToChannelRequestBody getBody() {
        return body;
    }

    public void setBody(BatchAddPeersToChannelRequestBody body) {
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
        BatchAddPeersToChannelRequest batchAddPeersToChannelRequest = (BatchAddPeersToChannelRequest) o;
        return Objects.equals(this.blockchainId, batchAddPeersToChannelRequest.blockchainId) &&
            Objects.equals(this.body, batchAddPeersToChannelRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(blockchainId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddPeersToChannelRequest {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
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

