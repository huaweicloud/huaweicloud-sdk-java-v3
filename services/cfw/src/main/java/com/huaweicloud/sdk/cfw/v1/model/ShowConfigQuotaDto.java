package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowConfigQuotaDto
 */
public class ShowConfigQuotaDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_info")

    private ItemInfo itemInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_quota")

    private Integer maxQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_type")

    private String quotaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_quota")

    private Integer usedQuota;

    public ShowConfigQuotaDto withItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
        return this;
    }

    public ShowConfigQuotaDto withItemInfo(Consumer<ItemInfo> itemInfoSetter) {
        if (this.itemInfo == null) {
            this.itemInfo = new ItemInfo();
            itemInfoSetter.accept(this.itemInfo);
        }

        return this;
    }

    /**
     * Get itemInfo
     * @return itemInfo
     */
    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }

    public ShowConfigQuotaDto withMaxQuota(Integer maxQuota) {
        this.maxQuota = maxQuota;
        return this;
    }

    /**
     * **参数解释**： 防火墙成员最大配额 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return maxQuota
     */
    public Integer getMaxQuota() {
        return maxQuota;
    }

    public void setMaxQuota(Integer maxQuota) {
        this.maxQuota = maxQuota;
    }

    public ShowConfigQuotaDto withQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }

    /**
     * **参数解释**： 防火墙成员配额类型 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return quotaType
     */
    public String getQuotaType() {
        return quotaType;
    }

    public void setQuotaType(String quotaType) {
        this.quotaType = quotaType;
    }

    public ShowConfigQuotaDto withUsedQuota(Integer usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }

    /**
     * **参数解释**： 已使用配额 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return usedQuota
     */
    public Integer getUsedQuota() {
        return usedQuota;
    }

    public void setUsedQuota(Integer usedQuota) {
        this.usedQuota = usedQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConfigQuotaDto that = (ShowConfigQuotaDto) obj;
        return Objects.equals(this.itemInfo, that.itemInfo) && Objects.equals(this.maxQuota, that.maxQuota)
            && Objects.equals(this.quotaType, that.quotaType) && Objects.equals(this.usedQuota, that.usedQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemInfo, maxQuota, quotaType, usedQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConfigQuotaDto {\n");
        sb.append("    itemInfo: ").append(toIndentedString(itemInfo)).append("\n");
        sb.append("    maxQuota: ").append(toIndentedString(maxQuota)).append("\n");
        sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
        sb.append("    usedQuota: ").append(toIndentedString(usedQuota)).append("\n");
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
