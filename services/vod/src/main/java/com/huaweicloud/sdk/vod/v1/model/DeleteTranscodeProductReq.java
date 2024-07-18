package com.huaweicloud.sdk.vod.v1.model;

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
 * DeleteTranscodeProductReq
 */
public class DeleteTranscodeProductReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    /**
     * GROUP：模板组级删除。 PRODUCT：产物级删除
     */
    public static final class DeleteTypeEnum {

        /**
         * Enum GROUP for value: "GROUP"
         */
        public static final DeleteTypeEnum GROUP = new DeleteTypeEnum("GROUP");

        /**
         * Enum PRODUCT for value: "PRODUCT"
         */
        public static final DeleteTypeEnum PRODUCT = new DeleteTypeEnum("PRODUCT");

        private static final Map<String, DeleteTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeleteTypeEnum> createStaticFields() {
            Map<String, DeleteTypeEnum> map = new HashMap<>();
            map.put("GROUP", GROUP);
            map.put("PRODUCT", PRODUCT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeleteTypeEnum(String value) {
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
        public static DeleteTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeleteTypeEnum(value));
        }

        public static DeleteTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DeleteTypeEnum) {
                return this.value.equals(((DeleteTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_type")

    private DeleteTypeEnum deleteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_infos")

    private List<ProductGroupInfo> deleteInfos = null;

    public DeleteTranscodeProductReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 媒资Id
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public DeleteTranscodeProductReq withDeleteType(DeleteTypeEnum deleteType) {
        this.deleteType = deleteType;
        return this;
    }

    /**
     * GROUP：模板组级删除。 PRODUCT：产物级删除
     * @return deleteType
     */
    public DeleteTypeEnum getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(DeleteTypeEnum deleteType) {
        this.deleteType = deleteType;
    }

    public DeleteTranscodeProductReq withDeleteInfos(List<ProductGroupInfo> deleteInfos) {
        this.deleteInfos = deleteInfos;
        return this;
    }

    public DeleteTranscodeProductReq addDeleteInfosItem(ProductGroupInfo deleteInfosItem) {
        if (this.deleteInfos == null) {
            this.deleteInfos = new ArrayList<>();
        }
        this.deleteInfos.add(deleteInfosItem);
        return this;
    }

    public DeleteTranscodeProductReq withDeleteInfos(Consumer<List<ProductGroupInfo>> deleteInfosSetter) {
        if (this.deleteInfos == null) {
            this.deleteInfos = new ArrayList<>();
        }
        deleteInfosSetter.accept(this.deleteInfos);
        return this;
    }

    /**
     * 删除的产物信息
     * @return deleteInfos
     */
    public List<ProductGroupInfo> getDeleteInfos() {
        return deleteInfos;
    }

    public void setDeleteInfos(List<ProductGroupInfo> deleteInfos) {
        this.deleteInfos = deleteInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTranscodeProductReq that = (DeleteTranscodeProductReq) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.deleteType, that.deleteType)
            && Objects.equals(this.deleteInfos, that.deleteInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, deleteType, deleteInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTranscodeProductReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    deleteType: ").append(toIndentedString(deleteType)).append("\n");
        sb.append("    deleteInfos: ").append(toIndentedString(deleteInfos)).append("\n");
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
