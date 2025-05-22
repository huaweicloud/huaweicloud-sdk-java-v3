package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 编辑逻辑集群请求体。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class UpdateLogicalClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_rings")

    private List<ClusterRing> clusterRings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_for_killing")

    private Integer waitingForKilling;

    public UpdateLogicalClusterRequestBody withClusterRings(List<ClusterRing> clusterRings) {
        this.clusterRings = clusterRings;
        return this;
    }

    public UpdateLogicalClusterRequestBody addClusterRingsItem(ClusterRing clusterRingsItem) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        this.clusterRings.add(clusterRingsItem);
        return this;
    }

    public UpdateLogicalClusterRequestBody withClusterRings(Consumer<List<ClusterRing>> clusterRingsSetter) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        clusterRingsSetter.accept(this.clusterRings);
        return this;
    }

    /**
     * **参数解释**： 逻辑集群编辑环列表信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return clusterRings
     */
    public List<ClusterRing> getClusterRings() {
        return clusterRings;
    }

    public void setClusterRings(List<ClusterRing> clusterRings) {
        this.clusterRings = clusterRings;
    }

    public UpdateLogicalClusterRequestBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**： 重分布模式。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public UpdateLogicalClusterRequestBody withWaitingForKilling(Integer waitingForKilling) {
        this.waitingForKilling = waitingForKilling;
        return this;
    }

    /**
     * **参数解释**： 查杀作业等待时间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return waitingForKilling
     */
    public Integer getWaitingForKilling() {
        return waitingForKilling;
    }

    public void setWaitingForKilling(Integer waitingForKilling) {
        this.waitingForKilling = waitingForKilling;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLogicalClusterRequestBody that = (UpdateLogicalClusterRequestBody) obj;
        return Objects.equals(this.clusterRings, that.clusterRings) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.waitingForKilling, that.waitingForKilling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterRings, mode, waitingForKilling);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogicalClusterRequestBody {\n");
        sb.append("    clusterRings: ").append(toIndentedString(clusterRings)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    waitingForKilling: ").append(toIndentedString(waitingForKilling)).append("\n");
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
