package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTdeStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tde_status")

    private String tdeStatus;

    public ShowTdeStatusResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowTdeStatusResponse withTdeStatus(String tdeStatus) {
        this.tdeStatus = tdeStatus;
        return this;
    }

    /**
     * TDE状态
     * @return tdeStatus
     */
    public String getTdeStatus() {
        return tdeStatus;
    }

    public void setTdeStatus(String tdeStatus) {
        this.tdeStatus = tdeStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTdeStatusResponse that = (ShowTdeStatusResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.tdeStatus, that.tdeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, tdeStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTdeStatusResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    tdeStatus: ").append(toIndentedString(tdeStatus)).append("\n");
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
