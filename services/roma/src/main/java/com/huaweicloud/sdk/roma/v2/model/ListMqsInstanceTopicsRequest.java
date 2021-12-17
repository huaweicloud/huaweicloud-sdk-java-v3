package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListMqsInstanceTopicsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** 权限类型。 - all：发布+订阅 - pub：发布 - sub：订阅 */
    public static final class AccessPolicyEnum {

        /** Enum ALL for value: "all" */
        public static final AccessPolicyEnum ALL = new AccessPolicyEnum("all");

        /** Enum PUB for value: "pub" */
        public static final AccessPolicyEnum PUB = new AccessPolicyEnum("pub");

        /** Enum SUB for value: "sub" */
        public static final AccessPolicyEnum SUB = new AccessPolicyEnum("sub");

        private static final Map<String, AccessPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessPolicyEnum> createStaticFields() {
            Map<String, AccessPolicyEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("pub", PUB);
            map.put("sub", SUB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessPolicyEnum(String value) {
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
        public static AccessPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AccessPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AccessPolicyEnum(value);
            }
            return result;
        }

        public static AccessPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AccessPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessPolicyEnum) {
                return this.value.equals(((AccessPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policy")

    private AccessPolicyEnum accessPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    public ListMqsInstanceTopicsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID。
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListMqsInstanceTopicsRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /** 应用名称。
     * 
     * @return appName */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ListMqsInstanceTopicsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** Topic名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListMqsInstanceTopicsRequest withAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /** 权限类型。 - all：发布+订阅 - pub：发布 - sub：订阅
     * 
     * @return accessPolicy */
    public AccessPolicyEnum getAccessPolicy() {
        return accessPolicy;
    }

    public void setAccessPolicy(AccessPolicyEnum accessPolicy) {
        this.accessPolicy = accessPolicy;
    }

    public ListMqsInstanceTopicsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /** 分页查询大小。默认查询所有的topic。
     * 
     * @return limit */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListMqsInstanceTopicsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /** 分页查询的偏移量。默认值是0。
     * 
     * @return offset */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMqsInstanceTopicsRequest listMqsInstanceTopicsRequest = (ListMqsInstanceTopicsRequest) o;
        return Objects.equals(this.instanceId, listMqsInstanceTopicsRequest.instanceId)
            && Objects.equals(this.appName, listMqsInstanceTopicsRequest.appName)
            && Objects.equals(this.name, listMqsInstanceTopicsRequest.name)
            && Objects.equals(this.accessPolicy, listMqsInstanceTopicsRequest.accessPolicy)
            && Objects.equals(this.limit, listMqsInstanceTopicsRequest.limit)
            && Objects.equals(this.offset, listMqsInstanceTopicsRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, appName, name, accessPolicy, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMqsInstanceTopicsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    accessPolicy: ").append(toIndentedString(accessPolicy)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
