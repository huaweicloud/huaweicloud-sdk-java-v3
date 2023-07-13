package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDisasterRecoverResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery")

    private List<DisasterRecovery> disasterRecovery = null;

    public ListDisasterRecoverResponse withDisasterRecovery(List<DisasterRecovery> disasterRecovery) {
        this.disasterRecovery = disasterRecovery;
        return this;
    }

    public ListDisasterRecoverResponse addDisasterRecoveryItem(DisasterRecovery disasterRecoveryItem) {
        if (this.disasterRecovery == null) {
            this.disasterRecovery = new ArrayList<>();
        }
        this.disasterRecovery.add(disasterRecoveryItem);
        return this;
    }

    public ListDisasterRecoverResponse withDisasterRecovery(Consumer<List<DisasterRecovery>> disasterRecoverySetter) {
        if (this.disasterRecovery == null) {
            this.disasterRecovery = new ArrayList<>();
        }
        disasterRecoverySetter.accept(this.disasterRecovery);
        return this;
    }

    /**
     * 容灾对象
     * @return disasterRecovery
     */
    public List<DisasterRecovery> getDisasterRecovery() {
        return disasterRecovery;
    }

    public void setDisasterRecovery(List<DisasterRecovery> disasterRecovery) {
        this.disasterRecovery = disasterRecovery;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDisasterRecoverResponse that = (ListDisasterRecoverResponse) obj;
        return Objects.equals(this.disasterRecovery, that.disasterRecovery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disasterRecovery);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDisasterRecoverResponse {\n");
        sb.append("    disasterRecovery: ").append(toIndentedString(disasterRecovery)).append("\n");
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
