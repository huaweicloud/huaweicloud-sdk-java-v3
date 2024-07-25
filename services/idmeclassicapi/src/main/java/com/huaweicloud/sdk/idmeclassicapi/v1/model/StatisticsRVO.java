package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StatisticsRVO
 */
public class StatisticsRVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createCount")

    private Integer createCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleteCount")

    private Integer deleteCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logicalDeleteCount")

    private Integer logicalDeleteCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateCount")

    private Integer updateCount;

    public StatisticsRVO withCreateCount(Integer createCount) {
        this.createCount = createCount;
        return this;
    }

    /**
     * **参数解释：**  新增统计记录数。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return createCount
     */
    public Integer getCreateCount() {
        return createCount;
    }

    public void setCreateCount(Integer createCount) {
        this.createCount = createCount;
    }

    public StatisticsRVO withDeleteCount(Integer deleteCount) {
        this.deleteCount = deleteCount;
        return this;
    }

    /**
     * **参数解释：**  删除统计记录数。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return deleteCount
     */
    public Integer getDeleteCount() {
        return deleteCount;
    }

    public void setDeleteCount(Integer deleteCount) {
        this.deleteCount = deleteCount;
    }

    public StatisticsRVO withLogicalDeleteCount(Integer logicalDeleteCount) {
        this.logicalDeleteCount = logicalDeleteCount;
        return this;
    }

    /**
     * **参数解释：**  软删除统计记录数。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return logicalDeleteCount
     */
    public Integer getLogicalDeleteCount() {
        return logicalDeleteCount;
    }

    public void setLogicalDeleteCount(Integer logicalDeleteCount) {
        this.logicalDeleteCount = logicalDeleteCount;
    }

    public StatisticsRVO withUpdateCount(Integer updateCount) {
        this.updateCount = updateCount;
        return this;
    }

    /**
     * **参数解释：**  更新统计记录数。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return updateCount
     */
    public Integer getUpdateCount() {
        return updateCount;
    }

    public void setUpdateCount(Integer updateCount) {
        this.updateCount = updateCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatisticsRVO that = (StatisticsRVO) obj;
        return Objects.equals(this.createCount, that.createCount) && Objects.equals(this.deleteCount, that.deleteCount)
            && Objects.equals(this.logicalDeleteCount, that.logicalDeleteCount)
            && Objects.equals(this.updateCount, that.updateCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createCount, deleteCount, logicalDeleteCount, updateCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatisticsRVO {\n");
        sb.append("    createCount: ").append(toIndentedString(createCount)).append("\n");
        sb.append("    deleteCount: ").append(toIndentedString(deleteCount)).append("\n");
        sb.append("    logicalDeleteCount: ").append(toIndentedString(logicalDeleteCount)).append("\n");
        sb.append("    updateCount: ").append(toIndentedString(updateCount)).append("\n");
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
