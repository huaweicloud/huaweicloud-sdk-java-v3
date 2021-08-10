package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListTopStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_urls")

    private List<TopUrl> topUrls = null;

    public ListTopStatisticsResponse withTopUrls(List<TopUrl> topUrls) {
        this.topUrls = topUrls;
        return this;
    }

    public ListTopStatisticsResponse addTopUrlsItem(TopUrl topUrlsItem) {
        if (this.topUrls == null) {
            this.topUrls = new ArrayList<>();
        }
        this.topUrls.add(topUrlsItem);
        return this;
    }

    public ListTopStatisticsResponse withTopUrls(Consumer<List<TopUrl>> topUrlsSetter) {
        if (this.topUrls == null) {
            this.topUrls = new ArrayList<>();
        }
        topUrlsSetter.accept(this.topUrls);
        return this;
    }

    /** Get topUrls
     * 
     * @return topUrls */
    public List<TopUrl> getTopUrls() {
        return topUrls;
    }

    public void setTopUrls(List<TopUrl> topUrls) {
        this.topUrls = topUrls;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTopStatisticsResponse listTopStatisticsResponse = (ListTopStatisticsResponse) o;
        return Objects.equals(this.topUrls, listTopStatisticsResponse.topUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopStatisticsResponse {\n");
        sb.append("    topUrls: ").append(toIndentedString(topUrls)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
