package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class TransferKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyspace_id")

    private String keyspaceId;

    public TransferKeyResponse withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * **参数解释：** 转移后密钥的ID **取值范围：** 不涉及
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public TransferKeyResponse withKeyspaceId(String keyspaceId) {
        this.keyspaceId = keyspaceId;
        return this;
    }

    /**
     * **参数解释：** 密钥所属的目标密钥空间ID **取值范围：** 不涉及
     * @return keyspaceId
     */
    public String getKeyspaceId() {
        return keyspaceId;
    }

    public void setKeyspaceId(String keyspaceId) {
        this.keyspaceId = keyspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferKeyResponse that = (TransferKeyResponse) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.keyspaceId, that.keyspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, keyspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferKeyResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keyspaceId: ").append(toIndentedString(keyspaceId)).append("\n");
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
