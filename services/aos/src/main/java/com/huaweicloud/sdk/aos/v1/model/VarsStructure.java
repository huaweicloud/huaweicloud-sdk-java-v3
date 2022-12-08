package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.EncryptionStructure;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * HCL支持参数，即，同一个模板可以给予不同的参数而达到不同的效果。  var_structure可以允许客户提交最简单的字符串类型的参数  资源编排服务支持vars_structure，vars_body和vars_uri，如果他们中声名了同一个变量，将报错400  vars_structure中的值只支持简单的字符串类型，如果需要使用其他类型，需要用户自己在HCL引用时转换， 或者用户可以使用vars_uri、vars_body，vars_uri和vars_body中支持HCL支持的各种类型以及复杂结构  如果vars_structure过大，可以使用vars_uri  注意：vars中不应该传递任何敏感信息，资源编排服务会直接明文使用、log、展示、存储对应的vars 
 */
public class VarsStructure  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="var_key")
    
    
    private String varKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="var_value")
    
    
    private String varValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encryption")
    
    
    private EncryptionStructure encryption;

    public VarsStructure withVarKey(String varKey) {
        this.varKey = varKey;
        return this;
    }

    


    /**
     * 参数的名字
     * @return varKey
     */
    public String getVarKey() {
        return varKey;
    }

    public void setVarKey(String varKey) {
        this.varKey = varKey;
    }

    

    public VarsStructure withVarValue(String varValue) {
        this.varValue = varValue;
        return this;
    }

    


    /**
     * 参数的值。  注意，参数需要以字符串形式存在，如果是数字，也需要以字符串形式存在，如'10'。  如果需要支持不同类型，或者复杂结构，请使用vars_uri或vars_body 
     * @return varValue
     */
    public String getVarValue() {
        return varValue;
    }

    public void setVarValue(String varValue) {
        this.varValue = varValue;
    }

    

    public VarsStructure withEncryption(EncryptionStructure encryption) {
        this.encryption = encryption;
        return this;
    }

    public VarsStructure withEncryption(Consumer<EncryptionStructure> encryptionSetter) {
        if(this.encryption == null ){
            this.encryption = new EncryptionStructure();
            encryptionSetter.accept(this.encryption);
        }
        
        return this;
    }


    /**
     * Get encryption
     * @return encryption
     */
    public EncryptionStructure getEncryption() {
        return encryption;
    }

    public void setEncryption(EncryptionStructure encryption) {
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
        VarsStructure varsStructure = (VarsStructure) o;
        return Objects.equals(this.varKey, varsStructure.varKey) &&
            Objects.equals(this.varValue, varsStructure.varValue) &&
            Objects.equals(this.encryption, varsStructure.encryption);
    }
    @Override
    public int hashCode() {
        return Objects.hash(varKey, varValue, encryption);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VarsStructure {\n");
        sb.append("    varKey: ").append(toIndentedString(varKey)).append("\n");
        sb.append("    varValue: ").append(toIndentedString(varValue)).append("\n");
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

