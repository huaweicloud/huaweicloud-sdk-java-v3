package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PersistableModelUniqueKeyDTO
 */
public class PersistableModelUniqueKeyDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decrypt")

    private Boolean decrypt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uniqueKey")

    private String uniqueKey;

    public PersistableModelUniqueKeyDTO withDecrypt(Boolean decrypt) {
        this.decrypt = decrypt;
        return this;
    }

    /**
     * 是否加密。 - true：加密。 - false：不加密。
     * @return decrypt
     */
    public Boolean getDecrypt() {
        return decrypt;
    }

    public void setDecrypt(Boolean decrypt) {
        this.decrypt = decrypt;
    }

    public PersistableModelUniqueKeyDTO withUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
        return this;
    }

    /**
     * 示例模型的唯一键属性。
     * @return uniqueKey
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistableModelUniqueKeyDTO that = (PersistableModelUniqueKeyDTO) obj;
        return Objects.equals(this.decrypt, that.decrypt) && Objects.equals(this.uniqueKey, that.uniqueKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decrypt, uniqueKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistableModelUniqueKeyDTO {\n");
        sb.append("    decrypt: ").append(toIndentedString(decrypt)).append("\n");
        sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
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
