package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowKmsKeyDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_alias")

    private String keyAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_state")

    private String keyState;

    public ShowKmsKeyDetailResponse withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * **参数解释**: 秘钥ID。 **取值范围**: 不涉及。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public ShowKmsKeyDetailResponse withKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
        return this;
    }

    /**
     * **参数解释**: 密钥别名。 **取值范围**: 不涉及。
     * @return keyAlias
     */
    public String getKeyAlias() {
        return keyAlias;
    }

    public void setKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
    }

    public ShowKmsKeyDetailResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**: 用户域ID。 **取值范围**: 不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowKmsKeyDetailResponse withKeyState(String keyState) {
        this.keyState = keyState;
        return this;
    }

    /**
     * **参数解释**: 秘钥状态。 **取值范围**: - “1”表示待激活状态。 - “2”表示启用状态。 - “3”表示禁用状态。 - “4”表示计划删除状态。 - “5”表示等待导入状态。
     * @return keyState
     */
    public String getKeyState() {
        return keyState;
    }

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKmsKeyDetailResponse that = (ShowKmsKeyDetailResponse) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.keyAlias, that.keyAlias)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.keyState, that.keyState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, keyAlias, domainId, keyState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKmsKeyDetailResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keyAlias: ").append(toIndentedString(keyAlias)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    keyState: ").append(toIndentedString(keyState)).append("\n");
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
