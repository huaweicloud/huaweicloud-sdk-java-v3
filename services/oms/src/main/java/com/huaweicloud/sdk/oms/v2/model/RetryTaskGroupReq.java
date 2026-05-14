package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 重试迁移任务组请求参数
 */
public class RetryTaskGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_ak")

    private String srcAk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_sk")

    private String srcSk;

    /**
     * 加解密类型，默认为DEFAULT，可选类型为DEFAULT、KMS
     */
    public static final class SrcCryptoTypeEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final SrcCryptoTypeEnum DEFAULT = new SrcCryptoTypeEnum("DEFAULT");

        /**
         * Enum KMS for value: "KMS"
         */
        public static final SrcCryptoTypeEnum KMS = new SrcCryptoTypeEnum("KMS");

        private static final Map<String, SrcCryptoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SrcCryptoTypeEnum> createStaticFields() {
            Map<String, SrcCryptoTypeEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("KMS", KMS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SrcCryptoTypeEnum(String value) {
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
        public static SrcCryptoTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SrcCryptoTypeEnum(value));
        }

        public static SrcCryptoTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SrcCryptoTypeEnum) {
                return this.value.equals(((SrcCryptoTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_crypto_type")

    private SrcCryptoTypeEnum srcCryptoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_kms_key_id")

    private String srcKmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_string")

    private String connectionString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_auth_file")

    private String jsonAuthFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_ak")

    private String dstAk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_sk")

    private String dstSk;

    /**
     * 加解密类型，默认为DEFAULT，可选类型为DEFAULT、KMS
     */
    public static final class DstCryptoTypeEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final DstCryptoTypeEnum DEFAULT = new DstCryptoTypeEnum("DEFAULT");

        /**
         * Enum KMS for value: "KMS"
         */
        public static final DstCryptoTypeEnum KMS = new DstCryptoTypeEnum("KMS");

        private static final Map<String, DstCryptoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DstCryptoTypeEnum> createStaticFields() {
            Map<String, DstCryptoTypeEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("KMS", KMS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DstCryptoTypeEnum(String value) {
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
        public static DstCryptoTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DstCryptoTypeEnum(value));
        }

        public static DstCryptoTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DstCryptoTypeEnum) {
                return this.value.equals(((DstCryptoTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_crypto_type")

    private DstCryptoTypeEnum dstCryptoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_kms_key_id")

    private String dstKmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_cdn_authentication_key")

    private String sourceCdnAuthenticationKey;

    /**
     * 加解密类型，默认为DEFAULT，可选类型为DEFAULT、KMS
     */
    public static final class SourceCdnCryptoTypeEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final SourceCdnCryptoTypeEnum DEFAULT = new SourceCdnCryptoTypeEnum("DEFAULT");

        /**
         * Enum KMS for value: "KMS"
         */
        public static final SourceCdnCryptoTypeEnum KMS = new SourceCdnCryptoTypeEnum("KMS");

        private static final Map<String, SourceCdnCryptoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceCdnCryptoTypeEnum> createStaticFields() {
            Map<String, SourceCdnCryptoTypeEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("KMS", KMS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceCdnCryptoTypeEnum(String value) {
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
        public static SourceCdnCryptoTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceCdnCryptoTypeEnum(value));
        }

        public static SourceCdnCryptoTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceCdnCryptoTypeEnum) {
                return this.value.equals(((SourceCdnCryptoTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_cdn_crypto_type")

    private SourceCdnCryptoTypeEnum sourceCdnCryptoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_cdn_kms_key_id")

    private String sourceCdnKmsKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_failed_object")

    private Boolean migrateFailedObject;

    public RetryTaskGroupReq withSrcAk(String srcAk) {
        this.srcAk = srcAk;
        return this;
    }

    /**
     * 源端ak（最大长度100个字符）
     * @return srcAk
     */
    public String getSrcAk() {
        return srcAk;
    }

    public void setSrcAk(String srcAk) {
        this.srcAk = srcAk;
    }

    public RetryTaskGroupReq withSrcSk(String srcSk) {
        this.srcSk = srcSk;
        return this;
    }

    /**
     * 源端sk（最大长度100个字符）
     * @return srcSk
     */
    public String getSrcSk() {
        return srcSk;
    }

    public void setSrcSk(String srcSk) {
        this.srcSk = srcSk;
    }

    public RetryTaskGroupReq withSrcCryptoType(SrcCryptoTypeEnum srcCryptoType) {
        this.srcCryptoType = srcCryptoType;
        return this;
    }

    /**
     * 加解密类型，默认为DEFAULT，可选类型为DEFAULT、KMS
     * @return srcCryptoType
     */
    public SrcCryptoTypeEnum getSrcCryptoType() {
        return srcCryptoType;
    }

    public void setSrcCryptoType(SrcCryptoTypeEnum srcCryptoType) {
        this.srcCryptoType = srcCryptoType;
    }

    public RetryTaskGroupReq withSrcKmsKeyId(String srcKmsKeyId) {
        this.srcKmsKeyId = srcKmsKeyId;
        return this;
    }

    /**
     * KMS密钥ID，36个字符
     * @return srcKmsKeyId
     */
    public String getSrcKmsKeyId() {
        return srcKmsKeyId;
    }

    public void setSrcKmsKeyId(String srcKmsKeyId) {
        this.srcKmsKeyId = srcKmsKeyId;
    }

    public RetryTaskGroupReq withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * 连接字符串，用于微软云Blob鉴权
     * @return connectionString
     */
    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public RetryTaskGroupReq withJsonAuthFile(String jsonAuthFile) {
        this.jsonAuthFile = jsonAuthFile;
        return this;
    }

    /**
     * 用于谷歌云Cloud Storage鉴权
     * @return jsonAuthFile
     */
    public String getJsonAuthFile() {
        return jsonAuthFile;
    }

    public void setJsonAuthFile(String jsonAuthFile) {
        this.jsonAuthFile = jsonAuthFile;
    }

    public RetryTaskGroupReq withDstAk(String dstAk) {
        this.dstAk = dstAk;
        return this;
    }

    /**
     * 目的端ak（最大长度100个字符）
     * @return dstAk
     */
    public String getDstAk() {
        return dstAk;
    }

    public void setDstAk(String dstAk) {
        this.dstAk = dstAk;
    }

    public RetryTaskGroupReq withDstSk(String dstSk) {
        this.dstSk = dstSk;
        return this;
    }

    /**
     * 目的端sk（最大长度100个字符）
     * @return dstSk
     */
    public String getDstSk() {
        return dstSk;
    }

    public void setDstSk(String dstSk) {
        this.dstSk = dstSk;
    }

    public RetryTaskGroupReq withDstCryptoType(DstCryptoTypeEnum dstCryptoType) {
        this.dstCryptoType = dstCryptoType;
        return this;
    }

    /**
     * 加解密类型，默认为DEFAULT，可选类型为DEFAULT、KMS
     * @return dstCryptoType
     */
    public DstCryptoTypeEnum getDstCryptoType() {
        return dstCryptoType;
    }

    public void setDstCryptoType(DstCryptoTypeEnum dstCryptoType) {
        this.dstCryptoType = dstCryptoType;
    }

    public RetryTaskGroupReq withDstKmsKeyId(String dstKmsKeyId) {
        this.dstKmsKeyId = dstKmsKeyId;
        return this;
    }

    /**
     * KMS密钥ID，36个字符
     * @return dstKmsKeyId
     */
    public String getDstKmsKeyId() {
        return dstKmsKeyId;
    }

    public void setDstKmsKeyId(String dstKmsKeyId) {
        this.dstKmsKeyId = dstKmsKeyId;
    }

    public RetryTaskGroupReq withSourceCdnAuthenticationKey(String sourceCdnAuthenticationKey) {
        this.sourceCdnAuthenticationKey = sourceCdnAuthenticationKey;
        return this;
    }

    /**
     * cdn鉴权密钥
     * @return sourceCdnAuthenticationKey
     */
    public String getSourceCdnAuthenticationKey() {
        return sourceCdnAuthenticationKey;
    }

    public void setSourceCdnAuthenticationKey(String sourceCdnAuthenticationKey) {
        this.sourceCdnAuthenticationKey = sourceCdnAuthenticationKey;
    }

    public RetryTaskGroupReq withSourceCdnCryptoType(SourceCdnCryptoTypeEnum sourceCdnCryptoType) {
        this.sourceCdnCryptoType = sourceCdnCryptoType;
        return this;
    }

    /**
     * 加解密类型，默认为DEFAULT，可选类型为DEFAULT、KMS
     * @return sourceCdnCryptoType
     */
    public SourceCdnCryptoTypeEnum getSourceCdnCryptoType() {
        return sourceCdnCryptoType;
    }

    public void setSourceCdnCryptoType(SourceCdnCryptoTypeEnum sourceCdnCryptoType) {
        this.sourceCdnCryptoType = sourceCdnCryptoType;
    }

    public RetryTaskGroupReq withSourceCdnKmsKeyId(String sourceCdnKmsKeyId) {
        this.sourceCdnKmsKeyId = sourceCdnKmsKeyId;
        return this;
    }

    /**
     * KMS密钥ID，36个字符
     * @return sourceCdnKmsKeyId
     */
    public String getSourceCdnKmsKeyId() {
        return sourceCdnKmsKeyId;
    }

    public void setSourceCdnKmsKeyId(String sourceCdnKmsKeyId) {
        this.sourceCdnKmsKeyId = sourceCdnKmsKeyId;
    }

    public RetryTaskGroupReq withMigrateFailedObject(Boolean migrateFailedObject) {
        this.migrateFailedObject = migrateFailedObject;
        return this;
    }

    /**
     * 失败任务重试方式，标识是否为全量重新迁移，默认false（全量重新迁移）。 值为true时表示只重传失败对象。 值为空或者为false时表示全量重新迁移（默认跳过目的端已迁移对象）。
     * @return migrateFailedObject
     */
    public Boolean getMigrateFailedObject() {
        return migrateFailedObject;
    }

    public void setMigrateFailedObject(Boolean migrateFailedObject) {
        this.migrateFailedObject = migrateFailedObject;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryTaskGroupReq that = (RetryTaskGroupReq) obj;
        return Objects.equals(this.srcAk, that.srcAk) && Objects.equals(this.srcSk, that.srcSk)
            && Objects.equals(this.srcCryptoType, that.srcCryptoType)
            && Objects.equals(this.srcKmsKeyId, that.srcKmsKeyId)
            && Objects.equals(this.connectionString, that.connectionString)
            && Objects.equals(this.jsonAuthFile, that.jsonAuthFile) && Objects.equals(this.dstAk, that.dstAk)
            && Objects.equals(this.dstSk, that.dstSk) && Objects.equals(this.dstCryptoType, that.dstCryptoType)
            && Objects.equals(this.dstKmsKeyId, that.dstKmsKeyId)
            && Objects.equals(this.sourceCdnAuthenticationKey, that.sourceCdnAuthenticationKey)
            && Objects.equals(this.sourceCdnCryptoType, that.sourceCdnCryptoType)
            && Objects.equals(this.sourceCdnKmsKeyId, that.sourceCdnKmsKeyId)
            && Objects.equals(this.migrateFailedObject, that.migrateFailedObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcAk,
            srcSk,
            srcCryptoType,
            srcKmsKeyId,
            connectionString,
            jsonAuthFile,
            dstAk,
            dstSk,
            dstCryptoType,
            dstKmsKeyId,
            sourceCdnAuthenticationKey,
            sourceCdnCryptoType,
            sourceCdnKmsKeyId,
            migrateFailedObject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryTaskGroupReq {\n");
        sb.append("    srcAk: ").append(toIndentedString(srcAk)).append("\n");
        sb.append("    srcSk: ").append(toIndentedString(srcSk)).append("\n");
        sb.append("    srcCryptoType: ").append(toIndentedString(srcCryptoType)).append("\n");
        sb.append("    srcKmsKeyId: ").append(toIndentedString(srcKmsKeyId)).append("\n");
        sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
        sb.append("    jsonAuthFile: ").append(toIndentedString(jsonAuthFile)).append("\n");
        sb.append("    dstAk: ").append(toIndentedString(dstAk)).append("\n");
        sb.append("    dstSk: ").append(toIndentedString(dstSk)).append("\n");
        sb.append("    dstCryptoType: ").append(toIndentedString(dstCryptoType)).append("\n");
        sb.append("    dstKmsKeyId: ").append(toIndentedString(dstKmsKeyId)).append("\n");
        sb.append("    sourceCdnAuthenticationKey: ").append(toIndentedString(sourceCdnAuthenticationKey)).append("\n");
        sb.append("    sourceCdnCryptoType: ").append(toIndentedString(sourceCdnCryptoType)).append("\n");
        sb.append("    sourceCdnKmsKeyId: ").append(toIndentedString(sourceCdnKmsKeyId)).append("\n");
        sb.append("    migrateFailedObject: ").append(toIndentedString(migrateFailedObject)).append("\n");
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
