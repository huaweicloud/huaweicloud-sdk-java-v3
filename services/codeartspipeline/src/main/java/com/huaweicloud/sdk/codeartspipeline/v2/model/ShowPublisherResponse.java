package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPublisherResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_detail_map")

    private Map<String, PublisherVO> publisherDetailMap = null;

    public ShowPublisherResponse withPublisherDetailMap(Map<String, PublisherVO> publisherDetailMap) {
        this.publisherDetailMap = publisherDetailMap;
        return this;
    }

    public ShowPublisherResponse putPublisherDetailMapItem(String key, PublisherVO publisherDetailMapItem) {
        if (this.publisherDetailMap == null) {
            this.publisherDetailMap = new HashMap<>();
        }
        this.publisherDetailMap.put(key, publisherDetailMapItem);
        return this;
    }

    public ShowPublisherResponse withPublisherDetailMap(Consumer<Map<String, PublisherVO>> publisherDetailMapSetter) {
        if (this.publisherDetailMap == null) {
            this.publisherDetailMap = new HashMap<>();
        }
        publisherDetailMapSetter.accept(this.publisherDetailMap);
        return this;
    }

    /**
     * 发布商详情
     * @return publisherDetailMap
     */
    public Map<String, PublisherVO> getPublisherDetailMap() {
        return publisherDetailMap;
    }

    public void setPublisherDetailMap(Map<String, PublisherVO> publisherDetailMap) {
        this.publisherDetailMap = publisherDetailMap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPublisherResponse that = (ShowPublisherResponse) obj;
        return Objects.equals(this.publisherDetailMap, that.publisherDetailMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherDetailMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPublisherResponse {\n");
        sb.append("    publisherDetailMap: ").append(toIndentedString(publisherDetailMap)).append("\n");
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
