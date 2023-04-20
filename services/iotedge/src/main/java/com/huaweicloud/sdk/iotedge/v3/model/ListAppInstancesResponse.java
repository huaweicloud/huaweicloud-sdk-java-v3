package com.huaweicloud.sdk.iotedge.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v3.model.QueryAppInstanceResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAppInstancesResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_instances")
    
    private List<QueryAppInstanceResp> appInstances = null;
    
    public ListAppInstancesResponse withAppInstances(List<QueryAppInstanceResp> appInstances) {
        this.appInstances = appInstances;
        return this;
    }

    
    public ListAppInstancesResponse addAppInstancesItem(QueryAppInstanceResp appInstancesItem) {
        if(this.appInstances == null) {
            this.appInstances = new ArrayList<>();
        }
        this.appInstances.add(appInstancesItem);
        return this;
    }

    public ListAppInstancesResponse withAppInstances(Consumer<List<QueryAppInstanceResp>> appInstancesSetter) {
        if(this.appInstances == null) {
            this.appInstances = new ArrayList<>();
        }
        appInstancesSetter.accept(this.appInstances);
        return this;
    }

    /**
     * 应用实例列表
     * @return appInstances
     */
    public List<QueryAppInstanceResp> getAppInstances() {
        return appInstances;
    }

    public void setAppInstances(List<QueryAppInstanceResp> appInstances) {
        this.appInstances = appInstances;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppInstancesResponse listAppInstancesResponse = (ListAppInstancesResponse) o;
        return Objects.equals(this.appInstances, listAppInstancesResponse.appInstances);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appInstances);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppInstancesResponse {\n");
        sb.append("    appInstances: ").append(toIndentedString(appInstances)).append("\n");
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

