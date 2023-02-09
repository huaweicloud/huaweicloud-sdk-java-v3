package com.huaweicloud.sdk.lakeformation.v1.model;

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
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_codes")

    private List<Spec> specCodes = null;

    public ListSpecsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSpecsResponse withSpecCodes(List<Spec> specCodes) {
        this.specCodes = specCodes;
        return this;
    }

    public ListSpecsResponse addSpecCodesItem(Spec specCodesItem) {
        if (this.specCodes == null) {
            this.specCodes = new ArrayList<>();
        }
        this.specCodes.add(specCodesItem);
        return this;
    }

    public ListSpecsResponse withSpecCodes(Consumer<List<Spec>> specCodesSetter) {
        if (this.specCodes == null) {
            this.specCodes = new ArrayList<>();
        }
        specCodesSetter.accept(this.specCodes);
        return this;
    }

    /**
     * 规格编码列表
     * @return specCodes
     */
    public List<Spec> getSpecCodes() {
        return specCodes;
    }

    public void setSpecCodes(List<Spec> specCodes) {
        this.specCodes = specCodes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSpecsResponse listSpecsResponse = (ListSpecsResponse) o;
        return Objects.equals(this.total, listSpecsResponse.total)
            && Objects.equals(this.specCodes, listSpecsResponse.specCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, specCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    specCodes: ").append(toIndentedString(specCodes)).append("\n");
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
