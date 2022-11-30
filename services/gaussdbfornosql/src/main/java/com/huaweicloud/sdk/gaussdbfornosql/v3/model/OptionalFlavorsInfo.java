package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OptionalFlavorsInfo
 */
public class OptionalFlavorsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_flavor_list")

    private List<ComputeFlavor> optionalFlavorList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public OptionalFlavorsInfo withOptionalFlavorList(List<ComputeFlavor> optionalFlavorList) {
        this.optionalFlavorList = optionalFlavorList;
        return this;
    }

    public OptionalFlavorsInfo addOptionalFlavorListItem(ComputeFlavor optionalFlavorListItem) {
        if (this.optionalFlavorList == null) {
            this.optionalFlavorList = new ArrayList<>();
        }
        this.optionalFlavorList.add(optionalFlavorListItem);
        return this;
    }

    public OptionalFlavorsInfo withOptionalFlavorList(Consumer<List<ComputeFlavor>> optionalFlavorListSetter) {
        if (this.optionalFlavorList == null) {
            this.optionalFlavorList = new ArrayList<>();
        }
        optionalFlavorListSetter.accept(this.optionalFlavorList);
        return this;
    }

    /**
     * 扩容节点时可用的规格列表。
     * @return optionalFlavorList
     */
    public List<ComputeFlavor> getOptionalFlavorList() {
        return optionalFlavorList;
    }

    public void setOptionalFlavorList(List<ComputeFlavor> optionalFlavorList) {
        this.optionalFlavorList = optionalFlavorList;
    }

    public OptionalFlavorsInfo withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OptionalFlavorsInfo optionalFlavorsInfo = (OptionalFlavorsInfo) o;
        return Objects.equals(this.optionalFlavorList, optionalFlavorsInfo.optionalFlavorList)
            && Objects.equals(this.totalCount, optionalFlavorsInfo.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optionalFlavorList, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptionalFlavorsInfo {\n");
        sb.append("    optionalFlavorList: ").append(toIndentedString(optionalFlavorList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
