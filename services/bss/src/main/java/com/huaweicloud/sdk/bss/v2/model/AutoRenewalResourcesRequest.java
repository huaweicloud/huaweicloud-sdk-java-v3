package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class AutoRenewalResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    public AutoRenewalResourcesRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /** |参数名称：资源实例ID。您可以调用“2.1-查询客户包年包月资源列表”接口获取资源ID。在设置弹性云服务器自动续费时，能够自动将其挂载的硬盘一并设置为自动续费。| |参数的约束及描述：|
     * 
     * @return resourceId */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoRenewalResourcesRequest autoRenewalResourcesRequest = (AutoRenewalResourcesRequest) o;
        return Objects.equals(this.resourceId, autoRenewalResourcesRequest.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoRenewalResourcesRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
