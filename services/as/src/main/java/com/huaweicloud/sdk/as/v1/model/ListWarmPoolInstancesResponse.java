package com.huaweicloud.sdk.as.v1.model;

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
public class ListWarmPoolInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warm_pool_instances")

    private List<WarmPoolInstance> warmPoolInstances = null;

    public ListWarmPoolInstancesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListWarmPoolInstancesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListWarmPoolInstancesResponse withWarmPoolInstances(List<WarmPoolInstance> warmPoolInstances) {
        this.warmPoolInstances = warmPoolInstances;
        return this;
    }

    public ListWarmPoolInstancesResponse addWarmPoolInstancesItem(WarmPoolInstance warmPoolInstancesItem) {
        if (this.warmPoolInstances == null) {
            this.warmPoolInstances = new ArrayList<>();
        }
        this.warmPoolInstances.add(warmPoolInstancesItem);
        return this;
    }

    public ListWarmPoolInstancesResponse withWarmPoolInstances(
        Consumer<List<WarmPoolInstance>> warmPoolInstancesSetter) {
        if (this.warmPoolInstances == null) {
            this.warmPoolInstances = new ArrayList<>();
        }
        warmPoolInstancesSetter.accept(this.warmPoolInstances);
        return this;
    }

    /**
     * 暖池实例列表
     * @return warmPoolInstances
     */
    public List<WarmPoolInstance> getWarmPoolInstances() {
        return warmPoolInstances;
    }

    public void setWarmPoolInstances(List<WarmPoolInstance> warmPoolInstances) {
        this.warmPoolInstances = warmPoolInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWarmPoolInstancesResponse that = (ListWarmPoolInstancesResponse) obj;
        return Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.warmPoolInstances, that.warmPoolInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, warmPoolInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWarmPoolInstancesResponse {\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    warmPoolInstances: ").append(toIndentedString(warmPoolInstances)).append("\n");
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
