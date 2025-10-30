package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class BackupReplicateReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_vault_id")

    private String destinationVaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_acceleration")

    private Boolean enableAcceleration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cross_account_urn")

    private String crossAccountUrn;

    public BackupReplicateReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 复制的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BackupReplicateReqBody withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    /**
     * 复制的目标项目ID
     * @return destinationProjectId
     */
    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public BackupReplicateReqBody withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * 复制的目标区域
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public BackupReplicateReqBody withDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
        return this;
    }

    /**
     * 复制的目标区域的存储库ID
     * @return destinationVaultId
     */
    public String getDestinationVaultId() {
        return destinationVaultId;
    }

    public void setDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
    }

    public BackupReplicateReqBody withEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
        return this;
    }

    /**
     * 跨区域复制时，是否启用加速从而缩短复制的时间，如果不指定，默认不启用加速。
     * @return enableAcceleration
     */
    public Boolean getEnableAcceleration() {
        return enableAcceleration;
    }

    public void setEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
    }

    public BackupReplicateReqBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 复制名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackupReplicateReqBody withCrossAccountUrn(String crossAccountUrn) {
        this.crossAccountUrn = crossAccountUrn;
        return this;
    }

    /**
     * 跨账户复制所需的目标账户的跨账户复制存储库标识
     * @return crossAccountUrn
     */
    public String getCrossAccountUrn() {
        return crossAccountUrn;
    }

    public void setCrossAccountUrn(String crossAccountUrn) {
        this.crossAccountUrn = crossAccountUrn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupReplicateReqBody that = (BackupReplicateReqBody) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.destinationProjectId, that.destinationProjectId)
            && Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.destinationVaultId, that.destinationVaultId)
            && Objects.equals(this.enableAcceleration, that.enableAcceleration) && Objects.equals(this.name, that.name)
            && Objects.equals(this.crossAccountUrn, that.crossAccountUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            destinationProjectId,
            destinationRegion,
            destinationVaultId,
            enableAcceleration,
            name,
            crossAccountUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupReplicateReqBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationVaultId: ").append(toIndentedString(destinationVaultId)).append("\n");
        sb.append("    enableAcceleration: ").append(toIndentedString(enableAcceleration)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    crossAccountUrn: ").append(toIndentedString(crossAccountUrn)).append("\n");
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
