package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件检查Spec-request结构体
 */
public class AddonCheckSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addonList")

    private List<AddonInfo> addonList = null;

    public AddonCheckSpec withClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    /**
     * **参数解释：** 集群ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return clusterID
     */
    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public AddonCheckSpec withAddonList(List<AddonInfo> addonList) {
        this.addonList = addonList;
        return this;
    }

    public AddonCheckSpec addAddonListItem(AddonInfo addonListItem) {
        if (this.addonList == null) {
            this.addonList = new ArrayList<>();
        }
        this.addonList.add(addonListItem);
        return this;
    }

    public AddonCheckSpec withAddonList(Consumer<List<AddonInfo>> addonListSetter) {
        if (this.addonList == null) {
            this.addonList = new ArrayList<>();
        }
        addonListSetter.accept(this.addonList);
        return this;
    }

    /**
     * **参数解释：** 插件检查信息列表，包含了需要检查的插件模板名称，插件实例ID，插件升级配置等。 **约束限制：** 不涉及 
     * @return addonList
     */
    public List<AddonInfo> getAddonList() {
        return addonList;
    }

    public void setAddonList(List<AddonInfo> addonList) {
        this.addonList = addonList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddonCheckSpec that = (AddonCheckSpec) obj;
        return Objects.equals(this.clusterID, that.clusterID) && Objects.equals(this.addonList, that.addonList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterID, addonList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddonCheckSpec {\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    addonList: ").append(toIndentedString(addonList)).append("\n");
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
