package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImportPrivateKeyKeypairBean
 */
public class ImportPrivateKeyKeypairBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_protection")

    private ImportPrivateKeyProtection keyProtection;

    public ImportPrivateKeyKeypairBean withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * SSH密钥对的名称。 - 新创建的密钥对名称不能和已有密钥对的名称相同。 - SSH密钥对名称由英文字母、数字、下划线、中划线组成，长度不能超过64个字节
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImportPrivateKeyKeypairBean withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * SSH密钥对所属的用户信息
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ImportPrivateKeyKeypairBean withKeyProtection(ImportPrivateKeyProtection keyProtection) {
        this.keyProtection = keyProtection;
        return this;
    }

    public ImportPrivateKeyKeypairBean withKeyProtection(Consumer<ImportPrivateKeyProtection> keyProtectionSetter) {
        if (this.keyProtection == null) {
            this.keyProtection = new ImportPrivateKeyProtection();
            keyProtectionSetter.accept(this.keyProtection);
        }

        return this;
    }

    /**
     * Get keyProtection
     * @return keyProtection
     */
    public ImportPrivateKeyProtection getKeyProtection() {
        return keyProtection;
    }

    public void setKeyProtection(ImportPrivateKeyProtection keyProtection) {
        this.keyProtection = keyProtection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportPrivateKeyKeypairBean that = (ImportPrivateKeyKeypairBean) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.keyProtection, that.keyProtection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, userId, keyProtection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportPrivateKeyKeypairBean {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    keyProtection: ").append(toIndentedString(keyProtection)).append("\n");
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
