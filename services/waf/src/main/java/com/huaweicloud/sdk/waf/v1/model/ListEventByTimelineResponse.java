package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.StatisticListInfoRequests;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListEventByTimelineResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="requests")
    
    private List<StatisticListInfoRequests> requests = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attacks")
    
    private List<StatisticListInfoRequests> attacks = null;
    
    public ListEventByTimelineResponse withRequests(List<StatisticListInfoRequests> requests) {
        this.requests = requests;
        return this;
    }

    
    public ListEventByTimelineResponse addRequestsItem(StatisticListInfoRequests requestsItem) {
        if(this.requests == null) {
            this.requests = new ArrayList<>();
        }
        this.requests.add(requestsItem);
        return this;
    }

    public ListEventByTimelineResponse withRequests(Consumer<List<StatisticListInfoRequests>> requestsSetter) {
        if(this.requests == null) {
            this.requests = new ArrayList<>();
        }
        requestsSetter.accept(this.requests);
        return this;
    }

    /**
     * 请求个数列表
     * @return requests
     */
    public List<StatisticListInfoRequests> getRequests() {
        return requests;
    }

    public void setRequests(List<StatisticListInfoRequests> requests) {
        this.requests = requests;
    }

    

    public ListEventByTimelineResponse withAttacks(List<StatisticListInfoRequests> attacks) {
        this.attacks = attacks;
        return this;
    }

    
    public ListEventByTimelineResponse addAttacksItem(StatisticListInfoRequests attacksItem) {
        if(this.attacks == null) {
            this.attacks = new ArrayList<>();
        }
        this.attacks.add(attacksItem);
        return this;
    }

    public ListEventByTimelineResponse withAttacks(Consumer<List<StatisticListInfoRequests>> attacksSetter) {
        if(this.attacks == null) {
            this.attacks = new ArrayList<>();
        }
        attacksSetter.accept(this.attacks);
        return this;
    }

    /**
     * 攻击个数列表
     * @return attacks
     */
    public List<StatisticListInfoRequests> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<StatisticListInfoRequests> attacks) {
        this.attacks = attacks;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventByTimelineResponse listEventByTimelineResponse = (ListEventByTimelineResponse) o;
        return Objects.equals(this.requests, listEventByTimelineResponse.requests) &&
            Objects.equals(this.attacks, listEventByTimelineResponse.attacks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requests, attacks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventByTimelineResponse {\n");
        sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
        sb.append("    attacks: ").append(toIndentedString(attacks)).append("\n");
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

