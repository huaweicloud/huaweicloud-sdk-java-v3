package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateConfigSetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configsetid")

    private String configsetid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateConfigSetRequestBody body;

    public UpdateConfigSetRequest withConfigsetid(String configsetid) {
        this.configsetid = configsetid;
        return this;
    }

    /**
     * 配置集合id
     * @return configsetid
     */
    public String getConfigsetid() {
        return configsetid;
    }

    public void setConfigsetid(String configsetid) {
        this.configsetid = configsetid;
    }

    public UpdateConfigSetRequest withBody(UpdateConfigSetRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateConfigSetRequest withBody(Consumer<UpdateConfigSetRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateConfigSetRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateConfigSetRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateConfigSetRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateConfigSetRequest that = (UpdateConfigSetRequest) obj;
        return Objects.equals(this.configsetid, that.configsetid) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configsetid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigSetRequest {\n");
        sb.append("    configsetid: ").append(toIndentedString(configsetid)).append("\n");
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
