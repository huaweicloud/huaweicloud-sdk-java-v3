package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PeriodToOnDemandInstantlyReq
 */
public class PeriodToOnDemandInstantlyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    public PeriodToOnDemandInstantlyReq withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public PeriodToOnDemandInstantlyReq addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public PeriodToOnDemandInstantlyReq withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * |参数名称：资源ID列表。| |参数约束以及描述：该参数必填，数组范围限制:1-10，字符长度限制1-64。|
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeriodToOnDemandInstantlyReq that = (PeriodToOnDemandInstantlyReq) obj;
        return Objects.equals(this.resourceIds, that.resourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeriodToOnDemandInstantlyReq {\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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
