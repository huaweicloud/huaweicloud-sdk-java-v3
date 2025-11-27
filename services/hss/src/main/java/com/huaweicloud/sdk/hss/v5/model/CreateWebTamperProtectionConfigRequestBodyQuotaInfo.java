package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 开启防护时绑定的配额信息 **约束限制**: open_protection_immediately值为true时有效 **取值范围**: 不涉及 **默认取值**: 不涉及 
 */
public class CreateWebTamperProtectionConfigRequestBodyQuotaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id_list")

    private List<String> resourceIdList = null;

    public CreateWebTamperProtectionConfigRequestBodyQuotaInfo withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**: 计费模式 **约束限制**: 不涉及 **取值范围**: - packet_cycle：包年包月  **默认取值**: 不涉及 
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public CreateWebTamperProtectionConfigRequestBodyQuotaInfo withResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }

    public CreateWebTamperProtectionConfigRequestBodyQuotaInfo addResourceIdListItem(String resourceIdListItem) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        this.resourceIdList.add(resourceIdListItem);
        return this;
    }

    public CreateWebTamperProtectionConfigRequestBodyQuotaInfo withResourceIdList(
        Consumer<List<String>> resourceIdListSetter) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        resourceIdListSetter.accept(this.resourceIdList);
        return this;
    }

    /**
     * **参数解释**: 配额id列表 **约束限制**: 若该字段值为空，则随机选取配额 **取值范围**: 最少0条，最多10条 **默认取值**: 不涉及 
     * @return resourceIdList
     */
    public List<String> getResourceIdList() {
        return resourceIdList;
    }

    public void setResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWebTamperProtectionConfigRequestBodyQuotaInfo that =
            (CreateWebTamperProtectionConfigRequestBodyQuotaInfo) obj;
        return Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.resourceIdList, that.resourceIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingMode, resourceIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWebTamperProtectionConfigRequestBodyQuotaInfo {\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceIdList: ").append(toIndentedString(resourceIdList)).append("\n");
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
