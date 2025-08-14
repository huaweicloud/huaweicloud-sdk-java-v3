package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateApplicationInstanceCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_instance_certificate")

    private CertificateDto applicationInstanceCertificate;

    public CreateApplicationInstanceCertificateResponse withApplicationInstanceCertificate(
        CertificateDto applicationInstanceCertificate) {
        this.applicationInstanceCertificate = applicationInstanceCertificate;
        return this;
    }

    public CreateApplicationInstanceCertificateResponse withApplicationInstanceCertificate(
        Consumer<CertificateDto> applicationInstanceCertificateSetter) {
        if (this.applicationInstanceCertificate == null) {
            this.applicationInstanceCertificate = new CertificateDto();
            applicationInstanceCertificateSetter.accept(this.applicationInstanceCertificate);
        }

        return this;
    }

    /**
     * Get applicationInstanceCertificate
     * @return applicationInstanceCertificate
     */
    public CertificateDto getApplicationInstanceCertificate() {
        return applicationInstanceCertificate;
    }

    public void setApplicationInstanceCertificate(CertificateDto applicationInstanceCertificate) {
        this.applicationInstanceCertificate = applicationInstanceCertificate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateApplicationInstanceCertificateResponse that = (CreateApplicationInstanceCertificateResponse) obj;
        return Objects.equals(this.applicationInstanceCertificate, that.applicationInstanceCertificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationInstanceCertificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApplicationInstanceCertificateResponse {\n");
        sb.append("    applicationInstanceCertificate: ")
            .append(toIndentedString(applicationInstanceCertificate))
            .append("\n");
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
