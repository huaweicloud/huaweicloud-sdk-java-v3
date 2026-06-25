package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备份用量详情
 */
public class Spaces {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private Double obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot")

    private Double snapshot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_free")

    private Double obsFree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_free")

    private Double snapshotFree;

    public Spaces withObs(Double obs) {
        this.obs = obs;
        return this;
    }

    /**
     * **参数解释**：  日志备份用量，单位MB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return obs
     */
    public Double getObs() {
        return obs;
    }

    public void setObs(Double obs) {
        this.obs = obs;
    }

    public Spaces withSnapshot(Double snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * **参数解释**：  rds侧快照备份用量，单位MB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return snapshot
     */
    public Double getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(Double snapshot) {
        this.snapshot = snapshot;
    }

    public Spaces withObsFree(Double obsFree) {
        this.obsFree = obsFree;
        return this;
    }

    /**
     * **参数解释**：  日志备份赠送空间，单位GB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return obsFree
     */
    public Double getObsFree() {
        return obsFree;
    }

    public void setObsFree(Double obsFree) {
        this.obsFree = obsFree;
    }

    public Spaces withSnapshotFree(Double snapshotFree) {
        this.snapshotFree = snapshotFree;
        return this;
    }

    /**
     * **参数解释**：  快照备份赠送空间，单位GB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return snapshotFree
     */
    public Double getSnapshotFree() {
        return snapshotFree;
    }

    public void setSnapshotFree(Double snapshotFree) {
        this.snapshotFree = snapshotFree;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Spaces that = (Spaces) obj;
        return Objects.equals(this.obs, that.obs) && Objects.equals(this.snapshot, that.snapshot)
            && Objects.equals(this.obsFree, that.obsFree) && Objects.equals(this.snapshotFree, that.snapshotFree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs, snapshot, obsFree, snapshotFree);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Spaces {\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
        sb.append("    obsFree: ").append(toIndentedString(obsFree)).append("\n");
        sb.append("    snapshotFree: ").append(toIndentedString(snapshotFree)).append("\n");
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
