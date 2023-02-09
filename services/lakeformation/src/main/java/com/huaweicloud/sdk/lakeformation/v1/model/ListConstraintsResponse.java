package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListConstraintsResponse extends SdkResponse {

    /**
     * 限制类型
     */
    public static final class ConstraintTypeEnum {

        /**
         * Enum CHECK_CSTR for value: "CHECK_CSTR"
         */
        public static final ConstraintTypeEnum CHECK_CSTR = new ConstraintTypeEnum("CHECK_CSTR");

        /**
         * Enum DEFAULT_CSTR for value: "DEFAULT_CSTR"
         */
        public static final ConstraintTypeEnum DEFAULT_CSTR = new ConstraintTypeEnum("DEFAULT_CSTR");

        /**
         * Enum NOT_NULL_CSTR for value: "NOT_NULL_CSTR"
         */
        public static final ConstraintTypeEnum NOT_NULL_CSTR = new ConstraintTypeEnum("NOT_NULL_CSTR");

        /**
         * Enum UNIQUE_CSTR for value: "UNIQUE_CSTR"
         */
        public static final ConstraintTypeEnum UNIQUE_CSTR = new ConstraintTypeEnum("UNIQUE_CSTR");

        /**
         * Enum PRIMARY_KEY for value: "PRIMARY_KEY"
         */
        public static final ConstraintTypeEnum PRIMARY_KEY = new ConstraintTypeEnum("PRIMARY_KEY");

        /**
         * Enum FOREIGN_KEY for value: "FOREIGN_KEY"
         */
        public static final ConstraintTypeEnum FOREIGN_KEY = new ConstraintTypeEnum("FOREIGN_KEY");

        private static final Map<String, ConstraintTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConstraintTypeEnum> createStaticFields() {
            Map<String, ConstraintTypeEnum> map = new HashMap<>();
            map.put("CHECK_CSTR", CHECK_CSTR);
            map.put("DEFAULT_CSTR", DEFAULT_CSTR);
            map.put("NOT_NULL_CSTR", NOT_NULL_CSTR);
            map.put("UNIQUE_CSTR", UNIQUE_CSTR);
            map.put("PRIMARY_KEY", PRIMARY_KEY);
            map.put("FOREIGN_KEY", FOREIGN_KEY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConstraintTypeEnum(String value) {
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
        public static ConstraintTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConstraintTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConstraintTypeEnum(value);
            }
            return result;
        }

        public static ConstraintTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConstraintTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConstraintTypeEnum) {
                return this.value.equals(((ConstraintTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraint_type")

    private ConstraintTypeEnum constraintType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "foreign_keys")

    private List<ForeignKey> foreignKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_keys")

    private List<PrimaryKey> primaryKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_null_constraints")

    private List<NotNullConstraint> notNullConstraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_constraints")

    private List<CheckConstraint> checkConstraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_constraints")

    private List<UniqueConstraint> uniqueConstraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_constraints")

    private List<DefaultConstraint> defaultConstraints = null;

    public ListConstraintsResponse withConstraintType(ConstraintTypeEnum constraintType) {
        this.constraintType = constraintType;
        return this;
    }

    /**
     * 限制类型
     * @return constraintType
     */
    public ConstraintTypeEnum getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(ConstraintTypeEnum constraintType) {
        this.constraintType = constraintType;
    }

    public ListConstraintsResponse withForeignKeys(List<ForeignKey> foreignKeys) {
        this.foreignKeys = foreignKeys;
        return this;
    }

    public ListConstraintsResponse addForeignKeysItem(ForeignKey foreignKeysItem) {
        if (this.foreignKeys == null) {
            this.foreignKeys = new ArrayList<>();
        }
        this.foreignKeys.add(foreignKeysItem);
        return this;
    }

    public ListConstraintsResponse withForeignKeys(Consumer<List<ForeignKey>> foreignKeysSetter) {
        if (this.foreignKeys == null) {
            this.foreignKeys = new ArrayList<>();
        }
        foreignKeysSetter.accept(this.foreignKeys);
        return this;
    }

    /**
     * 外键列表
     * @return foreignKeys
     */
    public List<ForeignKey> getForeignKeys() {
        return foreignKeys;
    }

    public void setForeignKeys(List<ForeignKey> foreignKeys) {
        this.foreignKeys = foreignKeys;
    }

    public ListConstraintsResponse withPrimaryKeys(List<PrimaryKey> primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }

    public ListConstraintsResponse addPrimaryKeysItem(PrimaryKey primaryKeysItem) {
        if (this.primaryKeys == null) {
            this.primaryKeys = new ArrayList<>();
        }
        this.primaryKeys.add(primaryKeysItem);
        return this;
    }

    public ListConstraintsResponse withPrimaryKeys(Consumer<List<PrimaryKey>> primaryKeysSetter) {
        if (this.primaryKeys == null) {
            this.primaryKeys = new ArrayList<>();
        }
        primaryKeysSetter.accept(this.primaryKeys);
        return this;
    }

    /**
     * 主键列表
     * @return primaryKeys
     */
    public List<PrimaryKey> getPrimaryKeys() {
        return primaryKeys;
    }

    public void setPrimaryKeys(List<PrimaryKey> primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    public ListConstraintsResponse withNotNullConstraints(List<NotNullConstraint> notNullConstraints) {
        this.notNullConstraints = notNullConstraints;
        return this;
    }

    public ListConstraintsResponse addNotNullConstraintsItem(NotNullConstraint notNullConstraintsItem) {
        if (this.notNullConstraints == null) {
            this.notNullConstraints = new ArrayList<>();
        }
        this.notNullConstraints.add(notNullConstraintsItem);
        return this;
    }

    public ListConstraintsResponse withNotNullConstraints(Consumer<List<NotNullConstraint>> notNullConstraintsSetter) {
        if (this.notNullConstraints == null) {
            this.notNullConstraints = new ArrayList<>();
        }
        notNullConstraintsSetter.accept(this.notNullConstraints);
        return this;
    }

    /**
     * 非空限制列表
     * @return notNullConstraints
     */
    public List<NotNullConstraint> getNotNullConstraints() {
        return notNullConstraints;
    }

    public void setNotNullConstraints(List<NotNullConstraint> notNullConstraints) {
        this.notNullConstraints = notNullConstraints;
    }

    public ListConstraintsResponse withCheckConstraints(List<CheckConstraint> checkConstraints) {
        this.checkConstraints = checkConstraints;
        return this;
    }

    public ListConstraintsResponse addCheckConstraintsItem(CheckConstraint checkConstraintsItem) {
        if (this.checkConstraints == null) {
            this.checkConstraints = new ArrayList<>();
        }
        this.checkConstraints.add(checkConstraintsItem);
        return this;
    }

    public ListConstraintsResponse withCheckConstraints(Consumer<List<CheckConstraint>> checkConstraintsSetter) {
        if (this.checkConstraints == null) {
            this.checkConstraints = new ArrayList<>();
        }
        checkConstraintsSetter.accept(this.checkConstraints);
        return this;
    }

    /**
     * 检查限制列表
     * @return checkConstraints
     */
    public List<CheckConstraint> getCheckConstraints() {
        return checkConstraints;
    }

    public void setCheckConstraints(List<CheckConstraint> checkConstraints) {
        this.checkConstraints = checkConstraints;
    }

    public ListConstraintsResponse withUniqueConstraints(List<UniqueConstraint> uniqueConstraints) {
        this.uniqueConstraints = uniqueConstraints;
        return this;
    }

    public ListConstraintsResponse addUniqueConstraintsItem(UniqueConstraint uniqueConstraintsItem) {
        if (this.uniqueConstraints == null) {
            this.uniqueConstraints = new ArrayList<>();
        }
        this.uniqueConstraints.add(uniqueConstraintsItem);
        return this;
    }

    public ListConstraintsResponse withUniqueConstraints(Consumer<List<UniqueConstraint>> uniqueConstraintsSetter) {
        if (this.uniqueConstraints == null) {
            this.uniqueConstraints = new ArrayList<>();
        }
        uniqueConstraintsSetter.accept(this.uniqueConstraints);
        return this;
    }

    /**
     * 唯一值限制列表
     * @return uniqueConstraints
     */
    public List<UniqueConstraint> getUniqueConstraints() {
        return uniqueConstraints;
    }

    public void setUniqueConstraints(List<UniqueConstraint> uniqueConstraints) {
        this.uniqueConstraints = uniqueConstraints;
    }

    public ListConstraintsResponse withDefaultConstraints(List<DefaultConstraint> defaultConstraints) {
        this.defaultConstraints = defaultConstraints;
        return this;
    }

    public ListConstraintsResponse addDefaultConstraintsItem(DefaultConstraint defaultConstraintsItem) {
        if (this.defaultConstraints == null) {
            this.defaultConstraints = new ArrayList<>();
        }
        this.defaultConstraints.add(defaultConstraintsItem);
        return this;
    }

    public ListConstraintsResponse withDefaultConstraints(Consumer<List<DefaultConstraint>> defaultConstraintsSetter) {
        if (this.defaultConstraints == null) {
            this.defaultConstraints = new ArrayList<>();
        }
        defaultConstraintsSetter.accept(this.defaultConstraints);
        return this;
    }

    /**
     * 默认限制列表
     * @return defaultConstraints
     */
    public List<DefaultConstraint> getDefaultConstraints() {
        return defaultConstraints;
    }

    public void setDefaultConstraints(List<DefaultConstraint> defaultConstraints) {
        this.defaultConstraints = defaultConstraints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListConstraintsResponse listConstraintsResponse = (ListConstraintsResponse) o;
        return Objects.equals(this.constraintType, listConstraintsResponse.constraintType)
            && Objects.equals(this.foreignKeys, listConstraintsResponse.foreignKeys)
            && Objects.equals(this.primaryKeys, listConstraintsResponse.primaryKeys)
            && Objects.equals(this.notNullConstraints, listConstraintsResponse.notNullConstraints)
            && Objects.equals(this.checkConstraints, listConstraintsResponse.checkConstraints)
            && Objects.equals(this.uniqueConstraints, listConstraintsResponse.uniqueConstraints)
            && Objects.equals(this.defaultConstraints, listConstraintsResponse.defaultConstraints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constraintType,
            foreignKeys,
            primaryKeys,
            notNullConstraints,
            checkConstraints,
            uniqueConstraints,
            defaultConstraints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConstraintsResponse {\n");
        sb.append("    constraintType: ").append(toIndentedString(constraintType)).append("\n");
        sb.append("    foreignKeys: ").append(toIndentedString(foreignKeys)).append("\n");
        sb.append("    primaryKeys: ").append(toIndentedString(primaryKeys)).append("\n");
        sb.append("    notNullConstraints: ").append(toIndentedString(notNullConstraints)).append("\n");
        sb.append("    checkConstraints: ").append(toIndentedString(checkConstraints)).append("\n");
        sb.append("    uniqueConstraints: ").append(toIndentedString(uniqueConstraints)).append("\n");
        sb.append("    defaultConstraints: ").append(toIndentedString(defaultConstraints)).append("\n");
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
