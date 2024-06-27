package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowTemplateVersionContentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Client-Request-Id")

    private String clientRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control_source_vpc_ids")

    private List<String> accessControlSourceVpcIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control_source_ips")

    private List<String> accessControlSourceIps = null;

    public ShowTemplateVersionContentRequest withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * 用户指定的，对于此请求的唯一ID，用于定位某个请求，推荐使用UUID
     * @return clientRequestId
     */
    public String getClientRequestId() {
        return clientRequestId;
    }

    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    public ShowTemplateVersionContentRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 用户希望创建的模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public ShowTemplateVersionContentRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 模板版本ID，以大写V开头，每次创建模板版本，模板版本ID数字部分会自增加一
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public ShowTemplateVersionContentRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板的ID。当template_id存在时，模板服务会检查template_id是否和template_name匹配，不匹配会返回400
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public ShowTemplateVersionContentRequest withAccessControlSourceVpcIds(List<String> accessControlSourceVpcIds) {
        this.accessControlSourceVpcIds = accessControlSourceVpcIds;
        return this;
    }

    public ShowTemplateVersionContentRequest addAccessControlSourceVpcIdsItem(String accessControlSourceVpcIdsItem) {
        if (this.accessControlSourceVpcIds == null) {
            this.accessControlSourceVpcIds = new ArrayList<>();
        }
        this.accessControlSourceVpcIds.add(accessControlSourceVpcIdsItem);
        return this;
    }

    public ShowTemplateVersionContentRequest withAccessControlSourceVpcIds(
        Consumer<List<String>> accessControlSourceVpcIdsSetter) {
        if (this.accessControlSourceVpcIds == null) {
            this.accessControlSourceVpcIds = new ArrayList<>();
        }
        accessControlSourceVpcIdsSetter.accept(this.accessControlSourceVpcIds);
        return this;
    }

    /**
     * 允许访问资源栈模板的source vpc id列表， source vpc id应仅包含小写字母、数字或中划线。
     * @return accessControlSourceVpcIds
     */
    public List<String> getAccessControlSourceVpcIds() {
        return accessControlSourceVpcIds;
    }

    public void setAccessControlSourceVpcIds(List<String> accessControlSourceVpcIds) {
        this.accessControlSourceVpcIds = accessControlSourceVpcIds;
    }

    public ShowTemplateVersionContentRequest withAccessControlSourceIps(List<String> accessControlSourceIps) {
        this.accessControlSourceIps = accessControlSourceIps;
        return this;
    }

    public ShowTemplateVersionContentRequest addAccessControlSourceIpsItem(String accessControlSourceIpsItem) {
        if (this.accessControlSourceIps == null) {
            this.accessControlSourceIps = new ArrayList<>();
        }
        this.accessControlSourceIps.add(accessControlSourceIpsItem);
        return this;
    }

    public ShowTemplateVersionContentRequest withAccessControlSourceIps(
        Consumer<List<String>> accessControlSourceIpsSetter) {
        if (this.accessControlSourceIps == null) {
            this.accessControlSourceIps = new ArrayList<>();
        }
        accessControlSourceIpsSetter.accept(this.accessControlSourceIps);
        return this;
    }

    /**
     * 允许访问资源栈模板的source ip列表，source ip应是具有CIDR表示法且带有子网掩码的IPv4地址。
     * @return accessControlSourceIps
     */
    public List<String> getAccessControlSourceIps() {
        return accessControlSourceIps;
    }

    public void setAccessControlSourceIps(List<String> accessControlSourceIps) {
        this.accessControlSourceIps = accessControlSourceIps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTemplateVersionContentRequest that = (ShowTemplateVersionContentRequest) obj;
        return Objects.equals(this.clientRequestId, that.clientRequestId)
            && Objects.equals(this.templateName, that.templateName) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.accessControlSourceVpcIds, that.accessControlSourceVpcIds)
            && Objects.equals(this.accessControlSourceIps, that.accessControlSourceIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientRequestId,
            templateName,
            versionId,
            templateId,
            accessControlSourceVpcIds,
            accessControlSourceIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTemplateVersionContentRequest {\n");
        sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    accessControlSourceVpcIds: ").append(toIndentedString(accessControlSourceVpcIds)).append("\n");
        sb.append("    accessControlSourceIps: ").append(toIndentedString(accessControlSourceIps)).append("\n");
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
