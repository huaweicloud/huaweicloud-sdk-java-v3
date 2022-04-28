package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlShowProxyResponseV3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowGaussMySqlProxyListResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy_list")
    
    
    private List<MysqlShowProxyResponseV3> proxyList = null;
    
    public ShowGaussMySqlProxyListResponse withProxyList(List<MysqlShowProxyResponseV3> proxyList) {
        this.proxyList = proxyList;
        return this;
    }

    
    public ShowGaussMySqlProxyListResponse addProxyListItem(MysqlShowProxyResponseV3 proxyListItem) {
        if(this.proxyList == null) {
            this.proxyList = new ArrayList<>();
        }
        this.proxyList.add(proxyListItem);
        return this;
    }

    public ShowGaussMySqlProxyListResponse withProxyList(Consumer<List<MysqlShowProxyResponseV3>> proxyListSetter) {
        if(this.proxyList == null) {
            this.proxyList = new ArrayList<>();
        }
        proxyListSetter.accept(this.proxyList);
        return this;
    }

    /**
     * Proxy实例信息列表。
     * @return proxyList
     */
    public List<MysqlShowProxyResponseV3> getProxyList() {
        return proxyList;
    }

    public void setProxyList(List<MysqlShowProxyResponseV3> proxyList) {
        this.proxyList = proxyList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGaussMySqlProxyListResponse showGaussMySqlProxyListResponse = (ShowGaussMySqlProxyListResponse) o;
        return Objects.equals(this.proxyList, showGaussMySqlProxyListResponse.proxyList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(proxyList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGaussMySqlProxyListResponse {\n");
        sb.append("    proxyList: ").append(toIndentedString(proxyList)).append("\n");
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

