package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAlarmsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private String start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListAlarmsRequest withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * **参数解释**： 分页起始值，内容为alarm_id **约束限制**： 不涉及。 **取值范围**： 以al开头，后跟22位字母或数字。字符长度为24 **默认取值**： 不涉及。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public ListAlarmsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 用于限制结果数据条数。 **约束限制**： 不涉及。 **取值范围**： 取值范围(0,100] **默认取值**： 默认值为100
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAlarmsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释**： 用于标识结果排序方法，按时间戳排序。 **约束限制**： 不涉及 **取值范围**： 枚举值： - asc：升序 - desc：降序 **默认取值**： desc
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListAlarmsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 企业项目ID，当查询所有企业项目时，配置为：all_granted_eps。 当需要查询某个企业项目时，配置为对应的企业项目ID，请参考获“[取企业项目ID](ces_03_0061.xml)”。 **约束限制**： 不涉及。 **取值范围**： 只能包含小写字母、数字、“-”、“_”，长度为36个字符。也可取值0或all_granted_eps。0：代表默认企业项目ID，all_granted_eps：代表所有企业项目ID。 **默认取值**： all_granted_eps 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmsRequest that = (ListAlarmsRequest) obj;
        return Objects.equals(this.start, that.start) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.order, that.order)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, limit, order, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmsRequest {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
