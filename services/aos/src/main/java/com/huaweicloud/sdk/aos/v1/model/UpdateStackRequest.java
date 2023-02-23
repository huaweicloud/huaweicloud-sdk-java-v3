package com.huaweicloud.sdk.aos.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateStackRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Client-Request-Id")
    

    private String clientRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_name")
    

    private String stackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private UpdateStackRequestBody body;

    public UpdateStackRequest withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    


    /**
     * 用户指定的，对于此请求的唯一ID，用于定位某个请求，推荐使用UUID
     * @return clientRequestId
     */
    public String getClientRequestId() {
        return clientRequestId;
    }

    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    

    public UpdateStackRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    


    /**
     * 用户希望操作的资源栈名称
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    

    public UpdateStackRequest withBody(UpdateStackRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateStackRequest withBody(Consumer<UpdateStackRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateStackRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateStackRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateStackRequestBody body) {
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
        UpdateStackRequest updateStackRequest = (UpdateStackRequest) o;
        return Objects.equals(this.clientRequestId, updateStackRequest.clientRequestId) &&
            Objects.equals(this.stackName, updateStackRequest.stackName) &&
            Objects.equals(this.body, updateStackRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clientRequestId, stackName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStackRequest {\n");
        sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
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

