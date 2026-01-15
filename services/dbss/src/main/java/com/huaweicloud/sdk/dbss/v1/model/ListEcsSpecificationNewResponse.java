package com.huaweicloud.sdk.dbss.v1.model;

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
public class ListEcsSpecificationNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specifications")

    private List<EcsSpecificationBean> specifications = null;

    public ListEcsSpecificationNewResponse withSpecifications(List<EcsSpecificationBean> specifications) {
        this.specifications = specifications;
        return this;
    }

    public ListEcsSpecificationNewResponse addSpecificationsItem(EcsSpecificationBean specificationsItem) {
        if (this.specifications == null) {
            this.specifications = new ArrayList<>();
        }
        this.specifications.add(specificationsItem);
        return this;
    }

    public ListEcsSpecificationNewResponse withSpecifications(
        Consumer<List<EcsSpecificationBean>> specificationsSetter) {
        if (this.specifications == null) {
            this.specifications = new ArrayList<>();
        }
        specificationsSetter.accept(this.specifications);
        return this;
    }

    /**
     * ecs规格集合
     * @return specifications
     */
    public List<EcsSpecificationBean> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<EcsSpecificationBean> specifications) {
        this.specifications = specifications;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEcsSpecificationNewResponse that = (ListEcsSpecificationNewResponse) obj;
        return Objects.equals(this.specifications, that.specifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specifications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEcsSpecificationNewResponse {\n");
        sb.append("    specifications: ").append(toIndentedString(specifications)).append("\n");
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
