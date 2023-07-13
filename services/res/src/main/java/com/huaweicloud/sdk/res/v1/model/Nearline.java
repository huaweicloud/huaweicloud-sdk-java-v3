package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Nearline {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_topic")

    private Topic itemTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_topic")

    private Topic userTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior_topic")

    private Topic behaviorTopic;

    public Nearline withItemTopic(Topic itemTopic) {
        this.itemTopic = itemTopic;
        return this;
    }

    public Nearline withItemTopic(Consumer<Topic> itemTopicSetter) {
        if (this.itemTopic == null) {
            this.itemTopic = new Topic();
            itemTopicSetter.accept(this.itemTopic);
        }

        return this;
    }

    /**
     * Get itemTopic
     * @return itemTopic
     */
    public Topic getItemTopic() {
        return itemTopic;
    }

    public void setItemTopic(Topic itemTopic) {
        this.itemTopic = itemTopic;
    }

    public Nearline withUserTopic(Topic userTopic) {
        this.userTopic = userTopic;
        return this;
    }

    public Nearline withUserTopic(Consumer<Topic> userTopicSetter) {
        if (this.userTopic == null) {
            this.userTopic = new Topic();
            userTopicSetter.accept(this.userTopic);
        }

        return this;
    }

    /**
     * Get userTopic
     * @return userTopic
     */
    public Topic getUserTopic() {
        return userTopic;
    }

    public void setUserTopic(Topic userTopic) {
        this.userTopic = userTopic;
    }

    public Nearline withBehaviorTopic(Topic behaviorTopic) {
        this.behaviorTopic = behaviorTopic;
        return this;
    }

    public Nearline withBehaviorTopic(Consumer<Topic> behaviorTopicSetter) {
        if (this.behaviorTopic == null) {
            this.behaviorTopic = new Topic();
            behaviorTopicSetter.accept(this.behaviorTopic);
        }

        return this;
    }

    /**
     * Get behaviorTopic
     * @return behaviorTopic
     */
    public Topic getBehaviorTopic() {
        return behaviorTopic;
    }

    public void setBehaviorTopic(Topic behaviorTopic) {
        this.behaviorTopic = behaviorTopic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Nearline that = (Nearline) obj;
        return Objects.equals(this.itemTopic, that.itemTopic) && Objects.equals(this.userTopic, that.userTopic)
            && Objects.equals(this.behaviorTopic, that.behaviorTopic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemTopic, userTopic, behaviorTopic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Nearline {\n");
        sb.append("    itemTopic: ").append(toIndentedString(itemTopic)).append("\n");
        sb.append("    userTopic: ").append(toIndentedString(userTopic)).append("\n");
        sb.append("    behaviorTopic: ").append(toIndentedString(behaviorTopic)).append("\n");
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
