package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowCeshierarchyRespGroups
 */
public class ShowCeshierarchyRespGroups {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<ShowCeshierarchyRespTopics> topics = null;

    public ShowCeshierarchyRespGroups withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 消费组名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCeshierarchyRespGroups withTopics(List<ShowCeshierarchyRespTopics> topics) {
        this.topics = topics;
        return this;
    }

    public ShowCeshierarchyRespGroups addTopicsItem(ShowCeshierarchyRespTopics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public ShowCeshierarchyRespGroups withTopics(Consumer<List<ShowCeshierarchyRespTopics>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * **参数解释**： 订阅Topic信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return topics
     */
    public List<ShowCeshierarchyRespTopics> getTopics() {
        return topics;
    }

    public void setTopics(List<ShowCeshierarchyRespTopics> topics) {
        this.topics = topics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCeshierarchyRespGroups that = (ShowCeshierarchyRespGroups) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.topics, that.topics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, topics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCeshierarchyRespGroups {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
