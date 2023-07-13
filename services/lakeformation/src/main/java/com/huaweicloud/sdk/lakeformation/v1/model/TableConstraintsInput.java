package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * 表列限制条件输入模型
 */
public class TableConstraintsInput {

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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConstraintTypeEnum(value));
        }

        public static ConstraintTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private List<ForeignKeyInput> foreignKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_keys")

    private List<PrimaryKeyInput> primaryKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_null_constraints")

    private List<NotNullConstraintInput> notNullConstraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_constraints")

    private List<CheckConstraintInput> checkConstraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_constraints")

    private List<UniqueConstraintInput> uniqueConstraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_constraints")

    private List<DefaultConstraintInput> defaultConstraints = null;

    public TableConstraintsInput withConstraintType(ConstraintTypeEnum constraintType) {
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

    public TableConstraintsInput withForeignKeys(List<ForeignKeyInput> foreignKeys) {
        this.foreignKeys = foreignKeys;
        return this;
    }

    public TableConstraintsInput addForeignKeysItem(ForeignKeyInput foreignKeysItem) {
        if (this.foreignKeys == null) {
            this.foreignKeys = new ArrayList<>();
        }
        this.foreignKeys.add(foreignKeysItem);
        return this;
    }

    public TableConstraintsInput withForeignKeys(Consumer<List<ForeignKeyInput>> foreignKeysSetter) {
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
    public List<ForeignKeyInput> getForeignKeys() {
        return foreignKeys;
    }

    public void setForeignKeys(List<ForeignKeyInput> foreignKeys) {
        this.foreignKeys = foreignKeys;
    }

    public TableConstraintsInput withPrimaryKeys(List<PrimaryKeyInput> primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }

    public TableConstraintsInput addPrimaryKeysItem(PrimaryKeyInput primaryKeysItem) {
        if (this.primaryKeys == null) {
            this.primaryKeys = new ArrayList<>();
        }
        this.primaryKeys.add(primaryKeysItem);
        return this;
    }

    public TableConstraintsInput withPrimaryKeys(Consumer<List<PrimaryKeyInput>> primaryKeysSetter) {
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
    public List<PrimaryKeyInput> getPrimaryKeys() {
        return primaryKeys;
    }

    public void setPrimaryKeys(List<PrimaryKeyInput> primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    public TableConstraintsInput withNotNullConstraints(List<NotNullConstraintInput> notNullConstraints) {
        this.notNullConstraints = notNullConstraints;
        return this;
    }

    public TableConstraintsInput addNotNullConstraintsItem(NotNullConstraintInput notNullConstraintsItem) {
        if (this.notNullConstraints == null) {
            this.notNullConstraints = new ArrayList<>();
        }
        this.notNullConstraints.add(notNullConstraintsItem);
        return this;
    }

    public TableConstraintsInput withNotNullConstraints(
        Consumer<List<NotNullConstraintInput>> notNullConstraintsSetter) {
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
    public List<NotNullConstraintInput> getNotNullConstraints() {
        return notNullConstraints;
    }

    public void setNotNullConstraints(List<NotNullConstraintInput> notNullConstraints) {
        this.notNullConstraints = notNullConstraints;
    }

    public TableConstraintsInput withCheckConstraints(List<CheckConstraintInput> checkConstraints) {
        this.checkConstraints = checkConstraints;
        return this;
    }

    public TableConstraintsInput addCheckConstraintsItem(CheckConstraintInput checkConstraintsItem) {
        if (this.checkConstraints == null) {
            this.checkConstraints = new ArrayList<>();
        }
        this.checkConstraints.add(checkConstraintsItem);
        return this;
    }

    public TableConstraintsInput withCheckConstraints(Consumer<List<CheckConstraintInput>> checkConstraintsSetter) {
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
    public List<CheckConstraintInput> getCheckConstraints() {
        return checkConstraints;
    }

    public void setCheckConstraints(List<CheckConstraintInput> checkConstraints) {
        this.checkConstraints = checkConstraints;
    }

    public TableConstraintsInput withUniqueConstraints(List<UniqueConstraintInput> uniqueConstraints) {
        this.uniqueConstraints = uniqueConstraints;
        return this;
    }

    public TableConstraintsInput addUniqueConstraintsItem(UniqueConstraintInput uniqueConstraintsItem) {
        if (this.uniqueConstraints == null) {
            this.uniqueConstraints = new ArrayList<>();
        }
        this.uniqueConstraints.add(uniqueConstraintsItem);
        return this;
    }

    public TableConstraintsInput withUniqueConstraints(Consumer<List<UniqueConstraintInput>> uniqueConstraintsSetter) {
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
    public List<UniqueConstraintInput> getUniqueConstraints() {
        return uniqueConstraints;
    }

    public void setUniqueConstraints(List<UniqueConstraintInput> uniqueConstraints) {
        this.uniqueConstraints = uniqueConstraints;
    }

    public TableConstraintsInput withDefaultConstraints(List<DefaultConstraintInput> defaultConstraints) {
        this.defaultConstraints = defaultConstraints;
        return this;
    }

    public TableConstraintsInput addDefaultConstraintsItem(DefaultConstraintInput defaultConstraintsItem) {
        if (this.defaultConstraints == null) {
            this.defaultConstraints = new ArrayList<>();
        }
        this.defaultConstraints.add(defaultConstraintsItem);
        return this;
    }

    public TableConstraintsInput withDefaultConstraints(
        Consumer<List<DefaultConstraintInput>> defaultConstraintsSetter) {
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
    public List<DefaultConstraintInput> getDefaultConstraints() {
        return defaultConstraints;
    }

    public void setDefaultConstraints(List<DefaultConstraintInput> defaultConstraints) {
        this.defaultConstraints = defaultConstraints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableConstraintsInput that = (TableConstraintsInput) obj;
        return Objects.equals(this.constraintType, that.constraintType)
            && Objects.equals(this.foreignKeys, that.foreignKeys) && Objects.equals(this.primaryKeys, that.primaryKeys)
            && Objects.equals(this.notNullConstraints, that.notNullConstraints)
            && Objects.equals(this.checkConstraints, that.checkConstraints)
            && Objects.equals(this.uniqueConstraints, that.uniqueConstraints)
            && Objects.equals(this.defaultConstraints, that.defaultConstraints);
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
        sb.append("class TableConstraintsInput {\n");
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
