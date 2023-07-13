package com.huaweicloud.sdk.workspace.v2.model;

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
 * ActionsOfUsersInGroupRequest
 */
public class ActionsOfUsersInGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_ids")

    private List<String> userIds = null;

    /**
     * 操作类型。 * ADD： 添加 * DELETE： 删除
     */
    public static final class OpTypeEnum {

        /**
         * Enum ADD for value: "ADD"
         */
        public static final OpTypeEnum ADD = new OpTypeEnum("ADD");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final OpTypeEnum DELETE = new OpTypeEnum("DELETE");

        private static final Map<String, OpTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OpTypeEnum> createStaticFields() {
            Map<String, OpTypeEnum> map = new HashMap<>();
            map.put("ADD", ADD);
            map.put("DELETE", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OpTypeEnum(String value) {
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
        public static OpTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OpTypeEnum(value));
        }

        public static OpTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OpTypeEnum) {
                return this.value.equals(((OpTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_type")

    private OpTypeEnum opType;

    public ActionsOfUsersInGroupRequest withUserIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }

    public ActionsOfUsersInGroupRequest addUserIdsItem(String userIdsItem) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        this.userIds.add(userIdsItem);
        return this;
    }

    public ActionsOfUsersInGroupRequest withUserIds(Consumer<List<String>> userIdsSetter) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        userIdsSetter.accept(this.userIds);
        return this;
    }

    /**
     * 要添加或移除的用户Id列表。
     * @return userIds
     */
    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public ActionsOfUsersInGroupRequest withOpType(OpTypeEnum opType) {
        this.opType = opType;
        return this;
    }

    /**
     * 操作类型。 * ADD： 添加 * DELETE： 删除
     * @return opType
     */
    public OpTypeEnum getOpType() {
        return opType;
    }

    public void setOpType(OpTypeEnum opType) {
        this.opType = opType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionsOfUsersInGroupRequest that = (ActionsOfUsersInGroupRequest) obj;
        return Objects.equals(this.userIds, that.userIds) && Objects.equals(this.opType, that.opType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userIds, opType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsOfUsersInGroupRequest {\n");
        sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
        sb.append("    opType: ").append(toIndentedString(opType)).append("\n");
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
