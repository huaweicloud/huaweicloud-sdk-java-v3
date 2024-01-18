package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateCgwRequestBodyContent
 */
public class UpdateCgwRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_certificate")

    private CaCertificateRequest caCertificate;

    public UpdateCgwRequestBodyContent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网关名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCgwRequestBodyContent withCaCertificate(CaCertificateRequest caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }

    public UpdateCgwRequestBodyContent withCaCertificate(Consumer<CaCertificateRequest> caCertificateSetter) {
        if (this.caCertificate == null) {
            this.caCertificate = new CaCertificateRequest();
            caCertificateSetter.accept(this.caCertificate);
        }

        return this;
    }

    /**
     * Get caCertificate
     * @return caCertificate
     */
    public CaCertificateRequest getCaCertificate() {
        return caCertificate;
    }

    public void setCaCertificate(CaCertificateRequest caCertificate) {
        this.caCertificate = caCertificate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCgwRequestBodyContent that = (UpdateCgwRequestBodyContent) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.caCertificate, that.caCertificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, caCertificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCgwRequestBodyContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    caCertificate: ").append(toIndentedString(caCertificate)).append("\n");
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
