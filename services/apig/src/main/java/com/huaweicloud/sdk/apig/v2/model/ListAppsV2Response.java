package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.AppInfoWithBindNumResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAppsV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apps")
    
    private List<AppInfoWithBindNumResp> apps = null;
    
    public ListAppsV2Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 符合条件的APP总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListAppsV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 本次查询返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public ListAppsV2Response withApps(List<AppInfoWithBindNumResp> apps) {
        this.apps = apps;
        return this;
    }

    
    public ListAppsV2Response addAppsItem(AppInfoWithBindNumResp appsItem) {
        this.apps.add(appsItem);
        return this;
    }

    public ListAppsV2Response withApps(Consumer<List<AppInfoWithBindNumResp>> appsSetter) {
        if(this.apps == null ){
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * APP列表
     * @return apps
     */
    public List<AppInfoWithBindNumResp> getApps() {
        return apps;
    }

    public void setApps(List<AppInfoWithBindNumResp> apps) {
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
        ListAppsV2Response listAppsV2Response = (ListAppsV2Response) o;
        return Objects.equals(this.total, listAppsV2Response.total) &&
            Objects.equals(this.size, listAppsV2Response.size) &&
            Objects.equals(this.apps, listAppsV2Response.apps);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, size, apps);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppsV2Response {\n");
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

