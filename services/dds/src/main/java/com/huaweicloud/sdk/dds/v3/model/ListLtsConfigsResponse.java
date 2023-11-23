package com.huaweicloud.sdk.dds.v3.model;

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
public class ListLtsConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_lts_configs")

    private List<ListLtsLogPolicyRespondBodyInstanceLtsConfigs> instanceLtsConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListLtsConfigsResponse withInstanceLtsConfigs(
        List<ListLtsLogPolicyRespondBodyInstanceLtsConfigs> instanceLtsConfigs) {
        this.instanceLtsConfigs = instanceLtsConfigs;
        return this;
    }

    public ListLtsConfigsResponse addInstanceLtsConfigsItem(
        ListLtsLogPolicyRespondBodyInstanceLtsConfigs instanceLtsConfigsItem) {
        if (this.instanceLtsConfigs == null) {
            this.instanceLtsConfigs = new ArrayList<>();
        }
        this.instanceLtsConfigs.add(instanceLtsConfigsItem);
        return this;
    }

    public ListLtsConfigsResponse withInstanceLtsConfigs(
        Consumer<List<ListLtsLogPolicyRespondBodyInstanceLtsConfigs>> instanceLtsConfigsSetter) {
        if (this.instanceLtsConfigs == null) {
            this.instanceLtsConfigs = new ArrayList<>();
        }
        instanceLtsConfigsSetter.accept(this.instanceLtsConfigs);
        return this;
    }

    /**
     * 每个实例的LTS日志配置信息和实例简要信息。
     * @return instanceLtsConfigs
     */
    public List<ListLtsLogPolicyRespondBodyInstanceLtsConfigs> getInstanceLtsConfigs() {
        return instanceLtsConfigs;
    }

    public void setInstanceLtsConfigs(List<ListLtsLogPolicyRespondBodyInstanceLtsConfigs> instanceLtsConfigs) {
        this.instanceLtsConfigs = instanceLtsConfigs;
    }

    public ListLtsConfigsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 全部可查询的云服务日志配置结果个数，等于所有DDS实例的个数。
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
        ListLtsConfigsResponse that = (ListLtsConfigsResponse) obj;
        return Objects.equals(this.instanceLtsConfigs, that.instanceLtsConfigs)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceLtsConfigs, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLtsConfigsResponse {\n");
        sb.append("    instanceLtsConfigs: ").append(toIndentedString(instanceLtsConfigs)).append("\n");
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
