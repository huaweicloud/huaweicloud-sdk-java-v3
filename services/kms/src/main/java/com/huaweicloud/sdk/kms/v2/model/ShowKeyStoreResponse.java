package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowKeyStoreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore")

    private KeystoreDetails keystore;

    public ShowKeyStoreResponse withKeystore(KeystoreDetails keystore) {
        this.keystore = keystore;
        return this;
    }

    public ShowKeyStoreResponse withKeystore(Consumer<KeystoreDetails> keystoreSetter) {
        if (this.keystore == null) {
            this.keystore = new KeystoreDetails();
            keystoreSetter.accept(this.keystore);
        }

        return this;
    }

    /**
     * Get keystore
     * @return keystore
     */
    public KeystoreDetails getKeystore() {
        return keystore;
    }

    public void setKeystore(KeystoreDetails keystore) {
        this.keystore = keystore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKeyStoreResponse that = (ShowKeyStoreResponse) obj;
        return Objects.equals(this.keystore, that.keystore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keystore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKeyStoreResponse {\n");
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
