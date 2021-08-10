package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdateDomainMultiCertificatesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https")

    private UpdateDomainMultiCertificatesResponseBodyContent https;

    public UpdateDomainMultiCertificatesResponse withHttps(UpdateDomainMultiCertificatesResponseBodyContent https) {
        this.https = https;
        return this;
    }

    public UpdateDomainMultiCertificatesResponse withHttps(
        Consumer<UpdateDomainMultiCertificatesResponseBodyContent> httpsSetter) {
        if (this.https == null) {
            this.https = new UpdateDomainMultiCertificatesResponseBodyContent();
            httpsSetter.accept(this.https);
        }

        return this;
    }

    /** Get https
     * 
     * @return https */
    public UpdateDomainMultiCertificatesResponseBodyContent getHttps() {
        return https;
    }

    public void setHttps(UpdateDomainMultiCertificatesResponseBodyContent https) {
        this.https = https;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDomainMultiCertificatesResponse updateDomainMultiCertificatesResponse =
            (UpdateDomainMultiCertificatesResponse) o;
        return Objects.equals(this.https, updateDomainMultiCertificatesResponse.https);
    }

    @Override
    public int hashCode() {
        return Objects.hash(https);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainMultiCertificatesResponse {\n");
        sb.append("    https: ").append(toIndentedString(https)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
