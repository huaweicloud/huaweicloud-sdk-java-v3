package com.huaweicloud.sdk.dms.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dms.v2.model.ListQueueGroupsRespGroups;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListConsumerGroupsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_id")
    
    private String queueId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_name")
    
    private String queueName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="groups")
    
    private List<ListQueueGroupsRespGroups> groups = null;
        /**
     * 该队列是否开启死信消息。仅当include_deadletter为true时，才有该响应参数。 - enable：表示开启。 - disable：表示不开启。
     */
    public static final class RedrivePolicyEnum {

        
        /**
         * Enum ENABLE for value: "enable"
         */
        public static final RedrivePolicyEnum ENABLE = new RedrivePolicyEnum("enable");
        
        /**
         * Enum DISABLE for value: "disable"
         */
        public static final RedrivePolicyEnum DISABLE = new RedrivePolicyEnum("disable");
        

        private static final Map<String, RedrivePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RedrivePolicyEnum> createStaticFields() {
            Map<String, RedrivePolicyEnum> map = new HashMap<>();
            map.put("enable", ENABLE);
            map.put("disable", DISABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RedrivePolicyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RedrivePolicyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RedrivePolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RedrivePolicyEnum(value);
            }
            return result;
        }

        public static RedrivePolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RedrivePolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RedrivePolicyEnum) {
                return this.value.equals(((RedrivePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redrive_policy")
    
    private RedrivePolicyEnum redrivePolicy;

    public ListConsumerGroupsResponse withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    


    /**
     * 队列ID。
     * @return queueId
     */
    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    

    public ListConsumerGroupsResponse withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    


    /**
     * 队列的名称。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    

    public ListConsumerGroupsResponse withGroups(List<ListQueueGroupsRespGroups> groups) {
        this.groups = groups;
        return this;
    }

    
    public ListConsumerGroupsResponse addGroupsItem(ListQueueGroupsRespGroups groupsItem) {
        this.groups.add(groupsItem);
        return this;
    }

    public ListConsumerGroupsResponse withGroups(Consumer<List<ListQueueGroupsRespGroups>> groupsSetter) {
        if(this.groups == null ){
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 消费组列表。
     * @return groups
     */
    public List<ListQueueGroupsRespGroups> getGroups() {
        return groups;
    }

    public void setGroups(List<ListQueueGroupsRespGroups> groups) {
        this.groups = groups;
    }

    

    public ListConsumerGroupsResponse withRedrivePolicy(RedrivePolicyEnum redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
        return this;
    }

    


    /**
     * 该队列是否开启死信消息。仅当include_deadletter为true时，才有该响应参数。 - enable：表示开启。 - disable：表示不开启。
     * @return redrivePolicy
     */
    public RedrivePolicyEnum getRedrivePolicy() {
        return redrivePolicy;
    }

    public void setRedrivePolicy(RedrivePolicyEnum redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListConsumerGroupsResponse listConsumerGroupsResponse = (ListConsumerGroupsResponse) o;
        return Objects.equals(this.queueId, listConsumerGroupsResponse.queueId) &&
            Objects.equals(this.queueName, listConsumerGroupsResponse.queueName) &&
            Objects.equals(this.groups, listConsumerGroupsResponse.groups) &&
            Objects.equals(this.redrivePolicy, listConsumerGroupsResponse.redrivePolicy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(queueId, queueName, groups, redrivePolicy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConsumerGroupsResponse {\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    redrivePolicy: ").append(toIndentedString(redrivePolicy)).append("\n");
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

