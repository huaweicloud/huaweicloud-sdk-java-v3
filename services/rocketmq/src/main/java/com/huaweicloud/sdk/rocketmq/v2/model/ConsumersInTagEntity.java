package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConsumersInTagEntity
 */
public class ConsumersInTagEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumers")

    private List<String> consumers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    private String tagName;

    public ConsumersInTagEntity withConsumers(List<String> consumers) {
        this.consumers = consumers;
        return this;
    }

    public ConsumersInTagEntity addConsumersItem(String consumersItem) {
        if (this.consumers == null) {
            this.consumers = new ArrayList<>();
        }
        this.consumers.add(consumersItem);
        return this;
    }

    public ConsumersInTagEntity withConsumers(Consumer<List<String>> consumersSetter) {
        if (this.consumers == null) {
            this.consumers = new ArrayList<>();
        }
        consumersSetter.accept(this.consumers);
        return this;
    }

    /**
     * **参数解释**： 消费者列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return consumers
     */
    public List<String> getConsumers() {
        return consumers;
    }

    public void setConsumers(List<String> consumers) {
        this.consumers = consumers;
    }

    public ConsumersInTagEntity withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * **参数解释**： 标签名。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsumersInTagEntity that = (ConsumersInTagEntity) obj;
        return Objects.equals(this.consumers, that.consumers) && Objects.equals(this.tagName, that.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consumers, tagName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumersInTagEntity {\n");
        sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
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
