package com.huaweicloud.sdk.ccm.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateCertificateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate_id")
    
    private String certificateId;

    public CreateCertificateResponse withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    


    /**
     * 证书 ID
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCertificateResponse createCertificateResponse = (CreateCertificateResponse) o;
        return Objects.equals(this.certificateId, createCertificateResponse.certificateId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certificateId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateResponse {\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
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

