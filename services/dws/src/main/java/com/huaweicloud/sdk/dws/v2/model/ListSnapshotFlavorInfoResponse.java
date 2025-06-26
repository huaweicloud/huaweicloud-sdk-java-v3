package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSnapshotFlavorInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<ProductUnitResp> flavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListSnapshotFlavorInfoResponse withFlavors(List<ProductUnitResp> flavors) {
        this.flavors = flavors;
        return this;
    }

    public ListSnapshotFlavorInfoResponse addFlavorsItem(ProductUnitResp flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ListSnapshotFlavorInfoResponse withFlavors(Consumer<List<ProductUnitResp>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * **参数解释**： 快照规格信息响应。 **取值范围**： 不涉及。
     * @return flavors
     */
    public List<ProductUnitResp> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<ProductUnitResp> flavors) {
        this.flavors = flavors;
    }

    public ListSnapshotFlavorInfoResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 快照规格信息总条数。 **取值范围**： 大于等于0的正整数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSnapshotFlavorInfoResponse that = (ListSnapshotFlavorInfoResponse) obj;
        return Objects.equals(this.flavors, that.flavors) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavors, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotFlavorInfoResponse {\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
