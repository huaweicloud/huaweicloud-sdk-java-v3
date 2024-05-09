package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对比结果信息体。
 */
public class ObjectsHealthCompareOverviewInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_count")

    private Long sourceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_count")

    private Long targetCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ObjectsHealthCompareOverviewInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对象类型。取值： - DB：数据库。 - TABLE：表。 - VIEW：视图。 - EVENT：事件。 - ROUTINE：存储过程和函数。 - INDEX：索引。 - TRIGGER：触发器。 - SYNONYM：同义词。 - FUNCTION：函数。 - PROCEDURE：存储过程。 - TYPE：自定义类型。 - RULE：规则。 - DEFAULT_TYPE：缺省值。 - PLAN_GUIDE：执行计划。 - CONSTRAINT：约束。 - FILE_GROUP：文件组。 - PARTITION_FUNCTION：分区函数。 - PARTITION_SCHEME：分区方案。 - TABLE_COLLATION：表的排序规则。 - EXTENSIONS：插件。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ObjectsHealthCompareOverviewInfo withSourceCount(Long sourceCount) {
        this.sourceCount = sourceCount;
        return this;
    }

    /**
     * 源数量。
     * @return sourceCount
     */
    public Long getSourceCount() {
        return sourceCount;
    }

    public void setSourceCount(Long sourceCount) {
        this.sourceCount = sourceCount;
    }

    public ObjectsHealthCompareOverviewInfo withTargetCount(Long targetCount) {
        this.targetCount = targetCount;
        return this;
    }

    /**
     * 目标数量。
     * @return targetCount
     */
    public Long getTargetCount() {
        return targetCount;
    }

    public void setTargetCount(Long targetCount) {
        this.targetCount = targetCount;
    }

    public ObjectsHealthCompareOverviewInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 对比结果： - 0：不一致。 - 2：一致。 - 3：未完成。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectsHealthCompareOverviewInfo that = (ObjectsHealthCompareOverviewInfo) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.sourceCount, that.sourceCount)
            && Objects.equals(this.targetCount, that.targetCount) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sourceCount, targetCount, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectsHealthCompareOverviewInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sourceCount: ").append(toIndentedString(sourceCount)).append("\n");
        sb.append("    targetCount: ").append(toIndentedString(targetCount)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
