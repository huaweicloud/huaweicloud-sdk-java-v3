package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlProxyFlavorGroups;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowGaussMySqlProxyFlavorsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy_flavor_groups")
    
    
    private List<MysqlProxyFlavorGroups> proxyFlavorGroups = null;
    
    public ShowGaussMySqlProxyFlavorsResponse withProxyFlavorGroups(List<MysqlProxyFlavorGroups> proxyFlavorGroups) {
        this.proxyFlavorGroups = proxyFlavorGroups;
        return this;
    }

    
    public ShowGaussMySqlProxyFlavorsResponse addProxyFlavorGroupsItem(MysqlProxyFlavorGroups proxyFlavorGroupsItem) {
        if(this.proxyFlavorGroups == null) {
            this.proxyFlavorGroups = new ArrayList<>();
        }
        this.proxyFlavorGroups.add(proxyFlavorGroupsItem);
        return this;
    }

    public ShowGaussMySqlProxyFlavorsResponse withProxyFlavorGroups(Consumer<List<MysqlProxyFlavorGroups>> proxyFlavorGroupsSetter) {
        if(this.proxyFlavorGroups == null) {
            this.proxyFlavorGroups = new ArrayList<>();
        }
        proxyFlavorGroupsSetter.accept(this.proxyFlavorGroups);
        return this;
    }

    /**
     * 规格组信息。
     * @return proxyFlavorGroups
     */
    public List<MysqlProxyFlavorGroups> getProxyFlavorGroups() {
        return proxyFlavorGroups;
    }

    public void setProxyFlavorGroups(List<MysqlProxyFlavorGroups> proxyFlavorGroups) {
        this.proxyFlavorGroups = proxyFlavorGroups;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGaussMySqlProxyFlavorsResponse showGaussMySqlProxyFlavorsResponse = (ShowGaussMySqlProxyFlavorsResponse) o;
        return Objects.equals(this.proxyFlavorGroups, showGaussMySqlProxyFlavorsResponse.proxyFlavorGroups);
    }
    @Override
    public int hashCode() {
        return Objects.hash(proxyFlavorGroups);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGaussMySqlProxyFlavorsResponse {\n");
        sb.append("    proxyFlavorGroups: ").append(toIndentedString(proxyFlavorGroups)).append("\n");
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

