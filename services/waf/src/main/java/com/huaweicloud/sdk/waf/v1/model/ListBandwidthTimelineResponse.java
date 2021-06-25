package com.huaweicloud.sdk.waf.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.StatisticsTimelineItem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBandwidthTimelineResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private List<StatisticsTimelineItem> body = null;
    
    public ListBandwidthTimelineResponse withBody(List<StatisticsTimelineItem> body) {
        this.body = body;
        return this;
    }

    
    public ListBandwidthTimelineResponse addBodyItem(StatisticsTimelineItem bodyItem) {
        if(this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ListBandwidthTimelineResponse withBody(Consumer<List<StatisticsTimelineItem>> bodySetter) {
        if(this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * 安全统计的时间线
     * @return body
     */
    public List<StatisticsTimelineItem> getBody() {
        return body;
    }

    public void setBody(List<StatisticsTimelineItem> body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBandwidthTimelineResponse listBandwidthTimelineResponse = (ListBandwidthTimelineResponse) o;
        return Objects.equals(this.body, listBandwidthTimelineResponse.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthTimelineResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

