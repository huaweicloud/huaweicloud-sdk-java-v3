package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数解释：特性配置信息。
 */
public class FeatureConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private String feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch")

    private Boolean _switch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caller")

    private String caller;

    public FeatureConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数解释：配置的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FeatureConfig withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 参数解释：创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public FeatureConfig withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 参数解释：更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public FeatureConfig withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 参数解释：所属服务，固定ELB。
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public FeatureConfig withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 参数解释：租户ID，含义同project_id。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public FeatureConfig withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * 参数解释：特性名称。
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public FeatureConfig withSwitch(Boolean _switch) {
        this._switch = _switch;
        return this;
    }

    /**
     * 参数解释：特性配置启用开关，表示当前配置是否生效。  取值范围： - true：特性配置已生效。 - false: 特性配置未生效。
     * @return _switch
     */
    public Boolean getSwitch() {
        return _switch;
    }

    public void setSwitch(Boolean _switch) {
        this._switch = _switch;
    }

    public FeatureConfig withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 参数解释：特性配置值(value字段)的类型，如：INT，表示整型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public FeatureConfig withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 参数解释：特性配置值。如开关类型的特性配置取值true/false，表示特性开启关闭；配额类型的特性配置取值整数，表示限制配额。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public FeatureConfig withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数解释：特性配置描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FeatureConfig withCaller(String caller) {
        this.caller = caller;
        return this;
    }

    /**
     * 参数解释：配置创建者。
     * @return caller
     */
    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FeatureConfig that = (FeatureConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.service, that.service)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.feature, that.feature)
            && Objects.equals(this._switch, that._switch) && Objects.equals(this.type, that.type)
            && Objects.equals(this.value, that.value) && Objects.equals(this.description, that.description)
            && Objects.equals(this.caller, that.caller);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, createdAt, updatedAt, service, tenantId, feature, _switch, type, value, description, caller);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeatureConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    caller: ").append(toIndentedString(caller)).append("\n");
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
