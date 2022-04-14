package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class DisassociateSubnetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetable_id")

    private String routetableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DisassociateSubnetRequestBody body;

    public DisassociateSubnetRequest withRoutetableId(String routetableId) {
        this.routetableId = routetableId;
        return this;
    }

    /** 路由表ID
     * 
     * @return routetableId */
    public String getRoutetableId() {
        return routetableId;
    }

    public void setRoutetableId(String routetableId) {
        this.routetableId = routetableId;
    }

    public DisassociateSubnetRequest withBody(DisassociateSubnetRequestBody body) {
        this.body = body;
        return this;
    }

    public DisassociateSubnetRequest withBody(Consumer<DisassociateSubnetRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new DisassociateSubnetRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public DisassociateSubnetRequestBody getBody() {
        return body;
    }

    public void setBody(DisassociateSubnetRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateSubnetRequest disassociateSubnetRequest = (DisassociateSubnetRequest) o;
        return Objects.equals(this.routetableId, disassociateSubnetRequest.routetableId)
            && Objects.equals(this.body, disassociateSubnetRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetableId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateSubnetRequest {\n");
        sb.append("    routetableId: ").append(toIndentedString(routetableId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
