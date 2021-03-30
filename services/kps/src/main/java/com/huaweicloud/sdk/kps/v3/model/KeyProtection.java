package com.huaweicloud.sdk.kps.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kps.v3.model.Encryption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SSH密钥对私钥托管与保护。
 */
public class KeyProtection  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_key")
    
    private String privateKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encryption")
    
    private Encryption encryption;

    public KeyProtection withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    


    /**
     * 导入SSH密钥对的私钥。
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    

    public KeyProtection withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    public KeyProtection withEncryption(Consumer<Encryption> encryptionSetter) {
        if(this.encryption == null ){
            this.encryption = new Encryption();
            encryptionSetter.accept(this.encryption);
        }
        
        return this;
    }


    /**
     * Get encryption
     * @return encryption
     */
    public Encryption getEncryption() {
        return encryption;
    }

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyProtection keyProtection = (KeyProtection) o;
        return Objects.equals(this.privateKey, keyProtection.privateKey) &&
            Objects.equals(this.encryption, keyProtection.encryption);
    }
    @Override
    public int hashCode() {
        return Objects.hash(privateKey, encryption);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyProtection {\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
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

