package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ShowProductResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

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

    private ProductCoverDetailInfo cover;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_list")

    private List<ProductTextInfo> textList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_list")

    private List<ProductMediaDetailInfo> assetList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    /**
     * 商品状态枚举 * ACTIVED：已激活 * UNACTIVED：未激活 * BLOCK: 被冻结，商品不可用 * DELETED：已删除
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

        /**
         * Enum BLOCK for value: "BLOCK"
         */
        public static final StateEnum BLOCK = new StateEnum("BLOCK");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StateEnum DELETED = new StateEnum("DELETED");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("ACTIVED", ACTIVED);
            map.put("UNACTIVED", UNACTIVED);
            map.put("BLOCK", BLOCK);
            map.put("DELETED", DELETED);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowProductResponse withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 商品ID
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ShowProductResponse withName(String name) {
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

    public ShowProductResponse withDescription(String description) {
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

    public ShowProductResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ShowProductResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowProductResponse withTags(Consumer<List<String>> tagsSetter) {
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

    public ShowProductResponse withCover(ProductCoverDetailInfo cover) {
        this.cover = cover;
        return this;
    }

    public ShowProductResponse withCover(Consumer<ProductCoverDetailInfo> coverSetter) {
        if (this.cover == null) {
            this.cover = new ProductCoverDetailInfo();
            coverSetter.accept(this.cover);
        }

        return this;
    }

    /**
     * Get cover
     * @return cover
     */
    public ProductCoverDetailInfo getCover() {
        return cover;
    }

    public void setCover(ProductCoverDetailInfo cover) {
        this.cover = cover;
    }

    public ShowProductResponse withTextList(List<ProductTextInfo> textList) {
        this.textList = textList;
        return this;
    }

    public ShowProductResponse addTextListItem(ProductTextInfo textListItem) {
        if (this.textList == null) {
            this.textList = new ArrayList<>();
        }
        this.textList.add(textListItem);
        return this;
    }

    public ShowProductResponse withTextList(Consumer<List<ProductTextInfo>> textListSetter) {
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

    public ShowProductResponse withAssetList(List<ProductMediaDetailInfo> assetList) {
        this.assetList = assetList;
        return this;
    }

    public ShowProductResponse addAssetListItem(ProductMediaDetailInfo assetListItem) {
        if (this.assetList == null) {
            this.assetList = new ArrayList<>();
        }
        this.assetList.add(assetListItem);
        return this;
    }

    public ShowProductResponse withAssetList(Consumer<List<ProductMediaDetailInfo>> assetListSetter) {
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
    public List<ProductMediaDetailInfo> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<ProductMediaDetailInfo> assetList) {
        this.assetList = assetList;
    }

    public ShowProductResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 商品创建时间，格式遵循：RFC 3339。 例 “2020-07-30T10:43:17Z”。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowProductResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 商品更新时间，格式遵循：RFC 3339。 例 “2020-07-30T10:43:17Z”。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowProductResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 商品状态枚举 * ACTIVED：已激活 * UNACTIVED：未激活 * BLOCK: 被冻结，商品不可用 * DELETED：已删除
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ShowProductResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProductResponse that = (ShowProductResponse) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.cover, that.cover) && Objects.equals(this.textList, that.textList)
            && Objects.equals(this.assetList, that.assetList) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.state, that.state)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId,
            name,
            description,
            tags,
            cover,
            textList,
            assetList,
            createTime,
            updateTime,
            state,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProductResponse {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
        sb.append("    textList: ").append(toIndentedString(textList)).append("\n");
        sb.append("    assetList: ").append(toIndentedString(assetList)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
