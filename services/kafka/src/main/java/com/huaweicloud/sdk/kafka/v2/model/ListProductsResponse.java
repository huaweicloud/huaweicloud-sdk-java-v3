package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListProductsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hourly")

    private List<ListProductsRespHourly> hourly = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "honthly")

    private List<ListProductsRespHourly> honthly = null;

    public ListProductsResponse withHourly(List<ListProductsRespHourly> hourly) {
        this.hourly = hourly;
        return this;
    }

    public ListProductsResponse addHourlyItem(ListProductsRespHourly hourlyItem) {
        if (this.hourly == null) {
            this.hourly = new ArrayList<>();
        }
        this.hourly.add(hourlyItem);
        return this;
    }

    public ListProductsResponse withHourly(Consumer<List<ListProductsRespHourly>> hourlySetter) {
        if (this.hourly == null) {
            this.hourly = new ArrayList<>();
        }
        hourlySetter.accept(this.hourly);
        return this;
    }

    /** 表示按需付费的产品列表。
     * 
     * @return hourly */
    public List<ListProductsRespHourly> getHourly() {
        return hourly;
    }

    public void setHourly(List<ListProductsRespHourly> hourly) {
        this.hourly = hourly;
    }

    public ListProductsResponse withHonthly(List<ListProductsRespHourly> honthly) {
        this.honthly = honthly;
        return this;
    }

    public ListProductsResponse addHonthlyItem(ListProductsRespHourly honthlyItem) {
        if (this.honthly == null) {
            this.honthly = new ArrayList<>();
        }
        this.honthly.add(honthlyItem);
        return this;
    }

    public ListProductsResponse withHonthly(Consumer<List<ListProductsRespHourly>> honthlySetter) {
        if (this.honthly == null) {
            this.honthly = new ArrayList<>();
        }
        honthlySetter.accept(this.honthly);
        return this;
    }

    /** 表示包年包月的产品列表。当前暂不支持通过API创建包年包月的Kafka实例。
     * 
     * @return honthly */
    public List<ListProductsRespHourly> getHonthly() {
        return honthly;
    }

    public void setHonthly(List<ListProductsRespHourly> honthly) {
        this.honthly = honthly;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProductsResponse listProductsResponse = (ListProductsResponse) o;
        return Objects.equals(this.hourly, listProductsResponse.hourly)
            && Objects.equals(this.honthly, listProductsResponse.honthly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourly, honthly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductsResponse {\n");
        sb.append("    hourly: ").append(toIndentedString(hourly)).append("\n");
        sb.append("    honthly: ").append(toIndentedString(honthly)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
