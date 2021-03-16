package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 详细信息结构体
 */
public class DetailsBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="old_capacity")
    
    private String oldCapacity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_capacity")
    
    private String newCapacity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_public_ip")
    
    private Boolean enablePublicIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip_id")
    
    private String publicIpId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip_address")
    
    private String publicIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_ssl")
    
    private Boolean enableSsl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="old_cache_mode")
    
    private String oldCacheMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_cache_mode")
    
    private String newCacheMode;

    public DetailsBody withOldCapacity(String oldCapacity) {
        this.oldCapacity = oldCapacity;
        return this;
    }

    


    /**
     * 变更前的容量，仅在变更规格时有值
     * @return oldCapacity
     */
    public String getOldCapacity() {
        return oldCapacity;
    }

    public void setOldCapacity(String oldCapacity) {
        this.oldCapacity = oldCapacity;
    }

    

    public DetailsBody withNewCapacity(String newCapacity) {
        this.newCapacity = newCapacity;
        return this;
    }

    


    /**
     * 变更后的容量，仅在变更规格时有值
     * @return newCapacity
     */
    public String getNewCapacity() {
        return newCapacity;
    }

    public void setNewCapacity(String newCapacity) {
        this.newCapacity = newCapacity;
    }

    

    public DetailsBody withEnablePublicIp(Boolean enablePublicIp) {
        this.enablePublicIp = enablePublicIp;
        return this;
    }

    


    /**
     * 是否开启公网访问，仅在开启公网访问时有值
     * @return enablePublicIp
     */
    public Boolean getEnablePublicIp() {
        return enablePublicIp;
    }

    public void setEnablePublicIp(Boolean enablePublicIp) {
        this.enablePublicIp = enablePublicIp;
    }

    

    public DetailsBody withPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
        return this;
    }

    


    /**
     * 公网IP的ID，仅在开启公网访问时有值
     * @return publicIpId
     */
    public String getPublicIpId() {
        return publicIpId;
    }

    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    

    public DetailsBody withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    


    /**
     * 公网IP地址，仅在开启公网访问时有值
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    

    public DetailsBody withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    


    /**
     * 是否开启ssl，仅在开启ssl时有值
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    

    public DetailsBody withOldCacheMode(String oldCacheMode) {
        this.oldCacheMode = oldCacheMode;
        return this;
    }

    


    /**
     * 变更前的缓存类型，仅在变更规格时有值
     * @return oldCacheMode
     */
    public String getOldCacheMode() {
        return oldCacheMode;
    }

    public void setOldCacheMode(String oldCacheMode) {
        this.oldCacheMode = oldCacheMode;
    }

    

    public DetailsBody withNewCacheMode(String newCacheMode) {
        this.newCacheMode = newCacheMode;
        return this;
    }

    


    /**
     * 变更后的缓存类型，仅在变更规格时有值
     * @return newCacheMode
     */
    public String getNewCacheMode() {
        return newCacheMode;
    }

    public void setNewCacheMode(String newCacheMode) {
        this.newCacheMode = newCacheMode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetailsBody detailsBody = (DetailsBody) o;
        return Objects.equals(this.oldCapacity, detailsBody.oldCapacity) &&
            Objects.equals(this.newCapacity, detailsBody.newCapacity) &&
            Objects.equals(this.enablePublicIp, detailsBody.enablePublicIp) &&
            Objects.equals(this.publicIpId, detailsBody.publicIpId) &&
            Objects.equals(this.publicIpAddress, detailsBody.publicIpAddress) &&
            Objects.equals(this.enableSsl, detailsBody.enableSsl) &&
            Objects.equals(this.oldCacheMode, detailsBody.oldCacheMode) &&
            Objects.equals(this.newCacheMode, detailsBody.newCacheMode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(oldCapacity, newCapacity, enablePublicIp, publicIpId, publicIpAddress, enableSsl, oldCacheMode, newCacheMode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetailsBody {\n");
        sb.append("    oldCapacity: ").append(toIndentedString(oldCapacity)).append("\n");
        sb.append("    newCapacity: ").append(toIndentedString(newCapacity)).append("\n");
        sb.append("    enablePublicIp: ").append(toIndentedString(enablePublicIp)).append("\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
        sb.append("    oldCacheMode: ").append(toIndentedString(oldCacheMode)).append("\n");
        sb.append("    newCacheMode: ").append(toIndentedString(newCacheMode)).append("\n");
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

