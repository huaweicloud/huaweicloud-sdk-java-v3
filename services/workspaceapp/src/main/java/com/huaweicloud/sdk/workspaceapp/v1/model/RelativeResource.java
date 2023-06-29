package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 关联资源
 */
public class RelativeResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_resource_id")

    private String relativeResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_resource_name")

    private String relativeResourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_type")

    private Integer relativeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_cloud_service_type")

    private String relativeCloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_resource_type")

    private String relativeResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_params")

    private String extendParams;

    public RelativeResource withRelativeResourceId(String relativeResourceId) {
        this.relativeResourceId = relativeResourceId;
        return this;
    }

    /**
     * 关联的资源ID
     * @return relativeResourceId
     */
    public String getRelativeResourceId() {
        return relativeResourceId;
    }

    public void setRelativeResourceId(String relativeResourceId) {
        this.relativeResourceId = relativeResourceId;
    }

    public RelativeResource withRelativeResourceName(String relativeResourceName) {
        this.relativeResourceName = relativeResourceName;
        return this;
    }

    /**
     * 有资源名称的云资源，都需要返回resourceName，如果为空值，则返回“”。
     * @return relativeResourceName
     */
    public String getRelativeResourceName() {
        return relativeResourceName;
    }

    public void setRelativeResourceName(String relativeResourceName) {
        this.relativeResourceName = relativeResourceName;
    }

    public RelativeResource withRelativeType(Integer relativeType) {
        this.relativeType = relativeType;
        return this;
    }

    /**
     * * 关联关系类型，描述relativeResourceId和resourceId间的关联关系：    * 0：挂载(弱关联)，表示relativeResourceId和resourceId两者有关联关系，     * 但是两者可以独立使用、分别进行交易，且分别使用和交易都不影响整套云服务的使用；比如云主机和数据盘。 *     1：绑定(强关联)，表示relativeResourceId和resourceId是强绑定关系，      两者必须一起使用、一起进行交易，缺少其中一个会造成整套云服务不能使用；比如云主机和系统盘。           缺省值为0(挂载)。           subResources中的RelativeResource，此字段是必填；mainResources中的RelativeResource，
     * minimum: 0
     * maximum: 1
     * @return relativeType
     */
    public Integer getRelativeType() {
        return relativeType;
    }

    public void setRelativeType(Integer relativeType) {
        this.relativeType = relativeType;
    }

    public RelativeResource withRelativeCloudServiceType(String relativeCloudServiceType) {
        this.relativeCloudServiceType = relativeCloudServiceType;
        return this;
    }

    /**
     * 比如ECS云服务类型为‘hws.service.type.ec2’
     * @return relativeCloudServiceType
     */
    public String getRelativeCloudServiceType() {
        return relativeCloudServiceType;
    }

    public void setRelativeCloudServiceType(String relativeCloudServiceType) {
        this.relativeCloudServiceType = relativeCloudServiceType;
    }

    public RelativeResource withRelativeResourceType(String relativeResourceType) {
        this.relativeResourceType = relativeResourceType;
        return this;
    }

    /**
     * 比如VM的资源类型为‘hws.resource.type.vm’
     * @return relativeResourceType
     */
    public String getRelativeResourceType() {
        return relativeResourceType;
    }

    public void setRelativeResourceType(String relativeResourceType) {
        this.relativeResourceType = relativeResourceType;
    }

    public RelativeResource withExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    /**
     * 扩展信息，Key:Value格式
     * @return extendParams
     */
    public String getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(String extendParams) {
        this.extendParams = extendParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelativeResource that = (RelativeResource) obj;
        return Objects.equals(this.relativeResourceId, that.relativeResourceId)
            && Objects.equals(this.relativeResourceName, that.relativeResourceName)
            && Objects.equals(this.relativeType, that.relativeType)
            && Objects.equals(this.relativeCloudServiceType, that.relativeCloudServiceType)
            && Objects.equals(this.relativeResourceType, that.relativeResourceType)
            && Objects.equals(this.extendParams, that.extendParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relativeResourceId,
            relativeResourceName,
            relativeType,
            relativeCloudServiceType,
            relativeResourceType,
            extendParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelativeResource {\n");
        sb.append("    relativeResourceId: ").append(toIndentedString(relativeResourceId)).append("\n");
        sb.append("    relativeResourceName: ").append(toIndentedString(relativeResourceName)).append("\n");
        sb.append("    relativeType: ").append(toIndentedString(relativeType)).append("\n");
        sb.append("    relativeCloudServiceType: ").append(toIndentedString(relativeCloudServiceType)).append("\n");
        sb.append("    relativeResourceType: ").append(toIndentedString(relativeResourceType)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
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
