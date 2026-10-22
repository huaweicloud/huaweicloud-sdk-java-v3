package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAiAppRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_policy")

    private Boolean keepPolicy;

    public DeleteAiAppRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * **参数解释：** AI应用ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public DeleteAiAppRequest withKeepPolicy(Boolean keepPolicy) {
        this.keepPolicy = keepPolicy;
        return this;
    }

    /**
     * **参数解释：** 是否保留关联的策略 **约束限制：** 不涉及 **取值范围：** true, false **默认取值：** 不涉及
     * @return keepPolicy
     */
    public Boolean getKeepPolicy() {
        return keepPolicy;
    }

    public void setKeepPolicy(Boolean keepPolicy) {
        this.keepPolicy = keepPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAiAppRequest that = (DeleteAiAppRequest) obj;
        return Objects.equals(this.appId, that.appId) && Objects.equals(this.keepPolicy, that.keepPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, keepPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAiAppRequest {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    keepPolicy: ").append(toIndentedString(keepPolicy)).append("\n");
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
