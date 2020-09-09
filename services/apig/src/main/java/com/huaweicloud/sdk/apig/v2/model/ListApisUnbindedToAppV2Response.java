package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.AppAuthUnBindedApiResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListApisUnbindedToAppV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apis")
    
    private List<AppAuthUnBindedApiResp> apis = null;
    
    public ListApisUnbindedToAppV2Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 符合条件的API总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListApisUnbindedToAppV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListApisUnbindedToAppV2Response withApis(List<AppAuthUnBindedApiResp> apis) {
        this.apis = apis;
        return this;
    }

    
    public ListApisUnbindedToAppV2Response addApisItem(AppAuthUnBindedApiResp apisItem) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        this.apis.add(apisItem);
        return this;
    }

    public ListApisUnbindedToAppV2Response withApis(Consumer<List<AppAuthUnBindedApiResp>> apisSetter) {
        if(this.apis == null ){
            this.apis = new ArrayList<>();
        }
        apisSetter.accept(this.apis);
        return this;
    }

    /**
     * 本次返回的API列表
     * @return apis
     */
    public List<AppAuthUnBindedApiResp> getApis() {
        return apis;
    }

    public void setApis(List<AppAuthUnBindedApiResp> apis) {
        this.apis = apis;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApisUnbindedToAppV2Response listApisUnbindedToAppV2Response = (ListApisUnbindedToAppV2Response) o;
        return Objects.equals(this.total, listApisUnbindedToAppV2Response.total) &&
            Objects.equals(this.size, listApisUnbindedToAppV2Response.size) &&
            Objects.equals(this.apis, listApisUnbindedToAppV2Response.apis);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, size, apis);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApisUnbindedToAppV2Response {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
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

