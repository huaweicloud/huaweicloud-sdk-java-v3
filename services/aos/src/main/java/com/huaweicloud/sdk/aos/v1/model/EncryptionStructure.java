package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.KmsStructure;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 如果用户传递的var_value是已经加密过的，可以通过声名此项以要求资源编排服务在使用前进行解密，目前暂时只支持KMS加解密
 */
public class EncryptionStructure  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kms")
    
    
    private KmsStructure kms;

    public EncryptionStructure withKms(KmsStructure kms) {
        this.kms = kms;
        return this;
    }

    public EncryptionStructure withKms(Consumer<KmsStructure> kmsSetter) {
        if(this.kms == null ){
            this.kms = new KmsStructure();
            kmsSetter.accept(this.kms);
        }
        
        return this;
    }


    /**
     * Get kms
     * @return kms
     */
    public KmsStructure getKms() {
        return kms;
    }

    public void setKms(KmsStructure kms) {
        this.kms = kms;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EncryptionStructure encryptionStructure = (EncryptionStructure) o;
        return Objects.equals(this.kms, encryptionStructure.kms);
    }
    @Override
    public int hashCode() {
        return Objects.hash(kms);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptionStructure {\n");
        sb.append("    kms: ").append(toIndentedString(kms)).append("\n");
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

