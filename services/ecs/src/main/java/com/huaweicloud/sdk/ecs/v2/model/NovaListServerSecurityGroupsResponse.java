package com.huaweicloud.sdk.ecs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaSecurityGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class NovaListServerSecurityGroupsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<NovaSecurityGroup> securityGroups = null;
    
    public NovaListServerSecurityGroupsResponse withSecurityGroups(List<NovaSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public NovaListServerSecurityGroupsResponse addSecurityGroupsItem(NovaSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public NovaListServerSecurityGroupsResponse withSecurityGroups(Consumer<List<NovaSecurityGroup>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * security_group列表
     * @return securityGroups
     */
    public List<NovaSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<NovaSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaListServerSecurityGroupsResponse novaListServerSecurityGroupsResponse = (NovaListServerSecurityGroupsResponse) o;
        return Objects.equals(this.securityGroups, novaListServerSecurityGroupsResponse.securityGroups);
    }
    @Override
    public int hashCode() {
        return Objects.hash(securityGroups);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaListServerSecurityGroupsResponse {\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
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

