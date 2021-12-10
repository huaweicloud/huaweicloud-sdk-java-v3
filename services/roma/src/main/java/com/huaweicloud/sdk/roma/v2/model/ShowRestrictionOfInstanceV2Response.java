package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowRestrictionOfInstanceV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restrict_cidrs")

    private List<String> restrictCidrs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_subnet_cidr")

    private String resourceSubnetCidr;

    public ShowRestrictionOfInstanceV2Response withRestrictCidrs(List<String> restrictCidrs) {
        this.restrictCidrs = restrictCidrs;
        return this;
    }

    public ShowRestrictionOfInstanceV2Response addRestrictCidrsItem(String restrictCidrsItem) {
        if (this.restrictCidrs == null) {
            this.restrictCidrs = new ArrayList<>();
        }
        this.restrictCidrs.add(restrictCidrsItem);
        return this;
    }

    public ShowRestrictionOfInstanceV2Response withRestrictCidrs(Consumer<List<String>> restrictCidrsSetter) {
        if (this.restrictCidrs == null) {
            this.restrictCidrs = new ArrayList<>();
        }
        restrictCidrsSetter.accept(this.restrictCidrs);
        return this;
    }

    /** 受限的IP网段的CIDR列表。
     * 
     * @return restrictCidrs */
    public List<String> getRestrictCidrs() {
        return restrictCidrs;
    }

    public void setRestrictCidrs(List<String> restrictCidrs) {
        this.restrictCidrs = restrictCidrs;
    }

    public ShowRestrictionOfInstanceV2Response withResourceSubnetCidr(String resourceSubnetCidr) {
        this.resourceSubnetCidr = resourceSubnetCidr;
        return this;
    }

    /** 资源租户的IP网段的CIDR。
     * 
     * @return resourceSubnetCidr */
    public String getResourceSubnetCidr() {
        return resourceSubnetCidr;
    }

    public void setResourceSubnetCidr(String resourceSubnetCidr) {
        this.resourceSubnetCidr = resourceSubnetCidr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowRestrictionOfInstanceV2Response showRestrictionOfInstanceV2Response =
            (ShowRestrictionOfInstanceV2Response) o;
        return Objects.equals(this.restrictCidrs, showRestrictionOfInstanceV2Response.restrictCidrs)
            && Objects.equals(this.resourceSubnetCidr, showRestrictionOfInstanceV2Response.resourceSubnetCidr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restrictCidrs, resourceSubnetCidr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRestrictionOfInstanceV2Response {\n");
        sb.append("    restrictCidrs: ").append(toIndentedString(restrictCidrs)).append("\n");
        sb.append("    resourceSubnetCidr: ").append(toIndentedString(resourceSubnetCidr)).append("\n");
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
