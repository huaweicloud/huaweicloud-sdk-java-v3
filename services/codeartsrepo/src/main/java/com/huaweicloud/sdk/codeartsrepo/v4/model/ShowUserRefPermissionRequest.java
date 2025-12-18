package com.huaweicloud.sdk.codeartsrepo.v4.model;

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
public class ShowUserRefPermissionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_ref")

    private String targetRef;

    /**
     * **参数解释：** 动作类型，可用于查询指定动作的权限 - read，查看 - review，检视 - approval, 审核 - create-change，创建变更请求 - merge，合并变更请求 - create-delete，创建/删除分支 - push, 推送
     */
    public static final class ActionEnum {

        /**
         * Enum READ for value: "read"
         */
        public static final ActionEnum READ = new ActionEnum("read");

        /**
         * Enum REVIEW for value: "review"
         */
        public static final ActionEnum REVIEW = new ActionEnum("review");

        /**
         * Enum APPROVAL for value: "approval"
         */
        public static final ActionEnum APPROVAL = new ActionEnum("approval");

        /**
         * Enum CREATE_CHANGE for value: "create-change"
         */
        public static final ActionEnum CREATE_CHANGE = new ActionEnum("create-change");

        /**
         * Enum MERGE for value: "merge"
         */
        public static final ActionEnum MERGE = new ActionEnum("merge");

        /**
         * Enum CREATE_DELETE for value: "create-delete"
         */
        public static final ActionEnum CREATE_DELETE = new ActionEnum("create-delete");

        /**
         * Enum PUSH for value: "push"
         */
        public static final ActionEnum PUSH = new ActionEnum("push");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("read", READ);
            map.put("review", REVIEW);
            map.put("approval", APPROVAL);
            map.put("create-change", CREATE_CHANGE);
            map.put("merge", MERGE);
            map.put("create-delete", CREATE_DELETE);
            map.put("push", PUSH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_request_iid")

    private Integer changeRequestIid;

    public ShowUserRefPermissionRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[[查询用户所有仓库](https://support.huaweicloud.com/eu/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_eu)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowUserRefPermissionRequest withTargetRef(String targetRef) {
        this.targetRef = targetRef;
        return this;
    }

    /**
     * **参数解释：** 分支或者标签名称。  **约束限制：** 不支持空格 [ \\ < ~ ^ : ? * ! ( ) ' \" | 等特殊字符，不支持以. / .lock结尾，分支以refs/head/开头，标签以refs/tag/开头  **取值范围：** 字符串长度不少于1，不超过210。 **默认取值：** 不涉及。
     * @return targetRef
     */
    public String getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(String targetRef) {
        this.targetRef = targetRef;
    }

    public ShowUserRefPermissionRequest withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释：** 动作类型，可用于查询指定动作的权限 - read，查看 - review，检视 - approval, 审核 - create-change，创建变更请求 - merge，合并变更请求 - create-delete，创建/删除分支 - push, 推送
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ShowUserRefPermissionRequest withChangeRequestIid(Integer changeRequestIid) {
        this.changeRequestIid = changeRequestIid;
        return this;
    }

    /**
     * **参数解释：** 变更请求在仓库内部的ID。
     * minimum: 1
     * maximum: 2147483647
     * @return changeRequestIid
     */
    public Integer getChangeRequestIid() {
        return changeRequestIid;
    }

    public void setChangeRequestIid(Integer changeRequestIid) {
        this.changeRequestIid = changeRequestIid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserRefPermissionRequest that = (ShowUserRefPermissionRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.targetRef, that.targetRef)
            && Objects.equals(this.action, that.action) && Objects.equals(this.changeRequestIid, that.changeRequestIid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, targetRef, action, changeRequestIid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserRefPermissionRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    changeRequestIid: ").append(toIndentedString(changeRequestIid)).append("\n");
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
