package com.huaweicloud.sdk.iotda.v5.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.SubscriptionItem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSubscriptionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscriptions")
    
    private List<SubscriptionItem> subscriptions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;

    public ListSubscriptionsResponse withSubscriptions(List<SubscriptionItem> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    
    public ListSubscriptionsResponse addSubscriptionsItem(SubscriptionItem subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public ListSubscriptionsResponse withSubscriptions(Consumer<List<SubscriptionItem>> subscriptionsSetter) {
        if(this.subscriptions == null ){
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * 订阅配置信息列表。
     * @return subscriptions
     */
    public List<SubscriptionItem> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<SubscriptionItem> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public ListSubscriptionsResponse withCount(Integer count) {
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

    public ListSubscriptionsResponse withMarker(String marker) {
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
        ListSubscriptionsResponse listSubscriptionsResponse = (ListSubscriptionsResponse) o;
        return Objects.equals(this.subscriptions, listSubscriptionsResponse.subscriptions) &&
            Objects.equals(this.count, listSubscriptionsResponse.count) &&
            Objects.equals(this.marker, listSubscriptionsResponse.marker);
    }
    @Override
    public int hashCode() {
        return Objects.hash(subscriptions, count, marker);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubscriptionsResponse {\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

