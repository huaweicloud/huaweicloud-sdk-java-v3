package com.huaweicloud.sdk.nat.v2.model;

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
public class ListSpecsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specs")

    private List<Spec> specs = null;

    public ListSpecsResponse withSpecs(List<Spec> specs) {
        this.specs = specs;
        return this;
    }

    public ListSpecsResponse addSpecsItem(Spec specsItem) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        this.specs.add(specsItem);
        return this;
    }

    public ListSpecsResponse withSpecs(Consumer<List<Spec>> specsSetter) {
        if (this.specs == null) {
            this.specs = new ArrayList<>();
        }
        specsSetter.accept(this.specs);
        return this;
    }

    /**
     * 查询项目支持网关规格列表的响应体。
     * @return specs
     */
    public List<Spec> getSpecs() {
        return specs;
    }

    public void setSpecs(List<Spec> specs) {
        this.specs = specs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSpecsResponse that = (ListSpecsResponse) obj;
        return Objects.equals(this.specs, that.specs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecsResponse {\n");
        sb.append("    specs: ").append(toIndentedString(specs)).append("\n");
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
