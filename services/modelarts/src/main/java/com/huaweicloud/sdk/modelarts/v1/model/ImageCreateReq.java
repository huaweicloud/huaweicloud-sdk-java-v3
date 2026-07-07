package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImageCreateReq
 */
public class ImageCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_instance_id")

    private String swrInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_instance_domain")

    private String swrInstanceDomain;

    public ImageCreateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：该镜像所对应的描述信息。 **约束限制**：不涉及。 **取值范围**：长度限制512个字符。 **默认取值**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageCreateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：镜像名称。 **约束限制**：不涉及。 **取值范围**：长度限制为128个字符，支持小写字母、数字、中划线、下划线和点，字符串必须以小写字母或数字开头和结尾。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageCreateReq withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**：镜像所属组织，可以在SWR控制台“组织管理”创建和查看。 **约束限制**：不涉及。 **取值范围**：长度限制为64个字符，支持大小写字母、数字、中划线、下划线和点号，且必须是小写字母开头。 **默认取值**：不涉及。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ImageCreateReq withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释**：镜像tag。 **约束限制**：不涉及。 **取值范围**：长度限制64个字符，支持大小写字母、数字、中划线、下划线和点号。 **默认取值**：不涉及。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ImageCreateReq withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。[获取方法请参见[查询工作空间列表](ListWorkspace.xml)。](tag:hc)未创建工作空间时默认值为“0”，存在创建并使用的工作空间，以实际取值为准。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：0。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ImageCreateReq withSwrInstanceId(String swrInstanceId) {
        this.swrInstanceId = swrInstanceId;
        return this;
    }

    /**
     * **参数解释**：企业版SWR仓库ID。 **参数约束**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return swrInstanceId
     */
    public String getSwrInstanceId() {
        return swrInstanceId;
    }

    public void setSwrInstanceId(String swrInstanceId) {
        this.swrInstanceId = swrInstanceId;
    }

    public ImageCreateReq withSwrInstanceDomain(String swrInstanceDomain) {
        this.swrInstanceDomain = swrInstanceDomain;
        return this;
    }

    /**
     * **参数解释**：企业版SWR仓库域名。 **参数约束**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return swrInstanceDomain
     */
    public String getSwrInstanceDomain() {
        return swrInstanceDomain;
    }

    public void setSwrInstanceDomain(String swrInstanceDomain) {
        this.swrInstanceDomain = swrInstanceDomain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageCreateReq that = (ImageCreateReq) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.swrInstanceId, that.swrInstanceId)
            && Objects.equals(this.swrInstanceDomain, that.swrInstanceDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, namespace, tag, workspaceId, swrInstanceId, swrInstanceDomain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageCreateReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    swrInstanceId: ").append(toIndentedString(swrInstanceId)).append("\n");
        sb.append("    swrInstanceDomain: ").append(toIndentedString(swrInstanceDomain)).append("\n");
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
