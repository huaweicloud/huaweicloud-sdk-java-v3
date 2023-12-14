package com.huaweicloud.sdk.live.v1.model;

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
public class CreateUrlAuthchainResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keychain")

    private List<String> keychain = null;

    public CreateUrlAuthchainResponse withKeychain(List<String> keychain) {
        this.keychain = keychain;
        return this;
    }

    public CreateUrlAuthchainResponse addKeychainItem(String keychainItem) {
        if (this.keychain == null) {
            this.keychain = new ArrayList<>();
        }
        this.keychain.add(keychainItem);
        return this;
    }

    public CreateUrlAuthchainResponse withKeychain(Consumer<List<String>> keychainSetter) {
        if (this.keychain == null) {
            this.keychain = new ArrayList<>();
        }
        keychainSetter.accept(this.keychain);
        return this;
    }

    /**
     * 生成的鉴权串列表
     * @return keychain
     */
    public List<String> getKeychain() {
        return keychain;
    }

    public void setKeychain(List<String> keychain) {
        this.keychain = keychain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUrlAuthchainResponse that = (CreateUrlAuthchainResponse) obj;
        return Objects.equals(this.keychain, that.keychain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keychain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUrlAuthchainResponse {\n");
        sb.append("    keychain: ").append(toIndentedString(keychain)).append("\n");
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
