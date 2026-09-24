package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备份用量详情
 */
public class Space {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private Double obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auditlog")

    private Double auditlog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot")

    private Double snapshot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cbr_snapshot")

    private Double cbrSnapshot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_free")

    private Double obsFree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_free")

    private Double snapshotFree;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db")

    private Double db;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log")

    private Double log;

    public Space withObs(Double obs) {
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

    public Space withAuditlog(Double auditlog) {
        this.auditlog = auditlog;
        return this;
    }

    /**
     * **参数解释**：  审计日志用量，单位MB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return auditlog
     */
    public Double getAuditlog() {
        return auditlog;
    }

    public void setAuditlog(Double auditlog) {
        this.auditlog = auditlog;
    }

    public Space withSnapshot(Double snapshot) {
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

    public Space withCbrSnapshot(Double cbrSnapshot) {
        this.cbrSnapshot = cbrSnapshot;
        return this;
    }

    /**
     * **参数解释**：  rds侧CBR快照备份用量，单位MB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return cbrSnapshot
     */
    public Double getCbrSnapshot() {
        return cbrSnapshot;
    }

    public void setCbrSnapshot(Double cbrSnapshot) {
        this.cbrSnapshot = cbrSnapshot;
    }

    public Space withObsFree(Double obsFree) {
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

    public Space withSnapshotFree(Double snapshotFree) {
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

    public Space withDb(Double db) {
        this.db = db;
        return this;
    }

    /**
     * **参数解释**：  全量备份大小，单位MB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return db
     */
    public Double getDb() {
        return db;
    }

    public void setDb(Double db) {
        this.db = db;
    }

    public Space withLog(Double log) {
        this.log = log;
        return this;
    }

    /**
     * **参数解释**：  增量备份大小，单位MB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return log
     */
    public Double getLog() {
        return log;
    }

    public void setLog(Double log) {
        this.log = log;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Space that = (Space) obj;
        return Objects.equals(this.obs, that.obs) && Objects.equals(this.auditlog, that.auditlog)
            && Objects.equals(this.snapshot, that.snapshot) && Objects.equals(this.cbrSnapshot, that.cbrSnapshot)
            && Objects.equals(this.obsFree, that.obsFree) && Objects.equals(this.snapshotFree, that.snapshotFree)
            && Objects.equals(this.db, that.db) && Objects.equals(this.log, that.log);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs, auditlog, snapshot, cbrSnapshot, obsFree, snapshotFree, db, log);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Space {\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    auditlog: ").append(toIndentedString(auditlog)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
        sb.append("    cbrSnapshot: ").append(toIndentedString(cbrSnapshot)).append("\n");
        sb.append("    obsFree: ").append(toIndentedString(obsFree)).append("\n");
        sb.append("    snapshotFree: ").append(toIndentedString(snapshotFree)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    log: ").append(toIndentedString(log)).append("\n");
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
