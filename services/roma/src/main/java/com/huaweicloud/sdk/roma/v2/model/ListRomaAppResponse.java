package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.ServerAppInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRomaAppResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apps")
    
    private List<ServerAppInfo> apps = null;
    
    public ListRomaAppResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总的数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListRomaAppResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 当前页数量
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListRomaAppResponse withApps(List<ServerAppInfo> apps) {
        this.apps = apps;
        return this;
    }

    
    public ListRomaAppResponse addAppsItem(ServerAppInfo appsItem) {
        if(this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public ListRomaAppResponse withApps(Consumer<List<ServerAppInfo>> appsSetter) {
        if(this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * 创建用户信息
     * @return apps
     */
    public List<ServerAppInfo> getApps() {
        return apps;
    }

    public void setApps(List<ServerAppInfo> apps) {
        this.apps = apps;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRomaAppResponse listRomaAppResponse = (ListRomaAppResponse) o;
        return Objects.equals(this.total, listRomaAppResponse.total) &&
            Objects.equals(this.size, listRomaAppResponse.size) &&
            Objects.equals(this.apps, listRomaAppResponse.apps);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, size, apps);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRomaAppResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
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

