package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 轮转密钥请求体。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class RotateKeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_key_id")

    private String masterKeyId;

    public RotateKeyRequestBody withMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
        return this;
    }

    /**
     * **参数解释**： KMS密钥ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return masterKeyId
     */
    public String getMasterKeyId() {
        return masterKeyId;
    }

    public void setMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RotateKeyRequestBody that = (RotateKeyRequestBody) obj;
        return Objects.equals(this.masterKeyId, that.masterKeyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterKeyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RotateKeyRequestBody {\n");
        sb.append("    masterKeyId: ").append(toIndentedString(masterKeyId)).append("\n");
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
