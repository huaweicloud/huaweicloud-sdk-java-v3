package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class DeleteStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_total")

    private Integer previousTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_total")

    private Integer currentTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private Integer updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added")

    private Integer added;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Integer deleted;

    public DeleteStatus withPreviousTotal(Integer previousTotal) {
        this.previousTotal = previousTotal;
        return this;
    }

    /**
     * **参数解释：** 节点删除时已经存在的集群资源记录总数。 **取值范围：** 不涉及
     * @return previousTotal
     */
    public Integer getPreviousTotal() {
        return previousTotal;
    }

    public void setPreviousTotal(Integer previousTotal) {
        this.previousTotal = previousTotal;
    }

    public DeleteStatus withCurrentTotal(Integer currentTotal) {
        this.currentTotal = currentTotal;
        return this;
    }

    /**
     * **参数解释：** 基于当前集群资源记录信息，生成实际最新资源记录总数。 **取值范围：** 不涉及
     * @return currentTotal
     */
    public Integer getCurrentTotal() {
        return currentTotal;
    }

    public void setCurrentTotal(Integer currentTotal) {
        this.currentTotal = currentTotal;
    }

    public DeleteStatus withUpdated(Integer updated) {
        this.updated = updated;
        return this;
    }

    /**
     * **参数解释：** 节点删除时更新的待删除资源记录总数。 **取值范围：** 不涉及
     * @return updated
     */
    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public DeleteStatus withAdded(Integer added) {
        this.added = added;
        return this;
    }

    /**
     * **参数解释：** 节点删除时新增的待删除资源记录总数。 **取值范围：** 不涉及
     * @return added
     */
    public Integer getAdded() {
        return added;
    }

    public void setAdded(Integer added) {
        this.added = added;
    }

    public DeleteStatus withDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * **参数解释：** 节点删除时删除的资源记录总数。 **取值范围：** 不涉及
     * @return deleted
     */
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteStatus that = (DeleteStatus) obj;
        return Objects.equals(this.previousTotal, that.previousTotal)
            && Objects.equals(this.currentTotal, that.currentTotal) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.added, that.added) && Objects.equals(this.deleted, that.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(previousTotal, currentTotal, updated, added, deleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteStatus {\n");
        sb.append("    previousTotal: ").append(toIndentedString(previousTotal)).append("\n");
        sb.append("    currentTotal: ").append(toIndentedString(currentTotal)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    added: ").append(toIndentedString(added)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
