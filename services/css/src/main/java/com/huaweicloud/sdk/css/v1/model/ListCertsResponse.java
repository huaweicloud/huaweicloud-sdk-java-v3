package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCertsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultCerts")

    private List<DefaultCertsResource> defaultCerts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customCerts")

    private List<CustomCertsResource> customCerts = null;

    public ListCertsResponse withDefaultCerts(List<DefaultCertsResource> defaultCerts) {
        this.defaultCerts = defaultCerts;
        return this;
    }

    public ListCertsResponse addDefaultCertsItem(DefaultCertsResource defaultCertsItem) {
        if (this.defaultCerts == null) {
            this.defaultCerts = new ArrayList<>();
        }
        this.defaultCerts.add(defaultCertsItem);
        return this;
    }

    public ListCertsResponse withDefaultCerts(Consumer<List<DefaultCertsResource>> defaultCertsSetter) {
        if (this.defaultCerts == null) {
            this.defaultCerts = new ArrayList<>();
        }
        defaultCertsSetter.accept(this.defaultCerts);
        return this;
    }

    /**
     * 默认证书列表。
     * @return defaultCerts
     */
    public List<DefaultCertsResource> getDefaultCerts() {
        return defaultCerts;
    }

    public void setDefaultCerts(List<DefaultCertsResource> defaultCerts) {
        this.defaultCerts = defaultCerts;
    }

    public ListCertsResponse withCustomCerts(List<CustomCertsResource> customCerts) {
        this.customCerts = customCerts;
        return this;
    }

    public ListCertsResponse addCustomCertsItem(CustomCertsResource customCertsItem) {
        if (this.customCerts == null) {
            this.customCerts = new ArrayList<>();
        }
        this.customCerts.add(customCertsItem);
        return this;
    }

    public ListCertsResponse withCustomCerts(Consumer<List<CustomCertsResource>> customCertsSetter) {
        if (this.customCerts == null) {
            this.customCerts = new ArrayList<>();
        }
        customCertsSetter.accept(this.customCerts);
        return this;
    }

    /**
     * 自定义证书列表。
     * @return customCerts
     */
    public List<CustomCertsResource> getCustomCerts() {
        return customCerts;
    }

    public void setCustomCerts(List<CustomCertsResource> customCerts) {
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
