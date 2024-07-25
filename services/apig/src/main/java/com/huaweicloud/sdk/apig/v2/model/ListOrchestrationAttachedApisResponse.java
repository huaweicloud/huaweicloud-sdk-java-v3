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
public class ListOrchestrationAttachedApisResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apis")

    private List<OrchestrationApiInfo> apis = null;

    public ListOrchestrationAttachedApisResponse withSize(Integer size) {
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

    public ListOrchestrationAttachedApisResponse withTotal(Long total) {
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

    public ListOrchestrationAttachedApisResponse withApis(List<OrchestrationApiInfo> apis) {
        this.apis = apis;
        return this;
    }

    public ListOrchestrationAttachedApisResponse addApisItem(OrchestrationApiInfo apisItem) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        this.apis.add(apisItem);
        return this;
    }

    public ListOrchestrationAttachedApisResponse withApis(Consumer<List<OrchestrationApiInfo>> apisSetter) {
        if (this.apis == null) {
            this.apis = new ArrayList<>();
        }
        apisSetter.accept(this.apis);
        return this;
    }

    /**
     * 编排规则绑定的API列表。
     * @return apis
     */
    public List<OrchestrationApiInfo> getApis() {
        return apis;
    }

    public void setApis(List<OrchestrationApiInfo> apis) {
        this.apis = apis;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOrchestrationAttachedApisResponse that = (ListOrchestrationAttachedApisResponse) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.total, that.total)
            && Objects.equals(this.apis, that.apis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, apis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrchestrationAttachedApisResponse {\n");
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
