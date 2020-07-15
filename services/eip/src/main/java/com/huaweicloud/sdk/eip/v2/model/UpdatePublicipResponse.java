package com.huaweicloud.sdk.eip.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.PublicipShowResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdatePublicipResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip")
    
    private PublicipShowResp publicip = null;

    public UpdatePublicipResponse withPublicip(PublicipShowResp publicip) {
        this.publicip = publicip;
        return this;
    }

    public UpdatePublicipResponse withPublicip(Consumer<PublicipShowResp> publicipSetter) {
        if(this.publicip == null ){
            this.publicip = new PublicipShowResp();
            publicipSetter.accept(this.publicip);
        }
        
        return this;
    }


    /**
     * Get publicip
     * @return publicip
     */
    public PublicipShowResp getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicipShowResp publicip) {
        this.publicip = publicip;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePublicipResponse updatePublicipResponse = (UpdatePublicipResponse) o;
        return Objects.equals(this.publicip, updatePublicipResponse.publicip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePublicipResponse {\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
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

