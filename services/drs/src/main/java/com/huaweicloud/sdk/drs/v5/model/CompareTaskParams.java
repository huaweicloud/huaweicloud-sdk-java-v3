package com.huaweicloud.sdk.drs.v5.model;

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
 * 创建或取消对比任务信息体。
 */
public class CompareTaskParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_task_id")

    private String compareTaskId;

    /**
     * 对比任务模式。取值： - object：对象对比。 - lines：行数对比。 - contents：内容对比。
     */
    public static final class TypeEnum {

        /**
         * Enum OBJECT for value: "object"
         */
        public static final TypeEnum OBJECT = new TypeEnum("object");

        /**
         * Enum LINES for value: "lines"
         */
        public static final TypeEnum LINES = new TypeEnum("lines");

        /**
         * Enum CONTENTS for value: "contents"
         */
        public static final TypeEnum CONTENTS = new TypeEnum("contents");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("object", OBJECT);
            map.put("lines", LINES);
            map.put("contents", CONTENTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option")

    private Map<String, String> option = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_object")

    private Map<String, DatabaseObject> dbObject = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_process_info")

    private List<DataProcessInfo> dataProcessInfo = null;

    public CompareTaskParams withCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
        return this;
    }

    /**
     * 取消对比任务必填。
     * @return compareTaskId
     */
    public String getCompareTaskId() {
        return compareTaskId;
    }

    public void setCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
    }

    public CompareTaskParams withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 对比任务模式。取值： - object：对象对比。 - lines：行数对比。 - contents：内容对比。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CompareTaskParams withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 定时启动时间，时间戳格式。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CompareTaskParams withOption(Map<String, String> option) {
        this.option = option;
        return this;
    }

    public CompareTaskParams putOptionItem(String key, String optionItem) {
        if (this.option == null) {
            this.option = new HashMap<>();
        }
        this.option.put(key, optionItem);
        return this;
    }

    public CompareTaskParams withOption(Consumer<Map<String, String>> optionSetter) {
        if (this.option == null) {
            this.option = new HashMap<>();
        }
        optionSetter.accept(this.option);
        return this;
    }

    /**
     * 对比策略。
     * @return option
     */
    public Map<String, String> getOption() {
        return option;
    }

    public void setOption(Map<String, String> option) {
        this.option = option;
    }

    public CompareTaskParams withDbObject(Map<String, DatabaseObject> dbObject) {
        this.dbObject = dbObject;
        return this;
    }

    public CompareTaskParams putDbObjectItem(String key, DatabaseObject dbObjectItem) {
        if (this.dbObject == null) {
            this.dbObject = new HashMap<>();
        }
        this.dbObject.put(key, dbObjectItem);
        return this;
    }

    public CompareTaskParams withDbObject(Consumer<Map<String, DatabaseObject>> dbObjectSetter) {
        if (this.dbObject == null) {
            this.dbObject = new HashMap<>();
        }
        dbObjectSetter.accept(this.dbObject);
        return this;
    }

    /**
     * 对比选择对象。
     * @return dbObject
     */
    public Map<String, DatabaseObject> getDbObject() {
        return dbObject;
    }

    public void setDbObject(Map<String, DatabaseObject> dbObject) {
        this.dbObject = dbObject;
    }

    public CompareTaskParams withDataProcessInfo(List<DataProcessInfo> dataProcessInfo) {
        this.dataProcessInfo = dataProcessInfo;
        return this;
    }

    public CompareTaskParams addDataProcessInfoItem(DataProcessInfo dataProcessInfoItem) {
        if (this.dataProcessInfo == null) {
            this.dataProcessInfo = new ArrayList<>();
        }
        this.dataProcessInfo.add(dataProcessInfoItem);
        return this;
    }

    public CompareTaskParams withDataProcessInfo(Consumer<List<DataProcessInfo>> dataProcessInfoSetter) {
        if (this.dataProcessInfo == null) {
            this.dataProcessInfo = new ArrayList<>();
        }
        dataProcessInfoSetter.accept(this.dataProcessInfo);
        return this;
    }

    /**
     * 更新数据加工规则请求体
     * @return dataProcessInfo
     */
    public List<DataProcessInfo> getDataProcessInfo() {
        return dataProcessInfo;
    }

    public void setDataProcessInfo(List<DataProcessInfo> dataProcessInfo) {
        this.dataProcessInfo = dataProcessInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareTaskParams that = (CompareTaskParams) obj;
        return Objects.equals(this.compareTaskId, that.compareTaskId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.option, that.option)
            && Objects.equals(this.dbObject, that.dbObject)
            && Objects.equals(this.dataProcessInfo, that.dataProcessInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compareTaskId, type, startTime, option, dbObject, dataProcessInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareTaskParams {\n");
        sb.append("    compareTaskId: ").append(toIndentedString(compareTaskId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    option: ").append(toIndentedString(option)).append("\n");
        sb.append("    dbObject: ").append(toIndentedString(dbObject)).append("\n");
        sb.append("    dataProcessInfo: ").append(toIndentedString(dataProcessInfo)).append("\n");
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
