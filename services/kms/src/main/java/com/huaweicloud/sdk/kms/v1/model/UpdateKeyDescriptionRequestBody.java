package com.huaweicloud.sdk.kms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdateKeyDescriptionRequestBody
 */
public class UpdateKeyDescriptionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    @JacksonXmlProperty(localName = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_description")

    @JacksonXmlProperty(localName = "key_description")

    private String keyDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    @JacksonXmlProperty(localName = "sequence")

    private String sequence;

    public UpdateKeyDescriptionRequestBody withKeyId(String keyId) {
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

    public UpdateKeyDescriptionRequestBody withKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
        return this;
    }

    /**
     * 密钥描述，取值0到255字符。
     * @return keyDescription
     */
    public String getKeyDescription() {
        return keyDescription;
    }

    public void setKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
    }

    public UpdateKeyDescriptionRequestBody withSequence(String sequence) {
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
        UpdateKeyDescriptionRequestBody updateKeyDescriptionRequestBody = (UpdateKeyDescriptionRequestBody) o;
        return Objects.equals(this.keyId, updateKeyDescriptionRequestBody.keyId)
            && Objects.equals(this.keyDescription, updateKeyDescriptionRequestBody.keyDescription)
            && Objects.equals(this.sequence, updateKeyDescriptionRequestBody.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, keyDescription, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeyDescriptionRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keyDescription: ").append(toIndentedString(keyDescription)).append("\n");
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
