package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AssociateInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding-instance-service")

    private String bindingInstanceService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_id")

    private String globalEipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AssociateInstanceGlobalEipRequestBody body;

    public AssociateInstanceRequest withBindingInstanceService(String bindingInstanceService) {
        this.bindingInstanceService = bindingInstanceService;
        return this;
    }

    /**
     * 绑定接口可以加，标识请求是从哪个服务调过来的
     * @return bindingInstanceService
     */
    public String getBindingInstanceService() {
        return bindingInstanceService;
    }

    public void setBindingInstanceService(String bindingInstanceService) {
        this.bindingInstanceService = bindingInstanceService;
    }

    public AssociateInstanceRequest withGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
        return this;
    }

    /**
     * Get globalEipId
     * @return globalEipId
     */
    public String getGlobalEipId() {
        return globalEipId;
    }

    public void setGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
    }

    public AssociateInstanceRequest withBody(AssociateInstanceGlobalEipRequestBody body) {
        this.body = body;
        return this;
    }

    public AssociateInstanceRequest withBody(Consumer<AssociateInstanceGlobalEipRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AssociateInstanceGlobalEipRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AssociateInstanceGlobalEipRequestBody getBody() {
        return body;
    }

    public void setBody(AssociateInstanceGlobalEipRequestBody body) {
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
        AssociateInstanceRequest that = (AssociateInstanceRequest) obj;
        return Objects.equals(this.bindingInstanceService, that.bindingInstanceService)
            && Objects.equals(this.globalEipId, that.globalEipId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindingInstanceService, globalEipId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateInstanceRequest {\n");
        sb.append("    bindingInstanceService: ").append(toIndentedString(bindingInstanceService)).append("\n");
        sb.append("    globalEipId: ").append(toIndentedString(globalEipId)).append("\n");
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
