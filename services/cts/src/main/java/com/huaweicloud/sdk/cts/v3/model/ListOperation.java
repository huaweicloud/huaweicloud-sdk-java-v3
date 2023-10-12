package com.huaweicloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 本次查询全量云服务的操作事件列表。
 */
public class ListOperation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_list")

    private List<String> operationList = null;

    public ListOperation withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 事件对应的云服务类型。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ListOperation withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 事件对应的资源类型。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListOperation withOperationList(List<String> operationList) {
        this.operationList = operationList;
        return this;
    }

    public ListOperation addOperationListItem(String operationListItem) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        this.operationList.add(operationListItem);
        return this;
    }

    public ListOperation withOperationList(Consumer<List<String>> operationListSetter) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        operationListSetter.accept(this.operationList);
        return this;
    }

    /**
     * 操作事件名称数组。
     * @return operationList
     */
    public List<String> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<String> operationList) {
        this.operationList = operationList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOperation that = (ListOperation) obj;
        return Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.operationList, that.operationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceType, resourceType, operationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOperation {\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    operationList: ").append(toIndentedString(operationList)).append("\n");
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
