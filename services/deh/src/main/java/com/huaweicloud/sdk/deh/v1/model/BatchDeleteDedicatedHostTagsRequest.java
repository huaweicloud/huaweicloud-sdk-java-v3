package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteDedicatedHostTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    private String dedicatedHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ReqSetOrDeleteTags body;

    public BatchDeleteDedicatedHostTagsRequest withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    /**
     * 专属主机ID。  可以从专属主机控制台查询，或者通过调用查询专属主机列表API获取。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public BatchDeleteDedicatedHostTagsRequest withBody(ReqSetOrDeleteTags body) {
        this.body = body;
        return this;
    }

    public BatchDeleteDedicatedHostTagsRequest withBody(Consumer<ReqSetOrDeleteTags> bodySetter) {
        if (this.body == null) {
            this.body = new ReqSetOrDeleteTags();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ReqSetOrDeleteTags getBody() {
        return body;
    }

    public void setBody(ReqSetOrDeleteTags body) {
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
        BatchDeleteDedicatedHostTagsRequest batchDeleteDedicatedHostTagsRequest =
            (BatchDeleteDedicatedHostTagsRequest) o;
        return Objects.equals(this.dedicatedHostId, batchDeleteDedicatedHostTagsRequest.dedicatedHostId)
            && Objects.equals(this.body, batchDeleteDedicatedHostTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHostId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteDedicatedHostTagsRequest {\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
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
