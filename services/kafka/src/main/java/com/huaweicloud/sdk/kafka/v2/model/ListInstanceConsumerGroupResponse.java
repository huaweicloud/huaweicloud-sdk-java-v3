package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInstanceConsumerGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private DescribeGroupsRespGroup group;

    public ListInstanceConsumerGroupResponse withGroup(DescribeGroupsRespGroup group) {
        this.group = group;
        return this;
    }

    public ListInstanceConsumerGroupResponse withGroup(Consumer<DescribeGroupsRespGroup> groupSetter) {
        if (this.group == null) {
            this.group = new DescribeGroupsRespGroup();
            groupSetter.accept(this.group);
        }

        return this;
    }

    /**
     * Get group
     * @return group
     */
    public DescribeGroupsRespGroup getGroup() {
        return group;
    }

    public void setGroup(DescribeGroupsRespGroup group) {
        this.group = group;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceConsumerGroupResponse that = (ListInstanceConsumerGroupResponse) obj;
        return Objects.equals(this.group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceConsumerGroupResponse {\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
