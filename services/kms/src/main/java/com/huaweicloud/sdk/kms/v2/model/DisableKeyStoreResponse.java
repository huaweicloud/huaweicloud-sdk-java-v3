package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DisableKeyStoreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore")

    @JacksonXmlProperty(localName = "keystore")

    private KeyStoreStateInfo keystore;

    public DisableKeyStoreResponse withKeystore(KeyStoreStateInfo keystore) {
        this.keystore = keystore;
        return this;
    }

    public DisableKeyStoreResponse withKeystore(Consumer<KeyStoreStateInfo> keystoreSetter) {
        if (this.keystore == null) {
            this.keystore = new KeyStoreStateInfo();
            keystoreSetter.accept(this.keystore);
        }

        return this;
    }

    /**
     * Get keystore
     * @return keystore
     */
    public KeyStoreStateInfo getKeystore() {
        return keystore;
    }

    public void setKeystore(KeyStoreStateInfo keystore) {
        this.keystore = keystore;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisableKeyStoreResponse disableKeyStoreResponse = (DisableKeyStoreResponse) o;
        return Objects.equals(this.keystore, disableKeyStoreResponse.keystore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keystore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisableKeyStoreResponse {\n");
        sb.append("    keystore: ").append(toIndentedString(keystore)).append("\n");
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
