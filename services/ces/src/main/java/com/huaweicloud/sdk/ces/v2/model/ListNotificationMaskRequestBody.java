package com.huaweicloud.sdk.ces.v2.model;

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
 * ListNotificationMaskRequestBody
 */
public class ListNotificationMaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type")

    private ListRelationType relationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_ids")

    private List<String> relationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_id")

    private String maskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_name")

    private String maskName;

    /**
     * 屏蔽状态,可选。MASK_EFFECTIVE：已生效，MASK_INEFFECTIVE：未生效。
     */
    public static final class MaskStatusEnum {

        /**
         * Enum MASK_EFFECTIVE for value: "MASK_EFFECTIVE"
         */
        public static final MaskStatusEnum MASK_EFFECTIVE = new MaskStatusEnum("MASK_EFFECTIVE");

        /**
         * Enum MASK_INEFFECTIVE for value: "MASK_INEFFECTIVE"
         */
        public static final MaskStatusEnum MASK_INEFFECTIVE = new MaskStatusEnum("MASK_INEFFECTIVE");

        private static final Map<String, MaskStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MaskStatusEnum> createStaticFields() {
            Map<String, MaskStatusEnum> map = new HashMap<>();
            map.put("MASK_EFFECTIVE", MASK_EFFECTIVE);
            map.put("MASK_INEFFECTIVE", MASK_INEFFECTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MaskStatusEnum(String value) {
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
        public static MaskStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MaskStatusEnum(value));
        }

        public static MaskStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MaskStatusEnum) {
                return this.value.equals(((MaskStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_status")

    private MaskStatusEnum maskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<Dimension2> dimensions = null;

    public ListNotificationMaskRequestBody withRelationType(ListRelationType relationType) {
        this.relationType = relationType;
        return this;
    }

    /**
     * Get relationType
     * @return relationType
     */
    public ListRelationType getRelationType() {
        return relationType;
    }

    public void setRelationType(ListRelationType relationType) {
        this.relationType = relationType;
    }

    public ListNotificationMaskRequestBody withRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
        return this;
    }

    public ListNotificationMaskRequestBody addRelationIdsItem(String relationIdsItem) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        this.relationIds.add(relationIdsItem);
        return this;
    }

    public ListNotificationMaskRequestBody withRelationIds(Consumer<List<String>> relationIdsSetter) {
        if (this.relationIds == null) {
            this.relationIds = new ArrayList<>();
        }
        relationIdsSetter.accept(this.relationIds);
        return this;
    }

    /**
     * 关联编号（目前是告警规则ID）
     * @return relationIds
     */
    public List<String> getRelationIds() {
        return relationIds;
    }

    public void setRelationIds(List<String> relationIds) {
        this.relationIds = relationIds;
    }

    public ListNotificationMaskRequestBody withMaskId(String maskId) {
        this.maskId = maskId;
        return this;
    }

    /**
     * 屏蔽规则ID,可选
     * @return maskId
     */
    public String getMaskId() {
        return maskId;
    }

    public void setMaskId(String maskId) {
        this.maskId = maskId;
    }

    public ListNotificationMaskRequestBody withMaskName(String maskName) {
        this.maskName = maskName;
        return this;
    }

    /**
     * 屏蔽规则名称,可选，只能为字母、数字、汉字、-、_，最大长度为64
     * @return maskName
     */
    public String getMaskName() {
        return maskName;
    }

    public void setMaskName(String maskName) {
        this.maskName = maskName;
    }

    public ListNotificationMaskRequestBody withMaskStatus(MaskStatusEnum maskStatus) {
        this.maskStatus = maskStatus;
        return this;
    }

    /**
     * 屏蔽状态,可选。MASK_EFFECTIVE：已生效，MASK_INEFFECTIVE：未生效。
     * @return maskStatus
     */
    public MaskStatusEnum getMaskStatus() {
        return maskStatus;
    }

    public void setMaskStatus(MaskStatusEnum maskStatus) {
        this.maskStatus = maskStatus;
    }

    public ListNotificationMaskRequestBody withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源维度值,提供一个维度的资源ID即可,可选
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListNotificationMaskRequestBody withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 查询服务的命名空间，各服务命名空间请参考[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListNotificationMaskRequestBody withDimensions(List<Dimension2> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public ListNotificationMaskRequestBody addDimensionsItem(Dimension2 dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public ListNotificationMaskRequestBody withDimensions(Consumer<List<Dimension2>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 资源的维度信息
     * @return dimensions
     */
    public List<Dimension2> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<Dimension2> dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotificationMaskRequestBody that = (ListNotificationMaskRequestBody) obj;
        return Objects.equals(this.relationType, that.relationType)
            && Objects.equals(this.relationIds, that.relationIds) && Objects.equals(this.maskId, that.maskId)
            && Objects.equals(this.maskName, that.maskName) && Objects.equals(this.maskStatus, that.maskStatus)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.dimensions, that.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relationType, relationIds, maskId, maskName, maskStatus, resourceId, namespace, dimensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationMaskRequestBody {\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
        sb.append("    relationIds: ").append(toIndentedString(relationIds)).append("\n");
        sb.append("    maskId: ").append(toIndentedString(maskId)).append("\n");
        sb.append("    maskName: ").append(toIndentedString(maskName)).append("\n");
        sb.append("    maskStatus: ").append(toIndentedString(maskStatus)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
