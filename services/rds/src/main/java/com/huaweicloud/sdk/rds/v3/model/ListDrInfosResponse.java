package com.huaweicloud.sdk.rds.v3.model;

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
public class ListDrInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_dr_infos")

    private List<InstanceDrInfo> instanceDrInfos = null;

    public ListDrInfosResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListDrInfosResponse withInstanceDrInfos(List<InstanceDrInfo> instanceDrInfos) {
        this.instanceDrInfos = instanceDrInfos;
        return this;
    }

    public ListDrInfosResponse addInstanceDrInfosItem(InstanceDrInfo instanceDrInfosItem) {
        if (this.instanceDrInfos == null) {
            this.instanceDrInfos = new ArrayList<>();
        }
        this.instanceDrInfos.add(instanceDrInfosItem);
        return this;
    }

    public ListDrInfosResponse withInstanceDrInfos(Consumer<List<InstanceDrInfo>> instanceDrInfosSetter) {
        if (this.instanceDrInfos == null) {
            this.instanceDrInfos = new ArrayList<>();
        }
        instanceDrInfosSetter.accept(this.instanceDrInfos);
        return this;
    }

    /**
     * 实例容灾信息
     * @return instanceDrInfos
     */
    public List<InstanceDrInfo> getInstanceDrInfos() {
        return instanceDrInfos;
    }

    public void setInstanceDrInfos(List<InstanceDrInfo> instanceDrInfos) {
        this.instanceDrInfos = instanceDrInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDrInfosResponse that = (ListDrInfosResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.instanceDrInfos, that.instanceDrInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, instanceDrInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDrInfosResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    instanceDrInfos: ").append(toIndentedString(instanceDrInfos)).append("\n");
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
