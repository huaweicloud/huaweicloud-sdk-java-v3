package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVaultTagRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    @JacksonXmlProperty(localName = "vault_id")

    private String vaultId;

    public DeleteVaultTagRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 不能为空或空字符串，不检查长度和字符集，去掉key前后的空格后检查，去掉key前后的空格后使用。 即使底层存在非法的tag也要能删。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DeleteVaultTagRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 资源id
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteVaultTagRequest deleteVaultTagRequest = (DeleteVaultTagRequest) o;
        return Objects.equals(this.key, deleteVaultTagRequest.key)
            && Objects.equals(this.vaultId, deleteVaultTagRequest.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVaultTagRequest {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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
