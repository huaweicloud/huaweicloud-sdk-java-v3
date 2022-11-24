package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRecordCallbackConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RecordCallbackConfigRequest body;

    public UpdateRecordCallbackConfigRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 配置ID，在创建配置成功后返回
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateRecordCallbackConfigRequest withBody(RecordCallbackConfigRequest body) {
        this.body = body;
        return this;
    }

    public UpdateRecordCallbackConfigRequest withBody(Consumer<RecordCallbackConfigRequest> bodySetter) {
        if (this.body == null) {
            this.body = new RecordCallbackConfigRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RecordCallbackConfigRequest getBody() {
        return body;
    }

    public void setBody(RecordCallbackConfigRequest body) {
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
        UpdateRecordCallbackConfigRequest updateRecordCallbackConfigRequest = (UpdateRecordCallbackConfigRequest) o;
        return Objects.equals(this.id, updateRecordCallbackConfigRequest.id)
            && Objects.equals(this.body, updateRecordCallbackConfigRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecordCallbackConfigRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
