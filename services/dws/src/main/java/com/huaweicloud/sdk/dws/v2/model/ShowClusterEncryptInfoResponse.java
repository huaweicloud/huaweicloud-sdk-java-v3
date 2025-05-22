package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowClusterEncryptInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_key_id")

    private String masterKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_key_name")

    private String masterKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_rotate_key_time")

    private String lastRotateKeyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crypt_algorithm")

    private String cryptAlgorithm;

    public ShowClusterEncryptInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 加密ID，仅DWS内部使用。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowClusterEncryptInfoResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。 **取值范围**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowClusterEncryptInfoResponse withMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
        return this;
    }

    /**
     * **参数解释**： KMS密钥ID。 **取值范围**： 不涉及。
     * @return masterKeyId
     */
    public String getMasterKeyId() {
        return masterKeyId;
    }

    public void setMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
    }

    public ShowClusterEncryptInfoResponse withMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
        return this;
    }

    /**
     * **参数解释**： KMS密钥名称。 **取值范围**： 不涉及。
     * @return masterKeyName
     */
    public String getMasterKeyName() {
        return masterKeyName;
    }

    public void setMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
    }

    public ShowClusterEncryptInfoResponse withLastRotateKeyTime(String lastRotateKeyTime) {
        this.lastRotateKeyTime = lastRotateKeyTime;
        return this;
    }

    /**
     * **参数解释**： 最后做密钥轮转的时间。 **取值范围**： 不涉及。
     * @return lastRotateKeyTime
     */
    public String getLastRotateKeyTime() {
        return lastRotateKeyTime;
    }

    public void setLastRotateKeyTime(String lastRotateKeyTime) {
        this.lastRotateKeyTime = lastRotateKeyTime;
    }

    public ShowClusterEncryptInfoResponse withCryptAlgorithm(String cryptAlgorithm) {
        this.cryptAlgorithm = cryptAlgorithm;
        return this;
    }

    /**
     * **参数解释**： 加密方式。 **取值范围**： 不涉及。
     * @return cryptAlgorithm
     */
    public String getCryptAlgorithm() {
        return cryptAlgorithm;
    }

    public void setCryptAlgorithm(String cryptAlgorithm) {
        this.cryptAlgorithm = cryptAlgorithm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterEncryptInfoResponse that = (ShowClusterEncryptInfoResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.masterKeyId, that.masterKeyId)
            && Objects.equals(this.masterKeyName, that.masterKeyName)
            && Objects.equals(this.lastRotateKeyTime, that.lastRotateKeyTime)
            && Objects.equals(this.cryptAlgorithm, that.cryptAlgorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clusterId, masterKeyId, masterKeyName, lastRotateKeyTime, cryptAlgorithm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterEncryptInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    masterKeyId: ").append(toIndentedString(masterKeyId)).append("\n");
        sb.append("    masterKeyName: ").append(toIndentedString(masterKeyName)).append("\n");
        sb.append("    lastRotateKeyTime: ").append(toIndentedString(lastRotateKeyTime)).append("\n");
        sb.append("    cryptAlgorithm: ").append(toIndentedString(cryptAlgorithm)).append("\n");
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
