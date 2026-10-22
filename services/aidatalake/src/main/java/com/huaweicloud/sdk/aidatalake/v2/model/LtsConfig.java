package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：LTS（云日志服务）配置。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
 */
public class LtsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_group_id")

    private String ltsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_stream_id")

    private String ltsStreamId;

    public LtsConfig withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**：是否开启LTS日志。 **约束限制**：不涉及。 **取值范围**：   - true：开启。   - false：不开启。 **默认取值**：false。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public LtsConfig withLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
        return this;
    }

    /**
     * **参数解释**：LTS日志组ID，可在云日志服务LTS控制台日志管理页面的日志组列表查看。 **约束限制**：enable为true的时候需要配置。 **取值范围**：长度为1~36个字符，支持英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return ltsGroupId
     */
    public String getLtsGroupId() {
        return ltsGroupId;
    }

    public void setLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
    }

    public LtsConfig withLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
        return this;
    }

    /**
     * **参数解释**：LTS日志流ID，可在云日志服务LTS控制台日志管理页面的日志组列表展开查看对应的日志流。 **约束限制**：enable为true的时候需要配置。 **取值范围**：长度为1~36个字符，支持英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return ltsStreamId
     */
    public String getLtsStreamId() {
        return ltsStreamId;
    }

    public void setLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsConfig that = (LtsConfig) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.ltsGroupId, that.ltsGroupId)
            && Objects.equals(this.ltsStreamId, that.ltsStreamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, ltsGroupId, ltsStreamId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsConfig {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsStreamId: ").append(toIndentedString(ltsStreamId)).append("\n");
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
