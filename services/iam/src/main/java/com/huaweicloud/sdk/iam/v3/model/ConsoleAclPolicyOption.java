package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ConsoleAclPolicyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_address_netmasks")

    private List<AllowAddressNetmasksOption> allowAddressNetmasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_ip_ranges")

    private List<AllowIpRangesOption> allowIpRanges = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_address_netmasks_ipv6")

    private List<AllowAddressNetmasksOptionIPv6> allowAddressNetmasksIpv6 = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_ip_ranges_ipv6")

    private List<AllowIpRangesOptionIPv6> allowIpRangesIpv6 = null;

    public ConsoleAclPolicyOption withAllowAddressNetmasks(List<AllowAddressNetmasksOption> allowAddressNetmasks) {
        this.allowAddressNetmasks = allowAddressNetmasks;
        return this;
    }

    public ConsoleAclPolicyOption addAllowAddressNetmasksItem(AllowAddressNetmasksOption allowAddressNetmasksItem) {
        if (this.allowAddressNetmasks == null) {
            this.allowAddressNetmasks = new ArrayList<>();
        }
        this.allowAddressNetmasks.add(allowAddressNetmasksItem);
        return this;
    }

    public ConsoleAclPolicyOption withAllowAddressNetmasks(
        Consumer<List<AllowAddressNetmasksOption>> allowAddressNetmasksSetter) {
        if (this.allowAddressNetmasks == null) {
            this.allowAddressNetmasks = new ArrayList<>();
        }
        allowAddressNetmasksSetter.accept(this.allowAddressNetmasks);
        return this;
    }

    /**
     * 允许访问的IP地址或网段。
     * @return allowAddressNetmasks
     */
    public List<AllowAddressNetmasksOption> getAllowAddressNetmasks() {
        return allowAddressNetmasks;
    }

    public void setAllowAddressNetmasks(List<AllowAddressNetmasksOption> allowAddressNetmasks) {
        this.allowAddressNetmasks = allowAddressNetmasks;
    }

    public ConsoleAclPolicyOption withAllowIpRanges(List<AllowIpRangesOption> allowIpRanges) {
        this.allowIpRanges = allowIpRanges;
        return this;
    }

    public ConsoleAclPolicyOption addAllowIpRangesItem(AllowIpRangesOption allowIpRangesItem) {
        if (this.allowIpRanges == null) {
            this.allowIpRanges = new ArrayList<>();
        }
        this.allowIpRanges.add(allowIpRangesItem);
        return this;
    }

    public ConsoleAclPolicyOption withAllowIpRanges(Consumer<List<AllowIpRangesOption>> allowIpRangesSetter) {
        if (this.allowIpRanges == null) {
            this.allowIpRanges = new ArrayList<>();
        }
        allowIpRangesSetter.accept(this.allowIpRanges);
        return this;
    }

    /**
     * 允许访问的IP地址区间。
     * @return allowIpRanges
     */
    public List<AllowIpRangesOption> getAllowIpRanges() {
        return allowIpRanges;
    }

    public void setAllowIpRanges(List<AllowIpRangesOption> allowIpRanges) {
        this.allowIpRanges = allowIpRanges;
    }

    public ConsoleAclPolicyOption withAllowAddressNetmasksIpv6(
        List<AllowAddressNetmasksOptionIPv6> allowAddressNetmasksIpv6) {
        this.allowAddressNetmasksIpv6 = allowAddressNetmasksIpv6;
        return this;
    }

    public ConsoleAclPolicyOption addAllowAddressNetmasksIpv6Item(
        AllowAddressNetmasksOptionIPv6 allowAddressNetmasksIpv6Item) {
        if (this.allowAddressNetmasksIpv6 == null) {
            this.allowAddressNetmasksIpv6 = new ArrayList<>();
        }
        this.allowAddressNetmasksIpv6.add(allowAddressNetmasksIpv6Item);
        return this;
    }

    public ConsoleAclPolicyOption withAllowAddressNetmasksIpv6(
        Consumer<List<AllowAddressNetmasksOptionIPv6>> allowAddressNetmasksIpv6Setter) {
        if (this.allowAddressNetmasksIpv6 == null) {
            this.allowAddressNetmasksIpv6 = new ArrayList<>();
        }
        allowAddressNetmasksIpv6Setter.accept(this.allowAddressNetmasksIpv6);
        return this;
    }

    /**
     * 允许访问的IPv6地址或网段。
     * @return allowAddressNetmasksIpv6
     */
    public List<AllowAddressNetmasksOptionIPv6> getAllowAddressNetmasksIpv6() {
        return allowAddressNetmasksIpv6;
    }

    public void setAllowAddressNetmasksIpv6(List<AllowAddressNetmasksOptionIPv6> allowAddressNetmasksIpv6) {
        this.allowAddressNetmasksIpv6 = allowAddressNetmasksIpv6;
    }

    public ConsoleAclPolicyOption withAllowIpRangesIpv6(List<AllowIpRangesOptionIPv6> allowIpRangesIpv6) {
        this.allowIpRangesIpv6 = allowIpRangesIpv6;
        return this;
    }

    public ConsoleAclPolicyOption addAllowIpRangesIpv6Item(AllowIpRangesOptionIPv6 allowIpRangesIpv6Item) {
        if (this.allowIpRangesIpv6 == null) {
            this.allowIpRangesIpv6 = new ArrayList<>();
        }
        this.allowIpRangesIpv6.add(allowIpRangesIpv6Item);
        return this;
    }

    public ConsoleAclPolicyOption withAllowIpRangesIpv6(
        Consumer<List<AllowIpRangesOptionIPv6>> allowIpRangesIpv6Setter) {
        if (this.allowIpRangesIpv6 == null) {
            this.allowIpRangesIpv6 = new ArrayList<>();
        }
        allowIpRangesIpv6Setter.accept(this.allowIpRangesIpv6);
        return this;
    }

    /**
     * 允许访问的IPv6地址区间。
     * @return allowIpRangesIpv6
     */
    public List<AllowIpRangesOptionIPv6> getAllowIpRangesIpv6() {
        return allowIpRangesIpv6;
    }

    public void setAllowIpRangesIpv6(List<AllowIpRangesOptionIPv6> allowIpRangesIpv6) {
        this.allowIpRangesIpv6 = allowIpRangesIpv6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsoleAclPolicyOption that = (ConsoleAclPolicyOption) obj;
        return Objects.equals(this.allowAddressNetmasks, that.allowAddressNetmasks)
            && Objects.equals(this.allowIpRanges, that.allowIpRanges)
            && Objects.equals(this.allowAddressNetmasksIpv6, that.allowAddressNetmasksIpv6)
            && Objects.equals(this.allowIpRangesIpv6, that.allowIpRangesIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowAddressNetmasks, allowIpRanges, allowAddressNetmasksIpv6, allowIpRangesIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsoleAclPolicyOption {\n");
        sb.append("    allowAddressNetmasks: ").append(toIndentedString(allowAddressNetmasks)).append("\n");
        sb.append("    allowIpRanges: ").append(toIndentedString(allowIpRanges)).append("\n");
        sb.append("    allowAddressNetmasksIpv6: ").append(toIndentedString(allowAddressNetmasksIpv6)).append("\n");
        sb.append("    allowIpRangesIpv6: ").append(toIndentedString(allowIpRangesIpv6)).append("\n");
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
