package com.huaweicloud.sdk.swr.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.swr.v2.model.AuthInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Certification
 */
public class Certification  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cert")
    
    private AuthInfo cert;

    public Certification withCert(AuthInfo cert) {
        this.cert = cert;
        return this;
    }

    public Certification withCert(Consumer<AuthInfo> certSetter) {
        if(this.cert == null ){
            this.cert = new AuthInfo();
            certSetter.accept(this.cert);
        }
        
        return this;
    }


    /**
     * Get cert
     * @return cert
     */
    public AuthInfo getCert() {
        return cert;
    }

    public void setCert(AuthInfo cert) {
        this.cert = cert;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Certification certification = (Certification) o;
        return Objects.equals(this.cert, certification.cert);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cert);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Certification {\n");
        sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
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

