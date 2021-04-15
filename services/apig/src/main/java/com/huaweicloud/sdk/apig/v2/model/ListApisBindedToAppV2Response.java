package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.AppAuthBindedApiResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListApisBindedToAppV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auths")
    
    private List<AppAuthBindedApiResp> auths = null;
    
    public ListApisBindedToAppV2Response withTotal(Integer total) {
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

    

    public ListApisBindedToAppV2Response withSize(Integer size) {
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

    

    public ListApisBindedToAppV2Response withAuths(List<AppAuthBindedApiResp> auths) {
        this.auths = auths;
        return this;
    }

    
    public ListApisBindedToAppV2Response addAuthsItem(AppAuthBindedApiResp authsItem) {
        if(this.auths == null) {
            this.auths = new ArrayList<>();
        }
        this.auths.add(authsItem);
        return this;
    }

    public ListApisBindedToAppV2Response withAuths(Consumer<List<AppAuthBindedApiResp>> authsSetter) {
        if(this.auths == null) {
            this.auths = new ArrayList<>();
        }
        authsSetter.accept(this.auths);
        return this;
    }

    /**
     * 本次返回的API列表
     * @return auths
     */
    public List<AppAuthBindedApiResp> getAuths() {
        return auths;
    }

    public void setAuths(List<AppAuthBindedApiResp> auths) {
        this.auths = auths;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApisBindedToAppV2Response listApisBindedToAppV2Response = (ListApisBindedToAppV2Response) o;
        return Objects.equals(this.total, listApisBindedToAppV2Response.total) &&
            Objects.equals(this.size, listApisBindedToAppV2Response.size) &&
            Objects.equals(this.auths, listApisBindedToAppV2Response.auths);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, size, auths);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApisBindedToAppV2Response {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    auths: ").append(toIndentedString(auths)).append("\n");
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

