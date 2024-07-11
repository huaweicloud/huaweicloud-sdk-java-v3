package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeploymentHostsCopyRequest
 */
public class DeploymentHostsCopyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_uuids")

    private List<String> hostUuids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_group_id")

    private String targetGroupId;

    public DeploymentHostsCopyRequest withHostUuids(List<String> hostUuids) {
        this.hostUuids = hostUuids;
        return this;
    }

    public DeploymentHostsCopyRequest addHostUuidsItem(String hostUuidsItem) {
        if (this.hostUuids == null) {
            this.hostUuids = new ArrayList<>();
        }
        this.hostUuids.add(hostUuidsItem);
        return this;
    }

    public DeploymentHostsCopyRequest withHostUuids(Consumer<List<String>> hostUuidsSetter) {
        if (this.hostUuids == null) {
            this.hostUuids = new ArrayList<>();
        }
        hostUuidsSetter.accept(this.hostUuids);
        return this;
    }

    /**
     * 主机id列表
     * @return hostUuids
     */
    public List<String> getHostUuids() {
        return hostUuids;
    }

    public void setHostUuids(List<String> hostUuids) {
        this.hostUuids = hostUuids;
    }

    public DeploymentHostsCopyRequest withTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
        return this;
    }

    /**
     * 目标主机集群id
     * @return targetGroupId
     */
    public String getTargetGroupId() {
        return targetGroupId;
    }

    public void setTargetGroupId(String targetGroupId) {
        this.targetGroupId = targetGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeploymentHostsCopyRequest that = (DeploymentHostsCopyRequest) obj;
        return Objects.equals(this.hostUuids, that.hostUuids) && Objects.equals(this.targetGroupId, that.targetGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostUuids, targetGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentHostsCopyRequest {\n");
        sb.append("    hostUuids: ").append(toIndentedString(hostUuids)).append("\n");
        sb.append("    targetGroupId: ").append(toIndentedString(targetGroupId)).append("\n");
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
