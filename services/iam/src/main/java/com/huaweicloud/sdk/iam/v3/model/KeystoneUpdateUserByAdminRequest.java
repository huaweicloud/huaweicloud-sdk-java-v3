package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateUserByAdminRequestBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class KeystoneUpdateUserByAdminRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private KeystoneUpdateUserByAdminRequestBody body = null;

    public KeystoneUpdateUserByAdminRequest withUserId(String userId) {
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

    public KeystoneUpdateUserByAdminRequest withBody(KeystoneUpdateUserByAdminRequestBody body) {
        this.body = body;
        return this;
    }

    public KeystoneUpdateUserByAdminRequest withBody(Consumer<KeystoneUpdateUserByAdminRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new KeystoneUpdateUserByAdminRequestBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public KeystoneUpdateUserByAdminRequestBody getBody() {
        return body;
    }

    public void setBody(KeystoneUpdateUserByAdminRequestBody body) {
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
        KeystoneUpdateUserByAdminRequest keystoneUpdateUserByAdminRequest = (KeystoneUpdateUserByAdminRequest) o;
        return Objects.equals(this.userId, keystoneUpdateUserByAdminRequest.userId) &&
            Objects.equals(this.body, keystoneUpdateUserByAdminRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateUserByAdminRequest {\n");
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

