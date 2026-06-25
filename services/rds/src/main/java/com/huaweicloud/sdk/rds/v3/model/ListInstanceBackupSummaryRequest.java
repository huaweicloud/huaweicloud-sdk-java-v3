package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListInstanceBackupSummaryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private String engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_field")

    private String orderField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_rule")

    private String orderRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    public ListInstanceBackupSummaryRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * **参数解释**：  引擎类型。只支持筛选RDS for MySQL,RDS for MariaDB, TaurusDB标准版引擎  **约束限制**：  不涉及。  **取值范围**：  - mysql - mariadb - taurusdb  **默认取值**：  不涉及。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ListInstanceBackupSummaryRequest withOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }

    /**
     * **参数解释**：  排序字段。 根据指定字段排序查询结果。  **约束限制**：  不涉及。  **取值范围**： - backup_used_space:根据备份数据总量排序 - obs ：根据日志备份用量排序  **默认取值**：  不涉及。
     * @return orderField
     */
    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public ListInstanceBackupSummaryRequest withOrderRule(String orderRule) {
        this.orderRule = orderRule;
        return this;
    }

    /**
     * **参数解释**：  排序规则。  **约束限制**：  不涉及。  **取值范围**：  - ASC ： 根据排序字段升序 - DESC ：根据排序字段降序  **默认取值**：  DESC
     * @return orderRule
     */
    public String getOrderRule() {
        return orderRule;
    }

    public void setOrderRule(String orderRule) {
        this.orderRule = orderRule;
    }

    public ListInstanceBackupSummaryRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstanceBackupSummaryRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**：  实例名称。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ListInstanceBackupSummaryRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：  索引位置，偏移量。从第一条数据偏移offset条数据后开始查询。  **约束限制**：  必须为数字，不能为负数。  **取值范围**：  大于等于0的整数。  **默认取值**：  0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListInstanceBackupSummaryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：  查询记录数。  **约束限制**：  不涉及。  **取值范围**：  默认为10，不能为负数，最小值为1，最大值为50。  **默认取值**：  10。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListInstanceBackupSummaryRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * **参数解释**：  请求语言类型。  **约束限制**：  不涉及。  **取值范围**：  - en-us - zh-cn **默认取值**：  en-us。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceBackupSummaryRequest that = (ListInstanceBackupSummaryRequest) obj;
        return Objects.equals(this.engine, that.engine) && Objects.equals(this.orderField, that.orderField)
            && Objects.equals(this.orderRule, that.orderRule) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.xLanguage, that.xLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, orderField, orderRule, instanceId, instanceName, offset, limit, xLanguage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceBackupSummaryRequest {\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    orderField: ").append(toIndentedString(orderField)).append("\n");
        sb.append("    orderRule: ").append(toIndentedString(orderRule)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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
