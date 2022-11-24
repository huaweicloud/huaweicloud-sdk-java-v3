package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateKeyDescriptionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_info")

    private KeyDescriptionInfo keyInfo;

    public UpdateKeyDescriptionResponse withKeyInfo(KeyDescriptionInfo keyInfo) {
        this.keyInfo = keyInfo;
        return this;
    }

    public UpdateKeyDescriptionResponse withKeyInfo(Consumer<KeyDescriptionInfo> keyInfoSetter) {
        if (this.keyInfo == null) {
            this.keyInfo = new KeyDescriptionInfo();
            keyInfoSetter.accept(this.keyInfo);
        }

        return this;
    }

    /**
     * Get keyInfo
     * @return keyInfo
     */
    public KeyDescriptionInfo getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(KeyDescriptionInfo keyInfo) {
        this.keyInfo = keyInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateKeyDescriptionResponse updateKeyDescriptionResponse = (UpdateKeyDescriptionResponse) o;
        return Objects.equals(this.keyInfo, updateKeyDescriptionResponse.keyInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeyDescriptionResponse {\n");
        sb.append("    keyInfo: ").append(toIndentedString(keyInfo)).append("\n");
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
