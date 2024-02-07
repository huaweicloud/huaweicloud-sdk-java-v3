package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateGlobalEipRequestBody
 */
public class UpdateGlobalEipRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip")

    private UpdateGlobalEipRequestBodyGlobalEip globalEip;

    public UpdateGlobalEipRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * Get dryRun
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public UpdateGlobalEipRequestBody withGlobalEip(UpdateGlobalEipRequestBodyGlobalEip globalEip) {
        this.globalEip = globalEip;
        return this;
    }

    public UpdateGlobalEipRequestBody withGlobalEip(Consumer<UpdateGlobalEipRequestBodyGlobalEip> globalEipSetter) {
        if (this.globalEip == null) {
            this.globalEip = new UpdateGlobalEipRequestBodyGlobalEip();
            globalEipSetter.accept(this.globalEip);
        }

        return this;
    }

    /**
     * Get globalEip
     * @return globalEip
     */
    public UpdateGlobalEipRequestBodyGlobalEip getGlobalEip() {
        return globalEip;
    }

    public void setGlobalEip(UpdateGlobalEipRequestBodyGlobalEip globalEip) {
        this.globalEip = globalEip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGlobalEipRequestBody that = (UpdateGlobalEipRequestBody) obj;
        return Objects.equals(this.dryRun, that.dryRun) && Objects.equals(this.globalEip, that.globalEip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, globalEip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGlobalEipRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    globalEip: ").append(toIndentedString(globalEip)).append("\n");
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
