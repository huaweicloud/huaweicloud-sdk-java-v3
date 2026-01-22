package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubscriptionEntity
 */
public class SubscriptionEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumers_in_tags")

    private List<ConsumersInTagEntity> consumersInTags = null;

    public SubscriptionEntity withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * **参数解释**： Topic名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public SubscriptionEntity withConsumersInTags(List<ConsumersInTagEntity> consumersInTags) {
        this.consumersInTags = consumersInTags;
        return this;
    }

    public SubscriptionEntity addConsumersInTagsItem(ConsumersInTagEntity consumersInTagsItem) {
        if (this.consumersInTags == null) {
            this.consumersInTags = new ArrayList<>();
        }
        this.consumersInTags.add(consumersInTagsItem);
        return this;
    }

    public SubscriptionEntity withConsumersInTags(Consumer<List<ConsumersInTagEntity>> consumersInTagsSetter) {
        if (this.consumersInTags == null) {
            this.consumersInTags = new ArrayList<>();
        }
        consumersInTagsSetter.accept(this.consumersInTags);
        return this;
    }

    /**
     * **参数解释**： 消费者标签列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return consumersInTags
     */
    public List<ConsumersInTagEntity> getConsumersInTags() {
        return consumersInTags;
    }

    public void setConsumersInTags(List<ConsumersInTagEntity> consumersInTags) {
        this.consumersInTags = consumersInTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscriptionEntity that = (SubscriptionEntity) obj;
        return Objects.equals(this.topicName, that.topicName)
            && Objects.equals(this.consumersInTags, that.consumersInTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicName, consumersInTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionEntity {\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    consumersInTags: ").append(toIndentedString(consumersInTags)).append("\n");
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
