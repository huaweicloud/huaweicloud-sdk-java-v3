package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateRecordSet
 */
public class BatchUpdateRecordSet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<String> records = null;

    public BatchUpdateRecordSet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 记录集ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchUpdateRecordSet withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 记录集的描述信息。 **约束限制：** 不涉及。 **取值范围：** 长度不超过255个字符。 **默认取值：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BatchUpdateRecordSet withTtl(Integer ttl) {
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

    public BatchUpdateRecordSet withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 解析记录的权重。 **约束限制：** 在相同域名、类型、线路下的解析记录，规则如下： - 全部设置权重，或全部不设置权重。 - 当不设置权重时，只能创建一个解析记录。 - 当设置权重时，最多能创建20个解析记录。  **取值范围：** 0~1000。 - 当weight=null时，表示该解析记录不设置权重。 - 当weight=0，表示备用域名解析记录。 - 当weight>0，表示主用域名解析记录。  **默认取值：** null。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public BatchUpdateRecordSet withRecords(List<String> records) {
        this.records = records;
        return this;
    }

    public BatchUpdateRecordSet addRecordsItem(String recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public BatchUpdateRecordSet withRecords(Consumer<List<String>> recordsSetter) {
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
        BatchUpdateRecordSet that = (BatchUpdateRecordSet) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.ttl, that.ttl) && Objects.equals(this.weight, that.weight)
            && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, ttl, weight, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateRecordSet {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
