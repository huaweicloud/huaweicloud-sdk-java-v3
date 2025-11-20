package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源信息
 */
public class ResourceResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceId")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudServiceType")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceType")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSpecCode")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expireTime")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSize")

    private Integer resourceSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relativeType")

    private Integer relativeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public ResourceResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * **参数解释：** 资源id **取值范围：** 不涉及
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourceResponse withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * **参数解释：** 云服务产品对应的云服务类型 **取值范围：** 不涉及
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ResourceResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * **参数解释：** 云服务产品的资源类型 **取值范围：**  - hws.resource.type.waf：云模式包周期WAF  - hws.resource.type.waf.domain：云模式包周期WAF域名扩展包  - hws.resource.type.waf.bandwidth：云模式包周期WAF带宽扩展包  - hws.resource.type.waf.rule：云模式包周期WAF规则扩展包  - hws.resource.type.waf.payperuserequest：Web应用防火墙按需请求   - hws.resource.type.waf.payperusedomain：Web应用防火墙按需域名  - hws.resource.type.waf.payperuserule：Web应用防火墙按需规则
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ResourceResponse withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * **参数解释：** 云服务产品的资源规格 **取值范围：** 不涉及
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ResourceResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 资源状态 **取值范围：**  - 0：解冻/正常   - 1：冻结   - 2：删除
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ResourceResponse withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * **参数解释：** 资源到期时间 **取值范围：** 不涉及
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public ResourceResponse withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * **参数解释：** 资源数量 **取值范围：** 不涉及
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    public ResourceResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * **参数解释：** 资源创建时间 **取值范围：** 不涉及
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ResourceResponse withRelativeType(Integer relativeType) {
        this.relativeType = relativeType;
        return this;
    }

    /**
     * **参数解释：** 当资源项为附属资源(域名扩展包/带宽扩展包/规则扩展包/高阶功能扩展包),描述附属资源与主资源的关系 **取值范围：**  - 0：附属资源与主资源为挂载关系  - 1：附属资源与主资源为绑定关系  - 2：从属关系
     * @return relativeType
     */
    public Integer getRelativeType() {
        return relativeType;
    }

    public void setRelativeType(Integer relativeType) {
        this.relativeType = relativeType;
    }

    public ResourceResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 华为云区域ID,资源所属的区域id **取值范围：** 不涉及
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceResponse that = (ResourceResponse) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode) && Objects.equals(this.status, that.status)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.resourceSize, that.resourceSize)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.relativeType, that.relativeType)
            && Objects.equals(this.region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            cloudServiceType,
            resourceType,
            resourceSpecCode,
            status,
            expireTime,
            resourceSize,
            timestamp,
            relativeType,
            region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceResponse {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    relativeType: ").append(toIndentedString(relativeType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
