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
 * DlsAdmin
 */
public class DlsAdmin {

    /**
     * 管理员类型, USER:用户, USER_GROUP:用户组
     */
    public static final class ManagerTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final ManagerTypeEnum USER = new ManagerTypeEnum("USER");

        /**
         * Enum USER_GROUP for value: "USER_GROUP"
         */
        public static final ManagerTypeEnum USER_GROUP = new ManagerTypeEnum("USER_GROUP");

        private static final Map<String, ManagerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ManagerTypeEnum> createStaticFields() {
            Map<String, ManagerTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("USER_GROUP", USER_GROUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ManagerTypeEnum(String value) {
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
        public static ManagerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ManagerTypeEnum(value));
        }

        public static ManagerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ManagerTypeEnum) {
                return this.value.equals(((ManagerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_type")

    private ManagerTypeEnum managerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_id")

    private String managerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_name")

    private String managerName;

    public DlsAdmin withManagerType(ManagerTypeEnum managerType) {
        this.managerType = managerType;
        return this;
    }

    /**
     * 管理员类型, USER:用户, USER_GROUP:用户组
     * @return managerType
     */
    public ManagerTypeEnum getManagerType() {
        return managerType;
    }

    public void setManagerType(ManagerTypeEnum managerType) {
        this.managerType = managerType;
    }

    public DlsAdmin withManagerId(String managerId) {
        this.managerId = managerId;
        return this;
    }

    /**
     * 管理员id, 管理员类型为用户时, 请传入iam用户id; 管理员类型为用户组时, 请传入iam用户组id
     * @return managerId
     */
    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public DlsAdmin withManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }

    /**
     * 管理员名称, 管理员类型为用户时, 请传入iam用户名称; 管理员类型为用户组时, 请传入iam用户组名称
     * @return managerName
     */
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DlsAdmin that = (DlsAdmin) obj;
        return Objects.equals(this.managerType, that.managerType) && Objects.equals(this.managerId, that.managerId)
            && Objects.equals(this.managerName, that.managerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managerType, managerId, managerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DlsAdmin {\n");
        sb.append("    managerType: ").append(toIndentedString(managerType)).append("\n");
        sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
        sb.append("    managerName: ").append(toIndentedString(managerName)).append("\n");
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
