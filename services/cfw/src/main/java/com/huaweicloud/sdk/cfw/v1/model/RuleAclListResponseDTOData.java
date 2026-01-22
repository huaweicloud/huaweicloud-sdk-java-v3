package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 查询规则列表返回值数据
 */
public class RuleAclListResponseDTOData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "up_rules_count")

    private Integer upRulesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<RuleAclListResponseDTODataRecords> records = null;

    public RuleAclListResponseDTOData withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 偏移量：指定返回记录的开始位置 **取值范围**： 大于或等于0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public RuleAclListResponseDTOData withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 每页显示个数 **取值范围**： 1-1024
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public RuleAclListResponseDTOData withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 查询规则列表总条数 **取值范围**： 大于0
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public RuleAclListResponseDTOData withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * **参数解释**： 防护对象id，是创建云防火墙后用于区分互联网边界防护和VPC边界防护的标志id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得，type为0时，object_id为互联网边界防护对象ID，type为1时，object_id为VPC边界防护对象ID，type可通过data.records.protect_objects.type（.表示各对象之间层级的区分）获得  **取值范围**：  32位UUID
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public RuleAclListResponseDTOData withUpRulesCount(Integer upRulesCount) {
        this.upRulesCount = upRulesCount;
        return this;
    }

    /**
     * **参数解释**： 顶部规则数量 **取值范围**： 不涉及
     * @return upRulesCount
     */
    public Integer getUpRulesCount() {
        return upRulesCount;
    }

    public void setUpRulesCount(Integer upRulesCount) {
        this.upRulesCount = upRulesCount;
    }

    public RuleAclListResponseDTOData withRecords(List<RuleAclListResponseDTODataRecords> records) {
        this.records = records;
        return this;
    }

    public RuleAclListResponseDTOData addRecordsItem(RuleAclListResponseDTODataRecords recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public RuleAclListResponseDTOData withRecords(Consumer<List<RuleAclListResponseDTODataRecords>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释**： 查询规则列表记录
     * @return records
     */
    public List<RuleAclListResponseDTODataRecords> getRecords() {
        return records;
    }

    public void setRecords(List<RuleAclListResponseDTODataRecords> records) {
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
        RuleAclListResponseDTOData that = (RuleAclListResponseDTOData) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.total, that.total) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.upRulesCount, that.upRulesCount) && Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, total, objectId, upRulesCount, records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleAclListResponseDTOData {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    upRulesCount: ").append(toIndentedString(upRulesCount)).append("\n");
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
