package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.AvailableTag;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 可用区信息
 */
public class AvailableZoneV2  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_code")
    

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_name")
    

    private String azName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_id")
    

    private String azId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_id")
    

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_group_id")
    

    private String azGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_type")
    

    private String azType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_tags")
    

    private AvailableTag azTags;

    public AvailableZoneV2 withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 可用区编码
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public AvailableZoneV2 withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    


    /**
     * 可用区编码
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    

    public AvailableZoneV2 withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    


    /**
     * 可用区名称
     * @return azName
     */
    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    

    public AvailableZoneV2 withAzId(String azId) {
        this.azId = azId;
        return this;
    }

    


    /**
     * 可用区id
     * @return azId
     */
    public String getAzId() {
        return azId;
    }

    public void setAzId(String azId) {
        this.azId = azId;
    }

    

    public AvailableZoneV2 withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 可用区状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public AvailableZoneV2 withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    


    /**
     * 区域id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    

    public AvailableZoneV2 withAzGroupId(String azGroupId) {
        this.azGroupId = azGroupId;
        return this;
    }

    


    /**
     * 可用区分组id
     * @return azGroupId
     */
    public String getAzGroupId() {
        return azGroupId;
    }

    public void setAzGroupId(String azGroupId) {
        this.azGroupId = azGroupId;
    }

    

    public AvailableZoneV2 withAzType(String azType) {
        this.azType = azType;
        return this;
    }

    


    /**
     * 当前AZ的类型 Core 核心 Satellite 卫星 Dedicated 专属 Virtual 虚拟 Edge 边缘 EdgeCental 中心边缘 Hybrid 混合云
     * @return azType
     */
    public String getAzType() {
        return azType;
    }

    public void setAzType(String azType) {
        this.azType = azType;
    }

    

    public AvailableZoneV2 withAzTags(AvailableTag azTags) {
        this.azTags = azTags;
        return this;
    }

    public AvailableZoneV2 withAzTags(Consumer<AvailableTag> azTagsSetter) {
        if(this.azTags == null ){
            this.azTags = new AvailableTag();
            azTagsSetter.accept(this.azTags);
        }
        
        return this;
    }


    /**
     * Get azTags
     * @return azTags
     */
    public AvailableTag getAzTags() {
        return azTags;
    }

    public void setAzTags(AvailableTag azTags) {
        this.azTags = azTags;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvailableZoneV2 availableZoneV2 = (AvailableZoneV2) o;
        return Objects.equals(this.id, availableZoneV2.id) &&
            Objects.equals(this.azCode, availableZoneV2.azCode) &&
            Objects.equals(this.azName, availableZoneV2.azName) &&
            Objects.equals(this.azId, availableZoneV2.azId) &&
            Objects.equals(this.status, availableZoneV2.status) &&
            Objects.equals(this.regionId, availableZoneV2.regionId) &&
            Objects.equals(this.azGroupId, availableZoneV2.azGroupId) &&
            Objects.equals(this.azType, availableZoneV2.azType) &&
            Objects.equals(this.azTags, availableZoneV2.azTags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, azCode, azName, azId, status, regionId, azGroupId, azType, azTags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableZoneV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
        sb.append("    azId: ").append(toIndentedString(azId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    azGroupId: ").append(toIndentedString(azGroupId)).append("\n");
        sb.append("    azType: ").append(toIndentedString(azType)).append("\n");
        sb.append("    azTags: ").append(toIndentedString(azTags)).append("\n");
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

