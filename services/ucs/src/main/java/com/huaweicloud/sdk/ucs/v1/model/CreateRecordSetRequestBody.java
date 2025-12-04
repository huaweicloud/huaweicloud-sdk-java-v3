package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRecordSetRequestBody
 */
public class CreateRecordSetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<String> records = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private String line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public CreateRecordSetRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 域名，后缀需以zone name结束且为FQDN（即以“.”号结束的完整主机名）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRecordSetRequestBody withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * 解析记录在本地DNS服务器的缓存时间，缓存时间越长更新生效越慢，以秒为单位
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public CreateRecordSetRequestBody withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    public CreateRecordSetRequestBody addRecordsItem(String recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public CreateRecordSetRequestBody withRecords(Consumer<List<String>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 解析记录的值，不同类型解析记录对应的值的规则不同
     * @return records
     */
    public List<String> getRecords() {
        return records;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }

    public CreateRecordSetRequestBody withLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * 解析线路ID
     * @return line
     */
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public CreateRecordSetRequestBody withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 解析记录的权重
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public CreateRecordSetRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Record Set的类型， 取值范围：A、CNAME
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRecordSetRequestBody that = (CreateRecordSetRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.records, that.records) && Objects.equals(this.line, that.line)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ttl, records, line, weight, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRecordSetRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
