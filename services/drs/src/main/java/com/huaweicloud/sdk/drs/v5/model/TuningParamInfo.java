package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 高级设置信息体。
 */
public class TuningParamInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sync")

    private List<TuningParameter> fullSync = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_capture")

    private List<TuningParameter> increCapture = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_apply")

    private List<TuningParameter> increApply = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_relay")

    private List<TuningParameter> increRelay = null;

    public TuningParamInfo withFullSync(List<TuningParameter> fullSync) {
        this.fullSync = fullSync;
        return this;
    }

    public TuningParamInfo addFullSyncItem(TuningParameter fullSyncItem) {
        if (this.fullSync == null) {
            this.fullSync = new ArrayList<>();
        }
        this.fullSync.add(fullSyncItem);
        return this;
    }

    public TuningParamInfo withFullSync(Consumer<List<TuningParameter>> fullSyncSetter) {
        if (this.fullSync == null) {
            this.fullSync = new ArrayList<>();
        }
        fullSyncSetter.accept(this.fullSync);
        return this;
    }

    /**
     * 全量调优参数。
     * @return fullSync
     */
    public List<TuningParameter> getFullSync() {
        return fullSync;
    }

    public void setFullSync(List<TuningParameter> fullSync) {
        this.fullSync = fullSync;
    }

    public TuningParamInfo withIncreCapture(List<TuningParameter> increCapture) {
        this.increCapture = increCapture;
        return this;
    }

    public TuningParamInfo addIncreCaptureItem(TuningParameter increCaptureItem) {
        if (this.increCapture == null) {
            this.increCapture = new ArrayList<>();
        }
        this.increCapture.add(increCaptureItem);
        return this;
    }

    public TuningParamInfo withIncreCapture(Consumer<List<TuningParameter>> increCaptureSetter) {
        if (this.increCapture == null) {
            this.increCapture = new ArrayList<>();
        }
        increCaptureSetter.accept(this.increCapture);
        return this;
    }

    /**
     * 增量抓取调优参数。
     * @return increCapture
     */
    public List<TuningParameter> getIncreCapture() {
        return increCapture;
    }

    public void setIncreCapture(List<TuningParameter> increCapture) {
        this.increCapture = increCapture;
    }

    public TuningParamInfo withIncreApply(List<TuningParameter> increApply) {
        this.increApply = increApply;
        return this;
    }

    public TuningParamInfo addIncreApplyItem(TuningParameter increApplyItem) {
        if (this.increApply == null) {
            this.increApply = new ArrayList<>();
        }
        this.increApply.add(increApplyItem);
        return this;
    }

    public TuningParamInfo withIncreApply(Consumer<List<TuningParameter>> increApplySetter) {
        if (this.increApply == null) {
            this.increApply = new ArrayList<>();
        }
        increApplySetter.accept(this.increApply);
        return this;
    }

    /**
     * 增量回放调优参数。
     * @return increApply
     */
    public List<TuningParameter> getIncreApply() {
        return increApply;
    }

    public void setIncreApply(List<TuningParameter> increApply) {
        this.increApply = increApply;
    }

    public TuningParamInfo withIncreRelay(List<TuningParameter> increRelay) {
        this.increRelay = increRelay;
        return this;
    }

    public TuningParamInfo addIncreRelayItem(TuningParameter increRelayItem) {
        if (this.increRelay == null) {
            this.increRelay = new ArrayList<>();
        }
        this.increRelay.add(increRelayItem);
        return this;
    }

    public TuningParamInfo withIncreRelay(Consumer<List<TuningParameter>> increRelaySetter) {
        if (this.increRelay == null) {
            this.increRelay = new ArrayList<>();
        }
        increRelaySetter.accept(this.increRelay);
        return this;
    }

    /**
     * 增量日志拉取调优参数。
     * @return increRelay
     */
    public List<TuningParameter> getIncreRelay() {
        return increRelay;
    }

    public void setIncreRelay(List<TuningParameter> increRelay) {
        this.increRelay = increRelay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TuningParamInfo that = (TuningParamInfo) obj;
        return Objects.equals(this.fullSync, that.fullSync) && Objects.equals(this.increCapture, that.increCapture)
            && Objects.equals(this.increApply, that.increApply) && Objects.equals(this.increRelay, that.increRelay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullSync, increCapture, increApply, increRelay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TuningParamInfo {\n");
        sb.append("    fullSync: ").append(toIndentedString(fullSync)).append("\n");
        sb.append("    increCapture: ").append(toIndentedString(increCapture)).append("\n");
        sb.append("    increApply: ").append(toIndentedString(increApply)).append("\n");
        sb.append("    increRelay: ").append(toIndentedString(increRelay)).append("\n");
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
