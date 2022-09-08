package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GroupBy
 */
public class GroupBy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    public GroupBy withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * tag：按照成本标签过滤cost_unit：按照成本单元过滤dimension：默认取值
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GroupBy withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 如果type为tag，此处取值为tag的key。如果type为cost_unit，此处取值为cost_unit的key。如果type为dimension，此处取值如下：CLOUD_SERVICE_TYPE 产品类型RESOURCE_TYPE 产品ASSOCIATED_ACCOUNT 关联账号（企业主名下的所有企业子账号）REGION_CODE 区域AZ_CODE 可用区ENTERPRISE_PROJECT_ID 企业项目RES_SPEC_CODE 产品规格CHARGING_MODE 计费模式USAGE_TYPE 使用量类型BILL_TYPE 账单大类（billtype，前台需转换billdetailtype）BE_ID 运营实体（beid）PAYER_ACCOUNT_ID 支付账号RESOURCE_ID 资源
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GroupBy groupBy = (GroupBy) o;
        return Objects.equals(this.type, groupBy.type) && Objects.equals(this.key, groupBy.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupBy {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
