package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateBatchChangeOrderRequestBody
 */
public class CreateBatchChangeOrderRequestBody {

    /**
     * 下单类型。  - ADD_VOLUME：增加磁盘  - EXTEND_VOLUME：扩容磁盘  - RESIZE：变更规格  - CHANGE_IMAGE：切换镜像  - ADD_SUB_RESOURCES：购买桌面协同资源  - DELETE_SUB_RESOURCES：退订桌面协同资源
     */
    public static final class TypeEnum {

        /**
         * Enum ADD_VOLUME for value: "ADD_VOLUME"
         */
        public static final TypeEnum ADD_VOLUME = new TypeEnum("ADD_VOLUME");

        /**
         * Enum EXTEND_VOLUME for value: "EXTEND_VOLUME"
         */
        public static final TypeEnum EXTEND_VOLUME = new TypeEnum("EXTEND_VOLUME");

        /**
         * Enum RESIZE for value: "RESIZE"
         */
        public static final TypeEnum RESIZE = new TypeEnum("RESIZE");

        /**
         * Enum CHANGE_IMAGE for value: "CHANGE_IMAGE"
         */
        public static final TypeEnum CHANGE_IMAGE = new TypeEnum("CHANGE_IMAGE");

        /**
         * Enum ADD_SUB_RESOURCES for value: "ADD_SUB_RESOURCES"
         */
        public static final TypeEnum ADD_SUB_RESOURCES = new TypeEnum("ADD_SUB_RESOURCES");

        /**
         * Enum DELETE_SUB_RESOURCES for value: "DELETE_SUB_RESOURCES"
         */
        public static final TypeEnum DELETE_SUB_RESOURCES = new TypeEnum("DELETE_SUB_RESOURCES");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ADD_VOLUME", ADD_VOLUME);
            map.put("EXTEND_VOLUME", EXTEND_VOLUME);
            map.put("RESIZE", RESIZE);
            map.put("CHANGE_IMAGE", CHANGE_IMAGE);
            map.put("ADD_SUB_RESOURCES", ADD_SUB_RESOURCES);
            map.put("DELETE_SUB_RESOURCES", DELETE_SUB_RESOURCES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_volume_param")

    private EstimateAddVolumeRequestBody addVolumeParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_volume_param")

    private EstimateExtendVolumeRequestBody extendVolumeParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize_param")

    private CreateResizeOrderRequestBody resizeParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_image_param")

    private CreateChangeImageOrderRequestBody changeImageParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_sub_resources_param")

    private EstimateAddSubResourcesRequestBody addSubResourcesParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_sub_resources_param")

    private CreateDeleteSubResourcesOrderRequestBody deleteSubResourcesParam;

    public CreateBatchChangeOrderRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 下单类型。  - ADD_VOLUME：增加磁盘  - EXTEND_VOLUME：扩容磁盘  - RESIZE：变更规格  - CHANGE_IMAGE：切换镜像  - ADD_SUB_RESOURCES：购买桌面协同资源  - DELETE_SUB_RESOURCES：退订桌面协同资源
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateBatchChangeOrderRequestBody withAddVolumeParam(EstimateAddVolumeRequestBody addVolumeParam) {
        this.addVolumeParam = addVolumeParam;
        return this;
    }

    public CreateBatchChangeOrderRequestBody withAddVolumeParam(
        Consumer<EstimateAddVolumeRequestBody> addVolumeParamSetter) {
        if (this.addVolumeParam == null) {
            this.addVolumeParam = new EstimateAddVolumeRequestBody();
            addVolumeParamSetter.accept(this.addVolumeParam);
        }

        return this;
    }

    /**
     * Get addVolumeParam
     * @return addVolumeParam
     */
    public EstimateAddVolumeRequestBody getAddVolumeParam() {
        return addVolumeParam;
    }

    public void setAddVolumeParam(EstimateAddVolumeRequestBody addVolumeParam) {
        this.addVolumeParam = addVolumeParam;
    }

    public CreateBatchChangeOrderRequestBody withExtendVolumeParam(EstimateExtendVolumeRequestBody extendVolumeParam) {
        this.extendVolumeParam = extendVolumeParam;
        return this;
    }

    public CreateBatchChangeOrderRequestBody withExtendVolumeParam(
        Consumer<EstimateExtendVolumeRequestBody> extendVolumeParamSetter) {
        if (this.extendVolumeParam == null) {
            this.extendVolumeParam = new EstimateExtendVolumeRequestBody();
            extendVolumeParamSetter.accept(this.extendVolumeParam);
        }

        return this;
    }

    /**
     * Get extendVolumeParam
     * @return extendVolumeParam
     */
    public EstimateExtendVolumeRequestBody getExtendVolumeParam() {
        return extendVolumeParam;
    }

    public void setExtendVolumeParam(EstimateExtendVolumeRequestBody extendVolumeParam) {
        this.extendVolumeParam = extendVolumeParam;
    }

    public CreateBatchChangeOrderRequestBody withResizeParam(CreateResizeOrderRequestBody resizeParam) {
        this.resizeParam = resizeParam;
        return this;
    }

    public CreateBatchChangeOrderRequestBody withResizeParam(Consumer<CreateResizeOrderRequestBody> resizeParamSetter) {
        if (this.resizeParam == null) {
            this.resizeParam = new CreateResizeOrderRequestBody();
            resizeParamSetter.accept(this.resizeParam);
        }

        return this;
    }

    /**
     * Get resizeParam
     * @return resizeParam
     */
    public CreateResizeOrderRequestBody getResizeParam() {
        return resizeParam;
    }

    public void setResizeParam(CreateResizeOrderRequestBody resizeParam) {
        this.resizeParam = resizeParam;
    }

    public CreateBatchChangeOrderRequestBody withChangeImageParam(CreateChangeImageOrderRequestBody changeImageParam) {
        this.changeImageParam = changeImageParam;
        return this;
    }

    public CreateBatchChangeOrderRequestBody withChangeImageParam(
        Consumer<CreateChangeImageOrderRequestBody> changeImageParamSetter) {
        if (this.changeImageParam == null) {
            this.changeImageParam = new CreateChangeImageOrderRequestBody();
            changeImageParamSetter.accept(this.changeImageParam);
        }

        return this;
    }

    /**
     * Get changeImageParam
     * @return changeImageParam
     */
    public CreateChangeImageOrderRequestBody getChangeImageParam() {
        return changeImageParam;
    }

    public void setChangeImageParam(CreateChangeImageOrderRequestBody changeImageParam) {
        this.changeImageParam = changeImageParam;
    }

    public CreateBatchChangeOrderRequestBody withAddSubResourcesParam(
        EstimateAddSubResourcesRequestBody addSubResourcesParam) {
        this.addSubResourcesParam = addSubResourcesParam;
        return this;
    }

    public CreateBatchChangeOrderRequestBody withAddSubResourcesParam(
        Consumer<EstimateAddSubResourcesRequestBody> addSubResourcesParamSetter) {
        if (this.addSubResourcesParam == null) {
            this.addSubResourcesParam = new EstimateAddSubResourcesRequestBody();
            addSubResourcesParamSetter.accept(this.addSubResourcesParam);
        }

        return this;
    }

    /**
     * Get addSubResourcesParam
     * @return addSubResourcesParam
     */
    public EstimateAddSubResourcesRequestBody getAddSubResourcesParam() {
        return addSubResourcesParam;
    }

    public void setAddSubResourcesParam(EstimateAddSubResourcesRequestBody addSubResourcesParam) {
        this.addSubResourcesParam = addSubResourcesParam;
    }

    public CreateBatchChangeOrderRequestBody withDeleteSubResourcesParam(
        CreateDeleteSubResourcesOrderRequestBody deleteSubResourcesParam) {
        this.deleteSubResourcesParam = deleteSubResourcesParam;
        return this;
    }

    public CreateBatchChangeOrderRequestBody withDeleteSubResourcesParam(
        Consumer<CreateDeleteSubResourcesOrderRequestBody> deleteSubResourcesParamSetter) {
        if (this.deleteSubResourcesParam == null) {
            this.deleteSubResourcesParam = new CreateDeleteSubResourcesOrderRequestBody();
            deleteSubResourcesParamSetter.accept(this.deleteSubResourcesParam);
        }

        return this;
    }

    /**
     * Get deleteSubResourcesParam
     * @return deleteSubResourcesParam
     */
    public CreateDeleteSubResourcesOrderRequestBody getDeleteSubResourcesParam() {
        return deleteSubResourcesParam;
    }

    public void setDeleteSubResourcesParam(CreateDeleteSubResourcesOrderRequestBody deleteSubResourcesParam) {
        this.deleteSubResourcesParam = deleteSubResourcesParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBatchChangeOrderRequestBody that = (CreateBatchChangeOrderRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.addVolumeParam, that.addVolumeParam)
            && Objects.equals(this.extendVolumeParam, that.extendVolumeParam)
            && Objects.equals(this.resizeParam, that.resizeParam)
            && Objects.equals(this.changeImageParam, that.changeImageParam)
            && Objects.equals(this.addSubResourcesParam, that.addSubResourcesParam)
            && Objects.equals(this.deleteSubResourcesParam, that.deleteSubResourcesParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            addVolumeParam,
            extendVolumeParam,
            resizeParam,
            changeImageParam,
            addSubResourcesParam,
            deleteSubResourcesParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBatchChangeOrderRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    addVolumeParam: ").append(toIndentedString(addVolumeParam)).append("\n");
        sb.append("    extendVolumeParam: ").append(toIndentedString(extendVolumeParam)).append("\n");
        sb.append("    resizeParam: ").append(toIndentedString(resizeParam)).append("\n");
        sb.append("    changeImageParam: ").append(toIndentedString(changeImageParam)).append("\n");
        sb.append("    addSubResourcesParam: ").append(toIndentedString(addSubResourcesParam)).append("\n");
        sb.append("    deleteSubResourcesParam: ").append(toIndentedString(deleteSubResourcesParam)).append("\n");
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
