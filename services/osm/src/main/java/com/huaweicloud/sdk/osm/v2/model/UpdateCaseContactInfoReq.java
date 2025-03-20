package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateCaseContactInfoReq
 */
public class UpdateCaseContactInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_code")

    private String areaCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remind_mobile")

    private String remindMobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remind_mail")

    private String remindMail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remind_time")

    private String remindTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_map")

    private Map<String, Object> extensionMap = null;

    public UpdateCaseContactInfoReq withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * 国家码
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public UpdateCaseContactInfoReq withRemindMobile(String remindMobile) {
        this.remindMobile = remindMobile;
        return this;
    }

    /**
     * 联系手机号
     * @return remindMobile
     */
    public String getRemindMobile() {
        return remindMobile;
    }

    public void setRemindMobile(String remindMobile) {
        this.remindMobile = remindMobile;
    }

    public UpdateCaseContactInfoReq withRemindMail(String remindMail) {
        this.remindMail = remindMail;
        return this;
    }

    /**
     * 联系邮箱
     * @return remindMail
     */
    public String getRemindMail() {
        return remindMail;
    }

    public void setRemindMail(String remindMail) {
        this.remindMail = remindMail;
    }

    public UpdateCaseContactInfoReq withRemindTime(String remindTime) {
        this.remindTime = remindTime;
        return this;
    }

    /**
     * 联系时间
     * @return remindTime
     */
    public String getRemindTime() {
        return remindTime;
    }

    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime;
    }

    public UpdateCaseContactInfoReq withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 华为云IAM组id，操作查询同组其他工单时，该id必传
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public UpdateCaseContactInfoReq withExtensionMap(Map<String, Object> extensionMap) {
        this.extensionMap = extensionMap;
        return this;
    }

    public UpdateCaseContactInfoReq putExtensionMapItem(String key, Object extensionMapItem) {
        if (this.extensionMap == null) {
            this.extensionMap = new HashMap<>();
        }
        this.extensionMap.put(key, extensionMapItem);
        return this;
    }

    public UpdateCaseContactInfoReq withExtensionMap(Consumer<Map<String, Object>> extensionMapSetter) {
        if (this.extensionMap == null) {
            this.extensionMap = new HashMap<>();
        }
        extensionMapSetter.accept(this.extensionMap);
        return this;
    }

    /**
     * 扩展参数
     * @return extensionMap
     */
    public Map<String, Object> getExtensionMap() {
        return extensionMap;
    }

    public void setExtensionMap(Map<String, Object> extensionMap) {
        this.extensionMap = extensionMap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCaseContactInfoReq that = (UpdateCaseContactInfoReq) obj;
        return Objects.equals(this.areaCode, that.areaCode) && Objects.equals(this.remindMobile, that.remindMobile)
            && Objects.equals(this.remindMail, that.remindMail) && Objects.equals(this.remindTime, that.remindTime)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.extensionMap, that.extensionMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, remindMobile, remindMail, remindTime, groupId, extensionMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCaseContactInfoReq {\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    remindMobile: ").append(toIndentedString(remindMobile)).append("\n");
        sb.append("    remindMail: ").append(toIndentedString(remindMail)).append("\n");
        sb.append("    remindTime: ").append(toIndentedString(remindTime)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    extensionMap: ").append(toIndentedString(extensionMap)).append("\n");
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
