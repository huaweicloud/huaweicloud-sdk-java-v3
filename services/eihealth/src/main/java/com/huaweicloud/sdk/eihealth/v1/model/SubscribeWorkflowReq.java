package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 订阅流程请求体
 */
public class SubscribeWorkflowReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_version")

    private String assetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_workflow_name")

    private String destinationWorkflowName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_workflow_version")

    private String destinationWorkflowVersion;

    public SubscribeWorkflowReq withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产id。长度1-64，只能包含字母、数字、下划线和中划线
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public SubscribeWorkflowReq withAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
        return this;
    }

    /**
     * 资产版本。长度1-128，字母或数字开头，后面跟小写字母、数字、小数点、斜杠、下划线或中划线
     * @return assetVersion
     */
    public String getAssetVersion() {
        return assetVersion;
    }

    public void setAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
    }

    public SubscribeWorkflowReq withDestinationWorkflowName(String destinationWorkflowName) {
        this.destinationWorkflowName = destinationWorkflowName;
        return this;
    }

    /**
     * 目标流程名称。取值范围[1,56]，允许大小写字母、数字、以及特殊字符中划线(-)和下划线(_)。
     * @return destinationWorkflowName
     */
    public String getDestinationWorkflowName() {
        return destinationWorkflowName;
    }

    public void setDestinationWorkflowName(String destinationWorkflowName) {
        this.destinationWorkflowName = destinationWorkflowName;
    }

    public SubscribeWorkflowReq withDestinationWorkflowVersion(String destinationWorkflowVersion) {
        this.destinationWorkflowVersion = destinationWorkflowVersion;
        return this;
    }

    /**
     * 目标流程版本。取值范围：长度[1,24]，以小写字母或数字或大写字母开头，允许出现中划线，必须以小写字母或数字或大写字母结尾。
     * @return destinationWorkflowVersion
     */
    public String getDestinationWorkflowVersion() {
        return destinationWorkflowVersion;
    }

    public void setDestinationWorkflowVersion(String destinationWorkflowVersion) {
        this.destinationWorkflowVersion = destinationWorkflowVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeWorkflowReq that = (SubscribeWorkflowReq) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.assetVersion, that.assetVersion)
            && Objects.equals(this.destinationWorkflowName, that.destinationWorkflowName)
            && Objects.equals(this.destinationWorkflowVersion, that.destinationWorkflowVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, assetVersion, destinationWorkflowName, destinationWorkflowVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeWorkflowReq {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetVersion: ").append(toIndentedString(assetVersion)).append("\n");
        sb.append("    destinationWorkflowName: ").append(toIndentedString(destinationWorkflowName)).append("\n");
        sb.append("    destinationWorkflowVersion: ").append(toIndentedString(destinationWorkflowVersion)).append("\n");
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
