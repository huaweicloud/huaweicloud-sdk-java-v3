package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 切换防护的请求信息
 */
public class SwitchHostsProtectStatusRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private String chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagInfo> tags = null;

    public SwitchHostsProtectStatusRequestInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 主机开通的版本，包含如下:   - hss.version.null ：无，代表关闭防护。   - hss.version.basic ：基础版。   - hss.version.enterprise ：企业版。   - hss.version.premium ：旗舰版。   - hss.version.wtp ：网页防篡改版。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SwitchHostsProtectStatusRequestInfo withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 付费模式，当version不为“hss.version.null”时，则需必填该参数   - packet_cycle : 包周期   - on_demand : 按需
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    public SwitchHostsProtectStatusRequestInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * HSS配额ID，不填该参数时，则随机选择对应版本配额
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public SwitchHostsProtectStatusRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public SwitchHostsProtectStatusRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public SwitchHostsProtectStatusRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 服务器列表
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public SwitchHostsProtectStatusRequestInfo withTags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public SwitchHostsProtectStatusRequestInfo addTagsItem(TagInfo tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SwitchHostsProtectStatusRequestInfo withTags(Consumer<List<TagInfo>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签列表
     * @return tags
     */
    public List<TagInfo> getTags() {
        return tags;
    }

    public void setTags(List<TagInfo> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SwitchHostsProtectStatusRequestInfo switchHostsProtectStatusRequestInfo =
            (SwitchHostsProtectStatusRequestInfo) o;
        return Objects.equals(this.version, switchHostsProtectStatusRequestInfo.version)
            && Objects.equals(this.chargingMode, switchHostsProtectStatusRequestInfo.chargingMode)
            && Objects.equals(this.resourceId, switchHostsProtectStatusRequestInfo.resourceId)
            && Objects.equals(this.hostIdList, switchHostsProtectStatusRequestInfo.hostIdList)
            && Objects.equals(this.tags, switchHostsProtectStatusRequestInfo.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, chargingMode, resourceId, hostIdList, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchHostsProtectStatusRequestInfo {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
