package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowGroupsRespGroupAssignment
 */
public class ShowGroupsRespGroupAssignment  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partitions")
    
    private List<String> partitions = null;
    
    public ShowGroupsRespGroupAssignment withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    


    /**
     * topic名称。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    

    public ShowGroupsRespGroupAssignment withPartitions(List<String> partitions) {
        this.partitions = partitions;
        return this;
    }

    
    public ShowGroupsRespGroupAssignment addPartitionsItem(String partitionsItem) {
        this.partitions.add(partitionsItem);
        return this;
    }

    public ShowGroupsRespGroupAssignment withPartitions(Consumer<List<String>> partitionsSetter) {
        if(this.partitions == null ){
            this.partitions = new ArrayList<>();
        }
        partitionsSetter.accept(this.partitions);
        return this;
    }

    /**
     * 分区列表。
     * @return partitions
     */
    public List<String> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<String> partitions) {
        this.partitions = partitions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGroupsRespGroupAssignment showGroupsRespGroupAssignment = (ShowGroupsRespGroupAssignment) o;
        return Objects.equals(this.topic, showGroupsRespGroupAssignment.topic) &&
            Objects.equals(this.partitions, showGroupsRespGroupAssignment.partitions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topic, partitions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupsRespGroupAssignment {\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
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

