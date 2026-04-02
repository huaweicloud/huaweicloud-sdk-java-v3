package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GcParameters
 */
public class GcParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_untagged")

    private Boolean deleteUntagged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workers")

    private Integer workers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    public GcParameters withDeleteUntagged(Boolean deleteUntagged) {
        this.deleteUntagged = deleteUntagged;
        return this;
    }

    /**
     * 是否删除无tag的制品；默认为false，不删除无tag的制品。
     * @return deleteUntagged
     */
    public Boolean getDeleteUntagged() {
        return deleteUntagged;
    }

    public void setDeleteUntagged(Boolean deleteUntagged) {
        this.deleteUntagged = deleteUntagged;
    }

    public GcParameters withWorkers(Integer workers) {
        this.workers = workers;
        return this;
    }

    /**
     * 并行执行制品清理任务的工作者数量，最小值为1，最大值为5。
     * minimum: 1
     * maximum: 5
     * @return workers
     */
    public Integer getWorkers() {
        return workers;
    }

    public void setWorkers(Integer workers) {
        this.workers = workers;
    }

    public GcParameters withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 是否模拟执行任务；默认值为false，非模拟运行。
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GcParameters that = (GcParameters) obj;
        return Objects.equals(this.deleteUntagged, that.deleteUntagged) && Objects.equals(this.workers, that.workers)
            && Objects.equals(this.dryRun, that.dryRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteUntagged, workers, dryRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GcParameters {\n");
        sb.append("    deleteUntagged: ").append(toIndentedString(deleteUntagged)).append("\n");
        sb.append("    workers: ").append(toIndentedString(workers)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
