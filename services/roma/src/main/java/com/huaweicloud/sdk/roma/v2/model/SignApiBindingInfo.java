package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SignApiBindingInfo
 */
public class SignApiBindingInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_id")

    @JacksonXmlProperty(localName = "publish_id")

    private String publishId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    @JacksonXmlProperty(localName = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_time")

    @JacksonXmlProperty(localName = "binding_time")

    private OffsetDateTime bindingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    @JacksonXmlProperty(localName = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    @JacksonXmlProperty(localName = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    @JacksonXmlProperty(localName = "api_type")

    private Integer apiType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    @JacksonXmlProperty(localName = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_remark")

    @JacksonXmlProperty(localName = "api_remark")

    private String apiRemark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_id")

    @JacksonXmlProperty(localName = "sign_id")

    private String signId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_name")

    @JacksonXmlProperty(localName = "sign_name")

    private String signName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_key")

    @JacksonXmlProperty(localName = "sign_key")

    private String signKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_secret")

    @JacksonXmlProperty(localName = "sign_secret")

    private String signSecret;

    /**
     * 签名密钥类型： - hmac - basic - public_key - aes  basic类型需要实例升级到对应版本，若不存在可联系技术工程师升级。  public_key类型开启实例配置public_key才可使用，实例特性配置详情请参考“附录 > 实例支持的APIC特性”，如确认实例不存在public_key配置可联系技术工程师开启。  aes类型需要实例升级到对应版本，若不存在可联系技术工程师升级。
     */
    public static final class SignTypeEnum {

        /**
         * Enum HMAC for value: "hmac"
         */
        public static final SignTypeEnum HMAC = new SignTypeEnum("hmac");

        /**
         * Enum BASIC for value: "basic"
         */
        public static final SignTypeEnum BASIC = new SignTypeEnum("basic");

        /**
         * Enum PUBLIC_KEY for value: "public_key"
         */
        public static final SignTypeEnum PUBLIC_KEY = new SignTypeEnum("public_key");

        /**
         * Enum AES for value: "aes"
         */
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

    @JacksonXmlProperty(localName = "sign_type")

    private SignTypeEnum signType;

    public SignApiBindingInfo withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    /**
     * API的发布编号
     * @return publishId
     */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public SignApiBindingInfo withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * API编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public SignApiBindingInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * API所属分组的名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public SignApiBindingInfo withBindingTime(OffsetDateTime bindingTime) {
        this.bindingTime = bindingTime;
        return this;
    }

    /**
     * 绑定时间
     * @return bindingTime
     */
    public OffsetDateTime getBindingTime() {
        return bindingTime;
    }

    public void setBindingTime(OffsetDateTime bindingTime) {
        this.bindingTime = bindingTime;
    }

    public SignApiBindingInfo withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * API所属环境的编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public SignApiBindingInfo withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * API所属环境的名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public SignApiBindingInfo withApiType(Integer apiType) {
        this.apiType = apiType;
        return this;
    }

    /**
     * API类型
     * @return apiType
     */
    public Integer getApiType() {
        return apiType;
    }

    public void setApiType(Integer apiType) {
        this.apiType = apiType;
    }

    public SignApiBindingInfo withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /**
     * API名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public SignApiBindingInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 绑定关系的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SignApiBindingInfo withApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
        return this;
    }

    /**
     * API描述
     * @return apiRemark
     */
    public String getApiRemark() {
        return apiRemark;
    }

    public void setApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
    }

    public SignApiBindingInfo withSignId(String signId) {
        this.signId = signId;
        return this;
    }

    /**
     * 签名密钥的编号
     * @return signId
     */
    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId;
    }

    public SignApiBindingInfo withSignName(String signName) {
        this.signName = signName;
        return this;
    }

    /**
     * 签名密钥的名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3 ~ 64字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return signName
     */
    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public SignApiBindingInfo withSignKey(String signKey) {
        this.signKey = signKey;
        return this;
    }

    /**
     * 签名密钥的key。 - hmac类型的签名密钥key：支持英文，数字，下划线，中划线，且只能以英文字母或数字开头，8 ~ 32字符。未填写时后台自动生成。 - basic类型的签名密钥key：支持英文，数字，下划线，中划线，且只能以英文字母开头，4 ~ 32字符。未填写时后台自动生成。 - public_key类型的签名密钥key：支持英文，数字，下划线，中划线，+，/，=，可以英文字母，数字，+，/开头，8 ~ 512字符。未填写时后台自动生成。 - aes类型的签名秘钥key：支持英文，数字，下划线，中划线，!，@，#，$，%，+，/，=，可以英文字母，数字，+，/开头，签名算法为aes-128-cfb时为16个字符，签名算法为aes-256-cfb时为32个字符。未填写时后台自动生成。
     * @return signKey
     */
    public String getSignKey() {
        return signKey;
    }

    public void setSignKey(String signKey) {
        this.signKey = signKey;
    }

    public SignApiBindingInfo withSignSecret(String signSecret) {
        this.signSecret = signSecret;
        return this;
    }

    /**
     * 签名密钥的密钥。 - hmac类型的签名密钥key：支持英文，数字，下划线，中划线，!，@，#，$，%，且只能以英文字母或数字开头，16 ~ 64字符。未填写时后台自动生成。 - basic类型的签名密钥key：支持英文，数字，下划线，中划线，!，@，#，$，%，且只能以英文字母或数字开头，8 ~ 64字符。未填写时后台自动生成。 - public_key类型的签名密钥key：支持英文，数字，下划线，中划线，!，@，#，$，%，+，/，=，可以英文字母，数字，+，/开头，15 ~ 2048字符。未填写时后台自动生成。 - aes类型签名秘钥使用的向量：支持英文，数字，下划线，中划线，!，@，#，$，%，+，/，=，可以英文字母，数字，+，/开头，16个字符。未填写时后台自动生成。
     * @return signSecret
     */
    public String getSignSecret() {
        return signSecret;
    }

    public void setSignSecret(String signSecret) {
        this.signSecret = signSecret;
    }

    public SignApiBindingInfo withSignType(SignTypeEnum signType) {
        this.signType = signType;
        return this;
    }

    /**
     * 签名密钥类型： - hmac - basic - public_key - aes  basic类型需要实例升级到对应版本，若不存在可联系技术工程师升级。  public_key类型开启实例配置public_key才可使用，实例特性配置详情请参考“附录 > 实例支持的APIC特性”，如确认实例不存在public_key配置可联系技术工程师开启。  aes类型需要实例升级到对应版本，若不存在可联系技术工程师升级。
     * @return signType
     */
    public SignTypeEnum getSignType() {
        return signType;
    }

    public void setSignType(SignTypeEnum signType) {
        this.signType = signType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SignApiBindingInfo signApiBindingInfo = (SignApiBindingInfo) o;
        return Objects.equals(this.publishId, signApiBindingInfo.publishId)
            && Objects.equals(this.apiId, signApiBindingInfo.apiId)
            && Objects.equals(this.groupName, signApiBindingInfo.groupName)
            && Objects.equals(this.bindingTime, signApiBindingInfo.bindingTime)
            && Objects.equals(this.envId, signApiBindingInfo.envId)
            && Objects.equals(this.envName, signApiBindingInfo.envName)
            && Objects.equals(this.apiType, signApiBindingInfo.apiType)
            && Objects.equals(this.apiName, signApiBindingInfo.apiName)
            && Objects.equals(this.id, signApiBindingInfo.id)
            && Objects.equals(this.apiRemark, signApiBindingInfo.apiRemark)
            && Objects.equals(this.signId, signApiBindingInfo.signId)
            && Objects.equals(this.signName, signApiBindingInfo.signName)
            && Objects.equals(this.signKey, signApiBindingInfo.signKey)
            && Objects.equals(this.signSecret, signApiBindingInfo.signSecret)
            && Objects.equals(this.signType, signApiBindingInfo.signType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishId,
            apiId,
            groupName,
            bindingTime,
            envId,
            envName,
            apiType,
            apiName,
            id,
            apiRemark,
            signId,
            signName,
            signKey,
            signSecret,
            signType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignApiBindingInfo {\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    bindingTime: ").append(toIndentedString(bindingTime)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    apiRemark: ").append(toIndentedString(apiRemark)).append("\n");
        sb.append("    signId: ").append(toIndentedString(signId)).append("\n");
        sb.append("    signName: ").append(toIndentedString(signName)).append("\n");
        sb.append("    signKey: ").append(toIndentedString(signKey)).append("\n");
        sb.append("    signSecret: ").append(toIndentedString(signSecret)).append("\n");
        sb.append("    signType: ").append(toIndentedString(signType)).append("\n");
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
