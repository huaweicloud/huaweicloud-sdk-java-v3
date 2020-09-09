package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * KeyAliasInfo
 */
public class KeyAliasInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_id")
    
    private String keyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_alias")
    
    private String keyAlias;

    public KeyAliasInfo withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    


    /**
     * 密钥ID。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public KeyAliasInfo withKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
        return this;
    }

    


    /**
     * 密钥别名。
     * @return keyAlias
     */
    public String getKeyAlias() {
        return keyAlias;
    }

    public void setKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyAliasInfo keyAliasInfo = (KeyAliasInfo) o;
        return Objects.equals(this.keyId, keyAliasInfo.keyId) &&
            Objects.equals(this.keyAlias, keyAliasInfo.keyAlias);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyId, keyAlias);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyAliasInfo {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keyAlias: ").append(toIndentedString(keyAlias)).append("\n");
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

