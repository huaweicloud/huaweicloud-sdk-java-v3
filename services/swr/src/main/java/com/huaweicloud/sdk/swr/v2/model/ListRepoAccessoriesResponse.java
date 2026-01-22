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
public class ListRepoAccessoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessories")

    private List<AccessoryListAccessories> accessories = null;

    public ListRepoAccessoriesResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 附件总数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListRepoAccessoriesResponse withAccessories(List<AccessoryListAccessories> accessories) {
        this.accessories = accessories;
        return this;
    }

    public ListRepoAccessoriesResponse addAccessoriesItem(AccessoryListAccessories accessoriesItem) {
        if (this.accessories == null) {
            this.accessories = new ArrayList<>();
        }
        this.accessories.add(accessoriesItem);
        return this;
    }

    public ListRepoAccessoriesResponse withAccessories(Consumer<List<AccessoryListAccessories>> accessoriesSetter) {
        if (this.accessories == null) {
            this.accessories = new ArrayList<>();
        }
        accessoriesSetter.accept(this.accessories);
        return this;
    }

    /**
     * 附件列表
     * @return accessories
     */
    public List<AccessoryListAccessories> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<AccessoryListAccessories> accessories) {
        this.accessories = accessories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRepoAccessoriesResponse that = (ListRepoAccessoriesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.accessories, that.accessories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, accessories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRepoAccessoriesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    accessories: ").append(toIndentedString(accessories)).append("\n");
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
