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
public class ListEcsSpecificationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private List<EcsSpecificationBean> specification = null;

    public ListEcsSpecificationResponse withSpecification(List<EcsSpecificationBean> specification) {
        this.specification = specification;
        return this;
    }

    public ListEcsSpecificationResponse addSpecificationItem(EcsSpecificationBean specificationItem) {
        if (this.specification == null) {
            this.specification = new ArrayList<>();
        }
        this.specification.add(specificationItem);
        return this;
    }

    public ListEcsSpecificationResponse withSpecification(Consumer<List<EcsSpecificationBean>> specificationSetter) {
        if (this.specification == null) {
            this.specification = new ArrayList<>();
        }
        specificationSetter.accept(this.specification);
        return this;
    }

    /**
     * ecs规格集合
     * @return specification
     */
    public List<EcsSpecificationBean> getSpecification() {
        return specification;
    }

    public void setSpecification(List<EcsSpecificationBean> specification) {
        this.specification = specification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEcsSpecificationResponse that = (ListEcsSpecificationResponse) obj;
        return Objects.equals(this.specification, that.specification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEcsSpecificationResponse {\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
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
