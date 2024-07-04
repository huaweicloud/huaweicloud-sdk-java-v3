package com.huaweicloud.sdk.vias.v2.model;

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
public class ListUserServicesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_list")

    private List<ServicesListInfoDto> serviceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListUserServicesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListUserServicesResponse withServiceList(List<ServicesListInfoDto> serviceList) {
        this.serviceList = serviceList;
        return this;
    }

    public ListUserServicesResponse addServiceListItem(ServicesListInfoDto serviceListItem) {
        if (this.serviceList == null) {
            this.serviceList = new ArrayList<>();
        }
        this.serviceList.add(serviceListItem);
        return this;
    }

    public ListUserServicesResponse withServiceList(Consumer<List<ServicesListInfoDto>> serviceListSetter) {
        if (this.serviceList == null) {
            this.serviceList = new ArrayList<>();
        }
        serviceListSetter.accept(this.serviceList);
        return this;
    }

    /**
     * 服务列表
     * @return serviceList
     */
    public List<ServicesListInfoDto> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<ServicesListInfoDto> serviceList) {
        this.serviceList = serviceList;
    }

    public ListUserServicesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数数量
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
        ListUserServicesResponse that = (ListUserServicesResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.serviceList, that.serviceList)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, serviceList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserServicesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    serviceList: ").append(toIndentedString(serviceList)).append("\n");
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
