package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取资产列表的请求体
 */
public class AssetListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_sn_list")

    private List<String> assetSnList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private List<String> assetType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_first_inbound_time")

    private String startFirstInboundTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_first_inbound_time")

    private String endFirstInboundTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public AssetListRequestBody withAssetSnList(List<String> assetSnList) {
        this.assetSnList = assetSnList;
        return this;
    }

    public AssetListRequestBody addAssetSnListItem(String assetSnListItem) {
        if (this.assetSnList == null) {
            this.assetSnList = new ArrayList<>();
        }
        this.assetSnList.add(assetSnListItem);
        return this;
    }

    public AssetListRequestBody withAssetSnList(Consumer<List<String>> assetSnListSetter) {
        if (this.assetSnList == null) {
            this.assetSnList = new ArrayList<>();
        }
        assetSnListSetter.accept(this.assetSnList);
        return this;
    }

    /**
     * 资产序列号
     * @return assetSnList
     */
    public List<String> getAssetSnList() {
        return assetSnList;
    }

    public void setAssetSnList(List<String> assetSnList) {
        this.assetSnList = assetSnList;
    }

    public AssetListRequestBody withAssetType(List<String> assetType) {
        this.assetType = assetType;
        return this;
    }

    public AssetListRequestBody addAssetTypeItem(String assetTypeItem) {
        if (this.assetType == null) {
            this.assetType = new ArrayList<>();
        }
        this.assetType.add(assetTypeItem);
        return this;
    }

    public AssetListRequestBody withAssetType(Consumer<List<String>> assetTypeSetter) {
        if (this.assetType == null) {
            this.assetType = new ArrayList<>();
        }
        assetTypeSetter.accept(this.assetType);
        return this;
    }

    /**
     * 资产大类
     * @return assetType
     */
    public List<String> getAssetType() {
        return assetType;
    }

    public void setAssetType(List<String> assetType) {
        this.assetType = assetType;
    }

    public AssetListRequestBody withStartFirstInboundTime(String startFirstInboundTime) {
        this.startFirstInboundTime = startFirstInboundTime;
        return this;
    }

    /**
     * 首次入库时间搜索起始时间
     * @return startFirstInboundTime
     */
    public String getStartFirstInboundTime() {
        return startFirstInboundTime;
    }

    public void setStartFirstInboundTime(String startFirstInboundTime) {
        this.startFirstInboundTime = startFirstInboundTime;
    }

    public AssetListRequestBody withEndFirstInboundTime(String endFirstInboundTime) {
        this.endFirstInboundTime = endFirstInboundTime;
        return this;
    }

    /**
     * 首次入库时间搜索结束时间
     * @return endFirstInboundTime
     */
    public String getEndFirstInboundTime() {
        return endFirstInboundTime;
    }

    public void setEndFirstInboundTime(String endFirstInboundTime) {
        this.endFirstInboundTime = endFirstInboundTime;
    }

    public AssetListRequestBody withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 资产模型
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public AssetListRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资产名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AssetListRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * minimum: 0
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public AssetListRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页条目数量
     * minimum: 0
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssetListRequestBody that = (AssetListRequestBody) obj;
        return Objects.equals(this.assetSnList, that.assetSnList) && Objects.equals(this.assetType, that.assetType)
            && Objects.equals(this.startFirstInboundTime, that.startFirstInboundTime)
            && Objects.equals(this.endFirstInboundTime, that.endFirstInboundTime)
            && Objects.equals(this.model, that.model) && Objects.equals(this.name, that.name)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(assetSnList, assetType, startFirstInboundTime, endFirstInboundTime, model, name, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetListRequestBody {\n");
        sb.append("    assetSnList: ").append(toIndentedString(assetSnList)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    startFirstInboundTime: ").append(toIndentedString(startFirstInboundTime)).append("\n");
        sb.append("    endFirstInboundTime: ").append(toIndentedString(endFirstInboundTime)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
