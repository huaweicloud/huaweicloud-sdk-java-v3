package com.huaweicloud.sdk.das.v3.model;

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
public class ListInstancesApiResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_infos")

    private List<DASInstanceInfoDto> instanceInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListInstancesApiResponse withInstanceInfos(List<DASInstanceInfoDto> instanceInfos) {
        this.instanceInfos = instanceInfos;
        return this;
    }

    public ListInstancesApiResponse addInstanceInfosItem(DASInstanceInfoDto instanceInfosItem) {
        if (this.instanceInfos == null) {
            this.instanceInfos = new ArrayList<>();
        }
        this.instanceInfos.add(instanceInfosItem);
        return this;
    }

    public ListInstancesApiResponse withInstanceInfos(Consumer<List<DASInstanceInfoDto>> instanceInfosSetter) {
        if (this.instanceInfos == null) {
            this.instanceInfos = new ArrayList<>();
        }
        instanceInfosSetter.accept(this.instanceInfos);
        return this;
    }

    /**
     * 实例列表
     * @return instanceInfos
     */
    public List<DASInstanceInfoDto> getInstanceInfos() {
        return instanceInfos;
    }

    public void setInstanceInfos(List<DASInstanceInfoDto> instanceInfos) {
        this.instanceInfos = instanceInfos;
    }

    public ListInstancesApiResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesApiResponse that = (ListInstancesApiResponse) obj;
        return Objects.equals(this.instanceInfos, that.instanceInfos)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceInfos, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesApiResponse {\n");
        sb.append("    instanceInfos: ").append(toIndentedString(instanceInfos)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
