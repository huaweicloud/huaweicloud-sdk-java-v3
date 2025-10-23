package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAlarmRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    /**
     * 告警命名空间，取值范围：SYS.CBR,SYS.RDS,SYS.GaussDB
     */
    public static final class NamespaceEnum {

        /**
         * Enum SYS_CBR for value: "SYS.CBR"
         */
        public static final NamespaceEnum SYS_CBR = new NamespaceEnum("SYS.CBR");

        /**
         * Enum SYS_RDS for value: "SYS.RDS"
         */
        public static final NamespaceEnum SYS_RDS = new NamespaceEnum("SYS.RDS");

        /**
         * Enum SYS_GAUSSDB for value: "SYS.GaussDB"
         */
        public static final NamespaceEnum SYS_GAUSSDB = new NamespaceEnum("SYS.GaussDB");

        private static final Map<String, NamespaceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NamespaceEnum> createStaticFields() {
            Map<String, NamespaceEnum> map = new HashMap<>();
            map.put("SYS.CBR", SYS_CBR);
            map.put("SYS.RDS", SYS_RDS);
            map.put("SYS.GaussDB", SYS_GAUSSDB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NamespaceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NamespaceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NamespaceEnum(value));
        }

        public static NamespaceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NamespaceEnum) {
                return this.value.equals(((NamespaceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private NamespaceEnum namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_id")

    private String alarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListAlarmRulesRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListAlarmRulesRequest withNamespace(NamespaceEnum namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 告警命名空间，取值范围：SYS.CBR,SYS.RDS,SYS.GaussDB
     * @return namespace
     */
    public NamespaceEnum getNamespace() {
        return namespace;
    }

    public void setNamespace(NamespaceEnum namespace) {
        this.namespace = namespace;
    }

    public ListAlarmRulesRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * RegionID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListAlarmRulesRequest withAlarmRuleId(String alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }

    /**
     * 告警规则ID
     * @return alarmRuleId
     */
    public String getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(String alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    public ListAlarmRulesRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页起始值，默认值为0。
     * minimum: 0
     * maximum: 65535
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListAlarmRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次查询的条数限制,取值范围(0,100]，默认值为100，用于限制结果数据条数。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmRulesRequest that = (ListAlarmRulesRequest) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.alarmRuleId, that.alarmRuleId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, namespace, regionId, alarmRuleId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmRulesRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    alarmRuleId: ").append(toIndentedString(alarmRuleId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
