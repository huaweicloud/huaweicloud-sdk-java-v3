package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateDictionaryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_id")

    private String dictId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateDictionary body;

    public UpdateDictionaryRequest withDictId(String dictId) {
        this.dictId = dictId;
        return this;
    }

    /** 字典ID
     * 
     * @return dictId */
    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public UpdateDictionaryRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateDictionaryRequest withBody(UpdateDictionary body) {
        this.body = body;
        return this;
    }

    public UpdateDictionaryRequest withBody(Consumer<UpdateDictionary> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateDictionary();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateDictionary getBody() {
        return body;
    }

    public void setBody(UpdateDictionary body) {
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
        UpdateDictionaryRequest updateDictionaryRequest = (UpdateDictionaryRequest) o;
        return Objects.equals(this.dictId, updateDictionaryRequest.dictId)
            && Objects.equals(this.instanceId, updateDictionaryRequest.instanceId)
            && Objects.equals(this.body, updateDictionaryRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictId, instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDictionaryRequest {\n");
        sb.append("    dictId: ").append(toIndentedString(dictId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
