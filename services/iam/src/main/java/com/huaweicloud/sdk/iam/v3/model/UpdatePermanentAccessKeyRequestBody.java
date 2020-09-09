package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.UpdateCredentialOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdatePermanentAccessKeyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credential")
    
    private UpdateCredentialOption credential = null;

    public UpdatePermanentAccessKeyRequestBody withCredential(UpdateCredentialOption credential) {
        this.credential = credential;
        return this;
    }

    public UpdatePermanentAccessKeyRequestBody withCredential(Consumer<UpdateCredentialOption> credentialSetter) {
        if(this.credential == null ){
            this.credential = new UpdateCredentialOption();
            credentialSetter.accept(this.credential);
        }
        
        return this;
    }


    /**
     * Get credential
     * @return credential
     */
    public UpdateCredentialOption getCredential() {
        return credential;
    }

    public void setCredential(UpdateCredentialOption credential) {
        this.credential = credential;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePermanentAccessKeyRequestBody updatePermanentAccessKeyRequestBody = (UpdatePermanentAccessKeyRequestBody) o;
        return Objects.equals(this.credential, updatePermanentAccessKeyRequestBody.credential);
    }
    @Override
    public int hashCode() {
        return Objects.hash(credential);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePermanentAccessKeyRequestBody {\n");
        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
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

