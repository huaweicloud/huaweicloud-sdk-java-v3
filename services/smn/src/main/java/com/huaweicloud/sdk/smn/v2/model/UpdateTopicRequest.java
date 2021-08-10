package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateTopicRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateTopicRequestBody body;

    public UpdateTopicRequest withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /** Topic的唯一的资源标识。可以通过[查看主题列表](https://support.huaweicloud.com/api-smn/smn_api_51004.html)获取该标识。
     * 
     * @return topicUrn */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public UpdateTopicRequest withBody(UpdateTopicRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTopicRequest withBody(Consumer<UpdateTopicRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTopicRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateTopicRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTopicRequestBody body) {
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
        UpdateTopicRequest updateTopicRequest = (UpdateTopicRequest) o;
        return Objects.equals(this.topicUrn, updateTopicRequest.topicUrn)
            && Objects.equals(this.body, updateTopicRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopicRequest {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
