package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改高级设置信息体。
 */
public class ModifyTuningParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sync")

    private Map<String, String> fullSync = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_capture")

    private Map<String, String> increCapture = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_apply")

    private Map<String, String> increApply = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_relay")

    private Map<String, String> increRelay = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recovery")

    private Boolean recovery;

    public ModifyTuningParams withFullSync(Map<String, String> fullSync) {
        this.fullSync = fullSync;
        return this;
    }

    public ModifyTuningParams putFullSyncItem(String key, String fullSyncItem) {
        if (this.fullSync == null) {
            this.fullSync = new HashMap<>();
        }
        this.fullSync.put(key, fullSyncItem);
        return this;
    }

    public ModifyTuningParams withFullSync(Consumer<Map<String, String>> fullSyncSetter) {
        if (this.fullSync == null) {
            this.fullSync = new HashMap<>();
        }
        fullSyncSetter.accept(this.fullSync);
        return this;
    }

    /**
     * 全量参数的参数名及对应的取值。
     * @return fullSync
     */
    public Map<String, String> getFullSync() {
        return fullSync;
    }

    public void setFullSync(Map<String, String> fullSync) {
        this.fullSync = fullSync;
    }

    public ModifyTuningParams withIncreCapture(Map<String, String> increCapture) {
        this.increCapture = increCapture;
        return this;
    }

    public ModifyTuningParams putIncreCaptureItem(String key, String increCaptureItem) {
        if (this.increCapture == null) {
            this.increCapture = new HashMap<>();
        }
        this.increCapture.put(key, increCaptureItem);
        return this;
    }

    public ModifyTuningParams withIncreCapture(Consumer<Map<String, String>> increCaptureSetter) {
        if (this.increCapture == null) {
            this.increCapture = new HashMap<>();
        }
        increCaptureSetter.accept(this.increCapture);
        return this;
    }

    /**
     * 增量抓取参数的参数名及对应的取值。
     * @return increCapture
     */
    public Map<String, String> getIncreCapture() {
        return increCapture;
    }

    public void setIncreCapture(Map<String, String> increCapture) {
        this.increCapture = increCapture;
    }

    public ModifyTuningParams withIncreApply(Map<String, String> increApply) {
        this.increApply = increApply;
        return this;
    }

    public ModifyTuningParams putIncreApplyItem(String key, String increApplyItem) {
        if (this.increApply == null) {
            this.increApply = new HashMap<>();
        }
        this.increApply.put(key, increApplyItem);
        return this;
    }

    public ModifyTuningParams withIncreApply(Consumer<Map<String, String>> increApplySetter) {
        if (this.increApply == null) {
            this.increApply = new HashMap<>();
        }
        increApplySetter.accept(this.increApply);
        return this;
    }

    /**
     * 增量回放参数的参数名及对应的取值。
     * @return increApply
     */
    public Map<String, String> getIncreApply() {
        return increApply;
    }

    public void setIncreApply(Map<String, String> increApply) {
        this.increApply = increApply;
    }

    public ModifyTuningParams withIncreRelay(Map<String, String> increRelay) {
        this.increRelay = increRelay;
        return this;
    }

    public ModifyTuningParams putIncreRelayItem(String key, String increRelayItem) {
        if (this.increRelay == null) {
            this.increRelay = new HashMap<>();
        }
        this.increRelay.put(key, increRelayItem);
        return this;
    }

    public ModifyTuningParams withIncreRelay(Consumer<Map<String, String>> increRelaySetter) {
        if (this.increRelay == null) {
            this.increRelay = new HashMap<>();
        }
        increRelaySetter.accept(this.increRelay);
        return this;
    }

    /**
     * 增量日志拉取参数的参数名及对应的取值。
     * @return increRelay
     */
    public Map<String, String> getIncreRelay() {
        return increRelay;
    }

    public void setIncreRelay(Map<String, String> increRelay) {
        this.increRelay = increRelay;
    }

    public ModifyTuningParams withRecovery(Boolean recovery) {
        this.recovery = recovery;
        return this;
    }

    /**
     * 是否一键还原到默认值。
     * @return recovery
     */
    public Boolean getRecovery() {
        return recovery;
    }

    public void setRecovery(Boolean recovery) {
        this.recovery = recovery;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyTuningParams that = (ModifyTuningParams) obj;
        return Objects.equals(this.fullSync, that.fullSync) && Objects.equals(this.increCapture, that.increCapture)
            && Objects.equals(this.increApply, that.increApply) && Objects.equals(this.increRelay, that.increRelay)
            && Objects.equals(this.recovery, that.recovery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullSync, increCapture, increApply, increRelay, recovery);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyTuningParams {\n");
        sb.append("    fullSync: ").append(toIndentedString(fullSync)).append("\n");
        sb.append("    increCapture: ").append(toIndentedString(increCapture)).append("\n");
        sb.append("    increApply: ").append(toIndentedString(increApply)).append("\n");
        sb.append("    increRelay: ").append(toIndentedString(increRelay)).append("\n");
        sb.append("    recovery: ").append(toIndentedString(recovery)).append("\n");
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
