package com.huaweicloud.sdk.coc.v1.model;

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
public class ListInstanceCompliantResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_compliant")

    private List<InstanceCompliant> instanceCompliant = null;

    public ListInstanceCompliantResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总条数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListInstanceCompliantResponse withInstanceCompliant(List<InstanceCompliant> instanceCompliant) {
        this.instanceCompliant = instanceCompliant;
        return this;
    }

    public ListInstanceCompliantResponse addInstanceCompliantItem(InstanceCompliant instanceCompliantItem) {
        if (this.instanceCompliant == null) {
            this.instanceCompliant = new ArrayList<>();
        }
        this.instanceCompliant.add(instanceCompliantItem);
        return this;
    }

    public ListInstanceCompliantResponse withInstanceCompliant(
        Consumer<List<InstanceCompliant>> instanceCompliantSetter) {
        if (this.instanceCompliant == null) {
            this.instanceCompliant = new ArrayList<>();
        }
        instanceCompliantSetter.accept(this.instanceCompliant);
        return this;
    }

    /**
     * 节点合规报告
     * @return instanceCompliant
     */
    public List<InstanceCompliant> getInstanceCompliant() {
        return instanceCompliant;
    }

    public void setInstanceCompliant(List<InstanceCompliant> instanceCompliant) {
        this.instanceCompliant = instanceCompliant;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceCompliantResponse that = (ListInstanceCompliantResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.instanceCompliant, that.instanceCompliant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, instanceCompliant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceCompliantResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    instanceCompliant: ").append(toIndentedString(instanceCompliant)).append("\n");
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
