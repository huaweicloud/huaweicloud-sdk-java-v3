package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 集群实例环信息。 **取值范围**： 不涉及。
 */
public class LogicalClusterRingInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ring_hosts")

    private List<RingHost> ringHosts = null;

    public LogicalClusterRingInfo withRingHosts(List<RingHost> ringHosts) {
        this.ringHosts = ringHosts;
        return this;
    }

    public LogicalClusterRingInfo addRingHostsItem(RingHost ringHostsItem) {
        if (this.ringHosts == null) {
            this.ringHosts = new ArrayList<>();
        }
        this.ringHosts.add(ringHostsItem);
        return this;
    }

    public LogicalClusterRingInfo withRingHosts(Consumer<List<RingHost>> ringHostsSetter) {
        if (this.ringHosts == null) {
            this.ringHosts = new ArrayList<>();
        }
        ringHostsSetter.accept(this.ringHosts);
        return this;
    }

    /**
     * **参数解释**： 集群实例环信息。 **取值范围**： 不涉及。
     * @return ringHosts
     */
    public List<RingHost> getRingHosts() {
        return ringHosts;
    }

    public void setRingHosts(List<RingHost> ringHosts) {
        this.ringHosts = ringHosts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogicalClusterRingInfo that = (LogicalClusterRingInfo) obj;
        return Objects.equals(this.ringHosts, that.ringHosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ringHosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicalClusterRingInfo {\n");
        sb.append("    ringHosts: ").append(toIndentedString(ringHosts)).append("\n");
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
