package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpResourceResp
 */
public class OpResourceResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private OpResourceExtraInfoResp extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public OpResourceResp withExtraInfo(OpResourceExtraInfoResp extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public OpResourceResp withExtraInfo(Consumer<OpResourceExtraInfoResp> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new OpResourceExtraInfoResp();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    /**
     * Get extraInfo
     * @return extraInfo
     */
    public OpResourceExtraInfoResp getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(OpResourceExtraInfoResp extraInfo) {
        this.extraInfo = extraInfo;
    }

    public OpResourceResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 待备份资源ID，用于标识需要备份的资源。 [获取方法请参见\"[查询存储库绑定资源信息](https://support.huaweicloud.com/api-cbr/ShowVault.html)\"，\"[查询资源可保护性](https://support.huaweicloud.com/api-cbr/ShowProtectable.html)\"。](tag:hws) [获取方法请参见\"[查询存储库绑定资源信息](https://support.huaweicloud.com/intl/zh-cn/api-cbr/ShowVault.html)\"，\"[查询资源可保护性](https://support.huaweicloud.com/intl/zh-cn/api-cbr/ShowProtectable.html)\"。](tag:hws_hk) **取值范围：** 格式为UUID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OpResourceResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 待备份资源名称，用于标识待备份的资源名称。 **取值范围：** 长度为0~255个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpResourceResp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 待备份资源的类型，用于指定待备份的资源类型，不同类型对应不同的云服务资源。 **取值范围：** [OS::Nova::Server：云服务器； OS::Cinder::Volume：云硬盘；OS::Ironic::BareMetalServer：裸金属服务器；OS::Sfs::Turbo：SFS Turbo文件系统；OS::Workspace::DesktopV2：云桌面。](tag:hws,hws_hk) [OS::Nova::Server：云服务器；OS::Cinder::Volume：云硬盘；OS::Sfs::Turbo：SFS Turbo文件系统。](tag:hk_g42,sbc,dt) [OS::Nova::Server：云服务器；OS::Cinder::Volume：云硬盘；OS::Ironic::BareMetalServer：裸金属服务器；OS::Sfs::Turbo：SFS Turbo文件系统。](tag:fcs_vm,ctc,ocb,tm) [OS::Nova::Server：云服务器；OS::Cinder::Volume：云硬盘。](tag:tlf,cmcc,hcso_dt) [OS::Nova::Server：云服务器；OS::Cinder::Volume：云硬盘；OS::Sfs::Turbo：SFS Turbo文件系统；OS::Workspace::DesktopV2：云桌面。](tag:g42)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpResourceResp that = (OpResourceResp) obj;
        return Objects.equals(this.extraInfo, that.extraInfo) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extraInfo, id, name, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpResourceResp {\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
