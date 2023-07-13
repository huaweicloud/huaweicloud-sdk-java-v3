package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListInstanceListRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    /**
     * dlm版本类型
     */
    public static final class DlmTypeEnum {

        /**
         * Enum SHARED for value: "SHARED"
         */
        public static final DlmTypeEnum SHARED = new DlmTypeEnum("SHARED");

        /**
         * Enum EXCLUSIVE for value: "EXCLUSIVE"
         */
        public static final DlmTypeEnum EXCLUSIVE = new DlmTypeEnum("EXCLUSIVE");

        private static final Map<String, DlmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DlmTypeEnum> createStaticFields() {
            Map<String, DlmTypeEnum> map = new HashMap<>();
            map.put("SHARED", SHARED);
            map.put("EXCLUSIVE", EXCLUSIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DlmTypeEnum(String value) {
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
        public static DlmTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DlmTypeEnum(value));
        }

        public static DlmTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DlmTypeEnum) {
                return this.value.equals(((DlmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Dlm-Type")

    private DlmTypeEnum dlmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    /**
     * api操作
     */
    public static final class ActionEnum {

        /**
         * Enum PUBLISH for value: "PUBLISH"
         */
        public static final ActionEnum PUBLISH = new ActionEnum("PUBLISH");

        /**
         * Enum UNPUBLISH for value: "UNPUBLISH"
         */
        public static final ActionEnum UNPUBLISH = new ActionEnum("UNPUBLISH");

        /**
         * Enum STOP for value: "STOP"
         */
        public static final ActionEnum STOP = new ActionEnum("STOP");

        /**
         * Enum RECOVER for value: "RECOVER"
         */
        public static final ActionEnum RECOVER = new ActionEnum("RECOVER");

        /**
         * Enum WHITELIST for value: "WHITELIST"
         */
        public static final ActionEnum WHITELIST = new ActionEnum("WHITELIST");

        /**
         * Enum AUTHORIZE for value: "AUTHORIZE"
         */
        public static final ActionEnum AUTHORIZE = new ActionEnum("AUTHORIZE");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("PUBLISH", PUBLISH);
            map.put("UNPUBLISH", UNPUBLISH);
            map.put("STOP", STOP);
            map.put("RECOVER", RECOVER);
            map.put("WHITELIST", WHITELIST);
            map.put("AUTHORIZE", AUTHORIZE);
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
    @JsonProperty(value = "show_all")

    private Boolean showAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_status")

    private Boolean checkStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_debug")

    private Boolean checkDebug;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListInstanceListRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间id
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListInstanceListRequest withDlmType(DlmTypeEnum dlmType) {
        this.dlmType = dlmType;
        return this;
    }

    /**
     * dlm版本类型
     * @return dlmType
     */
    public DlmTypeEnum getDlmType() {
        return dlmType;
    }

    public void setDlmType(DlmTypeEnum dlmType) {
        this.dlmType = dlmType;
    }

    public ListInstanceListRequest withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * api编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ListInstanceListRequest withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * api操作
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public ListInstanceListRequest withShowAll(Boolean showAll) {
        this.showAll = showAll;
        return this;
    }

    /**
     * 全部展示(包括不可执行当前操作的实例)
     * @return showAll
     */
    public Boolean getShowAll() {
        return showAll;
    }

    public void setShowAll(Boolean showAll) {
        this.showAll = showAll;
    }

    public ListInstanceListRequest withCheckStatus(Boolean checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }

    /**
     * 校验api状态
     * @return checkStatus
     */
    public Boolean getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Boolean checkStatus) {
        this.checkStatus = checkStatus;
    }

    public ListInstanceListRequest withCheckDebug(Boolean checkDebug) {
        this.checkDebug = checkDebug;
        return this;
    }

    /**
     * 校验api调试状态
     * @return checkDebug
     */
    public Boolean getCheckDebug() {
        return checkDebug;
    }

    public void setCheckDebug(Boolean checkDebug) {
        this.checkDebug = checkDebug;
    }

    public ListInstanceListRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * app编号(用于判断授权操作app可选的实例)
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ListInstanceListRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListInstanceListRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceListRequest that = (ListInstanceListRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.dlmType, that.dlmType)
            && Objects.equals(this.apiId, that.apiId) && Objects.equals(this.action, that.action)
            && Objects.equals(this.showAll, that.showAll) && Objects.equals(this.checkStatus, that.checkStatus)
            && Objects.equals(this.checkDebug, that.checkDebug) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, dlmType, apiId, action, showAll, checkStatus, checkDebug, appId, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceListRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    dlmType: ").append(toIndentedString(dlmType)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    showAll: ").append(toIndentedString(showAll)).append("\n");
        sb.append("    checkStatus: ").append(toIndentedString(checkStatus)).append("\n");
        sb.append("    checkDebug: ").append(toIndentedString(checkDebug)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
