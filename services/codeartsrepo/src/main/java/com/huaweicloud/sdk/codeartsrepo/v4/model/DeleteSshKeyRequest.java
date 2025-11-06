package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSshKeyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private Integer keyId;

    public DeleteSshKeyRequest withKeyId(Integer keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * **参数解释：** 资源Id，通过获取代码组权限资源点列表获取的数据中的Id
     * minimum: 1
     * maximum: 2147483647
     * @return keyId
     */
    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteSshKeyRequest that = (DeleteSshKeyRequest) obj;
        return Objects.equals(this.keyId, that.keyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSshKeyRequest {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
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
