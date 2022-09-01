package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateDatasourceReqDTO
 */
public class UpdateDatasourceReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    @JacksonXmlProperty(localName = "content")

    private ContentDetailReq content;

    public UpdateDatasourceReqDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateDatasourceReqDTO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据源类型, 包括：IOTDA、API[、OBS、DIS、SMN、FUNCTION_GRAPH、MODEL_ARTS、DCS、KAFKA](tag:IoTA-Cloud-Only)、NODE。数据源不支持修改类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdateDatasourceReqDTO withContent(ContentDetailReq content) {
        this.content = content;
        return this;
    }

    public UpdateDatasourceReqDTO withContent(Consumer<ContentDetailReq> contentSetter) {
        if (this.content == null) {
            this.content = new ContentDetailReq();
            contentSetter.accept(this.content);
        }

        return this;
    }

    /**
     * Get content
     * @return content
     */
    public ContentDetailReq getContent() {
        return content;
    }

    public void setContent(ContentDetailReq content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDatasourceReqDTO updateDatasourceReqDTO = (UpdateDatasourceReqDTO) o;
        return Objects.equals(this.name, updateDatasourceReqDTO.name)
            && Objects.equals(this.type, updateDatasourceReqDTO.type)
            && Objects.equals(this.content, updateDatasourceReqDTO.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatasourceReqDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
