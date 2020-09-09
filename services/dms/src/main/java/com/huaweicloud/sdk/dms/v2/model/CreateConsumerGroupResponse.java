package com.huaweicloud.sdk.dms.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dms.v2.model.CreateConsumerGroupRespGroups;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateConsumerGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="groups")
    
    private List<CreateConsumerGroupRespGroups> groups = null;
    
    public CreateConsumerGroupResponse withGroups(List<CreateConsumerGroupRespGroups> groups) {
        this.groups = groups;
        return this;
    }

    
    public CreateConsumerGroupResponse addGroupsItem(CreateConsumerGroupRespGroups groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public CreateConsumerGroupResponse withGroups(Consumer<List<CreateConsumerGroupRespGroups>> groupsSetter) {
        if(this.groups == null ){
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 消费组信息。
     * @return groups
     */
    public List<CreateConsumerGroupRespGroups> getGroups() {
        return groups;
    }

    public void setGroups(List<CreateConsumerGroupRespGroups> groups) {
        this.groups = groups;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConsumerGroupResponse createConsumerGroupResponse = (CreateConsumerGroupResponse) o;
        return Objects.equals(this.groups, createConsumerGroupResponse.groups);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groups);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConsumerGroupResponse {\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

