package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateProductTopicRequestBody
 */
public class UpdateProductTopicRequestBody  {

    /**
     * 主题权限 0-发布 1-订阅
     */
    public static final class PermissionEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final PermissionEnum NUMBER_0 = new PermissionEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final PermissionEnum NUMBER_1 = new PermissionEnum(1);
        

        private static final Map<Integer, PermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PermissionEnum> createStaticFields() {
            Map<Integer, PermissionEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PermissionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PermissionEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            PermissionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PermissionEnum(value);
            }
            return result;
        }

        public static PermissionEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            PermissionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PermissionEnum) {
                return this.value.equals(((PermissionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="permission")
    
    private PermissionEnum permission;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public UpdateProductTopicRequestBody withPermission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    


    /**
     * 主题权限 0-发布 1-订阅
     * @return permission
     */
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    

    public UpdateProductTopicRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 主题名称，Topic类格式必须以“/”进行分层，区分每个类目。其中第一个为用户自定义的版本号；第二个已经规定好，为${deviceId}通配设备ID；第三个为用户自定义的topic类名。Topic类组成即为：/${version}/${deviceId}/${customizePart}。简单来说，Topic类：/v1/${deviceId}/customizePart是具体Topic：/v1/deviceid1/customizePart1和/v1/deviceid2/customizePart2等的集合。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateProductTopicRequestBody withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 版本号,输入2-50个字符。值以字母或数字开头和结尾。仅允许使用字母，数字，中划线和点号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public UpdateProductTopicRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述，长度0-200
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateProductTopicRequestBody updateProductTopicRequestBody = (UpdateProductTopicRequestBody) o;
        return Objects.equals(this.permission, updateProductTopicRequestBody.permission) &&
            Objects.equals(this.name, updateProductTopicRequestBody.name) &&
            Objects.equals(this.version, updateProductTopicRequestBody.version) &&
            Objects.equals(this.description, updateProductTopicRequestBody.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(permission, name, version, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProductTopicRequestBody {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

