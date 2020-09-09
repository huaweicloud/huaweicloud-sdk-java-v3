package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.ShowCeshierarchyRespPartitions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowCeshierarchyRespQueues
 */
public class ShowCeshierarchyRespQueues  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="partitions")
    
    private List<ShowCeshierarchyRespPartitions> partitions = null;
    
    public ShowCeshierarchyRespQueues withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * topic名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCeshierarchyRespQueues withPartitions(List<ShowCeshierarchyRespPartitions> partitions) {
        this.partitions = partitions;
        return this;
    }

    
    public ShowCeshierarchyRespQueues addPartitionsItem(ShowCeshierarchyRespPartitions partitionsItem) {
        if (this.partitions == null) {
            this.partitions = new ArrayList<>();
        }
        this.partitions.add(partitionsItem);
        return this;
    }

    public ShowCeshierarchyRespQueues withPartitions(Consumer<List<ShowCeshierarchyRespPartitions>> partitionsSetter) {
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
    public List<ShowCeshierarchyRespPartitions> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<ShowCeshierarchyRespPartitions> partitions) {
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
        ShowCeshierarchyRespQueues showCeshierarchyRespQueues = (ShowCeshierarchyRespQueues) o;
        return Objects.equals(this.name, showCeshierarchyRespQueues.name) &&
            Objects.equals(this.partitions, showCeshierarchyRespQueues.partitions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, partitions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCeshierarchyRespQueues {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

