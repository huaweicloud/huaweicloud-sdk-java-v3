package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServiceBatchOpenRequest
 */
public class ServiceBatchOpenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_list")

    private List<ServiceOpenItem> serviceList = null;

    public ServiceBatchOpenRequest withServiceList(List<ServiceOpenItem> serviceList) {
        this.serviceList = serviceList;
        return this;
    }

    public ServiceBatchOpenRequest addServiceListItem(ServiceOpenItem serviceListItem) {
        if (this.serviceList == null) {
            this.serviceList = new ArrayList<>();
        }
        this.serviceList.add(serviceListItem);
        return this;
    }

    public ServiceBatchOpenRequest withServiceList(Consumer<List<ServiceOpenItem>> serviceListSetter) {
        if (this.serviceList == null) {
            this.serviceList = new ArrayList<>();
        }
        serviceListSetter.accept(this.serviceList);
        return this;
    }

    /**
     * **参数解释**：需要开通的服务列表。 **取值范围**：数组元素个数限制为16个。
     * @return serviceList
     */
    public List<ServiceOpenItem> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<ServiceOpenItem> serviceList) {
        this.serviceList = serviceList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceBatchOpenRequest that = (ServiceBatchOpenRequest) obj;
        return Objects.equals(this.serviceList, that.serviceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceBatchOpenRequest {\n");
        sb.append("    serviceList: ").append(toIndentedString(serviceList)).append("\n");
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
