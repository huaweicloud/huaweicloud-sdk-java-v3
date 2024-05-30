package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListDataServiceMarketApisResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apis")

    private List<AdvancedMallApiDTO> apis = null;

    public ListDataServiceMarketApisResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * API总条数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListDataServiceMarketApisResponse withApis(List<AdvancedMallApiDTO> apis) {
        this.apis = apis;
        return this;
    }

    public ListDataServiceMarketApisResponse addApisItem(AdvancedMallApiDTO apisItem) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        this.apis.add(apisItem);
        return this;
    }

    public ListDataServiceMarketApisResponse withApis(Consumer<List<AdvancedMallApiDTO>> apisSetter) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        apisSetter.accept(this.apis);
        return this;
    }

    /**
     * API列表。
     * @return apis
     */
    public List<AdvancedMallApiDTO> getApis() {
        return apis;
    }

    public void setApis(List<AdvancedMallApiDTO> apis) {
        this.apis = apis;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDataServiceMarketApisResponse that = (ListDataServiceMarketApisResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.apis, that.apis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, apis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDataServiceMarketApisResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
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
