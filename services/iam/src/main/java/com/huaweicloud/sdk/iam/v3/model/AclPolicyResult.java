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
public class AclPolicyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_address_netmasks")

    private List<AllowAddressNetmasksResult> allowAddressNetmasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_ip_ranges")

    private List<AllowIpRangesResult> allowIpRanges = null;

    public AclPolicyResult withAllowAddressNetmasks(List<AllowAddressNetmasksResult> allowAddressNetmasks) {
        this.allowAddressNetmasks = allowAddressNetmasks;
        return this;
    }

    public AclPolicyResult addAllowAddressNetmasksItem(AllowAddressNetmasksResult allowAddressNetmasksItem) {
        if (this.allowAddressNetmasks == null) {
            this.allowAddressNetmasks = new ArrayList<>();
        }
        this.allowAddressNetmasks.add(allowAddressNetmasksItem);
        return this;
    }

    public AclPolicyResult withAllowAddressNetmasks(
        Consumer<List<AllowAddressNetmasksResult>> allowAddressNetmasksSetter) {
        if (this.allowAddressNetmasks == null) {
            this.allowAddressNetmasks = new ArrayList<>();
        }
        allowAddressNetmasksSetter.accept(this.allowAddressNetmasks);
        return this;
    }

    /** 允许访问的IP地址或网段。
     * 
     * @return allowAddressNetmasks */
    public List<AllowAddressNetmasksResult> getAllowAddressNetmasks() {
        return allowAddressNetmasks;
    }

    public void setAllowAddressNetmasks(List<AllowAddressNetmasksResult> allowAddressNetmasks) {
        this.allowAddressNetmasks = allowAddressNetmasks;
    }

    public AclPolicyResult withAllowIpRanges(List<AllowIpRangesResult> allowIpRanges) {
        this.allowIpRanges = allowIpRanges;
        return this;
    }

    public AclPolicyResult addAllowIpRangesItem(AllowIpRangesResult allowIpRangesItem) {
        if (this.allowIpRanges == null) {
            this.allowIpRanges = new ArrayList<>();
        }
        this.allowIpRanges.add(allowIpRangesItem);
        return this;
    }

    public AclPolicyResult withAllowIpRanges(Consumer<List<AllowIpRangesResult>> allowIpRangesSetter) {
        if (this.allowIpRanges == null) {
            this.allowIpRanges = new ArrayList<>();
        }
        allowIpRangesSetter.accept(this.allowIpRanges);
        return this;
    }

    /** 允许访问的IP地址区间。
     * 
     * @return allowIpRanges */
    public List<AllowIpRangesResult> getAllowIpRanges() {
        return allowIpRanges;
    }

    public void setAllowIpRanges(List<AllowIpRangesResult> allowIpRanges) {
        this.allowIpRanges = allowIpRanges;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AclPolicyResult aclPolicyResult = (AclPolicyResult) o;
        return Objects.equals(this.allowAddressNetmasks, aclPolicyResult.allowAddressNetmasks)
            && Objects.equals(this.allowIpRanges, aclPolicyResult.allowIpRanges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowAddressNetmasks, allowIpRanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AclPolicyResult {\n");
        sb.append("    allowAddressNetmasks: ").append(toIndentedString(allowAddressNetmasks)).append("\n");
        sb.append("    allowIpRanges: ").append(toIndentedString(allowIpRanges)).append("\n");
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
