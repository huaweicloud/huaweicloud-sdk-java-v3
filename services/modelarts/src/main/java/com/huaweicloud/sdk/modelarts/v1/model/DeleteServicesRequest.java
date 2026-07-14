package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 提供待删除的services id列表。
 */
public class DeleteServicesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_ids")

    private List<String> serviceIds = null;

    public DeleteServicesRequest withServiceIds(List<String> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }

    public DeleteServicesRequest addServiceIdsItem(String serviceIdsItem) {
        if (this.serviceIds == null) {
            this.serviceIds = new ArrayList<>();
        }
        this.serviceIds.add(serviceIdsItem);
        return this;
    }

    public DeleteServicesRequest withServiceIds(Consumer<List<String>> serviceIdsSetter) {
        if (this.serviceIds == null) {
            this.serviceIds = new ArrayList<>();
        }
        serviceIdsSetter.accept(this.serviceIds);
        return this;
    }

    /**
     * **参数解释：** 待删除的servicesid列表。服务ID在[创建服务](CreateInferService.xml)时即可在返回体中获取，也可通过[查询服务列表](ListInferServices.xml)获取当前用户拥有的服务，其中service_id字段即为服务ID。 **约束限制：** 不涉及。 **取值范围：** 服务ID。 **默认取值：** 不涉及。
     * @return serviceIds
     */
    public List<String> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(List<String> serviceIds) {
        this.serviceIds = serviceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteServicesRequest that = (DeleteServicesRequest) obj;
        return Objects.equals(this.serviceIds, that.serviceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteServicesRequest {\n");
        sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
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
