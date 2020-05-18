package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.Vpc;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListVpcsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpcs")
    
    private List<Vpc> vpcs = null;
    
    public ListVpcsResponse withVpcs(List<Vpc> vpcs) {
        this.vpcs = vpcs;
        return this;
    }

    
    public ListVpcsResponse addVpcsItem(Vpc vpcsItem) {
        if (this.vpcs == null) {
            this.vpcs = new ArrayList<>();
        }
        this.vpcs.add(vpcsItem);
        return this;
    }

    public ListVpcsResponse withVpcs(Consumer<List<Vpc>> vpcsSetter) {
        if(this.vpcs == null ){
            this.vpcs = new ArrayList<>();
        }
        vpcsSetter.accept(this.vpcs);
        return this;
    }

    /**
     * vpc对象列表
     * @return vpcs
     */
    public List<Vpc> getVpcs() {
        return vpcs;
    }

    public void setVpcs(List<Vpc> vpcs) {
        this.vpcs = vpcs;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVpcsResponse listVpcsResponse = (ListVpcsResponse) o;
        return Objects.equals(this.vpcs, listVpcsResponse.vpcs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vpcs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpcsResponse {\n");
            sb.append("    vpcs: ").append(toIndentedString(vpcs)).append("\n");
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

