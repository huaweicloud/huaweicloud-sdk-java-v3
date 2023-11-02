package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ImportPrivateKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair")

    private ImportPrivateKeyAction keypair;

    public ImportPrivateKeyResponse withKeypair(ImportPrivateKeyAction keypair) {
        this.keypair = keypair;
        return this;
    }

    public ImportPrivateKeyResponse withKeypair(Consumer<ImportPrivateKeyAction> keypairSetter) {
        if (this.keypair == null) {
            this.keypair = new ImportPrivateKeyAction();
            keypairSetter.accept(this.keypair);
        }

        return this;
    }

    /**
     * Get keypair
     * @return keypair
     */
    public ImportPrivateKeyAction getKeypair() {
        return keypair;
    }

    public void setKeypair(ImportPrivateKeyAction keypair) {
        this.keypair = keypair;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportPrivateKeyResponse that = (ImportPrivateKeyResponse) obj;
        return Objects.equals(this.keypair, that.keypair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keypair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportPrivateKeyResponse {\n");
        sb.append("    keypair: ").append(toIndentedString(keypair)).append("\n");
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
