package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListFirewallsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewalls")

    private List<Firewall> firewalls = null;

    public ListFirewallsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 网络ACL数量。
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListFirewallsResponse withFirewalls(List<Firewall> firewalls) {
        this.firewalls = firewalls;
        return this;
    }

    public ListFirewallsResponse addFirewallsItem(Firewall firewallsItem) {
        if (this.firewalls == null) {
            this.firewalls = new ArrayList<>();
        }
        this.firewalls.add(firewallsItem);
        return this;
    }

    public ListFirewallsResponse withFirewalls(Consumer<List<Firewall>> firewallsSetter) {
        if (this.firewalls == null) {
            this.firewalls = new ArrayList<>();
        }
        firewallsSetter.accept(this.firewalls);
        return this;
    }

    /** 网络ACL列表。
     * 
     * @return firewalls */
    public List<Firewall> getFirewalls() {
        return firewalls;
    }

    public void setFirewalls(List<Firewall> firewalls) {
        this.firewalls = firewalls;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFirewallsResponse listFirewallsResponse = (ListFirewallsResponse) o;
        return Objects.equals(this.count, listFirewallsResponse.count)
            && Objects.equals(this.firewalls, listFirewallsResponse.firewalls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, firewalls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFirewallsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    firewalls: ").append(toIndentedString(firewalls)).append("\n");
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
