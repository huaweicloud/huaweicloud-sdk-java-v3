package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RotateKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_key_name")

    private String masterKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotate_key_time")

    private String rotateKeyTime;

    public RotateKeyResponse withMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
        return this;
    }

    /**
     * **参数解释**： KMS密钥名称 **取值范围**： 不涉及。
     * @return masterKeyName
     */
    public String getMasterKeyName() {
        return masterKeyName;
    }

    public void setMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
    }

    public RotateKeyResponse withClusterId(String clusterId) {
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

    public RotateKeyResponse withRotateKeyTime(String rotateKeyTime) {
        this.rotateKeyTime = rotateKeyTime;
        return this;
    }

    /**
     * **参数解释**： 轮转时间。 **取值范围**： 不涉及。
     * @return rotateKeyTime
     */
    public String getRotateKeyTime() {
        return rotateKeyTime;
    }

    public void setRotateKeyTime(String rotateKeyTime) {
        this.rotateKeyTime = rotateKeyTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RotateKeyResponse that = (RotateKeyResponse) obj;
        return Objects.equals(this.masterKeyName, that.masterKeyName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.rotateKeyTime, that.rotateKeyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterKeyName, clusterId, rotateKeyTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RotateKeyResponse {\n");
        sb.append("    masterKeyName: ").append(toIndentedString(masterKeyName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    rotateKeyTime: ").append(toIndentedString(rotateKeyTime)).append("\n");
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
