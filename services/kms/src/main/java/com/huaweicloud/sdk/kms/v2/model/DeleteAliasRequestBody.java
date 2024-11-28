package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除别名请求消息体
 */
public class DeleteAliasRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aliases")

    private List<String> aliases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    public DeleteAliasRequestBody withAliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    public DeleteAliasRequestBody addAliasesItem(String aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    public DeleteAliasRequestBody withAliases(Consumer<List<String>> aliasesSetter) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<>();
        }
        aliasesSetter.accept(this.aliases);
        return this;
    }

    /**
     * 待删除的别名
     * @return aliases
     */
    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public DeleteAliasRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * 别名关联的密钥ID
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAliasRequestBody that = (DeleteAliasRequestBody) obj;
        return Objects.equals(this.aliases, that.aliases) && Objects.equals(this.keyId, that.keyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aliases, keyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAliasRequestBody {\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
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
