package com.huaweicloud.sdk.dc.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dc.v3.model.CreateDirectConnectRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchCreateDirectConnectRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateDirectConnectRequestBody body = null;

    public BatchCreateDirectConnectRequest withBody(CreateDirectConnectRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateDirectConnectRequest withBody(Consumer<CreateDirectConnectRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateDirectConnectRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateDirectConnectRequestBody getBody() {
        return body;
    }

    public void setBody(CreateDirectConnectRequestBody body) {
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
        BatchCreateDirectConnectRequest batchCreateDirectConnectRequest = (BatchCreateDirectConnectRequest) o;
        return Objects.equals(this.body, batchCreateDirectConnectRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateDirectConnectRequest {\n");
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

