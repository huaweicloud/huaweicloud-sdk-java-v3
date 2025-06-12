package com.huaweicloud.sdk.kafka.v2.model;

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
    @JsonProperty(value = "queues")

    private List<ShowCeshierarchyRespQueues1> queues = null;

    public ShowCeshierarchyRespGroups withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 消费组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCeshierarchyRespGroups withQueues(List<ShowCeshierarchyRespQueues1> queues) {
        this.queues = queues;
        return this;
    }

    public ShowCeshierarchyRespGroups addQueuesItem(ShowCeshierarchyRespQueues1 queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public ShowCeshierarchyRespGroups withQueues(Consumer<List<ShowCeshierarchyRespQueues1>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * Topic信息。
     * @return queues
     */
    public List<ShowCeshierarchyRespQueues1> getQueues() {
        return queues;
    }

    public void setQueues(List<ShowCeshierarchyRespQueues1> queues) {
        this.queues = queues;
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
        return Objects.equals(this.name, that.name) && Objects.equals(this.queues, that.queues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, queues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCeshierarchyRespGroups {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
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
