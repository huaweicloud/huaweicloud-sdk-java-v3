package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateVirsubnetCidrReservationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_cidr_reservation")

    private VirsubnetCidrReservation virsubnetCidrReservation;

    public UpdateVirsubnetCidrReservationResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**： 请求ID。 **取值范围**： 不涉及。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateVirsubnetCidrReservationResponse withVirsubnetCidrReservation(
        VirsubnetCidrReservation virsubnetCidrReservation) {
        this.virsubnetCidrReservation = virsubnetCidrReservation;
        return this;
    }

    public UpdateVirsubnetCidrReservationResponse withVirsubnetCidrReservation(
        Consumer<VirsubnetCidrReservation> virsubnetCidrReservationSetter) {
        if (this.virsubnetCidrReservation == null) {
            this.virsubnetCidrReservation = new VirsubnetCidrReservation();
            virsubnetCidrReservationSetter.accept(this.virsubnetCidrReservation);
        }

        return this;
    }

    /**
     * Get virsubnetCidrReservation
     * @return virsubnetCidrReservation
     */
    public VirsubnetCidrReservation getVirsubnetCidrReservation() {
        return virsubnetCidrReservation;
    }

    public void setVirsubnetCidrReservation(VirsubnetCidrReservation virsubnetCidrReservation) {
        this.virsubnetCidrReservation = virsubnetCidrReservation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVirsubnetCidrReservationResponse that = (UpdateVirsubnetCidrReservationResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.virsubnetCidrReservation, that.virsubnetCidrReservation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, virsubnetCidrReservation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVirsubnetCidrReservationResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    virsubnetCidrReservation: ").append(toIndentedString(virsubnetCidrReservation)).append("\n");
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
