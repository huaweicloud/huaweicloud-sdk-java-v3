package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新服务器请求。
 */
public class UpdateServerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintain_status")

    private Boolean maintainStatus;

    public UpdateServerReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 服务器名称，名称需满足如下规则: 1. 由中文，英文大小写，数字，_-组成。 2. 长度范围1~64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateServerReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 服务器描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateServerReq withMaintainStatus(Boolean maintainStatus) {
        this.maintainStatus = maintainStatus;
        return this;
    }

    /**
     * 服务器维护状态标识： * `true` - 添加标记 * `false` - 移除标记
     * @return maintainStatus
     */
    public Boolean getMaintainStatus() {
        return maintainStatus;
    }

    public void setMaintainStatus(Boolean maintainStatus) {
        this.maintainStatus = maintainStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateServerReq that = (UpdateServerReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.maintainStatus, that.maintainStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, maintainStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maintainStatus: ").append(toIndentedString(maintainStatus)).append("\n");
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
