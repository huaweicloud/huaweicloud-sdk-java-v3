package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BuildMasterDrRelation
 */
public class BuildMasterDrRelation  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_instance_id")
    
    private String targetInstanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_project_id")
    
    private String targetProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_region")
    
    private String targetRegion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_ip")
    
    private String targetIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_subnet")
    
    private String targetSubnet;

    public BuildMasterDrRelation withTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    


    /**
     * 灾备实例的实例ID。
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public void setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
    }

    

    public BuildMasterDrRelation withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    


    /**
     * 灾备实例所在租户的项目 ID。
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    

    public BuildMasterDrRelation withTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
        return this;
    }

    


    /**
     * 灾备实例所在的区域 ID。
     * @return targetRegion
     */
    public String getTargetRegion() {
        return targetRegion;
    }

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    

    public BuildMasterDrRelation withTargetIp(String targetIp) {
        this.targetIp = targetIp;
        return this;
    }

    


    /**
     * 灾备实例的数据虚拟IP（数据VIP）。
     * @return targetIp
     */
    public String getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
    }

    

    public BuildMasterDrRelation withTargetSubnet(String targetSubnet) {
        this.targetSubnet = targetSubnet;
        return this;
    }

    


    /**
     * 灾备实例的子网地址。
     * @return targetSubnet
     */
    public String getTargetSubnet() {
        return targetSubnet;
    }

    public void setTargetSubnet(String targetSubnet) {
        this.targetSubnet = targetSubnet;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BuildMasterDrRelation buildMasterDrRelation = (BuildMasterDrRelation) o;
        return Objects.equals(this.targetInstanceId, buildMasterDrRelation.targetInstanceId) &&
            Objects.equals(this.targetProjectId, buildMasterDrRelation.targetProjectId) &&
            Objects.equals(this.targetRegion, buildMasterDrRelation.targetRegion) &&
            Objects.equals(this.targetIp, buildMasterDrRelation.targetIp) &&
            Objects.equals(this.targetSubnet, buildMasterDrRelation.targetSubnet);
    }
    @Override
    public int hashCode() {
        return Objects.hash(targetInstanceId, targetProjectId, targetRegion, targetIp, targetSubnet);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildMasterDrRelation {\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
        sb.append("    targetRegion: ").append(toIndentedString(targetRegion)).append("\n");
        sb.append("    targetIp: ").append(toIndentedString(targetIp)).append("\n");
        sb.append("    targetSubnet: ").append(toIndentedString(targetSubnet)).append("\n");
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

