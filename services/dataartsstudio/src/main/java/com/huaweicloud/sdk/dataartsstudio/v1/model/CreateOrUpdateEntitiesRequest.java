package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateOrUpdateEntitiesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    private String instance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DataEntityWithExtInfo body;

    public CreateOrUpdateEntitiesRequest withInstance(String instance) {
        this.instance = instance;
        return this;
    }

    /**
     * 实例ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)
     * @return instance
     */
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public CreateOrUpdateEntitiesRequest withBody(DataEntityWithExtInfo body) {
        this.body = body;
        return this;
    }

    public CreateOrUpdateEntitiesRequest withBody(Consumer<DataEntityWithExtInfo> bodySetter) {
        if (this.body == null) {
            this.body = new DataEntityWithExtInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DataEntityWithExtInfo getBody() {
        return body;
    }

    public void setBody(DataEntityWithExtInfo body) {
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
        CreateOrUpdateEntitiesRequest that = (CreateOrUpdateEntitiesRequest) obj;
        return Objects.equals(this.instance, that.instance) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instance, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrUpdateEntitiesRequest {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
