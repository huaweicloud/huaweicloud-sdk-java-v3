package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteDesktopVolumesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Service-Transaction-Id")

    private String serviceTransactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteVolumesReq body;

    public DeleteDesktopVolumesRequest withServiceTransactionId(String serviceTransactionId) {
        this.serviceTransactionId = serviceTransactionId;
        return this;
    }

    /**
     * CBC接口回调时，请求头里带上的业务ID
     * @return serviceTransactionId
     */
    public String getServiceTransactionId() {
        return serviceTransactionId;
    }

    public void setServiceTransactionId(String serviceTransactionId) {
        this.serviceTransactionId = serviceTransactionId;
    }

    public DeleteDesktopVolumesRequest withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public DeleteDesktopVolumesRequest withBody(DeleteVolumesReq body) {
        this.body = body;
        return this;
    }

    public DeleteDesktopVolumesRequest withBody(Consumer<DeleteVolumesReq> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteVolumesReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteVolumesReq getBody() {
        return body;
    }

    public void setBody(DeleteVolumesReq body) {
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
        DeleteDesktopVolumesRequest that = (DeleteDesktopVolumesRequest) obj;
        return Objects.equals(this.serviceTransactionId, that.serviceTransactionId)
            && Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceTransactionId, desktopId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDesktopVolumesRequest {\n");
        sb.append("    serviceTransactionId: ").append(toIndentedString(serviceTransactionId)).append("\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
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
