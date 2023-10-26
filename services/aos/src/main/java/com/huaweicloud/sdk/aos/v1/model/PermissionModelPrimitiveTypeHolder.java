package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PermissionModelPrimitiveTypeHolder
 */
public class PermissionModelPrimitiveTypeHolder {

    /**
     * 权限模型，定义了RFS操作资源栈集时所需委托的创建方式，枚举值    * `SELF_MANAGED` - 基于部署需求，用户需要提前手动创建委托，既包含管理账号给RFS的委托，也包含成员账号创建给管理账号的委托。如果委托不存在或错误，创建资源栈集不会失败，部署资源栈集或部署资源栈实例的时候才会报错。
     */
    public static final class PermissionModelEnum {

        /**
         * Enum SELF_MANAGED for value: "SELF_MANAGED"
         */
        public static final PermissionModelEnum SELF_MANAGED = new PermissionModelEnum("SELF_MANAGED");

        private static final Map<String, PermissionModelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionModelEnum> createStaticFields() {
            Map<String, PermissionModelEnum> map = new HashMap<>();
            map.put("SELF_MANAGED", SELF_MANAGED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionModelEnum(String value) {
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
        public static PermissionModelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionModelEnum(value));
        }

        public static PermissionModelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionModelEnum) {
                return this.value.equals(((PermissionModelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_model")

    private PermissionModelEnum permissionModel;

    public PermissionModelPrimitiveTypeHolder withPermissionModel(PermissionModelEnum permissionModel) {
        this.permissionModel = permissionModel;
        return this;
    }

    /**
     * 权限模型，定义了RFS操作资源栈集时所需委托的创建方式，枚举值    * `SELF_MANAGED` - 基于部署需求，用户需要提前手动创建委托，既包含管理账号给RFS的委托，也包含成员账号创建给管理账号的委托。如果委托不存在或错误，创建资源栈集不会失败，部署资源栈集或部署资源栈实例的时候才会报错。
     * @return permissionModel
     */
    public PermissionModelEnum getPermissionModel() {
        return permissionModel;
    }

    public void setPermissionModel(PermissionModelEnum permissionModel) {
        this.permissionModel = permissionModel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionModelPrimitiveTypeHolder that = (PermissionModelPrimitiveTypeHolder) obj;
        return Objects.equals(this.permissionModel, that.permissionModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionModel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionModelPrimitiveTypeHolder {\n");
        sb.append("    permissionModel: ").append(toIndentedString(permissionModel)).append("\n");
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
