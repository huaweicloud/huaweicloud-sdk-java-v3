package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceCreate
 */
public class ResourceCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    @JacksonXmlProperty(localName = "extra_info")

    private ResourceExtraInfo extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    public ResourceCreate withExtraInfo(ResourceExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public ResourceCreate withExtraInfo(Consumer<ResourceExtraInfo> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new ResourceExtraInfo();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    /**
     * Get extraInfo
     * @return extraInfo
     */
    public ResourceExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(ResourceExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public ResourceCreate withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 待备份资源id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResourceCreate withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 待备份资源的类型, 云服务器: OS::Nova::Server, 云硬盘: OS::Cinder::Volume, 裸金属服务器: OS::Ironic::BareMetalServer, 线下本地服务器: OS::Native::Server, 弹性文件系统: OS::Sfs::Turbo
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceCreate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceCreate resourceCreate = (ResourceCreate) o;
        return Objects.equals(this.extraInfo, resourceCreate.extraInfo) && Objects.equals(this.id, resourceCreate.id)
            && Objects.equals(this.type, resourceCreate.type) && Objects.equals(this.name, resourceCreate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extraInfo, id, type, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceCreate {\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
