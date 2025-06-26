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
public class ListInstanceRegistriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registries")

    private List<Registry> registries = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInstanceRegistriesResponse withRegistries(List<Registry> registries) {
        this.registries = registries;
        return this;
    }

    public ListInstanceRegistriesResponse addRegistriesItem(Registry registriesItem) {
        if (this.registries == null) {
            this.registries = new ArrayList<>();
        }
        this.registries.add(registriesItem);
        return this;
    }

    public ListInstanceRegistriesResponse withRegistries(Consumer<List<Registry>> registriesSetter) {
        if (this.registries == null) {
            this.registries = new ArrayList<>();
        }
        registriesSetter.accept(this.registries);
        return this;
    }

    /**
     * 同步仓库列表
     * @return registries
     */
    public List<Registry> getRegistries() {
        return registries;
    }

    public void setRegistries(List<Registry> registries) {
        this.registries = registries;
    }

    public ListInstanceRegistriesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 同步仓库总数
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
        ListInstanceRegistriesResponse that = (ListInstanceRegistriesResponse) obj;
        return Objects.equals(this.registries, that.registries) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registries, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceRegistriesResponse {\n");
        sb.append("    registries: ").append(toIndentedString(registries)).append("\n");
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
