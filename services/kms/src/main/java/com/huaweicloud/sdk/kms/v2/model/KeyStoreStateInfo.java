package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 密钥库状态详情
 */
public class KeyStoreStateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_id")

    private String keystoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_state")

    private String keystoreState;

    public KeyStoreStateInfo withKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
        return this;
    }

    /**
     * 密钥库ID
     * @return keystoreId
     */
    public String getKeystoreId() {
        return keystoreId;
    }

    public void setKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
    }

    public KeyStoreStateInfo withKeystoreState(String keystoreState) {
        this.keystoreState = keystoreState;
        return this;
    }

    /**
     * 密钥库状态
     * @return keystoreState
     */
    public String getKeystoreState() {
        return keystoreState;
    }

    public void setKeystoreState(String keystoreState) {
        this.keystoreState = keystoreState;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyStoreStateInfo keyStoreStateInfo = (KeyStoreStateInfo) o;
        return Objects.equals(this.keystoreId, keyStoreStateInfo.keystoreId)
            && Objects.equals(this.keystoreState, keyStoreStateInfo.keystoreState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keystoreId, keystoreState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyStoreStateInfo {\n");
        sb.append("    keystoreId: ").append(toIndentedString(keystoreId)).append("\n");
        sb.append("    keystoreState: ").append(toIndentedString(keystoreState)).append("\n");
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
