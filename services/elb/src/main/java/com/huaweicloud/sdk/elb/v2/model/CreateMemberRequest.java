package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.CreateMemberRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateMemberRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pool_id")
    
    private String poolId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateMemberRequestBody body;

    public CreateMemberRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    


    /**
     * 后端云服务器组id
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    

    public CreateMemberRequest withBody(CreateMemberRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateMemberRequest withBody(Consumer<CreateMemberRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new CreateMemberRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateMemberRequestBody getBody() {
        return body;
    }

    public void setBody(CreateMemberRequestBody body) {
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
        CreateMemberRequest createMemberRequest = (CreateMemberRequest) o;
        return Objects.equals(this.poolId, createMemberRequest.poolId) &&
            Objects.equals(this.body, createMemberRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(poolId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMemberRequest {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
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

