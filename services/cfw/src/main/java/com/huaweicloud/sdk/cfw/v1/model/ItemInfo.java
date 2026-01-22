package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ItemInfo
 */
public class ItemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_quota")

    private Integer maxQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_quota")

    private Integer usedQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extras_info")

    private Map<String, String> extrasInfo = null;

    public ItemInfo withMaxQuota(Integer maxQuota) {
        this.maxQuota = maxQuota;
        return this;
    }

    /**
     * **参数解释**： 最大配额 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return maxQuota
     */
    public Integer getMaxQuota() {
        return maxQuota;
    }

    public void setMaxQuota(Integer maxQuota) {
        this.maxQuota = maxQuota;
    }

    public ItemInfo withUsedQuota(Integer usedQuota) {
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

    public ItemInfo withExtrasInfo(Map<String, String> extrasInfo) {
        this.extrasInfo = extrasInfo;
        return this;
    }

    public ItemInfo putExtrasInfoItem(String key, String extrasInfoItem) {
        if (this.extrasInfo == null) {
            this.extrasInfo = new HashMap<>();
        }
        this.extrasInfo.put(key, extrasInfoItem);
        return this;
    }

    public ItemInfo withExtrasInfo(Consumer<Map<String, String>> extrasInfoSetter) {
        if (this.extrasInfo == null) {
            this.extrasInfo = new HashMap<>();
        }
        extrasInfoSetter.accept(this.extrasInfo);
        return this;
    }

    /**
     * **参数解释**： 额外参数，ACL和网络域名使用 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return extrasInfo
     */
    public Map<String, String> getExtrasInfo() {
        return extrasInfo;
    }

    public void setExtrasInfo(Map<String, String> extrasInfo) {
        this.extrasInfo = extrasInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItemInfo that = (ItemInfo) obj;
        return Objects.equals(this.maxQuota, that.maxQuota) && Objects.equals(this.usedQuota, that.usedQuota)
            && Objects.equals(this.extrasInfo, that.extrasInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxQuota, usedQuota, extrasInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemInfo {\n");
        sb.append("    maxQuota: ").append(toIndentedString(maxQuota)).append("\n");
        sb.append("    usedQuota: ").append(toIndentedString(usedQuota)).append("\n");
        sb.append("    extrasInfo: ").append(toIndentedString(extrasInfo)).append("\n");
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
