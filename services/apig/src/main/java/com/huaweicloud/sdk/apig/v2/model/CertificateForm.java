package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 添加或编辑证书的请求体表单
 */
public class CertificateForm {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_content")

    private String certContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    /**
     * 证书可见范围
     */
    public static final class TypeEnum {

        /**
         * Enum INSTANCE for value: "instance"
         */
        public static final TypeEnum INSTANCE = new TypeEnum("instance");

        /**
         * Enum GLOBAL for value: "global"
         */
        public static final TypeEnum GLOBAL = new TypeEnum("global");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("instance", INSTANCE);
            map.put("global", GLOBAL);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trusted_root_ca")

    private String trustedRootCa;

    /**
     * 证书算法类型： - RSA - ECC - SM2
     */
    public static final class AlgorithmTypeEnum {

        /**
         * Enum RSA for value: "RSA"
         */
        public static final AlgorithmTypeEnum RSA = new AlgorithmTypeEnum("RSA");

        /**
         * Enum ECC for value: "ECC"
         */
        public static final AlgorithmTypeEnum ECC = new AlgorithmTypeEnum("ECC");

        /**
         * Enum SM2 for value: "SM2"
         */
        public static final AlgorithmTypeEnum SM2 = new AlgorithmTypeEnum("SM2");

        private static final Map<String, AlgorithmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlgorithmTypeEnum> createStaticFields() {
            Map<String, AlgorithmTypeEnum> map = new HashMap<>();
            map.put("RSA", RSA);
            map.put("ECC", ECC);
            map.put("SM2", SM2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlgorithmTypeEnum(String value) {
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
        public static AlgorithmTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlgorithmTypeEnum(value));
        }

        public static AlgorithmTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlgorithmTypeEnum) {
                return this.value.equals(((AlgorithmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private AlgorithmTypeEnum algorithmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_content_sign")

    private String certContentSign;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key_sign")

    private String privateKeySign;

    public CertificateForm withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 证书名称。支持中文，英文字母，数字，下划线，且只能以英文或汉字开头，4~50个字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CertificateForm withCertContent(String certContent) {
        this.certContent = certContent;
        return this;
    }

    /**
     * 证书内容
     * @return certContent
     */
    public String getCertContent() {
        return certContent;
    }

    public void setCertContent(String certContent) {
        this.certContent = certContent;
    }

    public CertificateForm withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 证书私钥
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public CertificateForm withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 证书可见范围
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CertificateForm withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 所属实例ID，当type=instance时必填
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CertificateForm withTrustedRootCa(String trustedRootCa) {
        this.trustedRootCa = trustedRootCa;
        return this;
    }

    /**
     * 信任的根证书CA
     * @return trustedRootCa
     */
    public String getTrustedRootCa() {
        return trustedRootCa;
    }

    public void setTrustedRootCa(String trustedRootCa) {
        this.trustedRootCa = trustedRootCa;
    }

    public CertificateForm withAlgorithmType(AlgorithmTypeEnum algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 证书算法类型： - RSA - ECC - SM2
     * @return algorithmType
     */
    public AlgorithmTypeEnum getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(AlgorithmTypeEnum algorithmType) {
        this.algorithmType = algorithmType;
    }

    public CertificateForm withCertContentSign(String certContentSign) {
        this.certContentSign = certContentSign;
        return this;
    }

    /**
     * 签名类型证书内容，仅algorithm_type=SM2时必填。
     * @return certContentSign
     */
    public String getCertContentSign() {
        return certContentSign;
    }

    public void setCertContentSign(String certContentSign) {
        this.certContentSign = certContentSign;
    }

    public CertificateForm withPrivateKeySign(String privateKeySign) {
        this.privateKeySign = privateKeySign;
        return this;
    }

    /**
     * 签名类型私钥内容，仅algorithm_type=SM2时必填。
     * @return privateKeySign
     */
    public String getPrivateKeySign() {
        return privateKeySign;
    }

    public void setPrivateKeySign(String privateKeySign) {
        this.privateKeySign = privateKeySign;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertificateForm that = (CertificateForm) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.certContent, that.certContent)
            && Objects.equals(this.privateKey, that.privateKey) && Objects.equals(this.type, that.type)
            && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.trustedRootCa, that.trustedRootCa)
            && Objects.equals(this.algorithmType, that.algorithmType)
            && Objects.equals(this.certContentSign, that.certContentSign)
            && Objects.equals(this.privateKeySign, that.privateKeySign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            certContent,
            privateKey,
            type,
            instanceId,
            trustedRootCa,
            algorithmType,
            certContentSign,
            privateKeySign);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateForm {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    certContent: ").append(toIndentedString(certContent)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    trustedRootCa: ").append(toIndentedString(trustedRootCa)).append("\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
        sb.append("    certContentSign: ").append(toIndentedString(certContentSign)).append("\n");
        sb.append("    privateKeySign: ").append(toIndentedString(privateKeySign)).append("\n");
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
