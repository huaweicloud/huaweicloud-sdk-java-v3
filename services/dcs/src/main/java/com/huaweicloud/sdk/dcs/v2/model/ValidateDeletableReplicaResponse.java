package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ValidateDeletableReplicaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_result")

    private Boolean checkResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone")

    private String availableZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_list")

    private List<ReplicationInfo> replicationList = null;

    public ValidateDeletableReplicaResponse withCheckResult(Boolean checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    /**
     * 是否有可供选择的副本组进行删除。
     * @return checkResult
     */
    public Boolean getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Boolean checkResult) {
        this.checkResult = checkResult;
    }

    public ValidateDeletableReplicaResponse withAvailableZone(String availableZone) {
        this.availableZone = availableZone;
        return this;
    }

    /**
     * 可选的可用区ID列表
     * @return availableZone
     */
    public String getAvailableZone() {
        return availableZone;
    }

    public void setAvailableZone(String availableZone) {
        this.availableZone = availableZone;
    }

    public ValidateDeletableReplicaResponse withReplicationList(List<ReplicationInfo> replicationList) {
        this.replicationList = replicationList;
        return this;
    }

    public ValidateDeletableReplicaResponse addReplicationListItem(ReplicationInfo replicationListItem) {
        if (this.replicationList == null) {
            this.replicationList = new ArrayList<>();
        }
        this.replicationList.add(replicationListItem);
        return this;
    }

    public ValidateDeletableReplicaResponse withReplicationList(Consumer<List<ReplicationInfo>> replicationListSetter) {
        if (this.replicationList == null) {
            this.replicationList = new ArrayList<>();
        }
        replicationListSetter.accept(this.replicationList);
        return this;
    }

    /**
     * 可选的保留节点列表
     * @return replicationList
     */
    public List<ReplicationInfo> getReplicationList() {
        return replicationList;
    }

    public void setReplicationList(List<ReplicationInfo> replicationList) {
        this.replicationList = replicationList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateDeletableReplicaResponse that = (ValidateDeletableReplicaResponse) obj;
        return Objects.equals(this.checkResult, that.checkResult)
            && Objects.equals(this.availableZone, that.availableZone)
            && Objects.equals(this.replicationList, that.replicationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkResult, availableZone, replicationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateDeletableReplicaResponse {\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
        sb.append("    availableZone: ").append(toIndentedString(availableZone)).append("\n");
        sb.append("    replicationList: ").append(toIndentedString(replicationList)).append("\n");
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
