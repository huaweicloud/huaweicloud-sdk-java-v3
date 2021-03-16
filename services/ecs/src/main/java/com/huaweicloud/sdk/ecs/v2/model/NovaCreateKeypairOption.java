package com.huaweicloud.sdk.ecs.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 *  
 */
public class NovaCreateKeypairOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_key")
    
    private String publicKey;
    /**
     * 密钥类型，值为“ssh”或“x509”。  说明：  - 微版本2.2支持。
     */
    public static final class TypeEnum {

        
        /**
         * Enum SSH for value: "ssh"
         */
        public static final TypeEnum SSH = new TypeEnum("ssh");
        
        /**
         * Enum X509 for value: "x509"
         */
        public static final TypeEnum X509 = new TypeEnum("x509");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ssh", SSH);
            map.put("x509", X509);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;

    public NovaCreateKeypairOption withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    


    /**
     * 导入的公钥信息。  建议导入的公钥长度不大于1024字节。  说明：  - 长度超过1024字节会导致云服务器注入该密钥失败。
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    

    public NovaCreateKeypairOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 密钥类型，值为“ssh”或“x509”。  说明：  - 微版本2.2支持。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public NovaCreateKeypairOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 密钥名称。  新创建的密钥名称不能和已有密钥名称相同。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public NovaCreateKeypairOption withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 密钥的用户ID。  说明：  - 微版本2.10支持。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaCreateKeypairOption novaCreateKeypairOption = (NovaCreateKeypairOption) o;
        return Objects.equals(this.publicKey, novaCreateKeypairOption.publicKey) &&
            Objects.equals(this.type, novaCreateKeypairOption.type) &&
            Objects.equals(this.name, novaCreateKeypairOption.name) &&
            Objects.equals(this.userId, novaCreateKeypairOption.userId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicKey, type, name, userId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaCreateKeypairOption {\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

