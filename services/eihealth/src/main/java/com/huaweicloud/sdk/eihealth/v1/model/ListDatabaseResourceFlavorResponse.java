package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListDatabaseResourceFlavorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<DatabaseFlavorRsp> flavors = null;

    public ListDatabaseResourceFlavorResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListDatabaseResourceFlavorResponse withFlavors(List<DatabaseFlavorRsp> flavors) {
        this.flavors = flavors;
        return this;
    }

    public ListDatabaseResourceFlavorResponse addFlavorsItem(DatabaseFlavorRsp flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ListDatabaseResourceFlavorResponse withFlavors(Consumer<List<DatabaseFlavorRsp>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * 规格列表
     * @return flavors
     */
    public List<DatabaseFlavorRsp> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<DatabaseFlavorRsp> flavors) {
        this.flavors = flavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDatabaseResourceFlavorResponse that = (ListDatabaseResourceFlavorResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.flavors, that.flavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, flavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseResourceFlavorResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
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
