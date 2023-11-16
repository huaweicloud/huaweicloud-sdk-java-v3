package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.corexml.SdkXmlBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 待删除的对象列表。 
 */
@JacksonXmlRootElement(localName = "Delete")
public class DeleteObjectsRequestBody extends SdkXmlBody<DeleteObjectsRequestBody> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Quiet")

    @JacksonXmlProperty(localName = "Quiet")

    private Boolean quiet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "EncodingType")

    @JacksonXmlProperty(localName = "EncodingType")

    private String encodingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Object")

    @JacksonXmlProperty(localName = "Object")
    private List<DeleteObject> object = null;

    public DeleteObjectsRequestBody withQuiet(Boolean quiet) {
        this.quiet = quiet;
        return this;
    }

    /**
     * 用于指定使用quiet模式，只返回删除失败的对象结果；如果有此字段，则必被置为True，如果为False则被系统忽略掉。 
     * @return quiet
     */
    public Boolean getQuiet() {
        return quiet;
    }

    public void setQuiet(Boolean quiet) {
        this.quiet = quiet;
    }

    public DeleteObjectsRequestBody withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * 用于指定待删除的对象Key和响应中的对象Key的编码类型。如果Key包含xml 1.0标准不支持的控制字符，可通过设置该元素指定对象Key的编码类型。 
     * @return encodingType
     */
    public String getEncodingType() {
        return encodingType;
    }

    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    public DeleteObjectsRequestBody withObject(List<DeleteObject> object) {
        this.object = object;
        return this;
    }

    public DeleteObjectsRequestBody addObjectItem(DeleteObject objectItem) {
        if (this.object == null) {
            this.object = new ArrayList<>();
        }
        this.object.add(objectItem);
        return this;
    }

    public DeleteObjectsRequestBody withObject(Consumer<List<DeleteObject>> objectSetter) {
        if (this.object == null) {
            this.object = new ArrayList<>();
        }
        objectSetter.accept(this.object);
        return this;
    }

    /**
     * Get object
     * @return object
     */
    public List<DeleteObject> getObject() {
        return object;
    }

    public void setObject(List<DeleteObject> object) {
        this.object = object;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteObjectsRequestBody that = (DeleteObjectsRequestBody) obj;
        return Objects.equals(this.quiet, that.quiet) && Objects.equals(this.encodingType, that.encodingType)
            && Objects.equals(this.object, that.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quiet, encodingType, object);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteObjectsRequestBody {\n");
        sb.append("    quiet: ").append(toIndentedString(quiet)).append("\n");
        sb.append("    encodingType: ").append(toIndentedString(encodingType)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
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
