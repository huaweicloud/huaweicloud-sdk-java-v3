package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MeshStatus
 */
public class MeshStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    public MeshStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 网格状态，取值如下 - Running：运行中，表示网格处于正常运行状态 - Creating：创建中，表示网格正处于创建过程中 - CreateFailed：创建失败 - Deleting：删除中，表示网格正处于删除过程中 - DeleteFailed：删除失败 - Upgrading：升级中，表示网格正处于升级过程中 - UpgradeFailed：升级失败 - RollingBack：回滚中，表示网格正处于回滚过程中 - RollbackFailed：回滚失败
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MeshStatus that = (MeshStatus) obj;
        return Objects.equals(this.phase, that.phase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MeshStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
