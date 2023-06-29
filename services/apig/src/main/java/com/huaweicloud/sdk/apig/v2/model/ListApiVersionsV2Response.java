package com.huaweicloud.sdk.apig.v2.model;

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
public class ListApiVersionsV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_versions")

    private List<ApiVersionResp> apiVersions = null;

    public ListApiVersionsV2Response withSize(Integer size) {
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

    public ListApiVersionsV2Response withTotal(Long total) {
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

    public ListApiVersionsV2Response withApiVersions(List<ApiVersionResp> apiVersions) {
        this.apiVersions = apiVersions;
        return this;
    }

    public ListApiVersionsV2Response addApiVersionsItem(ApiVersionResp apiVersionsItem) {
        if (this.apiVersions == null) {
            this.apiVersions = new ArrayList<>();
        }
        this.apiVersions.add(apiVersionsItem);
        return this;
    }

    public ListApiVersionsV2Response withApiVersions(Consumer<List<ApiVersionResp>> apiVersionsSetter) {
        if (this.apiVersions == null) {
            this.apiVersions = new ArrayList<>();
        }
        apiVersionsSetter.accept(this.apiVersions);
        return this;
    }

    /**
     * 本次查询返回的API历史版本列表
     * @return apiVersions
     */
    public List<ApiVersionResp> getApiVersions() {
        return apiVersions;
    }

    public void setApiVersions(List<ApiVersionResp> apiVersions) {
        this.apiVersions = apiVersions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApiVersionsV2Response that = (ListApiVersionsV2Response) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.total, that.total)
            && Objects.equals(this.apiVersions, that.apiVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, apiVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiVersionsV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    apiVersions: ").append(toIndentedString(apiVersions)).append("\n");
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
