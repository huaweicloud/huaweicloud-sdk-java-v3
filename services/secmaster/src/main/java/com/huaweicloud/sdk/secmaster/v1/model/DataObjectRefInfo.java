package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Dataobject实体信息
 */
public class DataObjectRefInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private Map<String, Object> content = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass")

    private DataClassRef dataclass;

    public DataObjectRefInfo withContent(Map<String, Object> content) {
        this.content = content;
        return this;
    }

    public DataObjectRefInfo putContentItem(String key, Object contentItem) {
        if (this.content == null) {
            this.content = new HashMap<>();
        }
        this.content.put(key, contentItem);
        return this;
    }

    public DataObjectRefInfo withContent(Consumer<Map<String, Object>> contentSetter) {
        if (this.content == null) {
            this.content = new HashMap<>();
        }
        contentSetter.accept(this.content);
        return this;
    }

    /**
     * 流程实例上下文内容
     * @return content
     */
    public Map<String, Object> getContent() {
        return content;
    }

    public void setContent(Map<String, Object> content) {
        this.content = content;
    }

    public DataObjectRefInfo withDataclass(DataClassRef dataclass) {
        this.dataclass = dataclass;
        return this;
    }

    public DataObjectRefInfo withDataclass(Consumer<DataClassRef> dataclassSetter) {
        if (this.dataclass == null) {
            this.dataclass = new DataClassRef();
            dataclassSetter.accept(this.dataclass);
        }

        return this;
    }

    /**
     * Get dataclass
     * @return dataclass
     */
    public DataClassRef getDataclass() {
        return dataclass;
    }

    public void setDataclass(DataClassRef dataclass) {
        this.dataclass = dataclass;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataObjectRefInfo that = (DataObjectRefInfo) obj;
        return Objects.equals(this.content, that.content) && Objects.equals(this.dataclass, that.dataclass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, dataclass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataObjectRefInfo {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    dataclass: ").append(toIndentedString(dataclass)).append("\n");
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
