package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 地址组名称
 */
public class UpdateIpGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips")

    private String ips;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_remarks")

    private Map<String, String> ipRemarks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdateIpGroupRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 地址组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateIpGroupRequestBody withIps(String ips) {
        this.ips = ips;
        return this;
    }

    /**
     * **参数解释：** 以逗号分隔的ip或ip段 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ips
     */
    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public UpdateIpGroupRequestBody withIpRemarks(Map<String, String> ipRemarks) {
        this.ipRemarks = ipRemarks;
        return this;
    }

    public UpdateIpGroupRequestBody putIpRemarksItem(String key, String ipRemarksItem) {
        if (this.ipRemarks == null) {
            this.ipRemarks = new HashMap<>();
        }
        this.ipRemarks.put(key, ipRemarksItem);
        return this;
    }

    public UpdateIpGroupRequestBody withIpRemarks(Consumer<Map<String, String>> ipRemarksSetter) {
        if (this.ipRemarks == null) {
            this.ipRemarks = new HashMap<>();
        }
        ipRemarksSetter.accept(this.ipRemarks);
        return this;
    }

    /**
     * **参数解释：** ip或ip段的备注 **约束限制：** key必须是ips中包含的单个ip或ip段 **取值范围：** value必须匹配正则：[^<>]{0,64} **默认取值：** 不涉及
     * @return ipRemarks
     */
    public Map<String, String> getIpRemarks() {
        return ipRemarks;
    }

    public void setIpRemarks(Map<String, String> ipRemarks) {
        this.ipRemarks = ipRemarks;
    }

    public UpdateIpGroupRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 地址组描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIpGroupRequestBody that = (UpdateIpGroupRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.ips, that.ips)
            && Objects.equals(this.ipRemarks, that.ipRemarks) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ips, ipRemarks, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpGroupRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
        sb.append("    ipRemarks: ").append(toIndentedString(ipRemarks)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
