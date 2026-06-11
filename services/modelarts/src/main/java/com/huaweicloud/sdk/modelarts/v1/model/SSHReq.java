package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SSH连接信息。
 */
public class SSHReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_pair_names")

    private List<String> keyPairNames = null;

    public SSHReq withKeyPairNames(List<String> keyPairNames) {
        this.keyPairNames = keyPairNames;
        return this;
    }

    public SSHReq addKeyPairNamesItem(String keyPairNamesItem) {
        if (this.keyPairNames == null) {
            this.keyPairNames = new ArrayList<>();
        }
        this.keyPairNames.add(keyPairNamesItem);
        return this;
    }

    public SSHReq withKeyPairNames(Consumer<List<String>> keyPairNamesSetter) {
        if (this.keyPairNames == null) {
            this.keyPairNames = new ArrayList<>();
        }
        keyPairNamesSetter.accept(this.keyPairNames);
        return this;
    }

    /**
     * SSH密钥对名称，可以在云服务器控制台（ECS）“密钥对”页面创建和查看。
     * @return keyPairNames
     */
    public List<String> getKeyPairNames() {
        return keyPairNames;
    }

    public void setKeyPairNames(List<String> keyPairNames) {
        this.keyPairNames = keyPairNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SSHReq that = (SSHReq) obj;
        return Objects.equals(this.keyPairNames, that.keyPairNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyPairNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSHReq {\n");
        sb.append("    keyPairNames: ").append(toIndentedString(keyPairNames)).append("\n");
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
