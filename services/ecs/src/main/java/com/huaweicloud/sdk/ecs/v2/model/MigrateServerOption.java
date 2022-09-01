package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 冷迁移云服务器请求结构
 */
public class MigrateServerOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_host_id")

    @JacksonXmlProperty(localName = "dedicated_host_id")

    private String dedicatedHostId;

    public MigrateServerOption withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    /**
     * 专属主机ID。 当弹性云服务器从公共资源池迁移至专属主机上，或者弹性云服务器在专属主机之间迁移时，该字段生效。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrateServerOption migrateServerOption = (MigrateServerOption) o;
        return Objects.equals(this.dedicatedHostId, migrateServerOption.dedicatedHostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedHostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateServerOption {\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
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
