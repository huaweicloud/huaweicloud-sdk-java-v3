package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Request Object */
public class ListHostsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "as_proxy")

    private Boolean asProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    /** 排序方式,默认为：DESC */
    public static final class SortDirEnum {

        /** Enum DESC for value: "DESC" */
        public static final SortDirEnum DESC = new SortDirEnum("DESC");

        /** Enum ASC for value: "ASC" */
        public static final SortDirEnum ASC = new SortDirEnum("ASC");

        private static final Map<String, SortDirEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortDirEnum> createStaticFields() {
            Map<String, SortDirEnum> map = new HashMap<>();
            map.put("DESC", DESC);
            map.put("ASC", ASC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortDirEnum(String value) {
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
        public static SortDirEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SortDirEnum(value);
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SortDirEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private SortDirEnum sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_auth")

    private Boolean withAuth;

    public ListHostsRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 主机组id
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListHostsRequest withAsProxy(Boolean asProxy) {
        this.asProxy = asProxy;
        return this;
    }

    /** 是否为代理机
     * 
     * @return asProxy */
    public Boolean getAsProxy() {
        return asProxy;
    }

    public void setAsProxy(Boolean asProxy) {
        this.asProxy = asProxy;
    }

    public ListHostsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量,表示从此偏移量开始查询,offset大于等于0 minimum: 0
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListHostsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量，默认为1000 minimum: 1 maximum: 1000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListHostsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /** 主机名，可输入中英文，数字和符号(-_.)
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListHostsRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /** 排序字段，支持：AS_PROXY|HOST_NAME|OS|OWNER_NAME|as_proxy|host_name|os|owner_name|nickName。不填默认为：as_proxy
     * 
     * @return sortKey */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListHostsRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /** 排序方式,默认为：DESC
     * 
     * @return sortDir */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    public ListHostsRequest withWithAuth(Boolean withAuth) {
        this.withAuth = withAuth;
        return this;
    }

    /** 返回结果是否加密
     * 
     * @return withAuth */
    public Boolean getWithAuth() {
        return withAuth;
    }

    public void setWithAuth(Boolean withAuth) {
        this.withAuth = withAuth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHostsRequest listHostsRequest = (ListHostsRequest) o;
        return Objects.equals(this.groupId, listHostsRequest.groupId)
            && Objects.equals(this.asProxy, listHostsRequest.asProxy)
            && Objects.equals(this.offset, listHostsRequest.offset)
            && Objects.equals(this.limit, listHostsRequest.limit) && Objects.equals(this.name, listHostsRequest.name)
            && Objects.equals(this.sortKey, listHostsRequest.sortKey)
            && Objects.equals(this.sortDir, listHostsRequest.sortDir)
            && Objects.equals(this.withAuth, listHostsRequest.withAuth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, asProxy, offset, limit, name, sortKey, sortDir, withAuth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostsRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    asProxy: ").append(toIndentedString(asProxy)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    withAuth: ").append(toIndentedString(withAuth)).append("\n");
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
