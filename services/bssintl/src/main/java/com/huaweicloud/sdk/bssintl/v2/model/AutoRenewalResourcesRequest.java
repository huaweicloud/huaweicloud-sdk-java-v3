package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AutoRenewalResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AutoRenewalResourcesReq body;

    public AutoRenewalResourcesRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源实例ID。您可以调用“查询客户包年包月资源列表”接口获取资源ID。在设置弹性云服务器自动续费时，能够自动将其挂载的硬盘一并设置为自动续费。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public AutoRenewalResourcesRequest withBody(AutoRenewalResourcesReq body) {
        this.body = body;
        return this;
    }

    public AutoRenewalResourcesRequest withBody(Consumer<AutoRenewalResourcesReq> bodySetter) {
        if (this.body == null) {
            this.body = new AutoRenewalResourcesReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AutoRenewalResourcesReq getBody() {
        return body;
    }

    public void setBody(AutoRenewalResourcesReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoRenewalResourcesRequest that = (AutoRenewalResourcesRequest) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoRenewalResourcesRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
