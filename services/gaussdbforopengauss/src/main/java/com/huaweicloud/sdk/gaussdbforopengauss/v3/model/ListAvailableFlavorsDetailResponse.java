package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAvailableFlavorsDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_category")

    private FlavorCategoryDetail flavorCategory;

    public ListAvailableFlavorsDetailResponse withFlavorCategory(FlavorCategoryDetail flavorCategory) {
        this.flavorCategory = flavorCategory;
        return this;
    }

    public ListAvailableFlavorsDetailResponse withFlavorCategory(Consumer<FlavorCategoryDetail> flavorCategorySetter) {
        if (this.flavorCategory == null) {
            this.flavorCategory = new FlavorCategoryDetail();
            flavorCategorySetter.accept(this.flavorCategory);
        }

        return this;
    }

    /**
     * Get flavorCategory
     * @return flavorCategory
     */
    public FlavorCategoryDetail getFlavorCategory() {
        return flavorCategory;
    }

    public void setFlavorCategory(FlavorCategoryDetail flavorCategory) {
        this.flavorCategory = flavorCategory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAvailableFlavorsDetailResponse that = (ListAvailableFlavorsDetailResponse) obj;
        return Objects.equals(this.flavorCategory, that.flavorCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorCategory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableFlavorsDetailResponse {\n");
        sb.append("    flavorCategory: ").append(toIndentedString(flavorCategory)).append("\n");
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
