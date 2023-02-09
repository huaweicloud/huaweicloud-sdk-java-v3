package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ListInterfacesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    /**
     * 元数据资源类型
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum CATALOG for value: "CATALOG"
         */
        public static final ResourceTypeEnum CATALOG = new ResourceTypeEnum("CATALOG");

        /**
         * Enum DATABASE for value: "DATABASE"
         */
        public static final ResourceTypeEnum DATABASE = new ResourceTypeEnum("DATABASE");

        /**
         * Enum TABLE for value: "TABLE"
         */
        public static final ResourceTypeEnum TABLE = new ResourceTypeEnum("TABLE");

        /**
         * Enum FUNC for value: "FUNC"
         */
        public static final ResourceTypeEnum FUNC = new ResourceTypeEnum("FUNC");

        /**
         * Enum MODEL for value: "MODEL"
         */
        public static final ResourceTypeEnum MODEL = new ResourceTypeEnum("MODEL");

        /**
         * Enum COLUMN for value: "COLUMN"
         */
        public static final ResourceTypeEnum COLUMN = new ResourceTypeEnum("COLUMN");

        /**
         * Enum URI for value: "URI"
         */
        public static final ResourceTypeEnum URI = new ResourceTypeEnum("URI");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("CATALOG", CATALOG);
            map.put("DATABASE", DATABASE);
            map.put("TABLE", TABLE);
            map.put("FUNC", FUNC);
            map.put("MODEL", MODEL);
            map.put("COLUMN", COLUMN);
            map.put("URI", URI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    /**
     * 授权主体来源
     */
    public static final class PrincipalSourceEnum {

        /**
         * Enum IAM for value: "IAM"
         */
        public static final PrincipalSourceEnum IAM = new PrincipalSourceEnum("IAM");

        /**
         * Enum SAML for value: "SAML"
         */
        public static final PrincipalSourceEnum SAML = new PrincipalSourceEnum("SAML");

        /**
         * Enum LDAP for value: "LDAP"
         */
        public static final PrincipalSourceEnum LDAP = new PrincipalSourceEnum("LDAP");

        /**
         * Enum LOCAL for value: "LOCAL"
         */
        public static final PrincipalSourceEnum LOCAL = new PrincipalSourceEnum("LOCAL");

        private static final Map<String, PrincipalSourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrincipalSourceEnum> createStaticFields() {
            Map<String, PrincipalSourceEnum> map = new HashMap<>();
            map.put("IAM", IAM);
            map.put("SAML", SAML);
            map.put("LDAP", LDAP);
            map.put("LOCAL", LOCAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrincipalSourceEnum(String value) {
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
        public static PrincipalSourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PrincipalSourceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PrincipalSourceEnum(value);
            }
            return result;
        }

        public static PrincipalSourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PrincipalSourceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrincipalSourceEnum) {
                return this.value.equals(((PrincipalSourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_source")

    private PrincipalSourceEnum principalSource;

    /**
     * 授权主体类型
     */
    public static final class PrincipalTypeEnum {

        /**
         * Enum USER for value: "USER"
         */
        public static final PrincipalTypeEnum USER = new PrincipalTypeEnum("USER");

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final PrincipalTypeEnum GROUP = new PrincipalTypeEnum("GROUP");

        /**
         * Enum ROLE for value: "ROLE"
         */
        public static final PrincipalTypeEnum ROLE = new PrincipalTypeEnum("ROLE");

        /**
         * Enum SHARE for value: "SHARE"
         */
        public static final PrincipalTypeEnum SHARE = new PrincipalTypeEnum("SHARE");

        /**
         * Enum OTHER for value: "OTHER"
         */
        public static final PrincipalTypeEnum OTHER = new PrincipalTypeEnum("OTHER");

        private static final Map<String, PrincipalTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PrincipalTypeEnum> createStaticFields() {
            Map<String, PrincipalTypeEnum> map = new HashMap<>();
            map.put("USER", USER);
            map.put("GROUP", GROUP);
            map.put("ROLE", ROLE);
            map.put("SHARE", SHARE);
            map.put("OTHER", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PrincipalTypeEnum(String value) {
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
        public static PrincipalTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PrincipalTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PrincipalTypeEnum(value);
            }
            return result;
        }

        public static PrincipalTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PrincipalTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PrincipalTypeEnum) {
                return this.value.equals(((PrincipalTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_type")

    private PrincipalTypeEnum principalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "principal_name")

    private String principalName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListInterfacesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * instance id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInterfacesRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * expression
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public ListInterfacesRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 元数据资源全名
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListInterfacesRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 元数据资源类型
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ListInterfacesRequest withPrincipalSource(PrincipalSourceEnum principalSource) {
        this.principalSource = principalSource;
        return this;
    }

    /**
     * 授权主体来源
     * @return principalSource
     */
    public PrincipalSourceEnum getPrincipalSource() {
        return principalSource;
    }

    public void setPrincipalSource(PrincipalSourceEnum principalSource) {
        this.principalSource = principalSource;
    }

    public ListInterfacesRequest withPrincipalType(PrincipalTypeEnum principalType) {
        this.principalType = principalType;
        return this;
    }

    /**
     * 授权主体类型
     * @return principalType
     */
    public PrincipalTypeEnum getPrincipalType() {
        return principalType;
    }

    public void setPrincipalType(PrincipalTypeEnum principalType) {
        this.principalType = principalType;
    }

    public ListInterfacesRequest withPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }

    /**
     * 授权主体名称
     * @return principalName
     */
    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public ListInterfacesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit
     * minimum: 1
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListInterfacesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * page token
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInterfacesRequest listInterfacesRequest = (ListInterfacesRequest) o;
        return Objects.equals(this.instanceId, listInterfacesRequest.instanceId)
            && Objects.equals(this.filter, listInterfacesRequest.filter)
            && Objects.equals(this.resourceName, listInterfacesRequest.resourceName)
            && Objects.equals(this.resourceType, listInterfacesRequest.resourceType)
            && Objects.equals(this.principalSource, listInterfacesRequest.principalSource)
            && Objects.equals(this.principalType, listInterfacesRequest.principalType)
            && Objects.equals(this.principalName, listInterfacesRequest.principalName)
            && Objects.equals(this.limit, listInterfacesRequest.limit)
            && Objects.equals(this.marker, listInterfacesRequest.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            filter,
            resourceName,
            resourceType,
            principalSource,
            principalType,
            principalName,
            limit,
            marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInterfacesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    principalSource: ").append(toIndentedString(principalSource)).append("\n");
        sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
        sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
