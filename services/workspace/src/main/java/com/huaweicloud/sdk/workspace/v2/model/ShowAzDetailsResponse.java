package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAzDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sold_out")

    private SoldOutInfo soldOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_ids")

    private List<String> productIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private Integer category;

    public ShowAzDetailsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 对应CMDB的region数据中的'zoneCode'字段。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAzDetailsResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 对应CMDB的region数据中的'regionCode'字段。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowAzDetailsResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 当前AZ的类型: - Edge: 边缘云 - Workspace：华为云
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowAzDetailsResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 英文名。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShowAzDetailsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowAzDetailsResponse withSoldOut(SoldOutInfo soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    public ShowAzDetailsResponse withSoldOut(Consumer<SoldOutInfo> soldOutSetter) {
        if (this.soldOut == null) {
            this.soldOut = new SoldOutInfo();
            soldOutSetter.accept(this.soldOut);
        }

        return this;
    }

    /**
     * Get soldOut
     * @return soldOut
     */
    public SoldOutInfo getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(SoldOutInfo soldOut) {
        this.soldOut = soldOut;
    }

    public ShowAzDetailsResponse withProductIds(List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    public ShowAzDetailsResponse addProductIdsItem(String productIdsItem) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        this.productIds.add(productIdsItem);
        return this;
    }

    public ShowAzDetailsResponse withProductIds(Consumer<List<String>> productIdsSetter) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        productIdsSetter.accept(this.productIds);
        return this;
    }

    /**
     * 参品Id集。
     * @return productIds
     */
    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public ShowAzDetailsResponse withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 计费模式，专属 / 共享。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ShowAzDetailsResponse withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * az的别名(中文、数字、字母、下划线、中划线，最大128字节)。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ShowAzDetailsResponse withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * EIP所属的group。
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ShowAzDetailsResponse withCategory(Integer category) {
        this.category = category;
        return this;
    }

    /**
     * 分类的Id:  - 0: default - 21: HomeZone - 41: IES
     * @return category
     */
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAzDetailsResponse that = (ShowAzDetailsResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.soldOut, that.soldOut)
            && Objects.equals(this.productIds, that.productIds) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            regionId,
            type,
            displayName,
            status,
            soldOut,
            productIds,
            mode,
            alias,
            publicBorderGroup,
            category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAzDetailsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
        sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
