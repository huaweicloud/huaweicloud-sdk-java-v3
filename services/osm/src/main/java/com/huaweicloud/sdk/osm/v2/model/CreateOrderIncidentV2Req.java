package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateOrderIncidentV2Req
 */
public class CreateOrderIncidentV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_sub_type_id")

    private String incidentSubTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_category_id")

    private String productCategoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type_id")

    private String businessTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simple_description")

    private String simpleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

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
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_ids")

    private List<String> accessoryIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extends_map")

    private Map<String, Object> extendsMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_map")

    private Map<String, Object> extensionMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_id")

    private String severityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_code")

    private String verifyCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_code")

    private String areaCode;

    public CreateOrderIncidentV2Req withIncidentSubTypeId(String incidentSubTypeId) {
        this.incidentSubTypeId = incidentSubTypeId;
        return this;
    }

    /**
     * 工单子类，通过\"查询工单类目列表\"接口获取
     * @return incidentSubTypeId
     */
    public String getIncidentSubTypeId() {
        return incidentSubTypeId;
    }

    public void setIncidentSubTypeId(String incidentSubTypeId) {
        this.incidentSubTypeId = incidentSubTypeId;
    }

    public CreateOrderIncidentV2Req withProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
        return this;
    }

    /**
     * 工单产品类型，通过\"查询工单类目列表\"接口获取
     * @return productCategoryId
     */
    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public CreateOrderIncidentV2Req withBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }

    /**
     * 工单问题类型，通过\"查询问题类型列表\"接口获取
     * @return businessTypeId
     */
    public String getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    public CreateOrderIncidentV2Req withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID，根据business_type_id对应工单类型是5则必填，通过\"查询问题类型列表\"查看
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreateOrderIncidentV2Req withSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
        return this;
    }

    /**
     * 问题描述
     * @return simpleDescription
     */
    public String getSimpleDescription() {
        return simpleDescription;
    }

    public void setSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
    }

    public CreateOrderIncidentV2Req withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 工单来源，当前固定为83aeb0f2834c4df49826c781d32a963e
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public CreateOrderIncidentV2Req withRemindMobile(String remindMobile) {
        this.remindMobile = remindMobile;
        return this;
    }

    /**
     * 提醒手机号
     * @return remindMobile
     */
    public String getRemindMobile() {
        return remindMobile;
    }

    public void setRemindMobile(String remindMobile) {
        this.remindMobile = remindMobile;
    }

    public CreateOrderIncidentV2Req withRemindMail(String remindMail) {
        this.remindMail = remindMail;
        return this;
    }

    /**
     * 提醒邮箱
     * @return remindMail
     */
    public String getRemindMail() {
        return remindMail;
    }

    public void setRemindMail(String remindMail) {
        this.remindMail = remindMail;
    }

    public CreateOrderIncidentV2Req withRemindTime(String remindTime) {
        this.remindTime = remindTime;
        return this;
    }

    /**
     * 提醒时间，如果是任意时间传0，如果是指定时间，传客户首选项对应时区的时间，比如09:00-18:00
     * @return remindTime
     */
    public String getRemindTime() {
        return remindTime;
    }

    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime;
    }

    public CreateOrderIncidentV2Req withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateOrderIncidentV2Req withAccessoryIds(List<String> accessoryIds) {
        this.accessoryIds = accessoryIds;
        return this;
    }

    public CreateOrderIncidentV2Req addAccessoryIdsItem(String accessoryIdsItem) {
        if (this.accessoryIds == null) {
            this.accessoryIds = new ArrayList<>();
        }
        this.accessoryIds.add(accessoryIdsItem);
        return this;
    }

    public CreateOrderIncidentV2Req withAccessoryIds(Consumer<List<String>> accessoryIdsSetter) {
        if (this.accessoryIds == null) {
            this.accessoryIds = new ArrayList<>();
        }
        accessoryIdsSetter.accept(this.accessoryIds);
        return this;
    }

    /**
     * 附件id列表，\"上传附件\"接口返回的id
     * @return accessoryIds
     */
    public List<String> getAccessoryIds() {
        return accessoryIds;
    }

    public void setAccessoryIds(List<String> accessoryIds) {
        this.accessoryIds = accessoryIds;
    }

    public CreateOrderIncidentV2Req withExtendsMap(Map<String, Object> extendsMap) {
        this.extendsMap = extendsMap;
        return this;
    }

    public CreateOrderIncidentV2Req putExtendsMapItem(String key, Object extendsMapItem) {
        if (this.extendsMap == null) {
            this.extendsMap = new HashMap<>();
        }
        this.extendsMap.put(key, extendsMapItem);
        return this;
    }

    public CreateOrderIncidentV2Req withExtendsMap(Consumer<Map<String, Object>> extendsMapSetter) {
        if (this.extendsMap == null) {
            this.extendsMap = new HashMap<>();
        }
        extendsMapSetter.accept(this.extendsMap);
        return this;
    }

    /**
     * 附加参数
     * @return extendsMap
     */
    public Map<String, Object> getExtendsMap() {
        return extendsMap;
    }

    public void setExtendsMap(Map<String, Object> extendsMap) {
        this.extendsMap = extendsMap;
    }

    public CreateOrderIncidentV2Req withExtensionMap(Map<String, Object> extensionMap) {
        this.extensionMap = extensionMap;
        return this;
    }

    public CreateOrderIncidentV2Req putExtensionMapItem(String key, Object extensionMapItem) {
        if (this.extensionMap == null) {
            this.extensionMap = new HashMap<>();
        }
        this.extensionMap.put(key, extensionMapItem);
        return this;
    }

    public CreateOrderIncidentV2Req withExtensionMap(Consumer<Map<String, Object>> extensionMapSetter) {
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

    public CreateOrderIncidentV2Req withSeverityId(String severityId) {
        this.severityId = severityId;
        return this;
    }

    /**
     * 严重性id，通过\"查询问题严重性列表\"接口获取
     * @return severityId
     */
    public String getSeverityId() {
        return severityId;
    }

    public void setSeverityId(String severityId) {
        this.severityId = severityId;
    }

    public CreateOrderIncidentV2Req withVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }

    /**
     * 验证码，如果是非注册联系方式，需要通过\"获取验证码\"获取验证码
     * @return verifyCode
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public CreateOrderIncidentV2Req withAreaCode(String areaCode) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOrderIncidentV2Req that = (CreateOrderIncidentV2Req) obj;
        return Objects.equals(this.incidentSubTypeId, that.incidentSubTypeId)
            && Objects.equals(this.productCategoryId, that.productCategoryId)
            && Objects.equals(this.businessTypeId, that.businessTypeId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.simpleDescription, that.simpleDescription)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.remindMobile, that.remindMobile)
            && Objects.equals(this.remindMail, that.remindMail) && Objects.equals(this.remindTime, that.remindTime)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.accessoryIds, that.accessoryIds)
            && Objects.equals(this.extendsMap, that.extendsMap) && Objects.equals(this.extensionMap, that.extensionMap)
            && Objects.equals(this.severityId, that.severityId) && Objects.equals(this.verifyCode, that.verifyCode)
            && Objects.equals(this.areaCode, that.areaCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentSubTypeId,
            productCategoryId,
            businessTypeId,
            regionId,
            simpleDescription,
            sourceId,
            remindMobile,
            remindMail,
            remindTime,
            projectId,
            accessoryIds,
            extendsMap,
            extensionMap,
            severityId,
            verifyCode,
            areaCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrderIncidentV2Req {\n");
        sb.append("    incidentSubTypeId: ").append(toIndentedString(incidentSubTypeId)).append("\n");
        sb.append("    productCategoryId: ").append(toIndentedString(productCategoryId)).append("\n");
        sb.append("    businessTypeId: ").append(toIndentedString(businessTypeId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    simpleDescription: ").append(toIndentedString(simpleDescription)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    remindMobile: ").append(toIndentedString(remindMobile)).append("\n");
        sb.append("    remindMail: ").append(toIndentedString(remindMail)).append("\n");
        sb.append("    remindTime: ").append(toIndentedString(remindTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    accessoryIds: ").append(toIndentedString(accessoryIds)).append("\n");
        sb.append("    extendsMap: ").append(toIndentedString(extendsMap)).append("\n");
        sb.append("    extensionMap: ").append(toIndentedString(extensionMap)).append("\n");
        sb.append("    severityId: ").append(toIndentedString(severityId)).append("\n");
        sb.append("    verifyCode: ").append(toIndentedString(verifyCode)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
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
