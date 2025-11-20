package com.huaweicloud.sdk.metastudio.v1.model;

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
 * 收藏项
 */
public class CollectionInfo {

    /**
     * 收藏项类型。 * VOICE：音色
     */
    public static final class CollectionTypeEnum {

        /**
         * Enum VOICE for value: "VOICE"
         */
        public static final CollectionTypeEnum VOICE = new CollectionTypeEnum("VOICE");

        private static final Map<String, CollectionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CollectionTypeEnum> createStaticFields() {
            Map<String, CollectionTypeEnum> map = new HashMap<>();
            map.put("VOICE", VOICE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CollectionTypeEnum(String value) {
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
        public static CollectionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CollectionTypeEnum(value));
        }

        public static CollectionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CollectionTypeEnum) {
                return this.value.equals(((CollectionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_type")

    private CollectionTypeEnum collectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_ids")

    private List<String> collectionIds = null;

    public CollectionInfo withCollectionType(CollectionTypeEnum collectionType) {
        this.collectionType = collectionType;
        return this;
    }

    /**
     * 收藏项类型。 * VOICE：音色
     * @return collectionType
     */
    public CollectionTypeEnum getCollectionType() {
        return collectionType;
    }

    public void setCollectionType(CollectionTypeEnum collectionType) {
        this.collectionType = collectionType;
    }

    public CollectionInfo withCollectionIds(List<String> collectionIds) {
        this.collectionIds = collectionIds;
        return this;
    }

    public CollectionInfo addCollectionIdsItem(String collectionIdsItem) {
        if (this.collectionIds == null) {
            this.collectionIds = new ArrayList<>();
        }
        this.collectionIds.add(collectionIdsItem);
        return this;
    }

    public CollectionInfo withCollectionIds(Consumer<List<String>> collectionIdsSetter) {
        if (this.collectionIds == null) {
            this.collectionIds = new ArrayList<>();
        }
        collectionIdsSetter.accept(this.collectionIds);
        return this;
    }

    /**
     * 收藏的资产或者模板ID。
     * @return collectionIds
     */
    public List<String> getCollectionIds() {
        return collectionIds;
    }

    public void setCollectionIds(List<String> collectionIds) {
        this.collectionIds = collectionIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectionInfo that = (CollectionInfo) obj;
        return Objects.equals(this.collectionType, that.collectionType)
            && Objects.equals(this.collectionIds, that.collectionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectionType, collectionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectionInfo {\n");
        sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
        sb.append("    collectionIds: ").append(toIndentedString(collectionIds)).append("\n");
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
