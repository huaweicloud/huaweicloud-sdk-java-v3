package com.huaweicloud.sdk.dms.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dms.v2.model.GroupEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateConsumerGroupReq
 */
public class CreateConsumerGroupReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="groups")
    
    private List<GroupEntity> groups = new ArrayList<>();
    
    public CreateConsumerGroupReq withGroups(List<GroupEntity> groups) {
        this.groups = groups;
        return this;
    }

    
    public CreateConsumerGroupReq addGroupsItem(GroupEntity groupsItem) {
        this.groups.add(groupsItem);
        return this;
    }

    public CreateConsumerGroupReq withGroups(Consumer<List<GroupEntity>> groupsSetter) {
        if(this.groups == null ){
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 消费组信息。  每个队列最多能创建3个消费组，如果请求中的消费组个数超过3个，请求校验不通过，无法创建消费组。
     * @return groups
     */
    public List<GroupEntity> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupEntity> groups) {
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
        CreateConsumerGroupReq createConsumerGroupReq = (CreateConsumerGroupReq) o;
        return Objects.equals(this.groups, createConsumerGroupReq.groups);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groups);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConsumerGroupReq {\n");
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

