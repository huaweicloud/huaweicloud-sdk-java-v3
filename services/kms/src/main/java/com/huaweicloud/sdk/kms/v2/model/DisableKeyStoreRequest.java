package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DisableKeyStoreRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_id")

    @JacksonXmlProperty(localName = "keystore_id")

    private String keystoreId;

    public DisableKeyStoreRequest withKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
        return this;
    }

    /**
     * 密钥库ID
     * @return keystoreId
     */
    public String getKeystoreId() {
        return keystoreId;
    }

    public void setKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisableKeyStoreRequest disableKeyStoreRequest = (DisableKeyStoreRequest) o;
        return Objects.equals(this.keystoreId, disableKeyStoreRequest.keystoreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keystoreId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisableKeyStoreRequest {\n");
        sb.append("    keystoreId: ").append(toIndentedString(keystoreId)).append("\n");
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
