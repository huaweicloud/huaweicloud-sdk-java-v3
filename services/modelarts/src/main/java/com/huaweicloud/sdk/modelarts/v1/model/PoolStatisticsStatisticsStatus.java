package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数描述**： 不同状态下的资源池统计信息。
 */
public class PoolStatisticsStatisticsStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creating")

    private Integer creating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private Integer created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed")

    private Integer failed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending")

    private Integer pending;

    public PoolStatisticsStatisticsStatus withCreating(Integer creating) {
        this.creating = creating;
        return this;
    }

    /**
     * **参数描述**： 正在创建中的资源池统计信息。 **取值范围**： 不涉及。
     * @return creating
     */
    public Integer getCreating() {
        return creating;
    }

    public void setCreating(Integer creating) {
        this.creating = creating;
    }

    public PoolStatisticsStatisticsStatus withCreated(Integer created) {
        this.created = created;
        return this;
    }

    /**
     * **参数描述**： 创建成功的资源池数量。 **取值范围**： 不涉及。
     * @return created
     */
    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public PoolStatisticsStatisticsStatus withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     * **参数描述**： 最近三天内创建失败的资源池数量，最大值为500。 **取值范围**： 不涉及。
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public PoolStatisticsStatisticsStatus withPending(Integer pending) {
        this.pending = pending;
        return this;
    }

    /**
     * **参数描述**： 等待中的资源池数量，通常是未支付的包周期资源池。 **取值范围**： 不涉及。
     * @return pending
     */
    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolStatisticsStatisticsStatus that = (PoolStatisticsStatisticsStatus) obj;
        return Objects.equals(this.creating, that.creating) && Objects.equals(this.created, that.created)
            && Objects.equals(this.failed, that.failed) && Objects.equals(this.pending, that.pending);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creating, created, failed, pending);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolStatisticsStatisticsStatus {\n");
        sb.append("    creating: ").append(toIndentedString(creating)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
        sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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
