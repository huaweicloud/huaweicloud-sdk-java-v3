package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVirsubnetCidrReservationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_cidr_reservation_id")

    private String virsubnetCidrReservationId;

    public DeleteVirsubnetCidrReservationRequest withVirsubnetCidrReservationId(String virsubnetCidrReservationId) {
        this.virsubnetCidrReservationId = virsubnetCidrReservationId;
        return this;
    }

    /**
     * **参数解释**： 子网预留网段的资源ID。 **取值范围**： 不涉及。
     * @return virsubnetCidrReservationId
     */
    public String getVirsubnetCidrReservationId() {
        return virsubnetCidrReservationId;
    }

    public void setVirsubnetCidrReservationId(String virsubnetCidrReservationId) {
        this.virsubnetCidrReservationId = virsubnetCidrReservationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteVirsubnetCidrReservationRequest that = (DeleteVirsubnetCidrReservationRequest) obj;
        return Objects.equals(this.virsubnetCidrReservationId, that.virsubnetCidrReservationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virsubnetCidrReservationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVirsubnetCidrReservationRequest {\n");
        sb.append("    virsubnetCidrReservationId: ").append(toIndentedString(virsubnetCidrReservationId)).append("\n");
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
