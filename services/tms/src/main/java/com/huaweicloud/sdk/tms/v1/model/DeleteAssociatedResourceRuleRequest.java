package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteAssociatedResourceRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting_name")

    private String settingName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private List<String> regionId = null;

    public DeleteAssociatedResourceRuleRequest withSettingName(String settingName) {
        this.settingName = settingName;
        return this;
    }

    /**
     * 规则的配置名称。
     * @return settingName
     */
    public String getSettingName() {
        return settingName;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    public DeleteAssociatedResourceRuleRequest withRegionId(List<String> regionId) {
        this.regionId = regionId;
        return this;
    }

    public DeleteAssociatedResourceRuleRequest addRegionIdItem(String regionIdItem) {
        if (this.regionId == null) {
            this.regionId = new ArrayList<>();
        }
        this.regionId.add(regionIdItem);
        return this;
    }

    public DeleteAssociatedResourceRuleRequest withRegionId(Consumer<List<String>> regionIdSetter) {
        if (this.regionId == null) {
            this.regionId = new ArrayList<>();
        }
        regionIdSetter.accept(this.regionId);
        return this;
    }

    /**
     * 要关闭的规则所在的region集合。
     * @return regionId
     */
    public List<String> getRegionId() {
        return regionId;
    }

    public void setRegionId(List<String> regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAssociatedResourceRuleRequest that = (DeleteAssociatedResourceRuleRequest) obj;
        return Objects.equals(this.settingName, that.settingName) && Objects.equals(this.regionId, that.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(settingName, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAssociatedResourceRuleRequest {\n");
        sb.append("    settingName: ").append(toIndentedString(settingName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
