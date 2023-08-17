package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateEquipmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ieg_id")

    private String iegId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EquipmentActivate body;

    public CreateEquipmentRequest withIegId(String iegId) {
        this.iegId = iegId;
        return this;
    }

    /**
     * 智能企业网关ID
     * @return iegId
     */
    public String getIegId() {
        return iegId;
    }

    public void setIegId(String iegId) {
        this.iegId = iegId;
    }

    public CreateEquipmentRequest withBody(EquipmentActivate body) {
        this.body = body;
        return this;
    }

    public CreateEquipmentRequest withBody(Consumer<EquipmentActivate> bodySetter) {
        if (this.body == null) {
            this.body = new EquipmentActivate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EquipmentActivate getBody() {
        return body;
    }

    public void setBody(EquipmentActivate body) {
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
        CreateEquipmentRequest that = (CreateEquipmentRequest) obj;
        return Objects.equals(this.iegId, that.iegId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iegId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEquipmentRequest {\n");
        sb.append("    iegId: ").append(toIndentedString(iegId)).append("\n");
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
