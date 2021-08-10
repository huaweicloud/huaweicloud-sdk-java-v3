package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** KeyDescriptionInfo */
public class KeyDescriptionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_description")

    private String keyDescription;

    public KeyDescriptionInfo withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /** 密钥ID。
     * 
     * @return keyId */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public KeyDescriptionInfo withKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
        return this;
    }

    /** 密钥描述。
     * 
     * @return keyDescription */
    public String getKeyDescription() {
        return keyDescription;
    }

    public void setKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyDescriptionInfo keyDescriptionInfo = (KeyDescriptionInfo) o;
        return Objects.equals(this.keyId, keyDescriptionInfo.keyId)
            && Objects.equals(this.keyDescription, keyDescriptionInfo.keyDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, keyDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyDescriptionInfo {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keyDescription: ").append(toIndentedString(keyDescription)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
