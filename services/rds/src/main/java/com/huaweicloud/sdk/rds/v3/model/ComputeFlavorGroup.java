package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询数据库可变更规格接口中，规格组类型
 */
public class ComputeFlavorGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_flavors")

    private List<ComputeFlavor> computeFlavors = null;

    public ComputeFlavorGroup withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 性能规格，包含以下状态：  normal：通用增强型。 normal2：通用增强Ⅱ型。 armFlavors：鲲鹏通用增强型。 dedicicateNormal（dedicatedNormalLocalssd）：x86独享型。 armLocalssd：鲲鹏通用型。 normalLocalssd：x86通用型。 general：通用型。 dedicated 对于PostgreSQL引擎：独享型
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public ComputeFlavorGroup withComputeFlavors(List<ComputeFlavor> computeFlavors) {
        this.computeFlavors = computeFlavors;
        return this;
    }

    public ComputeFlavorGroup addComputeFlavorsItem(ComputeFlavor computeFlavorsItem) {
        if (this.computeFlavors == null) {
            this.computeFlavors = new ArrayList<>();
        }
        this.computeFlavors.add(computeFlavorsItem);
        return this;
    }

    public ComputeFlavorGroup withComputeFlavors(Consumer<List<ComputeFlavor>> computeFlavorsSetter) {
        if (this.computeFlavors == null) {
            this.computeFlavors = new ArrayList<>();
        }
        computeFlavorsSetter.accept(this.computeFlavors);
        return this;
    }

    /**
     * 计算规格列表
     * @return computeFlavors
     */
    public List<ComputeFlavor> getComputeFlavors() {
        return computeFlavors;
    }

    public void setComputeFlavors(List<ComputeFlavor> computeFlavors) {
        this.computeFlavors = computeFlavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComputeFlavorGroup that = (ComputeFlavorGroup) obj;
        return Objects.equals(this.groupType, that.groupType)
            && Objects.equals(this.computeFlavors, that.computeFlavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupType, computeFlavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputeFlavorGroup {\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    computeFlavors: ").append(toIndentedString(computeFlavors)).append("\n");
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
