package com.huaweicloud.sdk.vpc.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v3.model.BatchCreateSubNetworkInterfaceV3RequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchCreateSubNetworkInterfaceV3Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchCreateSubNetworkInterfaceV3RequestBody body = null;

    public BatchCreateSubNetworkInterfaceV3Request withBody(BatchCreateSubNetworkInterfaceV3RequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateSubNetworkInterfaceV3Request withBody(Consumer<BatchCreateSubNetworkInterfaceV3RequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new BatchCreateSubNetworkInterfaceV3RequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchCreateSubNetworkInterfaceV3RequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateSubNetworkInterfaceV3RequestBody body) {
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
        BatchCreateSubNetworkInterfaceV3Request batchCreateSubNetworkInterfaceV3Request = (BatchCreateSubNetworkInterfaceV3Request) o;
        return Objects.equals(this.body, batchCreateSubNetworkInterfaceV3Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateSubNetworkInterfaceV3Request {\n");
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

