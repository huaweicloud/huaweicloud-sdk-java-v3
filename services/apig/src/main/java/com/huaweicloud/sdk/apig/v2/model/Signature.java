package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Signature */
public class Signature {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** 签名密钥类型： - hmac - basic - public_key - aes basic类型需要实例升级到对应版本，若不存在可联系技术工程师升级。
     * public_key类型开启实例配置public_key才可使用，实例特性配置详情请参考“附录 > 实例支持的APIC特性”，如确认实例不存在public_key配置可联系技术工程师开启。
     * aes类型需要实例升级到对应版本，若不存在可联系技术工程师升级。 */
    public static final class SignTypeEnum {

        /** Enum HMAC for value: "hmac" */
        public static final SignTypeEnum HMAC = new SignTypeEnum("hmac");

        /** Enum BASIC for value: "basic" */
        public static final SignTypeEnum BASIC = new SignTypeEnum("basic");

        /** Enum PUBLIC_KEY for value: "public_key" */
        public static final SignTypeEnum PUBLIC_KEY = new SignTypeEnum("public_key");

        /** Enum AES for value: "aes" */
        public static final SignTypeEnum AES = new SignTypeEnum("aes");

        private static final Map<String, SignTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SignTypeEnum> createStaticFields() {
            Map<String, SignTypeEnum> map = new HashMap<>();
            map.put("hmac", HMAC);
            map.put("basic", BASIC);
            map.put("public_key", PUBLIC_KEY);
            map.put("aes", AES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SignTypeEnum(String value) {
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
        public static SignTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SignTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SignTypeEnum(value);
            }
            return result;
        }

        public static SignTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SignTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SignTypeEnum) {
                return this.value.equals(((SignTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_type")

    private SignTypeEnum signType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_key")

    private String signKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_secret")

    private String signSecret;

    /** 签名算法。默认值为空，仅aes类型签名秘钥支持选择签名算法，其他类型签名秘钥不支持签名算法。 */
    public static final class SignAlgorithmEnum {

        /** Enum AES_128_CFB for value: "aes-128-cfb" */
        public static final SignAlgorithmEnum AES_128_CFB = new SignAlgorithmEnum("aes-128-cfb");

        /** Enum AES_256_CFB for value: "aes-256-cfb" */
        public static final SignAlgorithmEnum AES_256_CFB = new SignAlgorithmEnum("aes-256-cfb");

        private static final Map<String, SignAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SignAlgorithmEnum> createStaticFields() {
            Map<String, SignAlgorithmEnum> map = new HashMap<>();
            map.put("aes-128-cfb", AES_128_CFB);
            map.put("aes-256-cfb", AES_256_CFB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SignAlgorithmEnum(String value) {
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
        public static SignAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SignAlgorithmEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SignAlgorithmEnum(value);
            }
            return result;
        }

        public static SignAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SignAlgorithmEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SignAlgorithmEnum) {
                return this.value.equals(((SignAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_algorithm")

    private SignAlgorithmEnum signAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public Signature withName(String name) {
        this.name = name;
        return this;
    }

    /** 签名密钥的名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头。 > 中文字符必须为UTF-8或者unicode编码。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Signature withSignType(SignTypeEnum signType) {
        this.signType = signType;
        return this;
    }

    /** 签名密钥类型： - hmac - basic - public_key - aes basic类型需要实例升级到对应版本，若不存在可联系技术工程师升级。
     * public_key类型开启实例配置public_key才可使用，实例特性配置详情请参考“附录 > 实例支持的APIC特性”，如确认实例不存在public_key配置可联系技术工程师开启。
     * aes类型需要实例升级到对应版本，若不存在可联系技术工程师升级。
     * 
     * @return signType */
    public SignTypeEnum getSignType() {
        return signType;
    }

    public void setSignType(SignTypeEnum signType) {
        this.signType = signType;
    }

    public Signature withSignKey(String signKey) {
        this.signKey = signKey;
        return this;
    }

    /** 签名密钥的key。 - hmac类型的签名密钥key：支持英文，数字，下划线，中划线，且只能以英文字母或数字开头，8 ~ 32字符。未填写时后台自动生成。 -
     * basic类型的签名密钥key：支持英文，数字，下划线，中划线，且只能以英文字母开头，4 ~ 32字符。未填写时后台自动生成。 -
     * public_key类型的签名密钥key：支持英文，数字，下划线，中划线，+，/，=，可以英文字母，数字，+，/开头，8 ~ 512字符。未填写时后台自动生成。 -
     * aes类型的签名秘钥key：支持英文，数字，下划线，中划线，!，@，#，$，%，+，/，=，可以英文字母，数字，+，/开头，签名算法为aes-128-cfb时为16个字符，签名算法为aes-256-cfb时为32个字符。未填写时后台自动生成。
     * 
     * @return signKey */
    public String getSignKey() {
        return signKey;
    }

    public void setSignKey(String signKey) {
        this.signKey = signKey;
    }

    public Signature withSignSecret(String signSecret) {
        this.signSecret = signSecret;
        return this;
    }

    /** 签名密钥的密钥。 - hmac类型的签名密钥key：支持英文，数字，下划线，中划线，!，@，#，$，%，且只能以英文字母或数字开头，16 ~ 64字符。未填写时后台自动生成。 -
     * basic类型的签名密钥key：支持英文，数字，下划线，中划线，!，@，#，$，%，且只能以英文字母或数字开头，8 ~ 64字符。未填写时后台自动生成。 -
     * public_key类型的签名密钥key：支持英文，数字，下划线，中划线，!，@，#，$，%，+，/，=，可以英文字母，数字，+，/开头，15 ~ 2048字符。未填写时后台自动生成。 -
     * aes类型签名秘钥使用的向量：支持英文，数字，下划线，中划线，!，@，#，$，%，+，/，=，可以英文字母，数字，+，/开头，16个字符。未填写时后台自动生成。
     * 
     * @return signSecret */
    public String getSignSecret() {
        return signSecret;
    }

    public void setSignSecret(String signSecret) {
        this.signSecret = signSecret;
    }

    public Signature withSignAlgorithm(SignAlgorithmEnum signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
        return this;
    }

    /** 签名算法。默认值为空，仅aes类型签名秘钥支持选择签名算法，其他类型签名秘钥不支持签名算法。
     * 
     * @return signAlgorithm */
    public SignAlgorithmEnum getSignAlgorithm() {
        return signAlgorithm;
    }

    public void setSignAlgorithm(SignAlgorithmEnum signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
    }

    public Signature withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 更新时间
     * 
     * @return updateTime */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Signature withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间
     * 
     * @return createTime */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public Signature withId(String id) {
        this.id = id;
        return this;
    }

    /** 签名密钥的编号
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Signature signature = (Signature) o;
        return Objects.equals(this.name, signature.name) && Objects.equals(this.signType, signature.signType)
            && Objects.equals(this.signKey, signature.signKey) && Objects.equals(this.signSecret, signature.signSecret)
            && Objects.equals(this.signAlgorithm, signature.signAlgorithm)
            && Objects.equals(this.updateTime, signature.updateTime)
            && Objects.equals(this.createTime, signature.createTime) && Objects.equals(this.id, signature.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, signType, signKey, signSecret, signAlgorithm, updateTime, createTime, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Signature {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    signType: ").append(toIndentedString(signType)).append("\n");
        sb.append("    signKey: ").append(toIndentedString(signKey)).append("\n");
        sb.append("    signSecret: ").append(toIndentedString(signSecret)).append("\n");
        sb.append("    signAlgorithm: ").append(toIndentedString(signAlgorithm)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
