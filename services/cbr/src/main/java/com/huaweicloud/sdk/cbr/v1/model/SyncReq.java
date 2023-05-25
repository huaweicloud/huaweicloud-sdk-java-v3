package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SyncReq
 */
public class SyncReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync")

    private SyncParam sync;

    public SyncReq withSync(SyncParam sync) {
        this.sync = sync;
        return this;
    }

    public SyncReq withSync(Consumer<SyncParam> syncSetter) {
        if (this.sync == null) {
            this.sync = new SyncParam();
            syncSetter.accept(this.sync);
        }

        return this;
    }

    /**
     * Get sync
     * @return sync
     */
    public SyncParam getSync() {
        return sync;
    }

    public void setSync(SyncParam sync) {
        this.sync = sync;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SyncReq syncReq = (SyncReq) o;
        return Objects.equals(this.sync, syncReq.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sync);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncReq {\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
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
