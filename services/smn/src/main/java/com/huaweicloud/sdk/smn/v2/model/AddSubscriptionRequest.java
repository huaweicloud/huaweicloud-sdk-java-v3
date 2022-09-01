package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddSubscriptionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    @JacksonXmlProperty(localName = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private AddSubscriptionRequestBody body;

    public AddSubscriptionRequest withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * Topic的唯一的资源标识，可通过[查询主题列表](https://support.huaweicloud.com/api-smn/smn_api_51004.html)获取该标识。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public AddSubscriptionRequest withBody(AddSubscriptionRequestBody body) {
        this.body = body;
        return this;
    }

    public AddSubscriptionRequest withBody(Consumer<AddSubscriptionRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AddSubscriptionRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddSubscriptionRequestBody getBody() {
        return body;
    }

    public void setBody(AddSubscriptionRequestBody body) {
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
        AddSubscriptionRequest addSubscriptionRequest = (AddSubscriptionRequest) o;
        return Objects.equals(this.topicUrn, addSubscriptionRequest.topicUrn)
            && Objects.equals(this.body, addSubscriptionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSubscriptionRequest {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
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
