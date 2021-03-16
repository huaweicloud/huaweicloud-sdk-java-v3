package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 *  
 */
public class NovaKeypair  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fingerprint")
    
    private String fingerprint;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_key")
    
    private String publicKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_key")
    
    private String privateKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public NovaKeypair withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    


    /**
     * 密钥对应指纹信息。
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    

    public NovaKeypair withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 密钥名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public NovaKeypair withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    


    /**
     * 密钥对应publicKey信息。
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    

    public NovaKeypair withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    


    /**
     * 密钥对应privateKey信息。  - 创建SSH密钥时，响应中包括private_key的信息。 - 导入SSH密钥时，响应中不包括private_key的信息。
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    

    public NovaKeypair withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 密钥所属用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    public NovaKeypair withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 密钥类型，默认“ssh”  微版本2.2以上支持
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaKeypair novaKeypair = (NovaKeypair) o;
        return Objects.equals(this.fingerprint, novaKeypair.fingerprint) &&
            Objects.equals(this.name, novaKeypair.name) &&
            Objects.equals(this.publicKey, novaKeypair.publicKey) &&
            Objects.equals(this.privateKey, novaKeypair.privateKey) &&
            Objects.equals(this.userId, novaKeypair.userId) &&
            Objects.equals(this.type, novaKeypair.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fingerprint, name, publicKey, privateKey, userId, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaKeypair {\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

