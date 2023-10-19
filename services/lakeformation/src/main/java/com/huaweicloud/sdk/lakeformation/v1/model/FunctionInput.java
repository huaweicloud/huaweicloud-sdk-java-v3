package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 函数信息
 */
public class FunctionInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_name")

    private String functionName;

    /**
     * 函数类型，JAVA
     */
    public static final class FunctionTypeEnum {

        /**
         * Enum JAVA for value: "JAVA"
         */
        public static final FunctionTypeEnum JAVA = new FunctionTypeEnum("JAVA");

        private static final Map<String, FunctionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FunctionTypeEnum> createStaticFields() {
            Map<String, FunctionTypeEnum> map = new HashMap<>();
            map.put("JAVA", JAVA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FunctionTypeEnum(String value) {
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
        public static FunctionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FunctionTypeEnum(value));
        }

        public static FunctionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FunctionTypeEnum) {
                return this.value.equals(((FunctionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_type")

    private FunctionTypeEnum functionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    /**
     * 所有者类型，USER-用户,GROUP-组,ROLE-角色
     */
    public static final class OwnerTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final OwnerTypeEnum USER = new OwnerTypeEnum("USER");

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final OwnerTypeEnum GROUP = new OwnerTypeEnum("GROUP");

        /**
         * Enum ROLE for value: "ROLE"
         */
        public static final OwnerTypeEnum ROLE = new OwnerTypeEnum("ROLE");

        private static final Map<String, OwnerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OwnerTypeEnum> createStaticFields() {
            Map<String, OwnerTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("GROUP", GROUP);
            map.put("ROLE", ROLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OwnerTypeEnum(String value) {
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
        public static OwnerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OwnerTypeEnum(value));
        }

        public static OwnerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OwnerTypeEnum) {
                return this.value.equals(((OwnerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_type")

    private OwnerTypeEnum ownerType;

    /**
     * 所有者授权来源类型,IAM-云,SAML-联邦,LDAP-ld用户,LOCAL-本地,AGENTTENANT-委托,OTHER-其它
     */
    public static final class OwnerAuthSourceTypeEnum {

        /**
         * Enum IAM for value: "IAM"
         */
        public static final OwnerAuthSourceTypeEnum IAM = new OwnerAuthSourceTypeEnum("IAM");

        /**
         * Enum SAML for value: "SAML"
         */
        public static final OwnerAuthSourceTypeEnum SAML = new OwnerAuthSourceTypeEnum("SAML");

        /**
         * Enum LDAP for value: "LDAP"
         */
        public static final OwnerAuthSourceTypeEnum LDAP = new OwnerAuthSourceTypeEnum("LDAP");

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final OwnerAuthSourceTypeEnum LOCAL = new OwnerAuthSourceTypeEnum("LOCAL");

        /**
         * Enum AGENTTENANT for value: "AGENTTENANT"
         */
        public static final OwnerAuthSourceTypeEnum AGENTTENANT = new OwnerAuthSourceTypeEnum("AGENTTENANT");

        /**
         * Enum OTHER for value: "OTHER"
         */
        public static final OwnerAuthSourceTypeEnum OTHER = new OwnerAuthSourceTypeEnum("OTHER");

        private static final Map<String, OwnerAuthSourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OwnerAuthSourceTypeEnum> createStaticFields() {
            Map<String, OwnerAuthSourceTypeEnum> map = new HashMap<>();
            map.put("IAM", IAM);
            map.put("SAML", SAML);
            map.put("LDAP", LDAP);
            map.put("LOCAL", LOCAL);
            map.put("AGENTTENANT", AGENTTENANT);
            map.put("OTHER", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OwnerAuthSourceTypeEnum(String value) {
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
        public static OwnerAuthSourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OwnerAuthSourceTypeEnum(value));
        }

        public static OwnerAuthSourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OwnerAuthSourceTypeEnum) {
                return this.value.equals(((OwnerAuthSourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_auth_source_type")

    private OwnerAuthSourceTypeEnum ownerAuthSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "class_name")

    private String className;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_uris")

    private List<FunctionResourceUri> resourceUris = null;

    public FunctionInput withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * 函数名称。只能包含字母、数字和下划线，且长度为1~256个字符。
     * @return functionName
     */
    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public FunctionInput withFunctionType(FunctionTypeEnum functionType) {
        this.functionType = functionType;
        return this;
    }

    /**
     * 函数类型，JAVA
     * @return functionType
     */
    public FunctionTypeEnum getFunctionType() {
        return functionType;
    }

    public void setFunctionType(FunctionTypeEnum functionType) {
        this.functionType = functionType;
    }

    public FunctionInput withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 函数所有者。只能包含字母、数字和下划线，且长度为1~256个字符。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public FunctionInput withOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * 所有者类型，USER-用户,GROUP-组,ROLE-角色
     * @return ownerType
     */
    public OwnerTypeEnum getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
    }

    public FunctionInput withOwnerAuthSourceType(OwnerAuthSourceTypeEnum ownerAuthSourceType) {
        this.ownerAuthSourceType = ownerAuthSourceType;
        return this;
    }

    /**
     * 所有者授权来源类型,IAM-云,SAML-联邦,LDAP-ld用户,LOCAL-本地,AGENTTENANT-委托,OTHER-其它
     * @return ownerAuthSourceType
     */
    public OwnerAuthSourceTypeEnum getOwnerAuthSourceType() {
        return ownerAuthSourceType;
    }

    public void setOwnerAuthSourceType(OwnerAuthSourceTypeEnum ownerAuthSourceType) {
        this.ownerAuthSourceType = ownerAuthSourceType;
    }

    public FunctionInput withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * 函数类名。长度为1~4000个字符。
     * @return className
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public FunctionInput withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间格式为yyyy-mm-ddThh:mm:sss
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public FunctionInput withResourceUris(List<FunctionResourceUri> resourceUris) {
        this.resourceUris = resourceUris;
        return this;
    }

    public FunctionInput addResourceUrisItem(FunctionResourceUri resourceUrisItem) {
        if (this.resourceUris == null) {
            this.resourceUris = new ArrayList<>();
        }
        this.resourceUris.add(resourceUrisItem);
        return this;
    }

    public FunctionInput withResourceUris(Consumer<List<FunctionResourceUri>> resourceUrisSetter) {
        if (this.resourceUris == null) {
            this.resourceUris = new ArrayList<>();
        }
        resourceUrisSetter.accept(this.resourceUris);
        return this;
    }

    /**
     * 函数地址信息
     * @return resourceUris
     */
    public List<FunctionResourceUri> getResourceUris() {
        return resourceUris;
    }

    public void setResourceUris(List<FunctionResourceUri> resourceUris) {
        this.resourceUris = resourceUris;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FunctionInput that = (FunctionInput) obj;
        return Objects.equals(this.functionName, that.functionName)
            && Objects.equals(this.functionType, that.functionType) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.ownerType, that.ownerType)
            && Objects.equals(this.ownerAuthSourceType, that.ownerAuthSourceType)
            && Objects.equals(this.className, that.className) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.resourceUris, that.resourceUris);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionName,
            functionType,
            owner,
            ownerType,
            ownerAuthSourceType,
            className,
            createTime,
            resourceUris);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionInput {\n");
        sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
        sb.append("    functionType: ").append(toIndentedString(functionType)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    ownerAuthSourceType: ").append(toIndentedString(ownerAuthSourceType)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    resourceUris: ").append(toIndentedString(resourceUris)).append("\n");
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
