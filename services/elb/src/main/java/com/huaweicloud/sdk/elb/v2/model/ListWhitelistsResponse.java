package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.WhitelistResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListWhitelistsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="whitelists")
    
    private List<WhitelistResp> whitelists = null;
    
    public ListWhitelistsResponse withWhitelists(List<WhitelistResp> whitelists) {
        this.whitelists = whitelists;
        return this;
    }

    
    public ListWhitelistsResponse addWhitelistsItem(WhitelistResp whitelistsItem) {
        if (this.whitelists == null) {
            this.whitelists = new ArrayList<>();
        }
        this.whitelists.add(whitelistsItem);
        return this;
    }

    public ListWhitelistsResponse withWhitelists(Consumer<List<WhitelistResp>> whitelistsSetter) {
        if(this.whitelists == null ){
            this.whitelists = new ArrayList<>();
        }
        whitelistsSetter.accept(this.whitelists);
        return this;
    }

    /**
     * 白名单对象的列表
     * @return whitelists
     */
    public List<WhitelistResp> getWhitelists() {
        return whitelists;
    }

    public void setWhitelists(List<WhitelistResp> whitelists) {
        this.whitelists = whitelists;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWhitelistsResponse listWhitelistsResponse = (ListWhitelistsResponse) o;
        return Objects.equals(this.whitelists, listWhitelistsResponse.whitelists);
    }
    @Override
    public int hashCode() {
        return Objects.hash(whitelists);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWhitelistsResponse {\n");
        sb.append("    whitelists: ").append(toIndentedString(whitelists)).append("\n");
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

