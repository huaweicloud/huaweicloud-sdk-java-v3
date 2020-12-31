package com.huaweicloud.sdk.drs.v3.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 数据库对象选择信息
 */
public class DatabaseInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_id")
    
    private String parentId;
    /**
     * 类型
     */
    public static final class ObjectTypeEnum {

        
        /**
         * Enum DATABASE for value: "database"
         */
        public static final ObjectTypeEnum DATABASE = new ObjectTypeEnum("database");
        
        /**
         * Enum TABLE for value: "table"
         */
        public static final ObjectTypeEnum TABLE = new ObjectTypeEnum("table");
        
        /**
         * Enum SCHEMA for value: "schema"
         */
        public static final ObjectTypeEnum SCHEMA = new ObjectTypeEnum("schema");
        

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("database", DATABASE);
            map.put("table", TABLE);
            map.put("schema", SCHEMA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ObjectTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ObjectTypeEnum(value);
            }
            return result;
        }

        public static ObjectTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ObjectTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ObjectTypeEnum) {
                return this.value.equals(((ObjectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_type")
    
    private ObjectTypeEnum objectType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_alias_name")
    
    private String objectAliasName;
    /**
     * 是否选中
     */
    public static final class SelectEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final SelectEnum TRUE = new SelectEnum("true");
        
        /**
         * Enum FALSE for value: "false"
         */
        public static final SelectEnum FALSE = new SelectEnum("false");
        

        private static final Map<String, SelectEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SelectEnum> createStaticFields() {
            Map<String, SelectEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SelectEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SelectEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SelectEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SelectEnum(value);
            }
            return result;
        }

        public static SelectEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SelectEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SelectEnum) {
                return this.value.equals(((SelectEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="select")
    
    private SelectEnum select;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notice")
    
    private List<String> notice = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extended_info")
    
    private String extendedInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="can_expand")
    
    private Boolean canExpand;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="preset")
    
    private String preset;

    public DatabaseInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 本节点id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DatabaseInfo withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    


    /**
     * 父节点id。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public DatabaseInfo withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    


    /**
     * 类型
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }

    public DatabaseInfo withObjectAliasName(String objectAliasName) {
        this.objectAliasName = objectAliasName;
        return this;
    }

    


    /**
     * 别名
     * @return objectAliasName
     */
    public String getObjectAliasName() {
        return objectAliasName;
    }

    public void setObjectAliasName(String objectAliasName) {
        this.objectAliasName = objectAliasName;
    }

    public DatabaseInfo withSelect(SelectEnum select) {
        this.select = select;
        return this;
    }

    


    /**
     * 是否选中
     * @return select
     */
    public SelectEnum getSelect() {
        return select;
    }

    public void setSelect(SelectEnum select) {
        this.select = select;
    }

    public DatabaseInfo withNotice(List<String> notice) {
        this.notice = notice;
        return this;
    }

    
    public DatabaseInfo addNoticeItem(String noticeItem) {
        if (this.notice == null) {
            this.notice = new ArrayList<>();
        }
        this.notice.add(noticeItem);
        return this;
    }

    public DatabaseInfo withNotice(Consumer<List<String>> noticeSetter) {
        if(this.notice == null ){
            this.notice = new ArrayList<>();
        }
        noticeSetter.accept(this.notice);
        return this;
    }

    /**
     * 提示信息：例如提示库下表太多
     * @return notice
     */
    public List<String> getNotice() {
        return notice;
    }

    public void setNotice(List<String> notice) {
        this.notice = notice;
    }

    public DatabaseInfo withExtendedInfo(String extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    


    /**
     * 扩展信息：比如提示有无数据，结构是否在目标库中存在。
     * @return extendedInfo
     */
    public String getExtendedInfo() {
        return extendedInfo;
    }

    public void setExtendedInfo(String extendedInfo) {
        this.extendedInfo = extendedInfo;
    }

    public DatabaseInfo withCanExpand(Boolean canExpand) {
        this.canExpand = canExpand;
        return this;
    }

    


    /**
     * 能否展开
     * @return canExpand
     */
    public Boolean getCanExpand() {
        return canExpand;
    }

    public void setCanExpand(Boolean canExpand) {
        this.canExpand = canExpand;
    }

    public DatabaseInfo withPreset(String preset) {
        this.preset = preset;
        return this;
    }

    


    /**
     * 是否预置
     * @return preset
     */
    public String getPreset() {
        return preset;
    }

    public void setPreset(String preset) {
        this.preset = preset;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseInfo databaseInfo = (DatabaseInfo) o;
        return Objects.equals(this.id, databaseInfo.id) &&
            Objects.equals(this.parentId, databaseInfo.parentId) &&
            Objects.equals(this.objectType, databaseInfo.objectType) &&
            Objects.equals(this.objectAliasName, databaseInfo.objectAliasName) &&
            Objects.equals(this.select, databaseInfo.select) &&
            Objects.equals(this.notice, databaseInfo.notice) &&
            Objects.equals(this.extendedInfo, databaseInfo.extendedInfo) &&
            Objects.equals(this.canExpand, databaseInfo.canExpand) &&
            Objects.equals(this.preset, databaseInfo.preset);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, objectType, objectAliasName, select, notice, extendedInfo, canExpand, preset);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectAliasName: ").append(toIndentedString(objectAliasName)).append("\n");
        sb.append("    select: ").append(toIndentedString(select)).append("\n");
        sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
        sb.append("    extendedInfo: ").append(toIndentedString(extendedInfo)).append("\n");
        sb.append("    canExpand: ").append(toIndentedString(canExpand)).append("\n");
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
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

