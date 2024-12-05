package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateGdgwRouteTableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gdgw_id")

    private String gdgwId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateGdgwRoutetableRequestBody body;

    public UpdateGdgwRouteTableRequest withGdgwId(String gdgwId) {
        this.gdgwId = gdgwId;
        return this;
    }

    /**
     * 全球接入网关ID
     * @return gdgwId
     */
    public String getGdgwId() {
        return gdgwId;
    }

    public void setGdgwId(String gdgwId) {
        this.gdgwId = gdgwId;
    }

    public UpdateGdgwRouteTableRequest withBody(UpdateGdgwRoutetableRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateGdgwRouteTableRequest withBody(Consumer<UpdateGdgwRoutetableRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateGdgwRoutetableRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateGdgwRoutetableRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateGdgwRoutetableRequestBody body) {
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
        UpdateGdgwRouteTableRequest that = (UpdateGdgwRouteTableRequest) obj;
        return Objects.equals(this.gdgwId, that.gdgwId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gdgwId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGdgwRouteTableRequest {\n");
        sb.append("    gdgwId: ").append(toIndentedString(gdgwId)).append("\n");
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
