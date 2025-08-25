package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AuthorizeAccessKeysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_keys")

    private List<String> accessKeys = null;

    public AuthorizeAccessKeysResponse withAccessKeys(List<String> accessKeys) {
        this.accessKeys = accessKeys;
        return this;
    }

    public AuthorizeAccessKeysResponse addAccessKeysItem(String accessKeysItem) {
        if (this.accessKeys == null) {
            this.accessKeys = new ArrayList<>();
        }
        this.accessKeys.add(accessKeysItem);
        return this;
    }

    public AuthorizeAccessKeysResponse withAccessKeys(Consumer<List<String>> accessKeysSetter) {
        if (this.accessKeys == null) {
            this.accessKeys = new ArrayList<>();
        }
        accessKeysSetter.accept(this.accessKeys);
        return this;
    }

    /**
     * 访问密钥ID列表
     * @return accessKeys
     */
    public List<String> getAccessKeys() {
        return accessKeys;
    }

    public void setAccessKeys(List<String> accessKeys) {
        this.accessKeys = accessKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizeAccessKeysResponse that = (AuthorizeAccessKeysResponse) obj;
        return Objects.equals(this.accessKeys, that.accessKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeAccessKeysResponse {\n");
        sb.append("    accessKeys: ").append(toIndentedString(accessKeys)).append("\n");
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
