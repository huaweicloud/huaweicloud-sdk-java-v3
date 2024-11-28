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
 * 服务开通请求
 */
public class UpdateProductRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cover")

    private ProductCoverInfo cover;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_list")

    private List<ProductTextInfo> textList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_list")

    private List<ProductMediaInfo> assetList = null;

    /**
     * 商品状态枚举 * ACTIVED：已激活 * UNACTIVED：未激活
     */
    public static final class StateEnum {

        /**
         * Enum ACTIVED for value: "ACTIVED"
         */
        public static final StateEnum ACTIVED = new StateEnum("ACTIVED");

        /**
         * Enum UNACTIVED for value: "UNACTIVED"
         */
        public static final StateEnum UNACTIVED = new StateEnum("UNACTIVED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("ACTIVED", ACTIVED);
            map.put("UNACTIVED", UNACTIVED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    public UpdateProductRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 商品名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateProductRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 商品描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateProductRequestBody withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateProductRequestBody addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateProductRequestBody withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签。单个标签16字节，多个用逗号分隔，最多50个。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public UpdateProductRequestBody withCover(ProductCoverInfo cover) {
        this.cover = cover;
        return this;
    }

    public UpdateProductRequestBody withCover(Consumer<ProductCoverInfo> coverSetter) {
        if (this.cover == null) {
            this.cover = new ProductCoverInfo();
            coverSetter.accept(this.cover);
        }

        return this;
    }

    /**
     * Get cover
     * @return cover
     */
    public ProductCoverInfo getCover() {
        return cover;
    }

    public void setCover(ProductCoverInfo cover) {
        this.cover = cover;
    }

    public UpdateProductRequestBody withTextList(List<ProductTextInfo> textList) {
        this.textList = textList;
        return this;
    }

    public UpdateProductRequestBody addTextListItem(ProductTextInfo textListItem) {
        if (this.textList == null) {
            this.textList = new ArrayList<>();
        }
        this.textList.add(textListItem);
        return this;
    }

    public UpdateProductRequestBody withTextList(Consumer<List<ProductTextInfo>> textListSetter) {
        if (this.textList == null) {
            this.textList = new ArrayList<>();
        }
        textListSetter.accept(this.textList);
        return this;
    }

    /**
     * 文本列表
     * @return textList
     */
    public List<ProductTextInfo> getTextList() {
        return textList;
    }

    public void setTextList(List<ProductTextInfo> textList) {
        this.textList = textList;
    }

    public UpdateProductRequestBody withAssetList(List<ProductMediaInfo> assetList) {
        this.assetList = assetList;
        return this;
    }

    public UpdateProductRequestBody addAssetListItem(ProductMediaInfo assetListItem) {
        if (this.assetList == null) {
            this.assetList = new ArrayList<>();
        }
        this.assetList.add(assetListItem);
        return this;
    }

    public UpdateProductRequestBody withAssetList(Consumer<List<ProductMediaInfo>> assetListSetter) {
        if (this.assetList == null) {
            this.assetList = new ArrayList<>();
        }
        assetListSetter.accept(this.assetList);
        return this;
    }

    /**
     * 资产列表,仅支持图片、视频、音频资产
     * @return assetList
     */
    public List<ProductMediaInfo> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<ProductMediaInfo> assetList) {
        this.assetList = assetList;
    }

    public UpdateProductRequestBody withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 商品状态枚举 * ACTIVED：已激活 * UNACTIVED：未激活
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateProductRequestBody that = (UpdateProductRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.cover, that.cover)
            && Objects.equals(this.textList, that.textList) && Objects.equals(this.assetList, that.assetList)
            && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, tags, cover, textList, assetList, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProductRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
        sb.append("    textList: ").append(toIndentedString(textList)).append("\n");
        sb.append("    assetList: ").append(toIndentedString(assetList)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
