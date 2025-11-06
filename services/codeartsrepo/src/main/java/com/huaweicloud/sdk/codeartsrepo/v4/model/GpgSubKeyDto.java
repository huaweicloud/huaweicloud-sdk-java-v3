package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GpgSubKeyDto
 */
public class GpgSubKeyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private String fingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpg_key_id")

    private Integer gpgKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyid")

    private String keyid;

    public GpgSubKeyDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 子公钥subkey的id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GpgSubKeyDto withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * **参数解释：** 子公钥的指纹格式。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public GpgSubKeyDto withGpgKeyId(Integer gpgKeyId) {
        this.gpgKeyId = gpgKeyId;
        return this;
    }

    /**
     * **参数解释：** gpg_key的id。
     * minimum: 1
     * maximum: 2147483647
     * @return gpgKeyId
     */
    public Integer getGpgKeyId() {
        return gpgKeyId;
    }

    public void setGpgKeyId(Integer gpgKeyId) {
        this.gpgKeyId = gpgKeyId;
    }

    public GpgSubKeyDto withKeyid(String keyid) {
        this.keyid = keyid;
        return this;
    }

    /**
     * **参数解释：** 子密钥的id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return keyid
     */
    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GpgSubKeyDto that = (GpgSubKeyDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.fingerprint, that.fingerprint)
            && Objects.equals(this.gpgKeyId, that.gpgKeyId) && Objects.equals(this.keyid, that.keyid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fingerprint, gpgKeyId, keyid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GpgSubKeyDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    gpgKeyId: ").append(toIndentedString(gpgKeyId)).append("\n");
        sb.append("    keyid: ").append(toIndentedString(keyid)).append("\n");
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
