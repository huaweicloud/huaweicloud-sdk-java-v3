package com.huaweicloud.sdk.codehub.v4.model;

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
public class ListDefaultReviewCategoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codehub_default_categories")

    private List<CategoryDto> codehubDefaultCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hicode_default_categories")

    private List<CategoryDto> hicodeDefaultCategories = null;

    public ListDefaultReviewCategoriesResponse withCodehubDefaultCategories(
        List<CategoryDto> codehubDefaultCategories) {
        this.codehubDefaultCategories = codehubDefaultCategories;
        return this;
    }

    public ListDefaultReviewCategoriesResponse addCodehubDefaultCategoriesItem(
        CategoryDto codehubDefaultCategoriesItem) {
        if (this.codehubDefaultCategories == null) {
            this.codehubDefaultCategories = new ArrayList<>();
        }
        this.codehubDefaultCategories.add(codehubDefaultCategoriesItem);
        return this;
    }

    public ListDefaultReviewCategoriesResponse withCodehubDefaultCategories(
        Consumer<List<CategoryDto>> codehubDefaultCategoriesSetter) {
        if (this.codehubDefaultCategories == null) {
            this.codehubDefaultCategories = new ArrayList<>();
        }
        codehubDefaultCategoriesSetter.accept(this.codehubDefaultCategories);
        return this;
    }

    /**
     * **参数解释：** 检视意见分类(所有可勾选的，需传参with_default_review_categories: true才返回)。
     * @return codehubDefaultCategories
     */
    public List<CategoryDto> getCodehubDefaultCategories() {
        return codehubDefaultCategories;
    }

    public void setCodehubDefaultCategories(List<CategoryDto> codehubDefaultCategories) {
        this.codehubDefaultCategories = codehubDefaultCategories;
    }

    public ListDefaultReviewCategoriesResponse withHicodeDefaultCategories(List<CategoryDto> hicodeDefaultCategories) {
        this.hicodeDefaultCategories = hicodeDefaultCategories;
        return this;
    }

    public ListDefaultReviewCategoriesResponse addHicodeDefaultCategoriesItem(CategoryDto hicodeDefaultCategoriesItem) {
        if (this.hicodeDefaultCategories == null) {
            this.hicodeDefaultCategories = new ArrayList<>();
        }
        this.hicodeDefaultCategories.add(hicodeDefaultCategoriesItem);
        return this;
    }

    public ListDefaultReviewCategoriesResponse withHicodeDefaultCategories(
        Consumer<List<CategoryDto>> hicodeDefaultCategoriesSetter) {
        if (this.hicodeDefaultCategories == null) {
            this.hicodeDefaultCategories = new ArrayList<>();
        }
        hicodeDefaultCategoriesSetter.accept(this.hicodeDefaultCategories);
        return this;
    }

    /**
     * **参数解释：** 系统预置检视意见分类(需传参with_default_review_categories: true才返回)。
     * @return hicodeDefaultCategories
     */
    public List<CategoryDto> getHicodeDefaultCategories() {
        return hicodeDefaultCategories;
    }

    public void setHicodeDefaultCategories(List<CategoryDto> hicodeDefaultCategories) {
        this.hicodeDefaultCategories = hicodeDefaultCategories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDefaultReviewCategoriesResponse that = (ListDefaultReviewCategoriesResponse) obj;
        return Objects.equals(this.codehubDefaultCategories, that.codehubDefaultCategories)
            && Objects.equals(this.hicodeDefaultCategories, that.hicodeDefaultCategories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codehubDefaultCategories, hicodeDefaultCategories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDefaultReviewCategoriesResponse {\n");
        sb.append("    codehubDefaultCategories: ").append(toIndentedString(codehubDefaultCategories)).append("\n");
        sb.append("    hicodeDefaultCategories: ").append(toIndentedString(hicodeDefaultCategories)).append("\n");
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
