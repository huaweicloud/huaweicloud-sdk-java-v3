package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OperateLogGetRequest
 */
public class OperateLogGetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private TimeRangeBean time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    /**
     * 动作名称 - CREATE - DELETE - DOWNLOAD - UPDATE
     */
    public static final class ActionEnum {

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final ActionEnum CREATE = new ActionEnum("CREATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final ActionEnum DELETE = new ActionEnum("DELETE");

        /**
         * Enum DOWNLOAD for value: "DOWNLOAD"
         */
        public static final ActionEnum DOWNLOAD = new ActionEnum("DOWNLOAD");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final ActionEnum UPDATE = new ActionEnum("UPDATE");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("CREATE", CREATE);
            map.put("DELETE", DELETE);
            map.put("DOWNLOAD", DOWNLOAD);
            map.put("UPDATE", UPDATE);
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

    /**
     * 执行结果 - success - fail
     */
    public static final class ResultEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final ResultEnum SUCCESS = new ResultEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final ResultEnum FAIL = new ResultEnum("fail");

        private static final Map<String, ResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultEnum> createStaticFields() {
            Map<String, ResultEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultEnum(String value) {
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
        public static ResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResultEnum(value));
        }

        public static ResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultEnum) {
                return this.value.equals(((ResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private ResultEnum result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private String page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    public OperateLogGetRequest withTime(TimeRangeBean time) {
        this.time = time;
        return this;
    }

    public OperateLogGetRequest withTime(Consumer<TimeRangeBean> timeSetter) {
        if (this.time == null) {
            this.time = new TimeRangeBean();
            timeSetter.accept(this.time);
        }

        return this;
    }

    /**
     * Get time
     * @return time
     */
    public TimeRangeBean getTime() {
        return time;
    }

    public void setTime(TimeRangeBean time) {
        this.time = time;
    }

    public OperateLogGetRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 操作日志用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public OperateLogGetRequest withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 动作名称 - CREATE - DELETE - DOWNLOAD - UPDATE
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public OperateLogGetRequest withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    /**
     * 执行结果 - success - fail
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    public OperateLogGetRequest withPage(String page) {
        this.page = page;
        return this;
    }

    /**
     * 页数
     * @return page
     */
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public OperateLogGetRequest withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 每页条数
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperateLogGetRequest that = (OperateLogGetRequest) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.action, that.action) && Objects.equals(this.result, that.result)
            && Objects.equals(this.page, that.page) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, userName, action, result, page, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateLogGetRequest {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
