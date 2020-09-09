package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * L7转发规则
 */
public class L7Rule  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compare_type")
    
    private String compareType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key")
    
    private String key;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invert")
    
    private Boolean invert = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;

    public L7Rule withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 转发规则的管理状态；该字段为预留字段，暂未启用。默认为true。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public L7Rule withCompareType(String compareType) {
        this.compareType = compareType;
        return this;
    }

    


    /**
     * 转发规则的匹配方式。type为HOST_NAME时可以为EQUAL_TO。type为PATH时可以为REGEX， STARTS_WITH，EQUAL_TO。
     * @return compareType
     */
    public String getCompareType() {
        return compareType;
    }

    public void setCompareType(String compareType) {
        this.compareType = compareType;
    }

    public L7Rule withKey(String key) {
        this.key = key;
        return this;
    }

    


    /**
     * 匹配内容的键值。目前匹配内容为HOST_NAME和PATH时，该字段不生效。该字段能更新但不会生效。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public L7Rule withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 转发规则所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public L7Rule withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 一个l7policy下创建的l7rule的type不能重复。 匹配内容：可以为HOST_NAME，PATH
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public L7Rule withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 匹配内容的值。其值不能包含空格。使用说明：当type为HOST_NAME时，取值范围：String(100)，字符串只能包含英文字母、数字、“-”或“.”，且必须以字母或数字开头。当type为PATH时，取值范围：String(128)。当转发规则的compare_type为STARTS_WITH，EQUAL_TO时，字符串只能包含英文字母、数字、^-%#&$.*+?,=!:| /()[]{}，且必须以\"/\"开头。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public L7Rule withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * provisioning状态，可以为ACTIVE、PENDING_CREATE 或者ERROR。 说明：该字段无实际含义，默认为ACTIVE。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public L7Rule withInvert(Boolean invert) {
        this.invert = invert;
        return this;
    }

    


    /**
     * 是否反向匹配，true/false。 使用说明：固定为false。该字段能更新但不会生效。
     * @return invert
     */
    public Boolean getInvert() {
        return invert;
    }

    public void setInvert(Boolean invert) {
        this.invert = invert;
    }

    public L7Rule withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 规则ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        L7Rule l7Rule = (L7Rule) o;
        return Objects.equals(this.adminStateUp, l7Rule.adminStateUp) &&
            Objects.equals(this.compareType, l7Rule.compareType) &&
            Objects.equals(this.key, l7Rule.key) &&
            Objects.equals(this.projectId, l7Rule.projectId) &&
            Objects.equals(this.type, l7Rule.type) &&
            Objects.equals(this.value, l7Rule.value) &&
            Objects.equals(this.provisioningStatus, l7Rule.provisioningStatus) &&
            Objects.equals(this.invert, l7Rule.invert) &&
            Objects.equals(this.id, l7Rule.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, compareType, key, projectId, type, value, provisioningStatus, invert, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class L7Rule {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    invert: ").append(toIndentedString(invert)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

