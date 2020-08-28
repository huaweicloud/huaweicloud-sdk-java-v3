package com.huaweicloud.sdk.codehub.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codehub.v3.model.PasswordRequest;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ValidateHttpsInfoRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="iam_user_uuid")
    
    private String iamUserUuid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private PasswordRequest body = null;

    public ValidateHttpsInfoRequest withIamUserUuid(String iamUserUuid) {
        this.iamUserUuid = iamUserUuid;
        return this;
    }

    


    /**
     * Get iamUserUuid
     * @return iamUserUuid
     */
    public String getIamUserUuid() {
        return iamUserUuid;
    }

    public void setIamUserUuid(String iamUserUuid) {
        this.iamUserUuid = iamUserUuid;
    }

    public ValidateHttpsInfoRequest withBody(PasswordRequest body) {
        this.body = body;
        return this;
    }

    public ValidateHttpsInfoRequest withBody(Consumer<PasswordRequest> bodySetter) {
        if(this.body == null ){
            this.body = new PasswordRequest();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public PasswordRequest getBody() {
        return body;
    }

    public void setBody(PasswordRequest body) {
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
        ValidateHttpsInfoRequest validateHttpsInfoRequest = (ValidateHttpsInfoRequest) o;
        return Objects.equals(this.iamUserUuid, validateHttpsInfoRequest.iamUserUuid) &&
            Objects.equals(this.body, validateHttpsInfoRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(iamUserUuid, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateHttpsInfoRequest {\n");
        sb.append("    iamUserUuid: ").append(toIndentedString(iamUserUuid)).append("\n");
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

