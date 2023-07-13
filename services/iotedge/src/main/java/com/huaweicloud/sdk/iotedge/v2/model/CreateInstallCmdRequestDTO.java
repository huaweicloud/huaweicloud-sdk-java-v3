package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 标准版节点获取安装命令请求体
 */
public class CreateInstallCmdRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_tag")

    private String hostTag;

    public CreateInstallCmdRequestDTO withHostTag(String hostTag) {
        this.hostTag = hostTag;
        return this;
    }

    /**
     * 安装命令执行的主机标签DEFAULT|MASTER|SLAVE
     * @return hostTag
     */
    public String getHostTag() {
        return hostTag;
    }

    public void setHostTag(String hostTag) {
        this.hostTag = hostTag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstallCmdRequestDTO that = (CreateInstallCmdRequestDTO) obj;
        return Objects.equals(this.hostTag, that.hostTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstallCmdRequestDTO {\n");
        sb.append("    hostTag: ").append(toIndentedString(hostTag)).append("\n");
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
