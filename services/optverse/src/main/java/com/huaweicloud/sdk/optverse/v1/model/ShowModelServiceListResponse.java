package com.huaweicloud.sdk.optverse.v1.model;

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
public class ShowModelServiceListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "services")

    private List<ModelServiceRsp> services = null;

    public ShowModelServiceListResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 推理服务总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowModelServiceListResponse withServices(List<ModelServiceRsp> services) {
        this.services = services;
        return this;
    }

    public ShowModelServiceListResponse addServicesItem(ModelServiceRsp servicesItem) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        this.services.add(servicesItem);
        return this;
    }

    public ShowModelServiceListResponse withServices(Consumer<List<ModelServiceRsp>> servicesSetter) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        servicesSetter.accept(this.services);
        return this;
    }

    /**
     * 模型服务列表
     * @return services
     */
    public List<ModelServiceRsp> getServices() {
        return services;
    }

    public void setServices(List<ModelServiceRsp> services) {
        this.services = services;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowModelServiceListResponse that = (ShowModelServiceListResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.services, that.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, services);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowModelServiceListResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
