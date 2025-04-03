package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 下单请求体
 */
public class CreateMetaStudioOrdersReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_services")

    private List<PublicCloudServiceOrder> cloudServices = null;

    public CreateMetaStudioOrdersReq withCloudServices(List<PublicCloudServiceOrder> cloudServices) {
        this.cloudServices = cloudServices;
        return this;
    }

    public CreateMetaStudioOrdersReq addCloudServicesItem(PublicCloudServiceOrder cloudServicesItem) {
        if (this.cloudServices == null) {
            this.cloudServices = new ArrayList<>();
        }
        this.cloudServices.add(cloudServicesItem);
        return this;
    }

    public CreateMetaStudioOrdersReq withCloudServices(Consumer<List<PublicCloudServiceOrder>> cloudServicesSetter) {
        if (this.cloudServices == null) {
            this.cloudServices = new ArrayList<>();
        }
        cloudServicesSetter.accept(this.cloudServices);
        return this;
    }

    /**
     * 云服务信息列表
     * @return cloudServices
     */
    public List<PublicCloudServiceOrder> getCloudServices() {
        return cloudServices;
    }

    public void setCloudServices(List<PublicCloudServiceOrder> cloudServices) {
        this.cloudServices = cloudServices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMetaStudioOrdersReq that = (CreateMetaStudioOrdersReq) obj;
        return Objects.equals(this.cloudServices, that.cloudServices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudServices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMetaStudioOrdersReq {\n");
        sb.append("    cloudServices: ").append(toIndentedString(cloudServices)).append("\n");
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
