package com.huaweicloud.sdk.live.v1.model;

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
 * 查询medialive维度(medialive_mpc、medialive_cdn、medialive_package、medialive_connect、medialive_tailor) medialive_mpc维度可以查询实例下的pipeline实例及pipeline下的音频实例
 */
public class ListCesInstanceRequestBody {

    /**
     * 命名空间
     */
    public static final class NamespaceEnum {

        /**
         * Enum SYS_LIVE for value: "SYS.LIVE"
         */
        public static final NamespaceEnum SYS_LIVE = new NamespaceEnum("SYS.LIVE");

        private static final Map<String, NamespaceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NamespaceEnum> createStaticFields() {
            Map<String, NamespaceEnum> map = new HashMap<>();
            map.put("SYS.LIVE", SYS_LIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NamespaceEnum(String value) {
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
        public static NamespaceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NamespaceEnum(value));
        }

        public static NamespaceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NamespaceEnum) {
                return this.value.equals(((NamespaceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private NamespaceEnum namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private List<ListCesInstanceRequestBodyQuery> query = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Integer start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListCesInstanceRequestBody withNamespace(NamespaceEnum namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public NamespaceEnum getNamespace() {
        return namespace;
    }

    public void setNamespace(NamespaceEnum namespace) {
        this.namespace = namespace;
    }

    public ListCesInstanceRequestBody withQuery(List<ListCesInstanceRequestBodyQuery> query) {
        this.query = query;
        return this;
    }

    public ListCesInstanceRequestBody addQueryItem(ListCesInstanceRequestBodyQuery queryItem) {
        if (this.query == null) {
            this.query = new ArrayList<>();
        }
        this.query.add(queryItem);
        return this;
    }

    public ListCesInstanceRequestBody withQuery(Consumer<List<ListCesInstanceRequestBodyQuery>> querySetter) {
        if (this.query == null) {
            this.query = new ArrayList<>();
        }
        querySetter.accept(this.query);
        return this;
    }

    /**
     * 查询信息
     * @return query
     */
    public List<ListCesInstanceRequestBodyQuery> getQuery() {
        return query;
    }

    public void setQuery(List<ListCesInstanceRequestBodyQuery> query) {
        this.query = query;
    }

    public ListCesInstanceRequestBody withStart(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * 查询开始偏移
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public ListCesInstanceRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询限制
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCesInstanceRequestBody that = (ListCesInstanceRequestBody) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.query, that.query)
            && Objects.equals(this.start, that.start) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, query, start, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCesInstanceRequestBody {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
