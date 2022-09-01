package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRSetBatchLinesReq
 */
public class CreateRSetBatchLinesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lines")

    @JacksonXmlProperty(localName = "lines")

    private List<BatchCreateRecordSetWithLine> lines = null;

    public CreateRSetBatchLinesReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 后缀需以Zone Name结束且为FQDN（即以“.”号结束的完整主机名）。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRSetBatchLinesReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 可选配置，对域名的描述。 长度不超过255个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateRSetBatchLinesReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Record Set的类型。 取值范围：A,AAAA,MX,CNAME,TXT,NS,SRV,CAA。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateRSetBatchLinesReq withLines(List<BatchCreateRecordSetWithLine> lines) {
        this.lines = lines;
        return this;
    }

    public CreateRSetBatchLinesReq addLinesItem(BatchCreateRecordSetWithLine linesItem) {
        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        this.lines.add(linesItem);
        return this;
    }

    public CreateRSetBatchLinesReq withLines(Consumer<List<BatchCreateRecordSetWithLine>> linesSetter) {
        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        linesSetter.accept(this.lines);
        return this;
    }

    /**
     * 解析线路域名参数。最多支持50个。
     * @return lines
     */
    public List<BatchCreateRecordSetWithLine> getLines() {
        return lines;
    }

    public void setLines(List<BatchCreateRecordSetWithLine> lines) {
        this.lines = lines;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRSetBatchLinesReq createRSetBatchLinesReq = (CreateRSetBatchLinesReq) o;
        return Objects.equals(this.name, createRSetBatchLinesReq.name)
            && Objects.equals(this.description, createRSetBatchLinesReq.description)
            && Objects.equals(this.type, createRSetBatchLinesReq.type)
            && Objects.equals(this.lines, createRSetBatchLinesReq.lines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, type, lines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRSetBatchLinesReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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
