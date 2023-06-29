package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ListGroupsForDomainRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 查询的用户组来源
     */
    public static final class GroupSourceEnum {

        /**
         * Enum IAM for value: "IAM"
         */
        public static final GroupSourceEnum IAM = new GroupSourceEnum("IAM");

        /**
         * Enum SAML for value: "SAML"
         */
        public static final GroupSourceEnum SAML = new GroupSourceEnum("SAML");

        /**
         * Enum LDAP for value: "LDAP"
         */
        public static final GroupSourceEnum LDAP = new GroupSourceEnum("LDAP");

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final GroupSourceEnum LOCAL = new GroupSourceEnum("LOCAL");

        private static final Map<String, GroupSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupSourceEnum> createStaticFields() {
            Map<String, GroupSourceEnum> map = new HashMap<>();
            map.put("IAM", IAM);
            map.put("SAML", SAML);
            map.put("LDAP", LDAP);
            map.put("LOCAL", LOCAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GroupSourceEnum(String value) {
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
        public static GroupSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GroupSourceEnum(value));
        }

        public static GroupSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GroupSourceEnum) {
                return this.value.equals(((GroupSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_source")

    private GroupSourceEnum groupSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse_page")

    private Boolean reversePage;

    public ListGroupsForDomainRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * instance id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListGroupsForDomainRequest withGroupSource(GroupSourceEnum groupSource) {
        this.groupSource = groupSource;
        return this;
    }

    /**
     * 查询的用户组来源
     * @return groupSource
     */
    public GroupSourceEnum getGroupSource() {
        return groupSource;
    }

    public void setGroupSource(GroupSourceEnum groupSource) {
        this.groupSource = groupSource;
    }

    public ListGroupsForDomainRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回的条目数量
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListGroupsForDomainRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 查询的起始记录ID
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListGroupsForDomainRequest withReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
        return this;
    }

    /**
     * 是否查询上一页
     * @return reversePage
     */
    public Boolean getReversePage() {
        return reversePage;
    }

    public void setReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGroupsForDomainRequest that = (ListGroupsForDomainRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.groupSource, that.groupSource)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.reversePage, that.reversePage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupSource, limit, marker, reversePage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGroupsForDomainRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupSource: ").append(toIndentedString(groupSource)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    reversePage: ").append(toIndentedString(reversePage)).append("\n");
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
