package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdateKeyRotationIntervalRequestBody
 */
public class UpdateKeyRotationIntervalRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    @JacksonXmlProperty(localName = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation_interval")

    @JacksonXmlProperty(localName = "rotation_interval")

    private Integer rotationInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    @JacksonXmlProperty(localName = "sequence")

    private String sequence;

    public UpdateKeyRotationIntervalRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * 密钥ID，36字节，满足正则匹配“^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$”。 例如：0d0466b0-e727-4d9c-b35d-f84bb474a37f。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public UpdateKeyRotationIntervalRequestBody withRotationInterval(Integer rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }

    /**
     * 轮换周期，取值范围为30~365的整数。 周期范围设置根据密钥使用频率进行，若密钥使用频率高，建议设置为短周期；反之，则设置为长周期。
     * minimum: 30
     * maximum: 365
     * @return rotationInterval
     */
    public Integer getRotationInterval() {
        return rotationInterval;
    }

    public void setRotationInterval(Integer rotationInterval) {
        this.rotationInterval = rotationInterval;
    }

    public UpdateKeyRotationIntervalRequestBody withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 请求消息序列号，36字节序列号。 例如：919c82d4-8046-4722-9094-35c3c6524cff
     * @return sequence
     */
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateKeyRotationIntervalRequestBody updateKeyRotationIntervalRequestBody =
            (UpdateKeyRotationIntervalRequestBody) o;
        return Objects.equals(this.keyId, updateKeyRotationIntervalRequestBody.keyId)
            && Objects.equals(this.rotationInterval, updateKeyRotationIntervalRequestBody.rotationInterval)
            && Objects.equals(this.sequence, updateKeyRotationIntervalRequestBody.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, rotationInterval, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeyRotationIntervalRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
