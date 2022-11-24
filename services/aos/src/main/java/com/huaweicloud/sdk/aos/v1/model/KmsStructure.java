package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 如果用户给与的var_value是经过KMS加密的，可以通过传递相关加密信息，RF在使用的时候会帮助用户进行KMS解密  更多关于KMS加密介绍见：https://support.huaweicloud.com/productdesc-dew/dew_01_0006.html  * 注意：KMS每个月有免费试用的额度，如果超过，则KMS需要收费，此费用不是RF收取， 具体标准见：https://www.huaweicloud.com/pricing.html?tab&#x3D;detail#/dew  * 注意：KMS加密只代表RF在存储和传输的时候传递的是密文，但是在stack-events中依然是明文，如果希望在log中以密文形式对待， 请在模板中声名sensitive，更多关于sensitive的介绍见：https://learn.hashicorp.com/tutorials/terraform/sensitive-variables 
 */
public class KmsStructure  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cipher_text")
    
    
    private String cipherText;

    public KmsStructure withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 解密时，RF应该使用的KMS秘钥的ID，通常是加密时所使用的秘钥ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public KmsStructure withCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }

    


    /**
     * 数据加密秘钥所对应的密文
     * @return cipherText
     */
    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KmsStructure kmsStructure = (KmsStructure) o;
        return Objects.equals(this.id, kmsStructure.id) &&
            Objects.equals(this.cipherText, kmsStructure.cipherText);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, cipherText);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KmsStructure {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cipherText: ").append(toIndentedString(cipherText)).append("\n");
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

