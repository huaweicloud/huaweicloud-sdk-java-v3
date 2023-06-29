package com.huaweicloud.sdk.sdrs.v1.model;

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
public class ListReplicationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    private String serverGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_ids")

    private String serverGroupIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instance_id")

    private String protectedInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instance_ids")

    private String protectedInstanceIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    /**
     * 查询场景类型。如需查询异常状态的复制对列表，query_type的值为“status_abnormal”。否则，query_type取值为空或“general”。
     */
    public static final class QueryTypeEnum {

        /**
         * Enum STATUS_ABNORMAL for value: "status_abnormal"
         */
        public static final QueryTypeEnum STATUS_ABNORMAL = new QueryTypeEnum("status_abnormal");

        /**
         * Enum GENERAL for value: "general"
         */
        public static final QueryTypeEnum GENERAL = new QueryTypeEnum("general");

        private static final Map<String, QueryTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueryTypeEnum> createStaticFields() {
            Map<String, QueryTypeEnum> map = new HashMap<>();
            map.put("status_abnormal", STATUS_ABNORMAL);
            map.put("general", GENERAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QueryTypeEnum(String value) {
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
        public static QueryTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QueryTypeEnum(value));
        }

        public static QueryTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QueryTypeEnum) {
                return this.value.equals(((QueryTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private QueryTypeEnum queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    public ListReplicationsRequest withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 保护组的ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public ListReplicationsRequest withServerGroupIds(String serverGroupIds) {
        this.serverGroupIds = serverGroupIds;
        return this;
    }

    /**
     * 保护组的ID列表，格式为server_group_ids=['server_group_id1','server_group_id2',...,'server_group_idx']，请使用URL编码进行转换。返回“server_group_ids”中有效server_group_id的复制对列表，无效的server_group_id会被忽略。支持查询最多30个server_group_id对应的复制对列表。如果“server_group_id”和“server_group_ids”查询参数同时存在，“server_group_id”会被忽略。
     * @return serverGroupIds
     */
    public String getServerGroupIds() {
        return serverGroupIds;
    }

    public void setServerGroupIds(String serverGroupIds) {
        this.serverGroupIds = serverGroupIds;
    }

    public ListReplicationsRequest withProtectedInstanceId(String protectedInstanceId) {
        this.protectedInstanceId = protectedInstanceId;
        return this;
    }

    /**
     * 保护实例的ID。
     * @return protectedInstanceId
     */
    public String getProtectedInstanceId() {
        return protectedInstanceId;
    }

    public void setProtectedInstanceId(String protectedInstanceId) {
        this.protectedInstanceId = protectedInstanceId;
    }

    public ListReplicationsRequest withProtectedInstanceIds(String protectedInstanceIds) {
        this.protectedInstanceIds = protectedInstanceIds;
        return this;
    }

    /**
     * 保护实例的ID列表，格式为protected_instance_ids=['protected_instance_id1','protected_instance_id2',...,'protected_instance_idx']，请使用URL编码进行转换。返回“protected_instance_ids”中有效protected_instance_id的复制对列表，无效的protected_instance_id会被忽略。支持查询最多30个protected_instance_id对应的复制对列表。如果“protected_instance_id”和“protected_instance_ids”查询参数同时存在，“protected_instance_id”会被忽略。
     * @return protectedInstanceIds
     */
    public String getProtectedInstanceIds() {
        return protectedInstanceIds;
    }

    public void setProtectedInstanceIds(String protectedInstanceIds) {
        this.protectedInstanceIds = protectedInstanceIds;
    }

    public ListReplicationsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 复制对的名称。支持模糊查询。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListReplicationsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 复制对的状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListReplicationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次请求返回结果个数限制，取值范围为[0,1000]的正整数，默认值为1000。
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListReplicationsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 每次请求开始的下标，即偏移量，默认值为0。offset必须为数字，不能为负数。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListReplicationsRequest withQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 查询场景类型。如需查询异常状态的复制对列表，query_type的值为“status_abnormal”。否则，query_type取值为空或“general”。
     * @return queryType
     */
    public QueryTypeEnum getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
    }

    public ListReplicationsRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 复制对所在的保护组的当前生产站点可用区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReplicationsRequest that = (ListReplicationsRequest) obj;
        return Objects.equals(this.serverGroupId, that.serverGroupId)
            && Objects.equals(this.serverGroupIds, that.serverGroupIds)
            && Objects.equals(this.protectedInstanceId, that.protectedInstanceId)
            && Objects.equals(this.protectedInstanceIds, that.protectedInstanceIds)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.queryType, that.queryType)
            && Objects.equals(this.availabilityZone, that.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverGroupId,
            serverGroupIds,
            protectedInstanceId,
            protectedInstanceIds,
            name,
            status,
            limit,
            offset,
            queryType,
            availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReplicationsRequest {\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    serverGroupIds: ").append(toIndentedString(serverGroupIds)).append("\n");
        sb.append("    protectedInstanceId: ").append(toIndentedString(protectedInstanceId)).append("\n");
        sb.append("    protectedInstanceIds: ").append(toIndentedString(protectedInstanceIds)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
