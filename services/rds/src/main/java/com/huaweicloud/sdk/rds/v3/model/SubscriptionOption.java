package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订阅选项。
 */
public class SubscriptionOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "independent_agent")

    private Boolean independentAgent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_always_available")

    private Boolean snapshotAlwaysAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicate_ddl")

    private Boolean replicateDdl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_initialize_from_backup")

    private Boolean allowInitializeFromBackup;

    public SubscriptionOption withIndependentAgent(Boolean independentAgent) {
        this.independentAgent = independentAgent;
        return this;
    }

    /**
     * 独立的分发代理。  true：使用。 false：不使用。
     * @return independentAgent
     */
    public Boolean getIndependentAgent() {
        return independentAgent;
    }

    public void setIndependentAgent(Boolean independentAgent) {
        this.independentAgent = independentAgent;
    }

    public SubscriptionOption withSnapshotAlwaysAvailable(Boolean snapshotAlwaysAvailable) {
        this.snapshotAlwaysAvailable = snapshotAlwaysAvailable;
        return this;
    }

    /**
     * 快照始终可用。需要“独立的分发代理”。  true：可用。 false：不可用。
     * @return snapshotAlwaysAvailable
     */
    public Boolean getSnapshotAlwaysAvailable() {
        return snapshotAlwaysAvailable;
    }

    public void setSnapshotAlwaysAvailable(Boolean snapshotAlwaysAvailable) {
        this.snapshotAlwaysAvailable = snapshotAlwaysAvailable;
    }

    public SubscriptionOption withReplicateDdl(Boolean replicateDdl) {
        this.replicateDdl = replicateDdl;
        return this;
    }

    /**
     * 复制架构更改。  true：可更改。 false：不可更改。
     * @return replicateDdl
     */
    public Boolean getReplicateDdl() {
        return replicateDdl;
    }

    public void setReplicateDdl(Boolean replicateDdl) {
        this.replicateDdl = replicateDdl;
    }

    public SubscriptionOption withAllowInitializeFromBackup(Boolean allowInitializeFromBackup) {
        this.allowInitializeFromBackup = allowInitializeFromBackup;
        return this;
    }

    /**
     * 允许使用备份文件初始化。  true：允许。 false：不允许。
     * @return allowInitializeFromBackup
     */
    public Boolean getAllowInitializeFromBackup() {
        return allowInitializeFromBackup;
    }

    public void setAllowInitializeFromBackup(Boolean allowInitializeFromBackup) {
        this.allowInitializeFromBackup = allowInitializeFromBackup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriptionOption that = (SubscriptionOption) obj;
        return Objects.equals(this.independentAgent, that.independentAgent)
            && Objects.equals(this.snapshotAlwaysAvailable, that.snapshotAlwaysAvailable)
            && Objects.equals(this.replicateDdl, that.replicateDdl)
            && Objects.equals(this.allowInitializeFromBackup, that.allowInitializeFromBackup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(independentAgent, snapshotAlwaysAvailable, replicateDdl, allowInitializeFromBackup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionOption {\n");
        sb.append("    independentAgent: ").append(toIndentedString(independentAgent)).append("\n");
        sb.append("    snapshotAlwaysAvailable: ").append(toIndentedString(snapshotAlwaysAvailable)).append("\n");
        sb.append("    replicateDdl: ").append(toIndentedString(replicateDdl)).append("\n");
        sb.append("    allowInitializeFromBackup: ").append(toIndentedString(allowInitializeFromBackup)).append("\n");
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
