package com.huaweicloud.sdk.ddm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ddm.v1.model.ComputeFlavors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ComputeFlavorGroupsInfo
 */
public class ComputeFlavorGroupsInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="groupType")
    
    private String groupType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="computeFlavors")
    
    private List<ComputeFlavors> computeFlavors = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ComputeFlavorGroupsInfo withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    


    /**
     * 计算资源架构类型，目前分X86和ARM两种。
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    

    public ComputeFlavorGroupsInfo withComputeFlavors(List<ComputeFlavors> computeFlavors) {
        this.computeFlavors = computeFlavors;
        return this;
    }

    
    public ComputeFlavorGroupsInfo addComputeFlavorsItem(ComputeFlavors computeFlavorsItem) {
        if(this.computeFlavors == null) {
            this.computeFlavors = new ArrayList<>();
        }
        this.computeFlavors.add(computeFlavorsItem);
        return this;
    }

    public ComputeFlavorGroupsInfo withComputeFlavors(Consumer<List<ComputeFlavors>> computeFlavorsSetter) {
        if(this.computeFlavors == null) {
            this.computeFlavors = new ArrayList<>();
        }
        computeFlavorsSetter.accept(this.computeFlavors);
        return this;
    }

    /**
     * 计算类型规格详情。
     * @return computeFlavors
     */
    public List<ComputeFlavors> getComputeFlavors() {
        return computeFlavors;
    }

    public void setComputeFlavors(List<ComputeFlavors> computeFlavors) {
        this.computeFlavors = computeFlavors;
    }

    

    public ComputeFlavorGroupsInfo withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 分页参数: 起始值。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ComputeFlavorGroupsInfo withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 分页参数：每页多少条。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ComputeFlavorGroupsInfo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 计算类型规格总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComputeFlavorGroupsInfo computeFlavorGroupsInfo = (ComputeFlavorGroupsInfo) o;
        return Objects.equals(this.groupType, computeFlavorGroupsInfo.groupType) &&
            Objects.equals(this.computeFlavors, computeFlavorGroupsInfo.computeFlavors) &&
            Objects.equals(this.offset, computeFlavorGroupsInfo.offset) &&
            Objects.equals(this.limit, computeFlavorGroupsInfo.limit) &&
            Objects.equals(this.total, computeFlavorGroupsInfo.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupType, computeFlavors, offset, limit, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputeFlavorGroupsInfo {\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    computeFlavors: ").append(toIndentedString(computeFlavors)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

