package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.UpdateUserInformationRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateUserInformationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateUserInformationRequestBody body;

    public UpdateUserInformationRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * Get userId
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    public UpdateUserInformationRequest withBody(UpdateUserInformationRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateUserInformationRequest withBody(Consumer<UpdateUserInformationRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateUserInformationRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateUserInformationRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateUserInformationRequestBody body) {
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
        UpdateUserInformationRequest updateUserInformationRequest = (UpdateUserInformationRequest) o;
        return Objects.equals(this.userId, updateUserInformationRequest.userId) &&
            Objects.equals(this.body, updateUserInformationRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserInformationRequest {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

