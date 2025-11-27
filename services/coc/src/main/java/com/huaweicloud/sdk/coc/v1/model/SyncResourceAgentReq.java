package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SyncResourceAgentReq
 */
public class SyncResourceAgentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_infos")

    private List<SyncResourceAgentReqResourceInfos> resourceInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    public SyncResourceAgentReq withResourceInfos(List<SyncResourceAgentReqResourceInfos> resourceInfos) {
        this.resourceInfos = resourceInfos;
        return this;
    }

    public SyncResourceAgentReq addResourceInfosItem(SyncResourceAgentReqResourceInfos resourceInfosItem) {
        if (this.resourceInfos == null) {
            this.resourceInfos = new ArrayList<>();
        }
        this.resourceInfos.add(resourceInfosItem);
        return this;
    }

    public SyncResourceAgentReq withResourceInfos(
        Consumer<List<SyncResourceAgentReqResourceInfos>> resourceInfosSetter) {
        if (this.resourceInfos == null) {
            this.resourceInfos = new ArrayList<>();
        }
        resourceInfosSetter.accept(this.resourceInfos);
        return this;
    }

    /**
     * **参数解释：** 资源信息。 **约束限制：** 不涉及。 **取值范围：** 选择需要同步的资源对应的资源信息，列表大小1~100之间。 **默认取值：** 不涉及。
     * @return resourceInfos
     */
    public List<SyncResourceAgentReqResourceInfos> getResourceInfos() {
        return resourceInfos;
    }

    public void setResourceInfos(List<SyncResourceAgentReqResourceInfos> resourceInfos) {
        this.resourceInfos = resourceInfos;
    }

    public SyncResourceAgentReq withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * **参数解释：** 云厂商。 **约束限制：** 不涉及。 **取值范围：** - 华为云资源同步时，可以不传。 - 阿里云资源同步时，传ALI。 **默认取值：** 不涉及。
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncResourceAgentReq that = (SyncResourceAgentReq) obj;
        return Objects.equals(this.resourceInfos, that.resourceInfos) && Objects.equals(this.vendor, that.vendor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceInfos, vendor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncResourceAgentReq {\n");
        sb.append("    resourceInfos: ").append(toIndentedString(resourceInfos)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
