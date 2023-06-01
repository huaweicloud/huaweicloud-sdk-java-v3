package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateLogtankRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtank_id")

    private String logtankId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateLogtankRequestBody body;

    public UpdateLogtankRequest withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * Topic的唯一的资源标识，可通过[查询主题列表](smn_api_51004.xml)获取该标识。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public UpdateLogtankRequest withLogtankId(String logtankId) {
        this.logtankId = logtankId;
        return this;
    }

    /**
     * 云日志信息唯一的资源标识。可通过[查询云日志](ListLogtank.xml)获取该标识。
     * @return logtankId
     */
    public String getLogtankId() {
        return logtankId;
    }

    public void setLogtankId(String logtankId) {
        this.logtankId = logtankId;
    }

    public UpdateLogtankRequest withBody(UpdateLogtankRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateLogtankRequest withBody(Consumer<UpdateLogtankRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateLogtankRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateLogtankRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateLogtankRequestBody body) {
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
        UpdateLogtankRequest updateLogtankRequest = (UpdateLogtankRequest) o;
        return Objects.equals(this.topicUrn, updateLogtankRequest.topicUrn)
            && Objects.equals(this.logtankId, updateLogtankRequest.logtankId)
            && Objects.equals(this.body, updateLogtankRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, logtankId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogtankRequest {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    logtankId: ").append(toIndentedString(logtankId)).append("\n");
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
