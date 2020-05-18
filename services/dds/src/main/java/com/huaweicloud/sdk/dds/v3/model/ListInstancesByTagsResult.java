package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesTagResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * ListInstancesByTagsResult
 */
public class ListInstancesByTagsResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
    private String instanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<ListInstancesTagResult> tags = new ArrayList<>();
    
    public ListInstancesByTagsResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstancesByTagsResult withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ListInstancesByTagsResult withTags(List<ListInstancesTagResult> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListInstancesByTagsResult addTagsItem(ListInstancesTagResult tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public ListInstancesByTagsResult withTags(Consumer<List<ListInstancesTagResult>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。如果没有标签，默认为空数组。
     * @return tags
     */
    public List<ListInstancesTagResult> getTags() {
        return tags;
    }

    public void setTags(List<ListInstancesTagResult> tags) {
        this.tags = tags;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesByTagsResult listInstancesByTagsResult = (ListInstancesByTagsResult) o;
        return Objects.equals(this.instanceId, listInstancesByTagsResult.instanceId) &&
            Objects.equals(this.instanceName, listInstancesByTagsResult.instanceName) &&
            Objects.equals(this.tags, listInstancesByTagsResult.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesByTagsResult {\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

