package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IpsRuleChangeDto
 */
public class IpsRuleChangeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_ids")

    private List<String> ipsIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    /**
     * ips规则状态，包含观察：OBSERVE、拦截：ENABLE、禁用：CLOSE、恢复默认：DEFAULT、全局恢复默认：ALL_DEFAULT
     */
    public static final class StatusEnum {

        /**
         * Enum OBSERVE for value: "OBSERVE"
         */
        public static final StatusEnum OBSERVE = new StatusEnum("OBSERVE");

        /**
         * Enum ENABLE for value: "ENABLE"
         */
        public static final StatusEnum ENABLE = new StatusEnum("ENABLE");

        /**
         * Enum CLOSE for value: "CLOSE"
         */
        public static final StatusEnum CLOSE = new StatusEnum("CLOSE");

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final StatusEnum DEFAULT = new StatusEnum("DEFAULT");

        /**
         * Enum ALL_DEFAULT for value: "ALL_DEFAULT"
         */
        public static final StatusEnum ALL_DEFAULT = new StatusEnum("ALL_DEFAULT");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("OBSERVE", OBSERVE);
            map.put("ENABLE", ENABLE);
            map.put("CLOSE", CLOSE);
            map.put("DEFAULT", DEFAULT);
            map.put("ALL_DEFAULT", ALL_DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    public IpsRuleChangeDto withIpsIds(List<String> ipsIds) {
        this.ipsIds = ipsIds;
        return this;
    }

    public IpsRuleChangeDto addIpsIdsItem(String ipsIdsItem) {
        if (this.ipsIds == null) {
            this.ipsIds = new ArrayList<>();
        }
        this.ipsIds.add(ipsIdsItem);
        return this;
    }

    public IpsRuleChangeDto withIpsIds(Consumer<List<String>> ipsIdsSetter) {
        if (this.ipsIds == null) {
            this.ipsIds = new ArrayList<>();
        }
        ipsIdsSetter.accept(this.ipsIds);
        return this;
    }

    /**
     * ips的id列表，Ips规则id，为必填参数，可通过[获取ips规则列表]( ListIpsRules.xml)查询获得，通过返回值中的data.records.ips_id（.表示各对象之间层级的区分）获得。
     * @return ipsIds
     */
    public List<String> getIpsIds() {
        return ipsIds;
    }

    public void setIpsIds(List<String> ipsIds) {
        this.ipsIds = ipsIds;
    }

    public IpsRuleChangeDto withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * 防护对象id
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public IpsRuleChangeDto withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * ips规则状态，包含观察：OBSERVE、拦截：ENABLE、禁用：CLOSE、恢复默认：DEFAULT、全局恢复默认：ALL_DEFAULT
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpsRuleChangeDto that = (IpsRuleChangeDto) obj;
        return Objects.equals(this.ipsIds, that.ipsIds) && Objects.equals(this.objectId, that.objectId)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipsIds, objectId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpsRuleChangeDto {\n");
        sb.append("    ipsIds: ").append(toIndentedString(ipsIds)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
