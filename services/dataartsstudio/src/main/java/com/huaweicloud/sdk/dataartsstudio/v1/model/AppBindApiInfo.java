package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * 应用已绑定的api信息
 */
public class AppBindApiInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_time")

    private Long approvalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager")

    private String manager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deadline")

    private Long deadline;

    /**
     * 绑定关系
     */
    public static final class RelationshipTypeEnum {

        /**
         * Enum LINK_WAITING_CHECK for value: "LINK_WAITING_CHECK"
         */
        public static final RelationshipTypeEnum LINK_WAITING_CHECK = new RelationshipTypeEnum("LINK_WAITING_CHECK");

        /**
         * Enum LINKED for value: "LINKED"
         */
        public static final RelationshipTypeEnum LINKED = new RelationshipTypeEnum("LINKED");

        /**
         * Enum OFFLINE_WAITING_CHECK for value: "OFFLINE_WAITING_CHECK"
         */
        public static final RelationshipTypeEnum OFFLINE_WAITING_CHECK =
            new RelationshipTypeEnum("OFFLINE_WAITING_CHECK");

        /**
         * Enum RENEW_WAITING_CHECK for value: "RENEW_WAITING_CHECK"
         */
        public static final RelationshipTypeEnum RENEW_WAITING_CHECK = new RelationshipTypeEnum("RENEW_WAITING_CHECK");

        private static final Map<String, RelationshipTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RelationshipTypeEnum> createStaticFields() {
            Map<String, RelationshipTypeEnum> map = new HashMap<>();
            map.put("LINK_WAITING_CHECK", LINK_WAITING_CHECK);
            map.put("LINKED", LINKED);
            map.put("OFFLINE_WAITING_CHECK", OFFLINE_WAITING_CHECK);
            map.put("RENEW_WAITING_CHECK", RENEW_WAITING_CHECK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RelationshipTypeEnum(String value) {
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
        public static RelationshipTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RelationshipTypeEnum(value));
        }

        public static RelationshipTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RelationshipTypeEnum) {
                return this.value.equals(((RelationshipTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relationship_type")

    private RelationshipTypeEnum relationshipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_params")

    private List<StaticParam> staticParams = null;

    public AppBindApiInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * API ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppBindApiInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * API名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AppBindApiInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * API描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppBindApiInfo withApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
        return this;
    }

    /**
     * 审核时间
     * @return approvalTime
     */
    public Long getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
    }

    public AppBindApiInfo withManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * API 审核人名称
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public AppBindApiInfo withDeadline(Long deadline) {
        this.deadline = deadline;
        return this;
    }

    /**
     * 使用截止时间
     * @return deadline
     */
    public Long getDeadline() {
        return deadline;
    }

    public void setDeadline(Long deadline) {
        this.deadline = deadline;
    }

    public AppBindApiInfo withRelationshipType(RelationshipTypeEnum relationshipType) {
        this.relationshipType = relationshipType;
        return this;
    }

    /**
     * 绑定关系
     * @return relationshipType
     */
    public RelationshipTypeEnum getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(RelationshipTypeEnum relationshipType) {
        this.relationshipType = relationshipType;
    }

    public AppBindApiInfo withStaticParams(List<StaticParam> staticParams) {
        this.staticParams = staticParams;
        return this;
    }

    public AppBindApiInfo addStaticParamsItem(StaticParam staticParamsItem) {
        if (this.staticParams == null) {
            this.staticParams = new ArrayList<>();
        }
        this.staticParams.add(staticParamsItem);
        return this;
    }

    public AppBindApiInfo withStaticParams(Consumer<List<StaticParam>> staticParamsSetter) {
        if (this.staticParams == null) {
            this.staticParams = new ArrayList<>();
        }
        staticParamsSetter.accept(this.staticParams);
        return this;
    }

    /**
     * 静态参数列表
     * @return staticParams
     */
    public List<StaticParam> getStaticParams() {
        return staticParams;
    }

    public void setStaticParams(List<StaticParam> staticParams) {
        this.staticParams = staticParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppBindApiInfo that = (AppBindApiInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.approvalTime, that.approvalTime) && Objects.equals(this.manager, that.manager)
            && Objects.equals(this.deadline, that.deadline)
            && Objects.equals(this.relationshipType, that.relationshipType)
            && Objects.equals(this.staticParams, that.staticParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, approvalTime, manager, deadline, relationshipType, staticParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppBindApiInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    approvalTime: ").append(toIndentedString(approvalTime)).append("\n");
        sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
        sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
        sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
        sb.append("    staticParams: ").append(toIndentedString(staticParams)).append("\n");
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
