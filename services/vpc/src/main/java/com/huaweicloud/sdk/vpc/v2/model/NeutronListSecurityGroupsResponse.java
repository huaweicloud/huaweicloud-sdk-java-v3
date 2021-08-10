package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class NeutronListSecurityGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<NeutronSecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups_links")

    private List<NeutronPageLink> securityGroupsLinks = null;

    public NeutronListSecurityGroupsResponse withSecurityGroups(List<NeutronSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public NeutronListSecurityGroupsResponse addSecurityGroupsItem(NeutronSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public NeutronListSecurityGroupsResponse withSecurityGroups(
        Consumer<List<NeutronSecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /** 安全组对象列表
     * 
     * @return securityGroups */
    public List<NeutronSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<NeutronSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public NeutronListSecurityGroupsResponse withSecurityGroupsLinks(List<NeutronPageLink> securityGroupsLinks) {
        this.securityGroupsLinks = securityGroupsLinks;
        return this;
    }

    public NeutronListSecurityGroupsResponse addSecurityGroupsLinksItem(NeutronPageLink securityGroupsLinksItem) {
        if (this.securityGroupsLinks == null) {
            this.securityGroupsLinks = new ArrayList<>();
        }
        this.securityGroupsLinks.add(securityGroupsLinksItem);
        return this;
    }

    public NeutronListSecurityGroupsResponse withSecurityGroupsLinks(
        Consumer<List<NeutronPageLink>> securityGroupsLinksSetter) {
        if (this.securityGroupsLinks == null) {
            this.securityGroupsLinks = new ArrayList<>();
        }
        securityGroupsLinksSetter.accept(this.securityGroupsLinks);
        return this;
    }

    /** 分页信息
     * 
     * @return securityGroupsLinks */
    public List<NeutronPageLink> getSecurityGroupsLinks() {
        return securityGroupsLinks;
    }

    public void setSecurityGroupsLinks(List<NeutronPageLink> securityGroupsLinks) {
        this.securityGroupsLinks = securityGroupsLinks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronListSecurityGroupsResponse neutronListSecurityGroupsResponse = (NeutronListSecurityGroupsResponse) o;
        return Objects.equals(this.securityGroups, neutronListSecurityGroupsResponse.securityGroups)
            && Objects.equals(this.securityGroupsLinks, neutronListSecurityGroupsResponse.securityGroupsLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroups, securityGroupsLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListSecurityGroupsResponse {\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    securityGroupsLinks: ").append(toIndentedString(securityGroupsLinks)).append("\n");
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
