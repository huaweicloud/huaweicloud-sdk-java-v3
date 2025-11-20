package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRelatedDnsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_data_nodes")

    private List<RelatedDnVO> relatedDataNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_restorable_time")

    private String latestRestorableTime;

    public ShowRelatedDnsResponse withRelatedDataNodes(List<RelatedDnVO> relatedDataNodes) {
        this.relatedDataNodes = relatedDataNodes;
        return this;
    }

    public ShowRelatedDnsResponse addRelatedDataNodesItem(RelatedDnVO relatedDataNodesItem) {
        if (this.relatedDataNodes == null) {
            this.relatedDataNodes = new ArrayList<>();
        }
        this.relatedDataNodes.add(relatedDataNodesItem);
        return this;
    }

    public ShowRelatedDnsResponse withRelatedDataNodes(Consumer<List<RelatedDnVO>> relatedDataNodesSetter) {
        if (this.relatedDataNodes == null) {
            this.relatedDataNodes = new ArrayList<>();
        }
        relatedDataNodesSetter.accept(this.relatedDataNodes);
        return this;
    }

    /**
     * 关联DN。
     * @return relatedDataNodes
     */
    public List<RelatedDnVO> getRelatedDataNodes() {
        return relatedDataNodes;
    }

    public void setRelatedDataNodes(List<RelatedDnVO> relatedDataNodes) {
        this.relatedDataNodes = relatedDataNodes;
    }

    public ShowRelatedDnsResponse withLatestRestorableTime(String latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
        return this;
    }

    /**
     * 最近恢复时间点。
     * @return latestRestorableTime
     */
    public String getLatestRestorableTime() {
        return latestRestorableTime;
    }

    public void setLatestRestorableTime(String latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRelatedDnsResponse that = (ShowRelatedDnsResponse) obj;
        return Objects.equals(this.relatedDataNodes, that.relatedDataNodes)
            && Objects.equals(this.latestRestorableTime, that.latestRestorableTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relatedDataNodes, latestRestorableTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRelatedDnsResponse {\n");
        sb.append("    relatedDataNodes: ").append(toIndentedString(relatedDataNodes)).append("\n");
        sb.append("    latestRestorableTime: ").append(toIndentedString(latestRestorableTime)).append("\n");
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
