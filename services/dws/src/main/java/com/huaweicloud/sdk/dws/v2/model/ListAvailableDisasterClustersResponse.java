package com.huaweicloud.sdk.dws.v2.model;

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
public class ListAvailableDisasterClustersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_clusters")

    private List<DisasterRecoveryClusterVo> disasterRecoveryClusters = null;

    public ListAvailableDisasterClustersResponse withDisasterRecoveryClusters(
        List<DisasterRecoveryClusterVo> disasterRecoveryClusters) {
        this.disasterRecoveryClusters = disasterRecoveryClusters;
        return this;
    }

    public ListAvailableDisasterClustersResponse addDisasterRecoveryClustersItem(
        DisasterRecoveryClusterVo disasterRecoveryClustersItem) {
        if (this.disasterRecoveryClusters == null) {
            this.disasterRecoveryClusters = new ArrayList<>();
        }
        this.disasterRecoveryClusters.add(disasterRecoveryClustersItem);
        return this;
    }

    public ListAvailableDisasterClustersResponse withDisasterRecoveryClusters(
        Consumer<List<DisasterRecoveryClusterVo>> disasterRecoveryClustersSetter) {
        if (this.disasterRecoveryClusters == null) {
            this.disasterRecoveryClusters = new ArrayList<>();
        }
        disasterRecoveryClustersSetter.accept(this.disasterRecoveryClusters);
        return this;
    }

    /**
     * **参数解释**： 容灾可用集群列表。 **取值范围**： 不涉及。
     * @return disasterRecoveryClusters
     */
    public List<DisasterRecoveryClusterVo> getDisasterRecoveryClusters() {
        return disasterRecoveryClusters;
    }

    public void setDisasterRecoveryClusters(List<DisasterRecoveryClusterVo> disasterRecoveryClusters) {
        this.disasterRecoveryClusters = disasterRecoveryClusters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAvailableDisasterClustersResponse that = (ListAvailableDisasterClustersResponse) obj;
        return Objects.equals(this.disasterRecoveryClusters, that.disasterRecoveryClusters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecoveryClusters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableDisasterClustersResponse {\n");
        sb.append("    disasterRecoveryClusters: ").append(toIndentedString(disasterRecoveryClusters)).append("\n");
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
