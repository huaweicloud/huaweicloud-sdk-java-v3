package com.huaweicloud.sdk.meeting.v1.model;

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
 * ModDeptDTO
 */
public class ModDeptDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parentDeptCode")

    private String parentDeptCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private String note;

    /**
     * 其他用户对该部门下用户的访问权限： - UNLIMITED：默认，不做限制 - OPEN：公开，其他部门都可访问（无论对方权限如何配置） - CLOSE：隐藏，其他部门不可访问（暂未实现） - DESIGNATED_DEPARTMENT：指定部门能访问（暂未实现）
     */
    public static final class InPermissionEnum {

        /**
         * Enum UNLIMITED for value: "UNLIMITED"
         */
        public static final InPermissionEnum UNLIMITED = new InPermissionEnum("UNLIMITED");

        /**
         * Enum OPEN for value: "OPEN"
         */
        public static final InPermissionEnum OPEN = new InPermissionEnum("OPEN");

        /**
         * Enum CLOSE for value: "CLOSE"
         */
        public static final InPermissionEnum CLOSE = new InPermissionEnum("CLOSE");

        /**
         * Enum DESIGNATED_DEPARTMENT for value: "DESIGNATED_DEPARTMENT"
         */
        public static final InPermissionEnum DESIGNATED_DEPARTMENT = new InPermissionEnum("DESIGNATED_DEPARTMENT");

        private static final Map<String, InPermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InPermissionEnum> createStaticFields() {
            Map<String, InPermissionEnum> map = new HashMap<>();
            map.put("UNLIMITED", UNLIMITED);
            map.put("OPEN", OPEN);
            map.put("CLOSE", CLOSE);
            map.put("DESIGNATED_DEPARTMENT", DESIGNATED_DEPARTMENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InPermissionEnum(String value) {
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
        public static InPermissionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InPermissionEnum(value));
        }

        public static InPermissionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InPermissionEnum) {
                return this.value.equals(((InPermissionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inPermission")

    private InPermissionEnum inPermission;

    /**
     * 该部门下用户访问权限控制。 - UNLIMITED：不限制 - ONLY_SELF：仅能查询自己 - SELF_AND_CHILD_DEPARTMENT：该部门下用户能查询本部门及子部门通讯 - DESIGNATED_DEPARTMENT：该部门下用户能查询指定部门通讯录
     */
    public static final class OutPermissionEnum {

        /**
         * Enum UNLIMITED for value: "UNLIMITED"
         */
        public static final OutPermissionEnum UNLIMITED = new OutPermissionEnum("UNLIMITED");

        /**
         * Enum ONLY_SELF for value: "ONLY_SELF"
         */
        public static final OutPermissionEnum ONLY_SELF = new OutPermissionEnum("ONLY_SELF");

        /**
         * Enum SELF_AND_CHILD_DEPARTMENT for value: "SELF_AND_CHILD_DEPARTMENT"
         */
        public static final OutPermissionEnum SELF_AND_CHILD_DEPARTMENT =
            new OutPermissionEnum("SELF_AND_CHILD_DEPARTMENT");

        /**
         * Enum DESIGNATED_DEPARTMENT for value: "DESIGNATED_DEPARTMENT"
         */
        public static final OutPermissionEnum DESIGNATED_DEPARTMENT = new OutPermissionEnum("DESIGNATED_DEPARTMENT");

        private static final Map<String, OutPermissionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OutPermissionEnum> createStaticFields() {
            Map<String, OutPermissionEnum> map = new HashMap<>();
            map.put("UNLIMITED", UNLIMITED);
            map.put("ONLY_SELF", ONLY_SELF);
            map.put("SELF_AND_CHILD_DEPARTMENT", SELF_AND_CHILD_DEPARTMENT);
            map.put("DESIGNATED_DEPARTMENT", DESIGNATED_DEPARTMENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OutPermissionEnum(String value) {
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
        public static OutPermissionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OutPermissionEnum(value));
        }

        public static OutPermissionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OutPermissionEnum) {
                return this.value.equals(((OutPermissionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outPermission")

    private OutPermissionEnum outPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "designatedOutDeptCodes")

    private List<String> designatedOutDeptCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortLevel")

    private Integer sortLevel;

    public ModDeptDTO withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 部门名称。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public ModDeptDTO withParentDeptCode(String parentDeptCode) {
        this.parentDeptCode = parentDeptCode;
        return this;
    }

    /**
     * 父部门编码。
     * @return parentDeptCode
     */
    public String getParentDeptCode() {
        return parentDeptCode;
    }

    public void setParentDeptCode(String parentDeptCode) {
        this.parentDeptCode = parentDeptCode;
    }

    public ModDeptDTO withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * 备注。
     * @return note
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ModDeptDTO withInPermission(InPermissionEnum inPermission) {
        this.inPermission = inPermission;
        return this;
    }

    /**
     * 其他用户对该部门下用户的访问权限： - UNLIMITED：默认，不做限制 - OPEN：公开，其他部门都可访问（无论对方权限如何配置） - CLOSE：隐藏，其他部门不可访问（暂未实现） - DESIGNATED_DEPARTMENT：指定部门能访问（暂未实现）
     * @return inPermission
     */
    public InPermissionEnum getInPermission() {
        return inPermission;
    }

    public void setInPermission(InPermissionEnum inPermission) {
        this.inPermission = inPermission;
    }

    public ModDeptDTO withOutPermission(OutPermissionEnum outPermission) {
        this.outPermission = outPermission;
        return this;
    }

    /**
     * 该部门下用户访问权限控制。 - UNLIMITED：不限制 - ONLY_SELF：仅能查询自己 - SELF_AND_CHILD_DEPARTMENT：该部门下用户能查询本部门及子部门通讯 - DESIGNATED_DEPARTMENT：该部门下用户能查询指定部门通讯录
     * @return outPermission
     */
    public OutPermissionEnum getOutPermission() {
        return outPermission;
    }

    public void setOutPermission(OutPermissionEnum outPermission) {
        this.outPermission = outPermission;
    }

    public ModDeptDTO withDesignatedOutDeptCodes(List<String> designatedOutDeptCodes) {
        this.designatedOutDeptCodes = designatedOutDeptCodes;
        return this;
    }

    public ModDeptDTO addDesignatedOutDeptCodesItem(String designatedOutDeptCodesItem) {
        if (this.designatedOutDeptCodes == null) {
            this.designatedOutDeptCodes = new ArrayList<>();
        }
        this.designatedOutDeptCodes.add(designatedOutDeptCodesItem);
        return this;
    }

    public ModDeptDTO withDesignatedOutDeptCodes(Consumer<List<String>> designatedOutDeptCodesSetter) {
        if (this.designatedOutDeptCodes == null) {
            this.designatedOutDeptCodes = new ArrayList<>();
        }
        designatedOutDeptCodesSetter.accept(this.designatedOutDeptCodes);
        return this;
    }

    /**
     * 允许访问的部门列表,仅outPermission为DESIGNATED_DEPARTMENT时有效，最多支持配置150个部门。
     * @return designatedOutDeptCodes
     */
    public List<String> getDesignatedOutDeptCodes() {
        return designatedOutDeptCodes;
    }

    public void setDesignatedOutDeptCodes(List<String> designatedOutDeptCodes) {
        this.designatedOutDeptCodes = designatedOutDeptCodes;
    }

    public ModDeptDTO withSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
        return this;
    }

    /**
     * 部门排序号，序号越小,部门排序越靠前。
     * minimum: 1
     * maximum: 10000
     * @return sortLevel
     */
    public Integer getSortLevel() {
        return sortLevel;
    }

    public void setSortLevel(Integer sortLevel) {
        this.sortLevel = sortLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModDeptDTO that = (ModDeptDTO) obj;
        return Objects.equals(this.deptName, that.deptName) && Objects.equals(this.parentDeptCode, that.parentDeptCode)
            && Objects.equals(this.note, that.note) && Objects.equals(this.inPermission, that.inPermission)
            && Objects.equals(this.outPermission, that.outPermission)
            && Objects.equals(this.designatedOutDeptCodes, that.designatedOutDeptCodes)
            && Objects.equals(this.sortLevel, that.sortLevel);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(deptName, parentDeptCode, note, inPermission, outPermission, designatedOutDeptCodes, sortLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModDeptDTO {\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    parentDeptCode: ").append(toIndentedString(parentDeptCode)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    inPermission: ").append(toIndentedString(inPermission)).append("\n");
        sb.append("    outPermission: ").append(toIndentedString(outPermission)).append("\n");
        sb.append("    designatedOutDeptCodes: ").append(toIndentedString(designatedOutDeptCodes)).append("\n");
        sb.append("    sortLevel: ").append(toIndentedString(sortLevel)).append("\n");
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
