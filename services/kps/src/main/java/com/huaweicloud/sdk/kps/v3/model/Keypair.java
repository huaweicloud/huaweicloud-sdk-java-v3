package com.huaweicloud.sdk.kps.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 密钥对信息 */
public class Keypair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** SSH密钥对的类型，值为“ssh”或“x509” */
    public static final class TypeEnum {

        /** Enum SSH for value: "ssh" */
        public static final TypeEnum SSH = new TypeEnum("ssh");

        /** Enum X509 for value: "x509" */
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
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
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
    @JsonProperty(value = "type")

    private TypeEnum type;

    /** 租户级或者用户级 */
    public static final class ScopeEnum {

        /** Enum DOMAIN for value: "domain" */
        public static final ScopeEnum DOMAIN = new ScopeEnum("domain");

        /** Enum USER for value: "user" */
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
            if (value == null) {
                return null;
            }
            ScopeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScopeEnum(value);
            }
            return result;
        }

        public static ScopeEnum valueOf(String value) {
            if (value == null) {
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
    @JsonProperty(value = "scope")

    private ScopeEnum scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private String fingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_key_protection")

    private Boolean isKeyProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_state")

    private String frozenState;

    public Keypair withName(String name) {
        this.name = name;
        return this;
    }

    /** SSH密钥对的名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Keypair withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** SSH密钥对的类型，值为“ssh”或“x509”
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Keypair withScope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /** 租户级或者用户级
     * 
     * @return scope */
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public Keypair withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /** SSH密钥对对应的publicKey信息
     * 
     * @return publicKey */
    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public Keypair withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /** SSH密钥对应指纹信息
     * 
     * @return fingerprint */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public Keypair withIsKeyProtection(Boolean isKeyProtection) {
        this.isKeyProtection = isKeyProtection;
        return this;
    }

    /** 是否托管密钥
     * 
     * @return isKeyProtection */
    public Boolean getIsKeyProtection() {
        return isKeyProtection;
    }

    public void setIsKeyProtection(Boolean isKeyProtection) {
        this.isKeyProtection = isKeyProtection;
    }

    public Keypair withFrozenState(String frozenState) {
        this.frozenState = frozenState;
        return this;
    }

    /** 冻结状态 - 0：正常状态 - 1：普通冻结 - 2：公安冻结 - 3：普通冻结及公安冻结 - 4：违规冻结 - 5：普通冻结及违规冻结 - 6：公安冻结及违规冻结 - 7：普通冻结、公安冻结及违规冻结 -
     * 8：未实名认证冻结 - 9：普通冻结及未实名认证冻结 - 10：公安冻结及未实名认证冻结
     * 
     * @return frozenState */
    public String getFrozenState() {
        return frozenState;
    }

    public void setFrozenState(String frozenState) {
        this.frozenState = frozenState;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Keypair keypair = (Keypair) o;
        return Objects.equals(this.name, keypair.name) && Objects.equals(this.type, keypair.type)
            && Objects.equals(this.scope, keypair.scope) && Objects.equals(this.publicKey, keypair.publicKey)
            && Objects.equals(this.fingerprint, keypair.fingerprint)
            && Objects.equals(this.isKeyProtection, keypair.isKeyProtection)
            && Objects.equals(this.frozenState, keypair.frozenState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, scope, publicKey, fingerprint, isKeyProtection, frozenState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Keypair {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    isKeyProtection: ").append(toIndentedString(isKeyProtection)).append("\n");
        sb.append("    frozenState: ").append(toIndentedString(frozenState)).append("\n");
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
