package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 可用域信息 */
public class NovaAvailabilityZone {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<String> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zoneName")

    private String zoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zoneState")

    private NovaAvailabilityZoneState zoneState;

    public NovaAvailabilityZone withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public NovaAvailabilityZone addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public NovaAvailabilityZone withHosts(Consumer<List<String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /** 该字段的值为null。
     * 
     * @return hosts */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public NovaAvailabilityZone withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /** 可用域的名称。
     * 
     * @return zoneName */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public NovaAvailabilityZone withZoneState(NovaAvailabilityZoneState zoneState) {
        this.zoneState = zoneState;
        return this;
    }

    public NovaAvailabilityZone withZoneState(Consumer<NovaAvailabilityZoneState> zoneStateSetter) {
        if (this.zoneState == null) {
            this.zoneState = new NovaAvailabilityZoneState();
            zoneStateSetter.accept(this.zoneState);
        }

        return this;
    }

    /** Get zoneState
     * 
     * @return zoneState */
    public NovaAvailabilityZoneState getZoneState() {
        return zoneState;
    }

    public void setZoneState(NovaAvailabilityZoneState zoneState) {
        this.zoneState = zoneState;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaAvailabilityZone novaAvailabilityZone = (NovaAvailabilityZone) o;
        return Objects.equals(this.hosts, novaAvailabilityZone.hosts)
            && Objects.equals(this.zoneName, novaAvailabilityZone.zoneName)
            && Objects.equals(this.zoneState, novaAvailabilityZone.zoneState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hosts, zoneName, zoneState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaAvailabilityZone {\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
        sb.append("    zoneState: ").append(toIndentedString(zoneState)).append("\n");
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
