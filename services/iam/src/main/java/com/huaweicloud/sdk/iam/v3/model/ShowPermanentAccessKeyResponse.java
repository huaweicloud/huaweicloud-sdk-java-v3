package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.ShowCredential;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPermanentAccessKeyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credential")
    
    private ShowCredential credential = null;

    public ShowPermanentAccessKeyResponse withCredential(ShowCredential credential) {
        this.credential = credential;
        return this;
    }

    public ShowPermanentAccessKeyResponse withCredential(Consumer<ShowCredential> credentialSetter) {
        if(this.credential == null ){
            this.credential = new ShowCredential();
            credentialSetter.accept(this.credential);
        }
        
        return this;
    }


    /**
     * Get credential
     * @return credential
     */
    public ShowCredential getCredential() {
        return credential;
    }

    public void setCredential(ShowCredential credential) {
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
        ShowPermanentAccessKeyResponse showPermanentAccessKeyResponse = (ShowPermanentAccessKeyResponse) o;
        return Objects.equals(this.credential, showPermanentAccessKeyResponse.credential);
    }
    @Override
    public int hashCode() {
        return Objects.hash(credential);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPermanentAccessKeyResponse {\n");
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

