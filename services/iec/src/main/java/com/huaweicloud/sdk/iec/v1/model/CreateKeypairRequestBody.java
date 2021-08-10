package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 创建秘钥对请求体。 */
public class CreateKeypairRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    public CreateKeypairRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 密钥对名称。 新创建的密钥名称不能和已有密钥名称相同。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateKeypairRequestBody withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /** 导入的公钥信息。 建议导入的公钥长度不大于1024字节。 > 长度超过1024字节会导致边缘实例注入该密钥失败。
     * 
     * @return publicKey */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateKeypairRequestBody createKeypairRequestBody = (CreateKeypairRequestBody) o;
        return Objects.equals(this.name, createKeypairRequestBody.name)
            && Objects.equals(this.publicKey, createKeypairRequestBody.publicKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publicKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKeypairRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
