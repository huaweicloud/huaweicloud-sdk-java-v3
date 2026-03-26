package com.huaweicloud.sdk.dwr.v1.model;

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
 * DescribeCollectionData
 */
public class DescribeCollectionData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_name")

    private String storeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_name")

    private String collectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<FieldData> fields = null;

    /**
     * **参数解释：** 标识当前Collection加载状态。 **约束限制：** 不涉及。 **取值范围：** 1、LoadStateLoaded：表示当前Collection已准备就绪，可正常使用。 2、LoadStateLoading：表示当前Collection正在load。 3、LoadStateNotLoad：表示collection未加载。 **默认取值:** 不涉及。
     */
    public static final class LoadStateEnum {

        /**
         * Enum READY for value: "ready"
         */
        public static final LoadStateEnum READY = new LoadStateEnum("ready");

        /**
         * Enum BUILDING for value: "building"
         */
        public static final LoadStateEnum BUILDING = new LoadStateEnum("building");

        /**
         * Enum NONE for value: "none"
         */
        public static final LoadStateEnum NONE = new LoadStateEnum("none");

        private static final Map<String, LoadStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LoadStateEnum> createStaticFields() {
            Map<String, LoadStateEnum> map = new HashMap<>();
            map.put("ready", READY);
            map.put("building", BUILDING);
            map.put("none", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LoadStateEnum(String value) {
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
        public static LoadStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LoadStateEnum(value));
        }

        public static LoadStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LoadStateEnum) {
                return this.value.equals(((LoadStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "load_state")

    private LoadStateEnum loadState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indexes")

    private List<IndexDesc> indexes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_num")

    private Long entityNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions_num")

    private Integer partitionsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shards_num")

    private Integer shardsNum;

    public DescribeCollectionData withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例名称，region内唯一。 **约束限制：** 长度范围为3到63个字符，支持小写字母、数字、中划线（-），第一个字符只能够是小写字母，中划线(-)不得出现在字符串末尾。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public DescribeCollectionData withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * **参数解释：** collection名称。 **约束限制：** 可包含数字、字母和下划线 (_)。资源名称必须以字母或下划线 (_) 开头。最大长度支持255。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public DescribeCollectionData withFields(List<FieldData> fields) {
        this.fields = fields;
        return this;
    }

    public DescribeCollectionData addFieldsItem(FieldData fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public DescribeCollectionData withFields(Consumer<List<FieldData>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * **参数解释：** collection各个field信息。 **约束限制：** 不涉及。
     * @return fields
     */
    public List<FieldData> getFields() {
        return fields;
    }

    public void setFields(List<FieldData> fields) {
        this.fields = fields;
    }

    public DescribeCollectionData withLoadState(LoadStateEnum loadState) {
        this.loadState = loadState;
        return this;
    }

    /**
     * **参数解释：** 标识当前Collection加载状态。 **约束限制：** 不涉及。 **取值范围：** 1、LoadStateLoaded：表示当前Collection已准备就绪，可正常使用。 2、LoadStateLoading：表示当前Collection正在load。 3、LoadStateNotLoad：表示collection未加载。 **默认取值:** 不涉及。
     * @return loadState
     */
    public LoadStateEnum getLoadState() {
        return loadState;
    }

    public void setLoadState(LoadStateEnum loadState) {
        this.loadState = loadState;
    }

    public DescribeCollectionData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** Collection 的描述信息。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DescribeCollectionData withIndexes(List<IndexDesc> indexes) {
        this.indexes = indexes;
        return this;
    }

    public DescribeCollectionData addIndexesItem(IndexDesc indexesItem) {
        if (this.indexes == null) {
            this.indexes = new ArrayList<>();
        }
        this.indexes.add(indexesItem);
        return this;
    }

    public DescribeCollectionData withIndexes(Consumer<List<IndexDesc>> indexesSetter) {
        if (this.indexes == null) {
            this.indexes = new ArrayList<>();
        }
        indexesSetter.accept(this.indexes);
        return this;
    }

    /**
     * **参数解释：** 索引的配置信息。 **约束限制：** 不涉及。
     * @return indexes
     */
    public List<IndexDesc> getIndexes() {
        return indexes;
    }

    public void setIndexes(List<IndexDesc> indexes) {
        this.indexes = indexes;
    }

    public DescribeCollectionData withEntityNum(Long entityNum) {
        this.entityNum = entityNum;
        return this;
    }

    /**
     * **参数解释：** collection中的entity数量。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return entityNum
     */
    public Long getEntityNum() {
        return entityNum;
    }

    public void setEntityNum(Long entityNum) {
        this.entityNum = entityNum;
    }

    public DescribeCollectionData withPartitionsNum(Integer partitionsNum) {
        this.partitionsNum = partitionsNum;
        return this;
    }

    /**
     * **参数解释：** collection中的partition数量。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return partitionsNum
     */
    public Integer getPartitionsNum() {
        return partitionsNum;
    }

    public void setPartitionsNum(Integer partitionsNum) {
        this.partitionsNum = partitionsNum;
    }

    public DescribeCollectionData withShardsNum(Integer shardsNum) {
        this.shardsNum = shardsNum;
        return this;
    }

    /**
     * **参数解释：** collection中的shard数量。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return shardsNum
     */
    public Integer getShardsNum() {
        return shardsNum;
    }

    public void setShardsNum(Integer shardsNum) {
        this.shardsNum = shardsNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DescribeCollectionData that = (DescribeCollectionData) obj;
        return Objects.equals(this.storeName, that.storeName)
            && Objects.equals(this.collectionName, that.collectionName) && Objects.equals(this.fields, that.fields)
            && Objects.equals(this.loadState, that.loadState) && Objects.equals(this.description, that.description)
            && Objects.equals(this.indexes, that.indexes) && Objects.equals(this.entityNum, that.entityNum)
            && Objects.equals(this.partitionsNum, that.partitionsNum) && Objects.equals(this.shardsNum, that.shardsNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeName,
            collectionName,
            fields,
            loadState,
            description,
            indexes,
            entityNum,
            partitionsNum,
            shardsNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeCollectionData {\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    loadState: ").append(toIndentedString(loadState)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
        sb.append("    entityNum: ").append(toIndentedString(entityNum)).append("\n");
        sb.append("    partitionsNum: ").append(toIndentedString(partitionsNum)).append("\n");
        sb.append("    shardsNum: ").append(toIndentedString(shardsNum)).append("\n");
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
