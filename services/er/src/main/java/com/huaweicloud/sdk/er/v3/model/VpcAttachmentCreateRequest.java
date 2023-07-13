package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VPC类型连接
 */
public class VpcAttachmentCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_create_vpc_routes")

    private Boolean autoCreateVpcRoutes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public VpcAttachmentCreateRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC的id，取值范围：最大长度36字节，带“-”连字符的UUID格式
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public VpcAttachmentCreateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * VPC连接名字，取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VpcAttachmentCreateRequest withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * VPC子网id，取值范围：最大长度36字节，带“-”连字符的UUID格式
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public VpcAttachmentCreateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息，取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VpcAttachmentCreateRequest withAutoCreateVpcRoutes(Boolean autoCreateVpcRoutes) {
        this.autoCreateVpcRoutes = autoCreateVpcRoutes;
        return this;
    }

    /**
     * 默认为false，为true表示自动为vpc配置指向企业路由器的路由
     * @return autoCreateVpcRoutes
     */
    public Boolean getAutoCreateVpcRoutes() {
        return autoCreateVpcRoutes;
    }

    public void setAutoCreateVpcRoutes(Boolean autoCreateVpcRoutes) {
        this.autoCreateVpcRoutes = autoCreateVpcRoutes;
    }

    public VpcAttachmentCreateRequest withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public VpcAttachmentCreateRequest addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public VpcAttachmentCreateRequest withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpcAttachmentCreateRequest that = (VpcAttachmentCreateRequest) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.virsubnetId, that.virsubnetId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.autoCreateVpcRoutes, that.autoCreateVpcRoutes)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, name, virsubnetId, description, autoCreateVpcRoutes, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcAttachmentCreateRequest {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    autoCreateVpcRoutes: ").append(toIndentedString(autoCreateVpcRoutes)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
