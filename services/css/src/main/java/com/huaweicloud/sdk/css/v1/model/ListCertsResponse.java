package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCertsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultCerts")

    private DefaultCertsResource defaultCerts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customCerts")

    private CustomCertsResource customCerts;

    public ListCertsResponse withDefaultCerts(DefaultCertsResource defaultCerts) {
        this.defaultCerts = defaultCerts;
        return this;
    }

    public ListCertsResponse withDefaultCerts(Consumer<DefaultCertsResource> defaultCertsSetter) {
        if (this.defaultCerts == null) {
            this.defaultCerts = new DefaultCertsResource();
            defaultCertsSetter.accept(this.defaultCerts);
        }

        return this;
    }

    /**
     * Get defaultCerts
     * @return defaultCerts
     */
    public DefaultCertsResource getDefaultCerts() {
        return defaultCerts;
    }

    public void setDefaultCerts(DefaultCertsResource defaultCerts) {
        this.defaultCerts = defaultCerts;
    }

    public ListCertsResponse withCustomCerts(CustomCertsResource customCerts) {
        this.customCerts = customCerts;
        return this;
    }

    public ListCertsResponse withCustomCerts(Consumer<CustomCertsResource> customCertsSetter) {
        if (this.customCerts == null) {
            this.customCerts = new CustomCertsResource();
            customCertsSetter.accept(this.customCerts);
        }

        return this;
    }

    /**
     * Get customCerts
     * @return customCerts
     */
    public CustomCertsResource getCustomCerts() {
        return customCerts;
    }

    public void setCustomCerts(CustomCertsResource customCerts) {
        this.customCerts = customCerts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCertsResponse that = (ListCertsResponse) obj;
        return Objects.equals(this.defaultCerts, that.defaultCerts)
            && Objects.equals(this.customCerts, that.customCerts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultCerts, customCerts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertsResponse {\n");
        sb.append("    defaultCerts: ").append(toIndentedString(defaultCerts)).append("\n");
        sb.append("    customCerts: ").append(toIndentedString(customCerts)).append("\n");
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
