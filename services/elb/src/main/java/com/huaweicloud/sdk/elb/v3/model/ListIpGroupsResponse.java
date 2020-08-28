package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.IpGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListIpGroupsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ipgroups")
    
    private List<IpGroup> ipgroups = null;
    
    public ListIpGroupsResponse withIpgroups(List<IpGroup> ipgroups) {
        this.ipgroups = ipgroups;
        return this;
    }

    
    public ListIpGroupsResponse addIpgroupsItem(IpGroup ipgroupsItem) {
        if (this.ipgroups == null) {
            this.ipgroups = new ArrayList<>();
        }
        this.ipgroups.add(ipgroupsItem);
        return this;
    }

    public ListIpGroupsResponse withIpgroups(Consumer<List<IpGroup>> ipgroupsSetter) {
        if(this.ipgroups == null ){
            this.ipgroups = new ArrayList<>();
        }
        ipgroupsSetter.accept(this.ipgroups);
        return this;
    }

    /**
     * IP地址组列表返回对象。
     * @return ipgroups
     */
    public List<IpGroup> getIpgroups() {
        return ipgroups;
    }

    public void setIpgroups(List<IpGroup> ipgroups) {
        this.ipgroups = ipgroups;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIpGroupsResponse listIpGroupsResponse = (ListIpGroupsResponse) o;
        return Objects.equals(this.ipgroups, listIpGroupsResponse.ipgroups);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ipgroups);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIpGroupsResponse {\n");
        sb.append("    ipgroups: ").append(toIndentedString(ipgroups)).append("\n");
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

