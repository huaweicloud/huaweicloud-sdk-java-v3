package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowAccessPointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private String businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")

    private Integer xBusinessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AccessPointModel body;

    public ShowAccessPointRequest withBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id。
     * @return businessId
     */
    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public ShowAccessPointRequest withXBusinessId(Integer xBusinessId) {
        this.xBusinessId = xBusinessId;
        return this;
    }

    /**
     * 应用id。
     * @return xBusinessId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")
    public Integer getXBusinessId() {
        return xBusinessId;
    }

    public void setXBusinessId(Integer xBusinessId) {
        this.xBusinessId = xBusinessId;
    }

    public ShowAccessPointRequest withBody(AccessPointModel body) {
        this.body = body;
        return this;
    }

    public ShowAccessPointRequest withBody(Consumer<AccessPointModel> bodySetter) {
        if (this.body == null) {
            this.body = new AccessPointModel();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AccessPointModel getBody() {
        return body;
    }

    public void setBody(AccessPointModel body) {
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
        ShowAccessPointRequest that = (ShowAccessPointRequest) obj;
        return Objects.equals(this.businessId, that.businessId) && Objects.equals(this.xBusinessId, that.xBusinessId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessId, xBusinessId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAccessPointRequest {\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    xBusinessId: ").append(toIndentedString(xBusinessId)).append("\n");
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
