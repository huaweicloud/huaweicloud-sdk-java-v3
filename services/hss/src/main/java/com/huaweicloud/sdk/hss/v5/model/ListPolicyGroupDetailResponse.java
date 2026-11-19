package com.huaweicloud.sdk.hss.v5.model;

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
public class ListPolicyGroupDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_version")

    private String supportVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_os")

    private String supportOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<ShowPolicyDetailResponseInfo> dataList = null;

    public ListPolicyGroupDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 策略组描述 **取值范围**： 字符长度1-64位 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListPolicyGroupDetailResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 策略组ID **取值范围**： 字符长度1-128位 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListPolicyGroupDetailResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 策略组名称 **取值范围**： 字符长度1-256位 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ListPolicyGroupDetailResponse withSupportVersion(String supportVersion) {
        this.supportVersion = supportVersion;
        return this;
    }

    /**
     * **参数解释**： 支持的版本 **取值范围**： 字符长度1-64位 
     * @return supportVersion
     */
    public String getSupportVersion() {
        return supportVersion;
    }

    public void setSupportVersion(String supportVersion) {
        this.supportVersion = supportVersion;
    }

    public ListPolicyGroupDetailResponse withSupportOs(String supportOs) {
        this.supportOs = supportOs;
        return this;
    }

    /**
     * **参数解释**： 支持的操作系统 **取值范围**： 字符长度1-64位 
     * @return supportOs
     */
    public String getSupportOs() {
        return supportOs;
    }

    public void setSupportOs(String supportOs) {
        this.supportOs = supportOs;
    }

    public ListPolicyGroupDetailResponse withDataList(List<ShowPolicyDetailResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListPolicyGroupDetailResponse addDataListItem(ShowPolicyDetailResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListPolicyGroupDetailResponse withDataList(Consumer<List<ShowPolicyDetailResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**： 策略详情列表 **取值范围**： 不涉及 
     * @return dataList
     */
    public List<ShowPolicyDetailResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<ShowPolicyDetailResponseInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPolicyGroupDetailResponse that = (ListPolicyGroupDetailResponse) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.supportVersion, that.supportVersion)
            && Objects.equals(this.supportOs, that.supportOs) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, groupId, groupName, supportVersion, supportOs, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyGroupDetailResponse {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    supportVersion: ").append(toIndentedString(supportVersion)).append("\n");
        sb.append("    supportOs: ").append(toIndentedString(supportOs)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
