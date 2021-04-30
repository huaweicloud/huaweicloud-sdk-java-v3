package com.huaweicloud.sdk.bcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateNewBlockchainResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="blockchain_id")
    
    private String blockchainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="blockchain_name")
    
    private String blockchainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_id")
    
    private String operationId;

    public CreateNewBlockchainResponse withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    


    /**
     * 服务实例ID
     * @return blockchainId
     */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    

    public CreateNewBlockchainResponse withBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
        return this;
    }

    


    /**
     * 服务实例名
     * @return blockchainName
     */
    public String getBlockchainName() {
        return blockchainName;
    }

    public void setBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
    }

    

    public CreateNewBlockchainResponse withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    


    /**
     * 操作ID
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNewBlockchainResponse createNewBlockchainResponse = (CreateNewBlockchainResponse) o;
        return Objects.equals(this.blockchainId, createNewBlockchainResponse.blockchainId) &&
            Objects.equals(this.blockchainName, createNewBlockchainResponse.blockchainName) &&
            Objects.equals(this.operationId, createNewBlockchainResponse.operationId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(blockchainId, blockchainName, operationId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNewBlockchainResponse {\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
        sb.append("    blockchainName: ").append(toIndentedString(blockchainName)).append("\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

