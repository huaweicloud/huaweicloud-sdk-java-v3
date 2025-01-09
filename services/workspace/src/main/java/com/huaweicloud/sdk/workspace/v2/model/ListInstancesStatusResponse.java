package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListInstancesStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statics")

    private List<InstanceStatusStatistics> statics = null;

    public ListInstancesStatusResponse withStatics(List<InstanceStatusStatistics> statics) {
        this.statics = statics;
        return this;
    }

    public ListInstancesStatusResponse addStaticsItem(InstanceStatusStatistics staticsItem) {
        if (this.statics == null) {
            this.statics = new ArrayList<>();
        }
        this.statics.add(staticsItem);
        return this;
    }

    public ListInstancesStatusResponse withStatics(Consumer<List<InstanceStatusStatistics>> staticsSetter) {
        if (this.statics == null) {
            this.statics = new ArrayList<>();
        }
        staticsSetter.accept(this.statics);
        return this;
    }

    /**
     * 统计信息。
     * @return statics
     */
    public List<InstanceStatusStatistics> getStatics() {
        return statics;
    }

    public void setStatics(List<InstanceStatusStatistics> statics) {
        this.statics = statics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesStatusResponse that = (ListInstancesStatusResponse) obj;
        return Objects.equals(this.statics, that.statics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesStatusResponse {\n");
        sb.append("    statics: ").append(toIndentedString(statics)).append("\n");
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
