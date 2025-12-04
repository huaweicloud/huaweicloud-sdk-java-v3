package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListInstanceConsumerGroupsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    public ListInstanceConsumerGroupsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。获取方法如下：调用“查询所有实例列表”接口，从响应体中获取实例ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstanceConsumerGroupsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 偏移量。 **约束限制**： 不涉及。 **取值范围**： 大于等于0。 **默认取值**： 不涉及。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListInstanceConsumerGroupsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 当次查询返回的最大消费组ID个数。 **约束限制**： 不涉及。 **取值范围**： 1~50。 **默认取值**： 10。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListInstanceConsumerGroupsRequest withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * **参数解释**： 消费组名过滤查询，过滤方式为字段包含过滤。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
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
        ListInstanceConsumerGroupsRequest that = (ListInstanceConsumerGroupsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceConsumerGroupsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
