package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateUserGroupReq
 */
public class CreateUserGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    /**
     * 用户组类型。 * AD： AD域用户组 * LOCAL： 本地liteAs用户组
     */
    public static final class PlatformTypeEnum {

        /**
         * Enum AD for value: "AD"
         */
        public static final PlatformTypeEnum AD = new PlatformTypeEnum("AD");

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final PlatformTypeEnum LOCAL = new PlatformTypeEnum("LOCAL");

        private static final Map<String, PlatformTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlatformTypeEnum> createStaticFields() {
            Map<String, PlatformTypeEnum> map = new HashMap<>();
            map.put("AD", AD);
            map.put("LOCAL", LOCAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlatformTypeEnum(String value) {
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
        public static PlatformTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlatformTypeEnum(value));
        }

        public static PlatformTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlatformTypeEnum) {
                return this.value.equals(((PlatformTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_type")

    private PlatformTypeEnum platformType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateUserGroupReq withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 用户组名称。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public CreateUserGroupReq withPlatformType(PlatformTypeEnum platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * 用户组类型。 * AD： AD域用户组 * LOCAL： 本地liteAs用户组
     * @return platformType
     */
    public PlatformTypeEnum getPlatformType() {
        return platformType;
    }

    public void setPlatformType(PlatformTypeEnum platformType) {
        this.platformType = platformType;
    }

    public CreateUserGroupReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUserGroupReq that = (CreateUserGroupReq) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.platformType, that.platformType)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, platformType, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserGroupReq {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
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
