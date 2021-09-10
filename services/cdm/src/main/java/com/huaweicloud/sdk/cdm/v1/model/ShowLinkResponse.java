package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowLinkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<Links> links = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fromTo-unMapping")

    private String fromToUnMapping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batchFromTo-mapping")

    private String batchFromToMapping;

    public ShowLinkResponse withLinks(List<Links> links) {
        this.links = links;
        return this;
    }

    public ShowLinkResponse addLinksItem(Links linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public ShowLinkResponse withLinks(Consumer<List<Links>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /** 连接列表，请参见links数据结构说明
     * 
     * @return links */
    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }

    public ShowLinkResponse withFromToUnMapping(String fromToUnMapping) {
        this.fromToUnMapping = fromToUnMapping;
        return this;
    }

    /** 表/文件迁移不支持哪些数据源迁移到哪些数据源
     * 
     * @return fromToUnMapping */
    public String getFromToUnMapping() {
        return fromToUnMapping;
    }

    public void setFromToUnMapping(String fromToUnMapping) {
        this.fromToUnMapping = fromToUnMapping;
    }

    public ShowLinkResponse withBatchFromToMapping(String batchFromToMapping) {
        this.batchFromToMapping = batchFromToMapping;
        return this;
    }

    /** 整库迁移支持哪些数据源迁移到哪些数据源
     * 
     * @return batchFromToMapping */
    public String getBatchFromToMapping() {
        return batchFromToMapping;
    }

    public void setBatchFromToMapping(String batchFromToMapping) {
        this.batchFromToMapping = batchFromToMapping;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLinkResponse showLinkResponse = (ShowLinkResponse) o;
        return Objects.equals(this.links, showLinkResponse.links)
            && Objects.equals(this.fromToUnMapping, showLinkResponse.fromToUnMapping)
            && Objects.equals(this.batchFromToMapping, showLinkResponse.batchFromToMapping);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, fromToUnMapping, batchFromToMapping);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLinkResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    fromToUnMapping: ").append(toIndentedString(fromToUnMapping)).append("\n");
        sb.append("    batchFromToMapping: ").append(toIndentedString(batchFromToMapping)).append("\n");
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
