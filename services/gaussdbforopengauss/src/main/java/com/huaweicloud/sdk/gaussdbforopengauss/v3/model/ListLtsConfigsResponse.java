package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_lts_configs")

    private List<InstanceLtsLogConfigResult> instanceLtsConfigs = null;

    public ListLtsConfigsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 总记录数。 **取值范围**: 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListLtsConfigsResponse withInstanceLtsConfigs(List<InstanceLtsLogConfigResult> instanceLtsConfigs) {
        this.instanceLtsConfigs = instanceLtsConfigs;
        return this;
    }

    public ListLtsConfigsResponse addInstanceLtsConfigsItem(InstanceLtsLogConfigResult instanceLtsConfigsItem) {
        if (this.instanceLtsConfigs == null) {
            this.instanceLtsConfigs = new ArrayList<>();
        }
        this.instanceLtsConfigs.add(instanceLtsConfigsItem);
        return this;
    }

    public ListLtsConfigsResponse withInstanceLtsConfigs(
        Consumer<List<InstanceLtsLogConfigResult>> instanceLtsConfigsSetter) {
        if (this.instanceLtsConfigs == null) {
            this.instanceLtsConfigs = new ArrayList<>();
        }
        instanceLtsConfigsSetter.accept(this.instanceLtsConfigs);
        return this;
    }

    /**
     * **参数解释**: 实例下Lts明细列表。
     * @return instanceLtsConfigs
     */
    public List<InstanceLtsLogConfigResult> getInstanceLtsConfigs() {
        return instanceLtsConfigs;
    }

    public void setInstanceLtsConfigs(List<InstanceLtsLogConfigResult> instanceLtsConfigs) {
        this.instanceLtsConfigs = instanceLtsConfigs;
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
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.instanceLtsConfigs, that.instanceLtsConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, instanceLtsConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLtsConfigsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    instanceLtsConfigs: ").append(toIndentedString(instanceLtsConfigs)).append("\n");
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
