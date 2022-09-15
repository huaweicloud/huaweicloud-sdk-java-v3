package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListAccessoryAccessUrlsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_ids")

    private List<String> accessoryIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")

    private Integer xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")

    private String xTimeZone;

    public ListAccessoryAccessUrlsRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListAccessoryAccessUrlsRequest withAccessoryIds(List<String> accessoryIds) {
        this.accessoryIds = accessoryIds;
        return this;
    }

    public ListAccessoryAccessUrlsRequest addAccessoryIdsItem(String accessoryIdsItem) {
        if (this.accessoryIds == null) {
            this.accessoryIds = new ArrayList<>();
        }
        this.accessoryIds.add(accessoryIdsItem);
        return this;
    }

    public ListAccessoryAccessUrlsRequest withAccessoryIds(Consumer<List<String>> accessoryIdsSetter) {
        if (this.accessoryIds == null) {
            this.accessoryIds = new ArrayList<>();
        }
        accessoryIdsSetter.accept(this.accessoryIds);
        return this;
    }

    /**
     * 附件id列表
     * @return accessoryIds
     */
    public List<String> getAccessoryIds() {
        return accessoryIds;
    }

    public void setAccessoryIds(List<String> accessoryIds) {
        this.accessoryIds = accessoryIds;
    }

    public ListAccessoryAccessUrlsRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    /**
     * 对接站点信息。  0（中国站） 1（国际站），不填的话默认为0。
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    public ListAccessoryAccessUrlsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言环境，值为通用的语言描述字符串，比如zh-cn等，默认为zh-cn。  会根据语言环境对应展示一些国际化的信息，比如工单类型名称等。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListAccessoryAccessUrlsRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    /**
     * 环境时区，值为通用的时区描述字符串，比如GMT+8等，默认为GMT+8。  涉及时间的数据会根据环境时区处理。
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAccessoryAccessUrlsRequest listAccessoryAccessUrlsRequest = (ListAccessoryAccessUrlsRequest) o;
        return Objects.equals(this.groupId, listAccessoryAccessUrlsRequest.groupId)
            && Objects.equals(this.accessoryIds, listAccessoryAccessUrlsRequest.accessoryIds)
            && Objects.equals(this.xSite, listAccessoryAccessUrlsRequest.xSite)
            && Objects.equals(this.xLanguage, listAccessoryAccessUrlsRequest.xLanguage)
            && Objects.equals(this.xTimeZone, listAccessoryAccessUrlsRequest.xTimeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, accessoryIds, xSite, xLanguage, xTimeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessoryAccessUrlsRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    accessoryIds: ").append(toIndentedString(accessoryIds)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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
