package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
 * **参数解释**: SQL采集类型列表。默认取值[]，表示采集所有SQL语句。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
 */
public class SqlTypeConfigOption {

    /**
     * **参数解释**: SQL类型的归类名称。 **约束限制**: - 对常用SQL类型，简单归类为6个类别，每个类别对应一组固定的采集SQL语句类型列表，采用前缀进行匹配。 - 对于其他场景，可以使用自定义类别，允许按需自定义采集SQL的语句前缀。  **取值范围**: - all：不区分SQL类型，全部采集。 - ddl：只采集DDL语句类别，包含如下SQL语句类型： create, alter, drop, truncate, reindex, vacuum, analyze, declare, move, close。 - dml：只采集DML语句类型，包含如下SQL语句类型： insert, update, delete, merge, show, explain, prepare, lock, copy, execute, deallocate。 - dcl：只采集DCL语句类型，包含如下SQL语句类型： grant, revoke, reassign, set。 - tcl：只采集TCL语句类型，包含如下SQL语句类型： begin, commit, rollback, start, savepoint, checkpoint, release savepoint。 - dql：只采集DQL语句类型，包含如下SQL语句类型： select。 - custom：采集自定义语句类型。需在prefixes字段中，填写要采集的SQL语句前缀片段。  **默认取值**: 不涉及。
     */
    public static final class CategoryEnum {

        /**
         * Enum ALL for value: "all"
         */
        public static final CategoryEnum ALL = new CategoryEnum("all");

        /**
         * Enum DDL for value: "ddl"
         */
        public static final CategoryEnum DDL = new CategoryEnum("ddl");

        /**
         * Enum DML for value: "dml"
         */
        public static final CategoryEnum DML = new CategoryEnum("dml");

        /**
         * Enum DCL for value: "dcl"
         */
        public static final CategoryEnum DCL = new CategoryEnum("dcl");

        /**
         * Enum TCL for value: "tcl"
         */
        public static final CategoryEnum TCL = new CategoryEnum("tcl");

        /**
         * Enum DQL for value: "dql"
         */
        public static final CategoryEnum DQL = new CategoryEnum("dql");

        /**
         * Enum CUSTOM for value: "custom"
         */
        public static final CategoryEnum CUSTOM = new CategoryEnum("custom");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("all", ALL);
            map.put("ddl", DDL);
            map.put("dml", DML);
            map.put("dcl", DCL);
            map.put("tcl", TCL);
            map.put("dql", DQL);
            map.put("custom", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefixes")

    private List<String> prefixes = null;

    public SqlTypeConfigOption withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**: SQL类型的归类名称。 **约束限制**: - 对常用SQL类型，简单归类为6个类别，每个类别对应一组固定的采集SQL语句类型列表，采用前缀进行匹配。 - 对于其他场景，可以使用自定义类别，允许按需自定义采集SQL的语句前缀。  **取值范围**: - all：不区分SQL类型，全部采集。 - ddl：只采集DDL语句类别，包含如下SQL语句类型： create, alter, drop, truncate, reindex, vacuum, analyze, declare, move, close。 - dml：只采集DML语句类型，包含如下SQL语句类型： insert, update, delete, merge, show, explain, prepare, lock, copy, execute, deallocate。 - dcl：只采集DCL语句类型，包含如下SQL语句类型： grant, revoke, reassign, set。 - tcl：只采集TCL语句类型，包含如下SQL语句类型： begin, commit, rollback, start, savepoint, checkpoint, release savepoint。 - dql：只采集DQL语句类型，包含如下SQL语句类型： select。 - custom：采集自定义语句类型。需在prefixes字段中，填写要采集的SQL语句前缀片段。  **默认取值**: 不涉及。
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public SqlTypeConfigOption withPrefixes(List<String> prefixes) {
        this.prefixes = prefixes;
        return this;
    }

    public SqlTypeConfigOption addPrefixesItem(String prefixesItem) {
        if (this.prefixes == null) {
            this.prefixes = new ArrayList<>();
        }
        this.prefixes.add(prefixesItem);
        return this;
    }

    public SqlTypeConfigOption withPrefixes(Consumer<List<String>> prefixesSetter) {
        if (this.prefixes == null) {
            this.prefixes = new ArrayList<>();
        }
        prefixesSetter.accept(this.prefixes);
        return this;
    }

    /**
     * **参数解释**: 针对custom自定义类别，指定要采集的SQL语句类型的列表，默认取值为[]。采集过程中，采用前缀方式对SQL文本进行匹配。 **约束限制**: - category取值custom时，此参数必填，不可为空。 - category取值其他类别时，此参数忽略。
     * @return prefixes
     */
    public List<String> getPrefixes() {
        return prefixes;
    }

    public void setPrefixes(List<String> prefixes) {
        this.prefixes = prefixes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlTypeConfigOption that = (SqlTypeConfigOption) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.prefixes, that.prefixes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, prefixes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlTypeConfigOption {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    prefixes: ").append(toIndentedString(prefixes)).append("\n");
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
