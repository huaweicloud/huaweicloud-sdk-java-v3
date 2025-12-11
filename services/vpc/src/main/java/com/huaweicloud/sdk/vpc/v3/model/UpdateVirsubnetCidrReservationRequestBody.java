package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateVirsubnetCidrReservationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_cidr_reservation")

    private UpdateVirsubnetCidrReservationOption virsubnetCidrReservation;

    public UpdateVirsubnetCidrReservationRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * **参数解释**： 是否只预检此次请求。 **约束限制**： 不涉及。 **取值范围**： - true：发送检查请求，不会更新子网预留网段。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应码202。 - false：发送正常请求，并直接更新子网预留网段。 **默认取值**： false
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public UpdateVirsubnetCidrReservationRequestBody withVirsubnetCidrReservation(
        UpdateVirsubnetCidrReservationOption virsubnetCidrReservation) {
        this.virsubnetCidrReservation = virsubnetCidrReservation;
        return this;
    }

    public UpdateVirsubnetCidrReservationRequestBody withVirsubnetCidrReservation(
        Consumer<UpdateVirsubnetCidrReservationOption> virsubnetCidrReservationSetter) {
        if (this.virsubnetCidrReservation == null) {
            this.virsubnetCidrReservation = new UpdateVirsubnetCidrReservationOption();
            virsubnetCidrReservationSetter.accept(this.virsubnetCidrReservation);
        }

        return this;
    }

    /**
     * Get virsubnetCidrReservation
     * @return virsubnetCidrReservation
     */
    public UpdateVirsubnetCidrReservationOption getVirsubnetCidrReservation() {
        return virsubnetCidrReservation;
    }

    public void setVirsubnetCidrReservation(UpdateVirsubnetCidrReservationOption virsubnetCidrReservation) {
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
        UpdateVirsubnetCidrReservationRequestBody that = (UpdateVirsubnetCidrReservationRequestBody) obj;
        return Objects.equals(this.dryRun, that.dryRun)
            && Objects.equals(this.virsubnetCidrReservation, that.virsubnetCidrReservation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, virsubnetCidrReservation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVirsubnetCidrReservationRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
