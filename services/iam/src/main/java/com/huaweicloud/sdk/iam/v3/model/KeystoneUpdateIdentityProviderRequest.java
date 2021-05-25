package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateIdentityProviderRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneUpdateIdentityProviderRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private KeystoneUpdateIdentityProviderRequestBody body;

    public KeystoneUpdateIdentityProviderRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 待更新的身份提供商ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public KeystoneUpdateIdentityProviderRequest withBody(KeystoneUpdateIdentityProviderRequestBody body) {
        this.body = body;
        return this;
    }

    public KeystoneUpdateIdentityProviderRequest withBody(Consumer<KeystoneUpdateIdentityProviderRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new KeystoneUpdateIdentityProviderRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public KeystoneUpdateIdentityProviderRequestBody getBody() {
        return body;
    }

    public void setBody(KeystoneUpdateIdentityProviderRequestBody body) {
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
        KeystoneUpdateIdentityProviderRequest keystoneUpdateIdentityProviderRequest = (KeystoneUpdateIdentityProviderRequest) o;
        return Objects.equals(this.id, keystoneUpdateIdentityProviderRequest.id) &&
            Objects.equals(this.body, keystoneUpdateIdentityProviderRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateIdentityProviderRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

