package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListApisBindedToRequestThrottlingPolicyV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apis")

    @JacksonXmlProperty(localName = "apis")

    private List<ApiForThrottle> apis = null;

    public ListApisBindedToRequestThrottlingPolicyV2Response withSize(Integer size) {
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

    public ListApisBindedToRequestThrottlingPolicyV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListApisBindedToRequestThrottlingPolicyV2Response withApis(List<ApiForThrottle> apis) {
        this.apis = apis;
        return this;
    }

    public ListApisBindedToRequestThrottlingPolicyV2Response addApisItem(ApiForThrottle apisItem) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        this.apis.add(apisItem);
        return this;
    }

    public ListApisBindedToRequestThrottlingPolicyV2Response withApis(Consumer<List<ApiForThrottle>> apisSetter) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        apisSetter.accept(this.apis);
        return this;
    }

    /**
     * 本次查询返回的API列表
     * @return apis
     */
    public List<ApiForThrottle> getApis() {
        return apis;
    }

    public void setApis(List<ApiForThrottle> apis) {
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
        ListApisBindedToRequestThrottlingPolicyV2Response listApisBindedToRequestThrottlingPolicyV2Response =
            (ListApisBindedToRequestThrottlingPolicyV2Response) o;
        return Objects.equals(this.size, listApisBindedToRequestThrottlingPolicyV2Response.size)
            && Objects.equals(this.total, listApisBindedToRequestThrottlingPolicyV2Response.total)
            && Objects.equals(this.apis, listApisBindedToRequestThrottlingPolicyV2Response.apis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, apis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApisBindedToRequestThrottlingPolicyV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
