package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckImageDataDto
 */
public class CheckImageDataDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_ids")

    private List<String> dataIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "production_level")

    private String productionLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordination")

    private String coordination;

    public CheckImageDataDto withDataIds(List<String> dataIds) {
        this.dataIds = dataIds;
        return this;
    }

    public CheckImageDataDto addDataIdsItem(String dataIdsItem) {
        if (this.dataIds == null) {
            this.dataIds = new ArrayList<>();
        }
        this.dataIds.add(dataIdsItem);
        return this;
    }

    public CheckImageDataDto withDataIds(Consumer<List<String>> dataIdsSetter) {
        if (this.dataIds == null) {
            this.dataIds = new ArrayList<>();
        }
        dataIdsSetter.accept(this.dataIds);
        return this;
    }

    /**
     * 影像文件ID集合。
     * @return dataIds
     */
    public List<String> getDataIds() {
        return dataIds;
    }

    public void setDataIds(List<String> dataIds) {
        this.dataIds = dataIds;
    }

    public CheckImageDataDto withProductionLevel(String productionLevel) {
        this.productionLevel = productionLevel;
        return this;
    }

    /**
     * 处理等级，当前支持以下等级： L2、L3、L4、L5。
     * @return productionLevel
     */
    public String getProductionLevel() {
        return productionLevel;
    }

    public void setProductionLevel(String productionLevel) {
        this.productionLevel = productionLevel;
    }

    public CheckImageDataDto withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CheckImageDataDto withCoordination(String coordination) {
        this.coordination = coordination;
        return this;
    }

    /**
     * 坐标系。
     * @return coordination
     */
    public String getCoordination() {
        return coordination;
    }

    public void setCoordination(String coordination) {
        this.coordination = coordination;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckImageDataDto that = (CheckImageDataDto) obj;
        return Objects.equals(this.dataIds, that.dataIds) && Objects.equals(this.productionLevel, that.productionLevel)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.coordination, that.coordination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataIds, productionLevel, taskName, coordination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckImageDataDto {\n");
        sb.append("    dataIds: ").append(toIndentedString(dataIds)).append("\n");
        sb.append("    productionLevel: ").append(toIndentedString(productionLevel)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    coordination: ").append(toIndentedString(coordination)).append("\n");
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
