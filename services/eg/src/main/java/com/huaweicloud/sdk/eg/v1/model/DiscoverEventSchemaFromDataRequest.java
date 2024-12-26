package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DiscoverEventSchemaFromDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Object body;

    public DiscoverEventSchemaFromDataRequest withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * {   \"description\": \"通过事件数据发现事件模型的请求\",   \"type\": \"object\",   \"required\": [     \"event\"   ],   \"properties\": {     \"event\": {       \"description\": \"事件数据内容\",       \"type\": \"string\",       \"maxLength\": 1024,       \"example\": \"{\\\"fileName\\\": \\\"one.jpg\\\", \\\"fileSize\\\": 1048576}\"     },     \"format\": {       \"description\": \"事件模型格式类型\",       \"type\": \"string\",       \"default\": \"JSON_SCHEMA_DRAFT_6\",       \"enum\": [         \"JSON_SCHEMA_DRAFT_6\"       ]     }   } }
     * @return body
     */
    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
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
        DiscoverEventSchemaFromDataRequest that = (DiscoverEventSchemaFromDataRequest) obj;
        return Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscoverEventSchemaFromDataRequest {\n");
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
