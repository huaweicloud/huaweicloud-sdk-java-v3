package com.huaweicloud.sdk.kps.v3.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kps.v3.model.KeyProtection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建密钥对请求体请求参数
 */
public class CreateKeypairAction  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * SSH密钥对的类型
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
            return value;
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
            if (obj instanceof TypeEnum) {
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
    @JsonProperty(value="public_key")
    
    private String publicKey;
    /**
     * 租户级或者用户级
     */
    public static final class ScopeEnum {

        
        /**
         * Enum DOMAIN for value: "domain"
         */
        public static final ScopeEnum DOMAIN = new ScopeEnum("domain");
        
        /**
         * Enum USER for value: "user"
         */
        public static final ScopeEnum USER = new ScopeEnum("user");
        

        private static final Map<String, ScopeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScopeEnum> createStaticFields() {
            Map<String, ScopeEnum> map = new HashMap<>();
            map.put("domain", DOMAIN);
            map.put("user", USER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScopeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScopeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ScopeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScopeEnum(value);
            }
            return result;
        }

        public static ScopeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ScopeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScopeEnum) {
                return this.value.equals(((ScopeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scope")
    
    private ScopeEnum scope;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_protection")
    
    private KeyProtection keyProtection;

    public CreateKeypairAction withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * SSH密钥对的名称。 - 新创建的密钥对名称不能和已有密钥对的名称相同。 - SSH密钥对名称由英文字母、数字、下划线、中划线组成，长度不能超过64个字节
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public CreateKeypairAction withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * SSH密钥对的类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public CreateKeypairAction withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    


    /**
     * 导入公钥的字符串信息。
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    

    public CreateKeypairAction withScope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    


    /**
     * 租户级或者用户级
     * @return scope
     */
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    

    public CreateKeypairAction withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * SSH密钥对所属的用户信息
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    public CreateKeypairAction withKeyProtection(KeyProtection keyProtection) {
        this.keyProtection = keyProtection;
        return this;
    }

    public CreateKeypairAction withKeyProtection(Consumer<KeyProtection> keyProtectionSetter) {
        if(this.keyProtection == null ){
            this.keyProtection = new KeyProtection();
            keyProtectionSetter.accept(this.keyProtection);
        }
        
        return this;
    }


    /**
     * Get keyProtection
     * @return keyProtection
     */
    public KeyProtection getKeyProtection() {
        return keyProtection;
    }

    public void setKeyProtection(KeyProtection keyProtection) {
        this.keyProtection = keyProtection;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateKeypairAction createKeypairAction = (CreateKeypairAction) o;
        return Objects.equals(this.name, createKeypairAction.name) &&
            Objects.equals(this.type, createKeypairAction.type) &&
            Objects.equals(this.publicKey, createKeypairAction.publicKey) &&
            Objects.equals(this.scope, createKeypairAction.scope) &&
            Objects.equals(this.userId, createKeypairAction.userId) &&
            Objects.equals(this.keyProtection, createKeypairAction.keyProtection);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, type, publicKey, scope, userId, keyProtection);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKeypairAction {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    keyProtection: ").append(toIndentedString(keyProtection)).append("\n");
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

