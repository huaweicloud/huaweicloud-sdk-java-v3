package com.huaweicloud.sdk.bss.v2.model;

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
public class ListProvincesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provinces")

    private List<Province> provinces = null;

    public ListProvincesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 查询个数，成功的时候返回。
     * minimum: 0
     * maximum: 1000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListProvincesResponse withProvinces(List<Province> provinces) {
        this.provinces = provinces;
        return this;
    }

    public ListProvincesResponse addProvincesItem(Province provincesItem) {
        if (this.provinces == null) {
            this.provinces = new ArrayList<>();
        }
        this.provinces.add(provincesItem);
        return this;
    }

    public ListProvincesResponse withProvinces(Consumer<List<Province>> provincesSetter) {
        if (this.provinces == null) {
            this.provinces = new ArrayList<>();
        }
        provincesSetter.accept(this.provinces);
        return this;
    }

    /**
     * 省份信息列表，成功的时候返回，具体参见表3。
     * @return provinces
     */
    public List<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProvincesResponse that = (ListProvincesResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.provinces, that.provinces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, provinces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProvincesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
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
