package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListModelAssetsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_code")

    private String assetCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_source")

    private String assetSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_asset_type")

    private String subAssetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_id")

    private String chatId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_actions")

    private List<String> assetActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    public ListModelAssetsRequest withAssetCode(String assetCode) {
        this.assetCode = assetCode;
        return this;
    }

    /**
     * **参数解释**： 资产编码。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetCode
     */
    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public ListModelAssetsRequest withAssetSource(String assetSource) {
        this.assetSource = assetSource;
        return this;
    }

    /**
     * **参数解释**： 资产来源。 **约束限制**： 不涉及 **取值范围**： * Preset：预置 * AIGallery：订阅 * Import：导入 * Publish：发布 **默认取值**： 不涉及 
     * @return assetSource
     */
    public String getAssetSource() {
        return assetSource;
    }

    public void setAssetSource(String assetSource) {
        this.assetSource = assetSource;
    }

    public ListModelAssetsRequest withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * **参数解释**： 资产类型。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public ListModelAssetsRequest withSubAssetType(String subAssetType) {
        this.subAssetType = subAssetType;
        return this;
    }

    /**
     * **参数解释**： 资产子类型。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return subAssetType
     */
    public String getSubAssetType() {
        return subAssetType;
    }

    public void setSubAssetType(String subAssetType) {
        this.subAssetType = subAssetType;
    }

    public ListModelAssetsRequest withChatId(String chatId) {
        this.chatId = chatId;
        return this;
    }

    /**
     * **参数解释**： 对话id。 **约束限制**： 不涉及 **取值范围**： 长度为[1-64]个字符。 **默认取值**： 不涉及 
     * @return chatId
     */
    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public ListModelAssetsRequest withAssetActions(List<String> assetActions) {
        this.assetActions = assetActions;
        return this;
    }

    public ListModelAssetsRequest addAssetActionsItem(String assetActionsItem) {
        if (this.assetActions == null) {
            this.assetActions = new ArrayList<>();
        }
        this.assetActions.add(assetActionsItem);
        return this;
    }

    public ListModelAssetsRequest withAssetActions(Consumer<List<String>> assetActionsSetter) {
        if (this.assetActions == null) {
            this.assetActions = new ArrayList<>();
        }
        assetActionsSetter.accept(this.assetActions);
        return this;
    }

    /**
     * **参数解释**： 资产应用场景。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return assetActions
     */
    public List<String> getAssetActions() {
        return assetActions;
    }

    public void setAssetActions(List<String> assetActions) {
        this.assetActions = assetActions;
    }

    public ListModelAssetsRequest withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 模型名称，支持模糊匹配
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public ListModelAssetsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 偏移量。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,100000000]。 **默认取值**： 0 
     * minimum: 0
     * maximum: 100000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListModelAssetsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 返回限制个数。 **约束限制**： 不涉及 **取值范围**： [1-1000] **默认取值**： 100 
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListModelAssetsRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * **参数解释**： 排序规则。 **约束限制**： 不涉及 **取值范围**： - DESC：降序。 - ASC：升序。 **默认取值**： DESC 
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListModelAssetsRequest that = (ListModelAssetsRequest) obj;
        return Objects.equals(this.assetCode, that.assetCode) && Objects.equals(this.assetSource, that.assetSource)
            && Objects.equals(this.assetType, that.assetType) && Objects.equals(this.subAssetType, that.subAssetType)
            && Objects.equals(this.chatId, that.chatId) && Objects.equals(this.assetActions, that.assetActions)
            && Objects.equals(this.assetName, that.assetName) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.sortDir, that.sortDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetCode,
            assetSource,
            assetType,
            subAssetType,
            chatId,
            assetActions,
            assetName,
            offset,
            limit,
            sortDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListModelAssetsRequest {\n");
        sb.append("    assetCode: ").append(toIndentedString(assetCode)).append("\n");
        sb.append("    assetSource: ").append(toIndentedString(assetSource)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    subAssetType: ").append(toIndentedString(subAssetType)).append("\n");
        sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
        sb.append("    assetActions: ").append(toIndentedString(assetActions)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
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
