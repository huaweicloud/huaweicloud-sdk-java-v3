package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 逻辑集群缩容请求体。  **约束限制**：  必须是非空值。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
 */
public class ShrinkLogicalClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_rings")

    private List<ClusterRing> clusterRings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_jobs")

    private Integer parallelJobs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public ShrinkLogicalClusterRequestBody withClusterRings(List<ClusterRing> clusterRings) {
        this.clusterRings = clusterRings;
        return this;
    }

    public ShrinkLogicalClusterRequestBody addClusterRingsItem(ClusterRing clusterRingsItem) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        this.clusterRings.add(clusterRingsItem);
        return this;
    }

    public ShrinkLogicalClusterRequestBody withClusterRings(Consumer<List<ClusterRing>> clusterRingsSetter) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        clusterRingsSetter.accept(this.clusterRings);
        return this;
    }

    /**
     * **参数解释**： 缩容主机环信息。  **约束限制**：  不涉及。 **取值范围**：  不涉及。 **默认取值**：  不涉及。
     * @return clusterRings
     */
    public List<ClusterRing> getClusterRings() {
        return clusterRings;
    }

    public void setClusterRings(List<ClusterRing> clusterRings) {
        this.clusterRings = clusterRings;
    }

    public ShrinkLogicalClusterRequestBody withParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
        return this;
    }

    /**
     * **参数解释**： 重分布并发配置数。  **约束限制**：  不涉及。 **取值范围**：  1~200。 **默认取值**：  4。
     * @return parallelJobs
     */
    public Integer getParallelJobs() {
        return parallelJobs;
    }

    public void setParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
    }

    public ShrinkLogicalClusterRequestBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**：  缩容模式。 **约束限制**：  不涉及。 **取值范围**：  read-only：离线模式 insert：在线模式 **默认取值**：  insert
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShrinkLogicalClusterRequestBody that = (ShrinkLogicalClusterRequestBody) obj;
        return Objects.equals(this.clusterRings, that.clusterRings)
            && Objects.equals(this.parallelJobs, that.parallelJobs) && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterRings, parallelJobs, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShrinkLogicalClusterRequestBody {\n");
        sb.append("    clusterRings: ").append(toIndentedString(clusterRings)).append("\n");
        sb.append("    parallelJobs: ").append(toIndentedString(parallelJobs)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
