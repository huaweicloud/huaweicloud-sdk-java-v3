package com.huaweicloud.sdk.swr.v2.model;

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
public class ListInstanceAccessoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessories")

    private List<Accessory> accessories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInstanceAccessoriesResponse withAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
        return this;
    }

    public ListInstanceAccessoriesResponse addAccessoriesItem(Accessory accessoriesItem) {
        if (this.accessories == null) {
            this.accessories = new ArrayList<>();
        }
        this.accessories.add(accessoriesItem);
        return this;
    }

    public ListInstanceAccessoriesResponse withAccessories(Consumer<List<Accessory>> accessoriesSetter) {
        if (this.accessories == null) {
            this.accessories = new ArrayList<>();
        }
        accessoriesSetter.accept(this.accessories);
        return this;
    }

    /**
     * 制品附件列表
     * @return accessories
     */
    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }

    public ListInstanceAccessoriesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 制品附件总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceAccessoriesResponse that = (ListInstanceAccessoriesResponse) obj;
        return Objects.equals(this.accessories, that.accessories) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessories, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceAccessoriesResponse {\n");
        sb.append("    accessories: ").append(toIndentedString(accessories)).append("\n");
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
