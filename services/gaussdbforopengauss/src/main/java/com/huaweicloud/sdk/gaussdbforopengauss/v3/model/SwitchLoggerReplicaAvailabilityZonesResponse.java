package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class SwitchLoggerReplicaAvailabilityZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_infos")

    private List<AzInformationResult> availabilityZoneInfos = null;

    public SwitchLoggerReplicaAvailabilityZonesResponse withAvailabilityZoneInfos(
        List<AzInformationResult> availabilityZoneInfos) {
        this.availabilityZoneInfos = availabilityZoneInfos;
        return this;
    }

    public SwitchLoggerReplicaAvailabilityZonesResponse addAvailabilityZoneInfosItem(
        AzInformationResult availabilityZoneInfosItem) {
        if (this.availabilityZoneInfos == null) {
            this.availabilityZoneInfos = new ArrayList<>();
        }
        this.availabilityZoneInfos.add(availabilityZoneInfosItem);
        return this;
    }

    public SwitchLoggerReplicaAvailabilityZonesResponse withAvailabilityZoneInfos(
        Consumer<List<AzInformationResult>> availabilityZoneInfosSetter) {
        if (this.availabilityZoneInfos == null) {
            this.availabilityZoneInfos = new ArrayList<>();
        }
        availabilityZoneInfosSetter.accept(this.availabilityZoneInfos);
        return this;
    }

    /**
     * **参数解释**: 选择日志节点AZ列表。
     * @return availabilityZoneInfos
     */
    public List<AzInformationResult> getAvailabilityZoneInfos() {
        return availabilityZoneInfos;
    }

    public void setAvailabilityZoneInfos(List<AzInformationResult> availabilityZoneInfos) {
        this.availabilityZoneInfos = availabilityZoneInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchLoggerReplicaAvailabilityZonesResponse that = (SwitchLoggerReplicaAvailabilityZonesResponse) obj;
        return Objects.equals(this.availabilityZoneInfos, that.availabilityZoneInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZoneInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchLoggerReplicaAvailabilityZonesResponse {\n");
        sb.append("    availabilityZoneInfos: ").append(toIndentedString(availabilityZoneInfos)).append("\n");
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
