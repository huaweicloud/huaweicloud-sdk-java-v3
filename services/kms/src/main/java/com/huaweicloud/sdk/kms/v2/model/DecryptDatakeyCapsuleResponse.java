package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DecryptDatakeyCapsuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey")

    private String datakey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_cipher")

    private String datakeyCipher;

    public DecryptDatakeyCapsuleResponse withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * **参数解释：** 密钥ID **取值范围：** 不涉及
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public DecryptDatakeyCapsuleResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释：** 解密胶囊所在的实例ID **取值范围：** ECS ID，CCE的集群ID或者通用场景的access_point_id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DecryptDatakeyCapsuleResponse withDatakey(String datakey) {
        this.datakey = datakey;
        return this;
    }

    /**
     * **参数解释：** datakey和datakey_cipher响应二选一，如果请求参数中没传递public_key，则返回datakey **取值范围：** 不涉及
     * @return datakey
     */
    public String getDatakey() {
        return datakey;
    }

    public void setDatakey(String datakey) {
        this.datakey = datakey;
    }

    public DecryptDatakeyCapsuleResponse withDatakeyCipher(String datakeyCipher) {
        this.datakeyCipher = datakeyCipher;
        return this;
    }

    /**
     * **参数解释：** datakey和datakey_cipher响应二选一，如果请求参数中传递了public_key，使用public_key加密datakey后返回datakey_cipher **取值范围：** 不涉及
     * @return datakeyCipher
     */
    public String getDatakeyCipher() {
        return datakeyCipher;
    }

    public void setDatakeyCipher(String datakeyCipher) {
        this.datakeyCipher = datakeyCipher;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DecryptDatakeyCapsuleResponse that = (DecryptDatakeyCapsuleResponse) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.datakey, that.datakey) && Objects.equals(this.datakeyCipher, that.datakeyCipher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, instanceId, datakey, datakeyCipher);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecryptDatakeyCapsuleResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    datakey: ").append(toIndentedString(datakey)).append("\n");
        sb.append("    datakeyCipher: ").append(toIndentedString(datakeyCipher)).append("\n");
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
