package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowBatchLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_id")

    @JacksonXmlProperty(localName = "batch_id")

    private String batchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    @JacksonXmlProperty(localName = "from")

    private Integer from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    @JacksonXmlProperty(localName = "index")

    private Integer index;

    public ShowBatchLogRequest withBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    /**
     * 批处理作业的ID。
     * @return batchId
     */
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public ShowBatchLogRequest withFrom(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * 起始日志的行号，默认显示最后100行日志。如果日志不足100行，从0行开始显示。
     * @return from
     */
    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public ShowBatchLogRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 查询日志的数量。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShowBatchLogRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 当type填写driver时，输出Spark Driver日志。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowBatchLogRequest withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * 当提交的作业进行重试时，会有多个driver日志。index用于指定driver日志的索引号，默认为0。需与type参数一起使用。
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBatchLogRequest showBatchLogRequest = (ShowBatchLogRequest) o;
        return Objects.equals(this.batchId, showBatchLogRequest.batchId)
            && Objects.equals(this.from, showBatchLogRequest.from)
            && Objects.equals(this.size, showBatchLogRequest.size)
            && Objects.equals(this.type, showBatchLogRequest.type)
            && Objects.equals(this.index, showBatchLogRequest.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchId, from, size, type, index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBatchLogRequest {\n");
        sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
