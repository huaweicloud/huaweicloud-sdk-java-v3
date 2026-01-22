package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateInstanceRequestBody
 */
public class CreateInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 企业仓库实例规格，目前支持企业版(swr.ee.professional)
     */
    public static final class SpecEnum {

        /**
         * Enum SWR_EE_BASIC for value: "swr.ee.basic"
         */
        public static final SpecEnum SWR_EE_BASIC = new SpecEnum("swr.ee.basic");

        /**
         * Enum SWR_EE_PROFESSIONAL for value: "swr.ee.professional"
         */
        public static final SpecEnum SWR_EE_PROFESSIONAL = new SpecEnum("swr.ee.professional");

        private static final Map<String, SpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecEnum> createStaticFields() {
            Map<String, SpecEnum> map = new HashMap<>();
            map.put("swr.ee.basic", SWR_EE_BASIC);
            map.put("swr.ee.professional", SWR_EE_PROFESSIONAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecEnum(String value) {
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
        public static SpecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecEnum(value));
        }

        public static SpecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecEnum) {
                return this.value.equals(((SpecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SpecEnum spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    /**
     * 实例计费模式，目前只支持按需(postPaid)
     */
    public static final class ChargeModeEnum {

        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargeModeEnum POSTPAID = new ChargeModeEnum("postPaid");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("postPaid", POSTPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModeEnum(String value) {
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
        public static ChargeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargeModeEnum(value));
        }

        public static ChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChargeModeEnum chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_tags")

    private List<CreateInstanceRequestBodyResourceTags> resourceTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_encrypt")

    private Boolean obsEncrypt;

    /**
     * obs桶加密类型，空值使用AES-256加密算法, gm为国密加密算法
     */
    public static final class EncryptTypeEnum {

        /**
         * Enum GM for value: "gm"
         */
        public static final EncryptTypeEnum GM = new EncryptTypeEnum("gm");

        private static final Map<String, EncryptTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncryptTypeEnum> createStaticFields() {
            Map<String, EncryptTypeEnum> map = new HashMap<>();
            map.put("gm", GM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncryptTypeEnum(String value) {
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
        public static EncryptTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncryptTypeEnum(value));
        }

        public static EncryptTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncryptTypeEnum) {
                return this.value.equals(((EncryptTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_type")

    private EncryptTypeEnum encryptType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_enc_kms_key_id")

    private String obsEncKmsKeyId;

    public CreateInstanceRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 企业仓库实例名称，小写字母或数字开头，后面跟小写字母、数字、点、下划线或中划线（其中点、下划线、中划线不能直接连续），小写字母或数字结尾，3-64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstanceRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 企业仓库实例描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateInstanceRequestBody withSpec(SpecEnum spec) {
        this.spec = spec;
        return this;
    }

    /**
     * 企业仓库实例规格，目前支持企业版(swr.ee.professional)
     * @return spec
     */
    public SpecEnum getSpec() {
        return spec;
    }

    public void setSpec(SpecEnum spec) {
        this.spec = spec;
    }

    public CreateInstanceRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 用户虚拟私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateInstanceRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 用户子网的网络ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateInstanceRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * vpc和子网所在项目编号
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateInstanceRequestBody withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 实例计费模式，目前只支持按需(postPaid)
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public CreateInstanceRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目编号
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateInstanceRequestBody withResourceTags(List<CreateInstanceRequestBodyResourceTags> resourceTags) {
        this.resourceTags = resourceTags;
        return this;
    }

    public CreateInstanceRequestBody addResourceTagsItem(CreateInstanceRequestBodyResourceTags resourceTagsItem) {
        if (this.resourceTags == null) {
            this.resourceTags = new ArrayList<>();
        }
        this.resourceTags.add(resourceTagsItem);
        return this;
    }

    public CreateInstanceRequestBody withResourceTags(
        Consumer<List<CreateInstanceRequestBodyResourceTags>> resourceTagsSetter) {
        if (this.resourceTags == null) {
            this.resourceTags = new ArrayList<>();
        }
        resourceTagsSetter.accept(this.resourceTags);
        return this;
    }

    /**
     * 指定资源tag.
     * @return resourceTags
     */
    public List<CreateInstanceRequestBodyResourceTags> getResourceTags() {
        return resourceTags;
    }

    public void setResourceTags(List<CreateInstanceRequestBodyResourceTags> resourceTags) {
        this.resourceTags = resourceTags;
    }

    public CreateInstanceRequestBody withObsEncrypt(Boolean obsEncrypt) {
        this.obsEncrypt = obsEncrypt;
        return this;
    }

    /**
     * obs桶是否开启加密, 如果开启了加密，则可以根据encrypt_type指定加密算法
     * @return obsEncrypt
     */
    public Boolean getObsEncrypt() {
        return obsEncrypt;
    }

    public void setObsEncrypt(Boolean obsEncrypt) {
        this.obsEncrypt = obsEncrypt;
    }

    public CreateInstanceRequestBody withEncryptType(EncryptTypeEnum encryptType) {
        this.encryptType = encryptType;
        return this;
    }

    /**
     * obs桶加密类型，空值使用AES-256加密算法, gm为国密加密算法
     * @return encryptType
     */
    public EncryptTypeEnum getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(EncryptTypeEnum encryptType) {
        this.encryptType = encryptType;
    }

    public CreateInstanceRequestBody withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * 指定obs桶的名称，当指定自定义obs桶之后，则无需对obs_encrypt、encrypt_type进行传值。
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public CreateInstanceRequestBody withObsEncKmsKeyId(String obsEncKmsKeyId) {
        this.obsEncKmsKeyId = obsEncKmsKeyId;
        return this;
    }

    /**
     * KMS的密钥ID，用于对自动创建的OBS桶进行加密。密钥的加密算法支持AES-256和SM4。指定该字段时必须开启OBS桶加密开关，且不能指定自定义OBS桶。
     * @return obsEncKmsKeyId
     */
    public String getObsEncKmsKeyId() {
        return obsEncKmsKeyId;
    }

    public void setObsEncKmsKeyId(String obsEncKmsKeyId) {
        this.obsEncKmsKeyId = obsEncKmsKeyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceRequestBody that = (CreateInstanceRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.spec, that.spec) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.resourceTags, that.resourceTags) && Objects.equals(this.obsEncrypt, that.obsEncrypt)
            && Objects.equals(this.encryptType, that.encryptType)
            && Objects.equals(this.obsBucketName, that.obsBucketName)
            && Objects.equals(this.obsEncKmsKeyId, that.obsEncKmsKeyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            spec,
            vpcId,
            subnetId,
            projectId,
            chargeMode,
            enterpriseProjectId,
            resourceTags,
            obsEncrypt,
            encryptType,
            obsBucketName,
            obsEncKmsKeyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    resourceTags: ").append(toIndentedString(resourceTags)).append("\n");
        sb.append("    obsEncrypt: ").append(toIndentedString(obsEncrypt)).append("\n");
        sb.append("    encryptType: ").append(toIndentedString(encryptType)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    obsEncKmsKeyId: ").append(toIndentedString(obsEncKmsKeyId)).append("\n");
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
