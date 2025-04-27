package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDnssecConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_name")

    private String zoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_tag")

    private Integer keyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private Integer flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest_algorithm")

    private String digestAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest_type")

    private Integer digestType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest")

    private String digest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    private String signature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_type")

    private Integer signatureType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ksk_public_key")

    private String kskPublicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ds_record")

    private String dsRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowDnssecConfigResponse withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * 域名。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public ShowDnssecConfigResponse withKeyTag(Integer keyTag) {
        this.keyTag = keyTag;
        return this;
    }

    /**
     * 密钥标签。
     * @return keyTag
     */
    public Integer getKeyTag() {
        return keyTag;
    }

    public void setKeyTag(Integer keyTag) {
        this.keyTag = keyTag;
    }

    public ShowDnssecConfigResponse withFlag(Integer flag) {
        this.flag = flag;
        return this;
    }

    /**
     * 旗标。
     * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public ShowDnssecConfigResponse withDigestAlgorithm(String digestAlgorithm) {
        this.digestAlgorithm = digestAlgorithm;
        return this;
    }

    /**
     * 摘要算法。
     * @return digestAlgorithm
     */
    public String getDigestAlgorithm() {
        return digestAlgorithm;
    }

    public void setDigestAlgorithm(String digestAlgorithm) {
        this.digestAlgorithm = digestAlgorithm;
    }

    public ShowDnssecConfigResponse withDigestType(Integer digestType) {
        this.digestType = digestType;
        return this;
    }

    /**
     * 摘要算法类型。
     * @return digestType
     */
    public Integer getDigestType() {
        return digestType;
    }

    public void setDigestType(Integer digestType) {
        this.digestType = digestType;
    }

    public ShowDnssecConfigResponse withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * 摘要。
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public ShowDnssecConfigResponse withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * 签名算法。
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public ShowDnssecConfigResponse withSignatureType(Integer signatureType) {
        this.signatureType = signatureType;
        return this;
    }

    /**
     * 签名算法类型。
     * @return signatureType
     */
    public Integer getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(Integer signatureType) {
        this.signatureType = signatureType;
    }

    public ShowDnssecConfigResponse withKskPublicKey(String kskPublicKey) {
        this.kskPublicKey = kskPublicKey;
        return this;
    }

    /**
     * 公有密钥。
     * @return kskPublicKey
     */
    public String getKskPublicKey() {
        return kskPublicKey;
    }

    public void setKskPublicKey(String kskPublicKey) {
        this.kskPublicKey = kskPublicKey;
    }

    public ShowDnssecConfigResponse withDsRecord(String dsRecord) {
        this.dsRecord = dsRecord;
        return this;
    }

    /**
     * DS记录。
     * @return dsRecord
     */
    public String getDsRecord() {
        return dsRecord;
    }

    public void setDsRecord(String dsRecord) {
        this.dsRecord = dsRecord;
    }

    public ShowDnssecConfigResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowDnssecConfigResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowDnssecConfigResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。  取值范围：  ENABLE：启用 DISABLE：关闭
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDnssecConfigResponse that = (ShowDnssecConfigResponse) obj;
        return Objects.equals(this.zoneName, that.zoneName) && Objects.equals(this.keyTag, that.keyTag)
            && Objects.equals(this.flag, that.flag) && Objects.equals(this.digestAlgorithm, that.digestAlgorithm)
            && Objects.equals(this.digestType, that.digestType) && Objects.equals(this.digest, that.digest)
            && Objects.equals(this.signature, that.signature) && Objects.equals(this.signatureType, that.signatureType)
            && Objects.equals(this.kskPublicKey, that.kskPublicKey) && Objects.equals(this.dsRecord, that.dsRecord)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneName,
            keyTag,
            flag,
            digestAlgorithm,
            digestType,
            digest,
            signature,
            signatureType,
            kskPublicKey,
            dsRecord,
            createdAt,
            updatedAt,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDnssecConfigResponse {\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    keyTag: ").append(toIndentedString(keyTag)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    digestAlgorithm: ").append(toIndentedString(digestAlgorithm)).append("\n");
        sb.append("    digestType: ").append(toIndentedString(digestType)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
        sb.append("    kskPublicKey: ").append(toIndentedString(kskPublicKey)).append("\n");
        sb.append("    dsRecord: ").append(toIndentedString(dsRecord)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
