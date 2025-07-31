package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateRecordSetWithLine
 */
public class BatchCreateRecordSetWithLine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private String line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<String> records = null;

    public BatchCreateRecordSetWithLine withLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * **参数解释：** 解析线路ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return line
     */
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public BatchCreateRecordSetWithLine withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * **参数解释：** 记录集的有效缓存时间，以秒为单位。 **约束限制：** 不涉及。 **取值范围：** 1~2147483647。 **默认取值：** 300
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public BatchCreateRecordSetWithLine withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 解析记录的权重。 **约束限制：** 在相同域名、类型、线路下的解析记录，规则如下： - 全部设置权重，或全部不设置权重。 - 当不设置权重时，只能创建一个解析记录。 - 当设置权重时，最多能创建20个解析记录。  **取值范围：** 0~1000。 - 当weight=null时，表示该解析记录不设置权重。 - 当weight=0，表示备用域名解析记录。 - 当weight>0，表示主用域名解析记录。  **默认取值：** 1。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public BatchCreateRecordSetWithLine withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    public BatchCreateRecordSetWithLine addRecordsItem(String recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public BatchCreateRecordSetWithLine withRecords(Consumer<List<String>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释：** 解析记录的值。不同类型解析记录对应的值的规则不同。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return records
     */
    public List<String> getRecords() {
        return records;
    }

    public void setRecords(List<String> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateRecordSetWithLine that = (BatchCreateRecordSetWithLine) obj;
        return Objects.equals(this.line, that.line) && Objects.equals(this.ttl, that.ttl)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line, ttl, weight, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateRecordSetWithLine {\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
