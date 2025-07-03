package com.huaweicloud.sdk.swr.v2.model;

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
public class ListSharedRepoDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * self: 我共享的镜像。thirdparty: 他人共享给我的镜像
     */
    public static final class SharedByEnum {

        /**
         * Enum SELF for value: "self"
         */
        public static final SharedByEnum SELF = new SharedByEnum("self");

        /**
         * Enum THIRDPARTY for value: "thirdparty"
         */
        public static final SharedByEnum THIRDPARTY = new SharedByEnum("thirdparty");

        private static final Map<String, SharedByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SharedByEnum> createStaticFields() {
            Map<String, SharedByEnum> map = new HashMap<>();
            map.put("self", SELF);
            map.put("thirdparty", THIRDPARTY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SharedByEnum(String value) {
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
        public static SharedByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SharedByEnum(value));
        }

        public static SharedByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SharedByEnum) {
                return this.value.equals(((SharedByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_by")

    private SharedByEnum sharedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private Long marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    public ListSharedRepoDetailsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 组织名称。小写字母开头，后面跟小写字母、数字、小数点、下划线或中划线（其中下划线最多允许连续两个，小数点、下划线、中划线不能直接相连），小写字母或数字结尾，1-64个字符。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListSharedRepoDetailsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像仓库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSharedRepoDetailsRequest withSharedBy(SharedByEnum sharedBy) {
        this.sharedBy = sharedBy;
        return this;
    }

    /**
     * self: 我共享的镜像。thirdparty: 他人共享给我的镜像
     * @return sharedBy
     */
    public SharedByEnum getSharedBy() {
        return sharedBy;
    }

    public void setSharedBy(SharedByEnum sharedBy) {
        this.sharedBy = sharedBy;
    }

    public ListSharedRepoDetailsRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回条数,默认返回100条记录，最多返回1000条。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListSharedRepoDetailsRequest withMarker(Long marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询时下一次查询的起始地址。
     * @return marker
     */
    public Long getMarker() {
        return marker;
    }

    public void setMarker(Long marker) {
        this.marker = marker;
    }

    public ListSharedRepoDetailsRequest withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 查询他人共享给我的镜像是否已过期 false：共享已过期。true：正常
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSharedRepoDetailsRequest that = (ListSharedRepoDetailsRequest) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.name, that.name)
            && Objects.equals(this.sharedBy, that.sharedBy) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, name, sharedBy, limit, marker, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSharedRepoDetailsRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sharedBy: ").append(toIndentedString(sharedBy)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
