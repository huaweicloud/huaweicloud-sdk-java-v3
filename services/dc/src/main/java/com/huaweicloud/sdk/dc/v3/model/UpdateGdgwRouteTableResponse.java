package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateGdgwRouteTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gdgw_routetable")

    private List<ShowGdgwRoutetable> gdgwRoutetable = null;

    public UpdateGdgwRouteTableResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateGdgwRouteTableResponse withGdgwRoutetable(List<ShowGdgwRoutetable> gdgwRoutetable) {
        this.gdgwRoutetable = gdgwRoutetable;
        return this;
    }

    public UpdateGdgwRouteTableResponse addGdgwRoutetableItem(ShowGdgwRoutetable gdgwRoutetableItem) {
        if (this.gdgwRoutetable == null) {
            this.gdgwRoutetable = new ArrayList<>();
        }
        this.gdgwRoutetable.add(gdgwRoutetableItem);
        return this;
    }

    public UpdateGdgwRouteTableResponse withGdgwRoutetable(Consumer<List<ShowGdgwRoutetable>> gdgwRoutetableSetter) {
        if (this.gdgwRoutetable == null) {
            this.gdgwRoutetable = new ArrayList<>();
        }
        gdgwRoutetableSetter.accept(this.gdgwRoutetable);
        return this;
    }

    /**
     * 全域接入网关路由表
     * @return gdgwRoutetable
     */
    public List<ShowGdgwRoutetable> getGdgwRoutetable() {
        return gdgwRoutetable;
    }

    public void setGdgwRoutetable(List<ShowGdgwRoutetable> gdgwRoutetable) {
        this.gdgwRoutetable = gdgwRoutetable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGdgwRouteTableResponse that = (UpdateGdgwRouteTableResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.gdgwRoutetable, that.gdgwRoutetable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, gdgwRoutetable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGdgwRouteTableResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    gdgwRoutetable: ").append(toIndentedString(gdgwRoutetable)).append("\n");
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
