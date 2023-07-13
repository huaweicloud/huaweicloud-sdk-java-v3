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
 * RecordForGetAuthApp
 */
public class RecordForGetAuthApp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_using_time")

    private Long apiUsingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_time")

    private Long approvalTime;

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

    public RecordForGetAuthApp withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public RecordForGetAuthApp withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public RecordForGetAuthApp withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 集群实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public RecordForGetAuthApp withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 集群实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public RecordForGetAuthApp withApiUsingTime(Long apiUsingTime) {
        this.apiUsingTime = apiUsingTime;
        return this;
    }

    /**
     * 使用截止时间
     * @return apiUsingTime
     */
    public Long getApiUsingTime() {
        return apiUsingTime;
    }

    public void setApiUsingTime(Long apiUsingTime) {
        this.apiUsingTime = apiUsingTime;
    }

    public RecordForGetAuthApp withApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
        return this;
    }

    /**
     * 授权时间
     * @return approvalTime
     */
    public Long getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Long approvalTime) {
        this.approvalTime = approvalTime;
    }

    public RecordForGetAuthApp withRelationshipType(RelationshipTypeEnum relationshipType) {
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

    public RecordForGetAuthApp withStaticParams(List<StaticParam> staticParams) {
        this.staticParams = staticParams;
        return this;
    }

    public RecordForGetAuthApp addStaticParamsItem(StaticParam staticParamsItem) {
        if (this.staticParams == null) {
            this.staticParams = new ArrayList<>();
        }
        this.staticParams.add(staticParamsItem);
        return this;
    }

    public RecordForGetAuthApp withStaticParams(Consumer<List<StaticParam>> staticParamsSetter) {
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
        RecordForGetAuthApp that = (RecordForGetAuthApp) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.apiUsingTime, that.apiUsingTime)
            && Objects.equals(this.approvalTime, that.approvalTime)
            && Objects.equals(this.relationshipType, that.relationshipType)
            && Objects.equals(this.staticParams, that.staticParams);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(appId, appName, instanceId, instanceName, apiUsingTime, approvalTime, relationshipType, staticParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordForGetAuthApp {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    apiUsingTime: ").append(toIndentedString(apiUsingTime)).append("\n");
        sb.append("    approvalTime: ").append(toIndentedString(approvalTime)).append("\n");
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
