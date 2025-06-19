package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class UpdateEntityAttributeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guid")

    private String guid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_name")

    private String attrName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_value")

    private String attrValue;

    public UpdateEntityAttributeRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public UpdateEntityAttributeRequest withGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * 资产guid，获取方法请参见[数据资产guid](dataartsstudio_02_0351.xml)。
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public UpdateEntityAttributeRequest withAttrName(String attrName) {
        this.attrName = attrName;
        return this;
    }

    /**
     * 要修改的属性名称，如description、alias、comment等。
     * @return attrName
     */
    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public UpdateEntityAttributeRequest withAttrValue(String attrValue) {
        this.attrValue = attrValue;
        return this;
    }

    /**
     * 要修改的属性值。
     * @return attrValue
     */
    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEntityAttributeRequest that = (UpdateEntityAttributeRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.guid, that.guid)
            && Objects.equals(this.attrName, that.attrName) && Objects.equals(this.attrValue, that.attrValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, guid, attrName, attrValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEntityAttributeRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    attrName: ").append(toIndentedString(attrName)).append("\n");
        sb.append("    attrValue: ").append(toIndentedString(attrValue)).append("\n");
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
