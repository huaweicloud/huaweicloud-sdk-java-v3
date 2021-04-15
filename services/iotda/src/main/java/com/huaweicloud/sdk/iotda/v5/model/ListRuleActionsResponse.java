package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.RoutingRuleAction;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRuleActionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="actions")
    
    private List<RoutingRuleAction> actions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;

    public ListRuleActionsResponse withActions(List<RoutingRuleAction> actions) {
        this.actions = actions;
        return this;
    }

    
    public ListRuleActionsResponse addActionsItem(RoutingRuleAction actionsItem) {
        if(this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ListRuleActionsResponse withActions(Consumer<List<RoutingRuleAction>> actionsSetter) {
        if(this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 规则动作信息列表。
     * @return actions
     */
    public List<RoutingRuleAction> getActions() {
        return actions;
    }

    public void setActions(List<RoutingRuleAction> actions) {
        this.actions = actions;
    }

    

    public ListRuleActionsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 满足查询条件的记录总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public ListRuleActionsResponse withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 本次分页查询结果中最后一条记录的ID，可在下一次分页查询时使用。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRuleActionsResponse listRuleActionsResponse = (ListRuleActionsResponse) o;
        return Objects.equals(this.actions, listRuleActionsResponse.actions) &&
            Objects.equals(this.count, listRuleActionsResponse.count) &&
            Objects.equals(this.marker, listRuleActionsResponse.marker);
    }
    @Override
    public int hashCode() {
        return Objects.hash(actions, count, marker);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRuleActionsResponse {\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

