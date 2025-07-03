package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 参数解释：流量镜像的配置。
 */
public class CreateTrafficMirrorConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_ids")

    private List<String> targetIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirror_request_body_enable")

    private Boolean mirrorRequestBodyEnable;

    public CreateTrafficMirrorConfig withTargetIds(List<String> targetIds) {
        this.targetIds = targetIds;
        return this;
    }

    public CreateTrafficMirrorConfig addTargetIdsItem(String targetIdsItem) {
        if (this.targetIds == null) {
            this.targetIds = new ArrayList<>();
        }
        this.targetIds.add(targetIdsItem);
        return this;
    }

    public CreateTrafficMirrorConfig withTargetIds(Consumer<List<String>> targetIdsSetter) {
        if (this.targetIds == null) {
            this.targetIds = new ArrayList<>();
        }
        targetIdsSetter.accept(this.targetIds);
        return this;
    }

    /**
     * 流量镜像的目的后端服务器组ID。
     * @return targetIds
     */
    public List<String> getTargetIds() {
        return targetIds;
    }

    public void setTargetIds(List<String> targetIds) {
        this.targetIds = targetIds;
    }

    public CreateTrafficMirrorConfig withMirrorRequestBodyEnable(Boolean mirrorRequestBodyEnable) {
        this.mirrorRequestBodyEnable = mirrorRequestBodyEnable;
        return this;
    }

    /**
     * 镜像请求是否携带请求体，默认true。
     * @return mirrorRequestBodyEnable
     */
    public Boolean getMirrorRequestBodyEnable() {
        return mirrorRequestBodyEnable;
    }

    public void setMirrorRequestBodyEnable(Boolean mirrorRequestBodyEnable) {
        this.mirrorRequestBodyEnable = mirrorRequestBodyEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrafficMirrorConfig that = (CreateTrafficMirrorConfig) obj;
        return Objects.equals(this.targetIds, that.targetIds)
            && Objects.equals(this.mirrorRequestBodyEnable, that.mirrorRequestBodyEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetIds, mirrorRequestBodyEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrafficMirrorConfig {\n");
        sb.append("    targetIds: ").append(toIndentedString(targetIds)).append("\n");
        sb.append("    mirrorRequestBodyEnable: ").append(toIndentedString(mirrorRequestBodyEnable)).append("\n");
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
