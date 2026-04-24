package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * KmsConfiguration
 */
public class KmsConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_type")

    private KmsKeyType keyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key_id")

    private String kmsKeyId;

    public KmsConfiguration withKeyType(KmsKeyType keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * Get keyType
     * @return keyType
     */
    public KmsKeyType getKeyType() {
        return keyType;
    }

    public void setKeyType(KmsKeyType keyType) {
        this.keyType = keyType;
    }

    public KmsConfiguration withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * The identifier of the KMS key used for the token vault.
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KmsConfiguration that = (KmsConfiguration) obj;
        return Objects.equals(this.keyType, that.keyType) && Objects.equals(this.kmsKeyId, that.kmsKeyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyType, kmsKeyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KmsConfiguration {\n");
        sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
        sb.append("    kmsKeyId: ").append(toIndentedString(kmsKeyId)).append("\n");
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
