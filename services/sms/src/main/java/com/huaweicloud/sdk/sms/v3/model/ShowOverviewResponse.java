package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting")

    private Integer waiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicating")

    private Integer replicating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncing")

    private Integer syncing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other")

    private Integer other;

    public ShowOverviewResponse withWaiting(Integer waiting) {
        this.waiting = waiting;
        return this;
    }

    /**
     * 等待中
     * minimum: 0
     * maximum: 1000
     * @return waiting
     */
    public Integer getWaiting() {
        return waiting;
    }

    public void setWaiting(Integer waiting) {
        this.waiting = waiting;
    }

    public ShowOverviewResponse withReplicating(Integer replicating) {
        this.replicating = replicating;
        return this;
    }

    /**
     * 复制中
     * minimum: 0
     * maximum: 1000
     * @return replicating
     */
    public Integer getReplicating() {
        return replicating;
    }

    public void setReplicating(Integer replicating) {
        this.replicating = replicating;
    }

    public ShowOverviewResponse withSyncing(Integer syncing) {
        this.syncing = syncing;
        return this;
    }

    /**
     * 同步中
     * minimum: 0
     * maximum: 1000
     * @return syncing
     */
    public Integer getSyncing() {
        return syncing;
    }

    public void setSyncing(Integer syncing) {
        this.syncing = syncing;
    }

    public ShowOverviewResponse withOther(Integer other) {
        this.other = other;
        return this;
    }

    /**
     * 其它
     * minimum: 0
     * maximum: 1000
     * @return other
     */
    public Integer getOther() {
        return other;
    }

    public void setOther(Integer other) {
        this.other = other;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOverviewResponse that = (ShowOverviewResponse) obj;
        return Objects.equals(this.waiting, that.waiting) && Objects.equals(this.replicating, that.replicating)
            && Objects.equals(this.syncing, that.syncing) && Objects.equals(this.other, that.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waiting, replicating, syncing, other);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOverviewResponse {\n");
        sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
        sb.append("    replicating: ").append(toIndentedString(replicating)).append("\n");
        sb.append("    syncing: ").append(toIndentedString(syncing)).append("\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
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
